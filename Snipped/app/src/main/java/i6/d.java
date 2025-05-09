package I6;

import C.v;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: KycFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class d implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1887a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1888b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1889c;

    /* renamed from: d, reason: collision with root package name */
    public final RegisterSuccessUI f1890d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1891e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1892f;

    public d(String str, String str2, String str3, RegisterSuccessUI registerSuccessUI, int i, String str4) {
        this.f1887a = str;
        this.f1888b = str2;
        this.f1889c = str3;
        this.f1890d = registerSuccessUI;
        this.f1891e = i;
        this.f1892f = str4;
    }

    public static final d fromBundle(Bundle bundle) {
        if (!v.y(bundle, d.class, "email")) {
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
            return new d(string, string2, string3, registerSuccessUI, i, string4);
        }
        throw new IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.b(this.f1887a, dVar.f1887a) && f.b(this.f1888b, dVar.f1888b) && f.b(this.f1889c, dVar.f1889c) && f.b(this.f1890d, dVar.f1890d) && this.f1891e == dVar.f1891e && f.b(this.f1892f, dVar.f1892f);
    }

    public final int hashCode() {
        return this.f1892f.hashCode() + v.b(this.f1891e, (this.f1890d.hashCode() + v.c(v.c(this.f1887a.hashCode() * 31, 31, this.f1888b), 31, this.f1889c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("KycFragmentArgs(email=");
        sb2.append(this.f1887a);
        sb2.append(", phoneCode=");
        sb2.append(this.f1888b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f1889c);
        sb2.append(", userData=");
        sb2.append(this.f1890d);
        sb2.append(", startFrom=");
        sb2.append(this.f1891e);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1892f, ")");
    }
}
