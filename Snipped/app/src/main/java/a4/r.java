package a4;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PaymentInternalRequestRaw.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("bank_account_id")
    private final String f4370a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("receiver_legal_type")
    private final String f4371b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("amount")
    private final BigDecimal f4372c;

    /* renamed from: d, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f4373d;

    /* renamed from: e, reason: collision with root package name */
    @l3.b("receiver_email")
    private final String f4374e;

    /* renamed from: f, reason: collision with root package name */
    @l3.b(ErrorBundle.DETAIL_ENTRY)
    private final String f4375f;

    /* renamed from: g, reason: collision with root package name */
    @l3.b("save_as_template")
    private final Boolean f4376g;

    /* renamed from: h, reason: collision with root package name */
    @l3.b("template_name")
    private final String f4377h;

    @l3.b("beneficiary_name")
    private final String i;

    public r(String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, Boolean bool, String str6, String str7) {
        this.f4370a = str;
        this.f4371b = str2;
        this.f4372c = bigDecimal;
        this.f4373d = str3;
        this.f4374e = str4;
        this.f4375f = str5;
        this.f4376g = bool;
        this.f4377h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.f.b(this.f4370a, rVar.f4370a) && kotlin.jvm.internal.f.b(this.f4371b, rVar.f4371b) && kotlin.jvm.internal.f.b(this.f4372c, rVar.f4372c) && kotlin.jvm.internal.f.b(this.f4373d, rVar.f4373d) && kotlin.jvm.internal.f.b(this.f4374e, rVar.f4374e) && kotlin.jvm.internal.f.b(this.f4375f, rVar.f4375f) && kotlin.jvm.internal.f.b(this.f4376g, rVar.f4376g) && kotlin.jvm.internal.f.b(this.f4377h, rVar.f4377h) && kotlin.jvm.internal.f.b(this.i, rVar.i);
    }

    public final int hashCode() {
        int c2 = C.v.c(C.v.c(C.v.c((this.f4372c.hashCode() + C.v.c(this.f4370a.hashCode() * 31, 31, this.f4371b)) * 31, 31, this.f4373d), 31, this.f4374e), 31, this.f4375f);
        Boolean bool = this.f4376g;
        int hashCode = (c2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f4377h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f4370a;
        String str2 = this.f4371b;
        BigDecimal bigDecimal = this.f4372c;
        String str3 = this.f4373d;
        String str4 = this.f4374e;
        String str5 = this.f4375f;
        Boolean bool = this.f4376g;
        String str6 = this.f4377h;
        String str7 = this.i;
        StringBuilder p10 = s3.b.p("PaymentInternalRequestRaw(bankAccountId=", str, ", receiverLegalType=", str2, ", amount=");
        p10.append(bigDecimal);
        p10.append(", currency=");
        p10.append(str3);
        p10.append(", receiverEmail=");
        androidx.camera.core.impl.utils.a.u(p10, str4, ", details=", str5, ", isSave=");
        p10.append(bool);
        p10.append(", templateName=");
        p10.append(str6);
        p10.append(", beneficiaryName=");
        return androidx.camera.core.impl.utils.a.n(p10, str7, ")");
    }
}
