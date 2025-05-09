package q7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: ExchangeListFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class h implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25902a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoExchangeFragment$Companion$DirectionType f25903b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25904c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25905d;

    /* renamed from: e, reason: collision with root package name */
    public final float f25906e;

    public h(boolean z10, CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType, String str, String str2, float f10) {
        this.f25902a = z10;
        this.f25903b = cryptoExchangeFragment$Companion$DirectionType;
        this.f25904c = str;
        this.f25905d = str2;
        this.f25906e = f10;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlyShow", this.f25902a);
        bundle.putString("sourceCurrency", this.f25904c);
        bundle.putString("destinationCurrency", this.f25905d);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class);
        Serializable serializable = this.f25903b;
        if (isAssignableFrom) {
            bundle.putParcelable("direction", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class)) {
                throw new UnsupportedOperationException(CryptoExchangeFragment$Companion$DirectionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("direction", serializable);
        }
        bundle.putFloat("value", this.f25906e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_exchangeListFragment_to_cryptoExchangeFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f25902a == hVar.f25902a && this.f25903b == hVar.f25903b && kotlin.jvm.internal.f.b(this.f25904c, hVar.f25904c) && kotlin.jvm.internal.f.b(this.f25905d, hVar.f25905d) && Float.compare(this.f25906e, hVar.f25906e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25906e) + v.c(v.c((this.f25903b.hashCode() + (Boolean.hashCode(this.f25902a) * 31)) * 31, 31, this.f25904c), 31, this.f25905d);
    }

    public final String toString() {
        return "ActionExchangeListFragmentToCryptoExchangeFragment(onlyShow=" + this.f25902a + ", direction=" + this.f25903b + ", sourceCurrency=" + this.f25904c + ", destinationCurrency=" + this.f25905d + ", value=" + this.f25906e + ")";
    }
}
