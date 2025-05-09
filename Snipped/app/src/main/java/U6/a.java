package U6;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: CardTransactionDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final VaultDomain f3668a;

    /* renamed from: b, reason: collision with root package name */
    public final CardTransactionDomain f3669b;

    public a(VaultDomain vaultDomain, CardTransactionDomain cardTransactionDomain) {
        this.f3668a = vaultDomain;
        this.f3669b = cardTransactionDomain;
    }

    public static final a fromBundle(Bundle bundle) {
        if (!v.y(bundle, a.class, "vault")) {
            throw new IllegalArgumentException("Required argument \"vault\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(VaultDomain.class) && !Serializable.class.isAssignableFrom(VaultDomain.class)) {
            throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        VaultDomain vaultDomain = (VaultDomain) bundle.get("vault");
        if (vaultDomain == null) {
            throw new IllegalArgumentException("Argument \"vault\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("transaction")) {
            throw new IllegalArgumentException("Required argument \"transaction\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(CardTransactionDomain.class) && !Serializable.class.isAssignableFrom(CardTransactionDomain.class)) {
            throw new UnsupportedOperationException(CardTransactionDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        CardTransactionDomain cardTransactionDomain = (CardTransactionDomain) bundle.get("transaction");
        if (cardTransactionDomain != null) {
            return new a(vaultDomain, cardTransactionDomain);
        }
        throw new IllegalArgumentException("Argument \"transaction\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f3668a, aVar.f3668a) && f.b(this.f3669b, aVar.f3669b);
    }

    public final int hashCode() {
        return this.f3669b.hashCode() + (this.f3668a.hashCode() * 31);
    }

    public final String toString() {
        return "CardTransactionDetailsFragmentArgs(vault=" + this.f3668a + ", transaction=" + this.f3669b + ")";
    }
}
