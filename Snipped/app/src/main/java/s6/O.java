package s6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: MainNavDirections.kt */
/* loaded from: classes2.dex */
public final class O implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f26712a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26713b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26714c;

    public O(PaymentUI paymentUI, boolean z10, int i) {
        this.f26712a = paymentUI;
        this.f26713b = z10;
        this.f26714c = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f26712a;
        if (isAssignableFrom) {
            bundle.putParcelable("payment", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("payment", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f26713b);
        bundle.putInt("backstackId", this.f26714c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_global_newPaymentToBankAccountFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return kotlin.jvm.internal.f.b(this.f26712a, o10.f26712a) && this.f26713b == o10.f26713b && this.f26714c == o10.f26714c;
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f26712a;
        return Integer.hashCode(this.f26714c) + C.v.d((paymentUI == null ? 0 : paymentUI.hashCode()) * 31, 31, this.f26713b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionGlobalNewPaymentToBankAccountFragment(payment=");
        sb2.append(this.f26712a);
        sb2.append(", isTemplate=");
        sb2.append(this.f26713b);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f26714c, ")");
    }
}
