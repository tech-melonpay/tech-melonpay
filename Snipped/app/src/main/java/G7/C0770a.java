package g7;

import C.v;
import U0.e;
import android.os.Bundle;
import kotlin.jvm.internal.f;

/* compiled from: CreateNewAccountSuccessFragmentArgs.kt */
/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0770a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f20810a;

    public C0770a(String str) {
        this.f20810a = str;
    }

    public static final C0770a fromBundle(Bundle bundle) {
        if (!v.y(bundle, C0770a.class, "type")) {
            throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("type");
        if (string != null) {
            return new C0770a(string);
        }
        throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0770a) && f.b(this.f20810a, ((C0770a) obj).f20810a);
    }

    public final int hashCode() {
        return this.f20810a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("CreateNewAccountSuccessFragmentArgs(type="), this.f20810a, ")");
    }
}
