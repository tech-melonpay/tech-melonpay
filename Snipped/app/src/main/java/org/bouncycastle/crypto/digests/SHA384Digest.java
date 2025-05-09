package org.bouncycastle.crypto.digests;

import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class SHA384Digest extends LongDigest {
    private static final int DIGEST_LENGTH = 48;

    public SHA384Digest() {
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA384Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.longToBigEndian(this.f24835H1, bArr, i);
        Pack.longToBigEndian(this.f24836H2, bArr, i + 8);
        Pack.longToBigEndian(this.f24837H3, bArr, i + 16);
        Pack.longToBigEndian(this.f24838H4, bArr, i + 24);
        Pack.longToBigEndian(this.f24839H5, bArr, i + 32);
        Pack.longToBigEndian(this.f24840H6, bArr, i + 40);
        reset();
        return 48;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA384;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 48;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        byte[] bArr = new byte[getEncodedStateSize()];
        super.populateState(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.LongDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.f24835H1 = -3766243637369397544L;
        this.f24836H2 = 7105036623409894663L;
        this.f24837H3 = -7973340178411365097L;
        this.f24838H4 = 1526699215303891257L;
        this.f24839H5 = 7436329637833083697L;
        this.f24840H6 = -8163818279084223215L;
        this.f24841H7 = -2662702644619276377L;
        this.f24842H8 = 5167115440072839076L;
    }

    public SHA384Digest(SHA384Digest sHA384Digest) {
        super(sHA384Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        super.copyIn((SHA384Digest) memoable);
    }

    public SHA384Digest(byte[] bArr) {
        restoreState(bArr);
    }
}
