package h4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e4.C0715a;
import java.util.List;

/* compiled from: ProfileRaw.kt */
/* loaded from: classes.dex */
public final class h extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final String f21086b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("state")
    private final Integer f21087c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("photo")
    private final String f21088d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("verificationLevel")
    private final Integer f21089e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String f21090f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("firstName")
    private final String f21091g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("lastName")
    private final String f21092h;

    @l3.b("language")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("gender")
    private final Integer f21093j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("birthdate")
    private final String f21094k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("verificationStatus")
    private final Integer f21095l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("username")
    private final String f21096m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("legalAddress")
    private final a f21097n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("emails")
    private final List<b> f21098o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("phones")
    private final List<c> f21099p;

    /* compiled from: ProfileRaw.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("countryCode")
        private final String f21100a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("addressLine1")
        private final String f21101b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("addressLine2")
        private final String f21102c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("city")
        private final String f21103d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("postalCode")
        private final String f21104e;

        public final String a() {
            return this.f21101b;
        }

        public final String b() {
            return this.f21102c;
        }

        public final String c() {
            return this.f21103d;
        }

        public final String d() {
            return this.f21100a;
        }

        public final String e() {
            return this.f21104e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f21100a, aVar.f21100a) && kotlin.jvm.internal.f.b(this.f21101b, aVar.f21101b) && kotlin.jvm.internal.f.b(this.f21102c, aVar.f21102c) && kotlin.jvm.internal.f.b(this.f21103d, aVar.f21103d) && kotlin.jvm.internal.f.b(this.f21104e, aVar.f21104e);
        }

        public final int hashCode() {
            String str = this.f21100a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f21101b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f21102c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f21103d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f21104e;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f21100a;
            String str2 = this.f21101b;
            String str3 = this.f21102c;
            String str4 = this.f21103d;
            String str5 = this.f21104e;
            StringBuilder p10 = s3.b.p("AddressRaw(countryCode=", str, ", addressLine1=", str2, ", addressLine2=");
            androidx.camera.core.impl.utils.a.u(p10, str3, ", city=", str4, ", postalCode=");
            return androidx.camera.core.impl.utils.a.n(p10, str5, ")");
        }
    }

    /* compiled from: ProfileRaw.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("id")
        private final String f21105a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("primary")
        private final Boolean f21106b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("status")
        private final Integer f21107c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("addedAt")
        private final String f21108d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("email")
        private final String f21109e;

        public final String a() {
            return this.f21108d;
        }

        public final String b() {
            return this.f21109e;
        }

        public final String c() {
            return this.f21105a;
        }

        public final Boolean d() {
            return this.f21106b;
        }

        public final Integer e() {
            return this.f21107c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f.b(this.f21105a, bVar.f21105a) && kotlin.jvm.internal.f.b(this.f21106b, bVar.f21106b) && kotlin.jvm.internal.f.b(this.f21107c, bVar.f21107c) && kotlin.jvm.internal.f.b(this.f21108d, bVar.f21108d) && kotlin.jvm.internal.f.b(this.f21109e, bVar.f21109e);
        }

        public final int hashCode() {
            String str = this.f21105a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f21106b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.f21107c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.f21108d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f21109e;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f21105a;
            Boolean bool = this.f21106b;
            Integer num = this.f21107c;
            String str2 = this.f21108d;
            String str3 = this.f21109e;
            StringBuilder sb2 = new StringBuilder("EmailRaw(id=");
            sb2.append(str);
            sb2.append(", primary=");
            sb2.append(bool);
            sb2.append(", status=");
            sb2.append(num);
            sb2.append(", addedAt=");
            sb2.append(str2);
            sb2.append(", email=");
            return androidx.camera.core.impl.utils.a.n(sb2, str3, ")");
        }
    }

    /* compiled from: ProfileRaw.kt */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("id")
        private final String f21110a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("primary")
        private final Boolean f21111b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("status")
        private final Integer f21112c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("addedAt")
        private final String f21113d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("phone")
        private final a f21114e;

        /* compiled from: ProfileRaw.kt */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @l3.b("internationalNumber")
            private final String f21115a;

            /* renamed from: b, reason: collision with root package name */
            @l3.b("number")
            private final String f21116b;

            /* renamed from: c, reason: collision with root package name */
            @l3.b("countryCode")
            private final String f21117c;

            public final String a() {
                return this.f21117c;
            }

            public final String b() {
                return this.f21115a;
            }

            public final String c() {
                return this.f21116b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.f.b(this.f21115a, aVar.f21115a) && kotlin.jvm.internal.f.b(this.f21116b, aVar.f21116b) && kotlin.jvm.internal.f.b(this.f21117c, aVar.f21117c);
            }

            public final int hashCode() {
                String str = this.f21115a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f21116b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f21117c;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                String str = this.f21115a;
                String str2 = this.f21116b;
                return androidx.camera.core.impl.utils.a.n(s3.b.p("NumberRaw(internationalNumber=", str, ", number=", str2, ", countryCode="), this.f21117c, ")");
            }
        }

        public final String a() {
            return this.f21113d;
        }

        public final String b() {
            return this.f21110a;
        }

        public final a c() {
            return this.f21114e;
        }

        public final Boolean d() {
            return this.f21111b;
        }

        public final Integer e() {
            return this.f21112c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.f.b(this.f21110a, cVar.f21110a) && kotlin.jvm.internal.f.b(this.f21111b, cVar.f21111b) && kotlin.jvm.internal.f.b(this.f21112c, cVar.f21112c) && kotlin.jvm.internal.f.b(this.f21113d, cVar.f21113d) && kotlin.jvm.internal.f.b(this.f21114e, cVar.f21114e);
        }

        public final int hashCode() {
            String str = this.f21110a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f21111b;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.f21112c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.f21113d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            a aVar = this.f21114e;
            return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            return "PhoneRaw(id=" + this.f21110a + ", primary=" + this.f21111b + ", status=" + this.f21112c + ", addedAt=" + this.f21113d + ", phone=" + this.f21114e + ")";
        }
    }

    public final String b() {
        return this.f21094k;
    }

    public final List<b> c() {
        return this.f21098o;
    }

    public final String d() {
        return this.f21091g;
    }

    public final Integer e() {
        return this.f21093j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.f.b(this.f21086b, hVar.f21086b) && kotlin.jvm.internal.f.b(this.f21087c, hVar.f21087c) && kotlin.jvm.internal.f.b(this.f21088d, hVar.f21088d) && kotlin.jvm.internal.f.b(this.f21089e, hVar.f21089e) && kotlin.jvm.internal.f.b(this.f21090f, hVar.f21090f) && kotlin.jvm.internal.f.b(this.f21091g, hVar.f21091g) && kotlin.jvm.internal.f.b(this.f21092h, hVar.f21092h) && kotlin.jvm.internal.f.b(this.i, hVar.i) && kotlin.jvm.internal.f.b(this.f21093j, hVar.f21093j) && kotlin.jvm.internal.f.b(this.f21094k, hVar.f21094k) && kotlin.jvm.internal.f.b(this.f21095l, hVar.f21095l) && kotlin.jvm.internal.f.b(this.f21096m, hVar.f21096m) && kotlin.jvm.internal.f.b(this.f21097n, hVar.f21097n) && kotlin.jvm.internal.f.b(this.f21098o, hVar.f21098o) && kotlin.jvm.internal.f.b(this.f21099p, hVar.f21099p);
    }

    public final String f() {
        return this.f21086b;
    }

    public final String g() {
        return this.i;
    }

    public final String h() {
        return this.f21092h;
    }

    public final int hashCode() {
        String str = this.f21086b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f21087c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f21088d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f21089e;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f21090f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21091g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21092h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.f21093j;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.f21094k;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num4 = this.f21095l;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str8 = this.f21096m;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        a aVar = this.f21097n;
        int hashCode13 = (hashCode12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<b> list = this.f21098o;
        int hashCode14 = (hashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        List<c> list2 = this.f21099p;
        return hashCode14 + (list2 != null ? list2.hashCode() : 0);
    }

    public final a i() {
        return this.f21097n;
    }

    public final String j() {
        return this.f21090f;
    }

    public final List<c> k() {
        return this.f21099p;
    }

    public final String l() {
        return this.f21088d;
    }

    public final Integer m() {
        return this.f21087c;
    }

    public final String n() {
        return this.f21096m;
    }

    public final Integer o() {
        return this.f21089e;
    }

    public final Integer p() {
        return this.f21095l;
    }

    public final String toString() {
        String str = this.f21086b;
        Integer num = this.f21087c;
        String str2 = this.f21088d;
        Integer num2 = this.f21089e;
        String str3 = this.f21090f;
        String str4 = this.f21091g;
        String str5 = this.f21092h;
        String str6 = this.i;
        Integer num3 = this.f21093j;
        String str7 = this.f21094k;
        Integer num4 = this.f21095l;
        String str8 = this.f21096m;
        a aVar = this.f21097n;
        List<b> list = this.f21098o;
        List<c> list2 = this.f21099p;
        StringBuilder sb2 = new StringBuilder("ProfileRaw(id=");
        sb2.append(str);
        sb2.append(", state=");
        sb2.append(num);
        sb2.append(", photo=");
        sb2.append(str2);
        sb2.append(", verificationLevel=");
        sb2.append(num2);
        sb2.append(", name=");
        androidx.camera.core.impl.utils.a.u(sb2, str3, ", firstName=", str4, ", lastName=");
        androidx.camera.core.impl.utils.a.u(sb2, str5, ", language=", str6, ", gender=");
        sb2.append(num3);
        sb2.append(", birthdate=");
        sb2.append(str7);
        sb2.append(", verificationStatus=");
        sb2.append(num4);
        sb2.append(", username=");
        sb2.append(str8);
        sb2.append(", legalAddress=");
        sb2.append(aVar);
        sb2.append(", emails=");
        sb2.append(list);
        sb2.append(", phones=");
        sb2.append(list2);
        sb2.append(")");
        return sb2.toString();
    }
}
