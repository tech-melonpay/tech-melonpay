package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes2.dex */
public class OpenPGPCFBBlockCipher implements BlockCipher {
    private byte[] FR;
    private byte[] FRE;
    private byte[] IV;
    private int blockSize;
    private BlockCipher cipher;
    private int count;
    private boolean forEncryption;

    public OpenPGPCFBBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.FR = new byte[blockSize];
        this.FRE = new byte[blockSize];
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int i10;
        int i11;
        int i12;
        int i13 = this.blockSize;
        if (i + i13 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + i13 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i14 = this.count;
        int i15 = 2;
        int i16 = 0;
        if (i14 > i13) {
            byte b9 = bArr[i];
            this.FR[i13 - 2] = b9;
            bArr2[i9] = encryptByte(b9, i13 - 2);
            byte b10 = bArr[i + 1];
            byte[] bArr3 = this.FR;
            int i17 = this.blockSize;
            bArr3[i17 - 1] = b10;
            bArr2[i9 + 1] = encryptByte(b10, i17 - 1);
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i15 < this.blockSize) {
                byte b11 = bArr[i + i15];
                int i18 = i15 - 2;
                this.FR[i18] = b11;
                bArr2[i9 + i15] = encryptByte(b11, i18);
                i15++;
            }
        } else {
            if (i14 == 0) {
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                while (true) {
                    i12 = this.blockSize;
                    if (i16 >= i12) {
                        break;
                    }
                    int i19 = i + i16;
                    this.FR[i16] = bArr[i19];
                    bArr2[i16] = encryptByte(bArr[i19], i16);
                    i16++;
                }
                i11 = this.count + i12;
            } else if (i14 == i13) {
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                byte b12 = bArr[i];
                byte b13 = bArr[i + 1];
                bArr2[i9] = encryptByte(b12, 0);
                bArr2[i9 + 1] = encryptByte(b13, 1);
                byte[] bArr4 = this.FR;
                System.arraycopy(bArr4, 2, bArr4, 0, this.blockSize - 2);
                byte[] bArr5 = this.FR;
                int i20 = this.blockSize;
                bArr5[i20 - 2] = b12;
                bArr5[i20 - 1] = b13;
                this.cipher.processBlock(bArr5, 0, this.FRE, 0);
                while (true) {
                    i10 = this.blockSize;
                    if (i15 >= i10) {
                        break;
                    }
                    byte b14 = bArr[i + i15];
                    int i21 = i15 - 2;
                    this.FR[i21] = b14;
                    bArr2[i9 + i15] = encryptByte(b14, i21);
                    i15++;
                }
                i11 = this.count + i10;
            }
            this.count = i11;
        }
        return this.blockSize;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int i10;
        int i11 = this.blockSize;
        if (i + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i12 = this.count;
        int i13 = 2;
        int i14 = 0;
        if (i12 > i11) {
            byte[] bArr3 = this.FR;
            int i15 = i11 - 2;
            byte encryptByte = encryptByte(bArr[i], i11 - 2);
            bArr2[i9] = encryptByte;
            bArr3[i15] = encryptByte;
            byte[] bArr4 = this.FR;
            int i16 = this.blockSize;
            int i17 = i16 - 1;
            byte encryptByte2 = encryptByte(bArr[i + 1], i16 - 1);
            bArr2[i9 + 1] = encryptByte2;
            bArr4[i17] = encryptByte2;
            this.cipher.processBlock(this.FR, 0, this.FRE, 0);
            while (i13 < this.blockSize) {
                byte[] bArr5 = this.FR;
                int i18 = i13 - 2;
                byte encryptByte3 = encryptByte(bArr[i + i13], i18);
                bArr2[i9 + i13] = encryptByte3;
                bArr5[i18] = encryptByte3;
                i13++;
            }
        } else {
            if (i12 != 0) {
                if (i12 == i11) {
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    bArr2[i9] = encryptByte(bArr[i], 0);
                    bArr2[i9 + 1] = encryptByte(bArr[i + 1], 1);
                    byte[] bArr6 = this.FR;
                    System.arraycopy(bArr6, 2, bArr6, 0, this.blockSize - 2);
                    System.arraycopy(bArr2, i9, this.FR, this.blockSize - 2, 2);
                    this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                    while (true) {
                        i10 = this.blockSize;
                        if (i13 >= i10) {
                            break;
                        }
                        byte[] bArr7 = this.FR;
                        int i19 = i13 - 2;
                        byte encryptByte4 = encryptByte(bArr[i + i13], i19);
                        bArr2[i9 + i13] = encryptByte4;
                        bArr7[i19] = encryptByte4;
                        i13++;
                    }
                }
            } else {
                this.cipher.processBlock(this.FR, 0, this.FRE, 0);
                while (true) {
                    i10 = this.blockSize;
                    if (i14 >= i10) {
                        break;
                    }
                    byte[] bArr8 = this.FR;
                    byte encryptByte5 = encryptByte(bArr[i + i14], i14);
                    bArr2[i9 + i14] = encryptByte5;
                    bArr8[i14] = encryptByte5;
                    i14++;
                }
            }
            this.count += i10;
        }
        return this.blockSize;
    }

    private byte encryptByte(byte b9, int i) {
        return (byte) (b9 ^ this.FRE[i]);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.forEncryption = z10;
        reset();
        this.cipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        return this.forEncryption ? encryptBlock(bArr, i, bArr2, i9) : decryptBlock(bArr, i, bArr2, i9);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.count = 0;
        byte[] bArr = this.IV;
        byte[] bArr2 = this.FR;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.cipher.reset();
    }
}
