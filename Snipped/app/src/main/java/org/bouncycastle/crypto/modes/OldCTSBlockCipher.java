package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes2.dex */
public class OldCTSBlockCipher extends BufferedBlockCipher {
    private int blockSize;

    public OldCTSBlockCipher(BlockCipher blockCipher) {
        if ((blockCipher instanceof OFBBlockCipher) || (blockCipher instanceof CFBBlockCipher)) {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        }
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.buf = new byte[blockSize * 2];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i) {
        if (this.bufOff + i > bArr.length) {
            throw new OutputLengthException("output buffer to small in doFinal");
        }
        int blockSize = this.cipher.getBlockSize();
        int i9 = this.bufOff - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (this.forEncryption) {
            this.cipher.processBlock(this.buf, 0, bArr2, 0);
            int i10 = this.bufOff;
            if (i10 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            while (true) {
                byte[] bArr3 = this.buf;
                if (i10 == bArr3.length) {
                    break;
                }
                bArr3[i10] = bArr2[i10 - blockSize];
                i10++;
            }
            for (int i11 = blockSize; i11 != this.bufOff; i11++) {
                byte[] bArr4 = this.buf;
                bArr4[i11] = (byte) (bArr4[i11] ^ bArr2[i11 - blockSize]);
            }
            BlockCipher blockCipher = this.cipher;
            if (blockCipher instanceof CBCBlockCipher) {
                ((CBCBlockCipher) blockCipher).getUnderlyingCipher().processBlock(this.buf, blockSize, bArr, i);
            } else {
                blockCipher.processBlock(this.buf, blockSize, bArr, i);
            }
            System.arraycopy(bArr2, 0, bArr, i + blockSize, i9);
        } else {
            byte[] bArr5 = new byte[blockSize];
            BlockCipher blockCipher2 = this.cipher;
            if (blockCipher2 instanceof CBCBlockCipher) {
                ((CBCBlockCipher) blockCipher2).getUnderlyingCipher().processBlock(this.buf, 0, bArr2, 0);
            } else {
                blockCipher2.processBlock(this.buf, 0, bArr2, 0);
            }
            for (int i12 = blockSize; i12 != this.bufOff; i12++) {
                int i13 = i12 - blockSize;
                bArr5[i13] = (byte) (bArr2[i13] ^ this.buf[i12]);
            }
            System.arraycopy(this.buf, blockSize, bArr2, 0, i9);
            this.cipher.processBlock(bArr2, 0, bArr, i);
            System.arraycopy(bArr5, 0, bArr, i + blockSize, i9);
        }
        int i14 = this.bufOff;
        reset();
        return i14;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i) {
        return i + this.bufOff;
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
            byte[] bArr3 = this.buf;
            int i11 = this.blockSize;
            System.arraycopy(bArr3, i11, bArr3, 0, i11);
            this.bufOff = this.blockSize;
            i10 = processBlock;
        }
        byte[] bArr4 = this.buf;
        int i12 = this.bufOff;
        this.bufOff = i12 + 1;
        bArr4[i12] = b9;
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
            byte[] bArr4 = this.buf;
            System.arraycopy(bArr4, blockSize, bArr4, 0, blockSize);
            this.bufOff = blockSize;
            i9 -= i12;
            i += i12;
            while (i9 > blockSize) {
                System.arraycopy(bArr, i, this.buf, this.bufOff, blockSize);
                processBlock += this.cipher.processBlock(this.buf, 0, bArr2, i10 + processBlock);
                byte[] bArr5 = this.buf;
                System.arraycopy(bArr5, blockSize, bArr5, 0, blockSize);
                i9 -= blockSize;
                i += blockSize;
            }
            i13 = processBlock;
        }
        System.arraycopy(bArr, i, this.buf, this.bufOff, i9);
        this.bufOff += i9;
        return i13;
    }
}
