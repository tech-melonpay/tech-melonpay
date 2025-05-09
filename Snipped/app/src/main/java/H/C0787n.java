package h;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import h.AbstractC0774a;
import h.LayoutInflaterFactory2C0778e;
import java.util.ArrayList;
import java.util.WeakHashMap;
import y0.C1596C;
import y0.E;

/* compiled from: ToolbarActionBar.java */
/* renamed from: h.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787n extends AbstractC0774a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.c f20960a;

    /* renamed from: b, reason: collision with root package name */
    public final Window.Callback f20961b;

    /* renamed from: c, reason: collision with root package name */
    public final e f20962c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20963d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20964e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20965f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<AbstractC0774a.b> f20966g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public final a f20967h = new a();

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: h.n$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r6 = this;
                h.n r0 = h.C0787n.this
                android.view.Window$Callback r1 = r0.f20961b
                android.view.Menu r0 = r0.q()
                boolean r2 = r0 instanceof androidx.appcompat.view.menu.f
                r3 = 0
                if (r2 == 0) goto L11
                r2 = r0
                androidx.appcompat.view.menu.f r2 = (androidx.appcompat.view.menu.f) r2
                goto L12
            L11:
                r2 = r3
            L12:
                if (r2 == 0) goto L17
                r2.w()
            L17:
                r0.clear()     // Catch: java.lang.Throwable -> L28
                r4 = 0
                boolean r5 = r1.onCreatePanelMenu(r4, r0)     // Catch: java.lang.Throwable -> L28
                if (r5 == 0) goto L2a
                boolean r1 = r1.onPreparePanel(r4, r3, r0)     // Catch: java.lang.Throwable -> L28
                if (r1 != 0) goto L2d
                goto L2a
            L28:
                r0 = move-exception
                goto L33
            L2a:
                r0.clear()     // Catch: java.lang.Throwable -> L28
            L2d:
                if (r2 == 0) goto L32
                r2.v()
            L32:
                return
            L33:
                if (r2 == 0) goto L38
                r2.v()
            L38:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h.C0787n.a.run():void");
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: h.n$b */
    public class b implements Toolbar.h {
        public b() {
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: h.n$c */
    public final class c implements j.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f20970a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (this.f20970a) {
                return;
            }
            this.f20970a = true;
            C0787n c0787n = C0787n.this;
            c0787n.f20960a.h();
            c0787n.f20961b.onPanelClosed(108, fVar);
            this.f20970a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            C0787n.this.f20961b.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: h.n$d */
    public final class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            ActionMenuPresenter actionMenuPresenter;
            C0787n c0787n = C0787n.this;
            ActionMenuView actionMenuView = c0787n.f20960a.f5103a.f5062a;
            boolean z10 = (actionMenuView == null || (actionMenuPresenter = actionMenuView.f4920t) == null || !actionMenuPresenter.j()) ? false : true;
            Window.Callback callback = c0787n.f20961b;
            if (z10) {
                callback.onPanelClosed(108, fVar);
            } else if (callback.onPreparePanel(0, null, fVar)) {
                callback.onMenuOpened(108, fVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* renamed from: h.n$e */
    public class e implements LayoutInflaterFactory2C0778e.b {
        public e() {
        }
    }

    public C0787n(Toolbar toolbar, CharSequence charSequence, LayoutInflaterFactory2C0778e.h hVar) {
        b bVar = new b();
        toolbar.getClass();
        androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(toolbar, false);
        this.f20960a = cVar;
        hVar.getClass();
        this.f20961b = hVar;
        cVar.f5113l = hVar;
        toolbar.setOnMenuItemClickListener(bVar);
        cVar.setWindowTitle(charSequence);
        this.f20962c = new e();
    }

    @Override // h.AbstractC0774a
    public final boolean a() {
        return this.f20960a.f();
    }

    @Override // h.AbstractC0774a
    public final boolean b() {
        androidx.appcompat.widget.c cVar = this.f20960a;
        Toolbar.f fVar = cVar.f5103a.f5057M;
        if (fVar == null || fVar.f5094b == null) {
            return false;
        }
        cVar.collapseActionView();
        return true;
    }

    @Override // h.AbstractC0774a
    public final void c(boolean z10) {
        if (z10 == this.f20965f) {
            return;
        }
        this.f20965f = z10;
        ArrayList<AbstractC0774a.b> arrayList = this.f20966g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // h.AbstractC0774a
    public final int d() {
        return this.f20960a.f5104b;
    }

    @Override // h.AbstractC0774a
    public final Context e() {
        return this.f20960a.f5103a.getContext();
    }

    @Override // h.AbstractC0774a
    public final boolean f() {
        androidx.appcompat.widget.c cVar = this.f20960a;
        Toolbar toolbar = cVar.f5103a;
        a aVar = this.f20967h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = cVar.f5103a;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        toolbar2.postOnAnimation(aVar);
        return true;
    }

    @Override // h.AbstractC0774a
    public final void h() {
        this.f20960a.f5103a.removeCallbacks(this.f20967h);
    }

    @Override // h.AbstractC0774a
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu q10 = q();
        if (q10 == null) {
            return false;
        }
        q10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return q10.performShortcut(i, keyEvent, 0);
    }

    @Override // h.AbstractC0774a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // h.AbstractC0774a
    public final boolean k() {
        return this.f20960a.f5103a.u();
    }

    @Override // h.AbstractC0774a
    public final void m(boolean z10) {
        androidx.appcompat.widget.c cVar = this.f20960a;
        cVar.j((cVar.f5104b & (-5)) | 4);
    }

    @Override // h.AbstractC0774a
    public final void o(CharSequence charSequence) {
        this.f20960a.setWindowTitle(charSequence);
    }

    public final Menu q() {
        boolean z10 = this.f20964e;
        androidx.appcompat.widget.c cVar = this.f20960a;
        if (!z10) {
            c cVar2 = new c();
            d dVar = new d();
            Toolbar toolbar = cVar.f5103a;
            toolbar.f5058N = cVar2;
            toolbar.f5059O = dVar;
            ActionMenuView actionMenuView = toolbar.f5062a;
            if (actionMenuView != null) {
                actionMenuView.f4921u = cVar2;
                actionMenuView.f4922v = dVar;
            }
            this.f20964e = true;
        }
        return cVar.f5103a.getMenu();
    }

    @Override // h.AbstractC0774a
    public final void g() {
    }

    @Override // h.AbstractC0774a
    public final void l(boolean z10) {
    }

    @Override // h.AbstractC0774a
    public final void n(boolean z10) {
    }
}
