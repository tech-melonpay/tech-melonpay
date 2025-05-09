package a4;

import java.math.BigDecimal;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PaymentLocalRequestRaw.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("to_gb_account")
    private final String f4378a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("to_gb_sort_code")
    private final String f4379b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("amount")
    private final BigDecimal f4380c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b(ErrorBundle.DETAIL_ENTRY)
    private final String f4381d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("save_as_template")
    private final Boolean f4382e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b("template_name")
    private final String f4383f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("beneficiary_name")
    private final String f4384g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("beneficiary_type")
    private final String f4385h;

    public s(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal) {
        this.f4378a = str;
        this.f4379b = str2;
        this.f4380c = bigDecimal;
        this.f4381d = str3;
        this.f4382e = bool;
        this.f4383f = str4;
        this.f4384g = str5;
        this.f4385h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.f.b(this.f4378a, sVar.f4378a) && kotlin.jvm.internal.f.b(this.f4379b, sVar.f4379b) && kotlin.jvm.internal.f.b(this.f4380c, sVar.f4380c) && kotlin.jvm.internal.f.b(this.f4381d, sVar.f4381d) && kotlin.jvm.internal.f.b(this.f4382e, sVar.f4382e) && kotlin.jvm.internal.f.b(this.f4383f, sVar.f4383f) && kotlin.jvm.internal.f.b(this.f4384g, sVar.f4384g) && kotlin.jvm.internal.f.b(this.f4385h, sVar.f4385h);
    }

    public final int hashCode() {
        int hashCode = (this.f4380c.hashCode() + C.v.c(this.f4378a.hashCode() * 31, 31, this.f4379b)) * 31;
        String str = this.f4381d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f4382e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f4383f;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4384g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f4385h;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f4378a;
        String str2 = this.f4379b;
        BigDecimal bigDecimal = this.f4380c;
        String str3 = this.f4381d;
        Boolean bool = this.f4382e;
        String str4 = this.f4383f;
        String str5 = this.f4384g;
        String str6 = this.f4385h;
        StringBuilder p10 = s3.b.p("PaymentLocalRequestRaw(toGbAccount=", str, ", toGbSortCode=", str2, ", amount=");
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
