package p7;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: ExchangeDetailsFragmentDirections.kt */
/* renamed from: p7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1113d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25696a = false;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoExchangeFragment$Companion$DirectionType f25697b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25698c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25699d;

    /* renamed from: e, reason: collision with root package name */
    public final float f25700e;

    public C1113d(CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType, String str, String str2, float f10) {
        this.f25697b = cryptoExchangeFragment$Companion$DirectionType;
        this.f25698c = str;
        this.f25699d = str2;
        this.f25700e = f10;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlyShow", this.f25696a);
        bundle.putString("sourceCurrency", this.f25698c);
        bundle.putString("destinationCurrency", this.f25699d);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class);
        Serializable serializable = this.f25697b;
        if (isAssignableFrom) {
            bundle.putParcelable("direction", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class)) {
                throw new UnsupportedOperationException(CryptoExchangeFragment$Companion$DirectionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("direction", serializable);
        }
        bundle.putFloat("value", this.f25700e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_exchangeDetailsFragment_to_cryptoExchangeFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1113d)) {
            return false;
        }
        C1113d c1113d = (C1113d) obj;
        return this.f25696a == c1113d.f25696a && this.f25697b == c1113d.f25697b && kotlin.jvm.internal.f.b(this.f25698c, c1113d.f25698c) && kotlin.jvm.internal.f.b(this.f25699d, c1113d.f25699d) && Float.compare(this.f25700e, c1113d.f25700e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25700e) + v.c(v.c((this.f25697b.hashCode() + (Boolean.hashCode(this.f25696a) * 31)) * 31, 31, this.f25698c), 31, this.f25699d);
    }

    public final String toString() {
        return "ActionExchangeDetailsFragmentToCryptoExchangeFragment(onlyShow=" + this.f25696a + ", direction=" + this.f25697b + ", sourceCurrency=" + this.f25698c + ", destinationCurrency=" + this.f25699d + ", value=" + this.f25700e + ")";
    }
}
