package o7;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: DepositCryptoFragmentArgs.kt */
/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1092b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f24390a;

    public C1092b(CryptoAccountDomain cryptoAccountDomain) {
        this.f24390a = cryptoAccountDomain;
    }

    public static final C1092b fromBundle(Bundle bundle) {
        if (!v.y(bundle, C1092b.class, "account")) {
            throw new IllegalArgumentException("Required argument \"account\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(CryptoAccountDomain.class) || Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
            return new C1092b((CryptoAccountDomain) bundle.get("account"));
        }
        throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1092b) && f.b(this.f24390a, ((C1092b) obj).f24390a);
    }

    public final int hashCode() {
        CryptoAccountDomain cryptoAccountDomain = this.f24390a;
        if (cryptoAccountDomain == null) {
            return 0;
        }
        return cryptoAccountDomain.hashCode();
    }

    public final String toString() {
        return "DepositCryptoFragmentArgs(account=" + this.f24390a + ")";
    }
}
