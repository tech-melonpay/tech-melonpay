package h;

import android.view.View;
import java.util.WeakHashMap;
import pa.C1124b;
import y0.C1596C;
import y0.E;

/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: h.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781h extends C1124b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0778e f20943a;

    public C0781h(LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e) {
        this.f20943a = layoutInflaterFactory2C0778e;
    }

    @Override // pa.C1124b, y0.F
    public final void b() {
        LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = this.f20943a;
        layoutInflaterFactory2C0778e.f20902v.setVisibility(0);
        if (layoutInflaterFactory2C0778e.f20902v.getParent() instanceof View) {
            View view = (View) layoutInflaterFactory2C0778e.f20902v.getParent();
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.c.c(view);
        }
    }

    @Override // y0.F
    public final void c() {
        LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = this.f20943a;
        layoutInflaterFactory2C0778e.f20902v.setAlpha(1.0f);
        layoutInflaterFactory2C0778e.f20905y.d(null);
        layoutInflaterFactory2C0778e.f20905y = null;
    }
}
