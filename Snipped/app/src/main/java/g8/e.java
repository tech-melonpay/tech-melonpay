package g8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: NewPaymentSwiftBankInfoFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class e implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f20820a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20821b;

    /* renamed from: d, reason: collision with root package name */
    public final int f20823d;

    /* renamed from: c, reason: collision with root package name */
    public final String f20822c = null;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20824e = false;

    public e(PaymentUI paymentUI, boolean z10, int i) {
        this.f20820a = paymentUI;
        this.f20821b = z10;
        this.f20823d = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f20820a;
        if (isAssignableFrom) {
            bundle.putParcelable("paymentData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("paymentData", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f20821b);
        bundle.putString("templateName", this.f20822c);
        bundle.putInt("backstackId", this.f20823d);
        bundle.putBoolean("isOwnAccount", this.f20824e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_newPaymentSwiftBankInfoFragment_to_paymentDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f20820a, eVar.f20820a) && this.f20821b == eVar.f20821b && kotlin.jvm.internal.f.b(this.f20822c, eVar.f20822c) && this.f20823d == eVar.f20823d && this.f20824e == eVar.f20824e;
    }

    public final int hashCode() {
        int d10 = v.d(this.f20820a.hashCode() * 31, 31, this.f20821b);
        String str = this.f20822c;
        return Boolean.hashCode(this.f20824e) + v.b(this.f20823d, (d10 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionNewPaymentSwiftBankInfoFragmentToPaymentDetailsFragment(paymentData=");
        sb2.append(this.f20820a);
        sb2.append(", isTemplate=");
        sb2.append(this.f20821b);
        sb2.append(", templateName=");
        sb2.append(this.f20822c);
        sb2.append(", backstackId=");
        sb2.append(this.f20823d);
        sb2.append(", isOwnAccount=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.f20824e, ")");
    }
}
