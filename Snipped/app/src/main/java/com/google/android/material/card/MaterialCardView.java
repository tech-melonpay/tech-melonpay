package com.google.android.material.card;

import A2.c;
import T2.f;
import T2.i;
import T2.m;
import U4.b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import k0.C0913a;

/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, m {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.cardview.widget.CardView";
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_END = 8388693;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_START = 8388691;
    public static final int CHECKED_ICON_GRAVITY_TOP_END = 8388661;
    public static final int CHECKED_ICON_GRAVITY_TOP_START = 8388659;
    private static final String LOG_TAG = "MaterialCardView";
    private final c cardViewHelper;
    private boolean checked;
    private boolean dragged;
    private boolean isParentCardViewDoneInitializing;
    private a onCheckedChangeListener;
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DRAGGED_STATE_SET = {com.luminary.mobile.R.attr.state_dragged};
    private static final int DEF_STYLE_RES = 2132083857;

    public interface a {
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private void forceRippleRedrawIfNeeded() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (cVar = this.cardViewHelper).f50o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        cVar.f50o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        cVar.f50o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.cardViewHelper.f39c.getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.cardViewHelper.f39c.f3448a.f3473c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.cardViewHelper.f40d.f3448a.f3473c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.cardViewHelper.f45j;
    }

    public int getCheckedIconGravity() {
        return this.cardViewHelper.f43g;
    }

    public int getCheckedIconMargin() {
        return this.cardViewHelper.f41e;
    }

    public int getCheckedIconSize() {
        return this.cardViewHelper.f42f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.cardViewHelper.f47l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.cardViewHelper.f38b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.cardViewHelper.f38b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.cardViewHelper.f38b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.cardViewHelper.f38b.top;
    }

    public float getProgress() {
        return this.cardViewHelper.f39c.f3448a.f3479j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.cardViewHelper.f39c.i();
    }

    public ColorStateList getRippleColor() {
        return this.cardViewHelper.f46k;
    }

    public i getShapeAppearanceModel() {
        return this.cardViewHelper.f48m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.cardViewHelper.f49n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.cardViewHelper.f49n;
    }

    public int getStrokeWidth() {
        return this.cardViewHelper.f44h;
    }

    public boolean isCheckable() {
        c cVar = this.cardViewHelper;
        return cVar != null && cVar.f54s;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isDragged() {
        return this.dragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cardViewHelper.k();
        Ja.a.y(this, this.cardViewHelper.f39c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        if (isDragged()) {
            View.mergeDrawableStates(onCreateDrawableState, DRAGGED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        this.cardViewHelper.e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAncestorContentPadding(int i, int i9, int i10, int i11) {
        super.setContentPadding(i, i9, i10, i11);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.isParentCardViewDoneInitializing) {
            if (!this.cardViewHelper.f53r) {
                Log.i(LOG_TAG, "Setting a custom background is not supported.");
                this.cardViewHelper.f53r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        c cVar = this.cardViewHelper;
        cVar.f39c.o(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        c cVar = this.cardViewHelper;
        cVar.f39c.n(cVar.f37a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        f fVar = this.cardViewHelper.f40d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        fVar.o(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.cardViewHelper.f54s = z10;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.checked != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.cardViewHelper.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        c cVar = this.cardViewHelper;
        if (cVar.f43g != i) {
            cVar.f43g = i;
            MaterialCardView materialCardView = cVar.f37a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.cardViewHelper.f41e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.cardViewHelper.f41e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.cardViewHelper.g(b.j(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.cardViewHelper.f42f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.cardViewHelper.f42f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.cardViewHelper;
        cVar.f47l = colorStateList;
        Drawable drawable = cVar.f45j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        c cVar = this.cardViewHelper;
        if (cVar != null) {
            cVar.k();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i9, int i10, int i11) {
        c cVar = this.cardViewHelper;
        cVar.f38b.set(i, i9, i10, i11);
        cVar.l();
    }

    public void setDragged(boolean z10) {
        if (this.dragged != z10) {
            this.dragged = z10;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.cardViewHelper.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        this.cardViewHelper.m();
        this.cardViewHelper.l();
    }

    public void setProgress(float f10) {
        c cVar = this.cardViewHelper;
        cVar.f39c.p(f10);
        f fVar = cVar.f40d;
        if (fVar != null) {
            fVar.p(f10);
        }
        f fVar2 = cVar.f52q;
        if (fVar2 != null) {
            fVar2.p(f10);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        c cVar = this.cardViewHelper;
        i.a e10 = cVar.f48m.e();
        e10.c(f10);
        cVar.h(e10.a());
        cVar.i.invalidateSelf();
        if (cVar.i() || (cVar.f37a.getPreventCornerOverlap() && !cVar.f39c.l())) {
            cVar.l();
        }
        if (cVar.i()) {
            cVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.cardViewHelper;
        cVar.f46k = colorStateList;
        int[] iArr = Q2.a.f3179a;
        RippleDrawable rippleDrawable = cVar.f50o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        c cVar = this.cardViewHelper;
        ColorStateList colorStateList = C0913a.getColorStateList(getContext(), i);
        cVar.f46k = colorStateList;
        int[] iArr = Q2.a.f3179a;
        RippleDrawable rippleDrawable = cVar.f50o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // T2.m
    public void setShapeAppearanceModel(i iVar) {
        setClipToOutline(iVar.d(getBoundsAsRectF()));
        this.cardViewHelper.h(iVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        c cVar = this.cardViewHelper;
        if (i != cVar.f44h) {
            cVar.f44h = i;
            f fVar = cVar.f40d;
            ColorStateList colorStateList = cVar.f49n;
            fVar.s(i);
            fVar.r(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        this.cardViewHelper.m();
        this.cardViewHelper.l();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.checked = !this.checked;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            this.cardViewHelper.f(this.checked, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.luminary.mobile.R.attr.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.cardViewHelper;
        if (cVar.f49n != colorStateList) {
            cVar.f49n = colorStateList;
            f fVar = cVar.f40d;
            fVar.s(cVar.f44h);
            fVar.r(colorStateList);
        }
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCardView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.card.MaterialCardView.DEF_STYLE_RES
            android.content.Context r9 = Y2.a.a(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            r9 = 0
            r8.checked = r9
            r8.dragged = r9
            r7 = 1
            r8.isParentCardViewDoneInitializing = r7
            android.content.Context r0 = r8.getContext()
            int[] r2 = t2.C1279a.f27507y
            int[] r5 = new int[r9]
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = J2.i.d(r0, r1, r2, r3, r4, r5)
            A2.c r1 = new A2.c
            r1.<init>(r8, r10, r11, r6)
            r8.cardViewHelper = r1
            android.content.res.ColorStateList r10 = super.getCardBackgroundColor()
            T2.f r11 = r1.f39c
            r11.o(r10)
            int r10 = super.getContentPaddingLeft()
            int r2 = super.getContentPaddingTop()
            int r3 = super.getContentPaddingRight()
            int r4 = super.getContentPaddingBottom()
            android.graphics.Rect r5 = r1.f38b
            r5.set(r10, r2, r3, r4)
            r1.l()
            com.google.android.material.card.MaterialCardView r10 = r1.f37a
            android.content.Context r2 = r10.getContext()
            r3 = 11
            android.content.res.ColorStateList r2 = P2.c.b(r0, r2, r3)
            r1.f49n = r2
            if (r2 != 0) goto L5f
            r2 = -1
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.f49n = r2
        L5f:
            r2 = 12
            int r2 = r0.getDimensionPixelSize(r2, r9)
            r1.f44h = r2
            boolean r2 = r0.getBoolean(r9, r9)
            r1.f54s = r2
            r10.setLongClickable(r2)
            android.content.Context r2 = r10.getContext()
            r3 = 6
            android.content.res.ColorStateList r2 = P2.c.b(r0, r2, r3)
            r1.f47l = r2
            android.content.Context r2 = r10.getContext()
            r3 = 2
            android.graphics.drawable.Drawable r2 = P2.c.d(r0, r2, r3)
            r1.g(r2)
            r2 = 5
            int r2 = r0.getDimensionPixelSize(r2, r9)
            r1.f42f = r2
            r2 = 4
            int r2 = r0.getDimensionPixelSize(r2, r9)
            r1.f41e = r2
            r2 = 3
            r3 = 8388661(0x800035, float:1.1755018E-38)
            int r2 = r0.getInteger(r2, r3)
            r1.f43g = r2
            android.content.Context r2 = r10.getContext()
            r3 = 7
            android.content.res.ColorStateList r2 = P2.c.b(r0, r2, r3)
            r1.f46k = r2
            if (r2 != 0) goto Lb9
            r2 = 2130968883(0x7f040133, float:1.7546432E38)
            int r2 = D9.b.x(r2, r10)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.f46k = r2
        Lb9:
            android.content.Context r2 = r10.getContext()
            android.content.res.ColorStateList r2 = P2.c.b(r0, r2, r7)
            T2.f r3 = r1.f40d
            if (r2 != 0) goto Lc9
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r9)
        Lc9:
            r3.o(r2)
            int[] r9 = Q2.a.f3179a
            android.graphics.drawable.RippleDrawable r9 = r1.f50o
            if (r9 == 0) goto Ld7
            android.content.res.ColorStateList r2 = r1.f46k
            r9.setColor(r2)
        Ld7:
            float r9 = r10.getCardElevation()
            r11.n(r9)
            int r9 = r1.f44h
            float r9 = (float) r9
            android.content.res.ColorStateList r2 = r1.f49n
            r3.s(r9)
            r3.r(r2)
            A2.b r9 = r1.d(r11)
            r10.setBackgroundInternal(r9)
            boolean r9 = r1.j()
            if (r9 == 0) goto Lfa
            android.graphics.drawable.LayerDrawable r3 = r1.c()
        Lfa:
            r1.i = r3
            A2.b r9 = r1.d(r3)
            r10.setForeground(r9)
            r0.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.cardViewHelper.f39c.o(colorStateList);
    }

    public void setOnCheckedChangeListener(a aVar) {
    }
}
