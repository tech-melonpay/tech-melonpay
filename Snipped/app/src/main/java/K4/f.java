package k4;

import e4.C0715a;
import j4.C0896a;
import java.util.HashMap;
import u4.C1520b;

/* compiled from: ExchangeRaw.kt */
/* loaded from: classes.dex */
public final class f extends C0715a {

    /* renamed from: A, reason: collision with root package name */
    @l3.b("external_account")
    private final Boolean f22961A;

    /* renamed from: B, reason: collision with root package name */
    @l3.b("crypto_provider_requisites")
    private final HashMap<String, a> f22962B;

    /* renamed from: C, reason: collision with root package name */
    @l3.b("status")
    private final String f22963C;

    /* renamed from: D, reason: collision with root package name */
    @l3.b("external_account_country")
    private final String f22964D;

    /* renamed from: E, reason: collision with root package name */
    @l3.b("comission_currency")
    private final String f22965E;

    /* renamed from: F, reason: collision with root package name */
    @l3.b("blockchain_tx_id")
    private final String f22966F;

    /* renamed from: G, reason: collision with root package name */
    @l3.b("commission_display_amount")
    private final Double f22967G;

    /* renamed from: H, reason: collision with root package name */
    @l3.b("commission_type")
    private final String f22968H;

    /* renamed from: I, reason: collision with root package name */
    @l3.b("source_network")
    private final String f22969I;

    /* renamed from: J, reason: collision with root package name */
    @l3.b("from_address")
    private final String f22970J;

    /* renamed from: K, reason: collision with root package name */
    @l3.b("to_address")
    private final String f22971K;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final Integer f22972b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("reference")
    private final String f22973c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("client_id")
    private final Integer f22974d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("crypto_account_wallet_id")
    private final Integer f22975e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("crypto_account_wallet")
    private final C0896a f22976f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("cryptowallet_id")
    private final Integer f22977g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("movement_type")
    private final String f22978h;

    @l3.b("fiat")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("token")
    private final String f22979j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("rate")
    private final Double f22980k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("direction")
    private final String f22981l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("source_currency")
    private final String f22982m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("destination_currency")
    private final String f22983n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("source_amount")
    private final Double f22984o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("destination_amount")
    private final Double f22985p;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("comission_amount")
    private final Double f22986q;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("transaction")
    private final C1520b f22987r;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("created_at")
    private final String f22988s;

    /* renamed from: t, reason: collision with root package name */
    @l3.b("updated_at")
    private final String f22989t;

    /* renamed from: u, reason: collision with root package name */
    @l3.b("account")
    private final String f22990u;

    /* renamed from: v, reason: collision with root package name */
    @l3.b("iban")
    private final String f22991v;

    /* renamed from: w, reason: collision with root package name */
    @l3.b("to_name")
    private final String f22992w;

    /* renamed from: x, reason: collision with root package name */
    @l3.b("benef_type")
    private final String f22993x;

    /* renamed from: y, reason: collision with root package name */
    @l3.b("bic_swift")
    private final String f22994y;

    /* renamed from: z, reason: collision with root package name */
    @l3.b("bank_name")
    private final String f22995z;

    /* compiled from: ExchangeRaw.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.b("account")
        private final String f22996a;

        /* renamed from: b, reason: collision with root package name */
        @l3.b("iban")
        private final String f22997b;

        /* renamed from: c, reason: collision with root package name */
        @l3.b("full_name")
        private final String f22998c;

        /* renamed from: d, reason: collision with root package name */
        @l3.b("benef_type")
        private final String f22999d;

        /* renamed from: e, reason: collision with root package name */
        @l3.b("bic_swift")
        private final String f23000e;

        /* renamed from: f, reason: collision with root package name */
        @l3.b("bank_name")
        private final String f23001f;

        /* renamed from: g, reason: collision with root package name */
        @l3.b("sort_code")
        private final String f23002g;

        /* renamed from: h, reason: collision with root package name */
        @l3.b("reference")
        private final String f23003h;

        public final String a() {
            return this.f22996a;
        }

        public final String b() {
            return this.f23001f;
        }

        public final String c() {
            return this.f22999d;
        }

        public final String d() {
            return this.f23000e;
        }

        public final String e() {
            return this.f22998c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.f.b(this.f22996a, aVar.f22996a) && kotlin.jvm.internal.f.b(this.f22997b, aVar.f22997b) && kotlin.jvm.internal.f.b(this.f22998c, aVar.f22998c) && kotlin.jvm.internal.f.b(this.f22999d, aVar.f22999d) && kotlin.jvm.internal.f.b(this.f23000e, aVar.f23000e) && kotlin.jvm.internal.f.b(this.f23001f, aVar.f23001f) && kotlin.jvm.internal.f.b(this.f23002g, aVar.f23002g) && kotlin.jvm.internal.f.b(this.f23003h, aVar.f23003h);
        }

        public final String f() {
            return this.f22997b;
        }

        public final String g() {
            return this.f23003h;
        }

        public final String h() {
            return this.f23002g;
        }

        public final int hashCode() {
            String str = this.f22996a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f22997b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f22998c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f22999d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f23000e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f23001f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f23002g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f23003h;
            return hashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        public final String toString() {
            String str = this.f22996a;
            String str2 = this.f22997b;
            String str3 = this.f22998c;
            String str4 = this.f22999d;
            String str5 = this.f23000e;
            String str6 = this.f23001f;
            String str7 = this.f23002g;
            String str8 = this.f23003h;
            StringBuilder p10 = s3.b.p("CryptoProviderRequisitesRaw(account=", str, ", iban=", str2, ", fullName=");
            androidx.camera.core.impl.utils.a.u(p10, str3, ", beneficaryType=", str4, ", bicSwift=");
            androidx.camera.core.impl.utils.a.u(p10, str5, ", bankName=", str6, ", sortCode=");
            return s3.b.o(p10, str7, ", reference=", str8, ")");
        }
    }

    public final HashMap<String, a> A() {
        return this.f22962B;
    }

    public final Double B() {
        return this.f22984o;
    }

    public final String C() {
        return this.f22982m;
    }

    public final String D() {
        return this.f22969I;
    }

    public final String E() {
        return this.f22963C;
    }

    public final String F() {
        return this.f22971K;
    }

    public final String G() {
        return this.f22992w;
    }

    public final String H() {
        return this.f22979j;
    }

    public final String I() {
        return this.f22989t;
    }

    public final Integer J() {
        return this.f22977g;
    }

    public final String b() {
        return this.f22990u;
    }

    public final Integer c() {
        return this.f22975e;
    }

    public final String d() {
        return this.f22995z;
    }

    public final String e() {
        return this.f22993x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f22972b, fVar.f22972b) && kotlin.jvm.internal.f.b(this.f22973c, fVar.f22973c) && kotlin.jvm.internal.f.b(this.f22974d, fVar.f22974d) && kotlin.jvm.internal.f.b(this.f22975e, fVar.f22975e) && kotlin.jvm.internal.f.b(this.f22976f, fVar.f22976f) && kotlin.jvm.internal.f.b(this.f22977g, fVar.f22977g) && kotlin.jvm.internal.f.b(this.f22978h, fVar.f22978h) && kotlin.jvm.internal.f.b(this.i, fVar.i) && kotlin.jvm.internal.f.b(this.f22979j, fVar.f22979j) && kotlin.jvm.internal.f.b(this.f22980k, fVar.f22980k) && kotlin.jvm.internal.f.b(this.f22981l, fVar.f22981l) && kotlin.jvm.internal.f.b(this.f22982m, fVar.f22982m) && kotlin.jvm.internal.f.b(this.f22983n, fVar.f22983n) && kotlin.jvm.internal.f.b(this.f22984o, fVar.f22984o) && kotlin.jvm.internal.f.b(this.f22985p, fVar.f22985p) && kotlin.jvm.internal.f.b(this.f22986q, fVar.f22986q) && kotlin.jvm.internal.f.b(this.f22987r, fVar.f22987r) && kotlin.jvm.internal.f.b(this.f22988s, fVar.f22988s) && kotlin.jvm.internal.f.b(this.f22989t, fVar.f22989t) && kotlin.jvm.internal.f.b(this.f22990u, fVar.f22990u) && kotlin.jvm.internal.f.b(this.f22991v, fVar.f22991v) && kotlin.jvm.internal.f.b(this.f22992w, fVar.f22992w) && kotlin.jvm.internal.f.b(this.f22993x, fVar.f22993x) && kotlin.jvm.internal.f.b(this.f22994y, fVar.f22994y) && kotlin.jvm.internal.f.b(this.f22995z, fVar.f22995z) && kotlin.jvm.internal.f.b(this.f22961A, fVar.f22961A) && kotlin.jvm.internal.f.b(this.f22962B, fVar.f22962B) && kotlin.jvm.internal.f.b(this.f22963C, fVar.f22963C) && kotlin.jvm.internal.f.b(this.f22964D, fVar.f22964D) && kotlin.jvm.internal.f.b(this.f22965E, fVar.f22965E) && kotlin.jvm.internal.f.b(this.f22966F, fVar.f22966F) && kotlin.jvm.internal.f.b(this.f22967G, fVar.f22967G) && kotlin.jvm.internal.f.b(this.f22968H, fVar.f22968H) && kotlin.jvm.internal.f.b(this.f22969I, fVar.f22969I) && kotlin.jvm.internal.f.b(this.f22970J, fVar.f22970J) && kotlin.jvm.internal.f.b(this.f22971K, fVar.f22971K);
    }

    public final String f() {
        return this.f22994y;
    }

    public final String g() {
        return this.f22966F;
    }

    public final Integer h() {
        return this.f22974d;
    }

    public final int hashCode() {
        Integer num = this.f22972b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f22973c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f22974d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f22975e;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        C0896a c0896a = this.f22976f;
        int hashCode5 = (hashCode4 + (c0896a == null ? 0 : c0896a.hashCode())) * 31;
        Integer num4 = this.f22977g;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.f22978h;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f22979j;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d10 = this.f22980k;
        int hashCode10 = (hashCode9 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str5 = this.f22981l;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f22982m;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f22983n;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d11 = this.f22984o;
        int hashCode14 = (hashCode13 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f22985p;
        int hashCode15 = (hashCode14 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f22986q;
        int hashCode16 = (hashCode15 + (d13 == null ? 0 : d13.hashCode())) * 31;
        C1520b c1520b = this.f22987r;
        int hashCode17 = (hashCode16 + (c1520b == null ? 0 : c1520b.hashCode())) * 31;
        String str8 = this.f22988s;
        int hashCode18 = (hashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f22989t;
        int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f22990u;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f22991v;
        int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f22992w;
        int hashCode22 = (hashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f22993x;
        int hashCode23 = (hashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f22994y;
        int hashCode24 = (hashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f22995z;
        int hashCode25 = (hashCode24 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Boolean bool = this.f22961A;
        int hashCode26 = (this.f22962B.hashCode() + ((hashCode25 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        String str16 = this.f22963C;
        int hashCode27 = (hashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f22964D;
        int hashCode28 = (hashCode27 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f22965E;
        int hashCode29 = (hashCode28 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f22966F;
        int hashCode30 = (hashCode29 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Double d14 = this.f22967G;
        int hashCode31 = (hashCode30 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str20 = this.f22968H;
        int hashCode32 = (hashCode31 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f22969I;
        int hashCode33 = (hashCode32 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f22970J;
        int hashCode34 = (hashCode33 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.f22971K;
        return hashCode34 + (str23 != null ? str23.hashCode() : 0);
    }

    public final Double i() {
        return this.f22986q;
    }

    public final String j() {
        return this.f22965E;
    }

    public final Double k() {
        return this.f22967G;
    }

    public final String l() {
        return this.f22968H;
    }

    public final String m() {
        return this.f22988s;
    }

    public final C0896a n() {
        return this.f22976f;
    }

    public final Double o() {
        return this.f22985p;
    }

    public final String p() {
        return this.f22983n;
    }

    public final String q() {
        return this.f22981l;
    }

    public final Boolean r() {
        return this.f22961A;
    }

    public final String s() {
        return this.f22964D;
    }

    public final String t() {
        return this.i;
    }

    public final String toString() {
        Integer num = this.f22972b;
        String str = this.f22973c;
        Integer num2 = this.f22974d;
        Integer num3 = this.f22975e;
        C0896a c0896a = this.f22976f;
        Integer num4 = this.f22977g;
        String str2 = this.f22978h;
        String str3 = this.i;
        String str4 = this.f22979j;
        Double d10 = this.f22980k;
        String str5 = this.f22981l;
        String str6 = this.f22982m;
        String str7 = this.f22983n;
        Double d11 = this.f22984o;
        Double d12 = this.f22985p;
        Double d13 = this.f22986q;
        C1520b c1520b = this.f22987r;
        String str8 = this.f22988s;
        String str9 = this.f22989t;
        String str10 = this.f22990u;
        String str11 = this.f22991v;
        String str12 = this.f22992w;
        String str13 = this.f22993x;
        String str14 = this.f22994y;
        String str15 = this.f22995z;
        Boolean bool = this.f22961A;
        HashMap<String, a> hashMap = this.f22962B;
        String str16 = this.f22963C;
        String str17 = this.f22964D;
        String str18 = this.f22965E;
        String str19 = this.f22966F;
        Double d14 = this.f22967G;
        String str20 = this.f22968H;
        String str21 = this.f22969I;
        String str22 = this.f22970J;
        String str23 = this.f22971K;
        StringBuilder sb2 = new StringBuilder("ExchangeRaw(id=");
        sb2.append(num);
        sb2.append(", reference=");
        sb2.append(str);
        sb2.append(", clientId=");
        sb2.append(num2);
        sb2.append(", accountId=");
        sb2.append(num3);
        sb2.append(", cryptoAccount=");
        sb2.append(c0896a);
        sb2.append(", walletId=");
        sb2.append(num4);
        sb2.append(", movementType=");
        androidx.camera.core.impl.utils.a.u(sb2, str2, ", fiat=", str3, ", token=");
        sb2.append(str4);
        sb2.append(", rate=");
        sb2.append(d10);
        sb2.append(", direction=");
        androidx.camera.core.impl.utils.a.u(sb2, str5, ", sourceCurrency=", str6, ", destinationCurrency=");
        sb2.append(str7);
        sb2.append(", sourceAmount=");
        sb2.append(d11);
        sb2.append(", destinationAmount=");
        com.google.android.gms.measurement.internal.a.r(sb2, d12, ", comissionAmount=", d13, ", transaction=");
        sb2.append(c1520b);
        sb2.append(", createdAt=");
        sb2.append(str8);
        sb2.append(", updatedAt=");
        androidx.camera.core.impl.utils.a.u(sb2, str9, ", account=", str10, ", iban=");
        androidx.camera.core.impl.utils.a.u(sb2, str11, ", toName=", str12, ", beneficaryType=");
        androidx.camera.core.impl.utils.a.u(sb2, str13, ", bicSwift=", str14, ", bankName=");
        sb2.append(str15);
        sb2.append(", externalAccount=");
        sb2.append(bool);
        sb2.append(", requisites=");
        sb2.append(hashMap);
        sb2.append(", status=");
        sb2.append(str16);
        sb2.append(", externalAccountCountry=");
        androidx.camera.core.impl.utils.a.u(sb2, str17, ", comissionCurrency=", str18, ", blockChainTxId=");
        sb2.append(str19);
        sb2.append(", comissionDisplayAmount=");
        sb2.append(d14);
        sb2.append(", comissionType=");
        androidx.camera.core.impl.utils.a.u(sb2, str20, ", sourceNetwork=", str21, ", fromAddress=");
        return s3.b.o(sb2, str22, ", toAddress=", str23, ")");
    }

    public final String u() {
        return this.f22970J;
    }

    public final String v() {
        return this.f22991v;
    }

    public final Integer w() {
        return this.f22972b;
    }

    public final String x() {
        return this.f22978h;
    }

    public final Double y() {
        return this.f22980k;
    }

    public final String z() {
        return this.f22973c;
    }
}
