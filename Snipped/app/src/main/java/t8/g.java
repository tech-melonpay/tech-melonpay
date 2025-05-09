package t8;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.transaction.TransactionUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: TransactionDetailsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class g implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f29948a;

    /* renamed from: b, reason: collision with root package name */
    public final TransactionUI f29949b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29950c;

    public g(String str, TransactionUI transactionUI, String str2) {
        this.f29948a = str;
        this.f29949b = transactionUI;
        this.f29950c = str2;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("transactionId", this.f29948a);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(TransactionUI.class);
        Parcelable parcelable = this.f29949b;
        if (isAssignableFrom) {
            bundle.putParcelable("transactionUI", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(TransactionUI.class)) {
                throw new UnsupportedOperationException(TransactionUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("transactionUI", (Serializable) parcelable);
        }
        bundle.putString("path", this.f29950c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_transactionDetailsFragment_to_invoiceDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f29948a, gVar.f29948a) && kotlin.jvm.internal.f.b(this.f29949b, gVar.f29949b) && kotlin.jvm.internal.f.b(this.f29950c, gVar.f29950c);
    }

    public final int hashCode() {
        return this.f29950c.hashCode() + ((this.f29949b.hashCode() + (this.f29948a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionTransactionDetailsFragmentToInvoiceDetailsFragment(transactionId=");
        sb2.append(this.f29948a);
        sb2.append(", transactionUI=");
        sb2.append(this.f29949b);
        sb2.append(", path=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f29950c, ")");
    }
}
