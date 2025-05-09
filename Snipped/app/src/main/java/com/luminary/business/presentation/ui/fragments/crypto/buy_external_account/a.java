package com.luminary.business.presentation.ui.fragments.crypto.buy_external_account;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.account.BankAccountDomain;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: BuyExternalAccountDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f11962a;

    /* renamed from: b, reason: collision with root package name */
    public final BankAccountDomain f11963b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11964c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11965d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11966e;

    /* renamed from: f, reason: collision with root package name */
    public final float f11967f;

    /* renamed from: g, reason: collision with root package name */
    public final float f11968g;

    /* compiled from: BuyExternalAccountDetailsFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.crypto.buy_external_account.a$a, reason: collision with other inner class name */
    public static final class C0119a {
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
            if (bundle.containsKey("fee")) {
                return new a(cryptoAccountDomain, bankAccountDomain, string, string2, f10, f11, bundle.getFloat("fee"));
            }
            throw new IllegalArgumentException("Required argument \"fee\" is missing and does not have an android:defaultValue");
        }
    }

    public a(CryptoAccountDomain cryptoAccountDomain, BankAccountDomain bankAccountDomain, String str, String str2, float f10, float f11, float f12) {
        this.f11962a = cryptoAccountDomain;
        this.f11963b = bankAccountDomain;
        this.f11964c = str;
        this.f11965d = str2;
        this.f11966e = f10;
        this.f11967f = f11;
        this.f11968g = f12;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0119a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f11962a, aVar.f11962a) && f.b(this.f11963b, aVar.f11963b) && f.b(this.f11964c, aVar.f11964c) && f.b(this.f11965d, aVar.f11965d) && Float.compare(this.f11966e, aVar.f11966e) == 0 && Float.compare(this.f11967f, aVar.f11967f) == 0 && Float.compare(this.f11968g, aVar.f11968g) == 0;
    }

    public final int hashCode() {
        CryptoAccountDomain cryptoAccountDomain = this.f11962a;
        int hashCode = (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode()) * 31;
        BankAccountDomain bankAccountDomain = this.f11963b;
        return Float.hashCode(this.f11968g) + v.a(v.a(v.c(v.c((hashCode + (bankAccountDomain != null ? bankAccountDomain.hashCode() : 0)) * 31, 31, this.f11964c), 31, this.f11965d), this.f11966e, 31), this.f11967f, 31);
    }

    public final String toString() {
        return "BuyExternalAccountDetailsFragmentArgs(cryptoAccount=" + this.f11962a + ", account=" + this.f11963b + ", fromCurrency=" + this.f11964c + ", toCurrency=" + this.f11965d + ", amountDestination=" + this.f11966e + ", amountSource=" + this.f11967f + ", fee=" + this.f11968g + ")";
    }
}
