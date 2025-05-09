package g8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: NewPaymentSwiftFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class j implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f20834a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20835b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20836c;

    public j(PaymentUI paymentUI, boolean z10, int i) {
        this.f20834a = paymentUI;
        this.f20835b = z10;
        this.f20836c = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f20834a;
        if (isAssignableFrom) {
            bundle.putParcelable("paymentData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("paymentData", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f20835b);
        bundle.putInt("backstackId", this.f20836c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_newPaymentSwiftFragment_to_newPaymentSwiftBankInfoFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.f.b(this.f20834a, jVar.f20834a) && this.f20835b == jVar.f20835b && this.f20836c == jVar.f20836c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20836c) + v.d(this.f20834a.hashCode() * 31, 31, this.f20835b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionNewPaymentSwiftFragmentToNewPaymentSwiftBankInfoFragment(paymentData=");
        sb2.append(this.f20834a);
        sb2.append(", isTemplate=");
        sb2.append(this.f20835b);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f20836c, ")");
    }
}
