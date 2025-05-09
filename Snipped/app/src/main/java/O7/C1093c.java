package o7;

import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: DepositCryptoFragmentDirections.kt */
/* renamed from: o7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1093c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f24391a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoListFragment.DIRECTION f24392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24393c;

    public C1093c(CryptoAccountDomain cryptoAccountDomain, CryptoListFragment.DIRECTION direction) {
        this.f24391a = cryptoAccountDomain;
        this.f24392b = direction;
        this.f24393c = R.id.action_depositCryptoFragment_to_cryptoListFragment;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable = this.f24391a;
        if (isAssignableFrom) {
            bundle.putParcelable("account", (Parcelable) serializable);
        } else if (Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
            bundle.putSerializable("account", serializable);
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(CryptoListFragment.DIRECTION.class);
        Serializable serializable2 = this.f24392b;
        if (isAssignableFrom2) {
            bundle.putParcelable("direction", (Parcelable) serializable2);
        } else if (Serializable.class.isAssignableFrom(CryptoListFragment.DIRECTION.class)) {
            bundle.putSerializable("direction", serializable2);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return this.f24393c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1093c)) {
            return false;
        }
        C1093c c1093c = (C1093c) obj;
        return f.b(this.f24391a, c1093c.f24391a) && this.f24392b == c1093c.f24392b;
    }

    public final int hashCode() {
        CryptoAccountDomain cryptoAccountDomain = this.f24391a;
        return this.f24392b.hashCode() + ((cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode()) * 31);
    }

    public final String toString() {
        return "ActionDepositCryptoFragmentToCryptoListFragment(account=" + this.f24391a + ", direction=" + this.f24392b + ")";
    }

    public C1093c() {
        this(null, CryptoListFragment.DIRECTION.f12081c);
    }
}
