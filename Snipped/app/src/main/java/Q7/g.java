package q7;

import C.v;
import android.os.Bundle;

/* compiled from: ExchangeListFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class g implements U0.e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25901a;

    public g() {
        this(false);
    }

    public static final g fromBundle(Bundle bundle) {
        return new g(v.y(bundle, g.class, "actionRequired") ? bundle.getBoolean("actionRequired") : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f25901a == ((g) obj).f25901a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25901a);
    }

    public final String toString() {
        return "ExchangeListFragmentArgs(actionRequired=" + this.f25901a + ")";
    }

    public g(boolean z10) {
        this.f25901a = z10;
    }
}
