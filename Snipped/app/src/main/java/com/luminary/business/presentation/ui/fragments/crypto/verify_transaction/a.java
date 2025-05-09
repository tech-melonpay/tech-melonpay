package com.luminary.business.presentation.ui.fragments.crypto.verify_transaction;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptowallet.CryptowalletDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: VerifyTransactionFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CryptowalletDomain f12184a;

    /* compiled from: VerifyTransactionFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.crypto.verify_transaction.a$a, reason: collision with other inner class name */
    public static final class C0126a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "wallet")) {
                throw new IllegalArgumentException("Required argument \"wallet\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CryptowalletDomain.class) && !Serializable.class.isAssignableFrom(CryptowalletDomain.class)) {
                throw new UnsupportedOperationException(CryptowalletDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            CryptowalletDomain cryptowalletDomain = (CryptowalletDomain) bundle.get("wallet");
            if (cryptowalletDomain != null) {
                return new a(cryptowalletDomain);
            }
            throw new IllegalArgumentException("Argument \"wallet\" is marked as non-null but was passed a null value.");
        }
    }

    public a(CryptowalletDomain cryptowalletDomain) {
        this.f12184a = cryptowalletDomain;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0126a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && f.b(this.f12184a, ((a) obj).f12184a);
    }

    public final int hashCode() {
        return this.f12184a.hashCode();
    }

    public final String toString() {
        return "VerifyTransactionFragmentArgs(wallet=" + this.f12184a + ")";
    }
}
