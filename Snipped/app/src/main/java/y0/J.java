package y0;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import m.C0992B;
import y0.C1596C;
import y0.C1602f;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final J f31012b;

    /* renamed from: a, reason: collision with root package name */
    public final j f31013a;

    /* compiled from: WindowInsetsCompat.java */
    public static class c extends b {
        public c() {
        }

        @Override // y0.J.d
        public void c(int i, n0.b bVar) {
            this.f31020c.setInsets(l.a(i), bVar.d());
        }

        public c(J j10) {
            super(j10);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final J f31021a;

        /* renamed from: b, reason: collision with root package name */
        public n0.b[] f31022b;

        public d() {
            this(new J());
        }

        public final void a() {
            n0.b[] bVarArr = this.f31022b;
            if (bVarArr != null) {
                n0.b bVar = bVarArr[k.a(1)];
                n0.b bVar2 = this.f31022b[k.a(2)];
                J j10 = this.f31021a;
                if (bVar2 == null) {
                    bVar2 = j10.f31013a.f(2);
                }
                if (bVar == null) {
                    bVar = j10.f31013a.f(1);
                }
                g(n0.b.a(bVar, bVar2));
                n0.b bVar3 = this.f31022b[k.a(16)];
                if (bVar3 != null) {
                    f(bVar3);
                }
                n0.b bVar4 = this.f31022b[k.a(32)];
                if (bVar4 != null) {
                    d(bVar4);
                }
                n0.b bVar5 = this.f31022b[k.a(64)];
                if (bVar5 != null) {
                    h(bVar5);
                }
            }
        }

        public J b() {
            throw null;
        }

        public void c(int i, n0.b bVar) {
            if (this.f31022b == null) {
                this.f31022b = new n0.b[9];
            }
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i & i9) != 0) {
                    this.f31022b[k.a(i9)] = bVar;
                }
            }
        }

        public void e(n0.b bVar) {
            throw null;
        }

        public void g(n0.b bVar) {
            throw null;
        }

        public d(J j10) {
            this.f31021a = j10;
        }

        public void d(n0.b bVar) {
        }

        public void f(n0.b bVar) {
        }

        public void h(n0.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class e extends j {

        /* renamed from: h, reason: collision with root package name */
        public static boolean f31023h = false;
        public static Method i;

        /* renamed from: j, reason: collision with root package name */
        public static Class<?> f31024j;

        /* renamed from: k, reason: collision with root package name */
        public static Field f31025k;

        /* renamed from: l, reason: collision with root package name */
        public static Field f31026l;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f31027c;

        /* renamed from: d, reason: collision with root package name */
        public n0.b[] f31028d;

        /* renamed from: e, reason: collision with root package name */
        public n0.b f31029e;

        /* renamed from: f, reason: collision with root package name */
        public J f31030f;

        /* renamed from: g, reason: collision with root package name */
        public n0.b f31031g;

        public e(J j10, WindowInsets windowInsets) {
            super(j10);
            this.f31029e = null;
            this.f31027c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private n0.b r(int i9, boolean z10) {
            n0.b bVar = n0.b.f24065e;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i9 & i10) != 0) {
                    bVar = n0.b.a(bVar, s(i10, z10));
                }
            }
            return bVar;
        }

        private n0.b t() {
            J j10 = this.f31030f;
            return j10 != null ? j10.f31013a.h() : n0.b.f24065e;
        }

        private n0.b u(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f31023h) {
                v();
            }
            Method method = i;
            if (method != null && f31024j != null && f31025k != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f31025k.get(f31026l.get(invoke));
                    if (rect != null) {
                        return n0.b.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void v() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f31024j = cls;
                f31025k = cls.getDeclaredField("mVisibleInsets");
                f31026l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f31025k.setAccessible(true);
                f31026l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f31023h = true;
        }

        @Override // y0.J.j
        public void d(View view) {
            n0.b u6 = u(view);
            if (u6 == null) {
                u6 = n0.b.f24065e;
            }
            w(u6);
        }

        @Override // y0.J.j
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f31031g, ((e) obj).f31031g);
            }
            return false;
        }

        @Override // y0.J.j
        public n0.b f(int i9) {
            return r(i9, false);
        }

        @Override // y0.J.j
        public final n0.b j() {
            if (this.f31029e == null) {
                WindowInsets windowInsets = this.f31027c;
                this.f31029e = n0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f31029e;
        }

        @Override // y0.J.j
        public J l(int i9, int i10, int i11, int i12) {
            J h9 = J.h(null, this.f31027c);
            int i13 = Build.VERSION.SDK_INT;
            d cVar = i13 >= 30 ? new c(h9) : i13 >= 29 ? new b(h9) : new a(h9);
            cVar.g(J.e(j(), i9, i10, i11, i12));
            cVar.e(J.e(h(), i9, i10, i11, i12));
            return cVar.b();
        }

        @Override // y0.J.j
        public boolean n() {
            return this.f31027c.isRound();
        }

        @Override // y0.J.j
        public void o(n0.b[] bVarArr) {
            this.f31028d = bVarArr;
        }

        @Override // y0.J.j
        public void p(J j10) {
            this.f31030f = j10;
        }

        public n0.b s(int i9, boolean z10) {
            n0.b h9;
            int i10;
            if (i9 == 1) {
                return z10 ? n0.b.b(0, Math.max(t().f24067b, j().f24067b), 0, 0) : n0.b.b(0, j().f24067b, 0, 0);
            }
            if (i9 == 2) {
                if (z10) {
                    n0.b t3 = t();
                    n0.b h10 = h();
                    return n0.b.b(Math.max(t3.f24066a, h10.f24066a), 0, Math.max(t3.f24068c, h10.f24068c), Math.max(t3.f24069d, h10.f24069d));
                }
                n0.b j10 = j();
                J j11 = this.f31030f;
                h9 = j11 != null ? j11.f31013a.h() : null;
                int i11 = j10.f24069d;
                if (h9 != null) {
                    i11 = Math.min(i11, h9.f24069d);
                }
                return n0.b.b(j10.f24066a, 0, j10.f24068c, i11);
            }
            n0.b bVar = n0.b.f24065e;
            if (i9 == 8) {
                n0.b[] bVarArr = this.f31028d;
                h9 = bVarArr != null ? bVarArr[k.a(8)] : null;
                if (h9 != null) {
                    return h9;
                }
                n0.b j12 = j();
                n0.b t10 = t();
                int i12 = j12.f24069d;
                if (i12 > t10.f24069d) {
                    return n0.b.b(0, 0, 0, i12);
                }
                n0.b bVar2 = this.f31031g;
                return (bVar2 == null || bVar2.equals(bVar) || (i10 = this.f31031g.f24069d) <= t10.f24069d) ? bVar : n0.b.b(0, 0, 0, i10);
            }
            if (i9 == 16) {
                return i();
            }
            if (i9 == 32) {
                return g();
            }
            if (i9 == 64) {
                return k();
            }
            if (i9 != 128) {
                return bVar;
            }
            J j13 = this.f31030f;
            C1602f e10 = j13 != null ? j13.f31013a.e() : e();
            if (e10 == null) {
                return bVar;
            }
            int i13 = Build.VERSION.SDK_INT;
            return n0.b.b(i13 >= 28 ? C1602f.a.b(e10.f31072a) : 0, i13 >= 28 ? C1602f.a.d(e10.f31072a) : 0, i13 >= 28 ? C1602f.a.c(e10.f31072a) : 0, i13 >= 28 ? C1602f.a.a(e10.f31072a) : 0);
        }

        public void w(n0.b bVar) {
            this.f31031g = bVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class f extends e {

        /* renamed from: m, reason: collision with root package name */
        public n0.b f31032m;

        public f(J j10, WindowInsets windowInsets) {
            super(j10, windowInsets);
            this.f31032m = null;
        }

        @Override // y0.J.j
        public J b() {
            return J.h(null, this.f31027c.consumeStableInsets());
        }

        @Override // y0.J.j
        public J c() {
            return J.h(null, this.f31027c.consumeSystemWindowInsets());
        }

        @Override // y0.J.j
        public final n0.b h() {
            if (this.f31032m == null) {
                WindowInsets windowInsets = this.f31027c;
                this.f31032m = n0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f31032m;
        }

        @Override // y0.J.j
        public boolean m() {
            return this.f31027c.isConsumed();
        }

        @Override // y0.J.j
        public void q(n0.b bVar) {
            this.f31032m = bVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class g extends f {
        public g(J j10, WindowInsets windowInsets) {
            super(j10, windowInsets);
        }

        @Override // y0.J.j
        public J a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f31027c.consumeDisplayCutout();
            return J.h(null, consumeDisplayCutout);
        }

        @Override // y0.J.j
        public C1602f e() {
            DisplayCutout displayCutout;
            displayCutout = this.f31027c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C1602f(displayCutout);
        }

        @Override // y0.J.e, y0.J.j
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Objects.equals(this.f31027c, gVar.f31027c) && Objects.equals(this.f31031g, gVar.f31031g);
        }

        @Override // y0.J.j
        public int hashCode() {
            return this.f31027c.hashCode();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class k {
        public static int a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "type needs to be >= FIRST and <= LAST, type="));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static final class l {
        public static int a(int i) {
            int statusBars;
            int i9 = 0;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i & i10) != 0) {
                    if (i10 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i10 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i10 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i10 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i10 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i10 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i10 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i10 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i9 |= statusBars;
                }
            }
            return i9;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f31012b = i.f31036q;
        } else {
            f31012b = j.f31037b;
        }
    }

    public J(WindowInsets windowInsets) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            this.f31013a = new i(this, windowInsets);
            return;
        }
        if (i9 >= 29) {
            this.f31013a = new h(this, windowInsets);
        } else if (i9 >= 28) {
            this.f31013a = new g(this, windowInsets);
        } else {
            this.f31013a = new f(this, windowInsets);
        }
    }

    public static n0.b e(n0.b bVar, int i9, int i10, int i11, int i12) {
        int max = Math.max(0, bVar.f24066a - i9);
        int max2 = Math.max(0, bVar.f24067b - i10);
        int max3 = Math.max(0, bVar.f24068c - i11);
        int max4 = Math.max(0, bVar.f24069d - i12);
        return (max == i9 && max2 == i10 && max3 == i11 && max4 == i12) ? bVar : n0.b.b(max, max2, max3, max4);
    }

    public static J h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        J j10 = new J(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            J a10 = C1596C.e.a(view);
            j jVar = j10.f31013a;
            jVar.p(a10);
            jVar.d(view.getRootView());
        }
        return j10;
    }

    @Deprecated
    public final int a() {
        return this.f31013a.j().f24069d;
    }

    @Deprecated
    public final int b() {
        return this.f31013a.j().f24066a;
    }

    @Deprecated
    public final int c() {
        return this.f31013a.j().f24068c;
    }

    @Deprecated
    public final int d() {
        return this.f31013a.j().f24067b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        return Objects.equals(this.f31013a, ((J) obj).f31013a);
    }

    @Deprecated
    public final J f(int i9, int i10, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        d cVar = i13 >= 30 ? new c(this) : i13 >= 29 ? new b(this) : new a(this);
        cVar.g(n0.b.b(i9, i10, i11, i12));
        return cVar.b();
    }

    public final WindowInsets g() {
        j jVar = this.f31013a;
        if (jVar instanceof e) {
            return ((e) jVar).f31027c;
        }
        return null;
    }

    public final int hashCode() {
        j jVar = this.f31013a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class a extends d {

        /* renamed from: e, reason: collision with root package name */
        public static Field f31014e = null;

        /* renamed from: f, reason: collision with root package name */
        public static boolean f31015f = false;

        /* renamed from: g, reason: collision with root package name */
        public static Constructor<WindowInsets> f31016g = null;

        /* renamed from: h, reason: collision with root package name */
        public static boolean f31017h = false;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsets f31018c;

        /* renamed from: d, reason: collision with root package name */
        public n0.b f31019d;

        public a() {
            this.f31018c = i();
        }

        private static WindowInsets i() {
            if (!f31015f) {
                try {
                    f31014e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f31015f = true;
            }
            Field field = f31014e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f31017h) {
                try {
                    f31016g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f31017h = true;
            }
            Constructor<WindowInsets> constructor = f31016g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // y0.J.d
        public J b() {
            a();
            J h9 = J.h(null, this.f31018c);
            n0.b[] bVarArr = this.f31022b;
            j jVar = h9.f31013a;
            jVar.o(bVarArr);
            jVar.q(this.f31019d);
            return h9;
        }

        @Override // y0.J.d
        public void e(n0.b bVar) {
            this.f31019d = bVar;
        }

        @Override // y0.J.d
        public void g(n0.b bVar) {
            WindowInsets windowInsets = this.f31018c;
            if (windowInsets != null) {
                this.f31018c = windowInsets.replaceSystemWindowInsets(bVar.f24066a, bVar.f24067b, bVar.f24068c, bVar.f24069d);
            }
        }

        public a(J j10) {
            super(j10);
            this.f31018c = j10.g();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class b extends d {

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f31020c;

        public b() {
            this.f31020c = C0992B.e();
        }

        @Override // y0.J.d
        public J b() {
            WindowInsets build;
            a();
            build = this.f31020c.build();
            J h9 = J.h(null, build);
            h9.f31013a.o(this.f31022b);
            return h9;
        }

        @Override // y0.J.d
        public void d(n0.b bVar) {
            this.f31020c.setMandatorySystemGestureInsets(bVar.d());
        }

        @Override // y0.J.d
        public void e(n0.b bVar) {
            this.f31020c.setStableInsets(bVar.d());
        }

        @Override // y0.J.d
        public void f(n0.b bVar) {
            this.f31020c.setSystemGestureInsets(bVar.d());
        }

        @Override // y0.J.d
        public void g(n0.b bVar) {
            this.f31020c.setSystemWindowInsets(bVar.d());
        }

        @Override // y0.J.d
        public void h(n0.b bVar) {
            this.f31020c.setTappableElementInsets(bVar.d());
        }

        public b(J j10) {
            super(j10);
            WindowInsets.Builder e10;
            WindowInsets g10 = j10.g();
            if (g10 != null) {
                e10 = C0992B.f(g10);
            } else {
                e10 = C0992B.e();
            }
            this.f31020c = e10;
        }
    }

    public J() {
        this.f31013a = new j(this);
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class h extends g {

        /* renamed from: n, reason: collision with root package name */
        public n0.b f31033n;

        /* renamed from: o, reason: collision with root package name */
        public n0.b f31034o;

        /* renamed from: p, reason: collision with root package name */
        public n0.b f31035p;

        public h(J j10, WindowInsets windowInsets) {
            super(j10, windowInsets);
            this.f31033n = null;
            this.f31034o = null;
            this.f31035p = null;
        }

        @Override // y0.J.j
        public n0.b g() {
            Insets mandatorySystemGestureInsets;
            if (this.f31034o == null) {
                mandatorySystemGestureInsets = this.f31027c.getMandatorySystemGestureInsets();
                this.f31034o = n0.b.c(mandatorySystemGestureInsets);
            }
            return this.f31034o;
        }

        @Override // y0.J.j
        public n0.b i() {
            Insets systemGestureInsets;
            if (this.f31033n == null) {
                systemGestureInsets = this.f31027c.getSystemGestureInsets();
                this.f31033n = n0.b.c(systemGestureInsets);
            }
            return this.f31033n;
        }

        @Override // y0.J.j
        public n0.b k() {
            Insets tappableElementInsets;
            if (this.f31035p == null) {
                tappableElementInsets = this.f31027c.getTappableElementInsets();
                this.f31035p = n0.b.c(tappableElementInsets);
            }
            return this.f31035p;
        }

        @Override // y0.J.e, y0.J.j
        public J l(int i, int i9, int i10, int i11) {
            WindowInsets inset;
            inset = this.f31027c.inset(i, i9, i10, i11);
            return J.h(null, inset);
        }

        @Override // y0.J.f, y0.J.j
        public void q(n0.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class i extends h {

        /* renamed from: q, reason: collision with root package name */
        public static final J f31036q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f31036q = J.h(null, windowInsets);
        }

        public i(J j10, WindowInsets windowInsets) {
            super(j10, windowInsets);
        }

        @Override // y0.J.e, y0.J.j
        public n0.b f(int i) {
            Insets insets;
            insets = this.f31027c.getInsets(l.a(i));
            return n0.b.c(insets);
        }

        @Override // y0.J.e, y0.J.j
        public final void d(View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    public static class j {

        /* renamed from: b, reason: collision with root package name */
        public static final J f31037b;

        /* renamed from: a, reason: collision with root package name */
        public final J f31038a;

        static {
            int i = Build.VERSION.SDK_INT;
            f31037b = (i >= 30 ? new c() : i >= 29 ? new b() : new a()).b().f31013a.a().f31013a.b().f31013a.c();
        }

        public j(J j10) {
            this.f31038a = j10;
        }

        public J a() {
            return this.f31038a;
        }

        public J b() {
            return this.f31038a;
        }

        public J c() {
            return this.f31038a;
        }

        public C1602f e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return n() == jVar.n() && m() == jVar.m() && Objects.equals(j(), jVar.j()) && Objects.equals(h(), jVar.h()) && Objects.equals(e(), jVar.e());
        }

        public n0.b f(int i) {
            return n0.b.f24065e;
        }

        public n0.b g() {
            return j();
        }

        public n0.b h() {
            return n0.b.f24065e;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public n0.b i() {
            return j();
        }

        public n0.b j() {
            return n0.b.f24065e;
        }

        public n0.b k() {
            return j();
        }

        public J l(int i, int i9, int i10, int i11) {
            return f31037b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void d(View view) {
        }

        public void o(n0.b[] bVarArr) {
        }

        public void p(J j10) {
        }

        public void q(n0.b bVar) {
        }
    }
}
