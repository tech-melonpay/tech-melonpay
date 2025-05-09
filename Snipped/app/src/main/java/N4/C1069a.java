package n4;

import kotlin.jvm.internal.f;

/* compiled from: LimitValueRaw.kt */
/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1069a {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("total")
    private Double f24217a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("used")
    private Double f24218b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("available")
    private Double f24219c;

    public final Double a() {
        return this.f24219c;
    }

    public final Double b() {
        return this.f24217a;
    }

    public final Double c() {
        return this.f24218b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1069a)) {
            return false;
        }
        C1069a c1069a = (C1069a) obj;
        return f.b(this.f24217a, c1069a.f24217a) && f.b(this.f24218b, c1069a.f24218b) && f.b(this.f24219c, c1069a.f24219c);
    }

    public final int hashCode() {
        Double d10 = this.f24217a;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f24218b;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f24219c;
        return hashCode2 + (d12 != null ? d12.hashCode() : 0);
    }

    public final String toString() {
        return "LimitValueRaw(total=" + this.f24217a + ", used=" + this.f24218b + ", available=" + this.f24219c + ")";
    }
}
