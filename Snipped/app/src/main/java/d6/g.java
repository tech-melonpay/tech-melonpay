package D6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: AccountDetailsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class g implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f939a;

    /* renamed from: b, reason: collision with root package name */
    public final TransactionUI f940b;

    public g(String str, TransactionUI transactionUI) {
        this.f939a = str;
        this.f940b = transactionUI;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("transactionId", this.f939a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(TransactionUI.class);
        Parcelable parcelable = this.f940b;
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
        return R.id.action_accountDetailsFragment_to_transactionDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f939a, gVar.f939a) && kotlin.jvm.internal.f.b(this.f940b, gVar.f940b);
    }

    public final int hashCode() {
        return this.f940b.hashCode() + (this.f939a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionAccountDetailsFragmentToTransactionDetailsFragment(transactionId=" + this.f939a + ", transactionUI=" + this.f940b + ")";
    }
}
