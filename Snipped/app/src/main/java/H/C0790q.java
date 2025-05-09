package h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import g.C0756a;
import h.AbstractC0774a;
import h.LayoutInflaterFactory2C0778e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.AbstractC0912a;
import m.InterfaceC0995E;
import pa.C1124b;
import y0.C1596C;
import y0.E;
import y0.G;

/* compiled from: WindowDecorActionBar.java */
/* renamed from: h.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0790q extends AbstractC0774a implements ActionBarOverlayLayout.d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f20984y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f20985z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f20986a;

    /* renamed from: b, reason: collision with root package name */
    public Context f20987b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f20988c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f20989d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0995E f20990e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f20991f;

    /* renamed from: g, reason: collision with root package name */
    public final View f20992g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20993h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public d f20994j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0912a.InterfaceC0418a f20995k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20996l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList<AbstractC0774a.b> f20997m;

    /* renamed from: n, reason: collision with root package name */
    public int f20998n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20999o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21000p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21001q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21002r;

    /* renamed from: s, reason: collision with root package name */
    public k.g f21003s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21004t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21005u;

    /* renamed from: v, reason: collision with root package name */
    public final a f21006v;

    /* renamed from: w, reason: collision with root package name */
    public final b f21007w;

    /* renamed from: x, reason: collision with root package name */
    public final c f21008x;

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: h.q$a */
    public class a extends C1124b {
        public a() {
        }

        @Override // y0.F
        public final void c() {
            View view;
            C0790q c0790q = C0790q.this;
            if (c0790q.f20999o && (view = c0790q.f20992g) != null) {
                view.setTranslationY(0.0f);
                c0790q.f20989d.setTranslationY(0.0f);
            }
            c0790q.f20989d.setVisibility(8);
            c0790q.f20989d.setTransitioning(false);
            c0790q.f21003s = null;
            AbstractC0912a.InterfaceC0418a interfaceC0418a = c0790q.f20995k;
            if (interfaceC0418a != null) {
                interfaceC0418a.d(c0790q.f20994j);
                c0790q.f20994j = null;
                c0790q.f20995k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = c0790q.f20988c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                C1596C.c.c(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: h.q$b */
    public class b extends C1124b {
        public b() {
        }

        @Override // y0.F
        public final void c() {
            C0790q c0790q = C0790q.this;
            c0790q.f21003s = null;
            c0790q.f20989d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: h.q$c */
    public class c implements G {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* renamed from: h.q$d */
    public class d extends AbstractC0912a implements f.a {

        /* renamed from: c, reason: collision with root package name */
        public final Context f21012c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.appcompat.view.menu.f f21013d;

        /* renamed from: e, reason: collision with root package name */
        public AbstractC0912a.InterfaceC0418a f21014e;

        /* renamed from: f, reason: collision with root package name */
        public WeakReference<View> f21015f;

        public d(Context context, LayoutInflaterFactory2C0778e.d dVar) {
            this.f21012c = context;
            this.f21014e = dVar;
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            fVar.f4756l = 1;
            this.f21013d = fVar;
            fVar.f4750e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            AbstractC0912a.InterfaceC0418a interfaceC0418a = this.f21014e;
            if (interfaceC0418a != null) {
                return interfaceC0418a.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            if (this.f21014e == null) {
                return;
            }
            i();
            ActionMenuPresenter actionMenuPresenter = C0790q.this.f20991f.f23733d;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.n();
            }
        }

        @Override // k.AbstractC0912a
        public final void c() {
            C0790q c0790q = C0790q.this;
            if (c0790q.i != this) {
                return;
            }
            if (c0790q.f21000p) {
                c0790q.f20994j = this;
                c0790q.f20995k = this.f21014e;
            } else {
                this.f21014e.d(this);
            }
            this.f21014e = null;
            c0790q.q(false);
            ActionBarContextView actionBarContextView = c0790q.f20991f;
            if (actionBarContextView.f4846k == null) {
                actionBarContextView.h();
            }
            c0790q.f20988c.setHideOnContentScrollEnabled(c0790q.f21005u);
            c0790q.i = null;
        }

        @Override // k.AbstractC0912a
        public final View d() {
            WeakReference<View> weakReference = this.f21015f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // k.AbstractC0912a
        public final androidx.appcompat.view.menu.f e() {
            return this.f21013d;
        }

        @Override // k.AbstractC0912a
        public final MenuInflater f() {
            return new k.f(this.f21012c);
        }

        @Override // k.AbstractC0912a
        public final CharSequence g() {
            return C0790q.this.f20991f.getSubtitle();
        }

        @Override // k.AbstractC0912a
        public final CharSequence h() {
            return C0790q.this.f20991f.getTitle();
        }

        @Override // k.AbstractC0912a
        public final void i() {
            if (C0790q.this.i != this) {
                return;
            }
            androidx.appcompat.view.menu.f fVar = this.f21013d;
            fVar.w();
            try {
                this.f21014e.b(this, fVar);
            } finally {
                fVar.v();
            }
        }

        @Override // k.AbstractC0912a
        public final boolean j() {
            return C0790q.this.f20991f.f4854s;
        }

        @Override // k.AbstractC0912a
        public final void k(View view) {
            C0790q.this.f20991f.setCustomView(view);
            this.f21015f = new WeakReference<>(view);
        }

        @Override // k.AbstractC0912a
        public final void l(int i) {
            m(C0790q.this.f20986a.getResources().getString(i));
        }

        @Override // k.AbstractC0912a
        public final void m(CharSequence charSequence) {
            C0790q.this.f20991f.setSubtitle(charSequence);
        }

        @Override // k.AbstractC0912a
        public final void n(int i) {
            o(C0790q.this.f20986a.getResources().getString(i));
        }

        @Override // k.AbstractC0912a
        public final void o(CharSequence charSequence) {
            C0790q.this.f20991f.setTitle(charSequence);
        }

        @Override // k.AbstractC0912a
        public final void p(boolean z10) {
            this.f22599b = z10;
            C0790q.this.f20991f.setTitleOptional(z10);
        }
    }

    public C0790q(Activity activity, boolean z10) {
        new ArrayList();
        this.f20997m = new ArrayList<>();
        this.f20998n = 0;
        this.f20999o = true;
        this.f21002r = true;
        this.f21006v = new a();
        this.f21007w = new b();
        this.f21008x = new c();
        View decorView = activity.getWindow().getDecorView();
        r(decorView);
        if (z10) {
            return;
        }
        this.f20992g = decorView.findViewById(R.id.content);
    }

    @Override // h.AbstractC0774a
    public final boolean b() {
        InterfaceC0995E interfaceC0995E = this.f20990e;
        if (interfaceC0995E == null || !interfaceC0995E.i()) {
            return false;
        }
        this.f20990e.collapseActionView();
        return true;
    }

    @Override // h.AbstractC0774a
    public final void c(boolean z10) {
        if (z10 == this.f20996l) {
            return;
        }
        this.f20996l = z10;
        ArrayList<AbstractC0774a.b> arrayList = this.f20997m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // h.AbstractC0774a
    public final int d() {
        return this.f20990e.n();
    }

    @Override // h.AbstractC0774a
    public final Context e() {
        if (this.f20987b == null) {
            TypedValue typedValue = new TypedValue();
            this.f20986a.getTheme().resolveAttribute(com.luminary.mobile.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f20987b = new ContextThemeWrapper(this.f20986a, i);
            } else {
                this.f20987b = this.f20986a;
            }
        }
        return this.f20987b;
    }

    @Override // h.AbstractC0774a
    public final void g() {
        s(this.f20986a.getResources().getBoolean(com.luminary.mobile.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // h.AbstractC0774a
    public final boolean i(int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        d dVar = this.i;
        if (dVar == null || (fVar = dVar.f21013d) == null) {
            return false;
        }
        fVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return fVar.performShortcut(i, keyEvent, 0);
    }

    @Override // h.AbstractC0774a
    public final void l(boolean z10) {
        if (this.f20993h) {
            return;
        }
        m(z10);
    }

    @Override // h.AbstractC0774a
    public final void m(boolean z10) {
        int i = z10 ? 4 : 0;
        int n10 = this.f20990e.n();
        this.f20993h = true;
        this.f20990e.j((i & 4) | (n10 & (-5)));
    }

    @Override // h.AbstractC0774a
    public final void n(boolean z10) {
        k.g gVar;
        this.f21004t = z10;
        if (z10 || (gVar = this.f21003s) == null) {
            return;
        }
        gVar.a();
    }

    @Override // h.AbstractC0774a
    public final void o(CharSequence charSequence) {
        this.f20990e.setWindowTitle(charSequence);
    }

    @Override // h.AbstractC0774a
    public final AbstractC0912a p(LayoutInflaterFactory2C0778e.d dVar) {
        d dVar2 = this.i;
        if (dVar2 != null) {
            dVar2.c();
        }
        this.f20988c.setHideOnContentScrollEnabled(false);
        this.f20991f.h();
        d dVar3 = new d(this.f20991f.getContext(), dVar);
        androidx.appcompat.view.menu.f fVar = dVar3.f21013d;
        fVar.w();
        try {
            if (!dVar3.f21014e.c(dVar3, fVar)) {
                return null;
            }
            this.i = dVar3;
            dVar3.i();
            this.f20991f.f(dVar3);
            q(true);
            return dVar3;
        } finally {
            fVar.v();
        }
    }

    public final void q(boolean z10) {
        E m2;
        E e10;
        if (z10) {
            if (!this.f21001q) {
                this.f21001q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f20988c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                t(false);
            }
        } else if (this.f21001q) {
            this.f21001q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f20988c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            t(false);
        }
        if (!this.f20989d.isLaidOut()) {
            if (z10) {
                this.f20990e.setVisibility(4);
                this.f20991f.setVisibility(0);
                return;
            } else {
                this.f20990e.setVisibility(0);
                this.f20991f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            e10 = this.f20990e.m(4, 100L);
            m2 = this.f20991f.e(0, 200L);
        } else {
            m2 = this.f20990e.m(0, 200L);
            e10 = this.f20991f.e(8, 100L);
        }
        k.g gVar = new k.g();
        ArrayList<E> arrayList = gVar.f22657a;
        arrayList.add(e10);
        View view = e10.f30981a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = m2.f30981a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(m2);
        gVar.b();
    }

    public final void r(View view) {
        InterfaceC0995E wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.luminary.mobile.R.id.decor_content_parent);
        this.f20988c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.luminary.mobile.R.id.action_bar);
        if (findViewById instanceof InterfaceC0995E) {
            wrapper = (InterfaceC0995E) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f20990e = wrapper;
        this.f20991f = (ActionBarContextView) view.findViewById(com.luminary.mobile.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.luminary.mobile.R.id.action_bar_container);
        this.f20989d = actionBarContainer;
        InterfaceC0995E interfaceC0995E = this.f20990e;
        if (interfaceC0995E == null || this.f20991f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0790q.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f20986a = interfaceC0995E.getContext();
        if ((this.f20990e.n() & 4) != 0) {
            this.f20993h = true;
        }
        Context context = this.f20986a;
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f20990e.getClass();
        s(context.getResources().getBoolean(com.luminary.mobile.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f20986a.obtainStyledAttributes(null, C0756a.f20729a, com.luminary.mobile.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f20988c;
            if (!actionBarOverlayLayout2.f4868g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f21005u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f20989d;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.d.l(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void s(boolean z10) {
        if (z10) {
            this.f20989d.setTabContainer(null);
            this.f20990e.k();
        } else {
            this.f20990e.k();
            this.f20989d.setTabContainer(null);
        }
        this.f20990e.getClass();
        this.f20990e.q(false);
        this.f20988c.setHasNonEmbeddedTabs(false);
    }

    public final void t(boolean z10) {
        boolean z11 = this.f21001q || !this.f21000p;
        View view = this.f20992g;
        c cVar = this.f21008x;
        if (!z11) {
            if (this.f21002r) {
                this.f21002r = false;
                k.g gVar = this.f21003s;
                if (gVar != null) {
                    gVar.a();
                }
                int i = this.f20998n;
                a aVar = this.f21006v;
                if (i != 0 || (!this.f21004t && !z10)) {
                    aVar.c();
                    return;
                }
                this.f20989d.setAlpha(1.0f);
                this.f20989d.setTransitioning(true);
                k.g gVar2 = new k.g();
                float f10 = -this.f20989d.getHeight();
                if (z10) {
                    this.f20989d.getLocationInWindow(new int[]{0, 0});
                    f10 -= r12[1];
                }
                E a10 = C1596C.a(this.f20989d);
                a10.e(f10);
                View view2 = a10.f30981a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new A2.a(cVar, view2) : null);
                }
                boolean z12 = gVar2.f22661e;
                ArrayList<E> arrayList = gVar2.f22657a;
                if (!z12) {
                    arrayList.add(a10);
                }
                if (this.f20999o && view != null) {
                    E a11 = C1596C.a(view);
                    a11.e(f10);
                    if (!gVar2.f22661e) {
                        arrayList.add(a11);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f20984y;
                boolean z13 = gVar2.f22661e;
                if (!z13) {
                    gVar2.f22659c = accelerateInterpolator;
                }
                if (!z13) {
                    gVar2.f22658b = 250L;
                }
                if (!z13) {
                    gVar2.f22660d = aVar;
                }
                this.f21003s = gVar2;
                gVar2.b();
                return;
            }
            return;
        }
        if (this.f21002r) {
            return;
        }
        this.f21002r = true;
        k.g gVar3 = this.f21003s;
        if (gVar3 != null) {
            gVar3.a();
        }
        this.f20989d.setVisibility(0);
        int i9 = this.f20998n;
        b bVar = this.f21007w;
        if (i9 == 0 && (this.f21004t || z10)) {
            this.f20989d.setTranslationY(0.0f);
            float f11 = -this.f20989d.getHeight();
            if (z10) {
                this.f20989d.getLocationInWindow(new int[]{0, 0});
                f11 -= r12[1];
            }
            this.f20989d.setTranslationY(f11);
            k.g gVar4 = new k.g();
            E a12 = C1596C.a(this.f20989d);
            a12.e(0.0f);
            View view3 = a12.f30981a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new A2.a(cVar, view3) : null);
            }
            boolean z14 = gVar4.f22661e;
            ArrayList<E> arrayList2 = gVar4.f22657a;
            if (!z14) {
                arrayList2.add(a12);
            }
            if (this.f20999o && view != null) {
                view.setTranslationY(f11);
                E a13 = C1596C.a(view);
                a13.e(0.0f);
                if (!gVar4.f22661e) {
                    arrayList2.add(a13);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f20985z;
            boolean z15 = gVar4.f22661e;
            if (!z15) {
                gVar4.f22659c = decelerateInterpolator;
            }
            if (!z15) {
                gVar4.f22658b = 250L;
            }
            if (!z15) {
                gVar4.f22660d = bVar;
            }
            this.f21003s = gVar4;
            gVar4.b();
        } else {
            this.f20989d.setAlpha(1.0f);
            this.f20989d.setTranslationY(0.0f);
            if (this.f20999o && view != null) {
                view.setTranslationY(0.0f);
            }
            bVar.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f20988c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.c.c(actionBarOverlayLayout);
        }
    }

    public C0790q(Dialog dialog) {
        new ArrayList();
        this.f20997m = new ArrayList<>();
        this.f20998n = 0;
        this.f20999o = true;
        this.f21002r = true;
        this.f21006v = new a();
        this.f21007w = new b();
        this.f21008x = new c();
        r(dialog.getWindow().getDecorView());
    }
}
