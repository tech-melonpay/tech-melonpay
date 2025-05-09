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
public final class h implements U0.i {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f23986a;

    /* renamed from: c, reason: collision with root package name */
    public final String f23988c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23989d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23990e;

    /* renamed from: f, reason: collision with root package name */
    public final float f23991f;

    /* renamed from: g, reason: collision with root package name */
    public final float f23992g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23993h;

    /* renamed from: b, reason: collision with root package name */
    public final BankAccountDomain f23987b = null;
    public final boolean i = true;

    public h(CryptoAccountDomain cryptoAccountDomain, String str, String str2, float f10, float f11, float f12, String str3) {
        this.f23986a = cryptoAccountDomain;
        this.f23988c = str;
        this.f23989d = str2;
        this.f23990e = f10;
        this.f23991f = f11;
        this.f23992g = f12;
        this.f23993h = str3;
    }

    @Override // U0.i
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(CryptoAccountDomain.class);
        Serializable serializable = this.f23986a;
        if (isAssignableFrom) {
            bundle.putParcelable("cryptoAccount", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("cryptoAccount", serializable);
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(BankAccountDomain.class);
        Serializable serializable2 = this.f23987b;
        if (isAssignableFrom2) {
            bundle.putParcelable("account", (Parcelable) serializable2);
        } else {
            if (!Serializable.class.isAssignableFrom(BankAccountDomain.class)) {
                throw new UnsupportedOperationException(BankAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("account", serializable2);
        }
        bundle.putString("fromCurrency", this.f23988c);
        bundle.putString("toCurrency", this.f23989d);
        bundle.putFloat("amountDestination", this.f23990e);
        bundle.putFloat("amountSource", this.f23991f);
        bundle.putFloat("fee", this.f23992g);
        bundle.putString("feeCurrency", this.f23993h);
        bundle.putBoolean("externalAccount", this.i);
        return bundle;
    }

    @Override // U0.i
    public final int b() {
        return R.id.action_cryptoExchangeFragment_to_sellExternalAccountInfoFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.f.b(this.f23986a, hVar.f23986a) && kotlin.jvm.internal.f.b(this.f23987b, hVar.f23987b) && kotlin.jvm.internal.f.b(this.f23988c, hVar.f23988c) && kotlin.jvm.internal.f.b(this.f23989d, hVar.f23989d) && Float.compare(this.f23990e, hVar.f23990e) == 0 && Float.compare(this.f23991f, hVar.f23991f) == 0 && Float.compare(this.f23992g, hVar.f23992g) == 0 && kotlin.jvm.internal.f.b(this.f23993h, hVar.f23993h) && this.i == hVar.i;
    }

    public final int hashCode() {
        CryptoAccountDomain cryptoAccountDomain = this.f23986a;
        int hashCode = (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode()) * 31;
        BankAccountDomain bankAccountDomain = this.f23987b;
        return Boolean.hashCode(this.i) + v.c(v.a(v.a(v.a(v.c(v.c((hashCode + (bankAccountDomain != null ? bankAccountDomain.hashCode() : 0)) * 31, 31, this.f23988c), 31, this.f23989d), this.f23990e, 31), this.f23991f, 31), this.f23992g, 31), 31, this.f23993h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionCryptoExchangeFragmentToSellExternalAccountInfoFragment(cryptoAccount=");
        sb2.append(this.f23986a);
        sb2.append(", account=");
        sb2.append(this.f23987b);
        sb2.append(", fromCurrency=");
        sb2.append(this.f23988c);
        sb2.append(", toCurrency=");
        sb2.append(this.f23989d);
        sb2.append(", amountDestination=");
        sb2.append(this.f23990e);
        sb2.append(", amountSource=");
        sb2.append(this.f23991f);
        sb2.append(", fee=");
        sb2.append(this.f23992g);
        sb2.append(", feeCurrency=");
        sb2.append(this.f23993h);
        sb2.append(", externalAccount=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.i, ")");
    }
}
