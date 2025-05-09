package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes2.dex */
public class PaddedBlockCipher extends BufferedBlockCipher {
    public PaddedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) {
        int i9;
        int i10;
        int blockSize = this.cipher.getBlockSize();
        if (this.forEncryption) {
            if (this.bufOff != blockSize) {
                i10 = 0;
            } else {
                if ((blockSize * 2) + i > bArr.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                i10 = this.cipher.processBlock(this.buf, 0, bArr, i);
                this.bufOff = 0;
            }
            byte b9 = (byte) (blockSize - this.bufOff);
            while (true) {
                int i11 = this.bufOff;
                if (i11 >= blockSize) {
                    break;
                }
                this.buf[i11] = b9;
                this.bufOff = i11 + 1;
            }
            i9 = this.cipher.processBlock(this.buf, 0, bArr, i + i10) + i10;
        } else {
            if (this.bufOff != blockSize) {
                throw new DataLengthException("last block incomplete in decryption");
            }
            BlockCipher blockCipher = this.cipher;
            byte[] bArr2 = this.buf;
            int processBlock = blockCipher.processBlock(bArr2, 0, bArr2, 0);
            this.bufOff = 0;
            byte[] bArr3 = this.buf;
            int i12 = bArr3[blockSize - 1] & 255;
            if (i12 > blockSize) {
                throw new InvalidCipherTextException("pad block corrupted");
            }
            int i13 = processBlock - i12;
            System.arraycopy(bArr3, 0, bArr, i, i13);
            i9 = i13;
        }
        reset();
        return i9;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        int i9 = i + this.bufOff;
        byte[] bArr = this.buf;
        int length = i9 % bArr.length;
        if (length != 0) {
            i9 -= length;
        } else if (!this.forEncryption) {
            return i9;
        }
        return i9 + bArr.length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i) {
        int i9 = i + this.bufOff;
        byte[] bArr = this.buf;
        int length = i9 % bArr.length;
        return length == 0 ? i9 - bArr.length : i9 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b9, byte[] bArr, int i) {
        int i9 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i10 = 0;
        if (i9 == bArr2.length) {
            int processBlock = this.cipher.processBlock(bArr2, 0, bArr, i);
            this.bufOff = 0;
            i10 = processBlock;
        }
        byte[] bArr3 = this.buf;
        int i11 = this.bufOff;
        this.bufOff = i11 + 1;
        bArr3[i11] = b9;
        return i10;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i, int i9, byte[] bArr2, int i10) {
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
        int i11 = this.bufOff;
        int i12 = length - i11;
        int i13 = 0;
        if (i9 > i12) {
            System.arraycopy(bArr, i, bArr3, i11, i12);
            int processBlock = this.cipher.processBlock(this.buf, 0, bArr2, i10);
            this.bufOff = 0;
            i9 -= i12;
            i += i12;
            i13 = processBlock;
            while (i9 > this.buf.length) {
                i13 += this.cipher.processBlock(bArr, i, bArr2, i10 + i13);
                i9 -= blockSize;
                i += blockSize;
            }
        }
        System.arraycopy(bArr, i, this.buf, this.bufOff, i9);
        this.bufOff += i9;
        return i13;
    }
}
