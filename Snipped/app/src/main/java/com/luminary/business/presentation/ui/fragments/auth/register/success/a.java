package com.luminary.business.presentation.ui.fragments.auth.register.success;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: RegisterSuccessFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final RegisterSuccessUI f11697a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11698b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11699c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11700d;

    /* compiled from: RegisterSuccessFragmentArgs.kt */
    /* renamed from: com.luminary.business.presentation.ui.fragments.auth.register.success.a$a, reason: collision with other inner class name */
    public static final class C0116a {
        public static a a(Bundle bundle) {
            if (!v.y(bundle, a.class, "userData")) {
                throw new IllegalArgumentException("Required argument \"userData\" is missing and does not have an android:defaultValue");
            }
            if (!Parcelable.class.isAssignableFrom(RegisterSuccessUI.class) && !Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
                throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            RegisterSuccessUI registerSuccessUI = (RegisterSuccessUI) bundle.get("userData");
            if (registerSuccessUI == null) {
                throw new IllegalArgumentException("Argument \"userData\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("email")) {
                throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("email");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("phoneCode")) {
                throw new IllegalArgumentException("Required argument \"phoneCode\" is missing and does not have an android:defaultValue");
            }
            String string2 = bundle.getString("phoneCode");
            if (string2 == null) {
                throw new IllegalArgumentException("Argument \"phoneCode\" is marked as non-null but was passed a null value.");
            }
            if (!bundle.containsKey("phoneNumber")) {
                throw new IllegalArgumentException("Required argument \"phoneNumber\" is missing and does not have an android:defaultValue");
            }
            String string3 = bundle.getString("phoneNumber");
            if (string3 != null) {
                return new a(registerSuccessUI, string, string2, string3);
            }
            throw new IllegalArgumentException("Argument \"phoneNumber\" is marked as non-null but was passed a null value.");
        }
    }

    public a(RegisterSuccessUI registerSuccessUI, String str, String str2, String str3) {
        this.f11697a = registerSuccessUI;
        this.f11698b = str;
        this.f11699c = str2;
        this.f11700d = str3;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0116a.a(bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f11697a, aVar.f11697a) && f.b(this.f11698b, aVar.f11698b) && f.b(this.f11699c, aVar.f11699c) && f.b(this.f11700d, aVar.f11700d);
    }

    public final int hashCode() {
        return this.f11700d.hashCode() + v.c(v.c(this.f11697a.hashCode() * 31, 31, this.f11698b), 31, this.f11699c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RegisterSuccessFragmentArgs(userData=");
        sb2.append(this.f11697a);
        sb2.append(", email=");
        sb2.append(this.f11698b);
        sb2.append(", phoneCode=");
        sb2.append(this.f11699c);
        sb2.append(", phoneNumber=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f11700d, ")");
    }
}
