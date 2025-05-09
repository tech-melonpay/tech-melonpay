package a8;

import C.v;
import android.os.Bundle;

/* compiled from: UploadAdditionalDocumentsFragmentArgs.kt */
/* renamed from: a8.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0523d implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f4478a;

    public C0523d(String str) {
        this.f4478a = str;
    }

    public static final C0523d fromBundle(Bundle bundle) {
        if (!v.y(bundle, C0523d.class, "companyId")) {
            throw new IllegalArgumentException("Required argument \"companyId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("companyId");
        if (string != null) {
            return new C0523d(string);
        }
        throw new IllegalArgumentException("Argument \"companyId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0523d) && kotlin.jvm.internal.f.b(this.f4478a, ((C0523d) obj).f4478a);
    }

    public final int hashCode() {
        return this.f4478a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("UploadAdditionalDocumentsFragmentArgs(companyId="), this.f4478a, ")");
    }
}
