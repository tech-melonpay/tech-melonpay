package r7;

import C.v;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: SellExternalAccountSelectFragmentArgs.kt */
/* renamed from: r7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1157e implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f26317a;

    public C1157e(String str) {
        this.f26317a = str;
    }

    public static final C1157e fromBundle(Bundle bundle) {
        if (!v.y(bundle, C1157e.class, FirebaseAnalytics.Param.CURRENCY)) {
            throw new IllegalArgumentException("Required argument \"currency\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(FirebaseAnalytics.Param.CURRENCY);
        if (string != null) {
            return new C1157e(string);
        }
        throw new IllegalArgumentException("Argument \"currency\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1157e) && kotlin.jvm.internal.f.b(this.f26317a, ((C1157e) obj).f26317a);
    }

    public final int hashCode() {
        return this.f26317a.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("SellExternalAccountSelectFragmentArgs(currency="), this.f26317a, ")");
    }
}
