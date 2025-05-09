package com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: CryptoAccountDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f12016a;

    /* compiled from: CryptoAccountDetailsFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.crypto.crypto_account_details.a$a, reason: collision with other inner class name */
    public static final class C0121a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "account")) {
                throw new IllegalArgumentException("Required argument \"account\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(CryptoAccountDomain.class) && !Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            CryptoAccountDomain cryptoAccountDomain = (CryptoAccountDomain) bundle.get("account");
            if (cryptoAccountDomain != null) {
                return new a(cryptoAccountDomain);
            }
            throw new IllegalArgumentException("Argument \"account\" is marked as non-null but was passed a null value.");
        }
    }

    public a(CryptoAccountDomain cryptoAccountDomain) {
        this.f12016a = cryptoAccountDomain;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0121a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && f.b(this.f12016a, ((a) obj).f12016a);
    }

    public final int hashCode() {
        return this.f12016a.hashCode();
    }

    public final String toString() {
        return "CryptoAccountDetailsFragmentArgs(account=" + this.f12016a + ")";
    }
}
