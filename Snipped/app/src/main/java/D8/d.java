package d8;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: NewPaymentEuropeanFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f20475a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20476b;

    /* renamed from: d, reason: collision with root package name */
    public final int f20478d;

    /* renamed from: c, reason: collision with root package name */
    public final String f20477c = null;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20479e = false;

    public d(PaymentUI paymentUI, boolean z10, int i) {
        this.f20475a = paymentUI;
        this.f20476b = z10;
        this.f20478d = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f20475a;
        if (isAssignableFrom) {
            bundle.putParcelable("paymentData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("paymentData", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f20476b);
        bundle.putString("templateName", this.f20477c);
        bundle.putInt("backstackId", this.f20478d);
        bundle.putBoolean("isOwnAccount", this.f20479e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_newPaymentEuropeanFragment_to_paymentDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f20475a, dVar.f20475a) && this.f20476b == dVar.f20476b && f.b(this.f20477c, dVar.f20477c) && this.f20478d == dVar.f20478d && this.f20479e == dVar.f20479e;
    }

    public final int hashCode() {
        int d10 = v.d(this.f20475a.hashCode() * 31, 31, this.f20476b);
        String str = this.f20477c;
        return Boolean.hashCode(this.f20479e) + v.b(this.f20478d, (d10 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionNewPaymentEuropeanFragmentToPaymentDetailsFragment(paymentData=");
        sb2.append(this.f20475a);
        sb2.append(", isTemplate=");
        sb2.append(this.f20476b);
        sb2.append(", templateName=");
        sb2.append(this.f20477c);
        sb2.append(", backstackId=");
        sb2.append(this.f20478d);
        sb2.append(", isOwnAccount=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.f20479e, ")");
    }
}
