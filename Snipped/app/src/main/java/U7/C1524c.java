package u7;

import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: WithdrawCryptoFragmentDirections.kt */
/* renamed from: u7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1524c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f30329a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoListFragment.DIRECTION f30330b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30331c;

    public C1524c(CryptoAccountDomain cryptoAccountDomain, CryptoListFragment.DIRECTION direction) {
        this.f30329a = cryptoAccountDomain;
        this.f30330b = direction;
        this.f30331c = R.id.action_withdrawCryptoFragment_to_cryptoListFragment;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable = this.f30329a;
        if (isAssignableFrom) {
            bundle.putParcelable("account", (Parcelable) serializable);
        } else if (Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
            bundle.putSerializable("account", serializable);
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(CryptoListFragment.DIRECTION.class);
        Serializable serializable2 = this.f30330b;
        if (isAssignableFrom2) {
            bundle.putParcelable("direction", (Parcelable) serializable2);
        } else if (Serializable.class.isAssignableFrom(CryptoListFragment.DIRECTION.class)) {
            bundle.putSerializable("direction", serializable2);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return this.f30331c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1524c)) {
            return false;
        }
        C1524c c1524c = (C1524c) obj;
        return kotlin.jvm.internal.f.b(this.f30329a, c1524c.f30329a) && this.f30330b == c1524c.f30330b;
    }

    public final int hashCode() {
        CryptoAccountDomain cryptoAccountDomain = this.f30329a;
        return this.f30330b.hashCode() + ((cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode()) * 31);
    }

    public final String toString() {
        return "ActionWithdrawCryptoFragmentToCryptoListFragment(account=" + this.f30329a + ", direction=" + this.f30330b + ")";
    }

    public C1524c() {
        this(null, CryptoListFragment.DIRECTION.f12081c);
    }
}
