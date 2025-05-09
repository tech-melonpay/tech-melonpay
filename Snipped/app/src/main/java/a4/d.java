package a4;

import java.util.List;

/* compiled from: AddUBORequestRaw.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("beneficial_owner_info")
    private final a f4279a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("positions")
    private final List<String> f4280b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("beneficiary_type")
    private final String f4281c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("shares_amount")
    private final String f4282d;

    /* compiled from: AddUBORequestRaw.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("email")
        private final String f4283a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("first_name")
        private final String f4284b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("last_name")
        private final String f4285c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("company_name")
        private final String f4286d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("company_number")
        private final String f4287e;

        /* renamed from: f, reason: collision with root package name */
        @l3.b("country_operation")
        private final String f4288f;

        /* renamed from: g, reason: collision with root package name */
        @l3.b("country_citizenship")
        private final String f4289g;

        /* renamed from: h, reason: collision with root package name */
        @l3.b("country")
        private final String f4290h;

        @l3.b("is_pep")
        private final Boolean i;

        /* renamed from: j, reason: collision with root package name */
        @l3.b("is_us")
        private final Boolean f4291j;

        /* renamed from: k, reason: collision with root package name */
        @l3.b("individual_source_of_wealth")
        private final String f4292k;

        /* renamed from: l, reason: collision with root package name */
        @l3.b("link_to_cv_linkedin")
        private final String f4293l;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, String str10) {
            this.f4283a = str;
            this.f4284b = str2;
            this.f4285c = str3;
            this.f4286d = str4;
            this.f4287e = str5;
            this.f4288f = str6;
            this.f4289g = str7;
            this.f4290h = str8;
            this.i = bool;
            this.f4291j = bool2;
            this.f4292k = str9;
            this.f4293l = str10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f4283a, aVar.f4283a) && kotlin.jvm.internal.f.b(this.f4284b, aVar.f4284b) && kotlin.jvm.internal.f.b(this.f4285c, aVar.f4285c) && kotlin.jvm.internal.f.b(this.f4286d, aVar.f4286d) && kotlin.jvm.internal.f.b(this.f4287e, aVar.f4287e) && kotlin.jvm.internal.f.b(this.f4288f, aVar.f4288f) && kotlin.jvm.internal.f.b(this.f4289g, aVar.f4289g) && kotlin.jvm.internal.f.b(this.f4290h, aVar.f4290h) && kotlin.jvm.internal.f.b(this.i, aVar.i) && kotlin.jvm.internal.f.b(this.f4291j, aVar.f4291j) && kotlin.jvm.internal.f.b(this.f4292k, aVar.f4292k) && kotlin.jvm.internal.f.b(this.f4293l, aVar.f4293l);
        }

        public final int hashCode() {
            String str = this.f4283a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f4284b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f4285c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f4286d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f4287e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f4288f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f4289g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f4290h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Boolean bool = this.i;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f4291j;
            int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str9 = this.f4292k;
            int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f4293l;
            return hashCode11 + (str10 != null ? str10.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f4283a;
            String str2 = this.f4284b;
            String str3 = this.f4285c;
            String str4 = this.f4286d;
            String str5 = this.f4287e;
            String str6 = this.f4288f;
            String str7 = this.f4289g;
            String str8 = this.f4290h;
            Boolean bool = this.i;
            Boolean bool2 = this.f4291j;
            String str9 = this.f4292k;
            String str10 = this.f4293l;
            StringBuilder p10 = s3.b.p("BeneficialOwnerInfoRaw(email=", str, ", firstName=", str2, ", lastName=");
            androidx.camera.core.impl.utils.a.u(p10, str3, ", companyName=", str4, ", companyNumber=");
            androidx.camera.core.impl.utils.a.u(p10, str5, ", countryOperation=", str6, ", countryCitizenship=");
            androidx.camera.core.impl.utils.a.u(p10, str7, ", countryOfResidence=", str8, ", isPep=");
            p10.append(bool);
            p10.append(", isUs=");
            p10.append(bool2);
            p10.append(", sourceOfWealth=");
            return s3.b.o(p10, str9, ", linkToCV=", str10, ")");
        }
    }

    public d(a aVar, List<String> list, String str, String str2) {
        this.f4279a = aVar;
        this.f4280b = list;
        this.f4281c = str;
        this.f4282d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f4279a, dVar.f4279a) && kotlin.jvm.internal.f.b(this.f4280b, dVar.f4280b) && kotlin.jvm.internal.f.b(this.f4281c, dVar.f4281c) && kotlin.jvm.internal.f.b(this.f4282d, dVar.f4282d);
    }

    public final int hashCode() {
        a aVar = this.f4279a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        List<String> list = this.f4280b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f4281c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4282d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        a aVar = this.f4279a;
        List<String> list = this.f4280b;
        String str = this.f4281c;
        String str2 = this.f4282d;
        StringBuilder sb2 = new StringBuilder("AddUBORequestRaw(beneficialOwnerInfo=");
        sb2.append(aVar);
        sb2.append(", positions=");
        sb2.append(list);
        sb2.append(", beneficiaryType=");
        return s3.b.o(sb2, str, ", sharesAmount=", str2, ")");
    }
}
