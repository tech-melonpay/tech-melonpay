package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.RC5Parameters;

/* loaded from: classes2.dex */
public class RC564Engine implements BlockCipher {
    private static final long P64 = -5196783011329398165L;
    private static final long Q64 = -7046029254386353131L;
    private static final int bytesPerWord = 8;
    private static final int wordSize = 64;
    private boolean forEncryption;
    private int _noRounds = 12;
    private long[] _S = null;

    private long bytesToWord(byte[] bArr, int i) {
        long j10 = 0;
        for (int i9 = 7; i9 >= 0; i9--) {
            j10 = (j10 << 8) + (bArr[i9 + i] & 255);
        }
        return j10;
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        long bytesToWord = bytesToWord(bArr, i);
        long bytesToWord2 = bytesToWord(bArr, i + 8);
        for (int i10 = this._noRounds; i10 >= 1; i10--) {
            int i11 = i10 * 2;
            bytesToWord2 = rotateRight(bytesToWord2 - this._S[i11 + 1], bytesToWord) ^ bytesToWord;
            bytesToWord = rotateRight(bytesToWord - this._S[i11], bytesToWord2) ^ bytesToWord2;
        }
        wordToBytes(bytesToWord - this._S[0], bArr2, i9);
        wordToBytes(bytesToWord2 - this._S[1], bArr2, i9 + 8);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        long bytesToWord = bytesToWord(bArr, i) + this._S[0];
        long bytesToWord2 = bytesToWord(bArr, i + 8) + this._S[1];
        for (int i10 = 1; i10 <= this._noRounds; i10++) {
            int i11 = i10 * 2;
            bytesToWord = rotateLeft(bytesToWord ^ bytesToWord2, bytesToWord2) + this._S[i11];
            bytesToWord2 = rotateLeft(bytesToWord2 ^ bytesToWord, bytesToWord) + this._S[i11 + 1];
        }
        wordToBytes(bytesToWord, bArr2, i9);
        wordToBytes(bytesToWord2, bArr2, i9 + 8);
        return 16;
    }

    private long rotateLeft(long j10, long j11) {
        long j12 = j11 & 63;
        return (j10 >>> ((int) (64 - j12))) | (j10 << ((int) j12));
    }

    private long rotateRight(long j10, long j11) {
        long j12 = j11 & 63;
        return (j10 << ((int) (64 - j12))) | (j10 >>> ((int) j12));
    }

    private void setKey(byte[] bArr) {
        long[] jArr;
        int length = (bArr.length + 7) / 8;
        long[] jArr2 = new long[length];
        for (int i = 0; i != bArr.length; i++) {
            int i9 = i / 8;
            jArr2[i9] = jArr2[i9] + ((bArr[i] & 255) << ((i % 8) * 8));
        }
        long[] jArr3 = new long[(this._noRounds + 1) * 2];
        this._S = jArr3;
        jArr3[0] = -5196783011329398165L;
        int i10 = 1;
        while (true) {
            jArr = this._S;
            if (i10 >= jArr.length) {
                break;
            }
            jArr[i10] = jArr[i10 - 1] + Q64;
            i10++;
        }
        int length2 = length > jArr.length ? length * 3 : jArr.length * 3;
        long j10 = 0;
        long j11 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length2; i13++) {
            long[] jArr4 = this._S;
            j10 = rotateLeft(jArr4[i11] + j10 + j11, 3L);
            jArr4[i11] = j10;
            j11 = rotateLeft(jArr2[i12] + j10 + j11, j11 + j10);
            jArr2[i12] = j11;
            i11 = (i11 + 1) % this._S.length;
            i12 = (i12 + 1) % length;
        }
    }

    private void wordToBytes(long j10, byte[] bArr, int i) {
        for (int i9 = 0; i9 < 8; i9++) {
            bArr[i9 + i] = (byte) j10;
            j10 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-64";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof RC5Parameters)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to RC564 init - ", cipherParameters));
        }
        RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
        this.forEncryption = z10;
        this._noRounds = rC5Parameters.getRounds();
        setKey(rC5Parameters.getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        return this.forEncryption ? encryptBlock(bArr, i, bArr2, i9) : decryptBlock(bArr, i, bArr2, i9);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
