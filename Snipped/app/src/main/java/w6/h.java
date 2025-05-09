package W6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CardDetailsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class h implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final VaultDomain f3846a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3847b;

    public h(int i, VaultDomain vaultDomain) {
        this.f3846a = vaultDomain;
        this.f3847b = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(VaultDomain.class);
        Serializable serializable = this.f3846a;
        if (isAssignableFrom) {
            bundle.putParcelable("vault", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(VaultDomain.class)) {
                throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("vault", serializable);
        }
        bundle.putInt("cardId", this.f3847b);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.actionToEditCardSecurityVerificationFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.f.b(this.f3846a, hVar.f3846a) && this.f3847b == hVar.f3847b;
    }

    public final int hashCode() {
        VaultDomain vaultDomain = this.f3846a;
        return Integer.hashCode(this.f3847b) + ((vaultDomain == null ? 0 : vaultDomain.hashCode()) * 31);
    }

    public final String toString() {
        return "ActionToEditCardSecurityVerificationFragment(vault=" + this.f3846a + ", cardId=" + this.f3847b + ")";
    }
}
