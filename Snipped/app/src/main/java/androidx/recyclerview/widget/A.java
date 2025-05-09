package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* loaded from: classes.dex */
public class A extends RecyclerView.x {

    /* renamed from: k, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public PointF f7402k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f7403l;

    /* renamed from: n, reason: collision with root package name */
    public float f7405n;
    public final LinearInterpolator i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f7401j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    public boolean f7404m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f7406o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f7407p = 0;

    @SuppressLint({"UnknownNullness"})
    public A(Context context) {
        this.f7403l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i, int i9, int i10, int i11, int i12) {
        if (i12 == -1) {
            return i10 - i;
        }
        if (i12 != 0) {
            if (i12 == 1) {
                return i11 - i9;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i13 = i10 - i;
        if (i13 > 0) {
            return i13;
        }
        int i14 = i11 - i9;
        if (i14 < 0) {
            return i14;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // androidx.recyclerview.widget.RecyclerView.x
    @android.annotation.SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.view.View r7, androidx.recyclerview.widget.RecyclerView.x.a r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f7402k
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            int r0 = r6.f(r0, r7)
            android.graphics.PointF r5 = r6.f7402k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            int r7 = r6.g(r2, r7)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.i(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r3 = r6.f7401j
            r8.f7531a = r0
            r8.f7532b = r7
            r8.f7533c = r2
            r8.f7535e = r3
            r8.f7536f = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.A.c(android.view.View, androidx.recyclerview.widget.RecyclerView$x$a):void");
    }

    @SuppressLint({"UnknownNullness"})
    public int f(int i, View view) {
        RecyclerView.n nVar = this.f7525c;
        if (nVar == null || !nVar.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        return e(nVar.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) oVar).leftMargin, nVar.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) oVar).rightMargin, nVar.getPaddingLeft(), nVar.getWidth() - nVar.getPaddingRight(), i);
    }

    @SuppressLint({"UnknownNullness"})
    public int g(int i, View view) {
        RecyclerView.n nVar = this.f7525c;
        if (nVar == null || !nVar.canScrollVertically()) {
            return 0;
        }
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        return e(nVar.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) oVar).topMargin, nVar.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin, nVar.getPaddingTop(), nVar.getHeight() - nVar.getPaddingBottom(), i);
    }

    @SuppressLint({"UnknownNullness"})
    public float h(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int i(int i) {
        float abs = Math.abs(i);
        if (!this.f7404m) {
            this.f7405n = h(this.f7403l);
            this.f7404m = true;
        }
        return (int) Math.ceil(abs * this.f7405n);
    }
}
