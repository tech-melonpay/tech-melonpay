package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes2.dex */
public class NISTCTSBlockCipher extends BufferedBlockCipher {
    public static final int CS1 = 1;
    public static final int CS2 = 2;
    public static final int CS3 = 3;
    private final int blockSize;
    private final int type;

    public NISTCTSBlockCipher(int i, BlockCipher blockCipher) {
        this.type = i;
        this.cipher = new CBCBlockCipher(blockCipher);
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
        int i9 = this.bufOff;
        int i10 = i9 - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (this.forEncryption) {
            if (i9 < blockSize) {
                throw new DataLengthException("need at least one block of input for NISTCTS");
            }
            if (i9 > blockSize) {
                byte[] bArr3 = new byte[blockSize];
                int i11 = this.type;
                if (i11 == 2 || i11 == 3) {
                    this.cipher.processBlock(this.buf, 0, bArr2, 0);
                    System.arraycopy(this.buf, blockSize, bArr3, 0, i10);
                    this.cipher.processBlock(bArr3, 0, bArr3, 0);
                    if (this.type == 2 && i10 == blockSize) {
                        System.arraycopy(bArr2, 0, bArr, i, blockSize);
                        System.arraycopy(bArr3, 0, bArr, i + blockSize, i10);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, i, blockSize);
                        System.arraycopy(bArr2, 0, bArr, i + blockSize, i10);
                    }
                } else {
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    this.cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i, i10);
                    System.arraycopy(this.buf, this.bufOff - i10, bArr3, 0, i10);
                    this.cipher.processBlock(bArr3, 0, bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr, i + i10, blockSize);
                }
            } else {
                this.cipher.processBlock(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        } else {
            if (i9 < blockSize) {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            byte[] bArr4 = new byte[blockSize];
            if (i9 > blockSize) {
                int i12 = this.type;
                if (i12 == 3 || (i12 == 2 && (this.buf.length - i9) % blockSize != 0)) {
                    BlockCipher blockCipher = this.cipher;
                    if (blockCipher instanceof CBCBlockCipher) {
                        ((CBCBlockCipher) blockCipher).getUnderlyingCipher().processBlock(this.buf, 0, bArr2, 0);
                    } else {
                        blockCipher.processBlock(this.buf, 0, bArr2, 0);
                    }
                    for (int i13 = blockSize; i13 != this.bufOff; i13++) {
                        int i14 = i13 - blockSize;
                        bArr4[i14] = (byte) (bArr2[i14] ^ this.buf[i13]);
                    }
                    System.arraycopy(this.buf, blockSize, bArr2, 0, i10);
                    this.cipher.processBlock(bArr2, 0, bArr, i);
                } else {
                    ((CBCBlockCipher) this.cipher).getUnderlyingCipher().processBlock(this.buf, this.bufOff - blockSize, bArr4, 0);
                    System.arraycopy(this.buf, 0, bArr2, 0, blockSize);
                    if (i10 != blockSize) {
                        System.arraycopy(bArr4, i10, bArr2, i10, blockSize - i10);
                    }
                    this.cipher.processBlock(bArr2, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i, blockSize);
                    for (int i15 = 0; i15 != i10; i15++) {
                        bArr4[i15] = (byte) (bArr4[i15] ^ this.buf[i15]);
                    }
                }
                System.arraycopy(bArr4, 0, bArr, i + blockSize, i10);
            } else {
                this.cipher.processBlock(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i, blockSize);
            }
        }
        int i16 = this.bufOff;
        reset();
        return i16;
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
