package h4;

import C.v;
import e4.C0715a;

/* compiled from: TopUpCommissionRaw.kt */
/* loaded from: classes.dex */
public final class n extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("commission_amount")
    private final double f21137b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("commission_currency")
    private final String f21138c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("type")
    private final String f21139d;

    public final String b() {
        return this.f21138c;
    }

    public final double c() {
        return this.f21137b;
    }

    public final String d() {
        return this.f21139d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Double.compare(this.f21137b, nVar.f21137b) == 0 && kotlin.jvm.internal.f.b(this.f21138c, nVar.f21138c) && kotlin.jvm.internal.f.b(this.f21139d, nVar.f21139d);
    }

    public final int hashCode() {
        return this.f21139d.hashCode() + v.c(Double.hashCode(this.f21137b) * 31, 31, this.f21138c);
    }

    public final String toString() {
        double d10 = this.f21137b;
        String str = this.f21138c;
        String str2 = this.f21139d;
        StringBuilder sb2 = new StringBuilder("TopUpCommissionRaw(commissionAmount=");
        sb2.append(d10);
        sb2.append(", commisionCurrency=");
        sb2.append(str);
        return s3.b.n(sb2, ", type=", str2, ")");
    }
}
