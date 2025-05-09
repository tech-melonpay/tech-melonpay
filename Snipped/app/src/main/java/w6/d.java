package W6;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.VaultDomain;
import java.io.Serializable;

/* compiled from: CardDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class d implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final VaultDomain f3834a;

    public d(VaultDomain vaultDomain) {
        this.f3834a = vaultDomain;
    }

    public static final d fromBundle(Bundle bundle) {
        if (!v.y(bundle, d.class, "vault")) {
            throw new IllegalArgumentException("Required argument \"vault\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(VaultDomain.class) || Serializable.class.isAssignableFrom(VaultDomain.class)) {
            return new d((VaultDomain) bundle.get("vault"));
        }
        throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.f.b(this.f3834a, ((d) obj).f3834a);
    }

    public final int hashCode() {
        VaultDomain vaultDomain = this.f3834a;
        if (vaultDomain == null) {
            return 0;
        }
        return vaultDomain.hashCode();
    }

    public final String toString() {
        return "CardDetailsFragmentArgs(vault=" + this.f3834a + ")";
    }
}
