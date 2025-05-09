package C7;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.mobile.R;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: HubFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f683a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoExchangeFragment$Companion$DirectionType f684b;

    /* renamed from: c, reason: collision with root package name */
    public final String f685c;

    /* renamed from: d, reason: collision with root package name */
    public final String f686d;

    /* renamed from: e, reason: collision with root package name */
    public final float f687e;

    public b(boolean z10, String str, String str2, float f10) {
        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12051b;
        this.f683a = z10;
        this.f684b = cryptoExchangeFragment$Companion$DirectionType;
        this.f685c = str;
        this.f686d = str2;
        this.f687e = f10;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlyShow", this.f683a);
        bundle.putString("sourceCurrency", this.f685c);
        bundle.putString("destinationCurrency", this.f686d);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class);
        Serializable serializable = this.f684b;
        if (isAssignableFrom) {
            bundle.putParcelable("direction", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class)) {
                throw new UnsupportedOperationException(CryptoExchangeFragment$Companion$DirectionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("direction", serializable);
        }
        bundle.putFloat("value", this.f687e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_hubFragment_to_cryptoExchangeFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f683a == bVar.f683a && this.f684b == bVar.f684b && f.b(this.f685c, bVar.f685c) && f.b(this.f686d, bVar.f686d) && Float.compare(this.f687e, bVar.f687e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f687e) + v.c(v.c((this.f684b.hashCode() + (Boolean.hashCode(this.f683a) * 31)) * 31, 31, this.f685c), 31, this.f686d);
    }

    public final String toString() {
        return "ActionHubFragmentToCryptoExchangeFragment(onlyShow=" + this.f683a + ", direction=" + this.f684b + ", sourceCurrency=" + this.f685c + ", destinationCurrency=" + this.f686d + ", value=" + this.f687e + ")";
    }
}
