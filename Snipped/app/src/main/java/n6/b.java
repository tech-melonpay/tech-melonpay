package N6;

import C.v;
import U0.e;
import android.os.Bundle;
import kotlin.jvm.internal.f;

/* compiled from: CountrySelectFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2849a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2850b;

    public b(boolean z10, String str) {
        this.f2849a = z10;
        this.f2850b = str;
    }

    public static final b fromBundle(Bundle bundle) {
        if (!v.y(bundle, b.class, "isCountryCode")) {
            throw new IllegalArgumentException("Required argument \"isCountryCode\" is missing and does not have an android:defaultValue");
        }
        boolean z10 = bundle.getBoolean("isCountryCode");
        if (!bundle.containsKey("fieldName")) {
            throw new IllegalArgumentException("Required argument \"fieldName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("fieldName");
        if (string != null) {
            return new b(z10, string);
        }
        throw new IllegalArgumentException("Argument \"fieldName\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2849a == bVar.f2849a && f.b(this.f2850b, bVar.f2850b);
    }

    public final int hashCode() {
        return this.f2850b.hashCode() + (Boolean.hashCode(this.f2849a) * 31);
    }

    public final String toString() {
        return "CountrySelectFragmentArgs(isCountryCode=" + this.f2849a + ", fieldName=" + this.f2850b + ")";
    }
}
