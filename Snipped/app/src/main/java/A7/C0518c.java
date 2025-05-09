package a7;

import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cards.CardTransactionDomain;
import com.luminary.business.domain.entity.cards.VaultDomain;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: CardTransactionsFragmentDirections.kt */
/* renamed from: a7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0518c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final VaultDomain f4464a;

    /* renamed from: b, reason: collision with root package name */
    public final CardTransactionDomain f4465b;

    public C0518c(VaultDomain vaultDomain, CardTransactionDomain cardTransactionDomain) {
        this.f4464a = vaultDomain;
        this.f4465b = cardTransactionDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(VaultDomain.class);
        Serializable serializable = this.f4464a;
        if (isAssignableFrom) {
            bundle.putParcelable("vault", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(VaultDomain.class)) {
                throw new UnsupportedOperationException(VaultDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("vault", serializable);
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(CardTransactionDomain.class);
        Serializable serializable2 = this.f4465b;
        if (isAssignableFrom2) {
            bundle.putParcelable("transaction", (Parcelable) serializable2);
        } else {
            if (!Serializable.class.isAssignableFrom(CardTransactionDomain.class)) {
                throw new UnsupportedOperationException(CardTransactionDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("transaction", serializable2);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_cardTransactionsFragment_to_cardTransactionDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0518c)) {
            return false;
        }
        C0518c c0518c = (C0518c) obj;
        return f.b(this.f4464a, c0518c.f4464a) && f.b(this.f4465b, c0518c.f4465b);
    }

    public final int hashCode() {
        return this.f4465b.hashCode() + (this.f4464a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionCardTransactionsFragmentToCardTransactionDetailsFragment(vault=" + this.f4464a + ", transaction=" + this.f4465b + ")";
    }
}
