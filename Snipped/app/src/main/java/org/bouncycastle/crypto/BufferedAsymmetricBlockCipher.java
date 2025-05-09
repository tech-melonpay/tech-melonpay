package org.bouncycastle.crypto;

/* loaded from: classes2.dex */
public class BufferedAsymmetricBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    private final AsymmetricBlockCipher cipher;

    public BufferedAsymmetricBlockCipher(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.cipher = asymmetricBlockCipher;
    }

    public byte[] doFinal() {
        byte[] processBlock = this.cipher.processBlock(this.buf, 0, this.bufOff);
        reset();
        return processBlock;
    }

    public int getBufferPosition() {
        return this.bufOff;
    }

    public int getInputBlockSize() {
        return this.cipher.getInputBlockSize();
    }

    public int getOutputBlockSize() {
        return this.cipher.getOutputBlockSize();
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public void init(boolean z10, CipherParameters cipherParameters) {
        reset();
        this.cipher.init(z10, cipherParameters);
        this.buf = new byte[this.cipher.getInputBlockSize() + (z10 ? 1 : 0)];
        this.bufOff = 0;
    }

    public void processByte(byte b9) {
        int i = this.bufOff;
        byte[] bArr = this.buf;
        if (i >= bArr.length) {
            throw new DataLengthException("attempt to process message too long for cipher");
        }
        this.bufOff = i + 1;
        bArr[i] = b9;
    }

    public void processBytes(byte[] bArr, int i, int i9) {
        if (i9 == 0) {
            return;
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i10 = this.bufOff;
        int i11 = i10 + i9;
        byte[] bArr2 = this.buf;
        if (i11 > bArr2.length) {
            throw new DataLengthException("attempt to process message too long for cipher");
        }
        System.arraycopy(bArr, i, bArr2, i10, i9);
        this.bufOff += i9;
    }

    public void reset() {
        if (this.buf != null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.buf;
                if (i >= bArr.length) {
                    break;
                }
                bArr[i] = 0;
                i++;
            }
        }
        this.bufOff = 0;
    }
}
