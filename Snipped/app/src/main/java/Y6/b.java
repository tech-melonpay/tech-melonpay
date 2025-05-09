package Y6;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.account.CardsDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: RenameCardFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final CardsDomain f4105a;

    /* renamed from: b, reason: collision with root package name */
    public final VaultDomain f4106b;

    public b(CardsDomain cardsDomain, VaultDomain vaultDomain) {
        this.f4105a = cardsDomain;
        this.f4106b = vaultDomain;
    }

    public static final b fromBundle(Bundle bundle) {
        if (!v.y(bundle, b.class, "card")) {
            throw new IllegalArgumentException("Required argument \"card\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(CardsDomain.class) && !Serializable.class.isAssignableFrom(CardsDomain.class)) {
            throw new UnsupportedOperationException(CardsDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        CardsDomain cardsDomain = (CardsDomain) bundle.get("card");
        if (!bundle.containsKey("vault")) {
            throw new IllegalArgumentException("Required argument \"vault\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(VaultDomain.class) || Serializable.class.isAssignableFrom(VaultDomain.class)) {
            return new b(cardsDomain, (VaultDomain) bundle.get("vault"));
        }
        throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f4105a, bVar.f4105a) && f.b(this.f4106b, bVar.f4106b);
    }

    public final int hashCode() {
        CardsDomain cardsDomain = this.f4105a;
        int hashCode = (cardsDomain == null ? 0 : cardsDomain.hashCode()) * 31;
        VaultDomain vaultDomain = this.f4106b;
        return hashCode + (vaultDomain != null ? vaultDomain.hashCode() : 0);
    }

    public final String toString() {
        return "RenameCardFragmentArgs(card=" + this.f4105a + ", vault=" + this.f4106b + ")";
    }
}
