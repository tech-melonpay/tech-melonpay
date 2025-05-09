package com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: DepositCryptoDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CryptowalletDomain f12093a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoAccountDomain f12094b;

    /* compiled from: DepositCryptoDetailsFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.crypto.deposit_crypto.a$a, reason: collision with other inner class name */
    public static final class C0124a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "wallet")) {
                throw new IllegalArgumentException("Required argument \"wallet\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CryptowalletDomain.class) && !Serializable.class.isAssignableFrom(CryptowalletDomain.class)) {
                throw new UnsupportedOperationException(CryptowalletDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            CryptowalletDomain cryptowalletDomain = (CryptowalletDomain) bundle.get("wallet");
            if (!bundle.containsKey("account")) {
                throw new IllegalArgumentException("Required argument \"account\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(CryptoAccountDomain.class) || Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                return new a(cryptowalletDomain, (CryptoAccountDomain) bundle.get("account"));
            }
            throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
    }

    public a(CryptowalletDomain cryptowalletDomain, CryptoAccountDomain cryptoAccountDomain) {
        this.f12093a = cryptowalletDomain;
        this.f12094b = cryptoAccountDomain;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0124a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f12093a, aVar.f12093a) && f.b(this.f12094b, aVar.f12094b);
    }

    public final int hashCode() {
        CryptowalletDomain cryptowalletDomain = this.f12093a;
        int hashCode = (cryptowalletDomain == null ? 0 : cryptowalletDomain.hashCode()) * 31;
        CryptoAccountDomain cryptoAccountDomain = this.f12094b;
        return hashCode + (cryptoAccountDomain != null ? cryptoAccountDomain.hashCode() : 0);
    }

    public final String toString() {
        return "DepositCryptoDetailsFragmentArgs(wallet=" + this.f12093a + ", account=" + this.f12094b + ")";
    }
}
