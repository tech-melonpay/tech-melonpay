package L6;

import C.v;
import U0.e;
import android.os.Bundle;
import kotlin.jvm.internal.f;

/* compiled from: InReviewFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2496b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2497c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2498d;

    public b(String str, String str2, String str3, String str4) {
        this.f2495a = str;
        this.f2496b = str2;
        this.f2497c = str3;
        this.f2498d = str4;
    }

    public static final b fromBundle(Bundle bundle) {
        if (!v.y(bundle, b.class, "email")) {
            throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("email");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("password")) {
            throw new IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("password");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("phoneCode")) {
            throw new IllegalArgumentException("Required argument \"phoneCode\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("phoneCode");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"phoneCode\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("phoneNumber")) {
            throw new IllegalArgumentException("Required argument \"phoneNumber\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("phoneNumber");
        if (string4 != null) {
            return new b(string, string2, string3, string4);
        }
        throw new IllegalArgumentException("Argument \"phoneNumber\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f2495a, bVar.f2495a) && f.b(this.f2496b, bVar.f2496b) && f.b(this.f2497c, bVar.f2497c) && f.b(this.f2498d, bVar.f2498d);
    }

    public final int hashCode() {
        return this.f2498d.hashCode() + v.c(v.c(this.f2495a.hashCode() * 31, 31, this.f2496b), 31, this.f2497c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InReviewFragmentArgs(email=");
        sb2.append(this.f2495a);
        sb2.append(", password=");
        sb2.append(this.f2496b);
        sb2.append(", phoneCode=");
        sb2.append(this.f2497c);
        sb2.append(", phoneNumber=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f2498d, ")");
    }
}
