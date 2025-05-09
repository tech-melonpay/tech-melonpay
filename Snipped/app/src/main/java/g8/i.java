package g8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import java.io.Serializable;

/* compiled from: NewPaymentSwiftFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class i implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f20831a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20832b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20833c;

    public i(PaymentUI paymentUI, boolean z10, int i) {
        this.f20831a = paymentUI;
        this.f20832b = z10;
        this.f20833c = i;
    }

    public static final i fromBundle(Bundle bundle) {
        if (!v.y(bundle, i.class, "payment")) {
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
            return new i(paymentUI, z10, bundle.getInt("backstackId"));
        }
        throw new IllegalArgumentException("Required argument \"backstackId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.f.b(this.f20831a, iVar.f20831a) && this.f20832b == iVar.f20832b && this.f20833c == iVar.f20833c;
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f20831a;
        return Integer.hashCode(this.f20833c) + v.d((paymentUI == null ? 0 : paymentUI.hashCode()) * 31, 31, this.f20832b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NewPaymentSwiftFragmentArgs(payment=");
        sb2.append(this.f20831a);
        sb2.append(", isTemplate=");
        sb2.append(this.f20832b);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f20833c, ")");
    }
}
