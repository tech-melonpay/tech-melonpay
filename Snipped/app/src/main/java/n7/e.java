package n7;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CryptoListFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class e implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final CryptowalletDomain f24256a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoAccountDomain f24257b;

    public e(CryptowalletDomain cryptowalletDomain, CryptoAccountDomain cryptoAccountDomain) {
        this.f24256a = cryptowalletDomain;
        this.f24257b = cryptoAccountDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptowalletDomain.class);
        Serializable serializable = this.f24256a;
        if (isAssignableFrom) {
            bundle.putParcelable("wallet", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptowalletDomain.class)) {
                throw new UnsupportedOperationException(CryptowalletDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("wallet", serializable);
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable2 = this.f24257b;
        if (isAssignableFrom2) {
            bundle.putParcelable("account", (Parcelable) serializable2);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("account", serializable2);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_cryptoListFragment_to_depositCryptoDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f24256a, eVar.f24256a) && kotlin.jvm.internal.f.b(this.f24257b, eVar.f24257b);
    }

    public final int hashCode() {
        CryptowalletDomain cryptowalletDomain = this.f24256a;
        int hashCode = (cryptowalletDomain == null ? 0 : cryptowalletDomain.hashCode()) * 31;
        CryptoAccountDomain cryptoAccountDomain = this.f24257b;
        return hashCode + (cryptoAccountDomain != null ? cryptoAccountDomain.hashCode() : 0);
    }

    public final String toString() {
        return "ActionCryptoListFragmentToDepositCryptoDetailsFragment(wallet=" + this.f24256a + ", account=" + this.f24257b + ")";
    }
}
