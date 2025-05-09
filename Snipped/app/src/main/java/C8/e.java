package c8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: NewPaymentBankFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class e implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f8598a;

    public e(PaymentUI paymentUI) {
        this.f8598a = paymentUI;
    }

    public static final e fromBundle(Bundle bundle) {
        if (!v.y(bundle, e.class, "payment")) {
            throw new IllegalArgumentException("Required argument \"payment\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(PaymentUI.class) || Serializable.class.isAssignableFrom(PaymentUI.class)) {
            return new e((PaymentUI) bundle.get("payment"));
        }
        throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && f.b(this.f8598a, ((e) obj).f8598a);
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f8598a;
        if (paymentUI == null) {
            return 0;
        }
        return paymentUI.hashCode();
    }

    public final String toString() {
        return "NewPaymentBankFragmentArgs(payment=" + this.f8598a + ")";
    }
}
