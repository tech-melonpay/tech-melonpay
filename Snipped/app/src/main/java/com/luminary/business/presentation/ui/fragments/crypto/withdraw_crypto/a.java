package com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: WithdrawCryptoFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f12198a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12199b;

    /* renamed from: c, reason: collision with root package name */
    public final CryptoAccountDomain f12200c;

    /* compiled from: WithdrawCryptoFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.crypto.withdraw_crypto.a$a, reason: collision with other inner class name */
    public static final class C0127a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "walletId")) {
                throw new IllegalArgumentException("Required argument \"walletId\" is missing and does not have an android:defaultValue");
            }
            int i = bundle.getInt("walletId");
            if (!bundle.containsKey("address")) {
                throw new IllegalArgumentException("Required argument \"address\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("address");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"address\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("account")) {
                throw new IllegalArgumentException("Required argument \"account\" is missing and does not have an android:defaultValue");
            }
            if (Parcelable.class.isAssignableFrom(CryptoAccountDomain.class) || Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                return new a(i, string, (CryptoAccountDomain) bundle.get("account"));
            }
            throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
    }

    public a(int i, String str, CryptoAccountDomain cryptoAccountDomain) {
        this.f12198a = i;
        this.f12199b = str;
        this.f12200c = cryptoAccountDomain;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0127a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12198a == aVar.f12198a && f.b(this.f12199b, aVar.f12199b) && f.b(this.f12200c, aVar.f12200c);
    }

    public final int hashCode() {
        int c2 = v.c(Integer.hashCode(this.f12198a) * 31, 31, this.f12199b);
        CryptoAccountDomain cryptoAccountDomain = this.f12200c;
        return c2 + (cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode());
    }

    public final String toString() {
        return "WithdrawCryptoFragmentArgs(walletId=" + this.f12198a + ", address=" + this.f12199b + ", account=" + this.f12200c + ")";
    }
}
