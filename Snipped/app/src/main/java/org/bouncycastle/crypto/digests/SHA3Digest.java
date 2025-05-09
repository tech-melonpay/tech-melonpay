package org.bouncycastle.crypto.digests;

import s3.b;

/* loaded from: classes2.dex */
public class SHA3Digest extends KeccakDigest {
    public SHA3Digest() {
        this(256);
    }

    private static int checkBitLength(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return i;
        }
        throw new IllegalArgumentException(b.i("'bitLength' ", i, " not supported for SHA-3"));
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        absorbBits(2, 2);
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA3-" + this.fixedOutputLength;
    }

    public SHA3Digest(int i) {
        super(checkBitLength(i));
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i, byte b9, int i9) {
        if (i9 < 0 || i9 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i10 = (b9 & ((1 << i9) - 1)) | (2 << i9);
        int i11 = i9 + 2;
        if (i11 >= 8) {
            absorb((byte) i10);
            i11 = i9 - 6;
            i10 >>>= 8;
        }
        return super.doFinal(bArr, i, (byte) i10, i11);
    }

    public SHA3Digest(SHA3Digest sHA3Digest) {
        super(sHA3Digest);
    }
}
