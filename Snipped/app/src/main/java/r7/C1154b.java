package r7;

import C.v;
import U0.i;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import com.luminary.mobile.R;
import java.io.Serializable;

/* compiled from: SellExternalAccountInfoFragmentDirections.kt */
/* renamed from: r7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1154b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f26301a;

    /* renamed from: c, reason: collision with root package name */
    public final BankAccountDomain f26303c;

    /* renamed from: e, reason: collision with root package name */
    public final String f26305e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26306f;

    /* renamed from: g, reason: collision with root package name */
    public final float f26307g;

    /* renamed from: h, reason: collision with root package name */
    public final float f26308h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final String f26309j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f26310k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26311l;

    /* renamed from: m, reason: collision with root package name */
    public final CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain f26312m;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoAccountDomain f26302b = null;

    /* renamed from: d, reason: collision with root package name */
    public final BankAccountDomain f26304d = null;

    public C1154b(CryptoAccountDomain cryptoAccountDomain, BankAccountDomain bankAccountDomain, String str, String str2, float f10, float f11, float f12, String str3, boolean z10, boolean z11, CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain) {
        this.f26301a = cryptoAccountDomain;
        this.f26303c = bankAccountDomain;
        this.f26305e = str;
        this.f26306f = str2;
        this.f26307g = f10;
        this.f26308h = f11;
        this.i = f12;
        this.f26309j = str3;
        this.f26310k = z10;
        this.f26311l = z11;
        this.f26312m = externalAccountRequisitesDomain;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable = this.f26301a;
        if (isAssignableFrom) {
            bundle.putParcelable("cryptoAccount", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("cryptoAccount", serializable);
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable2 = this.f26302b;
        if (isAssignableFrom2) {
            bundle.putParcelable("cryptoAccountSecondary", (Parcelable) serializable2);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("cryptoAccountSecondary", serializable2);
        }
        boolean isAssignableFrom3 = Parcelable.class.isAssignableFrom(BankAccountDomain.class);
        Serializable serializable3 = this.f26303c;
        if (isAssignableFrom3) {
            bundle.putParcelable("account", (Parcelable) serializable3);
        } else {
            if (!Serializable.class.isAssignableFrom(BankAccountDomain.class)) {
                throw new UnsupportedOperationException(BankAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("account", serializable3);
        }
        boolean isAssignableFrom4 = Parcelable.class.isAssignableFrom(BankAccountDomain.class);
        Serializable serializable4 = this.f26304d;
        if (isAssignableFrom4) {
            bundle.putParcelable("accountSecondary", (Parcelable) serializable4);
        } else {
            if (!Serializable.class.isAssignableFrom(BankAccountDomain.class)) {
                throw new UnsupportedOperationException(BankAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("accountSecondary", serializable4);
        }
        bundle.putString("fromCurrency", this.f26305e);
        bundle.putString("toCurrency", this.f26306f);
        bundle.putFloat("amountDestination", this.f26307g);
        bundle.putFloat("amountSource", this.f26308h);
        bundle.putFloat("fee", this.i);
        bundle.putString("feeCurrency", this.f26309j);
        bundle.putBoolean("externalAccount", this.f26310k);
        bundle.putBoolean("showTemplate", this.f26311l);
        boolean isAssignableFrom5 = Parcelable.class.isAssignableFrom(CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain.class);
        Serializable serializable5 = this.f26312m;
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
        return R.id.action_sellExternalAccountInfoFragment_to_exchangeDetailsFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1154b)) {
            return false;
        }
        C1154b c1154b = (C1154b) obj;
        return kotlin.jvm.internal.f.b(this.f26301a, c1154b.f26301a) && kotlin.jvm.internal.f.b(this.f26302b, c1154b.f26302b) && kotlin.jvm.internal.f.b(this.f26303c, c1154b.f26303c) && kotlin.jvm.internal.f.b(this.f26304d, c1154b.f26304d) && kotlin.jvm.internal.f.b(this.f26305e, c1154b.f26305e) && kotlin.jvm.internal.f.b(this.f26306f, c1154b.f26306f) && Float.compare(this.f26307g, c1154b.f26307g) == 0 && Float.compare(this.f26308h, c1154b.f26308h) == 0 && Float.compare(this.i, c1154b.i) == 0 && kotlin.jvm.internal.f.b(this.f26309j, c1154b.f26309j) && this.f26310k == c1154b.f26310k && this.f26311l == c1154b.f26311l && kotlin.jvm.internal.f.b(this.f26312m, c1154b.f26312m);
    }

    public final int hashCode() {
        CryptoAccountDomain cryptoAccountDomain = this.f26301a;
        int hashCode = (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode()) * 31;
        CryptoAccountDomain cryptoAccountDomain2 = this.f26302b;
        int hashCode2 = (hashCode + (cryptoAccountDomain2 == null ? 0 : cryptoAccountDomain2.hashCode())) * 31;
        BankAccountDomain bankAccountDomain = this.f26303c;
        int hashCode3 = (hashCode2 + (bankAccountDomain == null ? 0 : bankAccountDomain.hashCode())) * 31;
        BankAccountDomain bankAccountDomain2 = this.f26304d;
        int d10 = v.d(v.d(v.c(v.a(v.a(v.a(v.c(v.c((hashCode3 + (bankAccountDomain2 == null ? 0 : bankAccountDomain2.hashCode())) * 31, 31, this.f26305e), 31, this.f26306f), this.f26307g, 31), this.f26308h, 31), this.i, 31), 31, this.f26309j), 31, this.f26310k), 31, this.f26311l);
        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = this.f26312m;
        return d10 + (externalAccountRequisitesDomain != null ? externalAccountRequisitesDomain.hashCode() : 0);
    }

    public final String toString() {
        return "ActionSellExternalAccountInfoFragmentToExchangeDetailsFragment(cryptoAccount=" + this.f26301a + ", cryptoAccountSecondary=" + this.f26302b + ", account=" + this.f26303c + ", accountSecondary=" + this.f26304d + ", fromCurrency=" + this.f26305e + ", toCurrency=" + this.f26306f + ", amountDestination=" + this.f26307g + ", amountSource=" + this.f26308h + ", fee=" + this.i + ", feeCurrency=" + this.f26309j + ", externalAccount=" + this.f26310k + ", showTemplate=" + this.f26311l + ", externalRequisites=" + this.f26312m + ")";
    }
}
