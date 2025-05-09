package m7;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: CryptoExchangeFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class g implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f23974a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoAccountDomain f23975b;

    /* renamed from: c, reason: collision with root package name */
    public final BankAccountDomain f23976c;

    /* renamed from: d, reason: collision with root package name */
    public final BankAccountDomain f23977d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23978e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23979f;

    /* renamed from: g, reason: collision with root package name */
    public final float f23980g;

    /* renamed from: h, reason: collision with root package name */
    public final float f23981h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final String f23982j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f23983k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23984l = false;

    /* renamed from: m, reason: collision with root package name */
    public final CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain f23985m = null;

    public g(CryptoAccountDomain cryptoAccountDomain, CryptoAccountDomain cryptoAccountDomain2, BankAccountDomain bankAccountDomain, BankAccountDomain bankAccountDomain2, String str, String str2, float f10, float f11, float f12, String str3, boolean z10) {
        this.f23974a = cryptoAccountDomain;
        this.f23975b = cryptoAccountDomain2;
        this.f23976c = bankAccountDomain;
        this.f23977d = bankAccountDomain2;
        this.f23978e = str;
        this.f23979f = str2;
        this.f23980g = f10;
        this.f23981h = f11;
        this.i = f12;
        this.f23982j = str3;
        this.f23983k = z10;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable = this.f23974a;
        if (isAssignableFrom) {
            bundle.putParcelable("cryptoAccount", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("cryptoAccount", serializable);
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable2 = this.f23975b;
        if (isAssignableFrom2) {
            bundle.putParcelable("cryptoAccountSecondary", (Parcelable) serializable2);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("cryptoAccountSecondary", serializable2);
        }
        boolean isAssignableFrom3 = Parcelable.class.isAssignableFrom(BankAccountDomain.class);
        Serializable serializable3 = this.f23976c;
        if (isAssignableFrom3) {
            bundle.putParcelable("account", (Parcelable) serializable3);
        } else {
            if (!Serializable.class.isAssignableFrom(BankAccountDomain.class)) {
                throw new UnsupportedOperationException(BankAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("account", serializable3);
        }
        boolean isAssignableFrom4 = Parcelable.class.isAssignableFrom(BankAccountDomain.class);
        Serializable serializable4 = this.f23977d;
        if (isAssignableFrom4) {
            bundle.putParcelable("accountSecondary", (Parcelable) serializable4);
        } else {
            if (!Serializable.class.isAssignableFrom(BankAccountDomain.class)) {
                throw new UnsupportedOperationException(BankAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("accountSecondary", serializable4);
        }
        bundle.putString("fromCurrency", this.f23978e);
        bundle.putString("toCurrency", this.f23979f);
        bundle.putFloat("amountDestination", this.f23980g);
        bundle.putFloat("amountSource", this.f23981h);
        bundle.putFloat("fee", this.i);
        bundle.putString("feeCurrency", this.f23982j);
        bundle.putBoolean("externalAccount", this.f23983k);
        bundle.putBoolean("showTemplate", this.f23984l);
        boolean isAssignableFrom5 = Parcelable.class.isAssignableFrom(CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain.class);
        Serializable serializable5 = this.f23985m;
        if (isAssignableFrom5) {
            bundle.putParcelable("externalRequisites", (Parcelable) serializable5);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain.class)) {
                throw new UnsupportedOperationException(CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("externalRequisites", serializable5);
        }
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_cryptoExchangeFragment_to_exchangeDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f.b(this.f23974a, gVar.f23974a) && kotlin.jvm.internal.f.b(this.f23975b, gVar.f23975b) && kotlin.jvm.internal.f.b(this.f23976c, gVar.f23976c) && kotlin.jvm.internal.f.b(this.f23977d, gVar.f23977d) && kotlin.jvm.internal.f.b(this.f23978e, gVar.f23978e) && kotlin.jvm.internal.f.b(this.f23979f, gVar.f23979f) && Float.compare(this.f23980g, gVar.f23980g) == 0 && Float.compare(this.f23981h, gVar.f23981h) == 0 && Float.compare(this.i, gVar.i) == 0 && kotlin.jvm.internal.f.b(this.f23982j, gVar.f23982j) && this.f23983k == gVar.f23983k && this.f23984l == gVar.f23984l && kotlin.jvm.internal.f.b(this.f23985m, gVar.f23985m);
    }

    public final int hashCode() {
        CryptoAccountDomain cryptoAccountDomain = this.f23974a;
        int hashCode = (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode()) * 31;
        CryptoAccountDomain cryptoAccountDomain2 = this.f23975b;
        int hashCode2 = (hashCode + (cryptoAccountDomain2 == null ? 0 : cryptoAccountDomain2.hashCode())) * 31;
        BankAccountDomain bankAccountDomain = this.f23976c;
        int hashCode3 = (hashCode2 + (bankAccountDomain == null ? 0 : bankAccountDomain.hashCode())) * 31;
        BankAccountDomain bankAccountDomain2 = this.f23977d;
        int d10 = v.d(v.d(v.c(v.a(v.a(v.a(v.c(v.c((hashCode3 + (bankAccountDomain2 == null ? 0 : bankAccountDomain2.hashCode())) * 31, 31, this.f23978e), 31, this.f23979f), this.f23980g, 31), this.f23981h, 31), this.i, 31), 31, this.f23982j), 31, this.f23983k), 31, this.f23984l);
        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = this.f23985m;
        return d10 + (externalAccountRequisitesDomain != null ? externalAccountRequisitesDomain.hashCode() : 0);
    }

    public final String toString() {
        return "ActionCryptoExchangeFragmentToExchangeDetailsFragment(cryptoAccount=" + this.f23974a + ", cryptoAccountSecondary=" + this.f23975b + ", account=" + this.f23976c + ", accountSecondary=" + this.f23977d + ", fromCurrency=" + this.f23978e + ", toCurrency=" + this.f23979f + ", amountDestination=" + this.f23980g + ", amountSource=" + this.f23981h + ", fee=" + this.i + ", feeCurrency=" + this.f23982j + ", externalAccount=" + this.f23983k + ", showTemplate=" + this.f23984l + ", externalRequisites=" + this.f23985m + ")";
    }
}
