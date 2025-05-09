package g4;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: CardTransactionResponseRaw.kt */
/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765a {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("id")
    private String f20769a = null;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("uuid")
    private String f20770b = null;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("client_id")
    private Integer f20771c = null;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("direction")
    private String f20772d = null;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("payment_method")
    private String f20773e = null;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("amount")
    private Double f20774f = null;

    /* renamed from: g, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private String f20775g = null;

    /* renamed from: h, reason: collision with root package name */
    @l3.b(ErrorBundle.DETAIL_ENTRY)
    private String f20776h = null;

    @l3.b("from_name")
    private String i = null;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("from_account_nickname")
    private String f20777j = null;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("from_amount")
    private Double f20778k = null;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("from_currency")
    private String f20779l = null;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("to_name")
    private String f20780m = null;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("to_account_nickname")
    private String f20781n = null;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("status")
    private String f20782o = null;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("created_at")
    private String f20783p = null;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("group")
    private String f20784q = null;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("merchant_category_code")
    private String f20785r = null;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("merchant_name")
    private String f20786s = null;

    /* renamed from: t, reason: collision with root package name */
    @l3.b("merchant_url")
    private String f20787t = null;

    /* renamed from: u, reason: collision with root package name */
    @l3.b("merchant_country_code")
    private String f20788u = null;

    /* renamed from: v, reason: collision with root package name */
    @l3.b("masked_card_number")
    private String f20789v = null;

    /* renamed from: w, reason: collision with root package name */
    @l3.b("card_name")
    private String f20790w = null;

    public final Double a() {
        return this.f20774f;
    }

    public final String b() {
        return this.f20790w;
    }

    public final Integer c() {
        return this.f20771c;
    }

    public final String d() {
        return this.f20783p;
    }

    public final String e() {
        return this.f20775g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0765a)) {
            return false;
        }
        C0765a c0765a = (C0765a) obj;
        return f.b(this.f20769a, c0765a.f20769a) && f.b(this.f20770b, c0765a.f20770b) && f.b(this.f20771c, c0765a.f20771c) && f.b(this.f20772d, c0765a.f20772d) && f.b(this.f20773e, c0765a.f20773e) && f.b(this.f20774f, c0765a.f20774f) && f.b(this.f20775g, c0765a.f20775g) && f.b(this.f20776h, c0765a.f20776h) && f.b(this.i, c0765a.i) && f.b(this.f20777j, c0765a.f20777j) && f.b(this.f20778k, c0765a.f20778k) && f.b(this.f20779l, c0765a.f20779l) && f.b(this.f20780m, c0765a.f20780m) && f.b(this.f20781n, c0765a.f20781n) && f.b(this.f20782o, c0765a.f20782o) && f.b(this.f20783p, c0765a.f20783p) && f.b(this.f20784q, c0765a.f20784q) && f.b(this.f20785r, c0765a.f20785r) && f.b(this.f20786s, c0765a.f20786s) && f.b(this.f20787t, c0765a.f20787t) && f.b(this.f20788u, c0765a.f20788u) && f.b(this.f20789v, c0765a.f20789v) && f.b(this.f20790w, c0765a.f20790w);
    }

    public final String f() {
        return this.f20776h;
    }

    public final String g() {
        return this.f20772d;
    }

    public final String h() {
        return this.f20777j;
    }

    public final int hashCode() {
        String str = this.f20769a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20770b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20771c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f20772d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20773e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d10 = this.f20774f;
        int hashCode6 = (hashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str5 = this.f20775g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20776h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20777j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d11 = this.f20778k;
        int hashCode11 = (hashCode10 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str9 = this.f20779l;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f20780m;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f20781n;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f20782o;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f20783p;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f20784q;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f20785r;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f20786s;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f20787t;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f20788u;
        int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f20789v;
        int hashCode22 = (hashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f20790w;
        return hashCode22 + (str20 != null ? str20.hashCode() : 0);
    }

    public final Double i() {
        return this.f20778k;
    }

    public final String j() {
        return this.f20779l;
    }

    public final String k() {
        return this.i;
    }

    public final String l() {
        return this.f20784q;
    }

    public final String m() {
        return this.f20769a;
    }

    public final String n() {
        return this.f20789v;
    }

    public final String o() {
        return this.f20785r;
    }

    public final String p() {
        return this.f20788u;
    }

    public final String q() {
        return this.f20786s;
    }

    public final String r() {
        return this.f20787t;
    }

    public final String s() {
        return this.f20773e;
    }

    public final String t() {
        return this.f20782o;
    }

    public final String toString() {
        String str = this.f20769a;
        String str2 = this.f20770b;
        Integer num = this.f20771c;
        String str3 = this.f20772d;
        String str4 = this.f20773e;
        Double d10 = this.f20774f;
        String str5 = this.f20775g;
        String str6 = this.f20776h;
        String str7 = this.i;
        String str8 = this.f20777j;
        Double d11 = this.f20778k;
        String str9 = this.f20779l;
        String str10 = this.f20780m;
        String str11 = this.f20781n;
        String str12 = this.f20782o;
        String str13 = this.f20783p;
        String str14 = this.f20784q;
        String str15 = this.f20785r;
        String str16 = this.f20786s;
        String str17 = this.f20787t;
        String str18 = this.f20788u;
        String str19 = this.f20789v;
        String str20 = this.f20790w;
        StringBuilder p10 = s3.b.p("CardTransactionRaw(id=", str, ", uuid=", str2, ", clientId=");
        p10.append(num);
        p10.append(", direction=");
        p10.append(str3);
        p10.append(", paymentMethod=");
        p10.append(str4);
        p10.append(", amount=");
        p10.append(d10);
        p10.append(", currency=");
        androidx.camera.core.impl.utils.a.u(p10, str5, ", details=", str6, ", fromName=");
        androidx.camera.core.impl.utils.a.u(p10, str7, ", fromAccountNickname=", str8, ", fromAmount=");
        p10.append(d11);
        p10.append(", fromCurrency=");
        p10.append(str9);
        p10.append(", toName=");
        androidx.camera.core.impl.utils.a.u(p10, str10, ", toAccountNickname=", str11, ", status=");
        androidx.camera.core.impl.utils.a.u(p10, str12, ", createdAt=", str13, ", group=");
        androidx.camera.core.impl.utils.a.u(p10, str14, ", merchantCategoryCode=", str15, ", merchantName=");
        androidx.camera.core.impl.utils.a.u(p10, str16, ", merchantUrl=", str17, ", merchantCountryCode=");
        androidx.camera.core.impl.utils.a.u(p10, str18, ", maskedCardNumber=", str19, ", cardName=");
        return androidx.camera.core.impl.utils.a.n(p10, str20, ")");
    }

    public final String u() {
        return this.f20781n;
    }

    public final String v() {
        return this.f20780m;
    }

    public final String w() {
        return this.f20770b;
    }
}
