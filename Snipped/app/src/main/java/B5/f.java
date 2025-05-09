package B5;

import C.v;
import java.math.BigDecimal;

/* compiled from: PaymentLocalRequestDomain.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f316a;

    /* renamed from: b, reason: collision with root package name */
    public final String f317b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f318c;

    /* renamed from: d, reason: collision with root package name */
    public final String f319d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f320e;

    /* renamed from: f, reason: collision with root package name */
    public final String f321f;

    /* renamed from: g, reason: collision with root package name */
    public final String f322g;

    /* renamed from: h, reason: collision with root package name */
    public final String f323h;

    public f(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal) {
        this.f316a = str;
        this.f317b = str2;
        this.f318c = bigDecimal;
        this.f319d = str3;
        this.f320e = bool;
        this.f321f = str4;
        this.f322g = str5;
        this.f323h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f316a, fVar.f316a) && kotlin.jvm.internal.f.b(this.f317b, fVar.f317b) && kotlin.jvm.internal.f.b(this.f318c, fVar.f318c) && kotlin.jvm.internal.f.b(this.f319d, fVar.f319d) && kotlin.jvm.internal.f.b(this.f320e, fVar.f320e) && kotlin.jvm.internal.f.b(this.f321f, fVar.f321f) && kotlin.jvm.internal.f.b(this.f322g, fVar.f322g) && kotlin.jvm.internal.f.b(this.f323h, fVar.f323h);
    }

    public final int hashCode() {
        int c2 = v.c((this.f318c.hashCode() + v.c(this.f316a.hashCode() * 31, 31, this.f317b)) * 31, 31, this.f319d);
        Boolean bool = this.f320e;
        int hashCode = (c2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f321f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f322g;
        return this.f323h.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentLocalRequestDomain(toGbAccount=");
        sb2.append(this.f316a);
        sb2.append(", toGbSortCode=");
        sb2.append(this.f317b);
        sb2.append(", amount=");
        sb2.append(this.f318c);
        sb2.append(", details=");
        sb2.append(this.f319d);
        sb2.append(", isSave=");
        sb2.append(this.f320e);
        sb2.append(", templateName=");
        sb2.append(this.f321f);
        sb2.append(", beneficiaryName=");
        sb2.append(this.f322g);
        sb2.append(", beneficiaryType=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f323h, ")");
    }
}
