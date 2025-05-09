package M2;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import java.util.WeakHashMap;
import k0.C0913a;
import m.c0;
import u2.C1512a;
import y0.C1596C;
import y0.E;
import y2.C1611a;
import z0.C1638d;

/* compiled from: NavigationBarItemView.java */
/* loaded from: classes.dex */
public abstract class a extends FrameLayout implements k.a {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f2527G = {R.attr.state_checked};

    /* renamed from: H, reason: collision with root package name */
    public static final c f2528H = new c();

    /* renamed from: I, reason: collision with root package name */
    public static final d f2529I = new d();

    /* renamed from: A, reason: collision with root package name */
    public boolean f2530A;

    /* renamed from: B, reason: collision with root package name */
    public int f2531B;

    /* renamed from: C, reason: collision with root package name */
    public int f2532C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2533D;

    /* renamed from: E, reason: collision with root package name */
    public int f2534E;

    /* renamed from: F, reason: collision with root package name */
    public com.google.android.material.badge.a f2535F;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2536a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f2537b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f2538c;

    /* renamed from: d, reason: collision with root package name */
    public int f2539d;

    /* renamed from: e, reason: collision with root package name */
    public int f2540e;

    /* renamed from: f, reason: collision with root package name */
    public int f2541f;

    /* renamed from: g, reason: collision with root package name */
    public float f2542g;

    /* renamed from: h, reason: collision with root package name */
    public float f2543h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f2544j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2545k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f2546l;

    /* renamed from: m, reason: collision with root package name */
    public final View f2547m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f2548n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewGroup f2549o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f2550p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f2551q;

    /* renamed from: r, reason: collision with root package name */
    public int f2552r;

    /* renamed from: s, reason: collision with root package name */
    public int f2553s;

    /* renamed from: t, reason: collision with root package name */
    public h f2554t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2555u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f2556v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f2557w;

    /* renamed from: x, reason: collision with root package name */
    public ValueAnimator f2558x;

    /* renamed from: y, reason: collision with root package name */
    public c f2559y;

    /* renamed from: z, reason: collision with root package name */
    public float f2560z;

    /* compiled from: NavigationBarItemView.java */
    /* renamed from: M2.a$a, reason: collision with other inner class name */
    public class ViewOnLayoutChangeListenerC0034a implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f2561a;

        public ViewOnLayoutChangeListenerC0034a(C1611a c1611a) {
            this.f2561a = c1611a;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            com.google.android.material.badge.a aVar;
            a aVar2 = this.f2561a;
            if (aVar2.f2548n.getVisibility() != 0 || (aVar = aVar2.f2535F) == null) {
                return;
            }
            Rect rect = new Rect();
            ImageView imageView = aVar2.f2548n;
            imageView.getDrawingRect(rect);
            aVar.setBounds(rect);
            aVar.i(imageView, null);
        }
    }

    /* compiled from: NavigationBarItemView.java */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f2562a;

        public b(int i) {
            this.f2562a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.i(this.f2562a);
        }
    }

    /* compiled from: NavigationBarItemView.java */
    public static class c {
        public float a(float f10, float f11) {
            return 1.0f;
        }
    }

    /* compiled from: NavigationBarItemView.java */
    public static class d extends c {
        @Override // M2.a.c
        public final float a(float f10, float f11) {
            return C1512a.a(0.4f, 1.0f, f10);
        }
    }

    public a(Context context) {
        super(context);
        this.f2536a = false;
        this.f2552r = -1;
        this.f2553s = 0;
        this.f2559y = f2528H;
        this.f2560z = 0.0f;
        this.f2530A = false;
        this.f2531B = 0;
        this.f2532C = 0;
        this.f2533D = false;
        this.f2534E = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f2546l = (FrameLayout) findViewById(com.luminary.mobile.R.id.navigation_bar_item_icon_container);
        this.f2547m = findViewById(com.luminary.mobile.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.luminary.mobile.R.id.navigation_bar_item_icon_view);
        this.f2548n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.luminary.mobile.R.id.navigation_bar_item_labels_group);
        this.f2549o = viewGroup;
        TextView textView = (TextView) findViewById(com.luminary.mobile.R.id.navigation_bar_item_small_label_view);
        this.f2550p = textView;
        TextView textView2 = (TextView) findViewById(com.luminary.mobile.R.id.navigation_bar_item_large_label_view);
        this.f2551q = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f2539d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f2540e = viewGroup.getPaddingBottom();
        this.f2541f = getResources().getDimensionPixelSize(com.luminary.mobile.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0034a((C1611a) this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = r1
            goto L4c
        Lc:
            int[] r2 = t2.C1279a.f27483Q
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
            goto La
        L21:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L3e
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4c
        L3e:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4c:
            if (r5 == 0) goto L52
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.a.f(android.widget.TextView, int):void");
    }

    public static void g(TextView textView, float f10, float f11, int i) {
        textView.setScaleX(f10);
        textView.setScaleY(f11);
        textView.setVisibility(i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f2546l;
        return frameLayout != null ? frameLayout : this.f2548n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i9 = 0; i9 < indexOfChild; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        com.google.android.material.badge.a aVar = this.f2535F;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f2535F.f9098e.f9056b.f9090w.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f2548n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i, int i9) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i9;
        view.setLayoutParams(layoutParams);
    }

    public static void j(ViewGroup viewGroup, int i) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i);
    }

    public final void a(float f10, float f11) {
        this.f2542g = f10 - f11;
        this.f2543h = (f11 * 1.0f) / f10;
        this.i = (f10 * 1.0f) / f11;
    }

    public final void b() {
        h hVar = this.f2554t;
        if (hVar != null) {
            setChecked(hVar.isChecked());
        }
    }

    public final void c() {
        Drawable drawable = this.f2538c;
        ColorStateList colorStateList = this.f2537b;
        FrameLayout frameLayout = this.f2546l;
        RippleDrawable rippleDrawable = null;
        boolean z10 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f2530A && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(Q2.a.c(this.f2537b), null, activeIndicatorDrawable);
                z10 = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(Q2.a.a(this.f2537b), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable);
        }
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        setBackground(drawable);
        setDefaultFocusHighlightEnabled(z10);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void d(h hVar) {
        this.f2554t = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.f4779e);
        setId(hVar.f4775a);
        if (!TextUtils.isEmpty(hVar.f4790q)) {
            setContentDescription(hVar.f4790q);
        }
        c0.a(this, !TextUtils.isEmpty(hVar.f4791r) ? hVar.f4791r : hVar.f4779e);
        setVisibility(hVar.isVisible() ? 0 : 8);
        this.f2536a = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f2546l;
        if (frameLayout != null && this.f2530A) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f10, float f11) {
        View view = this.f2547m;
        if (view != null) {
            c cVar = this.f2559y;
            cVar.getClass();
            view.setScaleX(C1512a.a(0.4f, 1.0f, f10));
            view.setScaleY(cVar.a(f10, f11));
            view.setAlpha(C1512a.b(0.0f, 1.0f, f11 == 0.0f ? 0.8f : 0.0f, f11 == 0.0f ? 1.0f : 0.2f, f10));
        }
        this.f2560z = f10;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f2547m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public com.google.android.material.badge.a getBadge() {
        return this.f2535F;
    }

    public int getItemBackgroundResId() {
        return com.luminary.mobile.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f2554t;
    }

    public int getItemDefaultMarginResId() {
        return com.luminary.mobile.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f2552r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f2549o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f2541f : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f2549o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(int i) {
        View view = this.f2547m;
        if (view == null || i <= 0) {
            return;
        }
        int min = Math.min(this.f2531B, i - (this.f2534E * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f2533D && this.f2544j == 2) ? min : this.f2532C;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.f2554t;
        if (hVar != null && hVar.isCheckable() && this.f2554t.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2527G);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.material.badge.a aVar = this.f2535F;
        if (aVar != null && aVar.isVisible()) {
            h hVar = this.f2554t;
            CharSequence charSequence = hVar.f4779e;
            if (!TextUtils.isEmpty(hVar.f4790q)) {
                charSequence = this.f2554t.f4790q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f2535F.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C1638d.f.a(0, 1, getItemVisiblePosition(), 1, isSelected()).f31234a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C1638d.a.f31222e.f31229a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.luminary.mobile.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i9, int i10, int i11) {
        super.onSizeChanged(i, i9, i10, i11);
        post(new b(i));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f2547m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        c();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f2530A = z10;
        c();
        View view = this.f2547m;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f2532C = i;
        i(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f2541f != i) {
            this.f2541f = i;
            b();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f2534E = i;
        i(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f2533D = z10;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f2531B = i;
        i(getWidth());
    }

    public void setBadge(com.google.android.material.badge.a aVar) {
        com.google.android.material.badge.a aVar2 = this.f2535F;
        if (aVar2 == aVar) {
            return;
        }
        boolean z10 = aVar2 != null;
        ImageView imageView = this.f2548n;
        if (z10 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f2535F != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.a aVar3 = this.f2535F;
                if (aVar3 != null) {
                    if (aVar3.d() != null) {
                        aVar3.d().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.f2535F = null;
            }
        }
        this.f2535F = aVar;
        if (imageView == null || aVar == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        com.google.android.material.badge.a aVar4 = this.f2535F;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar4.setBounds(rect);
        aVar4.i(imageView, null);
        if (aVar4.d() != null) {
            aVar4.d().setForeground(aVar4);
        } else {
            imageView.getOverlay().add(aVar4);
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.a.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f2550p.setEnabled(z10);
        this.f2551q.setEnabled(z10);
        this.f2548n.setEnabled(z10);
        if (!z10) {
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            C1596C.f.a(this, null);
        } else {
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            WeakHashMap<View, E> weakHashMap2 = C1596C.f30963a;
            C1596C.f.a(this, systemIcon);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f2556v) {
            return;
        }
        this.f2556v = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f2557w = drawable;
            ColorStateList colorStateList = this.f2555u;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f2548n.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f2548n;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f2555u = colorStateList;
        if (this.f2554t == null || (drawable = this.f2557w) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f2557w.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C0913a.getDrawable(getContext(), i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.f2540e != i) {
            this.f2540e = i;
            b();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f2539d != i) {
            this.f2539d = i;
            b();
        }
    }

    public void setItemPosition(int i) {
        this.f2552r = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f2537b = colorStateList;
        c();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f2544j != i) {
            this.f2544j = i;
            if (this.f2533D && i == 2) {
                this.f2559y = f2529I;
            } else {
                this.f2559y = f2528H;
            }
            i(getWidth());
            b();
        }
    }

    public void setShifting(boolean z10) {
        if (this.f2545k != z10) {
            this.f2545k = z10;
            b();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.f2553s = i;
        TextView textView = this.f2551q;
        f(textView, i);
        a(this.f2550p.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z10) {
        setTextAppearanceActive(this.f2553s);
        TextView textView = this.f2551q;
        textView.setTypeface(textView.getTypeface(), z10 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.f2550p;
        f(textView, i);
        a(textView.getTextSize(), this.f2551q.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f2550p.setTextColor(colorStateList);
            this.f2551q.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f2550p.setText(charSequence);
        this.f2551q.setText(charSequence);
        h hVar = this.f2554t;
        if (hVar == null || TextUtils.isEmpty(hVar.f4790q)) {
            setContentDescription(charSequence);
        }
        h hVar2 = this.f2554t;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.f4791r)) {
            charSequence = this.f2554t.f4791r;
        }
        c0.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f2538c = drawable;
        c();
    }
}
