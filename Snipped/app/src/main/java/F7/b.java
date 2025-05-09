package F7;

import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: InvoicesNewFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1244a;

    /* renamed from: b, reason: collision with root package name */
    public final TransactionUI f1245b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1246c = "";

    public b(String str, TransactionUI transactionUI) {
        this.f1244a = str;
        this.f1245b = transactionUI;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("transactionId", this.f1244a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(TransactionUI.class);
        Parcelable parcelable = this.f1245b;
        if (isAssignableFrom) {
            bundle.putParcelable("transactionUI", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(TransactionUI.class)) {
                throw new UnsupportedOperationException(TransactionUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("transactionUI", (Serializable) parcelable);
        }
        bundle.putString("path", this.f1246c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_invoicesNewFragment_to_invoiceDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f1244a, bVar.f1244a) && f.b(this.f1245b, bVar.f1245b) && f.b(this.f1246c, bVar.f1246c);
    }

    public final int hashCode() {
        return this.f1246c.hashCode() + ((this.f1245b.hashCode() + (this.f1244a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionInvoicesNewFragmentToInvoiceDetailsFragment(transactionId=");
        sb2.append(this.f1244a);
        sb2.append(", transactionUI=");
        sb2.append(this.f1245b);
        sb2.append(", path=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1246c, ")");
    }
}
