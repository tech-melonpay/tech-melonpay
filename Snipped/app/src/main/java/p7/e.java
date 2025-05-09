package P7;

import C.v;
import android.os.Bundle;

/* compiled from: AdditionalInformationFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class e implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3097a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3098b;

    public e(String str, boolean z10) {
        this.f3097a = str;
        this.f3098b = z10;
    }

    public static final e fromBundle(Bundle bundle) {
        if (!v.y(bundle, e.class, "companyId")) {
            throw new IllegalArgumentException("Required argument \"companyId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("companyId");
        if (string != null) {
            return new e(string, bundle.containsKey("isEdit") ? bundle.getBoolean("isEdit") : false);
        }
        throw new IllegalArgumentException("Argument \"companyId\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.f.b(this.f3097a, eVar.f3097a) && this.f3098b == eVar.f3098b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3098b) + (this.f3097a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalInformationFragmentArgs(companyId=" + this.f3097a + ", isEdit=" + this.f3098b + ")";
    }
}
