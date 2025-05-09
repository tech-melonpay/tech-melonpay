package H6;

import C.v;
import android.os.Bundle;

/* compiled from: ForgotPasswordFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class e implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1529a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1530b;

    public e(String str, String str2) {
        this.f1529a = str;
        this.f1530b = str2;
    }

    public static final e fromBundle(Bundle bundle) {
        if (!v.y(bundle, e.class, "newPassword")) {
            throw new IllegalArgumentException("Required argument \"newPassword\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("newPassword");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"newPassword\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("email");
        if (string2 != null) {
            return new e(string, string2);
        }
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f1529a, eVar.f1529a) && kotlin.jvm.internal.f.b(this.f1530b, eVar.f1530b);
    }

    public final int hashCode() {
        return this.f1530b.hashCode() + (this.f1529a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ForgotPasswordFragmentArgs(newPassword=");
        sb2.append(this.f1529a);
        sb2.append(", email=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f1530b, ")");
    }
}
