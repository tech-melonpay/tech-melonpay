package v5;

import java.util.HashMap;

/* compiled from: CurrencyRateDomain.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f30651a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, Double> f30652b;

    public j(String str, HashMap<String, Double> hashMap) {
        this.f30651a = str;
        this.f30652b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.f.b(this.f30651a, jVar.f30651a) && kotlin.jvm.internal.f.b(this.f30652b, jVar.f30652b);
    }

    public final int hashCode() {
        return this.f30652b.hashCode() + (this.f30651a.hashCode() * 31);
    }

    public final String toString() {
        return "CurrencyRateDomain(sourceCurrency=" + this.f30651a + ", rates=" + this.f30652b + ")";
    }
}
