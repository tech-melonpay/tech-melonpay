package c8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: NewPaymentBankEmailFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f8588a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8589b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8590c;

    public b(PaymentUI paymentUI, boolean z10, int i) {
        this.f8588a = paymentUI;
        this.f8589b = z10;
        this.f8590c = i;
    }

    public static final b fromBundle(Bundle bundle) {
        if (!v.y(bundle, b.class, "payment")) {
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
            return new b(paymentUI, z10, bundle.getInt("backstackId"));
        }
        throw new IllegalArgumentException("Required argument \"backstackId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f8588a, bVar.f8588a) && this.f8589b == bVar.f8589b && this.f8590c == bVar.f8590c;
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f8588a;
        return Integer.hashCode(this.f8590c) + v.d((paymentUI == null ? 0 : paymentUI.hashCode()) * 31, 31, this.f8589b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NewPaymentBankEmailFragmentArgs(payment=");
        sb2.append(this.f8588a);
        sb2.append(", isTemplate=");
        sb2.append(this.f8589b);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f8590c, ")");
    }
}
