package B7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: NewHomeFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class j implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f454a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoExchangeFragment$Companion$DirectionType f455b;

    /* renamed from: c, reason: collision with root package name */
    public final String f456c;

    /* renamed from: d, reason: collision with root package name */
    public final String f457d;

    /* renamed from: e, reason: collision with root package name */
    public final float f458e;

    public j(String str, String str2, float f10) {
        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12051b;
        this.f454a = false;
        this.f455b = cryptoExchangeFragment$Companion$DirectionType;
        this.f456c = str;
        this.f457d = str2;
        this.f458e = f10;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlyShow", this.f454a);
        bundle.putString("sourceCurrency", this.f456c);
        bundle.putString("destinationCurrency", this.f457d);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class);
        Serializable serializable = this.f455b;
        if (isAssignableFrom) {
            bundle.putParcelable("direction", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class)) {
                throw new UnsupportedOperationException(CryptoExchangeFragment$Companion$DirectionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("direction", serializable);
        }
        bundle.putFloat("value", this.f458e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_homeFragment_to_cryptoExchangeFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f454a == jVar.f454a && this.f455b == jVar.f455b && kotlin.jvm.internal.f.b(this.f456c, jVar.f456c) && kotlin.jvm.internal.f.b(this.f457d, jVar.f457d) && Float.compare(this.f458e, jVar.f458e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f458e) + v.c(v.c((this.f455b.hashCode() + (Boolean.hashCode(this.f454a) * 31)) * 31, 31, this.f456c), 31, this.f457d);
    }

    public final String toString() {
        return "ActionHomeFragmentToCryptoExchangeFragment(onlyShow=" + this.f454a + ", direction=" + this.f455b + ", sourceCurrency=" + this.f456c + ", destinationCurrency=" + this.f457d + ", value=" + this.f458e + ")";
    }
}
