package a4;

/* compiled from: AdditionalInformationRequestRaw.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("turnover")
    private final long f4294a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("country_operation")
    private final String f4295b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("registration_date")
    private final long f4296c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("vat_number")
    private final String f4297d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("is_vat_registered")
    private final boolean f4298e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("vat_registered_over_3_months")
    private final Boolean f4299f;

    public e(long j10, String str, long j11, String str2, boolean z10, Boolean bool) {
        this.f4294a = j10;
        this.f4295b = str;
        this.f4296c = j11;
        this.f4297d = str2;
        this.f4298e = z10;
        this.f4299f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4294a == eVar.f4294a && kotlin.jvm.internal.f.b(this.f4295b, eVar.f4295b) && this.f4296c == eVar.f4296c && kotlin.jvm.internal.f.b(this.f4297d, eVar.f4297d) && this.f4298e == eVar.f4298e && kotlin.jvm.internal.f.b(this.f4299f, eVar.f4299f);
    }

    public final int hashCode() {
        int e10 = C.v.e(this.f4296c, C.v.c(Long.hashCode(this.f4294a) * 31, 31, this.f4295b), 31);
        String str = this.f4297d;
        int d10 = C.v.d((e10 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f4298e);
        Boolean bool = this.f4299f;
        return d10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AdditionalInformationRequestRaw(turnover=" + this.f4294a + ", countryOperation=" + this.f4295b + ", registrationDate=" + this.f4296c + ", vat_number=" + this.f4297d + ", vatRegistered=" + this.f4298e + ", vatRegisteredOver3Months=" + this.f4299f + ")";
    }
}
