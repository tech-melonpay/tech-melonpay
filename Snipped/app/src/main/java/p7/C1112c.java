package p7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeDomain;
import java.io.Serializable;

/* compiled from: ExchangeDetailsFragmentArgs.kt */
/* renamed from: p7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1112c implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoExchangeDomain f25695a;

    public C1112c(CryptoExchangeDomain cryptoExchangeDomain) {
        this.f25695a = cryptoExchangeDomain;
    }

    public static final C1112c fromBundle(Bundle bundle) {
        if (!v.y(bundle, C1112c.class, "exchange")) {
            throw new IllegalArgumentException("Required argument \"exchange\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(CryptoExchangeDomain.class) || Serializable.class.isAssignableFrom(CryptoExchangeDomain.class)) {
            return new C1112c((CryptoExchangeDomain) bundle.get("exchange"));
        }
        throw new UnsupportedOperationException(CryptoExchangeDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1112c) && kotlin.jvm.internal.f.b(this.f25695a, ((C1112c) obj).f25695a);
    }

    public final int hashCode() {
        CryptoExchangeDomain cryptoExchangeDomain = this.f25695a;
        if (cryptoExchangeDomain == null) {
            return 0;
        }
        return cryptoExchangeDomain.hashCode();
    }

    public final String toString() {
        return "ExchangeDetailsFragmentArgs(exchange=" + this.f25695a + ")";
    }
}
