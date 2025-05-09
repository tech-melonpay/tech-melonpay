package e8;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: PaymentDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f20568a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20569b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20570c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20571d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20572e;

    public d(PaymentUI paymentUI, boolean z10, String str, int i, boolean z11) {
        this.f20568a = paymentUI;
        this.f20569b = z10;
        this.f20570c = str;
        this.f20571d = i;
        this.f20572e = z11;
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
        if (!bundle.containsKey("templateName")) {
            throw new IllegalArgumentException("Required argument \"templateName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("templateName");
        if (!bundle.containsKey("backstackId")) {
            throw new IllegalArgumentException("Required argument \"backstackId\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("backstackId");
        if (bundle.containsKey("isOwnAccount")) {
            return new d(paymentUI, z10, string, i, bundle.getBoolean("isOwnAccount"));
        }
        throw new IllegalArgumentException("Required argument \"isOwnAccount\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f20568a, dVar.f20568a) && this.f20569b == dVar.f20569b && f.b(this.f20570c, dVar.f20570c) && this.f20571d == dVar.f20571d && this.f20572e == dVar.f20572e;
    }

    public final int hashCode() {
        int d10 = v.d(this.f20568a.hashCode() * 31, 31, this.f20569b);
        String str = this.f20570c;
        return Boolean.hashCode(this.f20572e) + v.b(this.f20571d, (d10 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentDetailsFragmentArgs(paymentData=");
        sb2.append(this.f20568a);
        sb2.append(", isTemplate=");
        sb2.append(this.f20569b);
        sb2.append(", templateName=");
        sb2.append(this.f20570c);
        sb2.append(", backstackId=");
        sb2.append(this.f20571d);
        sb2.append(", isOwnAccount=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.f20572e, ")");
    }
}
