package com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.domain.entity.cryptoaccount.CryptoAccountDomain;
import com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.CryptoListFragment;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: CryptoListFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoAccountDomain f12087a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoListFragment.DIRECTION f12088b;

    /* compiled from: CryptoListFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.crypto.crypto_wallet_list.a$a, reason: collision with other inner class name */
    public static final class C0123a {
        public static a a(Bundle bundle) {
            CryptoAccountDomain cryptoAccountDomain;
            CryptoListFragment.DIRECTION direction;
            if (!v.y(bundle, a.class, "account")) {
                cryptoAccountDomain = null;
            } else {
                if (!Parcelable.class.isAssignableFrom(CryptoAccountDomain.class) && !Serializable.class.isAssignableFrom(CryptoAccountDomain.class)) {
                    throw new UnsupportedOperationException(CryptoAccountDomain.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                cryptoAccountDomain = (CryptoAccountDomain) bundle.get("account");
            }
            if (!bundle.containsKey("direction")) {
                direction = CryptoListFragment.DIRECTION.f12081c;
            } else {
                if (!Parcelable.class.isAssignableFrom(CryptoListFragment.DIRECTION.class) && !Serializable.class.isAssignableFrom(CryptoListFragment.DIRECTION.class)) {
                    throw new UnsupportedOperationException(CryptoListFragment.DIRECTION.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                }
                direction = (CryptoListFragment.DIRECTION) bundle.get("direction");
                if (direction == null) {
                    throw new IllegalArgumentException("Argument \"direction\" is marked as non-null but was passed a null value.");
                }
            }
            return new a(cryptoAccountDomain, direction);
        }
    }

    public a(CryptoAccountDomain cryptoAccountDomain, CryptoListFragment.DIRECTION direction) {
        this.f12087a = cryptoAccountDomain;
        this.f12088b = direction;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0123a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f12087a, aVar.f12087a) && this.f12088b == aVar.f12088b;
    }

    public final int hashCode() {
        CryptoAccountDomain cryptoAccountDomain = this.f12087a;
        return this.f12088b.hashCode() + ((cryptoAccountDomain == null ? 0 : cryptoAccountDomain.hashCode()) * 31);
    }

    public final String toString() {
        return "CryptoListFragmentArgs(account=" + this.f12087a + ", direction=" + this.f12088b + ")";
    }

    public a() {
        this(null, CryptoListFragment.DIRECTION.f12081c);
    }
}
