package org.bouncycastle.crypto.params;

/* loaded from: classes2.dex */
public class GOST3410ValidationParameters {

    /* renamed from: c, reason: collision with root package name */
    private int f25107c;
    private long cL;

    /* renamed from: x0, reason: collision with root package name */
    private int f25108x0;
    private long x0L;

    public GOST3410ValidationParameters(int i, int i9) {
        this.f25108x0 = i;
        this.f25107c = i9;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f25107c == this.f25107c && gOST3410ValidationParameters.f25108x0 == this.f25108x0 && gOST3410ValidationParameters.cL == this.cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f25107c;
    }

    public long getCL() {
        return this.cL;
    }

    public int getX0() {
        return this.f25108x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i = this.f25108x0 ^ this.f25107c;
        long j10 = this.x0L;
        int i9 = (i ^ ((int) j10)) ^ ((int) (j10 >> 32));
        long j11 = this.cL;
        return (i9 ^ ((int) j11)) ^ ((int) (j11 >> 32));
    }

    public GOST3410ValidationParameters(long j10, long j11) {
        this.x0L = j10;
        this.cL = j11;
    }
}
