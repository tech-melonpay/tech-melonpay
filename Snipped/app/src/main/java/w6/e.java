package W6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CardDetailsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class e implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final CardsDomain f3835a;

    /* renamed from: b, reason: collision with root package name */
    public final VaultDomain f3836b;

    public e(CardsDomain cardsDomain, VaultDomain vaultDomain) {
        this.f3835a = cardsDomain;
        this.f3836b = vaultDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CardsDomain.class);
        Serializable serializable = this.f3835a;
        if (isAssignableFrom) {
            bundle.putParcelable("card", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CardsDomain.class)) {
                throw new UnsupportedOperationException(CardsDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("card", serializable);
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(VaultDomain.class);
        Serializable serializable2 = this.f3836b;
        if (isAssignableFrom2) {
            bundle.putParcelable("vault", (Parcelable) serializable2);
        } else {
            if (!Serializable.class.isAssignableFrom(VaultDomain.class)) {
                throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("vault", serializable2);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_cardDetailsFragment_to_renameCardFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f3835a, eVar.f3835a) && kotlin.jvm.internal.f.b(this.f3836b, eVar.f3836b);
    }

    public final int hashCode() {
        CardsDomain cardsDomain = this.f3835a;
        int hashCode = (cardsDomain == null ? 0 : cardsDomain.hashCode()) * 31;
        VaultDomain vaultDomain = this.f3836b;
        return hashCode + (vaultDomain != null ? vaultDomain.hashCode() : 0);
    }

    public final String toString() {
        return "ActionCardDetailsFragmentToRenameCardFragment(card=" + this.f3835a + ", vault=" + this.f3836b + ")";
    }
}
