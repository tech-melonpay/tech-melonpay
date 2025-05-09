package a4;

import java.util.List;

/* compiled from: IndividualsQuestioanaireRequestRaw.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("country_tax_residence")
    private final String f4357a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("turnover")
    private final String f4358b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("country_birth")
    private final String f4359c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("country_citizenship")
    private final String f4360d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("acc_can_business")
    private final Boolean f4361e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("income_source")
    private final String f4362f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("is_pep")
    private final Boolean f4363g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("is_us")
    private final Boolean f4364h;

    @l3.b("occupation")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("acc_balance_average")
    private final Float f4365j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("tax_id_number")
    private final String f4366k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("additional_income_sources")
    private final String f4367l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("country_citizenship_additional")
    private final List<String> f4368m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("individual_source_of_wealth")
    private final String f4369n;

    public q(String str, String str2, String str3, String str4, Boolean bool, String str5, Boolean bool2, Boolean bool3, String str6, Float f10, String str7, String str8, List<String> list, String str9) {
        this.f4357a = str;
        this.f4358b = str2;
        this.f4359c = str3;
        this.f4360d = str4;
        this.f4361e = bool;
        this.f4362f = str5;
        this.f4363g = bool2;
        this.f4364h = bool3;
        this.i = str6;
        this.f4365j = f10;
        this.f4366k = str7;
        this.f4367l = str8;
        this.f4368m = list;
        this.f4369n = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.f.b(this.f4357a, qVar.f4357a) && kotlin.jvm.internal.f.b(this.f4358b, qVar.f4358b) && kotlin.jvm.internal.f.b(this.f4359c, qVar.f4359c) && kotlin.jvm.internal.f.b(this.f4360d, qVar.f4360d) && kotlin.jvm.internal.f.b(this.f4361e, qVar.f4361e) && kotlin.jvm.internal.f.b(this.f4362f, qVar.f4362f) && kotlin.jvm.internal.f.b(this.f4363g, qVar.f4363g) && kotlin.jvm.internal.f.b(this.f4364h, qVar.f4364h) && kotlin.jvm.internal.f.b(this.i, qVar.i) && kotlin.jvm.internal.f.b(this.f4365j, qVar.f4365j) && kotlin.jvm.internal.f.b(this.f4366k, qVar.f4366k) && kotlin.jvm.internal.f.b(this.f4367l, qVar.f4367l) && kotlin.jvm.internal.f.b(this.f4368m, qVar.f4368m) && kotlin.jvm.internal.f.b(this.f4369n, qVar.f4369n);
    }

    public final int hashCode() {
        String str = this.f4357a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f4358b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4359c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f4360d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f4361e;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.f4362f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f4363g;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f4364h;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str6 = this.i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f10 = this.f4365j;
        int hashCode10 = (hashCode9 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str7 = this.f4366k;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f4367l;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<String> list = this.f4368m;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.f4369n;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f4357a;
        String str2 = this.f4358b;
        String str3 = this.f4359c;
        String str4 = this.f4360d;
        Boolean bool = this.f4361e;
        String str5 = this.f4362f;
        Boolean bool2 = this.f4363g;
        Boolean bool3 = this.f4364h;
        String str6 = this.i;
        Float f10 = this.f4365j;
        String str7 = this.f4366k;
        String str8 = this.f4367l;
        List<String> list = this.f4368m;
        String str9 = this.f4369n;
        StringBuilder p10 = s3.b.p("IndividualsQuestioanaireRequestRaw(countryTaxResidence=", str, ", turnover=", str2, ", countryBirth=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", countryCitizenship=", str4, ", accCanBusiness=");
        p10.append(bool);
        p10.append(", incomeSource=");
        p10.append(str5);
        p10.append(", isPep=");
        p10.append(bool2);
        p10.append(", isUs=");
        p10.append(bool3);
        p10.append(", occupdation=");
        p10.append(str6);
        p10.append(", accBalanceAverage=");
        p10.append(f10);
        p10.append(", taxCode=");
        androidx.camera.core.impl.utils.a.u(p10, str7, ", additionalIncomeSources=", str8, ", countryCitizenshipAdditional=");
        p10.append(list);
        p10.append(", sourceOfWealth=");
        p10.append(str9);
        p10.append(")");
        return p10.toString();
    }
}
