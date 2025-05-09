package J;

/* compiled from: AutoValue_VideoEncoderDataSpace.java */
/* loaded from: classes.dex */
public final class e extends w {

    /* renamed from: e, reason: collision with root package name */
    public final int f2050e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2051f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2052g;

    public e(int i, int i9, int i10) {
        this.f2050e = i;
        this.f2051f = i9;
        this.f2052g = i10;
    }

    @Override // J.w
    public final int a() {
        return this.f2052g;
    }

    @Override // J.w
    public final int b() {
        return this.f2050e;
    }

    @Override // J.w
    public final int c() {
        return this.f2051f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f2050e == wVar.b() && this.f2051f == wVar.c() && this.f2052g == wVar.a();
    }

    public final int hashCode() {
        return ((((this.f2050e ^ 1000003) * 1000003) ^ this.f2051f) * 1000003) ^ this.f2052g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb2.append(this.f2050e);
        sb2.append(", transfer=");
        sb2.append(this.f2051f);
        sb2.append(", range=");
        return s3.b.m(sb2, this.f2052g, "}");
    }
}
