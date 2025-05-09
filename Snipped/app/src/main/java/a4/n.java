package a4;

/* compiled from: EditCompanyRequestRaw.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("company_name")
    private final String f4327a = null;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("company_number")
    private final String f4328b = null;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("company_type")
    private final String f4329c = null;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("other_company_type")
    private final String f4330d = null;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("tax_id_number")
    private final String f4331e = null;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("website")
    private final String f4332f = null;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("turnover")
    private final Long f4333g = null;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("country_operation")
    private final String f4334h = null;

    @l3.b("business_sector_type")
    private final String i = null;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("business_sector")
    private final String f4335j = null;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("company_house")
    private final String f4336k = null;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("company_street")
    private final String f4337l = null;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("company_city")
    private final String f4338m = null;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("company_region")
    private final String f4339n = null;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("country_registration")
    private final String f4340o = null;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("company_postcode")
    private final String f4341p = null;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("registration_date")
    private final Long f4342q = null;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("is_vat_registered")
    private final Boolean f4343r = null;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("vat_registered_over_3_months")
    private final Boolean f4344s = null;

    /* renamed from: t, reason: collision with root package name */
    @l3.b("vat_number")
    private final String f4345t = null;

    /* renamed from: u, reason: collision with root package name */
    @l3.b("employees_count")
    private final String f4346u = null;

    /* renamed from: v, reason: collision with root package name */
    @l3.b("company_source_of_funds")
    private final String f4347v = null;

    /* renamed from: w, reason: collision with root package name */
    @l3.b("company_other_source_of_funds")
    private final String f4348w = null;

    /* renamed from: x, reason: collision with root package name */
    @l3.b("company_source_of_wealth")
    private final String f4349x = null;

    /* renamed from: y, reason: collision with root package name */
    @l3.b("company_other_source_of_wealth")
    private final String f4350y = null;

    /* renamed from: z, reason: collision with root package name */
    @l3.b("company_amount_of_wealth")
    private final Double f4351z = null;

    /* renamed from: A, reason: collision with root package name */
    @l3.b("company_domiciliary")
    private final Boolean f4326A = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.f.b(this.f4327a, nVar.f4327a) && kotlin.jvm.internal.f.b(this.f4328b, nVar.f4328b) && kotlin.jvm.internal.f.b(this.f4329c, nVar.f4329c) && kotlin.jvm.internal.f.b(this.f4330d, nVar.f4330d) && kotlin.jvm.internal.f.b(this.f4331e, nVar.f4331e) && kotlin.jvm.internal.f.b(this.f4332f, nVar.f4332f) && kotlin.jvm.internal.f.b(this.f4333g, nVar.f4333g) && kotlin.jvm.internal.f.b(this.f4334h, nVar.f4334h) && kotlin.jvm.internal.f.b(this.i, nVar.i) && kotlin.jvm.internal.f.b(this.f4335j, nVar.f4335j) && kotlin.jvm.internal.f.b(this.f4336k, nVar.f4336k) && kotlin.jvm.internal.f.b(this.f4337l, nVar.f4337l) && kotlin.jvm.internal.f.b(this.f4338m, nVar.f4338m) && kotlin.jvm.internal.f.b(this.f4339n, nVar.f4339n) && kotlin.jvm.internal.f.b(this.f4340o, nVar.f4340o) && kotlin.jvm.internal.f.b(this.f4341p, nVar.f4341p) && kotlin.jvm.internal.f.b(this.f4342q, nVar.f4342q) && kotlin.jvm.internal.f.b(this.f4343r, nVar.f4343r) && kotlin.jvm.internal.f.b(this.f4344s, nVar.f4344s) && kotlin.jvm.internal.f.b(this.f4345t, nVar.f4345t) && kotlin.jvm.internal.f.b(this.f4346u, nVar.f4346u) && kotlin.jvm.internal.f.b(this.f4347v, nVar.f4347v) && kotlin.jvm.internal.f.b(this.f4348w, nVar.f4348w) && kotlin.jvm.internal.f.b(this.f4349x, nVar.f4349x) && kotlin.jvm.internal.f.b(this.f4350y, nVar.f4350y) && kotlin.jvm.internal.f.b(this.f4351z, nVar.f4351z) && kotlin.jvm.internal.f.b(this.f4326A, nVar.f4326A);
    }

    public final int hashCode() {
        int c2 = C.v.c(C.v.c(this.f4327a.hashCode() * 31, 31, this.f4328b), 31, this.f4329c);
        String str = this.f4330d;
        int c10 = C.v.c((c2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f4331e);
        String str2 = this.f4332f;
        int hashCode = (c10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f4333g;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str3 = this.f4334h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f4335j;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f4336k;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f4337l;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f4338m;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f4339n;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f4340o;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f4341p;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l11 = this.f4342q;
        int hashCode12 = (hashCode11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.f4343r;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f4344s;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str12 = this.f4345t;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f4346u;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f4347v;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f4348w;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f4349x;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f4350y;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Double d10 = this.f4351z;
        int hashCode21 = (hashCode20 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Boolean bool3 = this.f4326A;
        return hashCode21 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f4327a;
        String str2 = this.f4328b;
        String str3 = this.f4329c;
        String str4 = this.f4330d;
        String str5 = this.f4331e;
        String str6 = this.f4332f;
        Long l10 = this.f4333g;
        String str7 = this.f4334h;
        String str8 = this.i;
        String str9 = this.f4335j;
        String str10 = this.f4336k;
        String str11 = this.f4337l;
        String str12 = this.f4338m;
        String str13 = this.f4339n;
        String str14 = this.f4340o;
        String str15 = this.f4341p;
        Long l11 = this.f4342q;
        Boolean bool = this.f4343r;
        Boolean bool2 = this.f4344s;
        String str16 = this.f4345t;
        String str17 = this.f4346u;
        String str18 = this.f4347v;
        String str19 = this.f4348w;
        String str20 = this.f4349x;
        String str21 = this.f4350y;
        Double d10 = this.f4351z;
        Boolean bool3 = this.f4326A;
        StringBuilder p10 = s3.b.p("EditCompanyRequestRaw(companyName=", str, ", companyNumber=", str2, ", companyType=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", otherCompanyType=", str4, ", taxIdNumber=");
        androidx.camera.core.impl.utils.a.u(p10, str5, ", website=", str6, ", turnover=");
        p10.append(l10);
        p10.append(", countryOperation=");
        p10.append(str7);
        p10.append(", businessSectorType=");
        androidx.camera.core.impl.utils.a.u(p10, str8, ", businessSector=", str9, ", companyHouse=");
        androidx.camera.core.impl.utils.a.u(p10, str10, ", companyStreet=", str11, ", companyCity=");
        androidx.camera.core.impl.utils.a.u(p10, str12, ", companyRegion=", str13, ", countryRegistration=");
        androidx.camera.core.impl.utils.a.u(p10, str14, ", companyPostcode=", str15, ", registrationDate=");
        p10.append(l11);
        p10.append(", vatRegistered=");
        p10.append(bool);
        p10.append(", vatRegisteredOver3Months=");
        p10.append(bool2);
        p10.append(", vatNumber=");
        p10.append(str16);
        p10.append(", employeesCount=");
        androidx.camera.core.impl.utils.a.u(p10, str17, ", sourceOfFunds=", str18, ", otherSourceOfFunds=");
        androidx.camera.core.impl.utils.a.u(p10, str19, ", companySourceOfWealth=", str20, ", companyOtherSourceOfWealth=");
        p10.append(str21);
        p10.append(", amount=");
        p10.append(d10);
        p10.append(", companyDomiciliary=");
        p10.append(bool3);
        p10.append(")");
        return p10.toString();
    }
}
