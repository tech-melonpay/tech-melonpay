package i4;

import androidx.camera.core.n;
import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;

/* compiled from: CompanySearchRaw.kt */
/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.ITEMS)
    private final List<C0407a> f21318b;

    /* compiled from: CompanySearchRaw.kt */
    /* renamed from: i4.a$a, reason: collision with other inner class name */
    public static final class C0407a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("address_snippet")
        private final String f21319a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("links")
        private final b f21320b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("date_of_creation")
        private final String f21321c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("kind")
        private final String f21322d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("company_number")
        private final String f21323e;

        /* renamed from: f, reason: collision with root package name */
        @l3.b("description_identifier")
        private final List<String> f21324f;

        /* renamed from: g, reason: collision with root package name */
        @l3.b("company_type")
        private final String f21325g;

        /* renamed from: h, reason: collision with root package name */
        @l3.b("company_status")
        private final String f21326h;

        @l3.b("description")
        private final String i;

        /* renamed from: j, reason: collision with root package name */
        @l3.b(MessageBundle.TITLE_ENTRY)
        private final String f21327j;

        /* renamed from: k, reason: collision with root package name */
        @l3.b("address")
        private final C0408a f21328k;

        /* compiled from: CompanySearchRaw.kt */
        /* renamed from: i4.a$a$a, reason: collision with other inner class name */
        public static final class C0408a {

            /* renamed from: a, reason: collision with root package name */
            @l3.b("country")
            private final String f21329a;

            /* renamed from: b, reason: collision with root package name */
            @l3.b("address_line_1")
            private final String f21330b;

            /* renamed from: c, reason: collision with root package name */
            @l3.b("address_line_2")
            private final String f21331c;

            /* renamed from: d, reason: collision with root package name */
            @l3.b("premises")
            private final String f21332d;

            /* renamed from: e, reason: collision with root package name */
            @l3.b("postal_code")
            private final String f21333e;

            /* renamed from: f, reason: collision with root package name */
            @l3.b("region")
            private final String f21334f;

            /* renamed from: g, reason: collision with root package name */
            @l3.b("locality")
            private final String f21335g;

            public final String a() {
                return this.f21330b;
            }

            public final String b() {
                return this.f21331c;
            }

            public final String c() {
                return this.f21329a;
            }

            public final String d() {
                return this.f21335g;
            }

            public final String e() {
                return this.f21333e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0408a)) {
                    return false;
                }
                C0408a c0408a = (C0408a) obj;
                return kotlin.jvm.internal.f.b(this.f21329a, c0408a.f21329a) && kotlin.jvm.internal.f.b(this.f21330b, c0408a.f21330b) && kotlin.jvm.internal.f.b(this.f21331c, c0408a.f21331c) && kotlin.jvm.internal.f.b(this.f21332d, c0408a.f21332d) && kotlin.jvm.internal.f.b(this.f21333e, c0408a.f21333e) && kotlin.jvm.internal.f.b(this.f21334f, c0408a.f21334f) && kotlin.jvm.internal.f.b(this.f21335g, c0408a.f21335g);
            }

            public final String f() {
                return this.f21332d;
            }

            public final String g() {
                return this.f21334f;
            }

            public final int hashCode() {
                String str = this.f21329a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f21330b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f21331c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f21332d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f21333e;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.f21334f;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.f21335g;
                return hashCode6 + (str7 != null ? str7.hashCode() : 0);
            }

            public final String toString() {
                String str = this.f21329a;
                String str2 = this.f21330b;
                String str3 = this.f21331c;
                String str4 = this.f21332d;
                String str5 = this.f21333e;
                String str6 = this.f21334f;
                String str7 = this.f21335g;
                StringBuilder p10 = s3.b.p("AddressRaw(country=", str, ", addressLine1=", str2, ", addressLine2=");
                androidx.camera.core.impl.utils.a.u(p10, str3, ", premises=", str4, ", postalCode=");
                androidx.camera.core.impl.utils.a.u(p10, str5, ", region=", str6, ", locality=");
                return androidx.camera.core.impl.utils.a.n(p10, str7, ")");
            }
        }

        /* compiled from: CompanySearchRaw.kt */
        /* renamed from: i4.a$a$b */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            @l3.b("self")
            private final String f21336a;

            public final String a() {
                return this.f21336a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.f.b(this.f21336a, ((b) obj).f21336a);
            }

            public final int hashCode() {
                String str = this.f21336a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return n.a("LinkRaw(self=", this.f21336a, ")");
            }
        }

        public final C0408a a() {
            return this.f21328k;
        }

        public final String b() {
            return this.f21319a;
        }

        public final String c() {
            return this.f21323e;
        }

        public final String d() {
            return this.f21326h;
        }

        public final String e() {
            return this.f21325g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0407a)) {
                return false;
            }
            C0407a c0407a = (C0407a) obj;
            return kotlin.jvm.internal.f.b(this.f21319a, c0407a.f21319a) && kotlin.jvm.internal.f.b(this.f21320b, c0407a.f21320b) && kotlin.jvm.internal.f.b(this.f21321c, c0407a.f21321c) && kotlin.jvm.internal.f.b(this.f21322d, c0407a.f21322d) && kotlin.jvm.internal.f.b(this.f21323e, c0407a.f21323e) && kotlin.jvm.internal.f.b(this.f21324f, c0407a.f21324f) && kotlin.jvm.internal.f.b(this.f21325g, c0407a.f21325g) && kotlin.jvm.internal.f.b(this.f21326h, c0407a.f21326h) && kotlin.jvm.internal.f.b(this.i, c0407a.i) && kotlin.jvm.internal.f.b(this.f21327j, c0407a.f21327j) && kotlin.jvm.internal.f.b(this.f21328k, c0407a.f21328k);
        }

        public final String f() {
            return this.f21321c;
        }

        public final String g() {
            return this.i;
        }

        public final List<String> h() {
            return this.f21324f;
        }

        public final int hashCode() {
            String str = this.f21319a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            b bVar = this.f21320b;
            int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str2 = this.f21321c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f21322d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f21323e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<String> list = this.f21324f;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str5 = this.f21325g;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f21326h;
            int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.i;
            int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f21327j;
            int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
            C0408a c0408a = this.f21328k;
            return hashCode10 + (c0408a != null ? c0408a.hashCode() : 0);
        }

        public final String i() {
            return this.f21322d;
        }

        public final b j() {
            return this.f21320b;
        }

        public final String k() {
            return this.f21327j;
        }

        public final String toString() {
            String str = this.f21319a;
            b bVar = this.f21320b;
            String str2 = this.f21321c;
            String str3 = this.f21322d;
            String str4 = this.f21323e;
            List<String> list = this.f21324f;
            String str5 = this.f21325g;
            String str6 = this.f21326h;
            String str7 = this.i;
            String str8 = this.f21327j;
            C0408a c0408a = this.f21328k;
            StringBuilder sb2 = new StringBuilder("CompanySearchRaw(addressSnippet=");
            sb2.append(str);
            sb2.append(", links=");
            sb2.append(bVar);
            sb2.append(", dateOfCreation=");
            androidx.camera.core.impl.utils.a.u(sb2, str2, ", kind=", str3, ", companyNumber=");
            sb2.append(str4);
            sb2.append(", descriptionIdentifier=");
            sb2.append(list);
            sb2.append(", companyType=");
            androidx.camera.core.impl.utils.a.u(sb2, str5, ", companyStatus=", str6, ", description=");
            androidx.camera.core.impl.utils.a.u(sb2, str7, ", title=", str8, ", address=");
            sb2.append(c0408a);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public final List<C0407a> b() {
        return this.f21318b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0821a) && kotlin.jvm.internal.f.b(this.f21318b, ((C0821a) obj).f21318b);
    }

    public final int hashCode() {
        List<C0407a> list = this.f21318b;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "CompanySearchPagerRaw(items=" + this.f21318b + ")";
    }
}
