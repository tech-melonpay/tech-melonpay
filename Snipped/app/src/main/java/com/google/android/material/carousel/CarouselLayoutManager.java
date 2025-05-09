package com.google.android.material.carousel;

import B2.e;
import B2.f;
import B2.g;
import B2.h;
import B2.i;
import B2.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.b;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import pa.C1124b;
import t2.C1279a;
import u2.C1512a;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.n implements B2.b, RecyclerView.x.b {

    /* renamed from: a, reason: collision with root package name */
    public int f9213a;

    /* renamed from: b, reason: collision with root package name */
    public int f9214b;

    /* renamed from: c, reason: collision with root package name */
    public int f9215c;

    /* renamed from: d, reason: collision with root package name */
    public final c f9216d;

    /* renamed from: e, reason: collision with root package name */
    public final h f9217e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.material.carousel.c f9218f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.material.carousel.b f9219g;

    /* renamed from: h, reason: collision with root package name */
    public int f9220h;
    public HashMap i;

    /* renamed from: j, reason: collision with root package name */
    public g f9221j;

    /* renamed from: k, reason: collision with root package name */
    public final View.OnLayoutChangeListener f9222k;

    /* renamed from: l, reason: collision with root package name */
    public int f9223l;

    /* renamed from: m, reason: collision with root package name */
    public int f9224m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9225n;

    public class a extends A {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.x
        public final PointF a(int i) {
            return CarouselLayoutManager.this.computeScrollVectorForPosition(i);
        }

        @Override // androidx.recyclerview.widget.A
        public final int f(int i, View view) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            if (carouselLayoutManager.f9218f == null || !carouselLayoutManager.m()) {
                return 0;
            }
            int position = carouselLayoutManager.getPosition(view);
            return (int) (carouselLayoutManager.f9213a - carouselLayoutManager.j(position, carouselLayoutManager.i(position)));
        }

        @Override // androidx.recyclerview.widget.A
        public final int g(int i, View view) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            if (carouselLayoutManager.f9218f == null || carouselLayoutManager.m()) {
                return 0;
            }
            int position = carouselLayoutManager.getPosition(view);
            return (int) (carouselLayoutManager.f9213a - carouselLayoutManager.j(position, carouselLayoutManager.i(position)));
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final View f9227a;

        /* renamed from: b, reason: collision with root package name */
        public final float f9228b;

        /* renamed from: c, reason: collision with root package name */
        public final float f9229c;

        /* renamed from: d, reason: collision with root package name */
        public final d f9230d;

        public b(View view, float f10, float f11, d dVar) {
            this.f9227a = view;
            this.f9228b = f10;
            this.f9229c = f11;
            this.f9230d = dVar;
        }
    }

    public static class c extends RecyclerView.m {

        /* renamed from: f, reason: collision with root package name */
        public final Paint f9231f;

        /* renamed from: g, reason: collision with root package name */
        public List<b.C0102b> f9232g;

        public c() {
            Paint paint = new Paint();
            this.f9231f = paint;
            this.f9232g = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
            super.onDrawOver(canvas, recyclerView, yVar);
            Paint paint = this.f9231f;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (b.C0102b c0102b : this.f9232g) {
                float f10 = c0102b.f9249c;
                ThreadLocal<double[]> threadLocal = n0.a.f24064a;
                float f11 = 1.0f - f10;
                paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * f10) + (Color.alpha(-65281) * f11)), (int) ((Color.red(-16776961) * f10) + (Color.red(-65281) * f11)), (int) ((Color.green(-16776961) * f10) + (Color.green(-65281) * f11)), (int) ((Color.blue(-16776961) * f10) + (Color.blue(-65281) * f11))));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m()) {
                    canvas.drawLine(c0102b.f9248b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f9221j.i(), c0102b.f9248b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f9221j.d(), paint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f9221j.f(), c0102b.f9248b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f9221j.g(), c0102b.f9248b, paint);
                }
            }
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final b.C0102b f9233a;

        /* renamed from: b, reason: collision with root package name */
        public final b.C0102b f9234b;

        public d(b.C0102b c0102b, b.C0102b c0102b2) {
            C1124b.l(c0102b.f9247a <= c0102b2.f9247a);
            this.f9233a = c0102b;
            this.f9234b = c0102b2;
        }
    }

    public CarouselLayoutManager() {
        j jVar = new j();
        this.f9216d = new c();
        this.f9220h = 0;
        this.f9222k = new B2.c(this, 0);
        this.f9224m = -1;
        this.f9225n = 0;
        this.f9217e = jVar;
        s();
        setOrientation(0);
    }

    public static d l(List<b.C0102b> list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        int i = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i12 = 0; i12 < list.size(); i12++) {
            b.C0102b c0102b = list.get(i12);
            float f15 = z10 ? c0102b.f9248b : c0102b.f9247a;
            float abs = Math.abs(f15 - f10);
            if (f15 <= f10 && abs <= f11) {
                i = i12;
                f11 = abs;
            }
            if (f15 > f10 && abs <= f13) {
                i10 = i12;
                f13 = abs;
            }
            if (f15 <= f14) {
                i9 = i12;
                f14 = f15;
            }
            if (f15 > f12) {
                i11 = i12;
                f12 = f15;
            }
        }
        if (i == -1) {
            i = i9;
        }
        if (i10 == -1) {
            i10 = i11;
        }
        return new d(list.get(i), list.get(i10));
    }

    public final void a(View view, int i, b bVar) {
        float f10 = this.f9219g.f9235a / 2.0f;
        addView(view, i);
        float f11 = bVar.f9229c;
        this.f9221j.j(view, (int) (f11 - f10), (int) (f11 + f10));
        u(view, bVar.f9228b, bVar.f9230d);
    }

    public final float b(float f10, float f11) {
        return n() ? f10 - f11 : f10 + f11;
    }

    public final void c(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        float f10 = f(i);
        while (i < yVar.b()) {
            b q10 = q(uVar, f10, i);
            float f11 = q10.f9229c;
            d dVar = q10.f9230d;
            if (o(f11, dVar)) {
                return;
            }
            f10 = b(f10, this.f9219g.f9235a);
            if (!p(f11, dVar)) {
                a(q10.f9227a, -1, q10);
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final boolean canScrollHorizontally() {
        return m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final boolean canScrollVertically() {
        return !m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeHorizontalScrollExtent(RecyclerView.y yVar) {
        if (getChildCount() == 0 || this.f9218f == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.f9218f.f9255a.f9235a / computeHorizontalScrollRange(yVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return this.f9213a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return this.f9215c - this.f9214b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public final PointF computeScrollVectorForPosition(int i) {
        if (this.f9218f == null) {
            return null;
        }
        int j10 = j(i, i(i)) - this.f9213a;
        return m() ? new PointF(j10, 0.0f) : new PointF(0.0f, j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeVerticalScrollExtent(RecyclerView.y yVar) {
        if (getChildCount() == 0 || this.f9218f == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.f9218f.f9255a.f9235a / computeVerticalScrollRange(yVar)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return this.f9213a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int computeVerticalScrollRange(RecyclerView.y yVar) {
        return this.f9215c - this.f9214b;
    }

    public final void d(RecyclerView.u uVar, int i) {
        float f10 = f(i);
        while (i >= 0) {
            b q10 = q(uVar, f10, i);
            float f11 = q10.f9229c;
            d dVar = q10.f9230d;
            if (p(f11, dVar)) {
                return;
            }
            float f12 = this.f9219g.f9235a;
            f10 = n() ? f10 + f12 : f10 - f12;
            if (!o(f11, dVar)) {
                a(q10.f9227a, 0, q10);
            }
            i--;
        }
    }

    public final float e(View view, float f10, d dVar) {
        b.C0102b c0102b = dVar.f9233a;
        float f11 = c0102b.f9248b;
        b.C0102b c0102b2 = dVar.f9234b;
        float f12 = c0102b2.f9248b;
        float f13 = c0102b.f9247a;
        float f14 = c0102b2.f9247a;
        float b9 = C1512a.b(f11, f12, f13, f14, f10);
        if (c0102b2 != this.f9219g.b()) {
            if (dVar.f9233a != this.f9219g.d()) {
                return b9;
            }
        }
        return b9 + (((1.0f - c0102b2.f9249c) + (this.f9221j.b((RecyclerView.o) view.getLayoutParams()) / this.f9219g.f9235a)) * (f10 - f14));
    }

    public final float f(int i) {
        return b(this.f9221j.h() - this.f9213a, this.f9219g.f9235a * i);
    }

    public final void g(RecyclerView.u uVar, RecyclerView.y yVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            Rect rect = new Rect();
            super.getDecoratedBoundsWithMargins(childAt, rect);
            float centerX = m() ? rect.centerX() : rect.centerY();
            if (!p(centerX, l(this.f9219g.f9236b, centerX, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, uVar);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            Rect rect2 = new Rect();
            super.getDecoratedBoundsWithMargins(childAt2, rect2);
            float centerX2 = m() ? rect2.centerX() : rect2.centerY();
            if (!o(centerX2, l(this.f9219g.f9236b, centerX2, true))) {
                break;
            } else {
                removeAndRecycleView(childAt2, uVar);
            }
        }
        if (getChildCount() == 0) {
            d(uVar, this.f9220h - 1);
            c(this.f9220h, uVar, yVar);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            d(uVar, position - 1);
            c(position2 + 1, uVar, yVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final RecyclerView.o generateDefaultLayoutParams() {
        return new RecyclerView.o(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerY = rect.centerY();
        if (m()) {
            centerY = rect.centerX();
        }
        d l10 = l(this.f9219g.f9236b, centerY, true);
        b.C0102b c0102b = l10.f9233a;
        float f10 = c0102b.f9250d;
        b.C0102b c0102b2 = l10.f9234b;
        float b9 = C1512a.b(f10, c0102b2.f9250d, c0102b.f9248b, c0102b2.f9248b, centerY);
        float width = m() ? (rect.width() - b9) / 2.0f : 0.0f;
        float height = m() ? 0.0f : (rect.height() - b9) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    public final int h() {
        return m() ? getWidth() : getHeight();
    }

    public final com.google.android.material.carousel.b i(int i) {
        com.google.android.material.carousel.b bVar;
        HashMap hashMap = this.i;
        return (hashMap == null || (bVar = (com.google.android.material.carousel.b) hashMap.get(Integer.valueOf(C1124b.s(i, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.f9218f.f9255a : bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final int j(int i, com.google.android.material.carousel.b bVar) {
        if (!n()) {
            return (int) ((bVar.f9235a / 2.0f) + ((i * bVar.f9235a) - bVar.a().f9247a));
        }
        float h9 = h() - bVar.c().f9247a;
        float f10 = bVar.f9235a;
        return (int) ((h9 - (i * f10)) - (f10 / 2.0f));
    }

    public final int k(int i, com.google.android.material.carousel.b bVar) {
        int i9 = Integer.MAX_VALUE;
        for (b.C0102b c0102b : bVar.f9236b.subList(bVar.f9237c, bVar.f9238d + 1)) {
            float f10 = bVar.f9235a;
            float f11 = (f10 / 2.0f) + (i * f10);
            int h9 = (n() ? (int) ((h() - c0102b.f9247a) - f11) : (int) (f11 - c0102b.f9247a)) - this.f9213a;
            if (Math.abs(i9) > Math.abs(h9)) {
                i9 = h9;
            }
        }
        return i9;
    }

    public final boolean m() {
        return this.f9221j.f288a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void measureChildWithMargins(View view, int i, int i9) {
        if (!(view instanceof i)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i10 = rect.left + rect.right + i;
        int i11 = rect.top + rect.bottom + i9;
        com.google.android.material.carousel.c cVar = this.f9218f;
        view.measure(RecyclerView.n.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oVar).leftMargin + ((ViewGroup.MarginLayoutParams) oVar).rightMargin + i10, (int) ((cVar == null || this.f9221j.f288a != 0) ? ((ViewGroup.MarginLayoutParams) oVar).width : cVar.f9255a.f9235a), m()), RecyclerView.n.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) oVar).topMargin + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin + i11, (int) ((cVar == null || this.f9221j.f288a != 1) ? ((ViewGroup.MarginLayoutParams) oVar).height : cVar.f9255a.f9235a), canScrollVertically()));
    }

    public final boolean n() {
        return m() && getLayoutDirection() == 1;
    }

    public final boolean o(float f10, d dVar) {
        b.C0102b c0102b = dVar.f9233a;
        float f11 = c0102b.f9250d;
        b.C0102b c0102b2 = dVar.f9234b;
        float b9 = C1512a.b(f11, c0102b2.f9250d, c0102b.f9248b, c0102b2.f9248b, f10) / 2.0f;
        float f12 = n() ? f10 + b9 : f10 - b9;
        if (n()) {
            if (f12 >= 0.0f) {
                return false;
            }
        } else if (f12 <= h()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        h hVar = this.f9217e;
        Context context = recyclerView.getContext();
        float f10 = hVar.f289a;
        if (f10 <= 0.0f) {
            f10 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        hVar.f289a = f10;
        float f11 = hVar.f290b;
        if (f11 <= 0.0f) {
            f11 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        hVar.f290b = f11;
        s();
        recyclerView.addOnLayoutChangeListener(this.f9222k);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.onDetachedFromWindow(recyclerView, uVar);
        recyclerView.removeOnLayoutChangeListener(this.f9222k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x003a, code lost:
    
        if (r9 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0043, code lost:
    
        if (n() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0046, code lost:
    
        if (r9 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x004f, code lost:
    
        if (n() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r6, int r7, androidx.recyclerview.widget.RecyclerView.u r8, androidx.recyclerview.widget.RecyclerView.y r9) {
        /*
            r5 = this;
            int r9 = r5.getChildCount()
            r0 = 0
            if (r9 != 0) goto L8
            return r0
        L8:
            B2.g r9 = r5.f9221j
            int r9 = r9.f288a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r7 == r3) goto L53
            r4 = 2
            if (r7 == r4) goto L51
            r4 = 17
            if (r7 == r4) goto L49
            r4 = 33
            if (r7 == r4) goto L46
            r4 = 66
            if (r7 == r4) goto L3d
            r4 = 130(0x82, float:1.82E-43)
            if (r7 == r4) goto L3a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown focus request:"
            r9.<init>(r4)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "CarouselLayoutManager"
            android.util.Log.d(r9, r7)
        L38:
            r7 = r1
            goto L54
        L3a:
            if (r9 != r3) goto L38
            goto L51
        L3d:
            if (r9 != 0) goto L38
            boolean r7 = r5.n()
            if (r7 == 0) goto L51
            goto L53
        L46:
            if (r9 != r3) goto L38
            goto L53
        L49:
            if (r9 != 0) goto L38
            boolean r7 = r5.n()
            if (r7 == 0) goto L53
        L51:
            r7 = r3
            goto L54
        L53:
            r7 = r2
        L54:
            if (r7 != r1) goto L57
            return r0
        L57:
            r9 = 0
            if (r7 != r2) goto L91
            int r6 = r5.getPosition(r6)
            if (r6 != 0) goto L61
            return r0
        L61:
            android.view.View r6 = r5.getChildAt(r9)
            int r6 = r5.getPosition(r6)
            int r6 = r6 - r3
            if (r6 < 0) goto L80
            int r7 = r5.getItemCount()
            if (r6 < r7) goto L73
            goto L80
        L73:
            float r7 = r5.f(r6)
            com.google.android.material.carousel.CarouselLayoutManager$b r6 = r5.q(r8, r7, r6)
            android.view.View r7 = r6.f9227a
            r5.a(r7, r9, r6)
        L80:
            boolean r6 = r5.n()
            if (r6 == 0) goto L8c
            int r6 = r5.getChildCount()
            int r9 = r6 + (-1)
        L8c:
            android.view.View r6 = r5.getChildAt(r9)
            goto Ld2
        L91:
            int r6 = r5.getPosition(r6)
            int r7 = r5.getItemCount()
            int r7 = r7 - r3
            if (r6 != r7) goto L9d
            return r0
        L9d:
            int r6 = r5.getChildCount()
            int r6 = r6 - r3
            android.view.View r6 = r5.getChildAt(r6)
            int r6 = r5.getPosition(r6)
            int r6 = r6 + r3
            if (r6 < 0) goto Lc1
            int r7 = r5.getItemCount()
            if (r6 < r7) goto Lb4
            goto Lc1
        Lb4:
            float r7 = r5.f(r6)
            com.google.android.material.carousel.CarouselLayoutManager$b r6 = r5.q(r8, r7, r6)
            android.view.View r7 = r6.f9227a
            r5.a(r7, r2, r6)
        Lc1:
            boolean r6 = r5.n()
            if (r6 == 0) goto Lc8
            goto Lce
        Lc8:
            int r6 = r5.getChildCount()
            int r9 = r6 + (-1)
        Lce:
            android.view.View r6 = r5.getChildAt(r9)
        Ld2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i9) {
        super.onItemsAdded(recyclerView, i, i9);
        w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i9) {
        super.onItemsRemoved(recyclerView, i, i9);
        w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (yVar.b() <= 0 || h() <= 0.0f) {
            removeAndRecycleAllViews(uVar);
            this.f9220h = 0;
            return;
        }
        boolean n10 = n();
        boolean z10 = this.f9218f == null;
        if (z10) {
            r(uVar);
        }
        com.google.android.material.carousel.c cVar = this.f9218f;
        boolean n11 = n();
        com.google.android.material.carousel.b a10 = n11 ? cVar.a() : cVar.c();
        float f10 = (n11 ? a10.c() : a10.a()).f9247a;
        float f11 = a10.f9235a / 2.0f;
        int h9 = (int) (this.f9221j.h() - (n() ? f10 + f11 : f10 - f11));
        com.google.android.material.carousel.c cVar2 = this.f9218f;
        boolean n12 = n();
        com.google.android.material.carousel.b c2 = n12 ? cVar2.c() : cVar2.a();
        b.C0102b a11 = n12 ? c2.a() : c2.c();
        int b9 = (int) (((((yVar.b() - 1) * c2.f9235a) * (n12 ? -1.0f : 1.0f)) - (a11.f9247a - this.f9221j.h())) + (this.f9221j.e() - a11.f9247a) + (n12 ? -a11.f9253g : a11.f9254h));
        int min = n12 ? Math.min(0, b9) : Math.max(0, b9);
        this.f9214b = n10 ? min : h9;
        if (n10) {
            min = h9;
        }
        this.f9215c = min;
        if (z10) {
            this.f9213a = h9;
            com.google.android.material.carousel.c cVar3 = this.f9218f;
            int itemCount = getItemCount();
            int i = this.f9214b;
            int i9 = this.f9215c;
            boolean n13 = n();
            float f12 = cVar3.f9255a.f9235a;
            HashMap hashMap = new HashMap();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= itemCount) {
                    break;
                }
                int i12 = n13 ? (itemCount - i10) - 1 : i10;
                float f13 = i12 * f12 * (n13 ? -1 : 1);
                float f14 = i9 - cVar3.f9261g;
                List<com.google.android.material.carousel.b> list = cVar3.f9257c;
                if (f13 > f14 || i10 >= itemCount - list.size()) {
                    hashMap.put(Integer.valueOf(i12), list.get(C1124b.s(i11, 0, list.size() - 1)));
                    i11++;
                }
                i10++;
            }
            int i13 = 0;
            for (int i14 = itemCount - 1; i14 >= 0; i14--) {
                int i15 = n13 ? (itemCount - i14) - 1 : i14;
                float f15 = i15 * f12 * (n13 ? -1 : 1);
                float f16 = i + cVar3.f9260f;
                List<com.google.android.material.carousel.b> list2 = cVar3.f9256b;
                if (f15 < f16 || i14 < list2.size()) {
                    hashMap.put(Integer.valueOf(i15), list2.get(C1124b.s(i13, 0, list2.size() - 1)));
                    i13++;
                }
            }
            this.i = hashMap;
            int i16 = this.f9224m;
            if (i16 != -1) {
                this.f9213a = j(i16, i(i16));
            }
        }
        int i17 = this.f9213a;
        int i18 = this.f9214b;
        int i19 = this.f9215c;
        this.f9213a = (i17 < i18 ? i18 - i17 : i17 > i19 ? i19 - i17 : 0) + i17;
        this.f9220h = C1124b.s(this.f9220h, 0, yVar.b());
        v(this.f9218f);
        detachAndScrapAttachedViews(uVar);
        g(uVar, yVar);
        this.f9223l = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        if (getChildCount() == 0) {
            this.f9220h = 0;
        } else {
            this.f9220h = getPosition(getChildAt(0));
        }
    }

    public final boolean p(float f10, d dVar) {
        b.C0102b c0102b = dVar.f9233a;
        float f11 = c0102b.f9250d;
        b.C0102b c0102b2 = dVar.f9234b;
        float b9 = b(f10, C1512a.b(f11, c0102b2.f9250d, c0102b.f9248b, c0102b2.f9248b, f10) / 2.0f);
        if (n()) {
            if (b9 <= h()) {
                return false;
            }
        } else if (b9 >= 0.0f) {
            return false;
        }
        return true;
    }

    public final b q(RecyclerView.u uVar, float f10, int i) {
        View e10 = uVar.e(i);
        measureChildWithMargins(e10, 0, 0);
        float b9 = b(f10, this.f9219g.f9235a / 2.0f);
        d l10 = l(this.f9219g.f9236b, b9, false);
        return new b(e10, b9, e(e10, b9, l10), l10);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final void r(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int k3;
        if (this.f9218f == null || (k3 = k(getPosition(view), i(getPosition(view)))) == 0) {
            return false;
        }
        int i = this.f9213a;
        int i9 = this.f9214b;
        int i10 = this.f9215c;
        int i11 = i + k3;
        if (i11 < i9) {
            k3 = i9 - i;
        } else if (i11 > i10) {
            k3 = i10 - i;
        }
        int k10 = k(getPosition(view), this.f9218f.b(i + k3, i9, i10));
        if (m()) {
            recyclerView.scrollBy(k10, 0);
            return true;
        }
        recyclerView.scrollBy(0, k10);
        return true;
    }

    public final void s() {
        this.f9218f = null;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (m()) {
            return t(i, uVar, yVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void scrollToPosition(int i) {
        this.f9224m = i;
        if (this.f9218f == null) {
            return;
        }
        this.f9213a = j(i, i(i));
        this.f9220h = C1124b.s(i, 0, Math.max(0, getItemCount() - 1));
        v(this.f9218f);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (canScrollVertically()) {
            return t(i, uVar, yVar);
        }
        return 0;
    }

    public final void setOrientation(int i) {
        g fVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        g gVar = this.f9221j;
        if (gVar == null || i != gVar.f288a) {
            if (i == 0) {
                fVar = new f(this);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                fVar = new e(this);
            }
            this.f9221j = fVar;
            s();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.f7523a = i;
        startSmoothScroll(aVar);
    }

    public final int t(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        if (this.f9218f == null) {
            r(uVar);
        }
        int i9 = this.f9213a;
        int i10 = this.f9214b;
        int i11 = this.f9215c;
        int i12 = i9 + i;
        if (i12 < i10) {
            i = i10 - i9;
        } else if (i12 > i11) {
            i = i11 - i9;
        }
        this.f9213a = i9 + i;
        v(this.f9218f);
        float f10 = this.f9219g.f9235a / 2.0f;
        float f11 = f(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        float f12 = n() ? this.f9219g.c().f9248b : this.f9219g.a().f9248b;
        float f13 = Float.MAX_VALUE;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            float b9 = b(f11, f10);
            d l10 = l(this.f9219g.f9236b, b9, false);
            float e10 = e(childAt, b9, l10);
            super.getDecoratedBoundsWithMargins(childAt, rect);
            u(childAt, b9, l10);
            this.f9221j.l(childAt, rect, f10, e10);
            float abs = Math.abs(f12 - e10);
            if (abs < f13) {
                this.f9224m = getPosition(childAt);
                f13 = abs;
            }
            f11 = b(f11, this.f9219g.f9235a);
        }
        g(uVar, yVar);
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(View view, float f10, d dVar) {
        if (view instanceof i) {
            b.C0102b c0102b = dVar.f9233a;
            float f11 = c0102b.f9249c;
            b.C0102b c0102b2 = dVar.f9234b;
            float b9 = C1512a.b(f11, c0102b2.f9249c, c0102b.f9247a, c0102b2.f9247a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF c2 = this.f9221j.c(height, width, C1512a.b(0.0f, height / 2.0f, 0.0f, 1.0f, b9), C1512a.b(0.0f, width / 2.0f, 0.0f, 1.0f, b9));
            float e10 = e(view, f10, dVar);
            RectF rectF = new RectF(e10 - (c2.width() / 2.0f), e10 - (c2.height() / 2.0f), (c2.width() / 2.0f) + e10, (c2.height() / 2.0f) + e10);
            RectF rectF2 = new RectF(this.f9221j.f(), this.f9221j.i(), this.f9221j.g(), this.f9221j.d());
            this.f9217e.getClass();
            this.f9221j.a(c2, rectF, rectF2);
            this.f9221j.k(c2, rectF, rectF2);
            ((i) view).a();
        }
    }

    public final void v(com.google.android.material.carousel.c cVar) {
        int i = this.f9215c;
        int i9 = this.f9214b;
        if (i <= i9) {
            this.f9219g = n() ? cVar.a() : cVar.c();
        } else {
            this.f9219g = cVar.b(this.f9213a, i9, i);
        }
        List<b.C0102b> list = this.f9219g.f9236b;
        c cVar2 = this.f9216d;
        cVar2.getClass();
        cVar2.f9232g = Collections.unmodifiableList(list);
    }

    public final void w() {
        int itemCount = getItemCount();
        int i = this.f9223l;
        if (itemCount == i || this.f9218f == null) {
            return;
        }
        j jVar = (j) this.f9217e;
        if ((i < jVar.f293c && getItemCount() >= jVar.f293c) || (i >= jVar.f293c && getItemCount() < jVar.f293c)) {
            s();
        }
        this.f9223l = itemCount;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i9) {
        this.f9216d = new c();
        this.f9220h = 0;
        this.f9222k = new B2.c(this, 0);
        this.f9224m = -1;
        this.f9225n = 0;
        this.f9217e = new j();
        s();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27491h);
            this.f9225n = obtainStyledAttributes.getInt(0, 0);
            s();
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
