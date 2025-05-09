package x1;

/* compiled from: NetworkState.java */
/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1581b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30908a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30909b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30910c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30911d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1581b)) {
            return false;
        }
        C1581b c1581b = (C1581b) obj;
        return this.f30908a == c1581b.f30908a && this.f30909b == c1581b.f30909b && this.f30910c == c1581b.f30910c && this.f30911d == c1581b.f30911d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z10 = this.f30909b;
        ?? r12 = this.f30908a;
        int i = r12;
        if (z10) {
            i = r12 + 16;
        }
        int i9 = i;
        if (this.f30910c) {
            i9 = i + 256;
        }
        return this.f30911d ? i9 + 4096 : i9;
    }

    public final String toString() {
        return "[ Connected=" + this.f30908a + " Validated=" + this.f30909b + " Metered=" + this.f30910c + " NotRoaming=" + this.f30911d + " ]";
    }
}
