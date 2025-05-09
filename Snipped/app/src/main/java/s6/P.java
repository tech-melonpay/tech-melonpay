package s6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: MainNavDirections.kt */
/* loaded from: classes2.dex */
public final class P implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f26715a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26716b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26717c;

    public P(PaymentUI paymentUI, boolean z10, int i) {
        this.f26715a = paymentUI;
        this.f26716b = z10;
        this.f26717c = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f26715a;
        if (isAssignableFrom) {
            bundle.putParcelable("payment", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("payment", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f26716b);
        bundle.putInt("backstackId", this.f26717c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_global_newPaymentUnitedKingdomFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return kotlin.jvm.internal.f.b(this.f26715a, p10.f26715a) && this.f26716b == p10.f26716b && this.f26717c == p10.f26717c;
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f26715a;
        return Integer.hashCode(this.f26717c) + C.v.d((paymentUI == null ? 0 : paymentUI.hashCode()) * 31, 31, this.f26716b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionGlobalNewPaymentUnitedKingdomFragment(payment=");
        sb2.append(this.f26715a);
        sb2.append(", isTemplate=");
        sb2.append(this.f26716b);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f26717c, ")");
    }
}
