package c8;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: NewPaymentBankEmailFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f8591a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8592b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8593c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8594d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8595e = false;

    public c(PaymentUI paymentUI, boolean z10, String str, int i) {
        this.f8591a = paymentUI;
        this.f8592b = z10;
        this.f8593c = str;
        this.f8594d = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f8591a;
        if (isAssignableFrom) {
            bundle.putParcelable("paymentData", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("paymentData", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f8592b);
        bundle.putString("templateName", this.f8593c);
        bundle.putInt("backstackId", this.f8594d);
        bundle.putBoolean("isOwnAccount", this.f8595e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_newPaymentBankEmailFragment_to_paymentDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f8591a, cVar.f8591a) && this.f8592b == cVar.f8592b && f.b(this.f8593c, cVar.f8593c) && this.f8594d == cVar.f8594d && this.f8595e == cVar.f8595e;
    }

    public final int hashCode() {
        int d10 = v.d(this.f8591a.hashCode() * 31, 31, this.f8592b);
        String str = this.f8593c;
        return Boolean.hashCode(this.f8595e) + v.b(this.f8594d, (d10 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionNewPaymentBankEmailFragmentToPaymentDetailsFragment(paymentData=");
        sb2.append(this.f8591a);
        sb2.append(", isTemplate=");
        sb2.append(this.f8592b);
        sb2.append(", templateName=");
        sb2.append(this.f8593c);
        sb2.append(", backstackId=");
        sb2.append(this.f8594d);
        sb2.append(", isOwnAccount=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.f8595e, ")");
    }
}
