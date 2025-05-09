package k1;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public final class L {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public final View f22762b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f22761a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<AbstractC0919C> f22763c = new ArrayList<>();

    @Deprecated
    public L() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return this.f22762b == l10.f22762b && this.f22761a.equals(l10.f22761a);
    }

    public final int hashCode() {
        return this.f22761a.hashCode() + (this.f22762b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder r8 = androidx.camera.core.impl.utils.a.r("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        r8.append(this.f22762b);
        r8.append("\n");
        String n10 = C.v.n(r8.toString(), "    values:");
        HashMap hashMap = this.f22761a;
        for (String str : hashMap.keySet()) {
            n10 = n10 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return n10;
    }

    public L(View view) {
        this.f22762b = view;
    }
}
