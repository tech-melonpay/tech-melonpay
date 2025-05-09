package u5;

import java.util.List;

/* compiled from: CompanySearchDomain.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f30256a;

    /* renamed from: b, reason: collision with root package name */
    public final b f30257b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30258c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30259d;

    /* renamed from: e, reason: collision with root package name */
    public final String f30260e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f30261f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30262g;

    /* renamed from: h, reason: collision with root package name */
    public final String f30263h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f30264j;

    /* renamed from: k, reason: collision with root package name */
    public final a f30265k;

    /* compiled from: CompanySearchDomain.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f30266a;

        /* renamed from: b, reason: collision with root package name */
        public final String f30267b;

        /* renamed from: c, reason: collision with root package name */
        public final String f30268c;

        /* renamed from: d, reason: collision with root package name */
        public final String f30269d;

        /* renamed from: e, reason: collision with root package name */
        public final String f30270e;

        /* renamed from: f, reason: collision with root package name */
        public final String f30271f;

        /* renamed from: g, reason: collision with root package name */
        public final String f30272g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f30266a = str;
            this.f30267b = str2;
            this.f30268c = str3;
            this.f30269d = str4;
            this.f30270e = str5;
            this.f30271f = str6;
            this.f30272g = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f30266a, aVar.f30266a) && kotlin.jvm.internal.f.b(this.f30267b, aVar.f30267b) && kotlin.jvm.internal.f.b(this.f30268c, aVar.f30268c) && kotlin.jvm.internal.f.b(this.f30269d, aVar.f30269d) && kotlin.jvm.internal.f.b(this.f30270e, aVar.f30270e) && kotlin.jvm.internal.f.b(this.f30271f, aVar.f30271f) && kotlin.jvm.internal.f.b(this.f30272g, aVar.f30272g);
        }

        public final int hashCode() {
            String str = this.f30266a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f30267b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f30268c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f30269d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f30270e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f30271f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f30272g;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddressDomain(country=");
            sb2.append(this.f30266a);
            sb2.append(", addressLine1=");
            sb2.append(this.f30267b);
            sb2.append(", addressLine2=");
            sb2.append(this.f30268c);
            sb2.append(", premises=");
            sb2.append(this.f30269d);
            sb2.append(", postalCode=");
            sb2.append(this.f30270e);
            sb2.append(", region=");
            sb2.append(this.f30271f);
            sb2.append(", locality=");
            return androidx.camera.core.impl.utils.a.n(sb2, this.f30272g, ")");
        }
    }

    /* compiled from: CompanySearchDomain.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f30273a;

        public b(String str) {
            this.f30273a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.f.b(this.f30273a, ((b) obj).f30273a);
        }

        public final int hashCode() {
            String str = this.f30273a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return androidx.camera.core.impl.utils.a.n(new StringBuilder("LinkDomain(self="), this.f30273a, ")");
        }
    }

    public e(String str, b bVar, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, String str8, a aVar) {
        this.f30256a = str;
        this.f30257b = bVar;
        this.f30258c = str2;
        this.f30259d = str3;
        this.f30260e = str4;
        this.f30261f = list;
        this.f30262g = str5;
        this.f30263h = str6;
        this.i = str7;
        this.f30264j = str8;
        this.f30265k = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f30256a, eVar.f30256a) && kotlin.jvm.internal.f.b(this.f30257b, eVar.f30257b) && kotlin.jvm.internal.f.b(this.f30258c, eVar.f30258c) && kotlin.jvm.internal.f.b(this.f30259d, eVar.f30259d) && kotlin.jvm.internal.f.b(this.f30260e, eVar.f30260e) && kotlin.jvm.internal.f.b(this.f30261f, eVar.f30261f) && kotlin.jvm.internal.f.b(this.f30262g, eVar.f30262g) && kotlin.jvm.internal.f.b(this.f30263h, eVar.f30263h) && kotlin.jvm.internal.f.b(this.i, eVar.i) && kotlin.jvm.internal.f.b(this.f30264j, eVar.f30264j) && kotlin.jvm.internal.f.b(this.f30265k, eVar.f30265k);
    }

    public final int hashCode() {
        String str = this.f30256a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        b bVar = this.f30257b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.f30258c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30259d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30260e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.f30261f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f30262g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f30263h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f30264j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        a aVar = this.f30265k;
        return hashCode10 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CompanySearchDomain(addressSnippet=" + this.f30256a + ", links=" + this.f30257b + ", dateOfCreation=" + this.f30258c + ", kind=" + this.f30259d + ", companyNumber=" + this.f30260e + ", descriptionIdentifier=" + this.f30261f + ", companyType=" + this.f30262g + ", companyStatus=" + this.f30263h + ", description=" + this.i + ", title=" + this.f30264j + ", address=" + this.f30265k + ")";
    }
}
