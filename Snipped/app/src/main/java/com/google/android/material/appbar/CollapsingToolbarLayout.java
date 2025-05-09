package com.google.android.material.appbar;

import C.N;
import J2.i;
import L2.k;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k0.C0913a;
import pa.C1124b;
import t2.C1279a;
import u2.C1512a;
import v2.C1542c;
import v2.g;
import y0.C1596C;
import y0.E;
import y0.J;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public J f9013A;

    /* renamed from: B, reason: collision with root package name */
    public int f9014B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f9015C;

    /* renamed from: D, reason: collision with root package name */
    public int f9016D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9017E;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9018a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9019b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f9020c;

    /* renamed from: d, reason: collision with root package name */
    public View f9021d;

    /* renamed from: e, reason: collision with root package name */
    public View f9022e;

    /* renamed from: f, reason: collision with root package name */
    public int f9023f;

    /* renamed from: g, reason: collision with root package name */
    public int f9024g;

    /* renamed from: h, reason: collision with root package name */
    public int f9025h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f9026j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.android.material.internal.b f9027k;

    /* renamed from: l, reason: collision with root package name */
    public final G2.a f9028l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9029m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9030n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f9031o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f9032p;

    /* renamed from: q, reason: collision with root package name */
    public int f9033q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9034r;

    /* renamed from: s, reason: collision with root package name */
    public ValueAnimator f9035s;

    /* renamed from: t, reason: collision with root package name */
    public long f9036t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f9037u;

    /* renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f9038v;

    /* renamed from: w, reason: collision with root package name */
    public int f9039w;

    /* renamed from: x, reason: collision with root package name */
    public b f9040x;

    /* renamed from: y, reason: collision with root package name */
    public int f9041y;

    /* renamed from: z, reason: collision with root package name */
    public int f9042z;

    public static class a extends FrameLayout.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f9043a;

        /* renamed from: b, reason: collision with root package name */
        public float f9044b;
    }

    public class b implements AppBarLayout.f {
        public b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f9041y = i;
            J j10 = collapsingToolbarLayout.f9013A;
            int d10 = j10 != null ? j10.d() : 0;
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = collapsingToolbarLayout.getChildAt(i9);
                a aVar = (a) childAt.getLayoutParams();
                g b9 = CollapsingToolbarLayout.b(childAt);
                int i10 = aVar.f9043a;
                if (i10 == 1) {
                    b9.b(C1124b.s(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f30558b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((a) childAt.getLayoutParams())).bottomMargin));
                } else if (i10 == 2) {
                    b9.b(Math.round((-i) * aVar.f9044b));
                }
            }
            collapsingToolbarLayout.d();
            if (collapsingToolbarLayout.f9032p != null && d10 > 0) {
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                collapsingToolbarLayout.postInvalidateOnAnimation();
            }
            int height = collapsingToolbarLayout.getHeight();
            WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
            int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - d10;
            float f10 = minimumHeight;
            float min = Math.min(1.0f, (height - collapsingToolbarLayout.getScrimVisibleHeightTrigger()) / f10);
            com.google.android.material.internal.b bVar = collapsingToolbarLayout.f9027k;
            bVar.f9647d = min;
            bVar.f9649e = com.google.android.gms.measurement.internal.a.d(1.0f, min, 0.5f, min);
            bVar.f9651f = collapsingToolbarLayout.f9041y + minimumHeight;
            bVar.p(Math.abs(i) / f10);
        }
    }

    public interface c {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(Y2.a.a(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, 2132083634), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        int i;
        ColorStateList b9;
        ColorStateList b10;
        this.f9018a = true;
        this.f9026j = new Rect();
        this.f9039w = -1;
        this.f9014B = 0;
        this.f9016D = 0;
        Context context2 = getContext();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f9027k = bVar;
        bVar.W = C1512a.f30145e;
        bVar.i(false);
        bVar.f9632J = false;
        this.f9028l = new G2.a(context2);
        int[] iArr = C1279a.f27495m;
        i.a(context2, attributeSet, R.attr.collapsingToolbarLayoutStyle, 2132083634);
        i.b(context2, attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, 2132083634, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, 2132083634);
        int i9 = obtainStyledAttributes.getInt(4, MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START);
        if (bVar.f9658j != i9) {
            bVar.f9658j = i9;
            bVar.i(false);
        }
        bVar.l(obtainStyledAttributes.getInt(0, 8388627));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.i = dimensionPixelSize;
        this.f9025h = dimensionPixelSize;
        this.f9024g = dimensionPixelSize;
        this.f9023f = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(8)) {
            this.f9023f = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.f9025h = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (obtainStyledAttributes.hasValue(9)) {
            this.f9024g = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.i = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        this.f9029m = obtainStyledAttributes.getBoolean(20, true);
        setTitle(obtainStyledAttributes.getText(18));
        bVar.n(2132083242);
        bVar.k(2132083216);
        if (obtainStyledAttributes.hasValue(10)) {
            bVar.n(obtainStyledAttributes.getResourceId(10, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            bVar.k(obtainStyledAttributes.getResourceId(1, 0));
        }
        if (obtainStyledAttributes.hasValue(22)) {
            int i10 = obtainStyledAttributes.getInt(22, -1);
            setTitleEllipsize(i10 != 0 ? i10 != 1 ? i10 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (obtainStyledAttributes.hasValue(11) && bVar.f9666n != (b10 = P2.c.b(obtainStyledAttributes, context2, 11))) {
            bVar.f9666n = b10;
            bVar.i(false);
        }
        if (obtainStyledAttributes.hasValue(2) && bVar.f9668o != (b9 = P2.c.b(obtainStyledAttributes, context2, 2))) {
            bVar.f9668o = b9;
            bVar.i(false);
        }
        this.f9039w = obtainStyledAttributes.getDimensionPixelSize(16, -1);
        if (obtainStyledAttributes.hasValue(14) && (i = obtainStyledAttributes.getInt(14, 1)) != bVar.f9667n0) {
            bVar.f9667n0 = i;
            Bitmap bitmap = bVar.f9633K;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f9633K = null;
            }
            bVar.i(false);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            bVar.V = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(21, 0));
            bVar.i(false);
        }
        this.f9036t = obtainStyledAttributes.getInt(15, 600);
        this.f9037u = k.d(context2, R.attr.motionEasingStandardInterpolator, C1512a.f30143c);
        this.f9038v = k.d(context2, R.attr.motionEasingStandardInterpolator, C1512a.f30144d);
        setContentScrim(obtainStyledAttributes.getDrawable(3));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(17));
        setTitleCollapseMode(obtainStyledAttributes.getInt(19, 0));
        this.f9019b = obtainStyledAttributes.getResourceId(23, -1);
        this.f9015C = obtainStyledAttributes.getBoolean(13, false);
        this.f9017E = obtainStyledAttributes.getBoolean(12, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        N n10 = new N(this, 26);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        C1596C.d.m(this, n10);
    }

    public static g b(View view) {
        g gVar = (g) view.getTag(R.id.view_offset_helper);
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(view);
        view.setTag(R.id.view_offset_helper, gVar2);
        return gVar2;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        Context context = getContext();
        TypedValue a10 = P2.b.a(context, R.attr.colorSurfaceContainer);
        ColorStateList colorStateList = null;
        if (a10 != null) {
            int i = a10.resourceId;
            if (i != 0) {
                colorStateList = C0913a.getColorStateList(context, i);
            } else {
                int i9 = a10.data;
                if (i9 != 0) {
                    colorStateList = ColorStateList.valueOf(i9);
                }
            }
        }
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        G2.a aVar = this.f9028l;
        return aVar.a(aVar.f1312d, dimension);
    }

    public final void a() {
        if (this.f9018a) {
            ViewGroup viewGroup = null;
            this.f9020c = null;
            this.f9021d = null;
            int i = this.f9019b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f9020c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.f9021d = view;
                }
            }
            if (this.f9020c == null) {
                int childCount = getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f9020c = viewGroup;
            }
            c();
            this.f9018a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.f9029m && (view = this.f9022e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f9022e);
            }
        }
        if (!this.f9029m || this.f9020c == null) {
            return;
        }
        if (this.f9022e == null) {
            this.f9022e = new View(getContext());
        }
        if (this.f9022e.getParent() == null) {
            this.f9020c.addView(this.f9022e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d() {
        if (this.f9031o == null && this.f9032p == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f9041y < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f9020c == null && (drawable = this.f9031o) != null && this.f9033q > 0) {
            drawable.mutate().setAlpha(this.f9033q);
            this.f9031o.draw(canvas);
        }
        if (this.f9029m && this.f9030n) {
            ViewGroup viewGroup = this.f9020c;
            com.google.android.material.internal.b bVar = this.f9027k;
            if (viewGroup == null || this.f9031o == null || this.f9033q <= 0 || this.f9042z != 1 || bVar.f9643b >= bVar.f9649e) {
                bVar.d(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f9031o.getBounds(), Region.Op.DIFFERENCE);
                bVar.d(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f9032p == null || this.f9033q <= 0) {
            return;
        }
        J j10 = this.f9013A;
        int d10 = j10 != null ? j10.d() : 0;
        if (d10 > 0) {
            this.f9032p.setBounds(0, -this.f9041y, getWidth(), d10 - this.f9041y);
            this.f9032p.mutate().setAlpha(this.f9033q);
            this.f9032p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        View view2;
        Drawable drawable = this.f9031o;
        if (drawable == null || this.f9033q <= 0 || ((view2 = this.f9021d) == null || view2 == this ? view != this.f9020c : view != view2)) {
            z10 = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.f9042z == 1 && view != null && this.f9029m) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.f9031o.mutate().setAlpha(this.f9033q);
            this.f9031o.draw(canvas);
            z10 = true;
        }
        return super.drawChild(canvas, view, j10) || z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9032p;
        boolean z10 = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f9031o;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.b bVar = this.f9027k;
        if (bVar != null) {
            bVar.R = drawableState;
            ColorStateList colorStateList2 = bVar.f9668o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f9666n) != null && colorStateList.isStateful())) {
                bVar.i(false);
                z10 = true;
            }
            state |= z10;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(int i, int i9, int i10, int i11, boolean z10) {
        View view;
        int i12;
        int i13;
        int i14;
        if (!this.f9029m || (view = this.f9022e) == null) {
            return;
        }
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        int i15 = 0;
        boolean z11 = view.isAttachedToWindow() && this.f9022e.getVisibility() == 0;
        this.f9030n = z11;
        if (z11 || z10) {
            boolean z12 = getLayoutDirection() == 1;
            View view2 = this.f9021d;
            if (view2 == null) {
                view2 = this.f9020c;
            }
            int height = ((getHeight() - b(view2).f30558b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((a) view2.getLayoutParams())).bottomMargin;
            View view3 = this.f9022e;
            Rect rect = this.f9026j;
            J2.a.a(this, view3, rect);
            ViewGroup viewGroup = this.f9020c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                i15 = toolbar.getTitleMarginStart();
                i13 = toolbar.getTitleMarginEnd();
                i14 = toolbar.getTitleMarginTop();
                i12 = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                i15 = toolbar2.getTitleMarginStart();
                i13 = toolbar2.getTitleMarginEnd();
                i14 = toolbar2.getTitleMarginTop();
                i12 = toolbar2.getTitleMarginBottom();
            } else {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            int i16 = rect.left + (z12 ? i13 : i15);
            int i17 = rect.top + height + i14;
            int i18 = rect.right;
            if (!z12) {
                i15 = i13;
            }
            int i19 = i18 - i15;
            int i20 = (rect.bottom + height) - i12;
            com.google.android.material.internal.b bVar = this.f9027k;
            Rect rect2 = bVar.f9655h;
            if (rect2.left != i16 || rect2.top != i17 || rect2.right != i19 || rect2.bottom != i20) {
                rect2.set(i16, i17, i19, i20);
                bVar.S = true;
            }
            int i21 = z12 ? this.f9025h : this.f9023f;
            int i22 = rect.top + this.f9024g;
            int i23 = (i10 - i) - (z12 ? this.f9023f : this.f9025h);
            int i24 = (i11 - i9) - this.i;
            Rect rect3 = bVar.f9653g;
            if (rect3.left != i21 || rect3.top != i22 || rect3.right != i23 || rect3.bottom != i24) {
                rect3.set(i21, i22, i23, i24);
                bVar.S = true;
            }
            bVar.i(z10);
        }
    }

    public final void f() {
        if (this.f9020c != null && this.f9029m && TextUtils.isEmpty(this.f9027k.f9629G)) {
            ViewGroup viewGroup = this.f9020c;
            setTitle(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-1, -1);
        aVar.f9043a = 0;
        aVar.f9044b = 0.5f;
        return aVar;
    }

    public int getCollapsedTitleGravity() {
        return this.f9027k.f9660k;
    }

    public float getCollapsedTitleTextSize() {
        return this.f9027k.f9664m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f9027k.f9679w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f9031o;
    }

    public int getExpandedTitleGravity() {
        return this.f9027k.f9658j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f9025h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f9023f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f9024g;
    }

    public float getExpandedTitleTextSize() {
        return this.f9027k.f9662l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f9027k.f9682z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.f9027k.f9673q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f9027k.f9657i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f9027k.f9657i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f9027k.f9657i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f9027k.f9667n0;
    }

    public int getScrimAlpha() {
        return this.f9033q;
    }

    public long getScrimAnimationDuration() {
        return this.f9036t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f9039w;
        if (i >= 0) {
            return i + this.f9014B + this.f9016D;
        }
        J j10 = this.f9013A;
        int d10 = j10 != null ? j10.d() : 0;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + d10, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f9032p;
    }

    public CharSequence getTitle() {
        if (this.f9029m) {
            return this.f9027k.f9629G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f9042z;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f9027k.V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f9027k.f9628F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f9042z == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.f9040x == null) {
                this.f9040x = new b();
            }
            appBarLayout.a(this.f9040x);
            C1596C.c.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9027k.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        b bVar = this.f9040x;
        if (bVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f8981h) != null) {
            arrayList.remove(bVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        super.onLayout(z10, i, i9, i10, i11);
        J j10 = this.f9013A;
        if (j10 != null) {
            int d10 = j10.d();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < d10) {
                    childAt.offsetTopAndBottom(d10);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            g b9 = b(getChildAt(i13));
            View view = b9.f30557a;
            b9.f30558b = view.getTop();
            b9.f30559c = view.getLeft();
        }
        e(i, i9, i10, i11, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i14 = 0; i14 < childCount3; i14++) {
            b(getChildAt(i14)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i9) {
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i9);
        int mode = View.MeasureSpec.getMode(i9);
        J j10 = this.f9013A;
        int d10 = j10 != null ? j10.d() : 0;
        if ((mode == 0 || this.f9015C) && d10 > 0) {
            this.f9014B = d10;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d10, 1073741824));
        }
        if (this.f9017E) {
            com.google.android.material.internal.b bVar = this.f9027k;
            if (bVar.f9667n0 > 1) {
                f();
                e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i10 = bVar.f9670p;
                if (i10 > 1) {
                    TextPaint textPaint = bVar.U;
                    textPaint.setTextSize(bVar.f9662l);
                    textPaint.setTypeface(bVar.f9682z);
                    textPaint.setLetterSpacing(bVar.f9654g0);
                    this.f9016D = (i10 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f9016D, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.f9020c;
        if (viewGroup != null) {
            View view = this.f9021d;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i9, int i10, int i11) {
        super.onSizeChanged(i, i9, i10, i11);
        Drawable drawable = this.f9031o;
        if (drawable != null) {
            ViewGroup viewGroup = this.f9020c;
            if (this.f9042z == 1 && viewGroup != null && this.f9029m) {
                i9 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i9);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f9027k.l(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f9027k.k(i);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.b bVar = this.f9027k;
        if (bVar.f9668o != colorStateList) {
            bVar.f9668o = colorStateList;
            bVar.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f10) {
        com.google.android.material.internal.b bVar = this.f9027k;
        if (bVar.f9664m != f10) {
            bVar.f9664m = f10;
            bVar.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        com.google.android.material.internal.b bVar = this.f9027k;
        if (bVar.m(typeface)) {
            bVar.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f9031o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f9031o = mutate;
            if (mutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f9020c;
                if (this.f9042z == 1 && viewGroup != null && this.f9029m) {
                    height = viewGroup.getBottom();
                }
                mutate.setBounds(0, 0, width, height);
                this.f9031o.setCallback(this);
                this.f9031o.setAlpha(this.f9033q);
            }
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C0913a.getDrawable(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        com.google.android.material.internal.b bVar = this.f9027k;
        if (bVar.f9658j != i) {
            bVar.f9658j = i;
            bVar.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f9025h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f9023f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f9024g = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f9027k.n(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.b bVar = this.f9027k;
        if (bVar.f9666n != colorStateList) {
            bVar.f9666n = colorStateList;
            bVar.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f10) {
        com.google.android.material.internal.b bVar = this.f9027k;
        if (bVar.f9662l != f10) {
            bVar.f9662l = f10;
            bVar.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        com.google.android.material.internal.b bVar = this.f9027k;
        if (bVar.o(typeface)) {
            bVar.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.f9017E = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.f9015C = z10;
    }

    public void setHyphenationFrequency(int i) {
        this.f9027k.f9673q0 = i;
    }

    public void setLineSpacingAdd(float f10) {
        this.f9027k.f9669o0 = f10;
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f9027k.f9671p0 = f10;
    }

    public void setMaxLines(int i) {
        com.google.android.material.internal.b bVar = this.f9027k;
        if (i != bVar.f9667n0) {
            bVar.f9667n0 = i;
            Bitmap bitmap = bVar.f9633K;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f9633K = null;
            }
            bVar.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f9027k.f9632J = z10;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f9033q) {
            if (this.f9031o != null && (viewGroup = this.f9020c) != null) {
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.f9033q = i;
            WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.f9036t = j10;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f9039w != i) {
            this.f9039w = i;
            d();
        }
    }

    public void setScrimsShown(boolean z10) {
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        boolean z11 = isLaidOut() && !isInEditMode();
        if (this.f9034r != z10) {
            if (z11) {
                int i = z10 ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.f9035s;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f9035s = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.f9033q ? this.f9037u : this.f9038v);
                    this.f9035s.addUpdateListener(new C1542c(this));
                } else if (valueAnimator.isRunning()) {
                    this.f9035s.cancel();
                }
                this.f9035s.setDuration(this.f9036t);
                this.f9035s.setIntValues(this.f9033q, i);
                this.f9035s.start();
            } else {
                setScrimAlpha(z10 ? 255 : 0);
            }
            this.f9034r = z10;
        }
    }

    public void setStaticLayoutBuilderConfigurer(c cVar) {
        com.google.android.material.internal.b bVar = this.f9027k;
        if (cVar != null) {
            bVar.i(true);
        } else {
            bVar.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f9032p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f9032p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f9032p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f9032p;
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f9032p.setVisible(getVisibility() == 0, false);
                this.f9032p.setCallback(this);
                this.f9032p.setAlpha(this.f9033q);
            }
            WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0913a.getDrawable(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        com.google.android.material.internal.b bVar = this.f9027k;
        if (charSequence == null || !TextUtils.equals(bVar.f9629G, charSequence)) {
            bVar.f9629G = charSequence;
            bVar.f9630H = null;
            Bitmap bitmap = bVar.f9633K;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f9633K = null;
            }
            bVar.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.f9042z = i;
        boolean z10 = i == 1;
        this.f9027k.f9645c = z10;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f9042z == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z10 && this.f9031o == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        com.google.android.material.internal.b bVar = this.f9027k;
        bVar.f9628F = truncateAt;
        bVar.i(false);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f9029m) {
            this.f9029m = z10;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        com.google.android.material.internal.b bVar = this.f9027k;
        bVar.V = timeInterpolator;
        bVar.i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z10 = i == 0;
        Drawable drawable = this.f9032p;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f9032p.setVisible(z10, false);
        }
        Drawable drawable2 = this.f9031o;
        if (drawable2 == null || drawable2.isVisible() == z10) {
            return;
        }
        this.f9031o.setVisible(z10, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9031o || drawable == this.f9032p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f9043a = 0;
        aVar.f9044b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1279a.f27496n);
        aVar.f9043a = obtainStyledAttributes.getInt(0, 0);
        aVar.f9044b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        a aVar = new a(-1, -1);
        aVar.f9043a = 0;
        aVar.f9044b = 0.5f;
        return aVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = new a(layoutParams);
        aVar.f9043a = 0;
        aVar.f9044b = 0.5f;
        return aVar;
    }
}
