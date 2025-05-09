package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public class BufferedBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    public BufferedBlockCipher() {
    }

    public int doFinal(byte[] bArr, int i) {
        try {
            int i9 = this.bufOff;
            if (i + i9 > bArr.length) {
                throw new OutputLengthException("output buffer too short for doFinal()");
            }
            int i10 = 0;
            if (i9 != 0) {
                if (!this.partialBlockOkay) {
                    throw new DataLengthException("data not block size aligned");
                }
                BlockCipher blockCipher = this.cipher;
                byte[] bArr2 = this.buf;
                blockCipher.processBlock(bArr2, 0, bArr2, 0);
                int i11 = this.bufOff;
                this.bufOff = 0;
                System.arraycopy(this.buf, 0, bArr, i, i11);
                i10 = i11;
            }
            reset();
            return i10;
        } catch (Throwable th) {
            reset();
            throw th;
        }
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public int getOutputSize(int i) {
        return i + this.bufOff;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public int getUpdateOutputSize(int i) {
        int length;
        int i9;
        int i10 = i + this.bufOff;
        if (!this.pgpCFB) {
            length = this.buf.length;
        } else {
            if (this.forEncryption) {
                i9 = (i10 % this.buf.length) - (this.cipher.getBlockSize() + 2);
                return i10 - i9;
            }
            length = this.buf.length;
        }
        i9 = i10 % length;
        return i10 - i9;
    }

    public void init(boolean z10, CipherParameters cipherParameters) {
        this.forEncryption = z10;
        reset();
        this.cipher.init(z10, cipherParameters);
    }

    public int processByte(byte b9, byte[] bArr, int i) {
        byte[] bArr2 = this.buf;
        int i9 = this.bufOff;
        int i10 = i9 + 1;
        this.bufOff = i10;
        bArr2[i9] = b9;
        if (i10 != bArr2.length) {
            return 0;
        }
        int processBlock = this.cipher.processBlock(bArr2, 0, bArr, i);
        this.bufOff = 0;
        return processBlock;
    }

    public int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
        int i11;
        if (i9 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i9);
        if (updateOutputSize > 0 && updateOutputSize + i10 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i12 = this.bufOff;
        int i13 = length - i12;
        if (i9 > i13) {
            System.arraycopy(bArr, i, bArr3, i12, i13);
            i11 = this.cipher.processBlock(this.buf, 0, bArr2, i10);
            this.bufOff = 0;
            i9 -= i13;
            i += i13;
            while (i9 > this.buf.length) {
                i11 += this.cipher.processBlock(bArr, i, bArr2, i10 + i11);
                i9 -= blockSize;
                i += blockSize;
            }
        } else {
            i11 = 0;
        }
        System.arraycopy(bArr, i, this.buf, this.bufOff, i9);
        int i14 = this.bufOff + i9;
        this.bufOff = i14;
        byte[] bArr4 = this.buf;
        if (i14 != bArr4.length) {
            return i11;
        }
        int processBlock = i11 + this.cipher.processBlock(bArr4, 0, bArr2, i10 + i11);
        this.bufOff = 0;
        return processBlock;
    }

    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    public BufferedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        this.buf = new byte[blockCipher.getBlockSize()];
        boolean z10 = false;
        this.bufOff = 0;
        String algorithmName = blockCipher.getAlgorithmName();
        int indexOf = algorithmName.indexOf(47) + 1;
        boolean z11 = indexOf > 0 && algorithmName.startsWith("PGP", indexOf);
        this.pgpCFB = z11;
        if (z11 || (blockCipher instanceof StreamCipher)) {
            this.partialBlockOkay = true;
            return;
        }
        if (indexOf > 0 && algorithmName.startsWith("OpenPGP", indexOf)) {
            z10 = true;
        }
        this.partialBlockOkay = z10;
    }
}
