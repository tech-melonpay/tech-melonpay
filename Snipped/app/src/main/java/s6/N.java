package s6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: MainNavDirections.kt */
/* loaded from: classes2.dex */
public final class N implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f26709a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26710b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26711c;

    public N(PaymentUI paymentUI, boolean z10, int i) {
        this.f26709a = paymentUI;
        this.f26710b = z10;
        this.f26711c = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f26709a;
        if (isAssignableFrom) {
            bundle.putParcelable("payment", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("payment", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f26710b);
        bundle.putInt("backstackId", this.f26711c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_global_newPaymentSwiftFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return kotlin.jvm.internal.f.b(this.f26709a, n10.f26709a) && this.f26710b == n10.f26710b && this.f26711c == n10.f26711c;
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f26709a;
        return Integer.hashCode(this.f26711c) + C.v.d((paymentUI == null ? 0 : paymentUI.hashCode()) * 31, 31, this.f26710b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionGlobalNewPaymentSwiftFragment(payment=");
        sb2.append(this.f26709a);
        sb2.append(", isTemplate=");
        sb2.append(this.f26710b);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f26711c, ")");
    }
}
