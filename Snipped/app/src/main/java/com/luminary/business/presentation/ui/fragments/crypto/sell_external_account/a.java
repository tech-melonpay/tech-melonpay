package com.luminary.business.presentation.ui.fragments.crypto.sell_external_account;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: SellExternalAccountInfoFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f12153a;

    /* renamed from: b, reason: collision with root package name */
    public final BankAccountDomain f12154b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12155c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12156d;

    /* renamed from: e, reason: collision with root package name */
    public final float f12157e;

    /* renamed from: f, reason: collision with root package name */
    public final float f12158f;

    /* renamed from: g, reason: collision with root package name */
    public final float f12159g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12160h;
    public final boolean i;

    /* compiled from: SellExternalAccountInfoFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.crypto.sell_external_account.a$a, reason: collision with other inner class name */
    public static final class C0125a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "cryptoAccount")) {
                throw new IllegalArgumentException("Required argument \"cryptoAccount\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CryptoAccountDomain.class) && !Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            CryptoAccountDomain cryptoAccountDomain = (CryptoAccountDomain) bundle.get("cryptoAccount");
            if (!bundle.containsKey("account")) {
                throw new IllegalArgumentException("Required argument \"account\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(BankAccountDomain.class) && !Serializable.class.isAssignableFrom(BankAccountDomain.class)) {
                throw new UnsupportedOperationException(BankAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            BankAccountDomain bankAccountDomain = (BankAccountDomain) bundle.get("account");
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
            if (bundle.containsKey("externalAccount")) {
                return new a(cryptoAccountDomain, bankAccountDomain, string, string2, f10, f11, f12, string3, bundle.getBoolean("externalAccount"));
            }
            throw new IllegalArgumentException("Required argument \"externalAccount\" is missing and does not have an android:defaultValue");
        }
    }

    public a(CryptoAccountDomain cryptoAccountDomain, BankAccountDomain bankAccountDomain, String str, String str2, float f10, float f11, float f12, String str3, boolean z10) {
        this.f12153a = cryptoAccountDomain;
        this.f12154b = bankAccountDomain;
        this.f12155c = str;
        this.f12156d = str2;
        this.f12157e = f10;
        this.f12158f = f11;
        this.f12159g = f12;
        this.f12160h = str3;
        this.i = z10;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0125a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f12153a, aVar.f12153a) && f.b(this.f12154b, aVar.f12154b) && f.b(this.f12155c, aVar.f12155c) && f.b(this.f12156d, aVar.f12156d) && Float.compare(this.f12157e, aVar.f12157e) == 0 && Float.compare(this.f12158f, aVar.f12158f) == 0 && Float.compare(this.f12159g, aVar.f12159g) == 0 && f.b(this.f12160h, aVar.f12160h) && this.i == aVar.i;
    }

    public final int hashCode() {
        CryptoAccountDomain cryptoAccountDomain = this.f12153a;
        int hashCode = (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode()) * 31;
        BankAccountDomain bankAccountDomain = this.f12154b;
        return Boolean.hashCode(this.i) + v.c(v.a(v.a(v.a(v.c(v.c((hashCode + (bankAccountDomain != null ? bankAccountDomain.hashCode() : 0)) * 31, 31, this.f12155c), 31, this.f12156d), this.f12157e, 31), this.f12158f, 31), this.f12159g, 31), 31, this.f12160h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellExternalAccountInfoFragmentArgs(cryptoAccount=");
        sb2.append(this.f12153a);
        sb2.append(", account=");
        sb2.append(this.f12154b);
        sb2.append(", fromCurrency=");
        sb2.append(this.f12155c);
        sb2.append(", toCurrency=");
        sb2.append(this.f12156d);
        sb2.append(", amountDestination=");
        sb2.append(this.f12157e);
        sb2.append(", amountSource=");
        sb2.append(this.f12158f);
        sb2.append(", fee=");
        sb2.append(this.f12159g);
        sb2.append(", feeCurrency=");
        sb2.append(this.f12160h);
        sb2.append(", externalAccount=");
        return com.google.android.gms.measurement.internal.a.k(sb2, this.i, ")");
    }
}
