package v4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.f;

/* compiled from: TransferTemplateRaw.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    @l3.b("email")
    private final String f30575A;

    /* renamed from: a, reason: collision with root package name */
    @l3.b("id")
    private final Long f30576a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("client_id")
    private final Long f30577b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("uuid")
    private final String f30578c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("pretty_name")
    private final String f30579d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String f30580e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("legal_type")
    private final String f30581f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("payment_method")
    private final String f30582g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f30583h;

    @l3.b("iban")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("bic_swift")
    private final String f30584j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("gb_account")
    private final String f30585k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("gb_sort_code")
    private final String f30586l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("status")
    private final String f30587m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("created_at")
    private final String f30588n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("updated_at")
    private final String f30589o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("bank_country")
    private final String f30590p;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("country")
    private final String f30591q;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("beneficiary_address_line_1")
    private final String f30592r;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("beneficiary_address_line_2")
    private final String f30593s;

    /* renamed from: t, reason: collision with root package name */
    @l3.b("beneficiary_postal_code")
    private final String f30594t;

    /* renamed from: u, reason: collision with root package name */
    @l3.b("beneficiary_city")
    private final String f30595u;

    /* renamed from: v, reason: collision with root package name */
    @l3.b("beneficiary_country")
    private final String f30596v;

    /* renamed from: w, reason: collision with root package name */
    @l3.b("beneficiary_intermediary_bank")
    private final Boolean f30597w;

    /* renamed from: x, reason: collision with root package name */
    @l3.b("beneficiary_intermediary_bank_name")
    private final String f30598x;

    /* renamed from: y, reason: collision with root package name */
    @l3.b("beneficiary_intermediary_bank_swift")
    private final String f30599y;

    /* renamed from: z, reason: collision with root package name */
    @l3.b("to_account")
    private final String f30600z;

    public final String A() {
        return this.f30578c;
    }

    public final String a() {
        return this.f30590p;
    }

    public final String b() {
        return this.f30598x;
    }

    public final String c() {
        return this.f30599y;
    }

    public final String d() {
        return this.f30592r;
    }

    public final String e() {
        return this.f30593s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f30576a, dVar.f30576a) && f.b(this.f30577b, dVar.f30577b) && f.b(this.f30578c, dVar.f30578c) && f.b(this.f30579d, dVar.f30579d) && f.b(this.f30580e, dVar.f30580e) && f.b(this.f30581f, dVar.f30581f) && f.b(this.f30582g, dVar.f30582g) && f.b(this.f30583h, dVar.f30583h) && f.b(this.i, dVar.i) && f.b(this.f30584j, dVar.f30584j) && f.b(this.f30585k, dVar.f30585k) && f.b(this.f30586l, dVar.f30586l) && f.b(this.f30587m, dVar.f30587m) && f.b(this.f30588n, dVar.f30588n) && f.b(this.f30589o, dVar.f30589o) && f.b(this.f30590p, dVar.f30590p) && f.b(this.f30591q, dVar.f30591q) && f.b(this.f30592r, dVar.f30592r) && f.b(this.f30593s, dVar.f30593s) && f.b(this.f30594t, dVar.f30594t) && f.b(this.f30595u, dVar.f30595u) && f.b(this.f30596v, dVar.f30596v) && f.b(this.f30597w, dVar.f30597w) && f.b(this.f30598x, dVar.f30598x) && f.b(this.f30599y, dVar.f30599y) && f.b(this.f30600z, dVar.f30600z) && f.b(this.f30575A, dVar.f30575A);
    }

    public final String f() {
        return this.f30595u;
    }

    public final String g() {
        return this.f30596v;
    }

    public final Boolean h() {
        return this.f30597w;
    }

    public final int hashCode() {
        Long l10 = this.f30576a;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.f30577b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f30578c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30579d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f30580e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f30581f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f30582g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f30583h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f30584j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f30585k;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f30586l;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f30587m;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f30588n;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f30589o;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f30590p;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f30591q;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f30592r;
        int hashCode18 = (hashCode17 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f30593s;
        int hashCode19 = (hashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f30594t;
        int hashCode20 = (hashCode19 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f30595u;
        int hashCode21 = (hashCode20 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.f30596v;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Boolean bool = this.f30597w;
        int hashCode23 = (hashCode22 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str21 = this.f30598x;
        int hashCode24 = (hashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.f30599y;
        int hashCode25 = (hashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.f30600z;
        int hashCode26 = (hashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.f30575A;
        return hashCode26 + (str24 != null ? str24.hashCode() : 0);
    }

    public final String i() {
        return this.f30594t;
    }

    public final String j() {
        return this.f30584j;
    }

    public final Long k() {
        return this.f30577b;
    }

    public final String l() {
        return this.f30591q;
    }

    public final String m() {
        return this.f30588n;
    }

    public final String n() {
        return this.f30583h;
    }

    public final String o() {
        return this.f30575A;
    }

    public final String p() {
        return this.f30585k;
    }

    public final String q() {
        return this.f30586l;
    }

    public final String r() {
        return this.i;
    }

    public final Long s() {
        return this.f30576a;
    }

    public final String t() {
        return this.f30581f;
    }

    public final String toString() {
        Long l10 = this.f30576a;
        Long l11 = this.f30577b;
        String str = this.f30578c;
        String str2 = this.f30579d;
        String str3 = this.f30580e;
        String str4 = this.f30581f;
        String str5 = this.f30582g;
        String str6 = this.f30583h;
        String str7 = this.i;
        String str8 = this.f30584j;
        String str9 = this.f30585k;
        String str10 = this.f30586l;
        String str11 = this.f30587m;
        String str12 = this.f30588n;
        String str13 = this.f30589o;
        String str14 = this.f30590p;
        String str15 = this.f30591q;
        String str16 = this.f30592r;
        String str17 = this.f30593s;
        String str18 = this.f30594t;
        String str19 = this.f30595u;
        String str20 = this.f30596v;
        Boolean bool = this.f30597w;
        String str21 = this.f30598x;
        String str22 = this.f30599y;
        String str23 = this.f30600z;
        String str24 = this.f30575A;
        StringBuilder sb2 = new StringBuilder("TransferTemplateRaw(id=");
        sb2.append(l10);
        sb2.append(", clientId=");
        sb2.append(l11);
        sb2.append(", uuid=");
        androidx.camera.core.impl.utils.a.u(sb2, str, ", prettyName=", str2, ", name=");
        androidx.camera.core.impl.utils.a.u(sb2, str3, ", legalType=", str4, ", paymentMethod=");
        androidx.camera.core.impl.utils.a.u(sb2, str5, ", currency=", str6, ", iban=");
        androidx.camera.core.impl.utils.a.u(sb2, str7, ", bicSwift=", str8, ", gbAccount=");
        androidx.camera.core.impl.utils.a.u(sb2, str9, ", gbSortCode=", str10, ", status=");
        androidx.camera.core.impl.utils.a.u(sb2, str11, ", createdAt=", str12, ", updatedAt=");
        androidx.camera.core.impl.utils.a.u(sb2, str13, ", bankCountry=", str14, ", country=");
        androidx.camera.core.impl.utils.a.u(sb2, str15, ", beneficiaryAddressLine1=", str16, ", beneficiaryAddressLine2=");
        androidx.camera.core.impl.utils.a.u(sb2, str17, ", beneficiaryPostalCode=", str18, ", beneficiaryCity=");
        androidx.camera.core.impl.utils.a.u(sb2, str19, ", beneficiaryCountry=", str20, ", beneficiaryIntermediaryBank=");
        sb2.append(bool);
        sb2.append(", bankName=");
        sb2.append(str21);
        sb2.append(", bankSwift=");
        androidx.camera.core.impl.utils.a.u(sb2, str22, ", toAccount=", str23, ", email=");
        return androidx.camera.core.impl.utils.a.n(sb2, str24, ")");
    }

    public final String u() {
        return this.f30580e;
    }

    public final String v() {
        return this.f30582g;
    }

    public final String w() {
        return this.f30579d;
    }

    public final String x() {
        return this.f30587m;
    }

    public final String y() {
        return this.f30600z;
    }

    public final String z() {
        return this.f30589o;
    }
}
