package l7;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CryptoAccountDetailsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23568a = false;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoExchangeFragment$Companion$DirectionType f23569b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23570c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23571d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23572e;

    public e(CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType, String str, String str2, float f10) {
        this.f23569b = cryptoExchangeFragment$Companion$DirectionType;
        this.f23570c = str;
        this.f23571d = str2;
        this.f23572e = f10;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlyShow", this.f23568a);
        bundle.putString("sourceCurrency", this.f23570c);
        bundle.putString("destinationCurrency", this.f23571d);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class);
        Serializable serializable = this.f23569b;
        if (isAssignableFrom) {
            bundle.putParcelable("direction", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class)) {
                throw new UnsupportedOperationException(CryptoExchangeFragment$Companion$DirectionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("direction", serializable);
        }
        bundle.putFloat("value", this.f23572e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_walletDetailsFragment_to_cryptoExchangeFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f23568a == eVar.f23568a && this.f23569b == eVar.f23569b && kotlin.jvm.internal.f.b(this.f23570c, eVar.f23570c) && kotlin.jvm.internal.f.b(this.f23571d, eVar.f23571d) && Float.compare(this.f23572e, eVar.f23572e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23572e) + v.c(v.c((this.f23569b.hashCode() + (Boolean.hashCode(this.f23568a) * 31)) * 31, 31, this.f23570c), 31, this.f23571d);
    }

    public final String toString() {
        return "ActionWalletDetailsFragmentToCryptoExchangeFragment(onlyShow=" + this.f23568a + ", direction=" + this.f23569b + ", sourceCurrency=" + this.f23570c + ", destinationCurrency=" + this.f23571d + ", value=" + this.f23572e + ")";
    }
}
