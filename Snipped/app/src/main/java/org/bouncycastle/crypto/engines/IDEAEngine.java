package org.bouncycastle.crypto.engines;

import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes2.dex */
public class IDEAEngine implements BlockCipher {
    private static final int BASE = 65537;
    protected static final int BLOCK_SIZE = 8;
    private static final int MASK = 65535;
    private int[] workingKey = null;

    private int bytesToWord(byte[] bArr, int i) {
        return ((bArr[i] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) + (bArr[i + 1] & 255);
    }

    private int[] expandKey(byte[] bArr) {
        int i;
        int[] iArr = new int[52];
        int i9 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i9 >= 8) {
                break;
            }
            iArr[i9] = bytesToWord(bArr, i9 * 2);
            i9++;
        }
        for (i = 8; i < 52; i++) {
            int i10 = i & 7;
            if (i10 < 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 6] >> 7)) & 65535;
            } else if (i10 == 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            } else {
                iArr[i] = (((iArr[i - 15] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    private int[] generateWorkingKey(boolean z10, byte[] bArr) {
        return z10 ? expandKey(bArr) : invertKey(expandKey(bArr));
    }

    private void ideaFunc(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i9) {
        int bytesToWord = bytesToWord(bArr, i);
        int bytesToWord2 = bytesToWord(bArr, i + 2);
        int bytesToWord3 = bytesToWord(bArr, i + 4);
        int bytesToWord4 = bytesToWord(bArr, i + 6);
        int i10 = 0;
        int i11 = bytesToWord3;
        int i12 = bytesToWord2;
        int i13 = bytesToWord;
        int i14 = 0;
        while (i10 < 8) {
            int mul = mul(i13, iArr[i14]);
            int i15 = (i12 + iArr[i14 + 1]) & 65535;
            int i16 = (i11 + iArr[i14 + 2]) & 65535;
            int mul2 = mul(bytesToWord4, iArr[i14 + 3]);
            int i17 = i14 + 5;
            int mul3 = mul(i16 ^ mul, iArr[i14 + 4]);
            i14 += 6;
            int mul4 = mul(((i15 ^ mul2) + mul3) & 65535, iArr[i17]);
            int i18 = 65535 & (mul3 + mul4);
            i13 = mul ^ mul4;
            bytesToWord4 = mul2 ^ i18;
            int i19 = i16 ^ mul4;
            i10++;
            i11 = i15 ^ i18;
            i12 = i19;
        }
        wordToBytes(mul(i13, iArr[i14]), bArr2, i9);
        wordToBytes(i11 + iArr[i14 + 1], bArr2, i9 + 2);
        wordToBytes(i12 + iArr[i14 + 2], bArr2, i9 + 4);
        wordToBytes(mul(bytesToWord4, iArr[i14 + 3]), bArr2, i9 + 6);
    }

    private int[] invertKey(int[] iArr) {
        int[] iArr2 = new int[52];
        int mulInv = mulInv(iArr[0]);
        int addInv = addInv(iArr[1]);
        int addInv2 = addInv(iArr[2]);
        iArr2[51] = mulInv(iArr[3]);
        iArr2[50] = addInv2;
        iArr2[49] = addInv;
        int i = 48;
        iArr2[48] = mulInv;
        int i9 = 4;
        for (int i10 = 1; i10 < 8; i10++) {
            int i11 = iArr[i9];
            iArr2[i - 1] = iArr[i9 + 1];
            iArr2[i - 2] = i11;
            int mulInv2 = mulInv(iArr[i9 + 2]);
            int addInv3 = addInv(iArr[i9 + 3]);
            int i12 = i9 + 5;
            int addInv4 = addInv(iArr[i9 + 4]);
            i9 += 6;
            iArr2[i - 3] = mulInv(iArr[i12]);
            iArr2[i - 4] = addInv3;
            iArr2[i - 5] = addInv4;
            i -= 6;
            iArr2[i] = mulInv2;
        }
        int i13 = iArr[i9];
        iArr2[i - 1] = iArr[i9 + 1];
        iArr2[i - 2] = i13;
        int mulInv3 = mulInv(iArr[i9 + 2]);
        int addInv5 = addInv(iArr[i9 + 3]);
        int addInv6 = addInv(iArr[i9 + 4]);
        iArr2[i - 3] = mulInv(iArr[i9 + 5]);
        iArr2[i - 4] = addInv6;
        iArr2[i - 5] = addInv5;
        iArr2[i - 6] = mulInv3;
        return iArr2;
    }

    private int mul(int i, int i9) {
        int i10;
        if (i == 0) {
            i10 = BASE - i9;
        } else if (i9 == 0) {
            i10 = BASE - i;
        } else {
            int i11 = i * i9;
            int i12 = i11 & 65535;
            int i13 = i11 >>> 16;
            i10 = (i12 - i13) + (i12 < i13 ? 1 : 0);
        }
        return i10 & 65535;
    }

    private int mulInv(int i) {
        if (i < 2) {
            return i;
        }
        int i9 = BASE / i;
        int i10 = BASE % i;
        int i11 = 1;
        while (i10 != 1) {
            int i12 = i / i10;
            i %= i10;
            i11 = ((i12 * i9) + i11) & 65535;
            if (i == 1) {
                return i11;
            }
            int i13 = i10 / i;
            i10 %= i;
            i9 = ((i13 * i11) + i9) & 65535;
        }
        return (1 - i9) & 65535;
    }

    private void wordToBytes(int i, byte[] bArr, int i9) {
        bArr[i9] = (byte) (i >>> 8);
        bArr[i9 + 1] = (byte) i;
    }

    public int addInv(int i) {
        return (0 - i) & 65535;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "IDEA";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to IDEA init - ", cipherParameters));
        }
        this.workingKey = generateWorkingKey(z10, ((KeyParameter) cipherParameters).getKey());
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i9) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i9 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        ideaFunc(iArr, bArr, i, bArr2, i9);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
