package M6;

import android.os.Bundle;

/* compiled from: RegisterAddressFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class d implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2609a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2610b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2611c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2612d;

    public d(String str, String str2, String str3, String str4) {
        this.f2609a = str;
        this.f2610b = str2;
        this.f2611c = str3;
        this.f2612d = str4;
    }

    public static final d fromBundle(Bundle bundle) {
        if (!C.v.y(bundle, d.class, "email")) {
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
        if (!bundle.containsKey("password")) {
            throw new IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("password");
        if (string4 != null) {
            return new d(string, string2, string3, string4);
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
        return kotlin.jvm.internal.f.b(this.f2609a, dVar.f2609a) && kotlin.jvm.internal.f.b(this.f2610b, dVar.f2610b) && kotlin.jvm.internal.f.b(this.f2611c, dVar.f2611c) && kotlin.jvm.internal.f.b(this.f2612d, dVar.f2612d);
    }

    public final int hashCode() {
        return this.f2612d.hashCode() + C.v.c(C.v.c(this.f2609a.hashCode() * 31, 31, this.f2610b), 31, this.f2611c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RegisterAddressFragmentArgs(email=");
        sb2.append(this.f2609a);
        sb2.append(", phoneCode=");
        sb2.append(this.f2610b);
        sb2.append(", phoneNumber=");
        sb2.append(this.f2611c);
        sb2.append(", password=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f2612d, ")");
    }
}
