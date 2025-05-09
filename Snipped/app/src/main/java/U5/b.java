package u5;

import java.util.List;

/* compiled from: AddUBORequestDomain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f30216a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f30217b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30218c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30219d;

    /* compiled from: AddUBORequestDomain.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f30220a;

        /* renamed from: b, reason: collision with root package name */
        public final String f30221b;

        /* renamed from: c, reason: collision with root package name */
        public final String f30222c;

        /* renamed from: d, reason: collision with root package name */
        public final String f30223d;

        /* renamed from: e, reason: collision with root package name */
        public final String f30224e;

        /* renamed from: f, reason: collision with root package name */
        public final String f30225f;

        /* renamed from: g, reason: collision with root package name */
        public final String f30226g;

        /* renamed from: h, reason: collision with root package name */
        public final String f30227h;
        public final Boolean i;

        /* renamed from: j, reason: collision with root package name */
        public final Boolean f30228j;

        /* renamed from: k, reason: collision with root package name */
        public final String f30229k;

        /* renamed from: l, reason: collision with root package name */
        public final String f30230l;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, String str9, String str10) {
            this.f30220a = str;
            this.f30221b = str2;
            this.f30222c = str3;
            this.f30223d = str4;
            this.f30224e = str5;
            this.f30225f = str6;
            this.f30226g = str7;
            this.f30227h = str8;
            this.i = bool;
            this.f30228j = bool2;
            this.f30229k = str9;
            this.f30230l = str10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f30220a, aVar.f30220a) && kotlin.jvm.internal.f.b(this.f30221b, aVar.f30221b) && kotlin.jvm.internal.f.b(this.f30222c, aVar.f30222c) && kotlin.jvm.internal.f.b(this.f30223d, aVar.f30223d) && kotlin.jvm.internal.f.b(this.f30224e, aVar.f30224e) && kotlin.jvm.internal.f.b(this.f30225f, aVar.f30225f) && kotlin.jvm.internal.f.b(this.f30226g, aVar.f30226g) && kotlin.jvm.internal.f.b(this.f30227h, aVar.f30227h) && kotlin.jvm.internal.f.b(this.i, aVar.i) && kotlin.jvm.internal.f.b(this.f30228j, aVar.f30228j) && kotlin.jvm.internal.f.b(this.f30229k, aVar.f30229k) && kotlin.jvm.internal.f.b(this.f30230l, aVar.f30230l);
        }

        public final int hashCode() {
            String str = this.f30220a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f30221b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f30222c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f30223d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f30224e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f30225f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f30226g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f30227h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Boolean bool = this.i;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f30228j;
            int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str9 = this.f30229k;
            int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f30230l;
            return hashCode11 + (str10 != null ? str10.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BeneficialOwnerInfoDomain(email=");
            sb2.append(this.f30220a);
            sb2.append(", firstName=");
            sb2.append(this.f30221b);
            sb2.append(", lastName=");
            sb2.append(this.f30222c);
            sb2.append(", companyName=");
            sb2.append(this.f30223d);
            sb2.append(", companyNumber=");
            sb2.append(this.f30224e);
            sb2.append(", countryOperation=");
            sb2.append(this.f30225f);
            sb2.append(", countryCitizenship=");
            sb2.append(this.f30226g);
            sb2.append(", countryOfResidence=");
            sb2.append(this.f30227h);
            sb2.append(", isPep=");
            sb2.append(this.i);
            sb2.append(", isUs=");
            sb2.append(this.f30228j);
            sb2.append(", sourceOfWealth=");
            sb2.append(this.f30229k);
            sb2.append(", link=");
            return androidx.camera.core.impl.utils.a.n(sb2, this.f30230l, ")");
        }
    }

    public b(a aVar, List<String> list, String str, String str2) {
        this.f30216a = aVar;
        this.f30217b = list;
        this.f30218c = str;
        this.f30219d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f30216a, bVar.f30216a) && kotlin.jvm.internal.f.b(this.f30217b, bVar.f30217b) && kotlin.jvm.internal.f.b(this.f30218c, bVar.f30218c) && kotlin.jvm.internal.f.b(this.f30219d, bVar.f30219d);
    }

    public final int hashCode() {
        a aVar = this.f30216a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        List<String> list = this.f30217b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f30218c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30219d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddUBORequestDomain(beneficialOwnerInfo=");
        sb2.append(this.f30216a);
        sb2.append(", positions=");
        sb2.append(this.f30217b);
        sb2.append(", beneficiaryType=");
        sb2.append(this.f30218c);
        sb2.append(", sharesAmount=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f30219d, ")");
    }
}
