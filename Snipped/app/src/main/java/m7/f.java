package m7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CryptoExchangeFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class f implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f23967a;

    /* renamed from: b, reason: collision with root package name */
    public final BankAccountDomain f23968b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23969c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23970d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23971e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23972f;

    /* renamed from: g, reason: collision with root package name */
    public final float f23973g;

    public f(CryptoAccountDomain cryptoAccountDomain, BankAccountDomain bankAccountDomain, String str, String str2, float f10, float f11, float f12) {
        this.f23967a = cryptoAccountDomain;
        this.f23968b = bankAccountDomain;
        this.f23969c = str;
        this.f23970d = str2;
        this.f23971e = f10;
        this.f23972f = f11;
        this.f23973g = f12;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable = this.f23967a;
        if (isAssignableFrom) {
            bundle.putParcelable("cryptoAccount", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("cryptoAccount", serializable);
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(BankAccountDomain.class);
        Serializable serializable2 = this.f23968b;
        if (isAssignableFrom2) {
            bundle.putParcelable("account", (Parcelable) serializable2);
        } else {
            if (!Serializable.class.isAssignableFrom(BankAccountDomain.class)) {
                throw new UnsupportedOperationException(BankAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("account", serializable2);
        }
        bundle.putString("fromCurrency", this.f23969c);
        bundle.putString("toCurrency", this.f23970d);
        bundle.putFloat("amountDestination", this.f23971e);
        bundle.putFloat("amountSource", this.f23972f);
        bundle.putFloat("fee", this.f23973g);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_cryptoExchangeFragment_to_buyExternalAccountDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.f.b(this.f23967a, fVar.f23967a) && kotlin.jvm.internal.f.b(this.f23968b, fVar.f23968b) && kotlin.jvm.internal.f.b(this.f23969c, fVar.f23969c) && kotlin.jvm.internal.f.b(this.f23970d, fVar.f23970d) && Float.compare(this.f23971e, fVar.f23971e) == 0 && Float.compare(this.f23972f, fVar.f23972f) == 0 && Float.compare(this.f23973g, fVar.f23973g) == 0;
    }

    public final int hashCode() {
        CryptoAccountDomain cryptoAccountDomain = this.f23967a;
        int hashCode = (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode()) * 31;
        BankAccountDomain bankAccountDomain = this.f23968b;
        return Float.hashCode(this.f23973g) + v.a(v.a(v.c(v.c((hashCode + (bankAccountDomain != null ? bankAccountDomain.hashCode() : 0)) * 31, 31, this.f23969c), 31, this.f23970d), this.f23971e, 31), this.f23972f, 31);
    }

    public final String toString() {
        return "ActionCryptoExchangeFragmentToBuyExternalAccountDetailsFragment(cryptoAccount=" + this.f23967a + ", account=" + this.f23968b + ", fromCurrency=" + this.f23969c + ", toCurrency=" + this.f23970d + ", amountDestination=" + this.f23971e + ", amountSource=" + this.f23972f + ", fee=" + this.f23973g + ")";
    }
}
