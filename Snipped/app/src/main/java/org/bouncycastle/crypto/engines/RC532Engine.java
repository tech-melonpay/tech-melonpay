package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC5Parameters;

/* loaded from: classes2.dex */
public class RC532Engine implements BlockCipher {
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private boolean forEncryption;
    private int _noRounds = 12;
    private int[] _S = null;

    private int bytesToWord(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int bytesToWord = bytesToWord(bArr, i);
        int bytesToWord2 = bytesToWord(bArr, i + 4);
        for (int i10 = this._noRounds; i10 >= 1; i10--) {
            int i11 = i10 * 2;
            bytesToWord2 = rotateRight(bytesToWord2 - this._S[i11 + 1], bytesToWord) ^ bytesToWord;
            bytesToWord = rotateRight(bytesToWord - this._S[i11], bytesToWord2) ^ bytesToWord2;
        }
        wordToBytes(bytesToWord - this._S[0], bArr2, i9);
        wordToBytes(bytesToWord2 - this._S[1], bArr2, i9 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int bytesToWord = bytesToWord(bArr, i) + this._S[0];
        int bytesToWord2 = bytesToWord(bArr, i + 4) + this._S[1];
        for (int i10 = 1; i10 <= this._noRounds; i10++) {
            int i11 = i10 * 2;
            bytesToWord = rotateLeft(bytesToWord ^ bytesToWord2, bytesToWord2) + this._S[i11];
            bytesToWord2 = rotateLeft(bytesToWord2 ^ bytesToWord, bytesToWord) + this._S[i11 + 1];
        }
        wordToBytes(bytesToWord, bArr2, i9);
        wordToBytes(bytesToWord2, bArr2, i9 + 4);
        return 8;
    }

    private int rotateLeft(int i, int i9) {
        int i10 = i9 & 31;
        return (i >>> (32 - i10)) | (i << i10);
    }

    private int rotateRight(int i, int i9) {
        int i10 = i9 & 31;
        return (i << (32 - i10)) | (i >>> i10);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i = 0; i != bArr.length; i++) {
            int i9 = i / 4;
            iArr2[i9] = iArr2[i9] + ((bArr[i] & 255) << ((i % 4) * 8));
        }
        int[] iArr3 = new int[(this._noRounds + 1) * 2];
        this._S = iArr3;
        iArr3[0] = P32;
        int i10 = 1;
        while (true) {
            iArr = this._S;
            if (i10 >= iArr.length) {
                break;
            }
            iArr[i10] = iArr[i10 - 1] + Q32;
            i10++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length2; i15++) {
            int[] iArr4 = this._S;
            i12 = rotateLeft(iArr4[i11] + i12 + i13, 3);
            iArr4[i11] = i12;
            i13 = rotateLeft(iArr2[i14] + i12 + i13, i13 + i12);
            iArr2[i14] = i13;
            i11 = (i11 + 1) % this._S.length;
            i14 = (i14 + 1) % length;
        }
    }

    private void wordToBytes(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) i;
        bArr[i9 + 1] = (byte) (i >> 8);
        bArr[i9 + 2] = (byte) (i >> 16);
        bArr[i9 + 3] = (byte) (i >> 24);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-32";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof RC5Parameters) {
            RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
            this._noRounds = rC5Parameters.getRounds();
            setKey(rC5Parameters.getKey());
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(a.h("invalid parameter passed to RC532 init - ", cipherParameters));
            }
            setKey(((KeyParameter) cipherParameters).getKey());
        }
        this.forEncryption = z10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        return this.forEncryption ? encryptBlock(bArr, i, bArr2, i9) : decryptBlock(bArr, i, bArr2, i9);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
