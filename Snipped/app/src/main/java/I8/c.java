package i8;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: NewPaymentUnitedKingdomFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f21507a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21508b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21509c;

    public c(PaymentUI paymentUI, boolean z10, int i) {
        this.f21507a = paymentUI;
        this.f21508b = z10;
        this.f21509c = i;
    }

    public static final c fromBundle(Bundle bundle) {
        if (!v.y(bundle, c.class, "payment")) {
            throw new IllegalArgumentException("Required argument \"payment\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(PaymentUI.class) && !Serializable.class.isAssignableFrom(PaymentUI.class)) {
            throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        PaymentUI paymentUI = (PaymentUI) bundle.get("payment");
        if (!bundle.containsKey("isTemplate")) {
            throw new IllegalArgumentException("Required argument \"isTemplate\" is missing and does not have an android:defaultValue");
        }
        boolean z10 = bundle.getBoolean("isTemplate");
        if (bundle.containsKey("backstackId")) {
            return new c(paymentUI, z10, bundle.getInt("backstackId"));
        }
        throw new IllegalArgumentException("Required argument \"backstackId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f21507a, cVar.f21507a) && this.f21508b == cVar.f21508b && this.f21509c == cVar.f21509c;
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f21507a;
        return Integer.hashCode(this.f21509c) + v.d((paymentUI == null ? 0 : paymentUI.hashCode()) * 31, 31, this.f21508b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NewPaymentUnitedKingdomFragmentArgs(payment=");
        sb2.append(this.f21507a);
        sb2.append(", isTemplate=");
        sb2.append(this.f21508b);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f21509c, ")");
    }
}
