package C;

import C.C0493i;

/* compiled from: AutoValue_FallbackStrategy_RuleStrategy.java */
/* renamed from: C.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487c extends C0493i.a {

    /* renamed from: b, reason: collision with root package name */
    public final o f540b;

    /* renamed from: c, reason: collision with root package name */
    public final int f541c;

    public C0487c(o oVar, int i) {
        if (oVar == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f540b = oVar;
        this.f541c = i;
    }

    @Override // C.C0493i.a
    public final o a() {
        return this.f540b;
    }

    @Override // C.C0493i.a
    public final int b() {
        return this.f541c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0493i.a)) {
            return false;
        }
        C0493i.a aVar = (C0493i.a) obj;
        return this.f540b.equals(aVar.a()) && this.f541c == aVar.b();
    }

    public final int hashCode() {
        return ((this.f540b.hashCode() ^ 1000003) * 1000003) ^ this.f541c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb2.append(this.f540b);
        sb2.append(", fallbackRule=");
        return s3.b.m(sb2, this.f541c, "}");
    }
}
