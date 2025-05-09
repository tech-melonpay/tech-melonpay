package k4;

import e4.C0715a;
import java.util.HashMap;

/* compiled from: CurrencyRateRaw.kt */
/* loaded from: classes.dex */
public final class d extends C0715a {

    /* renamed from: b, reason: collision with root package name */
    @l3.b("source_currency")
    private final String f22957b;

    /* renamed from: c, reason: collision with root package name */
    @l3.b("rates")
    private final HashMap<String, Double> f22958c;

    public final HashMap<String, Double> b() {
        return this.f22958c;
    }

    public final String c() {
        return this.f22957b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f22957b, dVar.f22957b) && kotlin.jvm.internal.f.b(this.f22958c, dVar.f22958c);
    }

    public final int hashCode() {
        return this.f22958c.hashCode() + (this.f22957b.hashCode() * 31);
    }

    public final String toString() {
        return "CurrencyRateRaw(sourceCurrency=" + this.f22957b + ", rates=" + this.f22958c + ")";
    }
}
