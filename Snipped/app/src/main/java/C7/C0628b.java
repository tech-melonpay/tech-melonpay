package c7;

import C.v;
import U0.e;
import android.os.Bundle;
import kotlin.jvm.internal.f;

/* compiled from: CompanyUnderReviewFragmentArgs.kt */
/* renamed from: c7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0628b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f8583a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8584b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8585c;

    public C0628b(String str, String str2, String str3) {
        this.f8583a = str;
        this.f8584b = str2;
        this.f8585c = str3;
    }

    public static final C0628b fromBundle(Bundle bundle) {
        if (!v.y(bundle, C0628b.class, "companyName")) {
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
            return new C0628b(string, string2, string3);
        }
        throw new IllegalArgumentException("Argument \"companyAddress\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0628b)) {
            return false;
        }
        C0628b c0628b = (C0628b) obj;
        return f.b(this.f8583a, c0628b.f8583a) && f.b(this.f8584b, c0628b.f8584b) && f.b(this.f8585c, c0628b.f8585c);
    }

    public final int hashCode() {
        return this.f8585c.hashCode() + v.c(this.f8583a.hashCode() * 31, 31, this.f8584b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompanyUnderReviewFragmentArgs(companyName=");
        sb2.append(this.f8583a);
        sb2.append(", companyNumber=");
        sb2.append(this.f8584b);
        sb2.append(", companyAddress=");
        return androidx.camera.core.impl.utils.a.n(sb2, this.f8585c, ")");
    }
}
