package p4;

import C.v;
import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;
import java.math.BigDecimal;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PaymentRaw.kt */
/* loaded from: classes.dex */
public final class d extends C0715a {

    /* renamed from: A, reason: collision with root package name */
    @l3.b("to_bank_country")
    private final String f25626A;

    /* renamed from: B, reason: collision with root package name */
    @l3.b("to_amount")
    private final BigDecimal f25627B;

    /* renamed from: C, reason: collision with root package name */
    @l3.b("to_currency")
    private final String f25628C;

    /* renamed from: D, reason: collision with root package name */
    @l3.b("status")
    private final String f25629D;

    /* renamed from: E, reason: collision with root package name */
    @l3.b("created_at")
    private final String f25630E;

    /* renamed from: F, reason: collision with root package name */
    @l3.b("updated_at")
    private final String f25631F;

    /* renamed from: G, reason: collision with root package name */
    @l3.b("master_tx_id")
    private final Long f25632G;

    /* renamed from: H, reason: collision with root package name */
    @l3.b("provider_tx_signer_status")
    private final String f25633H;

    /* renamed from: I, reason: collision with root package name */
    @l3.b("confirmation")
    private final b f25634I;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final String f25635b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("uuid")
    private final String f25636c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("client_id")
    private final Long f25637d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("beneficiary_id")
    private final Long f25638e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("beneficiary_type")
    private final String f25639f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("direction")
    private final String f25640g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("payment_method")
    private final String f25641h;

    @l3.b("amount")
    private final BigDecimal i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f25642j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b(ErrorBundle.DETAIL_ENTRY)
    private final String f25643k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("from_name")
    private final String f25644l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("from_account")
    private final String f25645m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("from_iban")
    private final String f25646n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("from_bic_swift")
    private final String f25647o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("from_gb_sort_code")
    private final String f25648p;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("from_amount")
    private final BigDecimal f25649q;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("from_currency")
    private final String f25650r;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("to_name")
    private final String f25651s;

    /* renamed from: t, reason: collision with root package name */
    @l3.b("to_account")
    private final String f25652t;

    /* renamed from: u, reason: collision with root package name */
    @l3.b("to_iban")
    private final String f25653u;

    /* renamed from: v, reason: collision with root package name */
    @l3.b("to_bic_swift")
    private final String f25654v;

    /* renamed from: w, reason: collision with root package name */
    @l3.b("to_gb_sort_code")
    private final String f25655w;

    /* renamed from: x, reason: collision with root package name */
    @l3.b("to_bank_name")
    private final String f25656x;

    /* renamed from: y, reason: collision with root package name */
    @l3.b("to_bank_city")
    private final String f25657y;

    /* renamed from: z, reason: collision with root package name */
    @l3.b("to_bank_address")
    private final String f25658z;

    public final String A() {
        return this.f25626A;
    }

    public final String B() {
        return this.f25656x;
    }

    public final String C() {
        return this.f25654v;
    }

    public final String D() {
        return this.f25628C;
    }

    public final String E() {
        return this.f25655w;
    }

    public final String F() {
        return this.f25653u;
    }

    public final String G() {
        return this.f25651s;
    }

    public final String H() {
        return this.f25631F;
    }

    public final String I() {
        return this.f25636c;
    }

    public final BigDecimal b() {
        return this.i;
    }

    public final Long c() {
        return this.f25638e;
    }

    public final String d() {
        return this.f25639f;
    }

    public final Long e() {
        return this.f25637d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f25635b, dVar.f25635b) && kotlin.jvm.internal.f.b(this.f25636c, dVar.f25636c) && kotlin.jvm.internal.f.b(this.f25637d, dVar.f25637d) && kotlin.jvm.internal.f.b(this.f25638e, dVar.f25638e) && kotlin.jvm.internal.f.b(this.f25639f, dVar.f25639f) && kotlin.jvm.internal.f.b(this.f25640g, dVar.f25640g) && kotlin.jvm.internal.f.b(this.f25641h, dVar.f25641h) && kotlin.jvm.internal.f.b(this.i, dVar.i) && kotlin.jvm.internal.f.b(this.f25642j, dVar.f25642j) && kotlin.jvm.internal.f.b(this.f25643k, dVar.f25643k) && kotlin.jvm.internal.f.b(this.f25644l, dVar.f25644l) && kotlin.jvm.internal.f.b(this.f25645m, dVar.f25645m) && kotlin.jvm.internal.f.b(this.f25646n, dVar.f25646n) && kotlin.jvm.internal.f.b(this.f25647o, dVar.f25647o) && kotlin.jvm.internal.f.b(this.f25648p, dVar.f25648p) && kotlin.jvm.internal.f.b(this.f25649q, dVar.f25649q) && kotlin.jvm.internal.f.b(this.f25650r, dVar.f25650r) && kotlin.jvm.internal.f.b(this.f25651s, dVar.f25651s) && kotlin.jvm.internal.f.b(this.f25652t, dVar.f25652t) && kotlin.jvm.internal.f.b(this.f25653u, dVar.f25653u) && kotlin.jvm.internal.f.b(this.f25654v, dVar.f25654v) && kotlin.jvm.internal.f.b(this.f25655w, dVar.f25655w) && kotlin.jvm.internal.f.b(this.f25656x, dVar.f25656x) && kotlin.jvm.internal.f.b(this.f25657y, dVar.f25657y) && kotlin.jvm.internal.f.b(this.f25658z, dVar.f25658z) && kotlin.jvm.internal.f.b(this.f25626A, dVar.f25626A) && kotlin.jvm.internal.f.b(this.f25627B, dVar.f25627B) && kotlin.jvm.internal.f.b(this.f25628C, dVar.f25628C) && kotlin.jvm.internal.f.b(this.f25629D, dVar.f25629D) && kotlin.jvm.internal.f.b(this.f25630E, dVar.f25630E) && kotlin.jvm.internal.f.b(this.f25631F, dVar.f25631F) && kotlin.jvm.internal.f.b(this.f25632G, dVar.f25632G) && kotlin.jvm.internal.f.b(this.f25633H, dVar.f25633H) && kotlin.jvm.internal.f.b(this.f25634I, dVar.f25634I);
    }

    public final b f() {
        return this.f25634I;
    }

    public final String g() {
        return this.f25630E;
    }

    public final String h() {
        return this.f25642j;
    }

    public final int hashCode() {
        String str = this.f25635b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25636c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.f25637d;
        int hashCode3 = (hashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f25638e;
        int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.f25639f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25640g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f25641h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.i;
        int hashCode8 = (hashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str6 = this.f25642j;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f25643k;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f25644l;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f25645m;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f25646n;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f25647o;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f25648p;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f25649q;
        int hashCode16 = (hashCode15 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str13 = this.f25650r;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f25651s;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f25652t;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f25653u;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f25654v;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f25655w;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f25656x;
        int c2 = v.c((hashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31, 31, this.f25657y);
        String str20 = this.f25658z;
        int hashCode23 = (c2 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f25626A;
        int hashCode24 = (hashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f25627B;
        int hashCode25 = (hashCode24 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str22 = this.f25628C;
        int hashCode26 = (hashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.f25629D;
        int hashCode27 = (hashCode26 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f25630E;
        int hashCode28 = (hashCode27 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.f25631F;
        int hashCode29 = (hashCode28 + (str25 == null ? 0 : str25.hashCode())) * 31;
        Long l12 = this.f25632G;
        int hashCode30 = (hashCode29 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str26 = this.f25633H;
        return this.f25634I.hashCode() + ((hashCode30 + (str26 != null ? str26.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.f25643k;
    }

    public final String j() {
        return this.f25640g;
    }

    public final String k() {
        return this.f25645m;
    }

    public final BigDecimal l() {
        return this.f25649q;
    }

    public final String m() {
        return this.f25647o;
    }

    public final String n() {
        return this.f25650r;
    }

    public final String o() {
        return this.f25648p;
    }

    public final String p() {
        return this.f25646n;
    }

    public final String q() {
        return this.f25644l;
    }

    public final String r() {
        return this.f25635b;
    }

    public final Long s() {
        return this.f25632G;
    }

    public final String t() {
        return this.f25641h;
    }

    public final String toString() {
        String str = this.f25635b;
        String str2 = this.f25636c;
        Long l10 = this.f25637d;
        Long l11 = this.f25638e;
        String str3 = this.f25639f;
        String str4 = this.f25640g;
        String str5 = this.f25641h;
        BigDecimal bigDecimal = this.i;
        String str6 = this.f25642j;
        String str7 = this.f25643k;
        String str8 = this.f25644l;
        String str9 = this.f25645m;
        String str10 = this.f25646n;
        String str11 = this.f25647o;
        String str12 = this.f25648p;
        BigDecimal bigDecimal2 = this.f25649q;
        String str13 = this.f25650r;
        String str14 = this.f25651s;
        String str15 = this.f25652t;
        String str16 = this.f25653u;
        String str17 = this.f25654v;
        String str18 = this.f25655w;
        String str19 = this.f25656x;
        String str20 = this.f25657y;
        String str21 = this.f25658z;
        String str22 = this.f25626A;
        BigDecimal bigDecimal3 = this.f25627B;
        String str23 = this.f25628C;
        String str24 = this.f25629D;
        String str25 = this.f25630E;
        String str26 = this.f25631F;
        Long l12 = this.f25632G;
        String str27 = this.f25633H;
        b bVar = this.f25634I;
        StringBuilder p10 = s3.b.p("PaymentRaw(id=", str, ", uuid=", str2, ", clientId=");
        p10.append(l10);
        p10.append(", beneficiaryId=");
        p10.append(l11);
        p10.append(", beneficiaryType=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", direction=", str4, ", paymentMethod=");
        p10.append(str5);
        p10.append(", amount=");
        p10.append(bigDecimal);
        p10.append(", currency=");
        androidx.camera.core.impl.utils.a.u(p10, str6, ", details=", str7, ", fromName=");
        androidx.camera.core.impl.utils.a.u(p10, str8, ", fromAccount=", str9, ", fromIban=");
        androidx.camera.core.impl.utils.a.u(p10, str10, ", fromBicSwift=", str11, ", fromGbSortCode=");
        p10.append(str12);
        p10.append(", fromAmount=");
        p10.append(bigDecimal2);
        p10.append(", fromCurrency=");
        androidx.camera.core.impl.utils.a.u(p10, str13, ", toName=", str14, ", toAccount=");
        androidx.camera.core.impl.utils.a.u(p10, str15, ", toIban=", str16, ", toBicSwift=");
        androidx.camera.core.impl.utils.a.u(p10, str17, ", toGbSortCode=", str18, ", toBankName=");
        androidx.camera.core.impl.utils.a.u(p10, str19, ", toBankCity=", str20, ", toBankAddress=");
        androidx.camera.core.impl.utils.a.u(p10, str21, ", toBankCountry=", str22, ", toAmount=");
        p10.append(bigDecimal3);
        p10.append(", toCurrency=");
        p10.append(str23);
        p10.append(", status=");
        androidx.camera.core.impl.utils.a.u(p10, str24, ", createdAt=", str25, ", updatedAt=");
        p10.append(str26);
        p10.append(", masterTxId=");
        p10.append(l12);
        p10.append(", providerTxSignerStatus=");
        p10.append(str27);
        p10.append(", confirmation=");
        p10.append(bVar);
        p10.append(")");
        return p10.toString();
    }

    public final String u() {
        return this.f25633H;
    }

    public final String v() {
        return this.f25629D;
    }

    public final String w() {
        return this.f25652t;
    }

    public final BigDecimal x() {
        return this.f25627B;
    }

    public final String y() {
        return this.f25658z;
    }

    public final String z() {
        return this.f25657y;
    }
}
