package v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import pa.C1124b;
import y0.C1596C;
import y0.E;

/* compiled from: HeaderBehavior.java */
/* loaded from: classes.dex */
public abstract class d<V extends View> extends f<V> {

    /* renamed from: d, reason: collision with root package name */
    public a f30542d;

    /* renamed from: e, reason: collision with root package name */
    public OverScroller f30543e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30544f;

    /* renamed from: g, reason: collision with root package name */
    public int f30545g;

    /* renamed from: h, reason: collision with root package name */
    public int f30546h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public VelocityTracker f30547j;

    /* compiled from: HeaderBehavior.java */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final CoordinatorLayout f30548a;

        /* renamed from: b, reason: collision with root package name */
        public final V f30549b;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f30548a = coordinatorLayout;
            this.f30549b = v10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar;
            OverScroller overScroller;
            V v10 = this.f30549b;
            if (v10 == null || (overScroller = (dVar = d.this).f30543e) == null) {
                return;
            }
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f30548a;
            if (!computeScrollOffset) {
                dVar.g(coordinatorLayout, v10);
                return;
            }
            dVar.i(coordinatorLayout, v10, dVar.f30543e.getCurrY());
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            v10.postOnAnimation(this);
        }
    }

    public d() {
        this.f30545g = -1;
        this.i = -1;
    }

    public boolean d(V v10) {
        return false;
    }

    public int e(V v10) {
        return -v10.getHeight();
    }

    public int f(V v10) {
        return v10.getHeight();
    }

    public int h(CoordinatorLayout coordinatorLayout, V v10, int i, int i9, int i10) {
        int s10;
        int a10 = a();
        if (i9 == 0 || a10 < i9 || a10 > i10 || a10 == (s10 = C1124b.s(i, i9, i10))) {
            return 0;
        }
        g gVar = this.f30555b;
        if (gVar != null) {
            gVar.b(s10);
        } else {
            this.f30556c = s10;
        }
        return a10 - s10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(CoordinatorLayout coordinatorLayout, View view, int i) {
        h(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f30544f) {
            int i = this.f30545g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f30546h) > this.i) {
                this.f30546h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f30545g = -1;
            int x9 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = d(v10) && coordinatorLayout.isPointInChildBounds(v10, x9, y11);
            this.f30544f = z10;
            if (z10) {
                this.f30546h = y11;
                this.f30545g = motionEvent.getPointerId(0);
                if (this.f30547j == null) {
                    this.f30547j = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f30543e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f30543e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f30547j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.d.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30545g = -1;
        this.i = -1;
    }

    public void g(CoordinatorLayout coordinatorLayout, V v10) {
    }
}
