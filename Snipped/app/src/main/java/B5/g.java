package B5;

import C.v;
import java.math.BigDecimal;

/* compiled from: PaymentSepaRequestDomain.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f324a;

    /* renamed from: b, reason: collision with root package name */
    public final String f325b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f326c;

    /* renamed from: d, reason: collision with root package name */
    public final String f327d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f328e;

    /* renamed from: f, reason: collision with root package name */
    public final String f329f;

    /* renamed from: g, reason: collision with root package name */
    public final String f330g;

    /* renamed from: h, reason: collision with root package name */
    public final String f331h;

    public g(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal) {
        this.f324a = str;
        this.f325b = str2;
        this.f326c = bigDecimal;
        this.f327d = str3;
        this.f328e = bool;
        this.f329f = str4;
        this.f330g = str5;
        this.f331h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f324a, gVar.f324a) && kotlin.jvm.internal.f.b(this.f325b, gVar.f325b) && kotlin.jvm.internal.f.b(this.f326c, gVar.f326c) && kotlin.jvm.internal.f.b(this.f327d, gVar.f327d) && kotlin.jvm.internal.f.b(this.f328e, gVar.f328e) && kotlin.jvm.internal.f.b(this.f329f, gVar.f329f) && kotlin.jvm.internal.f.b(this.f330g, gVar.f330g) && kotlin.jvm.internal.f.b(this.f331h, gVar.f331h);
    }

    public final int hashCode() {
        int c2 = v.c((this.f326c.hashCode() + v.c(this.f324a.hashCode() * 31, 31, this.f325b)) * 31, 31, this.f327d);
        Boolean bool = this.f328e;
        int hashCode = (c2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f329f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f330g;
        return this.f331h.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentSepaRequestDomain(toIban=");
        sb2.append(this.f324a);
        sb2.append(", toBicSwift=");
        sb2.append(this.f325b);
        sb2.append(", amount=");
        sb2.append(this.f326c);
        sb2.append(", details=");
        sb2.append(this.f327d);
        sb2.append(", isSave=");
        sb2.append(this.f328e);
        sb2.append(", templateName=");
        sb2.append(this.f329f);
        sb2.append(", beneficaryName=");
        sb2.append(this.f330g);
        sb2.append(", beneficiaryType=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f331h, ")");
    }
}
