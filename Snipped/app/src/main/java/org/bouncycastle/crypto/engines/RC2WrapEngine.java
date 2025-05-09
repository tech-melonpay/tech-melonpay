package org.bouncycastle.crypto.engines;

import java.security.SecureRandom;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class RC2WrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, -35, -94, ISO7816.INS_UNBLOCK_CHV, 121, -24, 33, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;
    private byte[] iv;
    private CipherParameters param;
    private ParametersWithIV paramPlusIV;
    private SecureRandom sr;
    Digest sha1 = DigestFactory.createSHA1();
    byte[] digest = new byte[20];

    private byte[] calculateCMSKeyChecksum(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.sha1.update(bArr, 0, bArr.length);
        this.sha1.doFinal(this.digest, 0);
        System.arraycopy(this.digest, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean checkCMSKeyChecksum(byte[] bArr, byte[] bArr2) {
        return Arrays.constantTimeAreEqual(calculateCMSKeyChecksum(bArr), bArr2);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.forWrapping = z10;
        this.engine = new CBCBlockCipher(new RC2Engine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.sr = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.sr = CryptoServicesRegistrar.getSecureRandom();
        }
        if (!(cipherParameters instanceof ParametersWithIV)) {
            this.param = cipherParameters;
            if (this.forWrapping) {
                byte[] bArr = new byte[8];
                this.iv = bArr;
                this.sr.nextBytes(bArr);
                this.paramPlusIV = new ParametersWithIV(this.param, this.iv);
                return;
            }
            return;
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        this.paramPlusIV = parametersWithIV;
        this.iv = parametersWithIV.getIV();
        this.param = this.paramPlusIV.getParameters();
        if (!this.forWrapping) {
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        byte[] bArr2 = this.iv;
        if (bArr2 == null || bArr2.length != 8) {
            throw new IllegalArgumentException("IV is not 8 octets");
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i9) {
        if (this.forWrapping) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        if (i9 % this.engine.getBlockSize() != 0) {
            throw new InvalidCipherTextException("Ciphertext not multiple of " + this.engine.getBlockSize());
        }
        this.engine.init(false, new ParametersWithIV(this.param, IV2));
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i, bArr2, 0, i9);
        for (int i10 = 0; i10 < i9 / this.engine.getBlockSize(); i10++) {
            int blockSize = this.engine.getBlockSize() * i10;
            this.engine.processBlock(bArr2, blockSize, bArr2, blockSize);
        }
        byte[] bArr3 = new byte[i9];
        int i11 = 0;
        while (i11 < i9) {
            int i12 = i11 + 1;
            bArr3[i11] = bArr2[i9 - i12];
            i11 = i12;
        }
        byte[] bArr4 = new byte[8];
        this.iv = bArr4;
        int i13 = i9 - 8;
        byte[] bArr5 = new byte[i13];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i13);
        ParametersWithIV parametersWithIV = new ParametersWithIV(this.param, this.iv);
        this.paramPlusIV = parametersWithIV;
        this.engine.init(false, parametersWithIV);
        byte[] bArr6 = new byte[i13];
        System.arraycopy(bArr5, 0, bArr6, 0, i13);
        for (int i14 = 0; i14 < i13 / this.engine.getBlockSize(); i14++) {
            int blockSize2 = this.engine.getBlockSize() * i14;
            this.engine.processBlock(bArr6, blockSize2, bArr6, blockSize2);
        }
        int i15 = i9 - 16;
        byte[] bArr7 = new byte[i15];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i15);
        System.arraycopy(bArr6, i15, bArr8, 0, 8);
        if (!checkCMSKeyChecksum(bArr7, bArr8)) {
            throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        }
        int i16 = bArr7[0];
        if (i15 - ((i16 & 255) + 1) <= 7) {
            byte[] bArr9 = new byte[i16];
            System.arraycopy(bArr7, 1, bArr9, 0, i16);
            return bArr9;
        }
        throw new InvalidCipherTextException("too many pad bytes (" + (i15 - ((bArr7[0] & 255) + 1)) + ")");
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i9) {
        if (!this.forWrapping) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int i10 = i9 + 1;
        int i11 = i10 % 8;
        int i12 = i11 != 0 ? (8 - i11) + i10 : i10;
        byte[] bArr2 = new byte[i12];
        bArr2[0] = (byte) i9;
        System.arraycopy(bArr, i, bArr2, 1, i9);
        int i13 = (i12 - i9) - 1;
        byte[] bArr3 = new byte[i13];
        if (i13 > 0) {
            this.sr.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i10, i13);
        }
        byte[] calculateCMSKeyChecksum = calculateCMSKeyChecksum(bArr2);
        int length = calculateCMSKeyChecksum.length + i12;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr2, 0, bArr4, 0, i12);
        System.arraycopy(calculateCMSKeyChecksum, 0, bArr4, i12, calculateCMSKeyChecksum.length);
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr4, 0, bArr5, 0, length);
        int blockSize = length / this.engine.getBlockSize();
        if (length % this.engine.getBlockSize() != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.engine.init(true, this.paramPlusIV);
        for (int i14 = 0; i14 < blockSize; i14++) {
            int blockSize2 = this.engine.getBlockSize() * i14;
            this.engine.processBlock(bArr5, blockSize2, bArr5, blockSize2);
        }
        byte[] bArr6 = this.iv;
        int length2 = bArr6.length + length;
        byte[] bArr7 = new byte[length2];
        System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
        System.arraycopy(bArr5, 0, bArr7, this.iv.length, length);
        byte[] bArr8 = new byte[length2];
        int i15 = 0;
        while (i15 < length2) {
            int i16 = i15 + 1;
            bArr8[i15] = bArr7[length2 - i16];
            i15 = i16;
        }
        this.engine.init(true, new ParametersWithIV(this.param, IV2));
        for (int i17 = 0; i17 < blockSize + 1; i17++) {
            int blockSize3 = this.engine.getBlockSize() * i17;
            this.engine.processBlock(bArr8, blockSize3, bArr8, blockSize3);
        }
        return bArr8;
    }
}
