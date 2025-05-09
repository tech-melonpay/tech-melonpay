package y2;

import J2.k;
import android.view.View;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;
import y0.J;

/* compiled from: BottomNavigationView.java */
/* loaded from: classes.dex */
public final class c implements k.b {
    @Override // J2.k.b
    public final J a(View view, J j10, k.c cVar) {
        cVar.f2142d = j10.a() + cVar.f2142d;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        boolean z10 = view.getLayoutDirection() == 1;
        int b9 = j10.b();
        int c2 = j10.c();
        int i = cVar.f2139a + (z10 ? c2 : b9);
        cVar.f2139a = i;
        int i9 = cVar.f2141c;
        if (!z10) {
            b9 = c2;
        }
        int i10 = i9 + b9;
        cVar.f2141c = i10;
        view.setPaddingRelative(i, cVar.f2140b, i10, cVar.f2142d);
        return j10;
    }
}
