package B5;

import java.math.BigDecimal;

/* compiled from: CommissionsRequestDomain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f299a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f300b;

    /* renamed from: c, reason: collision with root package name */
    public final String f301c;

    public b(String str, BigDecimal bigDecimal, String str2) {
        this.f299a = str;
        this.f300b = bigDecimal;
        this.f301c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f299a, bVar.f299a) && kotlin.jvm.internal.f.b(this.f300b, bVar.f300b) && kotlin.jvm.internal.f.b(this.f301c, bVar.f301c);
    }

    public final int hashCode() {
        return this.f301c.hashCode() + ((this.f300b.hashCode() + (this.f299a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommissionsRequestDomain(paymentMethod=");
        sb2.append(this.f299a);
        sb2.append(", amount=");
        sb2.append(this.f300b);
        sb2.append(", currency=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f301c, ")");
    }
}
