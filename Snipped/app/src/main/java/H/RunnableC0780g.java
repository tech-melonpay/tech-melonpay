package h;

import android.view.ViewGroup;
import pa.C1124b;
import y0.C1596C;
import y0.E;

/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: h.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0780g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0778e f20941a;

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: h.g$a */
    public class a extends C1124b {
        public a() {
        }

        @Override // pa.C1124b, y0.F
        public final void b() {
            RunnableC0780g.this.f20941a.f20902v.setVisibility(0);
        }

        @Override // y0.F
        public final void c() {
            RunnableC0780g runnableC0780g = RunnableC0780g.this;
            runnableC0780g.f20941a.f20902v.setAlpha(1.0f);
            LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = runnableC0780g.f20941a;
            layoutInflaterFactory2C0778e.f20905y.d(null);
            layoutInflaterFactory2C0778e.f20905y = null;
        }
    }

    public RunnableC0780g(LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e) {
        this.f20941a = layoutInflaterFactory2C0778e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        LayoutInflaterFactory2C0778e layoutInflaterFactory2C0778e = this.f20941a;
        layoutInflaterFactory2C0778e.f20903w.showAtLocation(layoutInflaterFactory2C0778e.f20902v, 55, 0, 0);
        E e10 = layoutInflaterFactory2C0778e.f20905y;
        if (e10 != null) {
            e10.b();
        }
        if (!(layoutInflaterFactory2C0778e.f20864A && (viewGroup = layoutInflaterFactory2C0778e.f20865B) != null && viewGroup.isLaidOut())) {
            layoutInflaterFactory2C0778e.f20902v.setAlpha(1.0f);
            layoutInflaterFactory2C0778e.f20902v.setVisibility(0);
            return;
        }
        layoutInflaterFactory2C0778e.f20902v.setAlpha(0.0f);
        E a10 = C1596C.a(layoutInflaterFactory2C0778e.f20902v);
        a10.a(1.0f);
        layoutInflaterFactory2C0778e.f20905y = a10;
        a10.d(new a());
    }
}
