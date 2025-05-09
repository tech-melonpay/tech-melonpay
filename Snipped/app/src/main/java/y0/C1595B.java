package y0;

import android.view.View;
import y0.C1596C;

/* compiled from: ViewCompat.java */
/* renamed from: y0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1595B extends C1596C.b<Boolean> {
    @Override // y0.C1596C.b
    public final Boolean a(View view) {
        return Boolean.valueOf(C1596C.h.b(view));
    }

    @Override // y0.C1596C.b
    public final void b(View view, Boolean bool) {
        C1596C.h.d(view, bool.booleanValue());
    }

    @Override // y0.C1596C.b
    public final boolean e(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
