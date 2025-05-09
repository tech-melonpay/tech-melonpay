package P6;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: ValidationFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3077a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3078b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3079c;

    /* renamed from: d, reason: collision with root package name */
    public final RegisterSuccessUI f3080d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3081e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3082f;

    public c(String str, String str2, String str3, RegisterSuccessUI registerSuccessUI, int i, String str4) {
        this.f3077a = str;
        this.f3078b = str2;
        this.f3079c = str3;
        this.f3080d = registerSuccessUI;
        this.f3081e = i;
        this.f3082f = str4;
    }

    public static final c fromBundle(Bundle bundle) {
        if (!v.y(bundle, c.class, "email")) {
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
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"phoneNumber\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("userData")) {
            throw new IllegalArgumentException("Required argument \"userData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(RegisterSuccessUI.class) && !Serializable.class.isAssignableFrom(RegisterSuccessUI.class)) {
            throw new UnsupportedOperationException(RegisterSuccessUI.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        RegisterSuccessUI registerSuccessUI = (RegisterSuccessUI) bundle.get("userData");
        if (registerSuccessUI == null) {
            throw new IllegalArgumentException("Argument \"userData\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("startFrom")) {
            throw new IllegalArgumentException("Required argument \"startFrom\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("startFrom");
        if (!bundle.containsKey("password")) {
            throw new IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("password");
        if (string4 != null) {
            return new c(string, string2, string3, registerSuccessUI, i, string4);
        }
        throw new IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f3077a, cVar.f3077a) && f.b(this.f3078b, cVar.f3078b) && f.b(this.f3079c, cVar.f3079c) && f.b(this.f3080d, cVar.f3080d) && this.f3081e == cVar.f3081e && f.b(this.f3082f, cVar.f3082f);
    }

    public final int hashCode() {
        return this.f3082f.hashCode() + v.b(this.f3081e, (this.f3080d.hashCode() + v.c(v.c(this.f3077a.hashCode() * 31, 31, this.f3078b), 31, this.f3079c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ValidationFragmentArgs(email=");
        sb2.append(this.f3077a);
        sb2.append(", phoneCode=");
        sb2.append(this.f3078b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f3079c);
        sb2.append(", userData=");
        sb2.append(this.f3080d);
        sb2.append(", startFrom=");
        sb2.append(this.f3081e);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f3082f, ")");
    }
}
