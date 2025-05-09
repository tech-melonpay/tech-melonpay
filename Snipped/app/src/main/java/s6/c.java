package S6;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.VaultDomain;
import java.io.Serializable;

/* compiled from: EditCardSecurityVerificationFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class c implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final VaultDomain f3381a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3382b;

    public c(int i, VaultDomain vaultDomain) {
        this.f3381a = vaultDomain;
        this.f3382b = i;
    }

    public static final c fromBundle(Bundle bundle) {
        if (!v.y(bundle, c.class, "vault")) {
            throw new IllegalArgumentException("Required argument \"vault\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(VaultDomain.class) && !Serializable.class.isAssignableFrom(VaultDomain.class)) {
            throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        VaultDomain vaultDomain = (VaultDomain) bundle.get("vault");
        if (bundle.containsKey("cardId")) {
            return new c(bundle.getInt("cardId"), vaultDomain);
        }
        throw new IllegalArgumentException("Required argument \"cardId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f3381a, cVar.f3381a) && this.f3382b == cVar.f3382b;
    }

    public final int hashCode() {
        VaultDomain vaultDomain = this.f3381a;
        return Integer.hashCode(this.f3382b) + ((vaultDomain == null ? 0 : vaultDomain.hashCode()) * 31);
    }

    public final String toString() {
        return "EditCardSecurityVerificationFragmentArgs(vault=" + this.f3381a + ", cardId=" + this.f3382b + ")";
    }
}
