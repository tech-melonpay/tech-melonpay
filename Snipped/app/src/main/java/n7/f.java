package n7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CryptoListFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class f implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final int f24258a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24259b;

    /* renamed from: c, reason: collision with root package name */
    public final CryptoAccountDomain f24260c;

    public f(int i, String str, CryptoAccountDomain cryptoAccountDomain) {
        this.f24258a = i;
        this.f24259b = str;
        this.f24260c = cryptoAccountDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("walletId", this.f24258a);
        bundle.putString("address", this.f24259b);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable = this.f24260c;
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
        return R.id.action_cryptoListFragment_to_withdrawCryptoFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f24258a == fVar.f24258a && kotlin.jvm.internal.f.b(this.f24259b, fVar.f24259b) && kotlin.jvm.internal.f.b(this.f24260c, fVar.f24260c);
    }

    public final int hashCode() {
        int c2 = v.c(Integer.hashCode(this.f24258a) * 31, 31, this.f24259b);
        CryptoAccountDomain cryptoAccountDomain = this.f24260c;
        return c2 + (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode());
    }

    public final String toString() {
        return "ActionCryptoListFragmentToWithdrawCryptoFragment(walletId=" + this.f24258a + ", address=" + this.f24259b + ", account=" + this.f24260c + ")";
    }
}
