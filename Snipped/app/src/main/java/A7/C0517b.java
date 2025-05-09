package a7;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.VaultDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: CardTransactionsFragmentArgs.kt */
/* renamed from: a7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0517b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final VaultDomain f4463a;

    public C0517b(VaultDomain vaultDomain) {
        this.f4463a = vaultDomain;
    }

    public static final C0517b fromBundle(Bundle bundle) {
        if (!v.y(bundle, C0517b.class, "vault")) {
            throw new IllegalArgumentException("Required argument \"vault\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(VaultDomain.class) && !Serializable.class.isAssignableFrom(VaultDomain.class)) {
            throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        VaultDomain vaultDomain = (VaultDomain) bundle.get("vault");
        if (vaultDomain != null) {
            return new C0517b(vaultDomain);
        }
        throw new IllegalArgumentException("Argument \"vault\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0517b) && f.b(this.f4463a, ((C0517b) obj).f4463a);
    }

    public final int hashCode() {
        return this.f4463a.hashCode();
    }

    public final String toString() {
        return "CardTransactionsFragmentArgs(vault=" + this.f4463a + ")";
    }
}
