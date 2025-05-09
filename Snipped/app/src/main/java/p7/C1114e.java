package p7;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: ExchangeDetailsFragmentDirections.kt */
/* renamed from: p7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1114e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f25701a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25702b;

    /* renamed from: c, reason: collision with root package name */
    public final CryptoAccountDomain f25703c;

    public C1114e(int i, String str, CryptoAccountDomain cryptoAccountDomain) {
        this.f25701a = i;
        this.f25702b = str;
        this.f25703c = cryptoAccountDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("walletId", this.f25701a);
        bundle.putString("address", this.f25702b);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable = this.f25703c;
        if (isAssignableFrom) {
            bundle.putParcelable("account", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("account", serializable);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_exchangeDetailsFragment_to_withdrawCryptoFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1114e)) {
            return false;
        }
        C1114e c1114e = (C1114e) obj;
        return this.f25701a == c1114e.f25701a && kotlin.jvm.internal.f.b(this.f25702b, c1114e.f25702b) && kotlin.jvm.internal.f.b(this.f25703c, c1114e.f25703c);
    }

    public final int hashCode() {
        int c2 = v.c(Integer.hashCode(this.f25701a) * 31, 31, this.f25702b);
        CryptoAccountDomain cryptoAccountDomain = this.f25703c;
        return c2 + (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode());
    }

    public final String toString() {
        return "ActionExchangeDetailsFragmentToWithdrawCryptoFragment(walletId=" + this.f25701a + ", address=" + this.f25702b + ", account=" + this.f25703c + ")";
    }
}
