package com.luminary.business.presentation.ui.fragments.accountdetails;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.account.AccountDetailsUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: AccountDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final AccountDetailsUI f11500a;

    /* compiled from: AccountDetailsFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.accountdetails.a$a, reason: collision with other inner class name */
    public static final class C0114a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "accountUI")) {
                throw new IllegalArgumentException("Required argument \"accountUI\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(AccountDetailsUI.class) && !Serializable.class.isAssignableFrom(AccountDetailsUI.class)) {
                throw new UnsupportedOperationException(AccountDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            AccountDetailsUI accountDetailsUI = (AccountDetailsUI) bundle.get("accountUI");
            if (accountDetailsUI != null) {
                return new a(accountDetailsUI);
            }
            throw new IllegalArgumentException("Argument \"accountUI\" is marked as non-null but was passed a null value.");
        }
    }

    public a(AccountDetailsUI accountDetailsUI) {
        this.f11500a = accountDetailsUI;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0114a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && f.b(this.f11500a, ((a) obj).f11500a);
    }

    public final int hashCode() {
        return this.f11500a.hashCode();
    }

    public final String toString() {
        return "AccountDetailsFragmentArgs(accountUI=" + this.f11500a + ")";
    }
}
