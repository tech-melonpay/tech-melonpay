package Z6;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.VaultDomain;
import java.io.Serializable;

/* compiled from: TopUpFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class c implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f4203a;

    /* renamed from: b, reason: collision with root package name */
    public final VaultDomain f4204b;

    public c(int i, VaultDomain vaultDomain) {
        this.f4203a = i;
        this.f4204b = vaultDomain;
    }

    public static final c fromBundle(Bundle bundle) {
        if (!v.y(bundle, c.class, "routeId")) {
            throw new IllegalArgumentException("Required argument \"routeId\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("routeId");
        if (!bundle.containsKey("sourceVault")) {
            throw new IllegalArgumentException("Required argument \"sourceVault\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(VaultDomain.class) || Serializable.class.isAssignableFrom(VaultDomain.class)) {
            return new c(i, (VaultDomain) bundle.get("sourceVault"));
        }
        throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4203a == cVar.f4203a && kotlin.jvm.internal.f.b(this.f4204b, cVar.f4204b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f4203a) * 31;
        VaultDomain vaultDomain = this.f4204b;
        return hashCode + (vaultDomain == null ? 0 : vaultDomain.hashCode());
    }

    public final String toString() {
        return "TopUpFragmentArgs(routeId=" + this.f4203a + ", sourceVault=" + this.f4204b + ")";
    }
}
