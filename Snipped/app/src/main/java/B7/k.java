package B7;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: NewHomeFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class k implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f459a;

    /* renamed from: b, reason: collision with root package name */
    public final TransactionUI f460b;

    public k(String str, TransactionUI transactionUI) {
        this.f459a = str;
        this.f460b = transactionUI;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("transactionId", this.f459a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(TransactionUI.class);
        Parcelable parcelable = this.f460b;
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
        return R.id.action_homeFragment_to_transactionDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.f.b(this.f459a, kVar.f459a) && kotlin.jvm.internal.f.b(this.f460b, kVar.f460b);
    }

    public final int hashCode() {
        return this.f460b.hashCode() + (this.f459a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionHomeFragmentToTransactionDetailsFragment(transactionId=" + this.f459a + ", transactionUI=" + this.f460b + ")";
    }
}
