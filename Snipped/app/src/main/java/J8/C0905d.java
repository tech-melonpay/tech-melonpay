package j8;

import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: PaymentsFragmentDirections.kt */
/* renamed from: j8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0905d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f22551a;

    /* renamed from: b, reason: collision with root package name */
    public final TransactionUI f22552b;

    public C0905d(String str, TransactionUI transactionUI) {
        this.f22551a = str;
        this.f22552b = transactionUI;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("transactionId", this.f22551a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(TransactionUI.class);
        Parcelable parcelable = this.f22552b;
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
        return R.id.action_paymentsFragment_to_transactionDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0905d)) {
            return false;
        }
        C0905d c0905d = (C0905d) obj;
        return f.b(this.f22551a, c0905d.f22551a) && f.b(this.f22552b, c0905d.f22552b);
    }

    public final int hashCode() {
        return this.f22552b.hashCode() + (this.f22551a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionPaymentsFragmentToTransactionDetailsFragment(transactionId=" + this.f22551a + ", transactionUI=" + this.f22552b + ")";
    }
}
