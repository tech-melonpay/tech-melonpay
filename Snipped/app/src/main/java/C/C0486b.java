package C;

/* compiled from: AutoValue_AudioStats.java */
/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486b extends AbstractC0485a {

    /* renamed from: b, reason: collision with root package name */
    public final int f537b;

    /* renamed from: c, reason: collision with root package name */
    public final double f538c;

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f539d;

    public C0486b(int i, double d10, Throwable th) {
        this.f537b = i;
        this.f538c = d10;
        this.f539d = th;
    }

    @Override // C.AbstractC0485a
    public final double a() {
        return this.f538c;
    }

    @Override // C.AbstractC0485a
    public final int b() {
        return this.f537b;
    }

    @Override // C.AbstractC0485a
    public final Throwable c() {
        return this.f539d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0485a)) {
            return false;
        }
        AbstractC0485a abstractC0485a = (AbstractC0485a) obj;
        if (this.f537b == abstractC0485a.b() && Double.doubleToLongBits(this.f538c) == Double.doubleToLongBits(abstractC0485a.a())) {
            Throwable th = this.f539d;
            if (th == null) {
                if (abstractC0485a.c() == null) {
                    return true;
                }
            } else if (th.equals(abstractC0485a.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f537b ^ 1000003) * 1000003;
        double d10 = this.f538c;
        int doubleToLongBits = (i ^ ((int) (Double.doubleToLongBits(d10) ^ (Double.doubleToLongBits(d10) >>> 32)))) * 1000003;
        Throwable th = this.f539d;
        return doubleToLongBits ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.f537b + ", audioAmplitudeInternal=" + this.f538c + ", errorCause=" + this.f539d + "}";
    }
}
