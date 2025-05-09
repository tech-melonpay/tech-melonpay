package u4;

import C.v;
import com.google.firebase.analytics.FirebaseAnalytics;
import e4.C0715a;
import java.math.BigDecimal;
import kotlin.jvm.internal.f;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ProxyTransactionRaw.kt */
/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1520b extends C0715a {

    /* renamed from: A, reason: collision with root package name */
    @l3.b("to_currency")
    private final String f30166A;

    /* renamed from: B, reason: collision with root package name */
    @l3.b("status")
    private final String f30167B;

    /* renamed from: C, reason: collision with root package name */
    @l3.b("to_email")
    private final String f30168C;

    /* renamed from: D, reason: collision with root package name */
    @l3.b("created_at")
    private final String f30169D;

    /* renamed from: E, reason: collision with root package name */
    @l3.b("uuid")
    private final String f30170E;

    /* renamed from: F, reason: collision with root package name */
    @l3.b("invoice_filename")
    private final String f30171F;

    /* renamed from: G, reason: collision with root package name */
    @l3.b("invoice_description")
    private final String f30172G;

    /* renamed from: H, reason: collision with root package name */
    @l3.b("has_invoice")
    private final Boolean f30173H;

    /* renamed from: I, reason: collision with root package name */
    @l3.b("provider_tx_signer_status")
    private final String f30174I;

    /* renamed from: J, reason: collision with root package name */
    @l3.b("commissions")
    private final p4.a f30175J;

    /* renamed from: K, reason: collision with root package name */
    @l3.b("confirmation")
    private final p4.b f30176K;

    /* renamed from: L, reason: collision with root package name */
    @l3.b("beneficiary_address_line_1")
    private final String f30177L;

    /* renamed from: M, reason: collision with root package name */
    @l3.b("beneficiary_address_line_2")
    private final String f30178M;

    /* renamed from: N, reason: collision with root package name */
    @l3.b("beneficiary_postal_code")
    private final String f30179N;

    /* renamed from: O, reason: collision with root package name */
    @l3.b("beneficiary_city")
    private final String f30180O;

    /* renamed from: P, reason: collision with root package name */
    @l3.b("beneficiary_country")
    private final String f30181P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.b("beneficiary_intermediary_bank")
    private final Boolean f30182Q;

    @l3.b("beneficiary_intermediary_bank_name")
    private final String R;

    @l3.b("beneficiary_intermediary_bank_swift")
    private final String S;

    @l3.b("exchange_request_id")
    private final Integer T;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("id")
    private final String f30183b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("client_id")
    private final Integer f30184c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("provider_tx_id")
    private final String f30185d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("provider_time")
    private final String f30186e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("beneficiary_id")
    private final int f30187f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("direction")
    private final String f30188g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("payment_method")
    private final String f30189h;

    @l3.b("amount")
    private final BigDecimal i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f30190j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b(ErrorBundle.DETAIL_ENTRY)
    private final String f30191k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("from_name")
    private final String f30192l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("from_email")
    private final String f30193m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("from_account")
    private final String f30194n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("from_iban")
    private final String f30195o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("from_bic_swift")
    private final String f30196p;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("from_gb_sort_code")
    private final String f30197q;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("from_amount")
    private final BigDecimal f30198r;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("from_currency")
    private final String f30199s;

    /* renamed from: t, reason: collision with root package name */
    @l3.b("to_name")
    private final String f30200t;

    /* renamed from: u, reason: collision with root package name */
    @l3.b("to_account")
    private final String f30201u;

    /* renamed from: v, reason: collision with root package name */
    @l3.b("to_gb_account")
    private final String f30202v;

    /* renamed from: w, reason: collision with root package name */
    @l3.b("to_iban")
    private final String f30203w;

    /* renamed from: x, reason: collision with root package name */
    @l3.b("to_bic_swift")
    private final String f30204x;

    /* renamed from: y, reason: collision with root package name */
    @l3.b("to_gb_sort_code")
    private final String f30205y;

    /* renamed from: z, reason: collision with root package name */
    @l3.b("to_amount")
    private final BigDecimal f30206z;

    public final String A() {
        return this.f30192l;
    }

    public final Boolean B() {
        return this.f30173H;
    }

    public final String C() {
        return this.f30183b;
    }

    public final String D() {
        return this.f30172G;
    }

    public final String E() {
        return this.f30171F;
    }

    public final String F() {
        return this.f30189h;
    }

    public final String G() {
        return this.f30186e;
    }

    public final String H() {
        return this.f30185d;
    }

    public final String I() {
        return this.f30174I;
    }

    public final String J() {
        return this.f30167B;
    }

    public final String K() {
        return this.f30201u;
    }

    public final BigDecimal L() {
        return this.f30206z;
    }

    public final String M() {
        return this.f30204x;
    }

    public final String N() {
        return this.f30166A;
    }

    public final String O() {
        return this.f30168C;
    }

    public final String P() {
        return this.f30202v;
    }

    public final String Q() {
        return this.f30205y;
    }

    public final String R() {
        return this.f30203w;
    }

    public final String S() {
        return this.f30200t;
    }

    public final String T() {
        return this.f30170E;
    }

    public final BigDecimal b() {
        return this.i;
    }

    public final String c() {
        return this.R;
    }

    public final String d() {
        return this.S;
    }

    public final String e() {
        return this.f30177L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1520b)) {
            return false;
        }
        C1520b c1520b = (C1520b) obj;
        return f.b(this.f30183b, c1520b.f30183b) && f.b(this.f30184c, c1520b.f30184c) && f.b(this.f30185d, c1520b.f30185d) && f.b(this.f30186e, c1520b.f30186e) && this.f30187f == c1520b.f30187f && f.b(this.f30188g, c1520b.f30188g) && f.b(this.f30189h, c1520b.f30189h) && f.b(this.i, c1520b.i) && f.b(this.f30190j, c1520b.f30190j) && f.b(this.f30191k, c1520b.f30191k) && f.b(this.f30192l, c1520b.f30192l) && f.b(this.f30193m, c1520b.f30193m) && f.b(this.f30194n, c1520b.f30194n) && f.b(this.f30195o, c1520b.f30195o) && f.b(this.f30196p, c1520b.f30196p) && f.b(this.f30197q, c1520b.f30197q) && f.b(this.f30198r, c1520b.f30198r) && f.b(this.f30199s, c1520b.f30199s) && f.b(this.f30200t, c1520b.f30200t) && f.b(this.f30201u, c1520b.f30201u) && f.b(this.f30202v, c1520b.f30202v) && f.b(this.f30203w, c1520b.f30203w) && f.b(this.f30204x, c1520b.f30204x) && f.b(this.f30205y, c1520b.f30205y) && f.b(this.f30206z, c1520b.f30206z) && f.b(this.f30166A, c1520b.f30166A) && f.b(this.f30167B, c1520b.f30167B) && f.b(this.f30168C, c1520b.f30168C) && f.b(this.f30169D, c1520b.f30169D) && f.b(this.f30170E, c1520b.f30170E) && f.b(this.f30171F, c1520b.f30171F) && f.b(this.f30172G, c1520b.f30172G) && f.b(this.f30173H, c1520b.f30173H) && f.b(this.f30174I, c1520b.f30174I) && f.b(this.f30175J, c1520b.f30175J) && f.b(this.f30176K, c1520b.f30176K) && f.b(this.f30177L, c1520b.f30177L) && f.b(this.f30178M, c1520b.f30178M) && f.b(this.f30179N, c1520b.f30179N) && f.b(this.f30180O, c1520b.f30180O) && f.b(this.f30181P, c1520b.f30181P) && f.b(this.f30182Q, c1520b.f30182Q) && f.b(this.R, c1520b.R) && f.b(this.S, c1520b.S) && f.b(this.T, c1520b.T);
    }

    public final String f() {
        return this.f30178M;
    }

    public final String g() {
        return this.f30180O;
    }

    public final String h() {
        return this.f30181P;
    }

    public final int hashCode() {
        int hashCode = this.f30183b.hashCode() * 31;
        Integer num = this.f30184c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f30185d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30186e;
        int b9 = v.b(this.f30187f, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f30188g;
        int hashCode4 = (b9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30189h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.i;
        int hashCode6 = (hashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str5 = this.f30190j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f30191k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f30192l;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f30193m;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f30194n;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f30195o;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f30196p;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f30197q;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f30198r;
        int hashCode15 = (hashCode14 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str13 = this.f30199s;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f30200t;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f30201u;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f30202v;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f30203w;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f30204x;
        int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f30205y;
        int hashCode22 = (hashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f30206z;
        int hashCode23 = (hashCode22 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str20 = this.f30166A;
        int hashCode24 = (hashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f30167B;
        int hashCode25 = (hashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f30168C;
        int hashCode26 = (hashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.f30169D;
        int hashCode27 = (hashCode26 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f30170E;
        int hashCode28 = (hashCode27 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.f30171F;
        int hashCode29 = (hashCode28 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.f30172G;
        int hashCode30 = (hashCode29 + (str26 == null ? 0 : str26.hashCode())) * 31;
        Boolean bool = this.f30173H;
        int hashCode31 = (hashCode30 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str27 = this.f30174I;
        int hashCode32 = (hashCode31 + (str27 == null ? 0 : str27.hashCode())) * 31;
        p4.a aVar = this.f30175J;
        int hashCode33 = (hashCode32 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        p4.b bVar = this.f30176K;
        int hashCode34 = (hashCode33 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str28 = this.f30177L;
        int hashCode35 = (hashCode34 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.f30178M;
        int hashCode36 = (hashCode35 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.f30179N;
        int hashCode37 = (hashCode36 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.f30180O;
        int hashCode38 = (hashCode37 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.f30181P;
        int hashCode39 = (hashCode38 + (str32 == null ? 0 : str32.hashCode())) * 31;
        Boolean bool2 = this.f30182Q;
        int hashCode40 = (hashCode39 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str33 = this.R;
        int hashCode41 = (hashCode40 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.S;
        int hashCode42 = (hashCode41 + (str34 == null ? 0 : str34.hashCode())) * 31;
        Integer num2 = this.T;
        return hashCode42 + (num2 != null ? num2.hashCode() : 0);
    }

    public final int i() {
        return this.f30187f;
    }

    public final Boolean j() {
        return this.f30182Q;
    }

    public final String k() {
        return this.f30179N;
    }

    public final Integer l() {
        return this.f30184c;
    }

    public final p4.a m() {
        return this.f30175J;
    }

    public final p4.b n() {
        return this.f30176K;
    }

    public final String o() {
        return this.f30169D;
    }

    public final String p() {
        return this.f30190j;
    }

    public final String q() {
        return this.f30191k;
    }

    public final String r() {
        return this.f30188g;
    }

    public final Integer s() {
        return this.T;
    }

    public final String t() {
        return this.f30194n;
    }

    public final String toString() {
        String str = this.f30183b;
        Integer num = this.f30184c;
        String str2 = this.f30185d;
        String str3 = this.f30186e;
        int i = this.f30187f;
        String str4 = this.f30188g;
        String str5 = this.f30189h;
        BigDecimal bigDecimal = this.i;
        String str6 = this.f30190j;
        String str7 = this.f30191k;
        String str8 = this.f30192l;
        String str9 = this.f30193m;
        String str10 = this.f30194n;
        String str11 = this.f30195o;
        String str12 = this.f30196p;
        String str13 = this.f30197q;
        BigDecimal bigDecimal2 = this.f30198r;
        String str14 = this.f30199s;
        String str15 = this.f30200t;
        String str16 = this.f30201u;
        String str17 = this.f30202v;
        String str18 = this.f30203w;
        String str19 = this.f30204x;
        String str20 = this.f30205y;
        BigDecimal bigDecimal3 = this.f30206z;
        String str21 = this.f30166A;
        String str22 = this.f30167B;
        String str23 = this.f30168C;
        String str24 = this.f30169D;
        String str25 = this.f30170E;
        String str26 = this.f30171F;
        String str27 = this.f30172G;
        Boolean bool = this.f30173H;
        String str28 = this.f30174I;
        p4.a aVar = this.f30175J;
        p4.b bVar = this.f30176K;
        String str29 = this.f30177L;
        String str30 = this.f30178M;
        String str31 = this.f30179N;
        String str32 = this.f30180O;
        String str33 = this.f30181P;
        Boolean bool2 = this.f30182Q;
        String str34 = this.R;
        String str35 = this.S;
        Integer num2 = this.T;
        StringBuilder sb2 = new StringBuilder("ProxyTransactionRaw(id=");
        sb2.append(str);
        sb2.append(", clientId=");
        sb2.append(num);
        sb2.append(", providerTxId=");
        androidx.camera.core.impl.utils.a.u(sb2, str2, ", providerTime=", str3, ", beneficiaryId=");
        sb2.append(i);
        sb2.append(", direction=");
        sb2.append(str4);
        sb2.append(", paymentMethod=");
        sb2.append(str5);
        sb2.append(", amount=");
        sb2.append(bigDecimal);
        sb2.append(", currency=");
        androidx.camera.core.impl.utils.a.u(sb2, str6, ", details=", str7, ", fromName=");
        androidx.camera.core.impl.utils.a.u(sb2, str8, ", fromEmail=", str9, ", fromAccount=");
        androidx.camera.core.impl.utils.a.u(sb2, str10, ", fromIban=", str11, ", fromBicSwift=");
        androidx.camera.core.impl.utils.a.u(sb2, str12, ", fromGbSortCode=", str13, ", fromAmount=");
        sb2.append(bigDecimal2);
        sb2.append(", fromCurrency=");
        sb2.append(str14);
        sb2.append(", toName=");
        androidx.camera.core.impl.utils.a.u(sb2, str15, ", toAccount=", str16, ", toGbAccount=");
        androidx.camera.core.impl.utils.a.u(sb2, str17, ", toIban=", str18, ", toBicSwift=");
        androidx.camera.core.impl.utils.a.u(sb2, str19, ", toGbSortCode=", str20, ", toAmount=");
        sb2.append(bigDecimal3);
        sb2.append(", toCurrency=");
        sb2.append(str21);
        sb2.append(", status=");
        androidx.camera.core.impl.utils.a.u(sb2, str22, ", toEmail=", str23, ", createdAt=");
        androidx.camera.core.impl.utils.a.u(sb2, str24, ", uuid=", str25, ", invoiceFilename=");
        androidx.camera.core.impl.utils.a.u(sb2, str26, ", invoiceDescription=", str27, ", hasInvoice=");
        sb2.append(bool);
        sb2.append(", providerTxSignerStatus=");
        sb2.append(str28);
        sb2.append(", commisions=");
        sb2.append(aVar);
        sb2.append(", confirmation=");
        sb2.append(bVar);
        sb2.append(", beneficiaryAddressLine1=");
        androidx.camera.core.impl.utils.a.u(sb2, str29, ", beneficiaryAddressLine2=", str30, ", beneficiaryPostalCode=");
        androidx.camera.core.impl.utils.a.u(sb2, str31, ", beneficiaryCity=", str32, ", beneficiaryCountry=");
        sb2.append(str33);
        sb2.append(", beneficiaryIntermediaryBank=");
        sb2.append(bool2);
        sb2.append(", bankName=");
        androidx.camera.core.impl.utils.a.u(sb2, str34, ", bankSwift=", str35, ", exchangeRequestId=");
        sb2.append(num2);
        sb2.append(")");
        return sb2.toString();
    }

    public final BigDecimal u() {
        return this.f30198r;
    }

    public final String v() {
        return this.f30196p;
    }

    public final String w() {
        return this.f30199s;
    }

    public final String x() {
        return this.f30193m;
    }

    public final String y() {
        return this.f30197q;
    }

    public final String z() {
        return this.f30195o;
    }
}
