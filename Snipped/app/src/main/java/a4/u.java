package a4;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PaymentToBankAccountRequestRaw.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("bank_account_id")
    private final String f4394a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("to_account")
    private final String f4395b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("to_bic_swift")
    private final String f4396c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f4397d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("amount")
    private final BigDecimal f4398e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b(ErrorBundle.DETAIL_ENTRY)
    private final String f4399f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("beneficiary_bank_name")
    private final String f4400g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("beneficiary_bank_city")
    private final String f4401h;

    @l3.b("beneficiary_bank_address")
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    @l3.b("beneficiary_bank_country")
    private final String f4402j;

    /* renamed from: k, reason: collision with root package name */
    @l3.b("beneficiary_name")
    private final String f4403k;

    /* renamed from: l, reason: collision with root package name */
    @l3.b("beneficiary_type")
    private final String f4404l;

    /* renamed from: m, reason: collision with root package name */
    @l3.b("save_as_template")
    private final boolean f4405m;

    /* renamed from: n, reason: collision with root package name */
    @l3.b("template_name")
    private final String f4406n;

    /* renamed from: o, reason: collision with root package name */
    @l3.b("beneficiary_address_line_1")
    private final String f4407o;

    /* renamed from: p, reason: collision with root package name */
    @l3.b("beneficiary_address_line_2")
    private final String f4408p;

    /* renamed from: q, reason: collision with root package name */
    @l3.b("beneficiary_postal_code")
    private final String f4409q;

    /* renamed from: r, reason: collision with root package name */
    @l3.b("beneficiary_city")
    private final String f4410r;

    /* renamed from: s, reason: collision with root package name */
    @l3.b("beneficiary_country")
    private final String f4411s;

    /* renamed from: t, reason: collision with root package name */
    @l3.b("beneficiary_intermediary_bank")
    private final Boolean f4412t;

    /* renamed from: u, reason: collision with root package name */
    @l3.b("beneficiary_intermediary_bank_name")
    private final String f4413u;

    /* renamed from: v, reason: collision with root package name */
    @l3.b("beneficiary_intermediary_bank_swift")
    private final String f4414v;

    public u(String str, String str2, String str3, String str4, BigDecimal bigDecimal, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z10, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, String str18, String str19) {
        this.f4394a = str;
        this.f4395b = str2;
        this.f4396c = str3;
        this.f4397d = str4;
        this.f4398e = bigDecimal;
        this.f4399f = str5;
        this.f4400g = str6;
        this.f4401h = str7;
        this.i = str8;
        this.f4402j = str9;
        this.f4403k = str10;
        this.f4404l = str11;
        this.f4405m = z10;
        this.f4406n = str12;
        this.f4407o = str13;
        this.f4408p = str14;
        this.f4409q = str15;
        this.f4410r = str16;
        this.f4411s = str17;
        this.f4412t = bool;
        this.f4413u = str18;
        this.f4414v = str19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.f.b(this.f4394a, uVar.f4394a) && kotlin.jvm.internal.f.b(this.f4395b, uVar.f4395b) && kotlin.jvm.internal.f.b(this.f4396c, uVar.f4396c) && kotlin.jvm.internal.f.b(this.f4397d, uVar.f4397d) && kotlin.jvm.internal.f.b(this.f4398e, uVar.f4398e) && kotlin.jvm.internal.f.b(this.f4399f, uVar.f4399f) && kotlin.jvm.internal.f.b(this.f4400g, uVar.f4400g) && kotlin.jvm.internal.f.b(this.f4401h, uVar.f4401h) && kotlin.jvm.internal.f.b(this.i, uVar.i) && kotlin.jvm.internal.f.b(this.f4402j, uVar.f4402j) && kotlin.jvm.internal.f.b(this.f4403k, uVar.f4403k) && kotlin.jvm.internal.f.b(this.f4404l, uVar.f4404l) && this.f4405m == uVar.f4405m && kotlin.jvm.internal.f.b(this.f4406n, uVar.f4406n) && kotlin.jvm.internal.f.b(this.f4407o, uVar.f4407o) && kotlin.jvm.internal.f.b(this.f4408p, uVar.f4408p) && kotlin.jvm.internal.f.b(this.f4409q, uVar.f4409q) && kotlin.jvm.internal.f.b(this.f4410r, uVar.f4410r) && kotlin.jvm.internal.f.b(this.f4411s, uVar.f4411s) && kotlin.jvm.internal.f.b(this.f4412t, uVar.f4412t) && kotlin.jvm.internal.f.b(this.f4413u, uVar.f4413u) && kotlin.jvm.internal.f.b(this.f4414v, uVar.f4414v);
    }

    public final int hashCode() {
        int hashCode = (this.f4398e.hashCode() + C.v.c(C.v.c(C.v.c(this.f4394a.hashCode() * 31, 31, this.f4395b), 31, this.f4396c), 31, this.f4397d)) * 31;
        String str = this.f4399f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4400g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4401h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f4402j;
        int d10 = C.v.d(C.v.c(C.v.c((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f4403k), 31, this.f4404l), 31, this.f4405m);
        String str6 = this.f4406n;
        int hashCode6 = (d10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f4407o;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f4408p;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f4409q;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f4410r;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f4411s;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.f4412t;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str12 = this.f4413u;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f4414v;
        return hashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f4394a;
        String str2 = this.f4395b;
        String str3 = this.f4396c;
        String str4 = this.f4397d;
        BigDecimal bigDecimal = this.f4398e;
        String str5 = this.f4399f;
        String str6 = this.f4400g;
        String str7 = this.f4401h;
        String str8 = this.i;
        String str9 = this.f4402j;
        String str10 = this.f4403k;
        String str11 = this.f4404l;
        boolean z10 = this.f4405m;
        String str12 = this.f4406n;
        String str13 = this.f4407o;
        String str14 = this.f4408p;
        String str15 = this.f4409q;
        String str16 = this.f4410r;
        String str17 = this.f4411s;
        Boolean bool = this.f4412t;
        String str18 = this.f4413u;
        String str19 = this.f4414v;
        StringBuilder p10 = s3.b.p("PaymentToBankAccountRequestRaw(bankAccountId=", str, ", toAccount=", str2, ", toBicSwift=");
        androidx.camera.core.impl.utils.a.u(p10, str3, ", currency=", str4, ", amount=");
        p10.append(bigDecimal);
        p10.append(", details=");
        p10.append(str5);
        p10.append(", beneficiaryBankName=");
        androidx.camera.core.impl.utils.a.u(p10, str6, ", beneficiaryBankCity=", str7, ", beneficiaryBankAddress=");
        androidx.camera.core.impl.utils.a.u(p10, str8, ", beneficiaryBankCountry=", str9, ", beneficiaryName=");
        androidx.camera.core.impl.utils.a.u(p10, str10, ", beneficiaryType=", str11, ", saveAsTemplate=");
        p10.append(z10);
        p10.append(", templateName=");
        p10.append(str12);
        p10.append(", beneficiaryAddressLine1=");
        androidx.camera.core.impl.utils.a.u(p10, str13, ", beneficiaryAddressLine2=", str14, ", beneficiaryPostalCode=");
        androidx.camera.core.impl.utils.a.u(p10, str15, ", beneficiaryCity=", str16, ", beneficiaryCountry=");
        p10.append(str17);
        p10.append(", beneficiaryIntermediaryBank=");
        p10.append(bool);
        p10.append(", bankName=");
        return s3.b.o(p10, str18, ", bankSwift=", str19, ")");
    }
}
