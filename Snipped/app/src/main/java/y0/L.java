package y0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final g f31039a;

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final Window f31040a;

        /* renamed from: b, reason: collision with root package name */
        public final t f31041b;

        public a(Window window, t tVar) {
            this.f31040a = window;
            this.f31041b = tVar;
        }

        @Override // y0.L.g
        public final void a(int i) {
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i & i9) != 0) {
                    if (i9 == 1) {
                        g(4);
                    } else if (i9 == 2) {
                        g(2);
                    } else if (i9 == 8) {
                        this.f31041b.f31090a.a();
                    }
                }
            }
        }

        @Override // y0.L.g
        public final void e() {
            this.f31040a.getDecorView().setTag(356039078, 2);
            h(2048);
            g(4096);
        }

        @Override // y0.L.g
        public final void f(int i) {
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i & i9) != 0) {
                    if (i9 == 1) {
                        h(4);
                        this.f31040a.clearFlags(1024);
                    } else if (i9 == 2) {
                        h(2);
                    } else if (i9 == 8) {
                        this.f31041b.f31090a.b();
                    }
                }
            }
        }

        public final void g(int i) {
            View decorView = this.f31040a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public final void h(int i) {
            View decorView = this.f31040a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class b extends a {
        @Override // y0.L.g
        public final boolean b() {
            return (this.f31040a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // y0.L.g
        public final void d(boolean z10) {
            if (!z10) {
                h(8192);
                return;
            }
            Window window = this.f31040a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            g(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class c extends b {
        @Override // y0.L.g
        public final void c(boolean z10) {
            if (!z10) {
                h(16);
                return;
            }
            Window window = this.f31040a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            g(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class e extends d {
        @Override // y0.L.d, y0.L.g
        public final void e() {
            this.f31042a.setSystemBarsBehavior(2);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class f extends e {
        @Override // y0.L.d, y0.L.g
        public final boolean b() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f31042a.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class g {
        public void a(int i) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public void e() {
            throw null;
        }

        public void f(int i) {
            throw null;
        }
    }

    @Deprecated
    public L(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f31039a = new f(windowInsetsController, new t(windowInsetsController));
        } else {
            this.f31039a = new d(windowInsetsController, new t(windowInsetsController));
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    public static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsetsController f31042a;

        /* renamed from: b, reason: collision with root package name */
        public final t f31043b;

        /* renamed from: c, reason: collision with root package name */
        public final Window f31044c;

        public d(WindowInsetsController windowInsetsController, t tVar) {
            new androidx.collection.g();
            this.f31042a = windowInsetsController;
            this.f31043b = tVar;
        }

        @Override // y0.L.g
        public final void a(int i) {
            if ((i & 8) != 0) {
                this.f31043b.f31090a.a();
            }
            this.f31042a.hide(i & (-9));
        }

        @Override // y0.L.g
        public boolean b() {
            int systemBarsAppearance;
            this.f31042a.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.f31042a.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // y0.L.g
        public final void c(boolean z10) {
            Window window = this.f31044c;
            if (z10) {
                if (window != null) {
                    g(16);
                }
                this.f31042a.setSystemBarsAppearance(16, 16);
            } else {
                if (window != null) {
                    h(16);
                }
                this.f31042a.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // y0.L.g
        public final void d(boolean z10) {
            Window window = this.f31044c;
            if (z10) {
                if (window != null) {
                    g(8192);
                }
                this.f31042a.setSystemBarsAppearance(8, 8);
            } else {
                if (window != null) {
                    h(8192);
                }
                this.f31042a.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // y0.L.g
        public void e() {
            Window window = this.f31044c;
            if (window == null) {
                this.f31042a.setSystemBarsBehavior(2);
                return;
            }
            window.getDecorView().setTag(356039078, 2);
            h(2048);
            g(4096);
        }

        @Override // y0.L.g
        public final void f(int i) {
            if ((i & 8) != 0) {
                this.f31043b.f31090a.b();
            }
            this.f31042a.show(i & (-9));
        }

        public final void g(int i) {
            View decorView = this.f31044c.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public final void h(int i) {
            View decorView = this.f31044c.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.view.Window r2, y0.t r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = y0.K.d(r2)
                r1.<init>(r0, r3)
                r1.f31044c = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.L.d.<init>(android.view.Window, y0.t):void");
        }
    }

    public L(Window window, View view) {
        t tVar = new t(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f31039a = new f(window, tVar);
        } else if (i >= 30) {
            this.f31039a = new d(window, tVar);
        } else {
            this.f31039a = new c(window, tVar);
        }
    }
}
