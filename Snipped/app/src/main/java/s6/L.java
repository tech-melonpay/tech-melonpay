package s6;

import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.payment.PaymentUI;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: MainNavDirections.kt */
/* loaded from: classes2.dex */
public final class L implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final PaymentUI f26703a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26704b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26705c;

    public L(PaymentUI paymentUI, boolean z10, int i) {
        this.f26703a = paymentUI;
        this.f26704b = z10;
        this.f26705c = i;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(PaymentUI.class);
        Parcelable parcelable = this.f26703a;
        if (isAssignableFrom) {
            bundle.putParcelable("payment", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(PaymentUI.class)) {
                throw new UnsupportedOperationException(PaymentUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("payment", (Serializable) parcelable);
        }
        bundle.putBoolean("isTemplate", this.f26704b);
        bundle.putInt("backstackId", this.f26705c);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_global_newPaymentBankEmailFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return kotlin.jvm.internal.f.b(this.f26703a, l10.f26703a) && this.f26704b == l10.f26704b && this.f26705c == l10.f26705c;
    }

    public final int hashCode() {
        PaymentUI paymentUI = this.f26703a;
        return Integer.hashCode(this.f26705c) + C.v.d((paymentUI == null ? 0 : paymentUI.hashCode()) * 31, 31, this.f26704b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionGlobalNewPaymentBankEmailFragment(payment=");
        sb2.append(this.f26703a);
        sb2.append(", isTemplate=");
        sb2.append(this.f26704b);
        sb2.append(", backstackId=");
        return s3.b.m(sb2, this.f26705c, ")");
    }
}
