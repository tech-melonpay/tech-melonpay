package E0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: v, reason: collision with root package name */
    public static final a f1016v = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f1017a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1018b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f1020d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1021e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1022f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f1023g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f1024h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1025j;

    /* renamed from: k, reason: collision with root package name */
    public int f1026k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1027l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1028m;

    /* renamed from: n, reason: collision with root package name */
    public final float f1029n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1030o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f1031p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0013c f1032q;

    /* renamed from: r, reason: collision with root package name */
    public View f1033r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1034s;

    /* renamed from: t, reason: collision with root package name */
    public final ViewGroup f1035t;

    /* renamed from: c, reason: collision with root package name */
    public int f1019c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final b f1036u = new b();

    /* compiled from: ViewDragHelper.java */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.n(0);
        }
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0013c abstractC0013c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0013c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1035t = viewGroup;
        this.f1032q = abstractC0013c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1030o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1018b = viewConfiguration.getScaledTouchSlop();
        this.f1028m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1029n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1031p = new OverScroller(context, f1016v);
    }

    public final void a() {
        this.f1019c = -1;
        float[] fArr = this.f1020d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1021e, 0.0f);
            Arrays.fill(this.f1022f, 0.0f);
            Arrays.fill(this.f1023g, 0.0f);
            Arrays.fill(this.f1024h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f1025j, 0);
            this.f1026k = 0;
        }
        VelocityTracker velocityTracker = this.f1027l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1027l = null;
        }
    }

    public final void b(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f1035t;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f1033r = view;
        this.f1019c = i;
        this.f1032q.e(i, view);
        n(1);
    }

    public final boolean c(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        AbstractC0013c abstractC0013c = this.f1032q;
        boolean z10 = abstractC0013c.c(view) > 0;
        boolean z11 = abstractC0013c.d() > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f1018b) : z11 && Math.abs(f11) > ((float) this.f1018b);
        }
        float f12 = (f11 * f11) + (f10 * f10);
        int i = this.f1018b;
        return f12 > ((float) (i * i));
    }

    public final void d(int i) {
        float[] fArr = this.f1020d;
        if (fArr != null) {
            int i9 = this.f1026k;
            int i10 = 1 << i;
            if ((i9 & i10) != 0) {
                fArr[i] = 0.0f;
                this.f1021e[i] = 0.0f;
                this.f1022f[i] = 0.0f;
                this.f1023g[i] = 0.0f;
                this.f1024h[i] = 0;
                this.i[i] = 0;
                this.f1025j[i] = 0;
                this.f1026k = (~i10) & i9;
            }
        }
    }

    public final int e(int i, int i9, int i10) {
        if (i == 0) {
            return 0;
        }
        float width = this.f1035t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i9);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i10) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r2 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r9 = this;
            int r0 = r9.f1017a
            r1 = 2
            if (r0 != r1) goto L5b
            android.widget.OverScroller r0 = r9.f1031p
            boolean r2 = r0.computeScrollOffset()
            int r3 = r0.getCurrX()
            int r4 = r0.getCurrY()
            android.view.View r5 = r9.f1033r
            int r5 = r5.getLeft()
            int r5 = r3 - r5
            android.view.View r6 = r9.f1033r
            int r6 = r6.getTop()
            int r6 = r4 - r6
            if (r5 == 0) goto L2c
            android.view.View r7 = r9.f1033r
            java.util.WeakHashMap<android.view.View, y0.E> r8 = y0.C1596C.f30963a
            r7.offsetLeftAndRight(r5)
        L2c:
            if (r6 == 0) goto L35
            android.view.View r7 = r9.f1033r
            java.util.WeakHashMap<android.view.View, y0.E> r8 = y0.C1596C.f30963a
            r7.offsetTopAndBottom(r6)
        L35:
            if (r5 != 0) goto L39
            if (r6 == 0) goto L40
        L39:
            E0.c$c r5 = r9.f1032q
            android.view.View r6 = r9.f1033r
            r5.g(r6, r3, r4)
        L40:
            if (r2 == 0) goto L52
            int r5 = r0.getFinalX()
            if (r3 != r5) goto L52
            int r3 = r0.getFinalY()
            if (r4 != r3) goto L52
            r0.abortAnimation()
            goto L54
        L52:
            if (r2 != 0) goto L5b
        L54:
            E0.c$b r0 = r9.f1036u
            android.view.ViewGroup r2 = r9.f1035t
            r2.post(r0)
        L5b:
            int r0 = r9.f1017a
            if (r0 != r1) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.c.f():boolean");
    }

    public final View g(int i, int i9) {
        ViewGroup viewGroup = this.f1035t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f1032q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i9 >= childAt.getTop() && i9 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f1033r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f1033r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f1031p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.n(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f1033r
            float r0 = r10.f1029n
            int r0 = (int) r0
            float r6 = r10.f1028m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3d
        L3b:
            r14 = r11
            goto L45
        L3d:
            if (r7 <= r6) goto L45
            if (r14 <= 0) goto L43
            r14 = r6
            goto L45
        L43:
            int r11 = -r6
            goto L3b
        L45:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5f
            float r11 = (float) r6
            float r6 = (float) r8
        L5d:
            float r11 = r11 / r6
            goto L62
        L5f:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L5d
        L62:
            if (r14 == 0) goto L68
            float r0 = (float) r7
            float r6 = (float) r8
        L66:
            float r0 = r0 / r6
            goto L6b
        L68:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L66
        L6b:
            E0.c$c r6 = r10.f1032q
            int r12 = r6.c(r12)
            int r12 = r10.e(r4, r13, r12)
            int r13 = r6.d()
            int r13 = r10.e(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.n(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.c.h(int, int, int, int):boolean");
    }

    public final boolean i(int i) {
        if ((this.f1026k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r9.f1019c == (-1)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.c.j(android.view.MotionEvent):void");
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f1027l;
        float f10 = this.f1028m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f1027l.getXVelocity(this.f1019c);
        float f11 = this.f1029n;
        float abs = Math.abs(xVelocity);
        float f12 = 0.0f;
        if (abs < f11) {
            xVelocity = 0.0f;
        } else if (abs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f1027l.getYVelocity(this.f1019c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f11) {
            if (abs2 > f10) {
                if (yVelocity <= 0.0f) {
                    f10 = -f10;
                }
                f12 = f10;
            } else {
                f12 = yVelocity;
            }
        }
        this.f1034s = true;
        this.f1032q.h(this.f1033r, xVelocity, f12);
        this.f1034s = false;
        if (this.f1017a == 1) {
            n(0);
        }
    }

    public final void l(float f10, float f11, int i) {
        float[] fArr = this.f1020d;
        if (fArr == null || fArr.length <= i) {
            int i9 = i + 1;
            float[] fArr2 = new float[i9];
            float[] fArr3 = new float[i9];
            float[] fArr4 = new float[i9];
            float[] fArr5 = new float[i9];
            int[] iArr = new int[i9];
            int[] iArr2 = new int[i9];
            int[] iArr3 = new int[i9];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1021e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1022f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1023g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1024h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1025j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1020d = fArr2;
            this.f1021e = fArr3;
            this.f1022f = fArr4;
            this.f1023g = fArr5;
            this.f1024h = iArr;
            this.i = iArr2;
            this.f1025j = iArr3;
        }
        float[] fArr9 = this.f1020d;
        this.f1022f[i] = f10;
        fArr9[i] = f10;
        float[] fArr10 = this.f1021e;
        this.f1023g[i] = f11;
        fArr10[i] = f11;
        int[] iArr7 = this.f1024h;
        int i10 = (int) f10;
        int i11 = (int) f11;
        ViewGroup viewGroup = this.f1035t;
        int left = viewGroup.getLeft();
        int i12 = this.f1030o;
        int i13 = i10 < left + i12 ? 1 : 0;
        if (i11 < viewGroup.getTop() + i12) {
            i13 |= 4;
        }
        if (i10 > viewGroup.getRight() - i12) {
            i13 |= 2;
        }
        if (i11 > viewGroup.getBottom() - i12) {
            i13 |= 8;
        }
        iArr7[i] = i13;
        this.f1026k |= 1 << i;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x9 = motionEvent.getX(i);
                float y10 = motionEvent.getY(i);
                this.f1022f[pointerId] = x9;
                this.f1023g[pointerId] = y10;
            }
        }
    }

    public final void n(int i) {
        this.f1035t.removeCallbacks(this.f1036u);
        if (this.f1017a != i) {
            this.f1017a = i;
            this.f1032q.f(i);
            if (this.f1017a == 0) {
                this.f1033r = null;
            }
        }
    }

    public final boolean o(int i, int i9) {
        if (this.f1034s) {
            return h(i, i9, (int) this.f1027l.getXVelocity(this.f1019c), (int) this.f1027l.getYVelocity(this.f1019c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.c.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(int i, View view) {
        if (view == this.f1033r && this.f1019c == i) {
            return true;
        }
        if (view == null || !this.f1032q.i(i, view)) {
            return false;
        }
        this.f1019c = i;
        b(i, view);
        return true;
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: E0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0013c {
        public abstract int a(int i, View view);

        public abstract int b(int i, View view);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public abstract void f(int i);

        public abstract void g(View view, int i, int i9);

        public abstract void h(View view, float f10, float f11);

        public abstract boolean i(int i, View view);

        public void e(int i, View view) {
        }
    }
}
