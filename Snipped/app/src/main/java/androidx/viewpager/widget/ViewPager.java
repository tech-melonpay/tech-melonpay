package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import k0.C0913a;
import o1.AbstractC1086a;
import y0.C1596C;
import y0.C1597a;
import y0.E;
import z0.C1638d;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] W = {R.attr.layout_gravity};

    /* renamed from: a0, reason: collision with root package name */
    public static final a f7953a0 = new a();

    /* renamed from: b0, reason: collision with root package name */
    public static final b f7954b0 = new b();

    /* renamed from: A, reason: collision with root package name */
    public int f7955A;

    /* renamed from: B, reason: collision with root package name */
    public final int f7956B;

    /* renamed from: C, reason: collision with root package name */
    public float f7957C;

    /* renamed from: D, reason: collision with root package name */
    public float f7958D;

    /* renamed from: E, reason: collision with root package name */
    public float f7959E;

    /* renamed from: F, reason: collision with root package name */
    public float f7960F;

    /* renamed from: G, reason: collision with root package name */
    public int f7961G;

    /* renamed from: H, reason: collision with root package name */
    public VelocityTracker f7962H;

    /* renamed from: I, reason: collision with root package name */
    public final int f7963I;

    /* renamed from: J, reason: collision with root package name */
    public final int f7964J;

    /* renamed from: K, reason: collision with root package name */
    public final int f7965K;

    /* renamed from: L, reason: collision with root package name */
    public final int f7966L;

    /* renamed from: M, reason: collision with root package name */
    public final EdgeEffect f7967M;

    /* renamed from: N, reason: collision with root package name */
    public final EdgeEffect f7968N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f7969O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f7970P;

    /* renamed from: Q, reason: collision with root package name */
    public int f7971Q;
    public ArrayList R;
    public i S;
    public ArrayList T;
    public final c U;
    public int V;

    /* renamed from: a, reason: collision with root package name */
    public int f7972a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<e> f7973b;

    /* renamed from: c, reason: collision with root package name */
    public final e f7974c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f7975d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1086a f7976e;

    /* renamed from: f, reason: collision with root package name */
    public int f7977f;

    /* renamed from: g, reason: collision with root package name */
    public int f7978g;

    /* renamed from: h, reason: collision with root package name */
    public Parcelable f7979h;
    public ClassLoader i;

    /* renamed from: j, reason: collision with root package name */
    public final Scroller f7980j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7981k;

    /* renamed from: l, reason: collision with root package name */
    public j f7982l;

    /* renamed from: m, reason: collision with root package name */
    public int f7983m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f7984n;

    /* renamed from: o, reason: collision with root package name */
    public int f7985o;

    /* renamed from: p, reason: collision with root package name */
    public int f7986p;

    /* renamed from: q, reason: collision with root package name */
    public float f7987q;

    /* renamed from: r, reason: collision with root package name */
    public float f7988r;

    /* renamed from: s, reason: collision with root package name */
    public int f7989s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7990t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7991u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7992v;

    /* renamed from: w, reason: collision with root package name */
    public int f7993w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7994x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7995y;

    /* renamed from: z, reason: collision with root package name */
    public final int f7996z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public int f7997c;

        /* renamed from: d, reason: collision with root package name */
        public Parcelable f7998d;

        /* renamed from: e, reason: collision with root package name */
        public final ClassLoader f7999e;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f7997c = parcel.readInt();
            this.f7998d = parcel.readParcelable(classLoader);
            this.f7999e = classLoader;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return s3.b.m(sb2, this.f7997c, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7997c);
            parcel.writeParcelable(this.f7998d, i);
        }
    }

    public static class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f8002b - eVar2.f8002b;
        }
    }

    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.q();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public Object f8001a;

        /* renamed from: b, reason: collision with root package name */
        public int f8002b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f8003c;

        /* renamed from: d, reason: collision with root package name */
        public float f8004d;

        /* renamed from: e, reason: collision with root package name */
        public float f8005e;
    }

    public static class f extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f8006a;

        /* renamed from: b, reason: collision with root package name */
        public int f8007b;

        /* renamed from: c, reason: collision with root package name */
        public float f8008c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f8009d;

        public f() {
            super(-1, -1);
            this.f8008c = 0.0f;
        }
    }

    public class g extends C1597a {
        public g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
        
            if (r0.c() > 1) goto L8;
         */
        @Override // y0.C1597a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            /*
                r2 = this;
                super.c(r3, r4)
                java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
                java.lang.String r3 = r3.getName()
                r4.setClassName(r3)
                androidx.viewpager.widget.ViewPager r3 = androidx.viewpager.widget.ViewPager.this
                o1.a r0 = r3.f7976e
                if (r0 == 0) goto L1a
                int r0 = r0.c()
                r1 = 1
                if (r0 <= r1) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                r4.setScrollable(r1)
                int r0 = r4.getEventType()
                r1 = 4096(0x1000, float:5.74E-42)
                if (r0 != r1) goto L3b
                o1.a r0 = r3.f7976e
                if (r0 == 0) goto L3b
                int r0 = r0.c()
                r4.setItemCount(r0)
                int r0 = r3.f7977f
                r4.setFromIndex(r0)
                int r3 = r3.f7977f
                r4.setToIndex(r3)
            L3b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.g.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
        }

        @Override // y0.C1597a
        public final void d(View view, C1638d c1638d) {
            this.f31046a.onInitializeAccessibilityNodeInfo(view, c1638d.f31219a);
            c1638d.h(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            AbstractC1086a abstractC1086a = viewPager.f7976e;
            c1638d.l(abstractC1086a != null && abstractC1086a.c() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                c1638d.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                c1638d.a(8192);
            }
        }

        @Override // y0.C1597a
        public final boolean g(View view, int i, Bundle bundle) {
            if (super.g(view, i, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.f7977f + 1);
                return true;
            }
            if (i != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.f7977f - 1);
            return true;
        }
    }

    public interface h {
        void a(ViewPager viewPager, AbstractC1086a abstractC1086a);
    }

    public interface i {
        void a(int i);

        void b(int i);

        void c(int i, float f10);
    }

    public class j extends DataSetObserver {
        public j() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.f();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.f();
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7973b = new ArrayList<>();
        this.f7974c = new e();
        this.f7975d = new Rect();
        this.f7978g = -1;
        this.f7979h = null;
        this.i = null;
        this.f7987q = -3.4028235E38f;
        this.f7988r = Float.MAX_VALUE;
        this.f7993w = 1;
        this.f7961G = -1;
        this.f7969O = true;
        this.U = new c();
        this.V = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f7980j = new Scroller(context2, f7954b0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.f7956B = viewConfiguration.getScaledPagingTouchSlop();
        this.f7963I = (int) (400.0f * f10);
        this.f7964J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7967M = new EdgeEffect(context2);
        this.f7968N = new EdgeEffect(context2);
        this.f7965K = (int) (25.0f * f10);
        this.f7966L = (int) (2.0f * f10);
        this.f7996z = (int) (f10 * 16.0f);
        C1596C.o(this, new g());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C1596C.d.m(this, new B1.f(this));
    }

    public static boolean d(int i9, int i10, int i11, View view, boolean z10) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && d(i9, i13 - childAt.getLeft(), i12 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i9);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f7991u != z10) {
            this.f7991u = z10;
        }
    }

    public final e a(int i9, int i10) {
        e eVar = new e();
        eVar.f8002b = i9;
        eVar.f8001a = this.f7976e.e(this, i9);
        this.f7976e.getClass();
        eVar.f8004d = 1.0f;
        ArrayList<e> arrayList = this.f7973b;
        if (i10 < 0 || i10 >= arrayList.size()) {
            arrayList.add(eVar);
        } else {
            arrayList.add(i10, eVar);
        }
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i9, int i10) {
        e i11;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (i11 = i(childAt)) != null && i11.f8002b == this.f7977f) {
                    childAt.addFocusables(arrayList, i9, i10);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        e i9;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (i9 = i(childAt)) != null && i9.f8002b == this.f7977f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new f();
        }
        f fVar = (f) layoutParams;
        boolean z10 = fVar.f8006a | (view.getClass().getAnnotation(d.class) != null);
        fVar.f8006a = z10;
        if (!this.f7990t) {
            super.addView(view, i9, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fVar.f8009d = true;
            addViewInLayout(view, i9, layoutParams);
        }
    }

    public final void b(i iVar) {
        if (this.R == null) {
            this.R = new ArrayList();
        }
        this.R.add(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r7) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            android.graphics.Rect r6 = r7.f7975d
            if (r8 != r5) goto L97
            android.graphics.Rect r4 = r7.h(r1, r6)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.h(r0, r6)
            int r5 = r5.left
            if (r0 == 0) goto L91
            if (r4 < r5) goto L91
            int r0 = r7.f7977f
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.f7992v = r3
            r7.v(r0, r3, r2, r3)
            goto Lce
        L91:
            boolean r0 = r1.requestFocus()
        L95:
            r3 = r0
            goto Lcf
        L97:
            if (r8 != r4) goto Lcf
            android.graphics.Rect r2 = r7.h(r1, r6)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.h(r0, r6)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r7.n()
            goto L95
        Lae:
            boolean r0 = r1.requestFocus()
            goto L95
        Lb3:
            if (r8 == r5) goto Lc2
            if (r8 != r2) goto Lb8
            goto Lc2
        Lb8:
            if (r8 == r4) goto Lbd
            r0 = 2
            if (r8 != r0) goto Lcf
        Lbd:
            boolean r3 = r7.n()
            goto Lcf
        Lc2:
            int r0 = r7.f7977f
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.f7992v = r3
            r7.v(r0, r3, r2, r3)
            goto Lce
        Lcd:
            r2 = r3
        Lce:
            r3 = r2
        Lcf:
            if (r3 == 0) goto Ld8
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Ld8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i9) {
        if (this.f7976e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i9 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f7987q)) : i9 > 0 && scrollX < ((int) (((float) clientWidth) * this.f7988r));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f7981k = true;
        Scroller scroller = this.f7980j;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L63
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L62
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L62
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.c(r4)
            goto L5f
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L62
            boolean r6 = r5.c(r1)
            goto L5f
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.n()
            goto L5f
        L41:
            r6 = 66
            boolean r6 = r5.c(r6)
            goto L5f
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L59
            int r6 = r5.f7977f
            if (r6 <= 0) goto L62
            int r6 = r6 - r1
            r5.f7992v = r2
            r5.v(r6, r2, r1, r2)
            goto L63
        L59:
            r6 = 17
            boolean r6 = r5.c(r6)
        L5f:
            if (r6 == 0) goto L62
            goto L63
        L62:
            r1 = r2
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e i9;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (i9 = i(childAt)) != null && i9.f8002b == this.f7977f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        AbstractC1086a abstractC1086a;
        EdgeEffect edgeEffect = this.f7968N;
        EdgeEffect edgeEffect2 = this.f7967M;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (abstractC1086a = this.f7976e) == null || abstractC1086a.c() <= 1)) {
            edgeEffect2.finish();
            edgeEffect.finish();
            return;
        }
        if (edgeEffect2.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate(getPaddingTop() + (-height), this.f7987q * width);
            edgeEffect2.setSize(height, width);
            z10 = edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (!edgeEffect.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.f7988r + 1.0f)) * width2);
            edgeEffect.setSize(height2, width2);
            z10 |= edgeEffect.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z10) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7984n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z10) {
        Scroller scroller = this.f7980j;
        boolean z11 = this.V == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.f7992v = false;
        int i9 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f7973b;
            if (i9 >= arrayList.size()) {
                break;
            }
            e eVar = arrayList.get(i9);
            if (eVar.f8003c) {
                eVar.f8003c = false;
                z11 = true;
            }
            i9++;
        }
        if (z11) {
            c cVar = this.U;
            if (!z10) {
                cVar.run();
            } else {
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                postOnAnimation(cVar);
            }
        }
    }

    public final void f() {
        int c2 = this.f7976e.c();
        this.f7972a = c2;
        ArrayList<e> arrayList = this.f7973b;
        boolean z10 = arrayList.size() < (this.f7993w * 2) + 1 && arrayList.size() < c2;
        int i9 = this.f7977f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e eVar = arrayList.get(i10);
            AbstractC1086a abstractC1086a = this.f7976e;
            Object obj = eVar.f8001a;
            abstractC1086a.getClass();
        }
        Collections.sort(arrayList, f7953a0);
        if (z10) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                f fVar = (f) getChildAt(i11).getLayoutParams();
                if (!fVar.f8006a) {
                    fVar.f8008c = 0.0f;
                }
            }
            v(i9, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i9) {
        i iVar = this.S;
        if (iVar != null) {
            iVar.b(i9);
        }
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar2 = (i) this.R.get(i10);
                if (iVar2 != null) {
                    iVar2.b(i9);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f();
    }

    public AbstractC1086a getAdapter() {
        return this.f7976e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i9, int i10) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f7977f;
    }

    public int getOffscreenPageLimit() {
        return this.f7993w;
    }

    public int getPageMargin() {
        return this.f7983m;
    }

    public final Rect h(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final e i(View view) {
        int i9 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f7973b;
            if (i9 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i9);
            if (this.f7976e.f(view, eVar.f8001a)) {
                return eVar;
            }
            i9++;
        }
    }

    public final e j() {
        e eVar;
        int i9;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f7983m / clientWidth : 0.0f;
        int i10 = 0;
        boolean z10 = true;
        e eVar2 = null;
        int i11 = -1;
        float f12 = 0.0f;
        while (true) {
            ArrayList<e> arrayList = this.f7973b;
            if (i10 >= arrayList.size()) {
                return eVar2;
            }
            e eVar3 = arrayList.get(i10);
            if (z10 || eVar3.f8002b == (i9 = i11 + 1)) {
                eVar = eVar3;
            } else {
                float f13 = f10 + f12 + f11;
                e eVar4 = this.f7974c;
                eVar4.f8005e = f13;
                eVar4.f8002b = i9;
                this.f7976e.getClass();
                eVar4.f8004d = 1.0f;
                i10--;
                eVar = eVar4;
            }
            f10 = eVar.f8005e;
            float f14 = eVar.f8004d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return eVar2;
            }
            if (scrollX < f14 || i10 == arrayList.size() - 1) {
                break;
            }
            int i12 = eVar.f8002b;
            float f15 = eVar.f8004d;
            i10++;
            z10 = false;
            e eVar5 = eVar;
            i11 = i12;
            f12 = f15;
            eVar2 = eVar5;
        }
        return eVar;
    }

    public final e k(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f7973b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            e eVar = arrayList.get(i10);
            if (eVar.f8002b == i9) {
                return eVar;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.f7971Q
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L1b:
            if (r6 >= r5) goto L6c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
            boolean r9 = r8.f8006a
            if (r9 != 0) goto L2c
            goto L69
        L2c:
            int r8 = r8.f8007b
            r8 = r8 & 7
            if (r8 == r1) goto L50
            r9 = 3
            if (r8 == r9) goto L4a
            r9 = 5
            if (r8 == r9) goto L3a
            r8 = r2
            goto L5d
        L3a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L46:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5d
        L4a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5d
        L50:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L46
        L5d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L68
            r7.offsetLeftAndRight(r2)
        L68:
            r2 = r8
        L69:
            int r6 = r6 + 1
            goto L1b
        L6c:
            androidx.viewpager.widget.ViewPager$i r14 = r11.S
            if (r14 == 0) goto L73
            r14.c(r12, r13)
        L73:
            java.util.ArrayList r14 = r11.R
            if (r14 == 0) goto L8d
            int r14 = r14.size()
        L7b:
            if (r0 >= r14) goto L8d
            java.util.ArrayList r2 = r11.R
            java.lang.Object r2 = r2.get(r0)
            androidx.viewpager.widget.ViewPager$i r2 = (androidx.viewpager.widget.ViewPager.i) r2
            if (r2 == 0) goto L8a
            r2.c(r12, r13)
        L8a:
            int r0 = r0 + 1
            goto L7b
        L8d:
            r11.f7970P = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.l(int, float, int):void");
    }

    public final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7961G) {
            int i9 = actionIndex == 0 ? 1 : 0;
            this.f7957C = motionEvent.getX(i9);
            this.f7961G = motionEvent.getPointerId(i9);
            VelocityTracker velocityTracker = this.f7962H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        AbstractC1086a abstractC1086a = this.f7976e;
        if (abstractC1086a == null || this.f7977f >= abstractC1086a.c() - 1) {
            return false;
        }
        int i9 = this.f7977f + 1;
        this.f7992v = false;
        v(i9, 0, true, false);
        return true;
    }

    public final boolean o(int i9) {
        if (this.f7973b.size() == 0) {
            if (this.f7969O) {
                return false;
            }
            this.f7970P = false;
            l(0, 0.0f, 0);
            if (this.f7970P) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e j10 = j();
        int clientWidth = getClientWidth();
        int i10 = this.f7983m;
        int i11 = clientWidth + i10;
        float f10 = clientWidth;
        int i12 = j10.f8002b;
        float f11 = ((i9 / f10) - j10.f8005e) / (j10.f8004d + (i10 / f10));
        this.f7970P = false;
        l(i12, f11, (int) (i11 * f11));
        if (this.f7970P) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7969O = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.U);
        Scroller scroller = this.f7980j;
        if (scroller != null && !scroller.isFinished()) {
            this.f7980j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        float f10;
        ArrayList<e> arrayList;
        float f11;
        super.onDraw(canvas);
        if (this.f7983m <= 0 || this.f7984n == null) {
            return;
        }
        ArrayList<e> arrayList2 = this.f7973b;
        if (arrayList2.size() <= 0 || this.f7976e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f12 = this.f7983m / width;
        int i10 = 0;
        e eVar = arrayList2.get(0);
        float f13 = eVar.f8005e;
        int size = arrayList2.size();
        int i11 = eVar.f8002b;
        int i12 = arrayList2.get(size - 1).f8002b;
        while (i11 < i12) {
            while (true) {
                i9 = eVar.f8002b;
                if (i11 <= i9 || i10 >= size) {
                    break;
                }
                i10++;
                eVar = arrayList2.get(i10);
            }
            if (i11 == i9) {
                float f14 = eVar.f8005e;
                float f15 = eVar.f8004d;
                f10 = (f14 + f15) * width;
                f13 = f14 + f15 + f12;
            } else {
                this.f7976e.getClass();
                f10 = (f13 + 1.0f) * width;
                f13 = 1.0f + f12 + f13;
            }
            if (this.f7983m + f10 > scrollX) {
                arrayList = arrayList2;
                f11 = f12;
                this.f7984n.setBounds(Math.round(f10), this.f7985o, Math.round(this.f7983m + f10), this.f7986p);
                this.f7984n.draw(canvas);
            } else {
                arrayList = arrayList2;
                f11 = f12;
            }
            if (f10 > scrollX + r3) {
                return;
            }
            i11++;
            arrayList2 = arrayList;
            f12 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i9 = this.f7956B;
        Scroller scroller = this.f7980j;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.f7994x) {
                return true;
            }
            if (this.f7995y) {
                return false;
            }
        }
        if (action == 0) {
            float x9 = motionEvent.getX();
            this.f7959E = x9;
            this.f7957C = x9;
            float y10 = motionEvent.getY();
            this.f7960F = y10;
            this.f7958D = y10;
            this.f7961G = motionEvent.getPointerId(0);
            this.f7995y = false;
            this.f7981k = true;
            scroller.computeScrollOffset();
            if (this.V != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.f7966L) {
                e(false);
                this.f7994x = false;
            } else {
                scroller.abortAnimation();
                this.f7992v = false;
                q();
                this.f7994x = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f7961G;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x10 = motionEvent.getX(findPointerIndex);
                float f10 = x10 - this.f7957C;
                float abs = Math.abs(f10);
                float y11 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.f7960F);
                if (f10 != 0.0f) {
                    float f11 = this.f7957C;
                    if ((f11 >= this.f7955A || f10 <= 0.0f) && ((f11 <= getWidth() - this.f7955A || f10 >= 0.0f) && d((int) f10, (int) x10, (int) y11, this, false))) {
                        this.f7957C = x10;
                        this.f7958D = y11;
                        this.f7995y = true;
                        return false;
                    }
                }
                float f12 = i9;
                if (abs > f12 && abs * 0.5f > abs2) {
                    this.f7994x = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.f7959E;
                    float f14 = i9;
                    this.f7957C = f10 > 0.0f ? f13 + f14 : f13 - f14;
                    this.f7958D = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f12) {
                    this.f7995y = true;
                }
                if (this.f7994x && p(x10)) {
                    WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        if (this.f7962H == null) {
            this.f7962H = VelocityTracker.obtain();
        }
        this.f7962H.addMovement(motionEvent);
        return this.f7994x;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        f fVar;
        f fVar2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i9), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.f7955A = Math.min(measuredWidth / 10, this.f7996z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            int i13 = 1073741824;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.f8006a) {
                int i14 = fVar2.f8007b;
                int i15 = i14 & 7;
                int i16 = i14 & 112;
                boolean z11 = i16 == 48 || i16 == 80;
                if (i15 != 3 && i15 != 5) {
                    z10 = false;
                }
                int i17 = Integer.MIN_VALUE;
                if (z11) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else {
                    i11 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i18 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = paddingLeft;
                    }
                    i17 = 1073741824;
                } else {
                    i18 = paddingLeft;
                }
                int i19 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i19 == -2) {
                    i19 = measuredHeight;
                    i13 = i11;
                } else if (i19 == -1) {
                    i19 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f7989s = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f7990t = true;
        q();
        this.f7990t = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f8006a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.f8008c), 1073741824), this.f7989s);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i9, Rect rect) {
        int i10;
        int i11;
        int i12;
        e i13;
        int childCount = getChildCount();
        if ((i9 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (i13 = i(childAt)) != null && i13.f8002b == this.f7977f && childAt.requestFocus(i9, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6536a);
        AbstractC1086a abstractC1086a = this.f7976e;
        ClassLoader classLoader = savedState.f7999e;
        if (abstractC1086a != null) {
            abstractC1086a.g(savedState.f7998d, classLoader);
            v(savedState.f7997c, 0, false, true);
        } else {
            this.f7978g = savedState.f7997c;
            this.f7979h = savedState.f7998d;
            this.i = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7997c = this.f7977f;
        AbstractC1086a abstractC1086a = this.f7976e;
        if (abstractC1086a != null) {
            savedState.f7998d = abstractC1086a.h();
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 != i11) {
            int i13 = this.f7983m;
            s(i9, i11, i13, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0175  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f7957C - f10;
        this.f7957C = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f7987q * clientWidth;
        float f13 = this.f7988r * clientWidth;
        ArrayList<e> arrayList = this.f7973b;
        boolean z12 = false;
        e eVar = arrayList.get(0);
        e eVar2 = (e) com.google.android.gms.measurement.internal.a.f(1, arrayList);
        if (eVar.f8002b != 0) {
            f12 = eVar.f8005e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (eVar2.f8002b != this.f7976e.c() - 1) {
            f13 = eVar2.f8005e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f7967M.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f7968N.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i9 = (int) scrollX;
        this.f7957C = (scrollX - i9) + this.f7957C;
        scrollTo(i9, getScrollY());
        o(i9);
        return z12;
    }

    public final void q() {
        r(this.f7977f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r10 == r11) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(int r18) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f7990t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i9, int i10, int i11, int i12) {
        if (i10 > 0 && !this.f7973b.isEmpty()) {
            if (!this.f7980j.isFinished()) {
                this.f7980j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i9 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
                return;
            }
        }
        e k3 = k(this.f7977f);
        int min = (int) ((k3 != null ? Math.min(k3.f8005e, this.f7988r) : 0.0f) * ((i9 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            e(false);
            scrollTo(min, getScrollY());
        }
    }

    public void setAdapter(AbstractC1086a abstractC1086a) {
        ArrayList<e> arrayList;
        AbstractC1086a abstractC1086a2 = this.f7976e;
        if (abstractC1086a2 != null) {
            synchronized (abstractC1086a2) {
            }
            this.f7976e.j(this);
            int i9 = 0;
            while (true) {
                arrayList = this.f7973b;
                if (i9 >= arrayList.size()) {
                    break;
                }
                e eVar = arrayList.get(i9);
                this.f7976e.a(eVar.f8002b, eVar.f8001a);
                i9++;
            }
            this.f7976e.b();
            arrayList.clear();
            int i10 = 0;
            while (i10 < getChildCount()) {
                if (!((f) getChildAt(i10).getLayoutParams()).f8006a) {
                    removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
            this.f7977f = 0;
            scrollTo(0, 0);
        }
        this.f7976e = abstractC1086a;
        this.f7972a = 0;
        if (abstractC1086a != null) {
            if (this.f7982l == null) {
                this.f7982l = new j();
            }
            synchronized (this.f7976e) {
            }
            this.f7992v = false;
            boolean z10 = this.f7969O;
            this.f7969O = true;
            this.f7972a = this.f7976e.c();
            if (this.f7978g >= 0) {
                this.f7976e.g(this.f7979h, this.i);
                v(this.f7978g, 0, false, true);
                this.f7978g = -1;
                this.f7979h = null;
                this.i = null;
            } else if (z10) {
                requestLayout();
            } else {
                q();
            }
        }
        ArrayList arrayList2 = this.T;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.T.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((h) this.T.get(i11)).a(this, abstractC1086a);
        }
    }

    public void setCurrentItem(int i9) {
        this.f7992v = false;
        v(i9, 0, !this.f7969O, false);
    }

    public void setOffscreenPageLimit(int i9) {
        if (i9 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i9 + " too small; defaulting to 1");
            i9 = 1;
        }
        if (i9 != this.f7993w) {
            this.f7993w = i9;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.S = iVar;
    }

    public void setPageMargin(int i9) {
        int i10 = this.f7983m;
        this.f7983m = i9;
        int width = getWidth();
        s(width, width, i9, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f7984n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i9) {
        if (this.V == i9) {
            return;
        }
        this.V = i9;
        i iVar = this.S;
        if (iVar != null) {
            iVar.a(i9);
        }
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar2 = (i) this.R.get(i10);
                if (iVar2 != null) {
                    iVar2.a(i9);
                }
            }
        }
    }

    public final boolean t() {
        this.f7961G = -1;
        this.f7994x = false;
        this.f7995y = false;
        VelocityTracker velocityTracker = this.f7962H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7962H = null;
        }
        this.f7967M.onRelease();
        this.f7968N.onRelease();
        return this.f7967M.isFinished() || this.f7968N.isFinished();
    }

    public final void u(int i9, int i10, boolean z10, boolean z11) {
        int scrollX;
        int abs;
        Scroller scroller = this.f7980j;
        e k3 = k(i9);
        int max = k3 != null ? (int) (Math.max(this.f7987q, Math.min(k3.f8005e, this.f7988r)) * getClientWidth()) : 0;
        if (!z10) {
            if (z11) {
                g(i9);
            }
            e(false);
            scrollTo(max, 0);
            o(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.f7981k ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i11 = scrollX;
            int scrollY = getScrollY();
            int i12 = max - i11;
            int i13 = 0 - scrollY;
            if (i12 == 0 && i13 == 0) {
                e(false);
                q();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i14 = clientWidth / 2;
                float f10 = clientWidth;
                float f11 = i14;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i12) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                int abs2 = Math.abs(i10);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.f7976e.getClass();
                    abs = (int) (((Math.abs(i12) / ((f10 * 1.0f) + this.f7983m)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.f7981k = false;
                this.f7980j.startScroll(i11, scrollY, i12, i13, min);
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                postInvalidateOnAnimation();
            }
        }
        if (z11) {
            g(i9);
        }
    }

    public final void v(int i9, int i10, boolean z10, boolean z11) {
        AbstractC1086a abstractC1086a = this.f7976e;
        if (abstractC1086a == null || abstractC1086a.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList<e> arrayList = this.f7973b;
        if (!z11 && this.f7977f == i9 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i9 < 0) {
            i9 = 0;
        } else if (i9 >= this.f7976e.c()) {
            i9 = this.f7976e.c() - 1;
        }
        int i11 = this.f7993w;
        int i12 = this.f7977f;
        if (i9 > i12 + i11 || i9 < i12 - i11) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                arrayList.get(i13).f8003c = true;
            }
        }
        boolean z12 = this.f7977f != i9;
        if (!this.f7969O) {
            r(i9);
            u(i9, i10, z10, z12);
        } else {
            this.f7977f = i9;
            if (z12) {
                g(i9);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7984n;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        fVar.f8008c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, W);
        fVar.f8007b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return fVar;
    }

    public void setPageMarginDrawable(int i9) {
        setPageMarginDrawable(C0913a.getDrawable(getContext(), i9));
    }

    public static class k implements i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i, float f10) {
        }
    }
}
