package E6;

import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: AllTransactionsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1056a;

    /* renamed from: b, reason: collision with root package name */
    public final TransactionUI f1057b;

    public b(String str, TransactionUI transactionUI) {
        this.f1056a = str;
        this.f1057b = transactionUI;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("transactionId", this.f1056a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(TransactionUI.class);
        Parcelable parcelable = this.f1057b;
        if (isAssignableFrom) {
            bundle.putParcelable("transactionUI", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(TransactionUI.class)) {
                throw new UnsupportedOperationException(TransactionUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("transactionUI", (Serializable) parcelable);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_allTransactionFragment_to_transactionDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f1056a, bVar.f1056a) && f.b(this.f1057b, bVar.f1057b);
    }

    public final int hashCode() {
        return this.f1057b.hashCode() + (this.f1056a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionAllTransactionFragmentToTransactionDetailsFragment(transactionId=" + this.f1056a + ", transactionUI=" + this.f1057b + ")";
    }
}
