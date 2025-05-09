package K7;

import C.v;
import U0.e;
import android.os.Bundle;
import kotlin.jvm.internal.f;

/* compiled from: NewCardListFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2261a;

    public b() {
        this(null);
    }

    public static final b fromBundle(Bundle bundle) {
        return new b(v.y(bundle, b.class, "accountPreSelected") ? bundle.getString("accountPreSelected") : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.b(this.f2261a, ((b) obj).f2261a);
    }

    public final int hashCode() {
        String str = this.f2261a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("NewCardListFragmentArgs(accountPreSelected="), this.f2261a, ")");
    }

    public b(String str) {
        this.f2261a = str;
    }
}
