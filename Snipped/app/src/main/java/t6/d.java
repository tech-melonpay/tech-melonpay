package T6;

import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CardsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3562a = R.id.cardsFragment;

    /* renamed from: b, reason: collision with root package name */
    public final VaultDomain f3563b;

    public d(VaultDomain vaultDomain) {
        this.f3563b = vaultDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("routeId", this.f3562a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(VaultDomain.class);
        Serializable serializable = this.f3563b;
        if (isAssignableFrom) {
            bundle.putParcelable("sourceVault", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(VaultDomain.class)) {
                throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("sourceVault", serializable);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_cardsFragment_to_topUpFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3562a == dVar.f3562a && kotlin.jvm.internal.f.b(this.f3563b, dVar.f3563b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f3562a) * 31;
        VaultDomain vaultDomain = this.f3563b;
        return hashCode + (vaultDomain == null ? 0 : vaultDomain.hashCode());
    }

    public final String toString() {
        return "ActionCardsFragmentToTopUpFragment(routeId=" + this.f3562a + ", sourceVault=" + this.f3563b + ")";
    }
}
