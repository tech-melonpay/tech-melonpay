package s6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: MainNavDirections.kt */
/* loaded from: classes2.dex */
public final class M implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f26706a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26707b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26708c;

    public M(PaymentUI paymentUI, boolean z10, int i) {
        this.f26706a = paymentUI;
        this.f26707b = z10;
        this.f26708c = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f26706a;
        if (isAssignableFrom) {
            bundle.putParcelable("payment", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("payment", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f26707b);
        bundle.putInt("backstackId", this.f26708c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_global_newPaymentEuropeanFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m2 = (M) obj;
        return kotlin.jvm.internal.f.b(this.f26706a, m2.f26706a) && this.f26707b == m2.f26707b && this.f26708c == m2.f26708c;
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f26706a;
        return Integer.hashCode(this.f26708c) + C.v.d((paymentUI == null ? 0 : paymentUI.hashCode()) * 31, 31, this.f26707b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionGlobalNewPaymentEuropeanFragment(payment=");
        sb2.append(this.f26706a);
        sb2.append(", isTemplate=");
        sb2.append(this.f26707b);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f26708c, ")");
    }
}
