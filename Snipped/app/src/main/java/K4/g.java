package k4;

import e4.C0715a;

/* compiled from: PreviewRaw.kt */
/* loaded from: classes.dex */
public final class g extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("source_currency")
    private final String f23004b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("destination_currency")
    private final String f23005c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("direction")
    private final String f23006d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("source_amount")
    private final Double f23007e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("destination_amount")
    private final Double f23008f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("comission_amount")
    private final Double f23009g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("comission_currency")
    private final String f23010h;

    @l3.b("commision_type")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("commission_display_amount")
    private final Double f23011j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("rate")
    private final Double f23012k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("min_source_amount")
    private final Double f23013l;

    public final Double b() {
        return this.f23009g;
    }

    public final String c() {
        return this.f23010h;
    }

    public final Double d() {
        return this.f23011j;
    }

    public final String e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f23004b, gVar.f23004b) && kotlin.jvm.internal.f.b(this.f23005c, gVar.f23005c) && kotlin.jvm.internal.f.b(this.f23006d, gVar.f23006d) && kotlin.jvm.internal.f.b(this.f23007e, gVar.f23007e) && kotlin.jvm.internal.f.b(this.f23008f, gVar.f23008f) && kotlin.jvm.internal.f.b(this.f23009g, gVar.f23009g) && kotlin.jvm.internal.f.b(this.f23010h, gVar.f23010h) && kotlin.jvm.internal.f.b(this.i, gVar.i) && kotlin.jvm.internal.f.b(this.f23011j, gVar.f23011j) && kotlin.jvm.internal.f.b(this.f23012k, gVar.f23012k) && kotlin.jvm.internal.f.b(this.f23013l, gVar.f23013l);
    }

    public final Double f() {
        return this.f23008f;
    }

    public final String g() {
        return this.f23005c;
    }

    public final String h() {
        return this.f23006d;
    }

    public final int hashCode() {
        String str = this.f23004b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f23005c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23006d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d10 = this.f23007e;
        int hashCode4 = (hashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f23008f;
        int hashCode5 = (hashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f23009g;
        int hashCode6 = (hashCode5 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str4 = this.f23010h;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d13 = this.f23011j;
        int hashCode9 = (hashCode8 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f23012k;
        int hashCode10 = (hashCode9 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f23013l;
        return hashCode10 + (d15 != null ? d15.hashCode() : 0);
    }

    public final Double i() {
        return this.f23013l;
    }

    public final Double j() {
        return this.f23012k;
    }

    public final Double k() {
        return this.f23007e;
    }

    public final String l() {
        return this.f23004b;
    }

    public final String toString() {
        String str = this.f23004b;
        String str2 = this.f23005c;
        String str3 = this.f23006d;
        Double d10 = this.f23007e;
        Double d11 = this.f23008f;
        Double d12 = this.f23009g;
        String str4 = this.f23010h;
        String str5 = this.i;
        Double d13 = this.f23011j;
        Double d14 = this.f23012k;
        Double d15 = this.f23013l;
        StringBuilder p10 = s3.b.p("PreviewRaw(sourceCurrency=", str, ", destinationCurrency=", str2, ", direction=");
        p10.append(str3);
        p10.append(", sourceAmount=");
        p10.append(d10);
        p10.append(", destinationAmount=");
        com.google.android.gms.measurement.internal.a.r(p10, d11, ", comissionAmount=", d12, ", comissionCurrency=");
        androidx.camera.core.impl.utils.a.u(p10, str4, ", comissionType=", str5, ", comissionDisplayAmount=");
        com.google.android.gms.measurement.internal.a.r(p10, d13, ", rate=", d14, ", minSourceAmount=");
        p10.append(d15);
        p10.append(")");
        return p10.toString();
    }
}
