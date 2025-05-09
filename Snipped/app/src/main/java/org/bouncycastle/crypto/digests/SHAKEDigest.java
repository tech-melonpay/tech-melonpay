package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.Xof;
import s3.b;

/* loaded from: classes2.dex */
public class SHAKEDigest extends KeccakDigest implements Xof {
    public SHAKEDigest() {
        this(128);
    }

    private static int checkBitLength(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        throw new IllegalArgumentException(b.i("'bitLength' ", i, " not supported for SHAKE"));
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        return doFinal(bArr, i, getDigestSize());
    }

    public int doOutput(byte[] bArr, int i, int i9) {
        if (!this.squeezing) {
            absorbBits(15, 4);
        }
        squeeze(bArr, i, i9 * 8);
        return i9;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHAKE" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 4;
    }

    public SHAKEDigest(int i) {
        super(checkBitLength(i));
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest
    public int doFinal(byte[] bArr, int i, byte b9, int i9) {
        return doFinal(bArr, i, getDigestSize(), b9, i9);
    }

    public SHAKEDigest(SHAKEDigest sHAKEDigest) {
        super(sHAKEDigest);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i, int i9) {
        int doOutput = doOutput(bArr, i, i9);
        reset();
        return doOutput;
    }

    public int doFinal(byte[] bArr, int i, int i9, byte b9, int i10) {
        if (i10 < 0 || i10 > 7) {
            throw new IllegalArgumentException("'partialBits' must be in the range [0,7]");
        }
        int i11 = (b9 & ((1 << i10) - 1)) | (15 << i10);
        int i12 = i10 + 4;
        if (i12 >= 8) {
            absorb((byte) i11);
            i12 = i10 - 4;
            i11 >>>= 8;
        }
        if (i12 > 0) {
            absorbBits(i11, i12);
        }
        squeeze(bArr, i, i9 * 8);
        reset();
        return i9;
    }
}
