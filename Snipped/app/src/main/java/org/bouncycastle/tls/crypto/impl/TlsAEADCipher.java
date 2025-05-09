package org.bouncycastle.tls.crypto.impl;

import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsCipher;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;

/* loaded from: classes3.dex */
public class TlsAEADCipher implements TlsCipher {
    public static final int NONCE_RFC5288 = 1;
    public static final int NONCE_RFC7905 = 2;
    protected final TlsCryptoParameters cryptoParams;
    protected final TlsAEADCipherImpl decryptCipher;
    protected final byte[] decryptImplicitNonce;
    protected final TlsAEADCipherImpl encryptCipher;
    protected final byte[] encryptImplicitNonce;
    protected final int macSize;
    protected final int nonceMode;
    protected final int record_iv_length;

    public TlsAEADCipher(TlsCryptoParameters tlsCryptoParameters, TlsAEADCipherImpl tlsAEADCipherImpl, TlsAEADCipherImpl tlsAEADCipherImpl2, int i, int i9) {
        this(tlsCryptoParameters, tlsAEADCipherImpl, tlsAEADCipherImpl2, i, i9, 1);
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public byte[] decodeCiphertext(long j10, short s10, byte[] bArr, int i, int i9) {
        if (getPlaintextLimit(i9) < 0) {
            throw new TlsFatalAlert((short) 50);
        }
        byte[] bArr2 = this.decryptImplicitNonce;
        int length = bArr2.length + this.record_iv_length;
        byte[] bArr3 = new byte[length];
        int i10 = this.nonceMode;
        int i11 = 0;
        if (i10 == 1) {
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            int i12 = this.record_iv_length;
            System.arraycopy(bArr, i, bArr3, length - i12, i12);
        } else {
            if (i10 != 2) {
                throw new TlsFatalAlert((short) 80);
            }
            TlsUtils.writeUint64(j10, bArr3, length - 8);
            while (true) {
                byte[] bArr4 = this.decryptImplicitNonce;
                if (i11 >= bArr4.length) {
                    break;
                }
                bArr3[i11] = (byte) (bArr4[i11] ^ bArr3[i11]);
                i11++;
            }
        }
        int i13 = this.record_iv_length;
        int i14 = i + i13;
        int i15 = i9 - i13;
        int outputSize = this.decryptCipher.getOutputSize(i15);
        byte[] bArr5 = new byte[outputSize];
        try {
            this.decryptCipher.init(bArr3, this.macSize, getAdditionalData(j10, s10, outputSize));
            if (this.decryptCipher.doFinal(bArr, i14, i15, bArr5, 0) == outputSize) {
                return bArr5;
            }
            throw new TlsFatalAlert((short) 80);
        } catch (Exception e10) {
            throw new TlsFatalAlert((short) 20, e10);
        }
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public byte[] encodePlaintext(long j10, short s10, byte[] bArr, int i, int i9) {
        byte[] bArr2 = this.encryptImplicitNonce;
        int length = bArr2.length + this.record_iv_length;
        byte[] bArr3 = new byte[length];
        int i10 = this.nonceMode;
        if (i10 == 1) {
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            TlsUtils.writeUint64(j10, bArr3, this.encryptImplicitNonce.length);
        } else {
            if (i10 != 2) {
                throw new TlsFatalAlert((short) 80);
            }
            TlsUtils.writeUint64(j10, bArr3, length - 8);
            int i11 = 0;
            while (true) {
                byte[] bArr4 = this.encryptImplicitNonce;
                if (i11 >= bArr4.length) {
                    break;
                }
                bArr3[i11] = (byte) (bArr4[i11] ^ bArr3[i11]);
                i11++;
            }
        }
        int outputSize = this.encryptCipher.getOutputSize(i9);
        int i12 = this.record_iv_length;
        int i13 = i12 + outputSize;
        byte[] bArr5 = new byte[i13];
        if (i12 != 0) {
            System.arraycopy(bArr3, length - i12, bArr5, 0, i12);
        }
        int i14 = this.record_iv_length;
        try {
            this.encryptCipher.init(bArr3, this.macSize, getAdditionalData(j10, s10, i9));
            if (i14 + this.encryptCipher.doFinal(bArr, i, i9, bArr5, i14) == i13) {
                return bArr5;
            }
            throw new TlsFatalAlert((short) 80);
        } catch (Exception e10) {
            throw new TlsFatalAlert((short) 80, e10);
        }
    }

    public byte[] getAdditionalData(long j10, short s10, int i) {
        byte[] bArr = new byte[13];
        TlsUtils.writeUint64(j10, bArr, 0);
        TlsUtils.writeUint8(s10, bArr, 8);
        TlsUtils.writeVersion(this.cryptoParams.getServerVersion(), bArr, 9);
        TlsUtils.writeUint16(i, bArr, 11);
        return bArr;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public int getCiphertextLimit(int i) {
        return i + this.macSize + this.record_iv_length;
    }

    @Override // org.bouncycastle.tls.crypto.TlsCipher
    public int getPlaintextLimit(int i) {
        return (i - this.macSize) - this.record_iv_length;
    }

    public TlsAEADCipher(TlsCryptoParameters tlsCryptoParameters, TlsAEADCipherImpl tlsAEADCipherImpl, TlsAEADCipherImpl tlsAEADCipherImpl2, int i, int i9, int i10) {
        int i11;
        TlsAEADCipherImpl tlsAEADCipherImpl3;
        TlsAEADCipherImpl tlsAEADCipherImpl4;
        if (!TlsImplUtils.isTLSv12(tlsCryptoParameters)) {
            throw new TlsFatalAlert((short) 80);
        }
        this.nonceMode = i10;
        if (i10 == 1) {
            this.record_iv_length = 8;
            i11 = 4;
        } else {
            if (i10 != 2) {
                throw new TlsFatalAlert((short) 80);
            }
            this.record_iv_length = 0;
            i11 = 12;
        }
        this.cryptoParams = tlsCryptoParameters;
        this.macSize = i9;
        this.encryptCipher = tlsAEADCipherImpl;
        this.decryptCipher = tlsAEADCipherImpl2;
        if (tlsCryptoParameters.isServer()) {
            tlsAEADCipherImpl4 = tlsAEADCipherImpl;
            tlsAEADCipherImpl3 = tlsAEADCipherImpl2;
        } else {
            tlsAEADCipherImpl3 = tlsAEADCipherImpl;
            tlsAEADCipherImpl4 = tlsAEADCipherImpl2;
        }
        int i12 = (i11 * 2) + (i * 2);
        byte[] calculateKeyBlock = TlsImplUtils.calculateKeyBlock(tlsCryptoParameters, i12);
        tlsAEADCipherImpl3.setKey(calculateKeyBlock, 0, i);
        tlsAEADCipherImpl4.setKey(calculateKeyBlock, i, i);
        int i13 = i + i;
        int i14 = i13 + i11;
        byte[] copyOfRangeExact = TlsUtils.copyOfRangeExact(calculateKeyBlock, i13, i14);
        int i15 = i14 + i11;
        byte[] copyOfRangeExact2 = TlsUtils.copyOfRangeExact(calculateKeyBlock, i14, i15);
        if (i15 != i12) {
            throw new TlsFatalAlert((short) 80);
        }
        if (tlsCryptoParameters.isServer()) {
            this.encryptImplicitNonce = copyOfRangeExact2;
            this.decryptImplicitNonce = copyOfRangeExact;
        } else {
            this.encryptImplicitNonce = copyOfRangeExact;
            this.decryptImplicitNonce = copyOfRangeExact2;
        }
        byte[] bArr = new byte[i11 + this.record_iv_length];
        tlsAEADCipherImpl.init(bArr, i9, null);
        tlsAEADCipherImpl2.init(bArr, i9, null);
    }
}
