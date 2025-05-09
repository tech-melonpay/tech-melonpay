package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.luminary.mobile.R;
import h.C0790q;
import h.LayoutInflaterFactory2C0778e;
import java.util.WeakHashMap;
import k.g;
import m.InterfaceC0994D;
import m.InterfaceC0995E;
import y0.C1596C;
import y0.E;
import y0.J;
import y0.m;
import y0.n;
import y0.o;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0994D, m, n {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f4857C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final J f4858D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f4859E;

    /* renamed from: A, reason: collision with root package name */
    public final o f4860A;

    /* renamed from: B, reason: collision with root package name */
    public final f f4861B;

    /* renamed from: a, reason: collision with root package name */
    public int f4862a;

    /* renamed from: b, reason: collision with root package name */
    public int f4863b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f4864c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f4865d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0995E f4866e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4867f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4868g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4869h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4870j;

    /* renamed from: k, reason: collision with root package name */
    public int f4871k;

    /* renamed from: l, reason: collision with root package name */
    public int f4872l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f4873m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f4874n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f4875o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f4876p;

    /* renamed from: q, reason: collision with root package name */
    public J f4877q;

    /* renamed from: r, reason: collision with root package name */
    public J f4878r;

    /* renamed from: s, reason: collision with root package name */
    public J f4879s;

    /* renamed from: t, reason: collision with root package name */
    public J f4880t;

    /* renamed from: u, reason: collision with root package name */
    public d f4881u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f4882v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f4883w;

    /* renamed from: x, reason: collision with root package name */
    public final a f4884x;

    /* renamed from: y, reason: collision with root package name */
    public final b f4885y;

    /* renamed from: z, reason: collision with root package name */
    public final c f4886z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4883w = null;
            actionBarOverlayLayout.f4870j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4883w = null;
            actionBarOverlayLayout.f4870j = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.f4883w = actionBarOverlayLayout.f4865d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f4884x);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.k();
            actionBarOverlayLayout.f4883w = actionBarOverlayLayout.f4865d.animate().translationY(-actionBarOverlayLayout.f4865d.getHeight()).setListener(actionBarOverlayLayout.f4884x);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
    }

    public static final class f extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        J.d cVar = i >= 30 ? new J.c() : i >= 29 ? new J.b() : new J.a();
        cVar.g(n0.b.b(0, 1, 0, 1));
        f4858D = cVar.b();
        f4859E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4863b = 0;
        this.f4873m = new Rect();
        this.f4874n = new Rect();
        this.f4875o = new Rect();
        this.f4876p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        J j10 = J.f31012b;
        this.f4877q = j10;
        this.f4878r = j10;
        this.f4879s = j10;
        this.f4880t = j10;
        this.f4884x = new a();
        this.f4885y = new b();
        this.f4886z = new c();
        l(context);
        this.f4860A = new o();
        f fVar = new f(context);
        fVar.setWillNotDraw(true);
        this.f4861B = fVar;
        addView(fVar);
    }

    public static boolean j(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i9 = rect.left;
        if (i != i9) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i9;
            z11 = true;
        } else {
            z11 = false;
        }
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i11 = rect.top;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i11;
            z11 = true;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i13 = rect.right;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i13;
            z11 = true;
        }
        if (z10) {
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i15 = rect.bottom;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i15;
                return true;
            }
        }
        return z11;
    }

    @Override // m.InterfaceC0994D
    public final boolean a() {
        m();
        return this.f4866e.a();
    }

    @Override // m.InterfaceC0994D
    public final void b() {
        m();
        this.f4866e.b();
    }

    @Override // m.InterfaceC0994D
    public final void c(androidx.appcompat.view.menu.f fVar, LayoutInflaterFactory2C0778e.c cVar) {
        m();
        this.f4866e.c(fVar, cVar);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // m.InterfaceC0994D
    public final boolean d() {
        m();
        return this.f4866e.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f4867f != null) {
            if (this.f4865d.getVisibility() == 0) {
                i = (int) (this.f4865d.getTranslationY() + this.f4865d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f4867f.setBounds(0, i, getWidth(), this.f4867f.getIntrinsicHeight() + i);
            this.f4867f.draw(canvas);
        }
    }

    @Override // m.InterfaceC0994D
    public final boolean e() {
        m();
        return this.f4866e.e();
    }

    @Override // m.InterfaceC0994D
    public final boolean f() {
        m();
        return this.f4866e.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // m.InterfaceC0994D
    public final boolean g() {
        m();
        return this.f4866e.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4865d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o oVar = this.f4860A;
        return oVar.f31086b | oVar.f31085a;
    }

    public CharSequence getTitle() {
        m();
        return this.f4866e.getTitle();
    }

    @Override // m.InterfaceC0994D
    public final void h(int i) {
        m();
        if (i == 2) {
            this.f4866e.o();
        } else if (i == 5) {
            this.f4866e.p();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // m.InterfaceC0994D
    public final void i() {
        m();
        this.f4866e.h();
    }

    public final void k() {
        removeCallbacks(this.f4885y);
        removeCallbacks(this.f4886z);
        ViewPropertyAnimator viewPropertyAnimator = this.f4883w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void l(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4857C);
        this.f4862a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f4867f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f4882v = new OverScroller(context);
    }

    public final void m() {
        InterfaceC0995E wrapper;
        if (this.f4864c == null) {
            this.f4864c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f4865d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0995E) {
                wrapper = (InterfaceC0995E) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f4866e = wrapper;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r0 != false) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r7) {
        /*
            r6 = this;
            r6.m()
            y0.J r7 = y0.J.h(r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r7.b()
            int r2 = r7.d()
            int r3 = r7.c()
            int r4 = r7.a()
            r0.<init>(r1, r2, r3, r4)
            androidx.appcompat.widget.ActionBarContainer r1 = r6.f4865d
            r2 = 0
            boolean r0 = j(r1, r0, r2)
            java.util.WeakHashMap<android.view.View, y0.E> r1 = y0.C1596C.f30963a
            android.graphics.Rect r1 = r6.f4873m
            y0.C1596C.d.b(r6, r7, r1)
            int r2 = r1.left
            int r3 = r1.top
            int r4 = r1.right
            int r5 = r1.bottom
            y0.J$j r7 = r7.f31013a
            y0.J r2 = r7.l(r2, r3, r4, r5)
            r6.f4877q = r2
            y0.J r3 = r6.f4878r
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L47
            y0.J r0 = r6.f4877q
            r6.f4878r = r0
            r0 = 1
        L47:
            android.graphics.Rect r2 = r6.f4874n
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L53
            r2.set(r1)
            goto L55
        L53:
            if (r0 == 0) goto L58
        L55:
            r6.requestLayout()
        L58:
            y0.J r7 = r7.a()
            y0.J$j r7 = r7.f31013a
            y0.J r7 = r7.c()
            y0.J$j r7 = r7.f31013a
            y0.J r7 = r7.b()
            android.view.WindowInsets r7 = r7.g()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l(getContext());
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        C1596C.c.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.i || !z10) {
            return false;
        }
        this.f4882v.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f4882v.getFinalY() > this.f4865d.getHeight()) {
            k();
            this.f4886z.run();
        } else {
            k();
            this.f4885y.run();
        }
        this.f4870j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i9, int[] iArr) {
    }

    @Override // y0.n
    public final void onNestedScroll(View view, int i, int i9, int i10, int i11, int i12, int[] iArr) {
        onNestedScroll(view, i, i9, i10, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C0790q c0790q;
        g gVar;
        this.f4860A.f31085a = i;
        this.f4871k = getActionBarHideOffset();
        k();
        d dVar = this.f4881u;
        if (dVar == null || (gVar = (c0790q = (C0790q) dVar).f21003s) == null) {
            return;
        }
        gVar.a();
        c0790q.f21003s = null;
    }

    @Override // y0.m
    public final boolean onStartNestedScroll(View view, View view2, int i, int i9) {
        return i9 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // y0.m
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m();
        int i9 = this.f4872l ^ i;
        this.f4872l = i;
        boolean z10 = (i & 4) == 0;
        boolean z11 = (i & 256) != 0;
        d dVar = this.f4881u;
        if (dVar != null) {
            ((C0790q) dVar).f20999o = !z11;
            if (z10 || !z11) {
                C0790q c0790q = (C0790q) dVar;
                if (c0790q.f21000p) {
                    c0790q.f21000p = false;
                    c0790q.t(true);
                }
            } else {
                C0790q c0790q2 = (C0790q) dVar;
                if (!c0790q2.f21000p) {
                    c0790q2.f21000p = true;
                    c0790q2.t(true);
                }
            }
        }
        if ((i9 & 256) == 0 || this.f4881u == null) {
            return;
        }
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        C1596C.c.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f4863b = i;
        d dVar = this.f4881u;
        if (dVar != null) {
            ((C0790q) dVar).f20998n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        k();
        this.f4865d.setTranslationY(-Math.max(0, Math.min(i, this.f4865d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f4881u = dVar;
        if (getWindowToken() != null) {
            ((C0790q) this.f4881u).f20998n = this.f4863b;
            int i = this.f4872l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                C1596C.c.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f4869h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.i) {
            this.i = z10;
            if (z10) {
                return;
            }
            k();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m();
        this.f4866e.setIcon(i);
    }

    public void setLogo(int i) {
        m();
        this.f4866e.l(i);
    }

    public void setOverlayMode(boolean z10) {
        this.f4868g = z10;
    }

    @Override // m.InterfaceC0994D
    public void setWindowCallback(Window.Callback callback) {
        m();
        this.f4866e.setWindowCallback(callback);
    }

    @Override // m.InterfaceC0994D
    public void setWindowTitle(CharSequence charSequence) {
        m();
        this.f4866e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // y0.m
    public final void onNestedPreScroll(View view, int i, int i9, int[] iArr, int i10) {
    }

    @Override // y0.m
    public final void onNestedScroll(View view, int i, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            onNestedScroll(view, i, i9, i10, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f4865d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.f4870j) {
            return;
        }
        if (this.f4871k <= this.f4865d.getHeight()) {
            k();
            postDelayed(this.f4885y, 600L);
        } else {
            k();
            postDelayed(this.f4886z, 600L);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i9, int i10, int i11) {
        int i12 = this.f4871k + i9;
        this.f4871k = i12;
        setActionBarHideOffset(i12);
    }

    public void setIcon(Drawable drawable) {
        m();
        this.f4866e.setIcon(drawable);
    }

    @Override // y0.m
    public final void onNestedScrollAccepted(View view, View view2, int i, int i9) {
        if (i9 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i) {
    }
}
