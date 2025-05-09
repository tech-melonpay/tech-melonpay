package com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptoExchangeCreateRequestDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: CreateExchangeDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f11977a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoAccountDomain f11978b;

    /* renamed from: c, reason: collision with root package name */
    public final BankAccountDomain f11979c;

    /* renamed from: d, reason: collision with root package name */
    public final BankAccountDomain f11980d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11981e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11982f;

    /* renamed from: g, reason: collision with root package name */
    public final float f11983g;

    /* renamed from: h, reason: collision with root package name */
    public final float f11984h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11985j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11986k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11987l;

    /* renamed from: m, reason: collision with root package name */
    public final CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain f11988m;

    /* compiled from: CreateExchangeDetailsFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.crypto.create_exchange_details.a$a, reason: collision with other inner class name */
    public static final class C0120a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "cryptoAccount")) {
                throw new IllegalArgumentException("Required argument \"cryptoAccount\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CryptoAccountDomain.class) && !Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            CryptoAccountDomain cryptoAccountDomain = (CryptoAccountDomain) bundle.get("cryptoAccount");
            if (!bundle.containsKey("cryptoAccountSecondary")) {
                throw new IllegalArgumentException("Required argument \"cryptoAccountSecondary\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CryptoAccountDomain.class) && !Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            CryptoAccountDomain cryptoAccountDomain2 = (CryptoAccountDomain) bundle.get("cryptoAccountSecondary");
            if (!bundle.containsKey("account")) {
                throw new IllegalArgumentException("Required argument \"account\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(BankAccountDomain.class) && !Serializable.class.isAssignableFrom(BankAccountDomain.class)) {
                throw new UnsupportedOperationException(BankAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            BankAccountDomain bankAccountDomain = (BankAccountDomain) bundle.get("account");
            if (!bundle.containsKey("accountSecondary")) {
                throw new IllegalArgumentException("Required argument \"accountSecondary\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(BankAccountDomain.class) && !Serializable.class.isAssignableFrom(BankAccountDomain.class)) {
                throw new UnsupportedOperationException(BankAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            BankAccountDomain bankAccountDomain2 = (BankAccountDomain) bundle.get("accountSecondary");
            if (!bundle.containsKey("fromCurrency")) {
                throw new IllegalArgumentException("Required argument \"fromCurrency\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("fromCurrency");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"fromCurrency\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("toCurrency")) {
                throw new IllegalArgumentException("Required argument \"toCurrency\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("toCurrency");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"toCurrency\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("amountDestination")) {
                throw new IllegalArgumentException("Required argument \"amountDestination\" is missing and does not have an android:defaultValue");
            }
            float f10 = bundle.getFloat("amountDestination");
            if (!bundle.containsKey("amountSource")) {
                throw new IllegalArgumentException("Required argument \"amountSource\" is missing and does not have an android:defaultValue");
            }
            float f11 = bundle.getFloat("amountSource");
            if (!bundle.containsKey("fee")) {
                throw new IllegalArgumentException("Required argument \"fee\" is missing and does not have an android:defaultValue");
            }
            float f12 = bundle.getFloat("fee");
            if (!bundle.containsKey("feeCurrency")) {
                throw new IllegalArgumentException("Required argument \"feeCurrency\" is missing and does not have an android:defaultValue");
            }
            String string3 = bundle.getString("feeCurrency");
            if (string3 == null) {
                throw new IllegalArgumentException("Argument \"feeCurrency\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("externalAccount")) {
                throw new IllegalArgumentException("Required argument \"externalAccount\" is missing and does not have an android:defaultValue");
            }
            boolean z10 = bundle.getBoolean("externalAccount");
            if (!bundle.containsKey("showTemplate")) {
                throw new IllegalArgumentException("Required argument \"showTemplate\" is missing and does not have an android:defaultValue");
            }
            boolean z11 = bundle.getBoolean("showTemplate");
            if (!bundle.containsKey("externalRequisites")) {
                throw new IllegalArgumentException("Required argument \"externalRequisites\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain.class) || Serializable.class.isAssignableFrom(CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain.class)) {
                return new a(cryptoAccountDomain, cryptoAccountDomain2, bankAccountDomain, bankAccountDomain2, string, string2, f10, f11, f12, string3, z10, z11, (CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain) bundle.get("externalRequisites"));
            }
            throw new UnsupportedOperationException(CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
    }

    public a(CryptoAccountDomain cryptoAccountDomain, CryptoAccountDomain cryptoAccountDomain2, BankAccountDomain bankAccountDomain, BankAccountDomain bankAccountDomain2, String str, String str2, float f10, float f11, float f12, String str3, boolean z10, boolean z11, CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain) {
        this.f11977a = cryptoAccountDomain;
        this.f11978b = cryptoAccountDomain2;
        this.f11979c = bankAccountDomain;
        this.f11980d = bankAccountDomain2;
        this.f11981e = str;
        this.f11982f = str2;
        this.f11983g = f10;
        this.f11984h = f11;
        this.i = f12;
        this.f11985j = str3;
        this.f11986k = z10;
        this.f11987l = z11;
        this.f11988m = externalAccountRequisitesDomain;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0120a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f11977a, aVar.f11977a) && f.b(this.f11978b, aVar.f11978b) && f.b(this.f11979c, aVar.f11979c) && f.b(this.f11980d, aVar.f11980d) && f.b(this.f11981e, aVar.f11981e) && f.b(this.f11982f, aVar.f11982f) && Float.compare(this.f11983g, aVar.f11983g) == 0 && Float.compare(this.f11984h, aVar.f11984h) == 0 && Float.compare(this.i, aVar.i) == 0 && f.b(this.f11985j, aVar.f11985j) && this.f11986k == aVar.f11986k && this.f11987l == aVar.f11987l && f.b(this.f11988m, aVar.f11988m);
    }

    public final int hashCode() {
        CryptoAccountDomain cryptoAccountDomain = this.f11977a;
        int hashCode = (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode()) * 31;
        CryptoAccountDomain cryptoAccountDomain2 = this.f11978b;
        int hashCode2 = (hashCode + (cryptoAccountDomain2 == null ? 0 : cryptoAccountDomain2.hashCode())) * 31;
        BankAccountDomain bankAccountDomain = this.f11979c;
        int hashCode3 = (hashCode2 + (bankAccountDomain == null ? 0 : bankAccountDomain.hashCode())) * 31;
        BankAccountDomain bankAccountDomain2 = this.f11980d;
        int d10 = v.d(v.d(v.c(v.a(v.a(v.a(v.c(v.c((hashCode3 + (bankAccountDomain2 == null ? 0 : bankAccountDomain2.hashCode())) * 31, 31, this.f11981e), 31, this.f11982f), this.f11983g, 31), this.f11984h, 31), this.i, 31), 31, this.f11985j), 31, this.f11986k), 31, this.f11987l);
        CryptoExchangeCreateRequestDomain.ExternalAccountRequisitesDomain externalAccountRequisitesDomain = this.f11988m;
        return d10 + (externalAccountRequisitesDomain != null ? externalAccountRequisitesDomain.hashCode() : 0);
    }

    public final String toString() {
        return "CreateExchangeDetailsFragmentArgs(cryptoAccount=" + this.f11977a + ", cryptoAccountSecondary=" + this.f11978b + ", account=" + this.f11979c + ", accountSecondary=" + this.f11980d + ", fromCurrency=" + this.f11981e + ", toCurrency=" + this.f11982f + ", amountDestination=" + this.f11983g + ", amountSource=" + this.f11984h + ", fee=" + this.i + ", feeCurrency=" + this.f11985j + ", externalAccount=" + this.f11986k + ", showTemplate=" + this.f11987l + ", externalRequisites=" + this.f11988m + ")";
    }
}
