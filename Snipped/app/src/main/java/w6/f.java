package W6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CardDetailsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class f implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3837a = R.id.cardDetailsFragment;

    /* renamed from: b, reason: collision with root package name */
    public final VaultDomain f3838b;

    public f(VaultDomain vaultDomain) {
        this.f3838b = vaultDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("routeId", this.f3837a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(VaultDomain.class);
        Serializable serializable = this.f3838b;
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
        return R.id.action_cardDetailsFragment_to_topUpFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3837a == fVar.f3837a && kotlin.jvm.internal.f.b(this.f3838b, fVar.f3838b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f3837a) * 31;
        VaultDomain vaultDomain = this.f3838b;
        return hashCode + (vaultDomain == null ? 0 : vaultDomain.hashCode());
    }

    public final String toString() {
        return "ActionCardDetailsFragmentToTopUpFragment(routeId=" + this.f3837a + ", sourceVault=" + this.f3838b + ")";
    }
}
