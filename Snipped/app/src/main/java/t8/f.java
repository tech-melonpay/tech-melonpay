package t8;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: TransactionDetailsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class f implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29943a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoExchangeFragment$Companion$DirectionType f29944b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29945c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29946d;

    /* renamed from: e, reason: collision with root package name */
    public final float f29947e;

    public f(String str, String str2) {
        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12051b;
        this.f29943a = false;
        this.f29944b = cryptoExchangeFragment$Companion$DirectionType;
        this.f29945c = str;
        this.f29946d = str2;
        this.f29947e = Float.MAX_VALUE;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlyShow", this.f29943a);
        bundle.putString("sourceCurrency", this.f29945c);
        bundle.putString("destinationCurrency", this.f29946d);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class);
        Serializable serializable = this.f29944b;
        if (isAssignableFrom) {
            bundle.putParcelable("direction", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class)) {
                throw new UnsupportedOperationException(CryptoExchangeFragment$Companion$DirectionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("direction", serializable);
        }
        bundle.putFloat("value", this.f29947e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_transactionDetailsFragment_to_cryptoExchangeFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f29943a == fVar.f29943a && this.f29944b == fVar.f29944b && kotlin.jvm.internal.f.b(this.f29945c, fVar.f29945c) && kotlin.jvm.internal.f.b(this.f29946d, fVar.f29946d) && Float.compare(this.f29947e, fVar.f29947e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f29947e) + v.c(v.c((this.f29944b.hashCode() + (Boolean.hashCode(this.f29943a) * 31)) * 31, 31, this.f29945c), 31, this.f29946d);
    }

    public final String toString() {
        return "ActionTransactionDetailsFragmentToCryptoExchangeFragment(onlyShow=" + this.f29943a + ", direction=" + this.f29944b + ", sourceCurrency=" + this.f29945c + ", destinationCurrency=" + this.f29946d + ", value=" + this.f29947e + ")";
    }
}
