package l7;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CryptoAccountDetailsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f23573a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final String f23574b = "";

    /* renamed from: c, reason: collision with root package name */
    public final CryptoAccountDomain f23575c;

    public f(CryptoAccountDomain cryptoAccountDomain) {
        this.f23575c = cryptoAccountDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("walletId", this.f23573a);
        bundle.putString("address", this.f23574b);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable = this.f23575c;
        if (isAssignableFrom) {
            bundle.putParcelable("account", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("account", serializable);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_walletDetailsFragment_to_withdrawCryptoFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f23573a == fVar.f23573a && kotlin.jvm.internal.f.b(this.f23574b, fVar.f23574b) && kotlin.jvm.internal.f.b(this.f23575c, fVar.f23575c);
    }

    public final int hashCode() {
        int c2 = v.c(Integer.hashCode(this.f23573a) * 31, 31, this.f23574b);
        CryptoAccountDomain cryptoAccountDomain = this.f23575c;
        return c2 + (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode());
    }

    public final String toString() {
        return "ActionWalletDetailsFragmentToWithdrawCryptoFragment(walletId=" + this.f23573a + ", address=" + this.f23574b + ", account=" + this.f23575c + ")";
    }
}
