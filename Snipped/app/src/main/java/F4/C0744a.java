package f4;

import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;
import java.math.BigDecimal;
import java.util.HashMap;

/* compiled from: BankAccountRaw.kt */
/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744a extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final Integer f20637b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("client_id")
    private final Integer f20638c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("client_name")
    private final String f20639d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("asset_type")
    private final String f20640e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("balance")
    private final BigDecimal f20641f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("provider_requisites")
    private final HashMap<String, C0398a> f20642g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("number")
    private final String f20643h;

    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f20644j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("status")
    private final Integer f20645k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("created_at")
    private final String f20646l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("welcome_mail_sent")
    private final Boolean f20647m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("text_line_1")
    private final String f20648n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("text_line_2")
    private final String f20649o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("cards_count")
    private final String f20650p;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("card_program_id")
    private final String f20651q;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("topup_account_id")
    private final Integer f20652r;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("topup_account_pname")
    private final String f20653s;

    /* compiled from: BankAccountRaw.kt */
    /* renamed from: f4.a$a, reason: collision with other inner class name */
    public static final class C0398a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("full_name")
        private final String f20654a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("address")
        private final String f20655b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("sort_code")
        private final String f20656c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("number")
        private final String f20657d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("iban")
        private final String f20658e;

        /* renamed from: f, reason: collision with root package name */
        @l3.b("bic_swift")
        private final String f20659f;

        /* renamed from: g, reason: collision with root package name */
        @l3.b("bank_name")
        private final String f20660g;

        /* renamed from: h, reason: collision with root package name */
        @l3.b("bank_address")
        private final String f20661h;

        @l3.b("bank_country")
        private final String i;

        /* renamed from: j, reason: collision with root package name */
        @l3.b("reference")
        private final String f20662j;

        /* renamed from: k, reason: collision with root package name */
        @l3.b("intermediary_bank_name")
        private final String f20663k;

        /* renamed from: l, reason: collision with root package name */
        @l3.b("intermediary_bank_swift")
        private final String f20664l;

        public final String a() {
            return this.f20655b;
        }

        public final String b() {
            return this.f20661h;
        }

        public final String c() {
            return this.i;
        }

        public final String d() {
            return this.f20660g;
        }

        public final String e() {
            return this.f20659f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0398a)) {
                return false;
            }
            C0398a c0398a = (C0398a) obj;
            return kotlin.jvm.internal.f.b(this.f20654a, c0398a.f20654a) && kotlin.jvm.internal.f.b(this.f20655b, c0398a.f20655b) && kotlin.jvm.internal.f.b(this.f20656c, c0398a.f20656c) && kotlin.jvm.internal.f.b(this.f20657d, c0398a.f20657d) && kotlin.jvm.internal.f.b(this.f20658e, c0398a.f20658e) && kotlin.jvm.internal.f.b(this.f20659f, c0398a.f20659f) && kotlin.jvm.internal.f.b(this.f20660g, c0398a.f20660g) && kotlin.jvm.internal.f.b(this.f20661h, c0398a.f20661h) && kotlin.jvm.internal.f.b(this.i, c0398a.i) && kotlin.jvm.internal.f.b(this.f20662j, c0398a.f20662j) && kotlin.jvm.internal.f.b(this.f20663k, c0398a.f20663k) && kotlin.jvm.internal.f.b(this.f20664l, c0398a.f20664l);
        }

        public final String f() {
            return this.f20654a;
        }

        public final String g() {
            return this.f20658e;
        }

        public final String h() {
            return this.f20663k;
        }

        public final int hashCode() {
            String str = this.f20654a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f20655b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f20656c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f20657d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f20658e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f20659f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f20660g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f20661h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f20662j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f20663k;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f20664l;
            return hashCode11 + (str12 != null ? str12.hashCode() : 0);
        }

        public final String i() {
            return this.f20664l;
        }

        public final String j() {
            return this.f20657d;
        }

        public final String k() {
            return this.f20662j;
        }

        public final String l() {
            return this.f20656c;
        }

        public final String toString() {
            String str = this.f20654a;
            String str2 = this.f20655b;
            String str3 = this.f20656c;
            String str4 = this.f20657d;
            String str5 = this.f20658e;
            String str6 = this.f20659f;
            String str7 = this.f20660g;
            String str8 = this.f20661h;
            String str9 = this.i;
            String str10 = this.f20662j;
            String str11 = this.f20663k;
            String str12 = this.f20664l;
            StringBuilder p10 = s3.b.p("ProviderRequisiteRaw(fullName=", str, ", address=", str2, ", sortCode=");
            androidx.camera.core.impl.utils.a.u(p10, str3, ", number=", str4, ", iban=");
            androidx.camera.core.impl.utils.a.u(p10, str5, ", bicSwift=", str6, ", bankName=");
            androidx.camera.core.impl.utils.a.u(p10, str7, ", bankAddress=", str8, ", bankCountry=");
            androidx.camera.core.impl.utils.a.u(p10, str9, ", reference=", str10, ", intermediaryBankName=");
            return s3.b.o(p10, str11, ", intermediaryBankSwift=", str12, ")");
        }
    }

    public final String b() {
        return this.f20640e;
    }

    public final BigDecimal c() {
        return this.f20641f;
    }

    public final String d() {
        return this.f20650p;
    }

    public final String e() {
        return this.f20651q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0744a)) {
            return false;
        }
        C0744a c0744a = (C0744a) obj;
        return kotlin.jvm.internal.f.b(this.f20637b, c0744a.f20637b) && kotlin.jvm.internal.f.b(this.f20638c, c0744a.f20638c) && kotlin.jvm.internal.f.b(this.f20639d, c0744a.f20639d) && kotlin.jvm.internal.f.b(this.f20640e, c0744a.f20640e) && kotlin.jvm.internal.f.b(this.f20641f, c0744a.f20641f) && kotlin.jvm.internal.f.b(this.f20642g, c0744a.f20642g) && kotlin.jvm.internal.f.b(this.f20643h, c0744a.f20643h) && kotlin.jvm.internal.f.b(this.i, c0744a.i) && kotlin.jvm.internal.f.b(this.f20644j, c0744a.f20644j) && kotlin.jvm.internal.f.b(this.f20645k, c0744a.f20645k) && kotlin.jvm.internal.f.b(this.f20646l, c0744a.f20646l) && kotlin.jvm.internal.f.b(this.f20647m, c0744a.f20647m) && kotlin.jvm.internal.f.b(this.f20648n, c0744a.f20648n) && kotlin.jvm.internal.f.b(this.f20649o, c0744a.f20649o) && kotlin.jvm.internal.f.b(this.f20650p, c0744a.f20650p) && kotlin.jvm.internal.f.b(this.f20651q, c0744a.f20651q) && kotlin.jvm.internal.f.b(this.f20652r, c0744a.f20652r) && kotlin.jvm.internal.f.b(this.f20653s, c0744a.f20653s);
    }

    public final Integer f() {
        return this.f20638c;
    }

    public final String g() {
        return this.f20639d;
    }

    public final String h() {
        return this.f20646l;
    }

    public final int hashCode() {
        Integer num = this.f20637b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f20638c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f20639d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20640e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.f20641f;
        int hashCode5 = (hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        HashMap<String, C0398a> hashMap = this.f20642g;
        int hashCode6 = (hashCode5 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        String str3 = this.f20643h;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20644j;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.f20645k;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.f20646l;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f20647m;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.f20648n;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20649o;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f20650p;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f20651q;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num4 = this.f20652r;
        int hashCode17 = (hashCode16 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str11 = this.f20653s;
        return hashCode17 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String i() {
        return this.i;
    }

    public final Integer j() {
        return this.f20637b;
    }

    public final String k() {
        return this.f20643h;
    }

    public final String l() {
        return this.f20644j;
    }

    public final HashMap<String, C0398a> m() {
        return this.f20642g;
    }

    public final Integer n() {
        return this.f20645k;
    }

    public final String o() {
        return this.f20648n;
    }

    public final String p() {
        return this.f20649o;
    }

    public final Integer q() {
        return this.f20652r;
    }

    public final String r() {
        return this.f20653s;
    }

    public final Boolean s() {
        return this.f20647m;
    }

    public final String toString() {
        Integer num = this.f20637b;
        Integer num2 = this.f20638c;
        String str = this.f20639d;
        String str2 = this.f20640e;
        BigDecimal bigDecimal = this.f20641f;
        HashMap<String, C0398a> hashMap = this.f20642g;
        String str3 = this.f20643h;
        String str4 = this.i;
        String str5 = this.f20644j;
        Integer num3 = this.f20645k;
        String str6 = this.f20646l;
        Boolean bool = this.f20647m;
        String str7 = this.f20648n;
        String str8 = this.f20649o;
        String str9 = this.f20650p;
        String str10 = this.f20651q;
        Integer num4 = this.f20652r;
        String str11 = this.f20653s;
        StringBuilder sb2 = new StringBuilder("BankAccountRaw(id=");
        sb2.append(num);
        sb2.append(", clientId=");
        sb2.append(num2);
        sb2.append(", clientName=");
        androidx.camera.core.impl.utils.a.u(sb2, str, ", assetType=", str2, ", balance=");
        sb2.append(bigDecimal);
        sb2.append(", providerRequisites=");
        sb2.append(hashMap);
        sb2.append(", number=");
        androidx.camera.core.impl.utils.a.u(sb2, str3, ", currency=", str4, ", prettyName=");
        sb2.append(str5);
        sb2.append(", status=");
        sb2.append(num3);
        sb2.append(", createdAt=");
        sb2.append(str6);
        sb2.append(", welcomeMailSent=");
        sb2.append(bool);
        sb2.append(", textLine1=");
        androidx.camera.core.impl.utils.a.u(sb2, str7, ", textLine2=", str8, ", cardsCount=");
        androidx.camera.core.impl.utils.a.u(sb2, str9, ", cardsProgramId=", str10, ", topUpAccountId=");
        sb2.append(num4);
        sb2.append(", topUpAccountPname=");
        sb2.append(str11);
        sb2.append(")");
        return sb2.toString();
    }
}
