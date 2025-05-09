package h8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: NewPaymentToBankAccountFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class i implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f21222a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21223b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21224c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21225d;

    public i(PaymentUI paymentUI, boolean z10, boolean z11, int i) {
        this.f21222a = paymentUI;
        this.f21223b = z10;
        this.f21224c = z11;
        this.f21225d = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f21222a;
        if (isAssignableFrom) {
            bundle.putParcelable("payment", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("payment", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f21223b);
        bundle.putBoolean("isOwnAccount", this.f21224c);
        bundle.putInt("backstackId", this.f21225d);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_newPaymentToBankAccountFragment_to_newPaymentToBankAccountBankInfoFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.f.b(this.f21222a, iVar.f21222a) && this.f21223b == iVar.f21223b && this.f21224c == iVar.f21224c && this.f21225d == iVar.f21225d;
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f21222a;
        return Integer.hashCode(this.f21225d) + v.d(v.d((paymentUI == null ? 0 : paymentUI.hashCode()) * 31, 31, this.f21223b), 31, this.f21224c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionNewPaymentToBankAccountFragmentToNewPaymentToBankAccountBankInfoFragment(payment=");
        sb2.append(this.f21222a);
        sb2.append(", isTemplate=");
        sb2.append(this.f21223b);
        sb2.append(", isOwnAccount=");
        sb2.append(this.f21224c);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f21225d, ")");
    }
}
