package g8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import java.io.Serializable;

/* compiled from: NewPaymentSwiftBankInfoFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class d implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f20817a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20819c;

    public d(PaymentUI paymentUI, boolean z10, int i) {
        this.f20817a = paymentUI;
        this.f20818b = z10;
        this.f20819c = i;
    }

    public static final d fromBundle(Bundle bundle) {
        if (!v.y(bundle, d.class, "paymentData")) {
            throw new IllegalArgumentException("Required argument \"paymentData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(PaymentUI.class) && !Serializable.class.isAssignableFrom(PaymentUI.class)) {
            throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        PaymentUI paymentUI = (PaymentUI) bundle.get("paymentData");
        if (paymentUI == null) {
            throw new IllegalArgumentException("Argument \"paymentData\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("isTemplate")) {
            throw new IllegalArgumentException("Required argument \"isTemplate\" is missing and does not have an android:defaultValue");
        }
        boolean z10 = bundle.getBoolean("isTemplate");
        if (bundle.containsKey("backstackId")) {
            return new d(paymentUI, z10, bundle.getInt("backstackId"));
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
        return kotlin.jvm.internal.f.b(this.f20817a, dVar.f20817a) && this.f20818b == dVar.f20818b && this.f20819c == dVar.f20819c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20819c) + v.d(this.f20817a.hashCode() * 31, 31, this.f20818b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NewPaymentSwiftBankInfoFragmentArgs(paymentData=");
        sb2.append(this.f20817a);
        sb2.append(", isTemplate=");
        sb2.append(this.f20818b);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f20819c, ")");
    }
}
