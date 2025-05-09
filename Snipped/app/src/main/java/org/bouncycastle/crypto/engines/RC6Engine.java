package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes2.dex */
public class RC6Engine implements BlockCipher {
    private static final int LGW = 5;
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private static final int _noRounds = 20;
    private static final int bytesPerWord = 4;
    private static final int wordSize = 32;
    private int[] _S = null;
    private boolean forEncryption;

    private int bytesToWord(byte[] bArr, int i) {
        int i9 = 0;
        for (int i10 = 3; i10 >= 0; i10--) {
            i9 = (i9 << 8) + (bArr[i10 + i] & 255);
        }
        return i9;
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int bytesToWord = bytesToWord(bArr, i);
        int bytesToWord2 = bytesToWord(bArr, i + 4);
        int bytesToWord3 = bytesToWord(bArr, i + 8);
        int bytesToWord4 = bytesToWord(bArr, i + 12);
        int[] iArr = this._S;
        int i10 = bytesToWord3 - iArr[43];
        int i11 = bytesToWord - iArr[42];
        int i12 = 20;
        while (i12 >= 1) {
            int rotateLeft = rotateLeft(((i11 * 2) + 1) * i11, 5);
            int rotateLeft2 = rotateLeft(((i10 * 2) + 1) * i10, 5);
            int i13 = i12 * 2;
            int rotateRight = rotateRight(bytesToWord2 - this._S[i13 + 1], rotateLeft) ^ rotateLeft2;
            i12--;
            int i14 = i11;
            i11 = rotateRight(bytesToWord4 - this._S[i13], rotateLeft2) ^ rotateLeft;
            bytesToWord4 = i10;
            i10 = rotateRight;
            bytesToWord2 = i14;
        }
        int[] iArr2 = this._S;
        int i15 = bytesToWord4 - iArr2[1];
        int i16 = bytesToWord2 - iArr2[0];
        wordToBytes(i11, bArr2, i9);
        wordToBytes(i16, bArr2, i9 + 4);
        wordToBytes(i10, bArr2, i9 + 8);
        wordToBytes(i15, bArr2, i9 + 12);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int bytesToWord = bytesToWord(bArr, i);
        int bytesToWord2 = bytesToWord(bArr, i + 4);
        int bytesToWord3 = bytesToWord(bArr, i + 8);
        int bytesToWord4 = bytesToWord(bArr, i + 12);
        int[] iArr = this._S;
        int i10 = bytesToWord2 + iArr[0];
        int i11 = bytesToWord4 + iArr[1];
        int i12 = 1;
        while (i12 <= 20) {
            int rotateLeft = rotateLeft(((i10 * 2) + 1) * i10, 5);
            int rotateLeft2 = rotateLeft(((i11 * 2) + 1) * i11, 5);
            int i13 = i12 * 2;
            int rotateLeft3 = rotateLeft(bytesToWord ^ rotateLeft, rotateLeft2) + this._S[i13];
            int rotateLeft4 = rotateLeft(bytesToWord3 ^ rotateLeft2, rotateLeft) + this._S[i13 + 1];
            i12++;
            bytesToWord3 = i11;
            i11 = rotateLeft3;
            bytesToWord = i10;
            i10 = rotateLeft4;
        }
        int[] iArr2 = this._S;
        int i14 = bytesToWord + iArr2[42];
        int i15 = bytesToWord3 + iArr2[43];
        wordToBytes(i14, bArr2, i9);
        wordToBytes(i10, bArr2, i9 + 4);
        wordToBytes(i15, bArr2, i9 + 8);
        wordToBytes(i11, bArr2, i9 + 12);
        return 16;
    }

    private int rotateLeft(int i, int i9) {
        return (i >>> (-i9)) | (i << i9);
    }

    private int rotateRight(int i, int i9) {
        return (i << (-i9)) | (i >>> i9);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = bArr.length;
        int length2 = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length2];
        for (int length3 = bArr.length - 1; length3 >= 0; length3--) {
            int i = length3 / 4;
            iArr2[i] = (iArr2[i] << 8) + (bArr[length3] & 255);
        }
        int[] iArr3 = new int[44];
        this._S = iArr3;
        iArr3[0] = P32;
        int i9 = 1;
        while (true) {
            iArr = this._S;
            if (i9 >= iArr.length) {
                break;
            }
            iArr[i9] = iArr[i9 - 1] + Q32;
            i9++;
        }
        int length4 = length2 > iArr.length ? length2 * 3 : iArr.length * 3;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length4; i14++) {
            int[] iArr4 = this._S;
            i11 = rotateLeft(iArr4[i10] + i11 + i12, 3);
            iArr4[i10] = i11;
            i12 = rotateLeft(iArr2[i13] + i11 + i12, i12 + i11);
            iArr2[i13] = i12;
            i10 = (i10 + 1) % this._S.length;
            i13 = (i13 + 1) % length2;
        }
    }

    private void wordToBytes(int i, byte[] bArr, int i9) {
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i10 + i9] = (byte) i;
            i >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC6";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to RC6 init - ", cipherParameters));
        }
        this.forEncryption = z10;
        setKey(((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int blockSize = getBlockSize();
        if (this._S == null) {
            throw new IllegalStateException("RC6 engine not initialised");
        }
        if (i + blockSize > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (blockSize + i9 <= bArr2.length) {
            return this.forEncryption ? encryptBlock(bArr, i, bArr2, i9) : decryptBlock(bArr, i, bArr2, i9);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
