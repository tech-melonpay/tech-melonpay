package com.google.android.material.snackbar;

import C.N;
import J2.k;
import T2.i;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.u;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.g;
import com.luminary.mobile.R;
import java.util.List;
import java.util.WeakHashMap;
import t2.C1279a;
import u2.C1512a;
import y0.C1596C;
import y0.E;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a, reason: collision with root package name */
    public final int f9743a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9744b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9745c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f9746d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f9747e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f9748f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f9749g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f9750h;
    public final e i;

    /* renamed from: j, reason: collision with root package name */
    public final V2.c f9751j;

    /* renamed from: k, reason: collision with root package name */
    public int f9752k;

    /* renamed from: m, reason: collision with root package name */
    public int f9754m;

    /* renamed from: n, reason: collision with root package name */
    public int f9755n;

    /* renamed from: o, reason: collision with root package name */
    public int f9756o;

    /* renamed from: p, reason: collision with root package name */
    public int f9757p;

    /* renamed from: q, reason: collision with root package name */
    public int f9758q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9759r;

    /* renamed from: s, reason: collision with root package name */
    public final AccessibilityManager f9760s;

    /* renamed from: u, reason: collision with root package name */
    public static final P0.a f9737u = C1512a.f30142b;

    /* renamed from: v, reason: collision with root package name */
    public static final LinearInterpolator f9738v = C1512a.f30141a;

    /* renamed from: w, reason: collision with root package name */
    public static final P0.a f9739w = C1512a.f30144d;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f9741y = {R.attr.snackbarStyle};

    /* renamed from: z, reason: collision with root package name */
    public static final String f9742z = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: x, reason: collision with root package name */
    public static final Handler f9740x = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: l, reason: collision with root package name */
    public final b f9753l = new b();

    /* renamed from: t, reason: collision with root package name */
    public final c f9761t = new c();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k, reason: collision with root package name */
        public final d f9762k;

        public Behavior() {
            d dVar = new d();
            this.f9120h = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            this.i = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            this.f9118f = 0;
            this.f9762k = dVar;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean a(View view) {
            this.f9762k.getClass();
            return view instanceof e;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            d dVar = this.f9762k;
            dVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    g.b().e(dVar.f9765a);
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                g.b().d(dVar.f9765a);
            }
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i = message.what;
            if (i == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                e eVar = baseTransientBottomBar.i;
                if (eVar.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = eVar.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
                        Behavior behavior = new Behavior();
                        d dVar = behavior.f9762k;
                        dVar.getClass();
                        dVar.f9765a = baseTransientBottomBar.f9761t;
                        behavior.f9115c = new com.google.android.material.snackbar.e(baseTransientBottomBar);
                        fVar.b(behavior);
                        fVar.f6461g = 80;
                    }
                    eVar.f9776k = true;
                    baseTransientBottomBar.f9749g.addView(eVar);
                    eVar.f9776k = false;
                    baseTransientBottomBar.f();
                    eVar.setVisibility(4);
                }
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                if (eVar.isLaidOut()) {
                    baseTransientBottomBar.e();
                } else {
                    baseTransientBottomBar.f9759r = true;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            int i9 = message.arg1;
            AccessibilityManager accessibilityManager = baseTransientBottomBar2.f9760s;
            if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                e eVar2 = baseTransientBottomBar2.i;
                if (eVar2.getVisibility() == 0) {
                    if (eVar2.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.setInterpolator(baseTransientBottomBar2.f9746d);
                        ofFloat.addUpdateListener(new com.google.android.material.snackbar.a(baseTransientBottomBar2));
                        ofFloat.setDuration(baseTransientBottomBar2.f9744b);
                        ofFloat.addListener(new V2.a(baseTransientBottomBar2, i9, 0));
                        ofFloat.start();
                    } else {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        int height = eVar2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = eVar2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        valueAnimator.setIntValues(0, height);
                        valueAnimator.setInterpolator(baseTransientBottomBar2.f9747e);
                        valueAnimator.setDuration(baseTransientBottomBar2.f9745c);
                        valueAnimator.addListener(new V2.a(baseTransientBottomBar2, i9, 2));
                        valueAnimator.addUpdateListener(new com.google.android.material.snackbar.d(baseTransientBottomBar2));
                        valueAnimator.start();
                    }
                    return true;
                }
            }
            baseTransientBottomBar2.c();
            return true;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            Rect rect;
            WindowMetrics currentWindowMetrics;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.i == null || (context = baseTransientBottomBar.f9750h) == null) {
                return;
            }
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                rect = currentWindowMetrics.getBounds();
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect();
                rect.right = point.x;
                rect.bottom = point.y;
            }
            int height = rect.height();
            int[] iArr = new int[2];
            e eVar = baseTransientBottomBar.i;
            eVar.getLocationInWindow(iArr);
            int height2 = (height - (eVar.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.i.getTranslationY());
            int i = baseTransientBottomBar.f9757p;
            if (height2 >= i) {
                baseTransientBottomBar.f9758q = i;
                return;
            }
            ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f9742z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            int i9 = baseTransientBottomBar.f9757p;
            baseTransientBottomBar.f9758q = i9;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (i9 - height2) + marginLayoutParams.bottomMargin;
            baseTransientBottomBar.i.requestLayout();
        }
    }

    public class c implements g.b {
        public c() {
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void a() {
            Handler handler = BaseTransientBottomBar.f9740x;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void b(int i) {
            Handler handler = BaseTransientBottomBar.f9740x;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public c f9765a;
    }

    public static class e extends FrameLayout {

        /* renamed from: l, reason: collision with root package name */
        public static final a f9766l = new a();

        /* renamed from: a, reason: collision with root package name */
        public BaseTransientBottomBar<?> f9767a;

        /* renamed from: b, reason: collision with root package name */
        public final i f9768b;

        /* renamed from: c, reason: collision with root package name */
        public int f9769c;

        /* renamed from: d, reason: collision with root package name */
        public final float f9770d;

        /* renamed from: e, reason: collision with root package name */
        public final float f9771e;

        /* renamed from: f, reason: collision with root package name */
        public final int f9772f;

        /* renamed from: g, reason: collision with root package name */
        public final int f9773g;

        /* renamed from: h, reason: collision with root package name */
        public ColorStateList f9774h;
        public PorterDuff.Mode i;

        /* renamed from: j, reason: collision with root package name */
        public Rect f9775j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f9776k;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(Context context, AttributeSet attributeSet) {
            super(Y2.a.a(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C1279a.f27480N);
            if (obtainStyledAttributes.hasValue(6)) {
                float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
                WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
                C1596C.d.l(this, dimensionPixelSize);
            }
            this.f9769c = obtainStyledAttributes.getInt(2, 0);
            if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
                this.f9768b = i.b(context2, attributeSet, 0, 0).a();
            }
            this.f9770d = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(P2.c.b(obtainStyledAttributes, context2, 4));
            setBackgroundTintMode(k.d(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f9771e = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f9772f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f9773g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f9766l);
            setFocusable(true);
            if (getBackground() == null) {
                int n02 = D9.b.n0(D9.b.x(R.attr.colorSurface, this), getBackgroundOverlayColorAlpha(), D9.b.x(R.attr.colorOnSurface, this));
                i iVar = this.f9768b;
                if (iVar != null) {
                    P0.a aVar = BaseTransientBottomBar.f9737u;
                    T2.f fVar = new T2.f(iVar);
                    fVar.o(ColorStateList.valueOf(n02));
                    gradientDrawable = fVar;
                } else {
                    Resources resources = getResources();
                    P0.a aVar2 = BaseTransientBottomBar.f9737u;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(n02);
                    gradientDrawable = gradientDrawable2;
                }
                ColorStateList colorStateList = this.f9774h;
                if (colorStateList != null) {
                    gradientDrawable.setTintList(colorStateList);
                }
                WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
                setBackground(gradientDrawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f9767a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f9771e;
        }

        public int getAnimationMode() {
            return this.f9769c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f9770d;
        }

        public int getMaxInlineActionWidth() {
            return this.f9773g;
        }

        public int getMaxWidth() {
            return this.f9772f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            Insets mandatorySystemGestureInsets;
            int i;
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f9767a;
            if (baseTransientBottomBar != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets rootWindowInsets = baseTransientBottomBar.i.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                        i = mandatorySystemGestureInsets.bottom;
                        baseTransientBottomBar.f9757p = i;
                        baseTransientBottomBar.f();
                    }
                } else {
                    baseTransientBottomBar.getClass();
                }
            }
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.c.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z10;
            g.c cVar;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f9767a;
            if (baseTransientBottomBar != null) {
                g b9 = g.b();
                c cVar2 = baseTransientBottomBar.f9761t;
                synchronized (b9.f9791a) {
                    z10 = b9.c(cVar2) || !((cVar = b9.f9794d) == null || cVar2 == null || cVar.f9796a.get() != cVar2);
                }
                if (z10) {
                    BaseTransientBottomBar.f9740x.post(new E1.a(baseTransientBottomBar, 1));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
            super.onLayout(z10, i, i9, i10, i11);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f9767a;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.f9759r) {
                return;
            }
            baseTransientBottomBar.e();
            baseTransientBottomBar.f9759r = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i9) {
            super.onMeasure(i, i9);
            int i10 = this.f9772f;
            if (i10 <= 0 || getMeasuredWidth() <= i10) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), i9);
        }

        public void setAnimationMode(int i) {
            this.f9769c = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f9774h != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.f9774h);
                drawable.setTintMode(this.i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f9774h = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintList(colorStateList);
                mutate.setTintMode(this.i);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.i = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintMode(mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f9776k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f9775j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f9767a;
            if (baseTransientBottomBar != null) {
                P0.a aVar = BaseTransientBottomBar.f9737u;
                baseTransientBottomBar.f();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f9766l);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        int i = 0;
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f9749g = viewGroup;
        this.f9751j = snackbarContentLayout2;
        this.f9750h = context;
        J2.i.c(context, J2.i.f2134a, "Theme.AppCompat");
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f9741y);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        e eVar = (e) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = eVar;
        eVar.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = eVar.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f9781b.setTextColor(D9.b.n0(D9.b.x(R.attr.colorSurface, snackbarContentLayout), actionTextColorAlpha, snackbarContentLayout.f9781b.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(eVar.getMaxInlineActionWidth());
        eVar.addView(snackbarContentLayout);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        eVar.setAccessibilityLiveRegion(1);
        eVar.setImportantForAccessibility(1);
        eVar.setFitsSystemWindows(true);
        C1596C.d.m(eVar, new N(this, 7));
        C1596C.o(eVar, new V2.b(this, i));
        this.f9760s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f9745c = L2.k.c(context, R.attr.motionDurationLong2, u.d.DEFAULT_SWIPE_ANIMATION_DURATION);
        this.f9743a = L2.k.c(context, R.attr.motionDurationLong2, 150);
        this.f9744b = L2.k.c(context, R.attr.motionDurationMedium1, 75);
        this.f9746d = L2.k.d(context, R.attr.motionEasingEmphasizedInterpolator, f9738v);
        this.f9748f = L2.k.d(context, R.attr.motionEasingEmphasizedInterpolator, f9739w);
        this.f9747e = L2.k.d(context, R.attr.motionEasingEmphasizedInterpolator, f9737u);
    }

    public void a() {
        b(3);
    }

    public final void b(int i) {
        g b9 = g.b();
        c cVar = this.f9761t;
        synchronized (b9.f9791a) {
            try {
                if (b9.c(cVar)) {
                    b9.a(b9.f9793c, i);
                } else {
                    g.c cVar2 = b9.f9794d;
                    if (cVar2 != null && cVar != null && cVar2.f9796a.get() == cVar) {
                        b9.a(b9.f9794d, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        g b9 = g.b();
        c cVar = this.f9761t;
        synchronized (b9.f9791a) {
            try {
                if (b9.c(cVar)) {
                    b9.f9793c = null;
                    g.c cVar2 = b9.f9794d;
                    if (cVar2 != null && cVar2 != null) {
                        b9.f9793c = cVar2;
                        b9.f9794d = null;
                        g.b bVar = cVar2.f9796a.get();
                        if (bVar != null) {
                            bVar.a();
                        } else {
                            b9.f9793c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void d() {
        g b9 = g.b();
        c cVar = this.f9761t;
        synchronized (b9.f9791a) {
            try {
                if (b9.c(cVar)) {
                    b9.f(b9.f9793c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z10 = true;
        AccessibilityManager accessibilityManager = this.f9760s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z10 = false;
        }
        e eVar = this.i;
        if (z10) {
            eVar.post(new f(this));
            return;
        }
        if (eVar.getParent() != null) {
            eVar.setVisibility(0);
        }
        d();
    }

    public final void f() {
        e eVar = this.i;
        ViewGroup.LayoutParams layoutParams = eVar.getLayoutParams();
        boolean z10 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f9742z;
        if (!z10) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (eVar.f9775j == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (eVar.getParent() == null) {
            return;
        }
        int i = this.f9754m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = eVar.f9775j;
        int i9 = rect.bottom + i;
        int i10 = rect.left + this.f9755n;
        int i11 = rect.right + this.f9756o;
        int i12 = rect.top;
        boolean z11 = (marginLayoutParams.bottomMargin == i9 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11 && marginLayoutParams.topMargin == i12) ? false : true;
        if (z11) {
            marginLayoutParams.bottomMargin = i9;
            marginLayoutParams.leftMargin = i10;
            marginLayoutParams.rightMargin = i11;
            marginLayoutParams.topMargin = i12;
            eVar.requestLayout();
        }
        if ((z11 || this.f9758q != this.f9757p) && Build.VERSION.SDK_INT >= 29 && this.f9757p > 0) {
            ViewGroup.LayoutParams layoutParams2 = eVar.getLayoutParams();
            if ((layoutParams2 instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams2).f6455a instanceof SwipeDismissBehavior)) {
                b bVar = this.f9753l;
                eVar.removeCallbacks(bVar);
                eVar.post(bVar);
            }
        }
    }
}
