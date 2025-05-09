package org.bouncycastle.tls.crypto.impl;

import java.security.SecureRandom;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class TlsBlockCipher implements TlsCipher {
    protected final TlsCrypto crypto;
    protected final TlsCryptoParameters cryptoParams;
    protected final TlsBlockCipherImpl decryptCipher;
    protected final TlsBlockCipherImpl encryptCipher;
    protected final boolean encryptThenMAC;
    protected final byte[] randomData;
    protected final TlsSuiteMac readMac;
    protected final boolean useExplicitIV;
    protected final boolean useExtraPadding;
    protected final TlsSuiteMac writeMac;

    public TlsBlockCipher(TlsCrypto tlsCrypto, TlsCryptoParameters tlsCryptoParameters, TlsBlockCipherImpl tlsBlockCipherImpl, TlsBlockCipherImpl tlsBlockCipherImpl2, TlsHMAC tlsHMAC, TlsHMAC tlsHMAC2, int i) {
        TlsSuiteHMac tlsSuiteHMac;
        this.cryptoParams = tlsCryptoParameters;
        this.crypto = tlsCrypto;
        this.randomData = tlsCryptoParameters.getNonceGenerator().generateNonce(256);
        SecurityParameters securityParametersHandshake = tlsCryptoParameters.getSecurityParametersHandshake();
        boolean isEncryptThenMAC = securityParametersHandshake.isEncryptThenMAC();
        this.encryptThenMAC = isEncryptThenMAC;
        boolean isTLSv11 = TlsImplUtils.isTLSv11(tlsCryptoParameters);
        this.useExplicitIV = isTLSv11;
        this.useExtraPadding = securityParametersHandshake.isExtendedPadding() && !tlsCryptoParameters.getServerVersion().isDTLS() && (isEncryptThenMAC || !securityParametersHandshake.isTruncatedHMac());
        this.encryptCipher = tlsBlockCipherImpl;
        this.decryptCipher = tlsBlockCipherImpl2;
        if (tlsCryptoParameters.isServer()) {
            tlsBlockCipherImpl2 = tlsBlockCipherImpl;
            tlsBlockCipherImpl = tlsBlockCipherImpl2;
        }
        int macLength = tlsHMAC2.getMacLength() + tlsHMAC.getMacLength() + (i * 2);
        macLength = isTLSv11 ? macLength : macLength + tlsBlockCipherImpl2.getBlockSize() + tlsBlockCipherImpl.getBlockSize();
        byte[] calculateKeyBlock = TlsImplUtils.calculateKeyBlock(tlsCryptoParameters, macLength);
        tlsHMAC.setKey(calculateKeyBlock, 0, tlsHMAC.getMacLength());
        int macLength2 = tlsHMAC.getMacLength();
        tlsHMAC2.setKey(calculateKeyBlock, macLength2, tlsHMAC2.getMacLength());
        int macLength3 = tlsHMAC2.getMacLength() + macLength2;
        tlsBlockCipherImpl.setKey(calculateKeyBlock, macLength3, i);
        int i9 = macLength3 + i;
        tlsBlockCipherImpl2.setKey(calculateKeyBlock, i9, i);
        int i10 = i9 + i;
        if (!isTLSv11) {
            tlsBlockCipherImpl.init(calculateKeyBlock, i10, tlsBlockCipherImpl.getBlockSize());
            int blockSize = tlsBlockCipherImpl.getBlockSize() + i10;
            tlsBlockCipherImpl2.init(calculateKeyBlock, blockSize, tlsBlockCipherImpl2.getBlockSize());
            i10 = tlsBlockCipherImpl2.getBlockSize() + blockSize;
        }
        if (i10 != macLength) {
            throw new TlsFatalAlert((short) 80);
        }
        if (tlsCryptoParameters.isServer()) {
            this.writeMac = new TlsSuiteHMac(tlsCryptoParameters, tlsHMAC2);
            tlsSuiteHMac = new TlsSuiteHMac(tlsCryptoParameters, tlsHMAC);
        } else {
            this.writeMac = new TlsSuiteHMac(tlsCryptoParameters, tlsHMAC);
            tlsSuiteHMac = new TlsSuiteHMac(tlsCryptoParameters, tlsHMAC2);
        }
        this.readMac = tlsSuiteHMac;
    }

    public int checkPaddingConstantTime(byte[] bArr, int i, int i9, int i10, int i11) {
        byte b9;
        int i12;
        int i13 = i + i9;
        byte b10 = bArr[i13 - 1];
        int i14 = (b10 & 255) + 1;
        if (i11 + i14 > i9) {
            i12 = 0;
            b9 = 0;
            i14 = 0;
        } else {
            int i15 = i13 - i14;
            b9 = 0;
            while (true) {
                int i16 = i15 + 1;
                b9 = (byte) ((bArr[i15] ^ b10) | b9);
                if (i16 >= i13) {
                    break;
                }
                i15 = i16;
            }
            i12 = i14;
            if (b9 != 0) {
                i14 = 0;
            }
        }
        byte[] bArr2 = this.randomData;
        while (i12 < 256) {
            b9 = (byte) ((bArr2[i12] ^ b10) | b9);
            i12++;
        }
        bArr2[0] = (byte) (bArr2[0] ^ b9);
        return i14;
    }

    public int chooseExtraPadBlocks(SecureRandom secureRandom, int i) {
        return Math.min(lowestBitSet(secureRandom.nextInt()), i);
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public byte[] decodeCiphertext(long j10, short s10, byte[] bArr, int i, int i9) {
        int i10;
        byte[] bArr2;
        int i11 = i;
        int blockSize = this.decryptCipher.getBlockSize();
        int size = this.readMac.getSize();
        int max = this.encryptThenMAC ? blockSize + size : Math.max(blockSize, size + 1);
        if (this.useExplicitIV) {
            max += blockSize;
        }
        if (i9 < max) {
            throw new TlsFatalAlert((short) 50);
        }
        boolean z10 = this.encryptThenMAC;
        int i12 = z10 ? i9 - size : i9;
        if (i12 % blockSize != 0) {
            throw new TlsFatalAlert((short) 21);
        }
        if (z10) {
            int i13 = i11 + i9;
            if (!Arrays.constantTimeAreEqual(this.readMac.calculateMac(j10, s10, bArr, i, i9 - size), TlsUtils.copyOfRangeExact(bArr, i13 - size, i13))) {
                throw new TlsFatalAlert((short) 20);
            }
        }
        if (this.useExplicitIV) {
            this.decryptCipher.init(bArr, i11, blockSize);
            i11 += blockSize;
            i12 -= blockSize;
        }
        int i14 = i11;
        int i15 = i12;
        this.decryptCipher.doFinal(bArr, i14, i15, bArr, i14);
        int checkPaddingConstantTime = checkPaddingConstantTime(bArr, i14, i15, blockSize, this.encryptThenMAC ? 0 : size);
        boolean z11 = checkPaddingConstantTime == 0;
        int i16 = i15 - checkPaddingConstantTime;
        if (this.encryptThenMAC) {
            i10 = i14;
            bArr2 = bArr;
        } else {
            i16 -= size;
            int i17 = i14 + i16;
            i10 = i14;
            bArr2 = bArr;
            z11 |= !Arrays.constantTimeAreEqual(this.readMac.calculateMacConstantTime(j10, s10, bArr, i14, i16, i15 - size, this.randomData), TlsUtils.copyOfRangeExact(bArr, i17, i17 + size));
        }
        if (z11) {
            throw new TlsFatalAlert((short) 20);
        }
        return TlsUtils.copyOfRangeExact(bArr2, i10, i10 + i16);
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public byte[] encodePlaintext(long j10, short s10, byte[] bArr, int i, int i9) {
        byte[] bArr2;
        int i10;
        int i11;
        int blockSize = this.encryptCipher.getBlockSize();
        int size = this.writeMac.getSize();
        int i12 = blockSize - ((!this.encryptThenMAC ? i9 + size : i9) % blockSize);
        if (this.useExtraPadding) {
            i12 += chooseExtraPadBlocks(this.crypto.getSecureRandom(), (256 - i12) / blockSize) * blockSize;
        }
        int i13 = i12;
        int i14 = size + i9 + i13;
        boolean z10 = this.useExplicitIV;
        if (z10) {
            i14 += blockSize;
        }
        byte[] bArr3 = new byte[i14];
        if (z10) {
            byte[] generateNonce = this.cryptoParams.getNonceGenerator().generateNonce(blockSize);
            this.encryptCipher.init(generateNonce, 0, blockSize);
            System.arraycopy(generateNonce, 0, bArr3, 0, blockSize);
            bArr2 = bArr;
            i10 = i;
            i11 = blockSize;
        } else {
            bArr2 = bArr;
            i10 = i;
            i11 = 0;
        }
        System.arraycopy(bArr2, i10, bArr3, i11, i9);
        int i15 = i11 + i9;
        if (!this.encryptThenMAC) {
            byte[] calculateMac = this.writeMac.calculateMac(j10, s10, bArr, i, i9);
            System.arraycopy(calculateMac, 0, bArr3, i15, calculateMac.length);
            i15 += calculateMac.length;
        }
        byte b9 = (byte) (i13 - 1);
        int i16 = i15;
        int i17 = 0;
        while (i17 < i13) {
            bArr3[i16] = b9;
            i17++;
            i16++;
        }
        this.encryptCipher.doFinal(bArr3, i11, i16 - i11, bArr3, i11);
        if (!this.encryptThenMAC) {
            return bArr3;
        }
        byte[] calculateMac2 = this.writeMac.calculateMac(j10, s10, bArr3, 0, i16);
        System.arraycopy(calculateMac2, 0, bArr3, i16, calculateMac2.length);
        return bArr3;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public int getCiphertextLimit(int i) {
        int blockSize = this.encryptCipher.getBlockSize();
        int size = this.writeMac.getSize();
        if (this.useExplicitIV) {
            i += blockSize;
        }
        int i9 = i + (this.useExtraPadding ? 256 : blockSize);
        if (this.encryptThenMAC) {
            return (i9 - (i9 % blockSize)) + size;
        }
        int i10 = i9 + size;
        return i10 - (i10 % blockSize);
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public int getPlaintextLimit(int i) {
        int i9;
        int blockSize = this.encryptCipher.getBlockSize();
        int size = this.writeMac.getSize();
        if (this.encryptThenMAC) {
            i9 = i - size;
            size = i9 % blockSize;
        } else {
            i9 = i - (i % blockSize);
        }
        int i10 = (i9 - size) - 1;
        return this.useExplicitIV ? i10 - blockSize : i10;
    }

    public int lowestBitSet(int i) {
        if (i == 0) {
            return 32;
        }
        int i9 = 0;
        while ((i & 1) == 0) {
            i9++;
            i >>= 1;
        }
        return i9;
    }
}
