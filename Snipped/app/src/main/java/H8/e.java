package h8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: NewPaymentToBankAccountBankInfoFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class e implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f21210a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21211b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21212c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21213d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21214e;

    public e(PaymentUI paymentUI, boolean z10, String str, int i, boolean z11) {
        this.f21210a = paymentUI;
        this.f21211b = z10;
        this.f21212c = str;
        this.f21213d = i;
        this.f21214e = z11;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f21210a;
        if (isAssignableFrom) {
            bundle.putParcelable("paymentData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("paymentData", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f21211b);
        bundle.putString("templateName", this.f21212c);
        bundle.putInt("backstackId", this.f21213d);
        bundle.putBoolean("isOwnAccount", this.f21214e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_newPaymentToBankAccountBankInfoFragment_to_paymentDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f21210a, eVar.f21210a) && this.f21211b == eVar.f21211b && kotlin.jvm.internal.f.b(this.f21212c, eVar.f21212c) && this.f21213d == eVar.f21213d && this.f21214e == eVar.f21214e;
    }

    public final int hashCode() {
        int d10 = v.d(this.f21210a.hashCode() * 31, 31, this.f21211b);
        String str = this.f21212c;
        return Boolean.hashCode(this.f21214e) + v.b(this.f21213d, (d10 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionNewPaymentToBankAccountBankInfoFragmentToPaymentDetailsFragment(paymentData=");
        sb2.append(this.f21210a);
        sb2.append(", isTemplate=");
        sb2.append(this.f21211b);
        sb2.append(", templateName=");
        sb2.append(this.f21212c);
        sb2.append(", backstackId=");
        sb2.append(this.f21213d);
        sb2.append(", isOwnAccount=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.f21214e, ")");
    }
}
