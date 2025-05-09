package org.bouncycastle.crypto.engines;

import java.lang.reflect.Array;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class LEAEngine implements BlockCipher {
    private static final int BASEROUNDS = 16;
    private static final int BLOCKSIZE = 16;
    private static final int[] DELTA = {-1007687205, 1147300610, 2044886154, 2027892972, 1902027934, -947529206, -531697110, -440137385};
    private static final int KEY0 = 0;
    private static final int KEY1 = 1;
    private static final int KEY2 = 2;
    private static final int KEY3 = 3;
    private static final int KEY4 = 4;
    private static final int KEY5 = 5;
    private static final int MASK128 = 3;
    private static final int MASK256 = 7;
    private static final int NUMWORDS = 4;
    private static final int NUMWORDS128 = 4;
    private static final int NUMWORDS192 = 6;
    private static final int NUMWORDS256 = 8;
    private static final int ROT1 = 1;
    private static final int ROT11 = 11;
    private static final int ROT13 = 13;
    private static final int ROT17 = 17;
    private static final int ROT3 = 3;
    private static final int ROT5 = 5;
    private static final int ROT6 = 6;
    private static final int ROT9 = 9;
    private boolean forEncryption;
    private final int[] theBlock = new int[4];
    private int[][] theRoundKeys;
    private int theRounds;

    private static int bufLength(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    private static void checkBuffer(byte[] bArr, int i, boolean z10) {
        int bufLength = bufLength(bArr);
        int i9 = i + 16;
        if (i < 0 || i9 < 0 || i9 > bufLength) {
            if (!z10) {
                throw new DataLengthException("Input buffer too short.");
            }
        }
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        Pack.littleEndianToInt(bArr, i, this.theBlock, 0, 4);
        for (int i10 = this.theRounds - 1; i10 >= 0; i10--) {
            decryptRound(i10);
        }
        Pack.intToLittleEndian(this.theBlock, bArr2, i9);
        return 16;
    }

    private void decryptRound(int i) {
        int[] iArr = this.theRoundKeys[i];
        int i9 = i % 4;
        int rightIndex = rightIndex(i9);
        int[] iArr2 = this.theBlock;
        iArr2[rightIndex] = iArr[1] ^ (ror32(iArr2[rightIndex], 9) - (this.theBlock[i9] ^ iArr[0]));
        int rightIndex2 = rightIndex(rightIndex);
        int[] iArr3 = this.theBlock;
        iArr3[rightIndex2] = (rol32(iArr3[rightIndex2], 5) - (this.theBlock[rightIndex] ^ iArr[2])) ^ iArr[3];
        int rightIndex3 = rightIndex(rightIndex2);
        int[] iArr4 = this.theBlock;
        iArr4[rightIndex3] = iArr[5] ^ (rol32(iArr4[rightIndex3], 3) - (this.theBlock[rightIndex2] ^ iArr[4]));
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        Pack.littleEndianToInt(bArr, i, this.theBlock, 0, 4);
        for (int i10 = 0; i10 < this.theRounds; i10++) {
            encryptRound(i10);
        }
        Pack.intToLittleEndian(this.theBlock, bArr2, i9);
        return 16;
    }

    private void encryptRound(int i) {
        int[] iArr = this.theRoundKeys[i];
        int i9 = (i + 3) % 4;
        int leftIndex = leftIndex(i9);
        int[] iArr2 = this.theBlock;
        iArr2[i9] = ror32((iArr[4] ^ iArr2[leftIndex]) + (iArr2[i9] ^ iArr[5]), 3);
        int leftIndex2 = leftIndex(leftIndex);
        int[] iArr3 = this.theBlock;
        iArr3[leftIndex] = ror32((iArr3[leftIndex2] ^ iArr[2]) + (iArr[3] ^ iArr3[leftIndex]), 5);
        int leftIndex3 = leftIndex(leftIndex2);
        int[] iArr4 = this.theBlock;
        iArr4[leftIndex2] = rol32((iArr4[leftIndex3] ^ iArr[0]) + (iArr[1] ^ iArr4[leftIndex2]), 9);
    }

    private void generate128RoundKeys(int[] iArr) {
        for (int i = 0; i < this.theRounds; i++) {
            int rol32 = rol32(DELTA[i & 3], i);
            iArr[0] = rol32(iArr[0] + rol32, 1);
            iArr[1] = rol32(iArr[1] + rol32(rol32, 1), 3);
            iArr[2] = rol32(iArr[2] + rol32(rol32, 2), 6);
            iArr[3] = rol32(iArr[3] + rol32(rol32, 3), 11);
            int[] iArr2 = this.theRoundKeys[i];
            iArr2[0] = iArr[0];
            iArr2[1] = iArr[1];
            iArr2[2] = iArr[2];
            int i9 = iArr[1];
            iArr2[3] = i9;
            iArr2[4] = iArr[3];
            iArr2[5] = i9;
        }
    }

    private void generate192RoundKeys(int[] iArr) {
        for (int i = 0; i < this.theRounds; i++) {
            int rol32 = rol32(DELTA[i % 6], i);
            iArr[0] = rol32(iArr[0] + rol32(rol32, 0), 1);
            iArr[1] = rol32(iArr[1] + rol32(rol32, 1), 3);
            iArr[2] = rol32(iArr[2] + rol32(rol32, 2), 6);
            iArr[3] = rol32(iArr[3] + rol32(rol32, 3), 11);
            iArr[4] = rol32(iArr[4] + rol32(rol32, 4), 13);
            iArr[5] = rol32(iArr[5] + rol32(rol32, 5), 17);
            System.arraycopy(iArr, 0, this.theRoundKeys[i], 0, 6);
        }
    }

    private void generate256RoundKeys(int[] iArr) {
        int i = 0;
        for (int i9 = 0; i9 < this.theRounds; i9++) {
            int rol32 = rol32(DELTA[i9 & 7], i9);
            int[] iArr2 = this.theRoundKeys[i9];
            int i10 = i & 7;
            int rol322 = rol32(iArr[i10] + rol32, 1);
            iArr2[0] = rol322;
            iArr[i10] = rol322;
            int i11 = (i + 1) & 7;
            int rol323 = rol32(iArr[i11] + rol32(rol32, 1), 3);
            iArr2[1] = rol323;
            iArr[i11] = rol323;
            int i12 = (i + 2) & 7;
            int rol324 = rol32(iArr[i12] + rol32(rol32, 2), 6);
            iArr2[2] = rol324;
            iArr[i12] = rol324;
            int i13 = (i + 3) & 7;
            int rol325 = rol32(iArr[i13] + rol32(rol32, 3), 11);
            iArr2[3] = rol325;
            iArr[i13] = rol325;
            int i14 = (i + 4) & 7;
            int rol326 = rol32(iArr[i14] + rol32(rol32, 4), 13);
            iArr2[4] = rol326;
            iArr[i14] = rol326;
            int i15 = (i + 5) & 7;
            int rol327 = rol32(iArr[i15] + rol32(rol32, 5), 17);
            iArr2[5] = rol327;
            i += 6;
            iArr[i15] = rol327;
        }
    }

    private void generateRoundKeys(byte[] bArr) {
        int length = (bArr.length >> 1) + 16;
        this.theRounds = length;
        this.theRoundKeys = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length, 6);
        int length2 = bArr.length / 4;
        int[] iArr = new int[length2];
        Pack.littleEndianToInt(bArr, 0, iArr, 0, length2);
        if (length2 == 4) {
            generate128RoundKeys(iArr);
        } else if (length2 != 6) {
            generate256RoundKeys(iArr);
        } else {
            generate192RoundKeys(iArr);
        }
    }

    private static int leftIndex(int i) {
        if (i == 0) {
            return 3;
        }
        return i - 1;
    }

    private static int rightIndex(int i) {
        if (i == 3) {
            return 0;
        }
        return i + 1;
    }

    private static int rol32(int i, int i9) {
        return (i >>> (32 - i9)) | (i << i9);
    }

    private static int ror32(int i, int i9) {
        return (i << (32 - i9)) | (i >>> i9);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "LEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("Invalid parameter passed to LEA init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length;
        if ((length << 1) % 16 != 0 || length < 16 || length > 32) {
            throw new IllegalArgumentException("KeyBitSize must be 128, 192 or 256");
        }
        this.forEncryption = z10;
        generateRoundKeys(key);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        checkBuffer(bArr, i, false);
        checkBuffer(bArr2, i9, true);
        return this.forEncryption ? encryptBlock(bArr, i, bArr2, i9) : decryptBlock(bArr, i, bArr2, i9);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
