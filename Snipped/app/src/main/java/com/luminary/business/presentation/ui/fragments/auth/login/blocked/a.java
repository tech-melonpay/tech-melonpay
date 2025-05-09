package com.luminary.business.presentation.ui.fragments.auth.login.blocked;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: UserBlockedFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final RegisterSuccessUI f11612a;

    /* compiled from: UserBlockedFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.auth.login.blocked.a$a, reason: collision with other inner class name */
    public static final class C0115a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "userData")) {
                throw new IllegalArgumentException("Required argument \"userData\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(RegisterSuccessUI.class) && !Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            RegisterSuccessUI registerSuccessUI = (RegisterSuccessUI) bundle.get("userData");
            if (registerSuccessUI != null) {
                return new a(registerSuccessUI);
            }
            throw new IllegalArgumentException("Argument \"userData\" is marked as non-null but was passed a null value.");
        }
    }

    public a(RegisterSuccessUI registerSuccessUI) {
        this.f11612a = registerSuccessUI;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0115a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && f.b(this.f11612a, ((a) obj).f11612a);
    }

    public final int hashCode() {
        return this.f11612a.hashCode();
    }

    public final String toString() {
        return "UserBlockedFragmentArgs(userData=" + this.f11612a + ")";
    }
}
