package G6;

import C.v;
import U0.e;
import android.os.Bundle;
import android.os.Parcelable;
import com.luminary.business.presentation.entity.register.RegisterSuccessUI;
import java.io.Serializable;
import kotlin.jvm.internal.f;

/* compiled from: AccountInformationFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final RegisterSuccessUI f1328a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1329b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1330c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1331d;

    public c(RegisterSuccessUI registerSuccessUI, String str, String str2, String str3) {
        this.f1328a = registerSuccessUI;
        this.f1329b = str;
        this.f1330c = str2;
        this.f1331d = str3;
    }

    public static final c fromBundle(Bundle bundle) {
        if (!v.y(bundle, c.class, "userData")) {
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
            return new c(registerSuccessUI, string, string2, string3);
        }
        throw new IllegalArgumentException("Argument \"phoneNumber\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.b(this.f1328a, cVar.f1328a) && f.b(this.f1329b, cVar.f1329b) && f.b(this.f1330c, cVar.f1330c) && f.b(this.f1331d, cVar.f1331d);
    }

    public final int hashCode() {
        return this.f1331d.hashCode() + v.c(v.c(this.f1328a.hashCode() * 31, 31, this.f1329b), 31, this.f1330c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccountInformationFragmentArgs(userData=");
        sb2.append(this.f1328a);
        sb2.append(", email=");
        sb2.append(this.f1329b);
        sb2.append(", phoneCode=");
        sb2.append(this.f1330c);
        sb2.append(", phoneNumber=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1331d, ")");
    }
}
