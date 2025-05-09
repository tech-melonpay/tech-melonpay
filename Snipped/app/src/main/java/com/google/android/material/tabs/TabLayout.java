package com.google.android.material.tabs;

import J2.k;
import a0.C0506b;
import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import g.C0756a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k0.C0913a;
import m.c0;
import o1.AbstractC1086a;
import t2.C1279a;
import u2.C1512a;
import y0.C1596C;
import y0.E;
import z0.C1638d;

@ViewPager.d
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final x0.e W = new x0.e(16);

    /* renamed from: A, reason: collision with root package name */
    public final int f9803A;

    /* renamed from: B, reason: collision with root package name */
    public int f9804B;

    /* renamed from: C, reason: collision with root package name */
    public int f9805C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9806D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9807E;

    /* renamed from: F, reason: collision with root package name */
    public int f9808F;

    /* renamed from: G, reason: collision with root package name */
    public int f9809G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f9810H;

    /* renamed from: I, reason: collision with root package name */
    public com.google.android.material.tabs.a f9811I;

    /* renamed from: J, reason: collision with root package name */
    public final TimeInterpolator f9812J;

    /* renamed from: K, reason: collision with root package name */
    public c f9813K;

    /* renamed from: L, reason: collision with root package name */
    public final ArrayList<c> f9814L;

    /* renamed from: M, reason: collision with root package name */
    public j f9815M;

    /* renamed from: N, reason: collision with root package name */
    public ValueAnimator f9816N;

    /* renamed from: O, reason: collision with root package name */
    public ViewPager f9817O;

    /* renamed from: P, reason: collision with root package name */
    public AbstractC1086a f9818P;

    /* renamed from: Q, reason: collision with root package name */
    public e f9819Q;
    public h R;
    public b S;
    public boolean T;
    public int U;
    public final C0506b V;

    /* renamed from: a, reason: collision with root package name */
    public int f9820a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<g> f9821b;

    /* renamed from: c, reason: collision with root package name */
    public g f9822c;

    /* renamed from: d, reason: collision with root package name */
    public final f f9823d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9824e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9825f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9826g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9827h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9828j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9829k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f9830l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f9831m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f9832n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f9833o;

    /* renamed from: p, reason: collision with root package name */
    public int f9834p;

    /* renamed from: q, reason: collision with root package name */
    public final PorterDuff.Mode f9835q;

    /* renamed from: r, reason: collision with root package name */
    public final float f9836r;

    /* renamed from: s, reason: collision with root package name */
    public final float f9837s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9838t;

    /* renamed from: u, reason: collision with root package name */
    public int f9839u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9840v;

    /* renamed from: w, reason: collision with root package name */
    public final int f9841w;

    /* renamed from: x, reason: collision with root package name */
    public final int f9842x;

    /* renamed from: y, reason: collision with root package name */
    public final int f9843y;

    /* renamed from: z, reason: collision with root package name */
    public int f9844z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.h {

        /* renamed from: a, reason: collision with root package name */
        public boolean f9846a;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void a(ViewPager viewPager, AbstractC1086a abstractC1086a) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f9817O == viewPager) {
                tabLayout.l(abstractC1086a, this.f9846a);
            }
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void a(T t3);
    }

    public interface d extends c<g> {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            TabLayout.this.j();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            TabLayout.this.j();
        }
    }

    public class f extends LinearLayout {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f9849c = 0;

        /* renamed from: a, reason: collision with root package name */
        public ValueAnimator f9850a;

        public f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a(int i) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.U == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                com.google.android.material.tabs.a aVar = tabLayout.f9811I;
                Drawable drawable = tabLayout.f9833o;
                aVar.getClass();
                RectF a10 = com.google.android.material.tabs.a.a(tabLayout, childAt);
                drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
                tabLayout.f9820a = i;
            }
        }

        public final void b(int i) {
            TabLayout tabLayout = TabLayout.this;
            Rect bounds = tabLayout.f9833o.getBounds();
            tabLayout.f9833o.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void c(View view, View view2, float f10) {
            TabLayout tabLayout = TabLayout.this;
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = tabLayout.f9833o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f9833o.getBounds().bottom);
            } else {
                tabLayout.f9811I.b(tabLayout, view, view2, f10, tabLayout.f9833o);
            }
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            postInvalidateOnAnimation();
        }

        public final void d(int i, int i9, boolean z10) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f9820a == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a(tabLayout.getSelectedTabPosition());
                return;
            }
            tabLayout.f9820a = i;
            com.google.android.material.tabs.b bVar = new com.google.android.material.tabs.b(this, childAt, childAt2);
            if (!z10) {
                this.f9850a.removeAllUpdateListeners();
                this.f9850a.addUpdateListener(bVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9850a = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.f9812J);
            valueAnimator.setDuration(i9);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(bVar);
            valueAnimator.start();
        }

        @Override // android.view.View
        public final void draw(Canvas canvas) {
            int height;
            TabLayout tabLayout = TabLayout.this;
            int height2 = tabLayout.f9833o.getBounds().height();
            if (height2 < 0) {
                height2 = tabLayout.f9833o.getIntrinsicHeight();
            }
            int i = tabLayout.f9804B;
            if (i == 0) {
                height = getHeight() - height2;
                height2 = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    height2 = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
            if (tabLayout.f9833o.getBounds().width() > 0) {
                Rect bounds = tabLayout.f9833o.getBounds();
                tabLayout.f9833o.setBounds(bounds.left, height, bounds.right, height2);
                tabLayout.f9833o.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
            super.onLayout(z10, i, i9, i10, i11);
            ValueAnimator valueAnimator = this.f9850a;
            TabLayout tabLayout = TabLayout.this;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                d(tabLayout.getSelectedTabPosition(), -1, false);
                return;
            }
            if (tabLayout.f9820a == -1) {
                tabLayout.f9820a = tabLayout.getSelectedTabPosition();
            }
            a(tabLayout.f9820a);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i9) {
            super.onMeasure(i, i9);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f9844z == 1 || tabLayout.f9805C == 2) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() == 0) {
                        i10 = Math.max(i10, childAt.getMeasuredWidth());
                    }
                }
                if (i10 <= 0) {
                    return;
                }
                if (i10 * childCount <= getMeasuredWidth() - (((int) k.b(getContext(), 16)) * 2)) {
                    boolean z10 = false;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i12).getLayoutParams();
                        if (layoutParams.width != i10 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i10;
                            layoutParams.weight = 0.0f;
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        return;
                    }
                } else {
                    tabLayout.f9844z = 0;
                    tabLayout.o(false);
                }
                super.onMeasure(i, i9);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f9852a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f9853b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f9854c;

        /* renamed from: e, reason: collision with root package name */
        public View f9856e;

        /* renamed from: g, reason: collision with root package name */
        public TabLayout f9858g;

        /* renamed from: h, reason: collision with root package name */
        public i f9859h;

        /* renamed from: d, reason: collision with root package name */
        public int f9855d = -1;

        /* renamed from: f, reason: collision with root package name */
        public final int f9857f = 1;
        public int i = -1;

        public final void a() {
            TabLayout tabLayout = this.f9858g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.k(this, true);
        }

        public final void b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f9854c) && !TextUtils.isEmpty(charSequence)) {
                this.f9859h.setContentDescription(charSequence);
            }
            this.f9853b = charSequence;
            i iVar = this.f9859h;
            if (iVar != null) {
                iVar.d();
            }
        }
    }

    public static class h implements ViewPager.i {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<TabLayout> f9860a;

        /* renamed from: b, reason: collision with root package name */
        public int f9861b;

        /* renamed from: c, reason: collision with root package name */
        public int f9862c;

        public h(TabLayout tabLayout) {
            this.f9860a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(int i) {
            this.f9861b = this.f9862c;
            this.f9862c = i;
            TabLayout tabLayout = this.f9860a.get();
            if (tabLayout != null) {
                tabLayout.U = this.f9862c;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i) {
            TabLayout tabLayout = this.f9860a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i9 = this.f9862c;
            tabLayout.k(tabLayout.h(i), i9 == 0 || (i9 == 2 && this.f9861b == 0));
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i, float f10) {
            TabLayout tabLayout = this.f9860a.get();
            if (tabLayout != null) {
                int i9 = this.f9862c;
                tabLayout.m(i, f10, i9 != 2 || this.f9861b == 1, (i9 == 2 && this.f9861b == 0) ? false : true, false);
            }
        }
    }

    public final class i extends LinearLayout {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f9863l = 0;

        /* renamed from: a, reason: collision with root package name */
        public g f9864a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f9865b;

        /* renamed from: c, reason: collision with root package name */
        public ImageView f9866c;

        /* renamed from: d, reason: collision with root package name */
        public View f9867d;

        /* renamed from: e, reason: collision with root package name */
        public com.google.android.material.badge.a f9868e;

        /* renamed from: f, reason: collision with root package name */
        public View f9869f;

        /* renamed from: g, reason: collision with root package name */
        public TextView f9870g;

        /* renamed from: h, reason: collision with root package name */
        public ImageView f9871h;
        public Drawable i;

        /* renamed from: j, reason: collision with root package name */
        public int f9872j;

        public i(Context context) {
            super(context);
            this.f9872j = 2;
            e(context);
            int i = TabLayout.this.f9824e;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            setPaddingRelative(i, TabLayout.this.f9825f, TabLayout.this.f9826g, TabLayout.this.f9827h);
            setGravity(17);
            setOrientation(!TabLayout.this.f9806D ? 1 : 0);
            setClickable(true);
            C1596C.f.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
        }

        private com.google.android.material.badge.a getBadge() {
            return this.f9868e;
        }

        private com.google.android.material.badge.a getOrCreateBadge() {
            if (this.f9868e == null) {
                this.f9868e = new com.google.android.material.badge.a(getContext(), null);
            }
            b();
            com.google.android.material.badge.a aVar = this.f9868e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            if (this.f9868e != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f9867d;
                if (view != null) {
                    com.google.android.material.badge.a aVar = this.f9868e;
                    if (aVar != null) {
                        if (aVar.d() != null) {
                            aVar.d().setForeground(null);
                        } else {
                            view.getOverlay().remove(aVar);
                        }
                    }
                    this.f9867d = null;
                }
            }
        }

        public final void b() {
            g gVar;
            g gVar2;
            if (this.f9868e != null) {
                if (this.f9869f != null) {
                    a();
                    return;
                }
                ImageView imageView = this.f9866c;
                if (imageView != null && (gVar2 = this.f9864a) != null && gVar2.f9852a != null) {
                    if (this.f9867d == imageView) {
                        c(imageView);
                        return;
                    }
                    a();
                    ImageView imageView2 = this.f9866c;
                    if (this.f9868e == null || imageView2 == null) {
                        return;
                    }
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    com.google.android.material.badge.a aVar = this.f9868e;
                    Rect rect = new Rect();
                    imageView2.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.i(imageView2, null);
                    if (aVar.d() != null) {
                        aVar.d().setForeground(aVar);
                    } else {
                        imageView2.getOverlay().add(aVar);
                    }
                    this.f9867d = imageView2;
                    return;
                }
                TextView textView = this.f9865b;
                if (textView == null || (gVar = this.f9864a) == null || gVar.f9857f != 1) {
                    a();
                    return;
                }
                if (this.f9867d == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.f9865b;
                if (this.f9868e == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                com.google.android.material.badge.a aVar2 = this.f9868e;
                Rect rect2 = new Rect();
                textView2.getDrawingRect(rect2);
                aVar2.setBounds(rect2);
                aVar2.i(textView2, null);
                if (aVar2.d() != null) {
                    aVar2.d().setForeground(aVar2);
                } else {
                    textView2.getOverlay().add(aVar2);
                }
                this.f9867d = textView2;
            }
        }

        public final void c(View view) {
            com.google.android.material.badge.a aVar = this.f9868e;
            if (aVar == null || view != this.f9867d) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.i(view, null);
        }

        public final void d() {
            boolean z10;
            f();
            g gVar = this.f9864a;
            if (gVar != null) {
                TabLayout tabLayout = gVar.f9858g;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == gVar.f9855d) {
                    z10 = true;
                    setSelected(z10);
                }
            }
            z10 = false;
            setSelected(z10);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.i;
            if (drawable != null && drawable.isStateful() && this.i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$i] */
        public final void e(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i = tabLayout.f9838t;
            if (i != 0) {
                Drawable j10 = U4.b.j(context, i);
                this.i = j10;
                if (j10 != null && j10.isStateful()) {
                    this.i.setState(getDrawableState());
                }
            } else {
                this.i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (tabLayout.f9832n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a10 = Q2.a.a(tabLayout.f9832n);
                boolean z10 = tabLayout.f9810H;
                if (z10) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(a10, gradientDrawable, z10 ? null : gradientDrawable2);
            }
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            setBackground(gradientDrawable);
            tabLayout.invalidate();
        }

        public final void f() {
            int i;
            ViewParent parent;
            g gVar = this.f9864a;
            View view = gVar != null ? gVar.f9856e : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f9869f;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f9869f);
                    }
                    addView(view);
                }
                this.f9869f = view;
                TextView textView = this.f9865b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f9866c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f9866c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.f9870g = textView2;
                if (textView2 != null) {
                    this.f9872j = textView2.getMaxLines();
                }
                this.f9871h = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.f9869f;
                if (view3 != null) {
                    removeView(view3);
                    this.f9869f = null;
                }
                this.f9870g = null;
                this.f9871h = null;
            }
            if (this.f9869f == null) {
                if (this.f9866c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.luminary.mobile.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f9866c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f9865b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.luminary.mobile.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f9865b = textView3;
                    addView(textView3);
                    this.f9872j = this.f9865b.getMaxLines();
                }
                TextView textView4 = this.f9865b;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.i);
                if (!isSelected() || (i = tabLayout.f9829k) == -1) {
                    this.f9865b.setTextAppearance(tabLayout.f9828j);
                } else {
                    this.f9865b.setTextAppearance(i);
                }
                ColorStateList colorStateList = tabLayout.f9830l;
                if (colorStateList != null) {
                    this.f9865b.setTextColor(colorStateList);
                }
                g(this.f9865b, this.f9866c, true);
                b();
                ImageView imageView3 = this.f9866c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, imageView3));
                }
                TextView textView5 = this.f9865b;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new com.google.android.material.tabs.c(this, textView5));
                }
            } else {
                TextView textView6 = this.f9870g;
                if (textView6 != null || this.f9871h != null) {
                    g(textView6, this.f9871h, false);
                }
            }
            if (gVar == null || TextUtils.isEmpty(gVar.f9854c)) {
                return;
            }
            setContentDescription(gVar.f9854c);
        }

        public final void g(TextView textView, ImageView imageView, boolean z10) {
            boolean z11;
            Drawable drawable;
            g gVar = this.f9864a;
            Drawable mutate = (gVar == null || (drawable = gVar.f9852a) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (mutate != null) {
                mutate.setTintList(tabLayout.f9831m);
                PorterDuff.Mode mode = tabLayout.f9835q;
                if (mode != null) {
                    mutate.setTintMode(mode);
                }
            }
            g gVar2 = this.f9864a;
            CharSequence charSequence = gVar2 != null ? gVar2.f9853b : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z12 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                z11 = z12 && this.f9864a.f9857f == 1;
                textView.setText(z12 ? charSequence : null);
                textView.setVisibility(z11 ? 0 : 8);
                if (z12) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int b9 = (z11 && imageView.getVisibility() == 0) ? (int) k.b(getContext(), 8) : 0;
                if (tabLayout.f9806D) {
                    if (b9 != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(b9);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (b9 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b9;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f9864a;
            CharSequence charSequence2 = gVar3 != null ? gVar3.f9854c : null;
            if (!z12) {
                charSequence = charSequence2;
            }
            c0.a(this, charSequence);
        }

        public int getContentHeight() {
            View[] viewArr = {this.f9865b, this.f9866c, this.f9869f};
            int i = 0;
            int i9 = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    i9 = z10 ? Math.min(i9, view.getTop()) : view.getTop();
                    i = z10 ? Math.max(i, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i - i9;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f9865b, this.f9866c, this.f9869f};
            int i = 0;
            int i9 = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    i9 = z10 ? Math.min(i9, view.getLeft()) : view.getLeft();
                    i = z10 ? Math.max(i, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i - i9;
        }

        public g getTab() {
            return this.f9864a;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            com.google.android.material.badge.a aVar = this.f9868e;
            if (aVar != null && aVar.isVisible()) {
                accessibilityNodeInfo.setContentDescription(this.f9868e.c());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C1638d.f.a(0, 1, this.f9864a.f9855d, 1, isSelected()).f31234a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C1638d.a.f31222e.f31229a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.luminary.mobile.R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i9) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(tabLayout.f9839u, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i9);
            if (this.f9865b != null) {
                float f10 = tabLayout.f9836r;
                int i10 = this.f9872j;
                ImageView imageView = this.f9866c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f9865b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = tabLayout.f9837s;
                    }
                } else {
                    i10 = 1;
                }
                float textSize = this.f9865b.getTextSize();
                int lineCount = this.f9865b.getLineCount();
                int maxLines = this.f9865b.getMaxLines();
                if (f10 != textSize || (maxLines >= 0 && i10 != maxLines)) {
                    if (tabLayout.f9805C == 1 && f10 > textSize && lineCount == 1) {
                        Layout layout = this.f9865b.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f10 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.f9865b.setTextSize(0, f10);
                    this.f9865b.setMaxLines(i10);
                    super.onMeasure(i, i9);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f9864a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f9864a.a();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f9865b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f9866c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f9869f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f9864a) {
                this.f9864a = gVar;
                d();
            }
        }
    }

    public static class j implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ViewPager f9874a;

        public j(ViewPager viewPager) {
            this.f9874a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(g gVar) {
            this.f9874a.setCurrentItem(gVar.f9855d);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(Y2.a.a(context, attributeSet, com.luminary.mobile.R.attr.tabStyle, 2132083639), attributeSet, com.luminary.mobile.R.attr.tabStyle);
        this.f9820a = -1;
        this.f9821b = new ArrayList<>();
        this.f9829k = -1;
        this.f9834p = 0;
        this.f9839u = Integer.MAX_VALUE;
        this.f9808F = -1;
        this.f9814L = new ArrayList<>();
        this.V = new C0506b(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f9823d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d10 = J2.i.d(context2, attributeSet, C1279a.f27482P, com.luminary.mobile.R.attr.tabStyle, 2132083639, 24);
        ColorStateList a10 = F2.a.a(getBackground());
        if (a10 != null) {
            T2.f fVar2 = new T2.f();
            fVar2.o(a10);
            fVar2.k(context2);
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            fVar2.n(C1596C.d.e(this));
            setBackground(fVar2);
        }
        setSelectedTabIndicator(P2.c.d(d10, context2, 5));
        setSelectedTabIndicatorColor(d10.getColor(8, 0));
        fVar.b(d10.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d10.getInt(10, 0));
        setTabIndicatorAnimationMode(d10.getInt(7, 0));
        setTabIndicatorFullWidth(d10.getBoolean(9, true));
        int dimensionPixelSize = d10.getDimensionPixelSize(16, 0);
        this.f9827h = dimensionPixelSize;
        this.f9826g = dimensionPixelSize;
        this.f9825f = dimensionPixelSize;
        this.f9824e = dimensionPixelSize;
        this.f9824e = d10.getDimensionPixelSize(19, dimensionPixelSize);
        this.f9825f = d10.getDimensionPixelSize(20, dimensionPixelSize);
        this.f9826g = d10.getDimensionPixelSize(18, dimensionPixelSize);
        this.f9827h = d10.getDimensionPixelSize(17, dimensionPixelSize);
        if (P2.b.b(context2, com.luminary.mobile.R.attr.isMaterial3Theme, false)) {
            this.i = com.luminary.mobile.R.attr.textAppearanceTitleSmall;
        } else {
            this.i = com.luminary.mobile.R.attr.textAppearanceButton;
        }
        int resourceId = d10.getResourceId(24, 2132083252);
        this.f9828j = resourceId;
        int[] iArr = C0756a.f20750w;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f9836r = dimensionPixelSize2;
            this.f9830l = P2.c.b(obtainStyledAttributes, context2, 3);
            obtainStyledAttributes.recycle();
            if (d10.hasValue(22)) {
                this.f9829k = d10.getResourceId(22, resourceId);
            }
            int i9 = this.f9829k;
            if (i9 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i9, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList b9 = P2.c.b(obtainStyledAttributes, context2, 3);
                    if (b9 != null) {
                        this.f9830l = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{b9.getColorForState(new int[]{R.attr.state_selected}, b9.getDefaultColor()), this.f9830l.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (d10.hasValue(25)) {
                this.f9830l = P2.c.b(d10, context2, 25);
            }
            if (d10.hasValue(23)) {
                this.f9830l = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d10.getColor(23, 0), this.f9830l.getDefaultColor()});
            }
            this.f9831m = P2.c.b(d10, context2, 3);
            this.f9835q = k.d(d10.getInt(4, -1), null);
            this.f9832n = P2.c.b(d10, context2, 21);
            this.f9803A = d10.getInt(6, 300);
            this.f9812J = L2.k.d(context2, com.luminary.mobile.R.attr.motionEasingEmphasizedInterpolator, C1512a.f30142b);
            this.f9840v = d10.getDimensionPixelSize(14, -1);
            this.f9841w = d10.getDimensionPixelSize(13, -1);
            this.f9838t = d10.getResourceId(0, 0);
            this.f9843y = d10.getDimensionPixelSize(1, 0);
            this.f9805C = d10.getInt(15, 1);
            this.f9844z = d10.getInt(2, 0);
            this.f9806D = d10.getBoolean(12, false);
            this.f9810H = d10.getBoolean(26, false);
            d10.recycle();
            Resources resources = getResources();
            this.f9837s = resources.getDimensionPixelSize(com.luminary.mobile.R.dimen.design_tab_text_size_2line);
            this.f9842x = resources.getDimensionPixelSize(com.luminary.mobile.R.dimen.design_tab_scrollable_min_width);
            e();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList<g> arrayList = this.f9821b;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            g gVar = arrayList.get(i9);
            if (gVar == null || gVar.f9852a == null || TextUtils.isEmpty(gVar.f9853b)) {
                i9++;
            } else if (!this.f9806D) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i9 = this.f9840v;
        if (i9 != -1) {
            return i9;
        }
        int i10 = this.f9805C;
        if (i10 == 0 || i10 == 2) {
            return this.f9842x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f9823d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i9) {
        f fVar = this.f9823d;
        int childCount = fVar.getChildCount();
        if (i9 < childCount) {
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = fVar.getChildAt(i10);
                if ((i10 != i9 || childAt.isSelected()) && (i10 == i9 || !childAt.isSelected())) {
                    childAt.setSelected(i10 == i9);
                    childAt.setActivated(i10 == i9);
                } else {
                    childAt.setSelected(i10 == i9);
                    childAt.setActivated(i10 == i9);
                    if (childAt instanceof i) {
                        ((i) childAt).f();
                    }
                }
                i10++;
            }
        }
    }

    @Deprecated
    public final void a(c cVar) {
        ArrayList<c> arrayList = this.f9814L;
        if (arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    public final void b(g gVar, boolean z10) {
        ArrayList<g> arrayList = this.f9821b;
        int size = arrayList.size();
        if (gVar.f9858g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        gVar.f9855d = size;
        arrayList.add(size, gVar);
        int size2 = arrayList.size();
        int i9 = -1;
        for (int i10 = size + 1; i10 < size2; i10++) {
            if (arrayList.get(i10).f9855d == this.f9820a) {
                i9 = i10;
            }
            arrayList.get(i10).f9855d = i10;
        }
        this.f9820a = i9;
        i iVar = gVar.f9859h;
        iVar.setSelected(false);
        iVar.setActivated(false);
        int i11 = gVar.f9855d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.f9805C == 1 && this.f9844z == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f9823d.addView(iVar, i11, layoutParams);
        if (z10) {
            gVar.a();
        }
    }

    public final void c(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        g i9 = i();
        CharSequence charSequence = tabItem.f9800a;
        if (charSequence != null) {
            i9.b(charSequence);
        }
        Drawable drawable = tabItem.f9801b;
        if (drawable != null) {
            i9.f9852a = drawable;
            TabLayout tabLayout = i9.f9858g;
            if (tabLayout.f9844z == 1 || tabLayout.f9805C == 2) {
                tabLayout.o(true);
            }
            i iVar = i9.f9859h;
            if (iVar != null) {
                iVar.d();
            }
        }
        int i10 = tabItem.f9802c;
        if (i10 != 0) {
            i9.f9856e = LayoutInflater.from(i9.f9859h.getContext()).inflate(i10, (ViewGroup) i9.f9859h, false);
            i iVar2 = i9.f9859h;
            if (iVar2 != null) {
                iVar2.d();
            }
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            i9.f9854c = tabItem.getContentDescription();
            i iVar3 = i9.f9859h;
            if (iVar3 != null) {
                iVar3.d();
            }
        }
        b(i9, this.f9821b.isEmpty());
    }

    public final void d(int i9) {
        if (i9 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            if (isLaidOut()) {
                f fVar = this.f9823d;
                int childCount = fVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    if (fVar.getChildAt(i10).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int f10 = f(i9, 0.0f);
                if (scrollX != f10) {
                    g();
                    this.f9816N.setIntValues(scrollX, f10);
                    this.f9816N.start();
                }
                ValueAnimator valueAnimator = fVar.f9850a;
                if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f9820a != i9) {
                    fVar.f9850a.cancel();
                }
                fVar.d(i9, this.f9803A, true);
                return;
            }
        }
        m(i9, 0.0f, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r5 = this;
            int r0 = r5.f9805C
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r5.f9843y
            int r3 = r5.f9824e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap<android.view.View, y0.E> r3 = y0.C1596C.f30963a
            com.google.android.material.tabs.TabLayout$f r3 = r5.f9823d
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r5.f9805C
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 == r4) goto L27
            if (r0 == r1) goto L27
            goto L4c
        L27:
            int r0 = r5.f9844z
            if (r0 != r1) goto L30
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L30:
            r3.setGravity(r4)
            goto L4c
        L34:
            int r0 = r5.f9844z
            if (r0 == 0) goto L41
            if (r0 == r4) goto L3d
            if (r0 == r1) goto L46
            goto L4c
        L3d:
            r3.setGravity(r4)
            goto L4c
        L41:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L46:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L4c:
            r5.o(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e():void");
    }

    public final int f(int i9, float f10) {
        f fVar;
        View childAt;
        int i10 = this.f9805C;
        if ((i10 != 0 && i10 != 2) || (childAt = (fVar = this.f9823d).getChildAt(i9)) == null) {
            return 0;
        }
        int i11 = i9 + 1;
        View childAt2 = i11 < fVar.getChildCount() ? fVar.getChildAt(i11) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i12 = (int) ((width + width2) * 0.5f * f10);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        return getLayoutDirection() == 0 ? left + i12 : left - i12;
    }

    public final void g() {
        if (this.f9816N == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9816N = valueAnimator;
            valueAnimator.setInterpolator(this.f9812J);
            this.f9816N.setDuration(this.f9803A);
            this.f9816N.addUpdateListener(new a());
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f9822c;
        if (gVar != null) {
            return gVar.f9855d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f9821b.size();
    }

    public int getTabGravity() {
        return this.f9844z;
    }

    public ColorStateList getTabIconTint() {
        return this.f9831m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f9809G;
    }

    public int getTabIndicatorGravity() {
        return this.f9804B;
    }

    public int getTabMaxWidth() {
        return this.f9839u;
    }

    public int getTabMode() {
        return this.f9805C;
    }

    public ColorStateList getTabRippleColor() {
        return this.f9832n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f9833o;
    }

    public ColorStateList getTabTextColors() {
        return this.f9830l;
    }

    public final g h(int i9) {
        if (i9 < 0 || i9 >= getTabCount()) {
            return null;
        }
        return this.f9821b.get(i9);
    }

    public final g i() {
        g gVar = (g) W.acquire();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.f9858g = this;
        C0506b c0506b = this.V;
        i iVar = c0506b != null ? (i) c0506b.acquire() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f9854c)) {
            iVar.setContentDescription(gVar.f9853b);
        } else {
            iVar.setContentDescription(gVar.f9854c);
        }
        gVar.f9859h = iVar;
        int i9 = gVar.i;
        if (i9 != -1) {
            iVar.setId(i9);
        }
        return gVar;
    }

    public final void j() {
        int currentItem;
        f fVar = this.f9823d;
        for (int childCount = fVar.getChildCount() - 1; childCount >= 0; childCount--) {
            i iVar = (i) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab(null);
                iVar.setSelected(false);
                this.V.release(iVar);
            }
            requestLayout();
        }
        Iterator<g> it = this.f9821b.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f9858g = null;
            next.f9859h = null;
            next.f9852a = null;
            next.i = -1;
            next.f9853b = null;
            next.f9854c = null;
            next.f9855d = -1;
            next.f9856e = null;
            W.release(next);
        }
        this.f9822c = null;
        AbstractC1086a abstractC1086a = this.f9818P;
        if (abstractC1086a != null) {
            int c2 = abstractC1086a.c();
            for (int i9 = 0; i9 < c2; i9++) {
                g i10 = i();
                i10.b(this.f9818P.d(i9));
                b(i10, false);
            }
            ViewPager viewPager = this.f9817O;
            if (viewPager == null || c2 <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            k(h(currentItem), true);
        }
    }

    public final void k(g gVar, boolean z10) {
        g gVar2 = this.f9822c;
        ArrayList<c> arrayList = this.f9814L;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).getClass();
                }
                d(gVar.f9855d);
                return;
            }
            return;
        }
        int i9 = gVar != null ? gVar.f9855d : -1;
        if (z10) {
            if ((gVar2 == null || gVar2.f9855d == -1) && i9 != -1) {
                m(i9, 0.0f, true, true, true);
            } else {
                d(i9);
            }
            if (i9 != -1) {
                setSelectedTabView(i9);
            }
        }
        this.f9822c = gVar;
        if (gVar2 != null && gVar2.f9858g != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).getClass();
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                arrayList.get(size3).a(gVar);
            }
        }
    }

    public final void l(AbstractC1086a abstractC1086a, boolean z10) {
        e eVar;
        AbstractC1086a abstractC1086a2 = this.f9818P;
        if (abstractC1086a2 != null && (eVar = this.f9819Q) != null) {
            abstractC1086a2.f24339a.unregisterObserver(eVar);
        }
        this.f9818P = abstractC1086a;
        if (z10 && abstractC1086a != null) {
            if (this.f9819Q == null) {
                this.f9819Q = new e();
            }
            abstractC1086a.f24339a.registerObserver(this.f9819Q);
        }
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r10 == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r6, float r7, boolean r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            r0 = 1
            float r1 = (float) r6
            float r1 = r1 + r7
            int r2 = java.lang.Math.round(r1)
            if (r2 < 0) goto L9c
            com.google.android.material.tabs.TabLayout$f r3 = r5.f9823d
            int r4 = r3.getChildCount()
            if (r2 < r4) goto L13
            goto L9c
        L13:
            if (r9 == 0) goto L39
            int r9 = java.lang.Math.round(r1)
            com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
            r1.f9820a = r9
            android.animation.ValueAnimator r9 = r3.f9850a
            if (r9 == 0) goto L2c
            boolean r9 = r9.isRunning()
            if (r9 == 0) goto L2c
            android.animation.ValueAnimator r9 = r3.f9850a
            r9.cancel()
        L2c:
            android.view.View r9 = r3.getChildAt(r6)
            int r1 = r6 + 1
            android.view.View r1 = r3.getChildAt(r1)
            r3.c(r9, r1, r7)
        L39:
            android.animation.ValueAnimator r9 = r5.f9816N
            if (r9 == 0) goto L48
            boolean r9 = r9.isRunning()
            if (r9 == 0) goto L48
            android.animation.ValueAnimator r9 = r5.f9816N
            r9.cancel()
        L48:
            int r7 = r5.f(r6, r7)
            int r9 = r5.getScrollX()
            int r1 = r5.getSelectedTabPosition()
            r3 = 0
            if (r6 >= r1) goto L59
            if (r7 >= r9) goto L67
        L59:
            int r1 = r5.getSelectedTabPosition()
            if (r6 <= r1) goto L61
            if (r7 <= r9) goto L67
        L61:
            int r1 = r5.getSelectedTabPosition()
            if (r6 != r1) goto L69
        L67:
            r1 = r0
            goto L6a
        L69:
            r1 = r3
        L6a:
            java.util.WeakHashMap<android.view.View, y0.E> r4 = y0.C1596C.f30963a
            int r4 = r5.getLayoutDirection()
            if (r4 != r0) goto L89
            int r1 = r5.getSelectedTabPosition()
            if (r6 >= r1) goto L7a
            if (r7 <= r9) goto L91
        L7a:
            int r1 = r5.getSelectedTabPosition()
            if (r6 <= r1) goto L82
            if (r7 >= r9) goto L91
        L82:
            int r9 = r5.getSelectedTabPosition()
            if (r6 != r9) goto L8b
            goto L91
        L89:
            if (r1 != 0) goto L91
        L8b:
            int r9 = r5.U
            if (r9 == r0) goto L91
            if (r10 == 0) goto L97
        L91:
            if (r6 >= 0) goto L94
            r7 = r3
        L94:
            r5.scrollTo(r7, r3)
        L97:
            if (r8 == 0) goto L9c
            r5.setSelectedTabView(r2)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.m(int, float, boolean, boolean, boolean):void");
    }

    public final void n(ViewPager viewPager, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f9817O;
        if (viewPager2 != null) {
            h hVar = this.R;
            if (hVar != null && (arrayList2 = viewPager2.R) != null) {
                arrayList2.remove(hVar);
            }
            b bVar = this.S;
            if (bVar != null && (arrayList = this.f9817O.T) != null) {
                arrayList.remove(bVar);
            }
        }
        j jVar = this.f9815M;
        if (jVar != null) {
            this.f9814L.remove(jVar);
            this.f9815M = null;
        }
        if (viewPager != null) {
            this.f9817O = viewPager;
            if (this.R == null) {
                this.R = new h(this);
            }
            h hVar2 = this.R;
            hVar2.f9862c = 0;
            hVar2.f9861b = 0;
            viewPager.b(hVar2);
            j jVar2 = new j(viewPager);
            this.f9815M = jVar2;
            a(jVar2);
            AbstractC1086a adapter = viewPager.getAdapter();
            if (adapter != null) {
                l(adapter, true);
            }
            if (this.S == null) {
                this.S = new b();
            }
            b bVar2 = this.S;
            bVar2.f9846a = true;
            if (viewPager.T == null) {
                viewPager.T = new ArrayList();
            }
            viewPager.T.add(bVar2);
            m(viewPager.getCurrentItem(), 0.0f, true, true, true);
        } else {
            this.f9817O = null;
            l(null, false);
        }
        this.T = z10;
    }

    public final void o(boolean z10) {
        int i9 = 0;
        while (true) {
            f fVar = this.f9823d;
            if (i9 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i9);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.f9805C == 1 && this.f9844z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z10) {
                childAt.requestLayout();
            }
            i9++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Ja.a.x(this);
        if (this.f9817O == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                n((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            setupWithViewPager(null);
            this.T = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i iVar;
        Drawable drawable;
        int i9 = 0;
        while (true) {
            f fVar = this.f9823d;
            if (i9 >= fVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fVar.getChildAt(i9);
            if ((childAt instanceof i) && (drawable = (iVar = (i) childAt).i) != null) {
                drawable.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
                iVar.i.draw(canvas);
            }
            i9++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C1638d.e.a(1, getTabCount(), 1, false).f31233a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int round = Math.round(k.b(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i10) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i9);
        if (View.MeasureSpec.getMode(i9) != 0) {
            int i11 = this.f9841w;
            if (i11 <= 0) {
                i11 = (int) (size - k.b(getContext(), 56));
            }
            this.f9839u = i11;
        }
        super.onMeasure(i9, i10);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.f9805C;
            if (i12 != 0) {
                if (i12 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i12 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Ja.a.w(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f9806D == z10) {
            return;
        }
        this.f9806D = z10;
        int i9 = 0;
        while (true) {
            f fVar = this.f9823d;
            if (i9 >= fVar.getChildCount()) {
                e();
                return;
            }
            View childAt = fVar.getChildAt(i9);
            if (childAt instanceof i) {
                i iVar = (i) childAt;
                iVar.setOrientation(!TabLayout.this.f9806D ? 1 : 0);
                TextView textView = iVar.f9870g;
                if (textView == null && iVar.f9871h == null) {
                    iVar.g(iVar.f9865b, iVar.f9866c, true);
                } else {
                    iVar.g(textView, iVar.f9871h, false);
                }
            }
            i9++;
        }
    }

    public void setInlineLabelResource(int i9) {
        setInlineLabel(getResources().getBoolean(i9));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.f9816N.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.f9833o = mutate;
        int i9 = this.f9834p;
        if (i9 != 0) {
            mutate.setTint(i9);
        } else {
            mutate.setTintList(null);
        }
        int i10 = this.f9808F;
        if (i10 == -1) {
            i10 = this.f9833o.getIntrinsicHeight();
        }
        this.f9823d.b(i10);
    }

    public void setSelectedTabIndicatorColor(int i9) {
        this.f9834p = i9;
        Drawable drawable = this.f9833o;
        if (i9 != 0) {
            drawable.setTint(i9);
        } else {
            drawable.setTintList(null);
        }
        o(false);
    }

    public void setSelectedTabIndicatorGravity(int i9) {
        if (this.f9804B != i9) {
            this.f9804B = i9;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            this.f9823d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i9) {
        this.f9808F = i9;
        this.f9823d.b(i9);
    }

    public void setTabGravity(int i9) {
        if (this.f9844z != i9) {
            this.f9844z = i9;
            e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f9831m != colorStateList) {
            this.f9831m = colorStateList;
            ArrayList<g> arrayList = this.f9821b;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                i iVar = arrayList.get(i9).f9859h;
                if (iVar != null) {
                    iVar.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i9) {
        setTabIconTint(C0913a.getColorStateList(getContext(), i9));
    }

    public void setTabIndicatorAnimationMode(int i9) {
        this.f9809G = i9;
        if (i9 == 0) {
            this.f9811I = new com.google.android.material.tabs.a();
            return;
        }
        if (i9 == 1) {
            this.f9811I = new W2.a(0);
        } else {
            if (i9 == 2) {
                this.f9811I = new W2.a(1);
                return;
            }
            throw new IllegalArgumentException(i9 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f9807E = z10;
        int i9 = f.f9849c;
        f fVar = this.f9823d;
        fVar.a(TabLayout.this.getSelectedTabPosition());
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i9) {
        if (i9 != this.f9805C) {
            this.f9805C = i9;
            e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f9832n == colorStateList) {
            return;
        }
        this.f9832n = colorStateList;
        int i9 = 0;
        while (true) {
            f fVar = this.f9823d;
            if (i9 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i9);
            if (childAt instanceof i) {
                Context context = getContext();
                int i10 = i.f9863l;
                ((i) childAt).e(context);
            }
            i9++;
        }
    }

    public void setTabRippleColorResource(int i9) {
        setTabRippleColor(C0913a.getColorStateList(getContext(), i9));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f9830l != colorStateList) {
            this.f9830l = colorStateList;
            ArrayList<g> arrayList = this.f9821b;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                i iVar = arrayList.get(i9).f9859h;
                if (iVar != null) {
                    iVar.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC1086a abstractC1086a) {
        l(abstractC1086a, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f9810H == z10) {
            return;
        }
        this.f9810H = z10;
        int i9 = 0;
        while (true) {
            f fVar = this.f9823d;
            if (i9 >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i9);
            if (childAt instanceof i) {
                Context context = getContext();
                int i10 = i.f9863l;
                ((i) childAt).e(context);
            }
            i9++;
        }
    }

    public void setUnboundedRippleResource(int i9) {
        setUnboundedRipple(getResources().getBoolean(i9));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        n(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i9) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f9813K;
        if (cVar2 != null) {
            this.f9814L.remove(cVar2);
        }
        this.f9813K = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public void setSelectedTabIndicator(int i9) {
        if (i9 != 0) {
            setSelectedTabIndicator(U4.b.j(getContext(), i9));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
