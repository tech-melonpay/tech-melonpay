package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import h1.C0793a;
import i1.C0808a;
import i1.d;
import i1.g;
import i1.h;
import java.util.WeakHashMap;
import k0.C0913a;
import y0.C1596C;
import y0.C1608l;
import y0.E;
import y0.InterfaceC1607k;
import y0.m;
import y0.n;
import y0.o;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements n, m, InterfaceC1607k {

    /* renamed from: O, reason: collision with root package name */
    public static final int[] f7899O = {R.attr.enabled};

    /* renamed from: A, reason: collision with root package name */
    public int f7900A;

    /* renamed from: B, reason: collision with root package name */
    public final i1.d f7901B;

    /* renamed from: C, reason: collision with root package name */
    public i1.e f7902C;

    /* renamed from: D, reason: collision with root package name */
    public i1.f f7903D;

    /* renamed from: E, reason: collision with root package name */
    public g f7904E;

    /* renamed from: F, reason: collision with root package name */
    public g f7905F;

    /* renamed from: G, reason: collision with root package name */
    public h f7906G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7907H;

    /* renamed from: I, reason: collision with root package name */
    public int f7908I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f7909J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f7910K;

    /* renamed from: L, reason: collision with root package name */
    public final a f7911L;

    /* renamed from: M, reason: collision with root package name */
    public final c f7912M;

    /* renamed from: N, reason: collision with root package name */
    public final d f7913N;

    /* renamed from: a, reason: collision with root package name */
    public View f7914a;

    /* renamed from: b, reason: collision with root package name */
    public f f7915b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7916c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7917d;

    /* renamed from: e, reason: collision with root package name */
    public float f7918e;

    /* renamed from: f, reason: collision with root package name */
    public float f7919f;

    /* renamed from: g, reason: collision with root package name */
    public final o f7920g;

    /* renamed from: h, reason: collision with root package name */
    public final C1608l f7921h;
    public final int[] i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f7922j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f7923k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7924l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7925m;

    /* renamed from: n, reason: collision with root package name */
    public int f7926n;

    /* renamed from: o, reason: collision with root package name */
    public float f7927o;

    /* renamed from: p, reason: collision with root package name */
    public float f7928p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7929q;

    /* renamed from: r, reason: collision with root package name */
    public int f7930r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7931s;

    /* renamed from: t, reason: collision with root package name */
    public final DecelerateInterpolator f7932t;

    /* renamed from: u, reason: collision with root package name */
    public final C0808a f7933u;

    /* renamed from: v, reason: collision with root package name */
    public int f7934v;

    /* renamed from: w, reason: collision with root package name */
    public int f7935w;

    /* renamed from: x, reason: collision with root package name */
    public float f7936x;

    /* renamed from: y, reason: collision with root package name */
    public int f7937y;

    /* renamed from: z, reason: collision with root package name */
    public int f7938z;

    public class c extends Animation {
        public c() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = !swipeRefreshLayout.f7909J ? swipeRefreshLayout.f7938z - Math.abs(swipeRefreshLayout.f7937y) : swipeRefreshLayout.f7938z;
            swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.f7935w + ((int) ((abs - r1) * f10))) - swipeRefreshLayout.f7933u.getTop());
            i1.d dVar = swipeRefreshLayout.f7901B;
            float f11 = 1.0f - f10;
            d.a aVar = dVar.f21252a;
            if (f11 != aVar.f21272p) {
                aVar.f21272p = f11;
            }
            dVar.invalidateSelf();
        }
    }

    public class d extends Animation {
        public d() {
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.e(f10);
        }
    }

    public interface e {
    }

    public interface f {
        void e();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7916c = false;
        this.f7918e = -1.0f;
        this.i = new int[2];
        this.f7922j = new int[2];
        this.f7923k = new int[2];
        this.f7930r = -1;
        this.f7934v = -1;
        this.f7911L = new a();
        this.f7912M = new c();
        this.f7913N = new d();
        this.f7917d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f7925m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f7932t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f7908I = (int) (displayMetrics.density * 40.0f);
        C0808a c0808a = new C0808a(getContext());
        float f10 = c0808a.getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = c0808a.getContext().obtainStyledAttributes(C0793a.f21023a);
        c0808a.f21245b = obtainStyledAttributes.getColor(0, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        C1596C.d.l(c0808a, f10 * 4.0f);
        shapeDrawable.getPaint().setColor(c0808a.f21245b);
        c0808a.setBackground(shapeDrawable);
        this.f7933u = c0808a;
        i1.d dVar = new i1.d(getContext());
        this.f7901B = dVar;
        dVar.c(1);
        this.f7933u.setImageDrawable(this.f7901B);
        this.f7933u.setVisibility(8);
        addView(this.f7933u);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f7938z = i;
        this.f7918e = i;
        this.f7920g = new o();
        this.f7921h = new C1608l(this);
        setNestedScrollingEnabled(true);
        int i9 = -this.f7908I;
        this.f7926n = i9;
        this.f7937y = i9;
        e(1.0f);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f7899O);
        setEnabled(obtainStyledAttributes2.getBoolean(0, true));
        obtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f7933u.getBackground().setAlpha(i);
        this.f7901B.setAlpha(i);
    }

    public final boolean a() {
        View view = this.f7914a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f7914a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f7933u)) {
                    this.f7914a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f10) {
        if (f10 > this.f7918e) {
            g(true, true);
            return;
        }
        this.f7916c = false;
        i1.d dVar = this.f7901B;
        d.a aVar = dVar.f21252a;
        aVar.f21262e = 0.0f;
        aVar.f21263f = 0.0f;
        dVar.invalidateSelf();
        boolean z10 = this.f7931s;
        b bVar = !z10 ? new b() : null;
        int i = this.f7926n;
        if (z10) {
            this.f7935w = i;
            this.f7936x = this.f7933u.getScaleX();
            h hVar = new h(this);
            this.f7906G = hVar;
            hVar.setDuration(150L);
            if (bVar != null) {
                this.f7933u.f21244a = bVar;
            }
            this.f7933u.clearAnimation();
            this.f7933u.startAnimation(this.f7906G);
        } else {
            this.f7935w = i;
            d dVar2 = this.f7913N;
            dVar2.reset();
            dVar2.setDuration(200L);
            dVar2.setInterpolator(this.f7932t);
            if (bVar != null) {
                this.f7933u.f21244a = bVar;
            }
            this.f7933u.clearAnimation();
            this.f7933u.startAnimation(dVar2);
        }
        i1.d dVar3 = this.f7901B;
        d.a aVar2 = dVar3.f21252a;
        if (aVar2.f21270n) {
            aVar2.f21270n = false;
        }
        dVar3.invalidateSelf();
    }

    public final void d(float f10) {
        g gVar;
        g gVar2;
        i1.d dVar = this.f7901B;
        d.a aVar = dVar.f21252a;
        if (!aVar.f21270n) {
            aVar.f21270n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f10 / this.f7918e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f7918e;
        int i = this.f7900A;
        if (i <= 0) {
            i = this.f7909J ? this.f7938z - this.f7937y : this.f7938z;
        }
        float f11 = i;
        double max2 = Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i9 = this.f7937y + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.f7933u.getVisibility() != 0) {
            this.f7933u.setVisibility(0);
        }
        if (!this.f7931s) {
            this.f7933u.setScaleX(1.0f);
            this.f7933u.setScaleY(1.0f);
        }
        if (this.f7931s) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f7918e));
        }
        if (f10 < this.f7918e) {
            if (this.f7901B.f21252a.f21276t > 76 && ((gVar2 = this.f7904E) == null || !gVar2.hasStarted() || gVar2.hasEnded())) {
                g gVar3 = new g(this, this.f7901B.f21252a.f21276t, 76);
                gVar3.setDuration(300L);
                C0808a c0808a = this.f7933u;
                c0808a.f21244a = null;
                c0808a.clearAnimation();
                this.f7933u.startAnimation(gVar3);
                this.f7904E = gVar3;
            }
        } else if (this.f7901B.f21252a.f21276t < 255 && ((gVar = this.f7905F) == null || !gVar.hasStarted() || gVar.hasEnded())) {
            g gVar4 = new g(this, this.f7901B.f21252a.f21276t, 255);
            gVar4.setDuration(300L);
            C0808a c0808a2 = this.f7933u;
            c0808a2.f21244a = null;
            c0808a2.clearAnimation();
            this.f7933u.startAnimation(gVar4);
            this.f7905F = gVar4;
        }
        i1.d dVar2 = this.f7901B;
        float min2 = Math.min(0.8f, max * 0.8f);
        d.a aVar2 = dVar2.f21252a;
        aVar2.f21262e = 0.0f;
        aVar2.f21263f = min2;
        dVar2.invalidateSelf();
        i1.d dVar3 = this.f7901B;
        float min3 = Math.min(1.0f, max);
        d.a aVar3 = dVar3.f21252a;
        if (min3 != aVar3.f21272p) {
            aVar3.f21272p = min3;
        }
        dVar3.invalidateSelf();
        i1.d dVar4 = this.f7901B;
        dVar4.f21252a.f21264g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i9 - this.f7926n);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f7921h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f7921h.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i9, int[] iArr, int[] iArr2) {
        return this.f7921h.c(i, i9, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i9, int i10, int i11, int[] iArr) {
        return this.f7921h.e(i, i9, i10, i11, iArr, 0, null);
    }

    public final void e(float f10) {
        setTargetOffsetTopAndBottom((this.f7935w + ((int) ((this.f7937y - r0) * f10))) - this.f7933u.getTop());
    }

    public final void f() {
        this.f7933u.clearAnimation();
        this.f7901B.stop();
        this.f7933u.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f7931s) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f7937y - this.f7926n);
        }
        this.f7926n = this.f7933u.getTop();
    }

    public final void g(boolean z10, boolean z11) {
        if (this.f7916c != z10) {
            this.f7907H = z11;
            b();
            this.f7916c = z10;
            a aVar = this.f7911L;
            if (!z10) {
                i1.f fVar = new i1.f(this);
                this.f7903D = fVar;
                fVar.setDuration(150L);
                C0808a c0808a = this.f7933u;
                c0808a.f21244a = aVar;
                c0808a.clearAnimation();
                this.f7933u.startAnimation(this.f7903D);
                return;
            }
            this.f7935w = this.f7926n;
            c cVar = this.f7912M;
            cVar.reset();
            cVar.setDuration(200L);
            cVar.setInterpolator(this.f7932t);
            if (aVar != null) {
                this.f7933u.f21244a = aVar;
            }
            this.f7933u.clearAnimation();
            this.f7933u.startAnimation(cVar);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i9) {
        int i10 = this.f7934v;
        return i10 < 0 ? i9 : i9 == i + (-1) ? i10 : i9 >= i10 ? i9 + 1 : i9;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o oVar = this.f7920g;
        return oVar.f31086b | oVar.f31085a;
    }

    public int getProgressCircleDiameter() {
        return this.f7908I;
    }

    public int getProgressViewEndOffset() {
        return this.f7938z;
    }

    public int getProgressViewStartOffset() {
        return this.f7937y;
    }

    public final void h(float f10) {
        float f11 = this.f7928p;
        float f12 = f10 - f11;
        int i = this.f7917d;
        if (f12 <= i || this.f7929q) {
            return;
        }
        this.f7927o = f11 + i;
        this.f7929q = true;
        this.f7901B.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f7921h.g(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f7921h.f31083d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f7916c || this.f7924l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f7930r;
                    if (i == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    h(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f7930r) {
                            this.f7930r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        }
                    }
                }
            }
            this.f7929q = false;
            this.f7930r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f7937y - this.f7933u.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f7930r = pointerId;
            this.f7929q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f7928p = motionEvent.getY(findPointerIndex2);
        }
        return this.f7929q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f7914a == null) {
            b();
        }
        View view = this.f7914a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f7933u.getMeasuredWidth();
        int measuredHeight2 = this.f7933u.getMeasuredHeight();
        int i12 = measuredWidth / 2;
        int i13 = measuredWidth2 / 2;
        int i14 = this.f7926n;
        this.f7933u.layout(i12 - i13, i14, i12 + i13, measuredHeight2 + i14);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        if (this.f7914a == null) {
            b();
        }
        View view = this.f7914a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f7933u.measure(View.MeasureSpec.makeMeasureSpec(this.f7908I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f7908I, 1073741824));
        this.f7934v = -1;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) == this.f7933u) {
                this.f7934v = i10;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return this.f7921h.a(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f7921h.b(f10, f11);
    }

    @Override // y0.m
    public final void onNestedPreScroll(View view, int i, int i9, int[] iArr, int i10) {
        if (i10 == 0) {
            onNestedPreScroll(view, i, i9, iArr);
        }
    }

    @Override // y0.n
    public final void onNestedScroll(View view, int i, int i9, int i10, int i11, int i12, int[] iArr) {
        if (i12 != 0) {
            return;
        }
        int i13 = iArr[1];
        if (i12 == 0) {
            this.f7921h.d(i, i9, i10, i11, this.f7922j, i12, iArr);
        }
        int i14 = i11 - (iArr[1] - i13);
        if ((i14 == 0 ? i11 + this.f7922j[1] : i14) >= 0 || a()) {
            return;
        }
        float abs = this.f7919f + Math.abs(r2);
        this.f7919f = abs;
        d(abs);
        iArr[1] = iArr[1] + i14;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f7920g.f31085a = i;
        startNestedScroll(i & 2);
        this.f7919f = 0.0f;
        this.f7924l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f7939a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new SavedState(this.f7916c, super.onSaveInstanceState());
    }

    @Override // y0.m
    public final boolean onStartNestedScroll(View view, View view2, int i, int i9) {
        if (i9 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f7920g.f31085a = 0;
        this.f7924l = false;
        float f10 = this.f7919f;
        if (f10 > 0.0f) {
            c(f10);
            this.f7919f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f7916c || this.f7924l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f7930r = motionEvent.getPointerId(0);
            this.f7929q = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f7930r);
                if (findPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f7929q) {
                    float y10 = (motionEvent.getY(findPointerIndex) - this.f7927o) * 0.5f;
                    this.f7929q = false;
                    c(y10);
                }
                this.f7930r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f7930r);
                if (findPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(findPointerIndex2);
                h(y11);
                if (this.f7929q) {
                    float f10 = (y11 - this.f7927o) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    d(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f7930r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f7930r) {
                        this.f7930r = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view = this.f7914a;
        if (view != null) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if (!C1596C.d.i(view)) {
                if (this.f7910K || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z10);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAnimationProgress(float f10) {
        this.f7933u.setScaleX(f10);
        this.f7933u.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        i1.d dVar = this.f7901B;
        d.a aVar = dVar.f21252a;
        aVar.i = iArr;
        aVar.a(0);
        aVar.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0913a.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f7918e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        f();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f7910K = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        C1608l c1608l = this.f7921h;
        if (c1608l.f31083d) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.d.q(c1608l.f31082c);
        }
        c1608l.f31083d = z10;
    }

    public void setOnRefreshListener(f fVar) {
        this.f7915b = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f7933u.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0913a.getColor(getContext(), i));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f7916c == z10) {
            g(z10, false);
            return;
        }
        this.f7916c = z10;
        setTargetOffsetTopAndBottom((!this.f7909J ? this.f7938z + this.f7937y : this.f7938z) - this.f7926n);
        this.f7907H = false;
        a aVar = this.f7911L;
        this.f7933u.setVisibility(0);
        this.f7901B.setAlpha(255);
        i1.e eVar = new i1.e(this);
        this.f7902C = eVar;
        eVar.setDuration(this.f7925m);
        if (aVar != null) {
            this.f7933u.f21244a = aVar;
        }
        this.f7933u.clearAnimation();
        this.f7933u.startAnimation(this.f7902C);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f7908I = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f7908I = (int) (displayMetrics.density * 40.0f);
            }
            this.f7933u.setImageDrawable(null);
            this.f7901B.c(i);
            this.f7933u.setImageDrawable(this.f7901B);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f7900A = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        C0808a c0808a = this.f7933u;
        c0808a.bringToFront();
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        c0808a.offsetTopAndBottom(i);
        this.f7926n = c0808a.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f7921h.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f7921h.i(0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7939a;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(boolean z10, Parcelable parcelable) {
            super(parcelable);
            this.f7939a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f7939a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7939a = parcel.readByte() != 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i9, int[] iArr) {
        if (i9 > 0) {
            float f10 = this.f7919f;
            if (f10 > 0.0f) {
                float f11 = i9;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f7919f = 0.0f;
                } else {
                    this.f7919f = f10 - f11;
                    iArr[1] = i9;
                }
                d(this.f7919f);
            }
        }
        if (this.f7909J && i9 > 0 && this.f7919f == 0.0f && Math.abs(i9 - iArr[1]) > 0) {
            this.f7933u.setVisibility(8);
        }
        int i10 = i - iArr[0];
        int i11 = i9 - iArr[1];
        int[] iArr2 = this.i;
        if (dispatchNestedPreScroll(i10, i11, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f7916c || (i & 2) == 0) ? false : true;
    }

    @Override // y0.m
    public final void onNestedScrollAccepted(View view, View view2, int i, int i9) {
        if (i9 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // y0.m
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // y0.m
    public final void onNestedScroll(View view, int i, int i9, int i10, int i11, int i12) {
        onNestedScroll(view, i, i9, i10, i11, i12, this.f7923k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i9, int i10, int i11) {
        onNestedScroll(view, i, i9, i10, i11, 0, this.f7923k);
    }

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            f fVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f7916c) {
                swipeRefreshLayout.f();
                return;
            }
            swipeRefreshLayout.f7901B.setAlpha(255);
            swipeRefreshLayout.f7901B.start();
            if (swipeRefreshLayout.f7907H && (fVar = swipeRefreshLayout.f7915b) != null) {
                fVar.e();
            }
            swipeRefreshLayout.f7926n = swipeRefreshLayout.f7933u.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f7931s) {
                return;
            }
            i1.f fVar = new i1.f(swipeRefreshLayout);
            swipeRefreshLayout.f7903D = fVar;
            fVar.setDuration(150L);
            C0808a c0808a = swipeRefreshLayout.f7933u;
            c0808a.f21244a = null;
            c0808a.clearAnimation();
            swipeRefreshLayout.f7933u.startAnimation(swipeRefreshLayout.f7903D);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(e eVar) {
    }
}
