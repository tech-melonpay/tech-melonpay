package c7;

import C.v;
import U0.e;
import android.os.Bundle;
import kotlin.jvm.internal.f;

/* compiled from: CompanyNotApprovedFragmentArgs.kt */
/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0627a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f8580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8581b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8582c;

    public C0627a(String str, String str2, String str3) {
        this.f8580a = str;
        this.f8581b = str2;
        this.f8582c = str3;
    }

    public static final C0627a fromBundle(Bundle bundle) {
        if (!v.y(bundle, C0627a.class, "companyName")) {
            throw new IllegalArgumentException("Required argument \"companyName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("companyName");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"companyName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("companyNumber")) {
            throw new IllegalArgumentException("Required argument \"companyNumber\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("companyNumber");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"companyNumber\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("companyAddress")) {
            throw new IllegalArgumentException("Required argument \"companyAddress\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("companyAddress");
        if (string3 != null) {
            return new C0627a(string, string2, string3);
        }
        throw new IllegalArgumentException("Argument \"companyAddress\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0627a)) {
            return false;
        }
        C0627a c0627a = (C0627a) obj;
        return f.b(this.f8580a, c0627a.f8580a) && f.b(this.f8581b, c0627a.f8581b) && f.b(this.f8582c, c0627a.f8582c);
    }

    public final int hashCode() {
        return this.f8582c.hashCode() + v.c(this.f8580a.hashCode() * 31, 31, this.f8581b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompanyNotApprovedFragmentArgs(companyName=");
        sb2.append(this.f8580a);
        sb2.append(", companyNumber=");
        sb2.append(this.f8581b);
        sb2.append(", companyAddress=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f8582c, ")");
    }
}
