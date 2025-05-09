package com.google.android.material.behavior;

import E0.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.e;
import com.google.android.material.snackbar.g;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y0.C1596C;
import y0.E;
import z0.C1638d;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: b, reason: collision with root package name */
    public E0.c f9114b;

    /* renamed from: c, reason: collision with root package name */
    public b f9115c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9116d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9117e;

    /* renamed from: f, reason: collision with root package name */
    public int f9118f = 2;

    /* renamed from: g, reason: collision with root package name */
    public final float f9119g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public float f9120h = 0.0f;
    public float i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    public final a f9121j = new a();

    public class a extends c.AbstractC0013c {

        /* renamed from: a, reason: collision with root package name */
        public int f9122a;

        /* renamed from: b, reason: collision with root package name */
        public int f9123b = -1;

        public a() {
        }

        @Override // E0.c.AbstractC0013c
        public final int a(int i, View view) {
            int width;
            int width2;
            int width3;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            boolean z10 = view.getLayoutDirection() == 1;
            int i9 = SwipeDismissBehavior.this.f9118f;
            if (i9 == 0) {
                if (z10) {
                    width = this.f9122a - view.getWidth();
                    width2 = this.f9122a;
                } else {
                    width = this.f9122a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i9 != 1) {
                width = this.f9122a - view.getWidth();
                width2 = view.getWidth() + this.f9122a;
            } else if (z10) {
                width = this.f9122a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f9122a - view.getWidth();
                width2 = this.f9122a;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // E0.c.AbstractC0013c
        public final int b(int i, View view) {
            return view.getTop();
        }

        @Override // E0.c.AbstractC0013c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // E0.c.AbstractC0013c
        public final void e(int i, View view) {
            this.f9123b = i;
            this.f9122a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f9117e = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f9117e = false;
            }
        }

        @Override // E0.c.AbstractC0013c
        public final void f(int i) {
            b bVar = SwipeDismissBehavior.this.f9115c;
            if (bVar != null) {
                BaseTransientBottomBar baseTransientBottomBar = ((e) bVar).f9788a;
                if (i == 0) {
                    g.b().e(baseTransientBottomBar.f9761t);
                } else if (i == 1 || i == 2) {
                    g.b().d(baseTransientBottomBar.f9761t);
                }
            }
        }

        @Override // E0.c.AbstractC0013c
        public final void g(View view, int i, int i9) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f10 = width * swipeDismissBehavior.f9120h;
            float width2 = view.getWidth() * swipeDismissBehavior.i;
            float abs = Math.abs(i - this.f9122a);
            if (abs <= f10) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f10) / (width2 - f10))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
        
            if (java.lang.Math.abs(r9.getLeft() - r8.f9122a) >= java.lang.Math.round(r9.getWidth() * r3.f9119g)) goto L27;
         */
        @Override // E0.c.AbstractC0013c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.f9123b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r4 = 0
                if (r1 == 0) goto L39
                java.util.WeakHashMap<android.view.View, y0.E> r5 = y0.C1596C.f30963a
                int r5 = r9.getLayoutDirection()
                if (r5 != r2) goto L1a
                r5 = r2
                goto L1b
            L1a:
                r5 = r4
            L1b:
                int r6 = r3.f9118f
                r7 = 2
                if (r6 != r7) goto L21
                goto L52
            L21:
                if (r6 != 0) goto L2d
                if (r5 == 0) goto L2a
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L66
                goto L52
            L2a:
                if (r1 <= 0) goto L66
                goto L52
            L2d:
                if (r6 != r2) goto L66
                if (r5 == 0) goto L34
                if (r1 <= 0) goto L66
                goto L52
            L34:
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L66
                goto L52
            L39:
                int r1 = r9.getLeft()
                int r5 = r8.f9122a
                int r1 = r1 - r5
                int r5 = r9.getWidth()
                float r5 = (float) r5
                float r6 = r3.f9119g
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r5) goto L66
            L52:
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L61
                int r10 = r9.getLeft()
                int r0 = r8.f9122a
                if (r10 >= r0) goto L5f
                goto L61
            L5f:
                int r0 = r0 + r11
                goto L69
            L61:
                int r10 = r8.f9122a
                int r0 = r10 - r11
                goto L69
            L66:
                int r0 = r8.f9122a
                r2 = r4
            L69:
                E0.c r10 = r3.f9114b
                int r11 = r9.getTop()
                boolean r10 = r10.o(r0, r11)
                if (r10 == 0) goto L80
                com.google.android.material.behavior.SwipeDismissBehavior$c r10 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                r10.<init>(r9, r2)
                java.util.WeakHashMap<android.view.View, y0.E> r11 = y0.C1596C.f30963a
                r9.postOnAnimation(r10)
                goto L8b
            L80:
                if (r2 == 0) goto L8b
                com.google.android.material.behavior.SwipeDismissBehavior$b r10 = r3.f9115c
                if (r10 == 0) goto L8b
                com.google.android.material.snackbar.e r10 = (com.google.android.material.snackbar.e) r10
                r10.a(r9)
            L8b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // E0.c.AbstractC0013c
        public final boolean i(int i, View view) {
            int i9 = this.f9123b;
            return (i9 == -1 || i9 == i) && SwipeDismissBehavior.this.a(view);
        }
    }

    public interface b {
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final View f9125a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f9126b;

        public c(View view, boolean z10) {
            this.f9125a = view;
            this.f9126b = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            E0.c cVar = swipeDismissBehavior.f9114b;
            View view = this.f9125a;
            if (cVar != null && cVar.f()) {
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                view.postOnAnimation(this);
            } else {
                if (!this.f9126b || (bVar = swipeDismissBehavior.f9115c) == null) {
                    return;
                }
                ((e) bVar).a(view);
            }
        }
    }

    public boolean a(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f9116d;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.isPointInChildBounds(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f9116d = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f9116d = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f9114b == null) {
            this.f9114b = new E0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f9121j);
        }
        return !this.f9117e && this.f9114b.p(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v10, i);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        if (v10.getImportantForAccessibility() == 0) {
            v10.setImportantForAccessibility(1);
            C1596C.l(PKIFailureInfo.badCertTemplate, v10);
            C1596C.i(0, v10);
            if (a(v10)) {
                C1596C.m(v10, C1638d.a.f31226j, new com.google.android.material.behavior.a(this));
            }
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f9114b == null) {
            return false;
        }
        if (this.f9117e && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f9114b.j(motionEvent);
        return true;
    }
}
