package i8;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: NewPaymentUnitedKingdomFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f21510a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21511b;

    /* renamed from: d, reason: collision with root package name */
    public final int f21513d;

    /* renamed from: c, reason: collision with root package name */
    public final String f21512c = null;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21514e = false;

    public d(PaymentUI paymentUI, boolean z10, int i) {
        this.f21510a = paymentUI;
        this.f21511b = z10;
        this.f21513d = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f21510a;
        if (isAssignableFrom) {
            bundle.putParcelable("paymentData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("paymentData", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f21511b);
        bundle.putString("templateName", this.f21512c);
        bundle.putInt("backstackId", this.f21513d);
        bundle.putBoolean("isOwnAccount", this.f21514e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_newPaymentUnitedKingdomFragment_to_paymentDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f21510a, dVar.f21510a) && this.f21511b == dVar.f21511b && f.b(this.f21512c, dVar.f21512c) && this.f21513d == dVar.f21513d && this.f21514e == dVar.f21514e;
    }

    public final int hashCode() {
        int d10 = v.d(this.f21510a.hashCode() * 31, 31, this.f21511b);
        String str = this.f21512c;
        return Boolean.hashCode(this.f21514e) + v.b(this.f21513d, (d10 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionNewPaymentUnitedKingdomFragmentToPaymentDetailsFragment(paymentData=");
        sb2.append(this.f21510a);
        sb2.append(", isTemplate=");
        sb2.append(this.f21511b);
        sb2.append(", templateName=");
        sb2.append(this.f21512c);
        sb2.append(", backstackId=");
        sb2.append(this.f21513d);
        sb2.append(", isOwnAccount=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.f21514e, ")");
    }
}
