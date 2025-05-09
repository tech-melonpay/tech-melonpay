package v5;

import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;

/* compiled from: CreateCryptoExchangeDomain.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoExchangeDomain f30603a;

    /* renamed from: b, reason: collision with root package name */
    public final F5.b f30604b;

    public b(CryptoExchangeDomain cryptoExchangeDomain, F5.b bVar) {
        this.f30603a = cryptoExchangeDomain;
        this.f30604b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.f.b(this.f30603a, bVar.f30603a) && kotlin.jvm.internal.f.b(this.f30604b, bVar.f30604b);
    }

    public final int hashCode() {
        CryptoExchangeDomain cryptoExchangeDomain = this.f30603a;
        int hashCode = (cryptoExchangeDomain == null ? 0 : cryptoExchangeDomain.hashCode()) * 31;
        F5.b bVar = this.f30604b;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "CreateCryptoExchangeDomain(exchange=" + this.f30603a + ", transaction=" + this.f30604b + ")";
    }
}
