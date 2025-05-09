package a4;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: SwiftRequestRaw.kt */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("to_account")
    private final String f4416a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("to_bic_swift")
    private final String f4417b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f4418c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b("amount")
    private final BigDecimal f4419d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b(ErrorBundle.DETAIL_ENTRY)
    private final String f4420e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("beneficiary_bank_name")
    private final String f4421f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("beneficiary_bank_city")
    private final String f4422g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("beneficiary_bank_address")
    private final String f4423h;

    @l3.b("beneficiary_bank_country")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("beneficiary_name")
    private final String f4424j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("beneficiary_type")
    private final String f4425k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("save_as_template")
    private final boolean f4426l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("template_name")
    private final String f4427m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("beneficiary_address_line_1")
    private final String f4428n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("beneficiary_address_line_2")
    private final String f4429o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("beneficiary_postal_code")
    private final String f4430p;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("beneficiary_city")
    private final String f4431q;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("beneficiary_country")
    private final String f4432r;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("beneficiary_intermediary_bank")
    private final Boolean f4433s;

    /* renamed from: t, reason: collision with root package name */
    @l3.b("beneficiary_intermediary_bank_name")
    private final String f4434t;

    /* renamed from: u, reason: collision with root package name */
    @l3.b("beneficiary_intermediary_bank_swift")
    private final String f4435u;

    public w(String str, String str2, String str3, BigDecimal bigDecimal, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, String str17, String str18) {
        this.f4416a = str;
        this.f4417b = str2;
        this.f4418c = str3;
        this.f4419d = bigDecimal;
        this.f4420e = str4;
        this.f4421f = str5;
        this.f4422g = str6;
        this.f4423h = str7;
        this.i = str8;
        this.f4424j = str9;
        this.f4425k = str10;
        this.f4426l = z10;
        this.f4427m = str11;
        this.f4428n = str12;
        this.f4429o = str13;
        this.f4430p = str14;
        this.f4431q = str15;
        this.f4432r = str16;
        this.f4433s = bool;
        this.f4434t = str17;
        this.f4435u = str18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.f.b(this.f4416a, wVar.f4416a) && kotlin.jvm.internal.f.b(this.f4417b, wVar.f4417b) && kotlin.jvm.internal.f.b(this.f4418c, wVar.f4418c) && kotlin.jvm.internal.f.b(this.f4419d, wVar.f4419d) && kotlin.jvm.internal.f.b(this.f4420e, wVar.f4420e) && kotlin.jvm.internal.f.b(this.f4421f, wVar.f4421f) && kotlin.jvm.internal.f.b(this.f4422g, wVar.f4422g) && kotlin.jvm.internal.f.b(this.f4423h, wVar.f4423h) && kotlin.jvm.internal.f.b(this.i, wVar.i) && kotlin.jvm.internal.f.b(this.f4424j, wVar.f4424j) && kotlin.jvm.internal.f.b(this.f4425k, wVar.f4425k) && this.f4426l == wVar.f4426l && kotlin.jvm.internal.f.b(this.f4427m, wVar.f4427m) && kotlin.jvm.internal.f.b(this.f4428n, wVar.f4428n) && kotlin.jvm.internal.f.b(this.f4429o, wVar.f4429o) && kotlin.jvm.internal.f.b(this.f4430p, wVar.f4430p) && kotlin.jvm.internal.f.b(this.f4431q, wVar.f4431q) && kotlin.jvm.internal.f.b(this.f4432r, wVar.f4432r) && kotlin.jvm.internal.f.b(this.f4433s, wVar.f4433s) && kotlin.jvm.internal.f.b(this.f4434t, wVar.f4434t) && kotlin.jvm.internal.f.b(this.f4435u, wVar.f4435u);
    }

    public final int hashCode() {
        int hashCode = (this.f4419d.hashCode() + C.v.c(C.v.c(this.f4416a.hashCode() * 31, 31, this.f4417b), 31, this.f4418c)) * 31;
        String str = this.f4420e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4421f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4422g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f4423h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int d10 = C.v.d(C.v.c(C.v.c((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f4424j), 31, this.f4425k), 31, this.f4426l);
        String str6 = this.f4427m;
        int hashCode6 = (d10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f4428n;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f4429o;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f4430p;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f4431q;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f4432r;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.f4433s;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str12 = this.f4434t;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f4435u;
        return hashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f4416a;
        String str2 = this.f4417b;
        String str3 = this.f4418c;
        BigDecimal bigDecimal = this.f4419d;
        String str4 = this.f4420e;
        String str5 = this.f4421f;
        String str6 = this.f4422g;
        String str7 = this.f4423h;
        String str8 = this.i;
        String str9 = this.f4424j;
        String str10 = this.f4425k;
        boolean z10 = this.f4426l;
        String str11 = this.f4427m;
        String str12 = this.f4428n;
        String str13 = this.f4429o;
        String str14 = this.f4430p;
        String str15 = this.f4431q;
        String str16 = this.f4432r;
        Boolean bool = this.f4433s;
        String str17 = this.f4434t;
        String str18 = this.f4435u;
        StringBuilder p10 = s3.b.p("SwiftRequestRaw(toAccount=", str, ", toBicSwift=", str2, ", currency=");
        p10.append(str3);
        p10.append(", amount=");
        p10.append(bigDecimal);
        p10.append(", details=");
        androidx.camera.core.impl.utils.a.u(p10, str4, ", beneficiaryBankName=", str5, ", beneficiaryBankCity=");
        androidx.camera.core.impl.utils.a.u(p10, str6, ", beneficiaryBankAddress=", str7, ", beneficiaryBankCountry=");
        androidx.camera.core.impl.utils.a.u(p10, str8, ", beneficiaryName=", str9, ", beneficiaryType=");
        p10.append(str10);
        p10.append(", saveAsTemplate=");
        p10.append(z10);
        p10.append(", templateName=");
        androidx.camera.core.impl.utils.a.u(p10, str11, ", beneficiaryAddressLine1=", str12, ", beneficiaryAddressLine2=");
        androidx.camera.core.impl.utils.a.u(p10, str13, ", beneficiaryPostalCode=", str14, ", beneficiaryCity=");
        androidx.camera.core.impl.utils.a.u(p10, str15, ", beneficiaryCountry=", str16, ", beneficiaryIntermediaryBank=");
        p10.append(bool);
        p10.append(", bankName=");
        p10.append(str17);
        p10.append(", bankSwift=");
        return androidx.camera.core.impl.utils.a.n(p10, str18, ")");
    }
}
