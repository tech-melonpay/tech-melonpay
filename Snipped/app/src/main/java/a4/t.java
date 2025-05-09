package a4;

import java.math.BigDecimal;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PaymentSepaRequestRaw.kt */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("to_iban")
    private final String f4386a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("to_bic_swift")
    private final String f4387b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("amount")
    private final BigDecimal f4388c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b(ErrorBundle.DETAIL_ENTRY)
    private final String f4389d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("save_as_template")
    private final Boolean f4390e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("template_name")
    private final String f4391f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("beneficiary_name")
    private final String f4392g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("beneficiary_type")
    private final String f4393h;

    public t(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal) {
        this.f4386a = str;
        this.f4387b = str2;
        this.f4388c = bigDecimal;
        this.f4389d = str3;
        this.f4390e = bool;
        this.f4391f = str4;
        this.f4392g = str5;
        this.f4393h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.f.b(this.f4386a, tVar.f4386a) && kotlin.jvm.internal.f.b(this.f4387b, tVar.f4387b) && kotlin.jvm.internal.f.b(this.f4388c, tVar.f4388c) && kotlin.jvm.internal.f.b(this.f4389d, tVar.f4389d) && kotlin.jvm.internal.f.b(this.f4390e, tVar.f4390e) && kotlin.jvm.internal.f.b(this.f4391f, tVar.f4391f) && kotlin.jvm.internal.f.b(this.f4392g, tVar.f4392g) && kotlin.jvm.internal.f.b(this.f4393h, tVar.f4393h);
    }

    public final int hashCode() {
        int c2 = C.v.c((this.f4388c.hashCode() + C.v.c(this.f4386a.hashCode() * 31, 31, this.f4387b)) * 31, 31, this.f4389d);
        Boolean bool = this.f4390e;
        int hashCode = (c2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f4391f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4392g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4393h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f4386a;
        String str2 = this.f4387b;
        BigDecimal bigDecimal = this.f4388c;
        String str3 = this.f4389d;
        Boolean bool = this.f4390e;
        String str4 = this.f4391f;
        String str5 = this.f4392g;
        String str6 = this.f4393h;
        StringBuilder p10 = s3.b.p("PaymentSepaRequestRaw(toIban=", str, ", toBicSwift=", str2, ", amount=");
        p10.append(bigDecimal);
        p10.append(", details=");
        p10.append(str3);
        p10.append(", isSave=");
        p10.append(bool);
        p10.append(", templateName=");
        p10.append(str4);
        p10.append(", beneficiaryName=");
        return s3.b.o(p10, str5, ", beneficiaryType=", str6, ")");
    }
}
