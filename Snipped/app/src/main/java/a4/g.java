package a4;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;

/* compiled from: CommissionsRequestRaw.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("payment_method")
    private final String f4302a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("amount")
    private final BigDecimal f4303b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b(FirebaseAnalytics.Param.CURRENCY)
    private final String f4304c;

    public g(String str, BigDecimal bigDecimal, String str2) {
        this.f4302a = str;
        this.f4303b = bigDecimal;
        this.f4304c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f4302a, gVar.f4302a) && kotlin.jvm.internal.f.b(this.f4303b, gVar.f4303b) && kotlin.jvm.internal.f.b(this.f4304c, gVar.f4304c);
    }

    public final int hashCode() {
        return this.f4304c.hashCode() + ((this.f4303b.hashCode() + (this.f4302a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.f4302a;
        BigDecimal bigDecimal = this.f4303b;
        String str2 = this.f4304c;
        StringBuilder sb2 = new StringBuilder("CommissionsRequestRaw(paymentMethod=");
        sb2.append(str);
        sb2.append(", amount=");
        sb2.append(bigDecimal);
        sb2.append(", currency=");
        return androidx.camera.core.impl.utils.a.n(sb2, str2, ")");
    }
}
