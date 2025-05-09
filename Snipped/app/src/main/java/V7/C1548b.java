package v7;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.account.AccountDetailsUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: EditAccountFragmentArgs.kt */
/* renamed from: v7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1548b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final AccountDetailsUI f30661a;

    public C1548b(AccountDetailsUI accountDetailsUI) {
        this.f30661a = accountDetailsUI;
    }

    public static final C1548b fromBundle(Bundle bundle) {
        if (!v.y(bundle, C1548b.class, "account")) {
            throw new IllegalArgumentException("Required argument \"account\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(AccountDetailsUI.class) && !Serializable.class.isAssignableFrom(AccountDetailsUI.class)) {
            throw new UnsupportedOperationException(AccountDetailsUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        AccountDetailsUI accountDetailsUI = (AccountDetailsUI) bundle.get("account");
        if (accountDetailsUI != null) {
            return new C1548b(accountDetailsUI);
        }
        throw new IllegalArgumentException("Argument \"account\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1548b) && f.b(this.f30661a, ((C1548b) obj).f30661a);
    }

    public final int hashCode() {
        return this.f30661a.hashCode();
    }

    public final String toString() {
        return "EditAccountFragmentArgs(account=" + this.f30661a + ")";
    }
}
