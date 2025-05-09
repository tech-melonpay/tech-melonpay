package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes3.dex */
class SeedDerive {

    /* renamed from: I, reason: collision with root package name */
    private final byte[] f25401I;
    private final Digest digest;

    /* renamed from: j, reason: collision with root package name */
    private int f25402j;
    private final byte[] masterSeed;

    /* renamed from: q, reason: collision with root package name */
    private int f25403q;

    public SeedDerive(byte[] bArr, byte[] bArr2, Digest digest) {
        this.f25401I = bArr;
        this.masterSeed = bArr2;
        this.digest = digest;
    }

    public void deriveSeed(byte[] bArr, boolean z10) {
        deriveSeed(bArr, z10, 0);
    }

    public byte[] getI() {
        return this.f25401I;
    }

    public int getJ() {
        return this.f25402j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f25403q;
    }

    public void setJ(int i) {
        this.f25402j = i;
    }

    public void setQ(int i) {
        this.f25403q = i;
    }

    public void deriveSeed(byte[] bArr, boolean z10, int i) {
        deriveSeed(bArr, i);
        if (z10) {
            this.f25402j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i) {
        if (bArr.length < this.digest.getDigestSize()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        Digest digest = this.digest;
        byte[] bArr2 = this.f25401I;
        digest.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (this.f25403q >>> 24));
        this.digest.update((byte) (this.f25403q >>> 16));
        this.digest.update((byte) (this.f25403q >>> 8));
        this.digest.update((byte) this.f25403q);
        this.digest.update((byte) (this.f25402j >>> 8));
        this.digest.update((byte) this.f25402j);
        this.digest.update((byte) -1);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.masterSeed;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, i);
        return bArr;
    }
}
