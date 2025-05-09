package h8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import java.io.Serializable;

/* compiled from: NewPaymentToBankAccountFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class h implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f21219a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21220b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21221c;

    public h(PaymentUI paymentUI, boolean z10, int i) {
        this.f21219a = paymentUI;
        this.f21220b = z10;
        this.f21221c = i;
    }

    public static final h fromBundle(Bundle bundle) {
        if (!v.y(bundle, h.class, "payment")) {
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
            return new h(paymentUI, z10, bundle.getInt("backstackId"));
        }
        throw new IllegalArgumentException("Required argument \"backstackId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.f.b(this.f21219a, hVar.f21219a) && this.f21220b == hVar.f21220b && this.f21221c == hVar.f21221c;
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f21219a;
        return Integer.hashCode(this.f21221c) + v.d((paymentUI == null ? 0 : paymentUI.hashCode()) * 31, 31, this.f21220b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NewPaymentToBankAccountFragmentArgs(payment=");
        sb2.append(this.f21219a);
        sb2.append(", isTemplate=");
        sb2.append(this.f21220b);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f21221c, ")");
    }
}
