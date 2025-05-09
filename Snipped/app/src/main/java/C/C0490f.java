package C;

import C.q;

/* compiled from: AutoValue_QualityRatioToResolutionsTable_QualityRatio.java */
/* renamed from: C.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490f extends q.a {

    /* renamed from: a, reason: collision with root package name */
    public final o f550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f551b;

    public C0490f(o oVar, int i) {
        if (oVar == null) {
            throw new NullPointerException("Null quality");
        }
        this.f550a = oVar;
        this.f551b = i;
    }

    @Override // C.q.a
    public final int a() {
        return this.f551b;
    }

    @Override // C.q.a
    public final o b() {
        return this.f550a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.a)) {
            return false;
        }
        q.a aVar = (q.a) obj;
        return this.f550a.equals(aVar.b()) && this.f551b == aVar.a();
    }

    public final int hashCode() {
        return ((this.f550a.hashCode() ^ 1000003) * 1000003) ^ this.f551b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QualityRatio{quality=");
        sb2.append(this.f550a);
        sb2.append(", aspectRatio=");
        return s3.b.m(sb2, this.f551b, "}");
    }
}
