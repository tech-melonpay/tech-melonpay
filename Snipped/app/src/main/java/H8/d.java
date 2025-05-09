package h8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import java.io.Serializable;

/* compiled from: NewPaymentToBankAccountBankInfoFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class d implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f21206a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21207b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21208c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21209d;

    public d(PaymentUI paymentUI, boolean z10, boolean z11, int i) {
        this.f21206a = paymentUI;
        this.f21207b = z10;
        this.f21208c = z11;
        this.f21209d = i;
    }

    public static final d fromBundle(Bundle bundle) {
        if (!v.y(bundle, d.class, "payment")) {
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
        if (!bundle.containsKey("isOwnAccount")) {
            throw new IllegalArgumentException("Required argument \"isOwnAccount\" is missing and does not have an android:defaultValue");
        }
        boolean z11 = bundle.getBoolean("isOwnAccount");
        if (bundle.containsKey("backstackId")) {
            return new d(paymentUI, z10, z11, bundle.getInt("backstackId"));
        }
        throw new IllegalArgumentException("Required argument \"backstackId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f21206a, dVar.f21206a) && this.f21207b == dVar.f21207b && this.f21208c == dVar.f21208c && this.f21209d == dVar.f21209d;
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f21206a;
        return Integer.hashCode(this.f21209d) + v.d(v.d((paymentUI == null ? 0 : paymentUI.hashCode()) * 31, 31, this.f21207b), 31, this.f21208c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NewPaymentToBankAccountBankInfoFragmentArgs(payment=");
        sb2.append(this.f21206a);
        sb2.append(", isTemplate=");
        sb2.append(this.f21207b);
        sb2.append(", isOwnAccount=");
        sb2.append(this.f21208c);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f21209d, ")");
    }
}
