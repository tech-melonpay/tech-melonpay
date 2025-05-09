package D6;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_exchange.CryptoExchangeFragment$Companion$DirectionType;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: AccountDetailsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class f implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f934a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoExchangeFragment$Companion$DirectionType f935b;

    /* renamed from: c, reason: collision with root package name */
    public final String f936c;

    /* renamed from: d, reason: collision with root package name */
    public final String f937d;

    /* renamed from: e, reason: collision with root package name */
    public final float f938e;

    public f(String str, String str2, float f10) {
        CryptoExchangeFragment$Companion$DirectionType cryptoExchangeFragment$Companion$DirectionType = CryptoExchangeFragment$Companion$DirectionType.f12051b;
        this.f934a = false;
        this.f935b = cryptoExchangeFragment$Companion$DirectionType;
        this.f936c = str;
        this.f937d = str2;
        this.f938e = f10;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlyShow", this.f934a);
        bundle.putString("sourceCurrency", this.f936c);
        bundle.putString("destinationCurrency", this.f937d);
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class);
        Serializable serializable = this.f935b;
        if (isAssignableFrom) {
            bundle.putParcelable("direction", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoExchangeFragment$Companion$DirectionType.class)) {
                throw new UnsupportedOperationException(CryptoExchangeFragment$Companion$DirectionType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("direction", serializable);
        }
        bundle.putFloat("value", this.f938e);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_accountDetailsFragment_to_cryptoExchangeFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f934a == fVar.f934a && this.f935b == fVar.f935b && kotlin.jvm.internal.f.b(this.f936c, fVar.f936c) && kotlin.jvm.internal.f.b(this.f937d, fVar.f937d) && Float.compare(this.f938e, fVar.f938e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f938e) + v.c(v.c((this.f935b.hashCode() + (Boolean.hashCode(this.f934a) * 31)) * 31, 31, this.f936c), 31, this.f937d);
    }

    public final String toString() {
        return "ActionAccountDetailsFragmentToCryptoExchangeFragment(onlyShow=" + this.f934a + ", direction=" + this.f935b + ", sourceCurrency=" + this.f936c + ", destinationCurrency=" + this.f937d + ", value=" + this.f938e + ")";
    }
}
