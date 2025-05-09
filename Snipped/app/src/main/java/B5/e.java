package B5;

import C.v;
import java.math.BigDecimal;

/* compiled from: PaymentInternalRequestDomain.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f309b = "CORPORATE";

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f310c;

    /* renamed from: d, reason: collision with root package name */
    public final String f311d;

    /* renamed from: e, reason: collision with root package name */
    public final String f312e;

    /* renamed from: f, reason: collision with root package name */
    public final String f313f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f314g;

    /* renamed from: h, reason: collision with root package name */
    public final String f315h;
    public final String i;

    public e(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal) {
        this.f308a = str;
        this.f310c = bigDecimal;
        this.f311d = str2;
        this.f312e = str3;
        this.f313f = str4;
        this.f314g = bool;
        this.f315h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f308a, eVar.f308a) && kotlin.jvm.internal.f.b(this.f309b, eVar.f309b) && kotlin.jvm.internal.f.b(this.f310c, eVar.f310c) && kotlin.jvm.internal.f.b(this.f311d, eVar.f311d) && kotlin.jvm.internal.f.b(this.f312e, eVar.f312e) && kotlin.jvm.internal.f.b(this.f313f, eVar.f313f) && kotlin.jvm.internal.f.b(this.f314g, eVar.f314g) && kotlin.jvm.internal.f.b(this.f315h, eVar.f315h) && kotlin.jvm.internal.f.b(this.i, eVar.i);
    }

    public final int hashCode() {
        int c2 = v.c(v.c(v.c((this.f310c.hashCode() + v.c(this.f308a.hashCode() * 31, 31, this.f309b)) * 31, 31, this.f311d), 31, this.f312e), 31, this.f313f);
        Boolean bool = this.f314g;
        int hashCode = (c2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f315h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentInternalRequestDomain(bankAccountId=");
        sb2.append(this.f308a);
        sb2.append(", receiverLegalType=");
        sb2.append(this.f309b);
        sb2.append(", amount=");
        sb2.append(this.f310c);
        sb2.append(", currency=");
        sb2.append(this.f311d);
        sb2.append(", receiverEmail=");
        sb2.append(this.f312e);
        sb2.append(", details=");
        sb2.append(this.f313f);
        sb2.append(", isSave=");
        sb2.append(this.f314g);
        sb2.append(", templateName=");
        sb2.append(this.f315h);
        sb2.append(", beneficiaryName=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.i, ")");
    }
}
