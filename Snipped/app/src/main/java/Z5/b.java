package z5;

import kotlin.jvm.internal.f;

/* compiled from: LimitValueDomain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Double f31283a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f31284b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f31285c;

    public b(Double d10, Double d11, Double d12) {
        this.f31283a = d10;
        this.f31284b = d11;
        this.f31285c = d12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f31283a, bVar.f31283a) && f.b(this.f31284b, bVar.f31284b) && f.b(this.f31285c, bVar.f31285c);
    }

    public final int hashCode() {
        Double d10 = this.f31283a;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f31284b;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f31285c;
        return hashCode2 + (d12 != null ? d12.hashCode() : 0);
    }

    public final String toString() {
        return "LimitValueDomain(total=" + this.f31283a + ", used=" + this.f31284b + ", available=" + this.f31285c + ")";
    }
}
