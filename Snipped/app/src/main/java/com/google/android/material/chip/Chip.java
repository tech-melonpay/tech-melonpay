package com.google.android.material.chip;

import J2.f;
import J2.i;
import J2.k;
import P2.c;
import P2.d;
import T2.m;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import k0.C0913a;
import m.C1004f;
import t2.C1279a;
import u2.C1517f;
import v0.C1538a;
import y0.C1596C;
import y0.E;
import z0.C1638d;

/* loaded from: classes.dex */
public class Chip extends C1004f implements a.InterfaceC0103a, m, Checkable {

    /* renamed from: w, reason: collision with root package name */
    public static final Rect f9287w = new Rect();

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f9288x = {R.attr.state_selected};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f9289y = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.material.chip.a f9290e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f9291f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f9292g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f9293h;
    public CompoundButton.OnCheckedChangeListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9294j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9295k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9296l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9297m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9298n;

    /* renamed from: o, reason: collision with root package name */
    public int f9299o;

    /* renamed from: p, reason: collision with root package name */
    public int f9300p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f9301q;

    /* renamed from: r, reason: collision with root package name */
    public final b f9302r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9303s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f9304t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f9305u;

    /* renamed from: v, reason: collision with root package name */
    public final a f9306v;

    public class b extends E0.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // E0.a
        public final void l(ArrayList arrayList) {
            boolean z10 = false;
            arrayList.add(0);
            Rect rect = Chip.f9287w;
            Chip chip = Chip.this;
            if (chip.d()) {
                com.google.android.material.chip.a aVar = chip.f9290e;
                if (aVar != null && aVar.f9330L) {
                    z10 = true;
                }
                if (!z10 || chip.f9293h == null) {
                    return;
                }
                arrayList.add(1);
            }
        }

        @Override // E0.a
        public final void o(int i, C1638d c1638d) {
            AccessibilityNodeInfo accessibilityNodeInfo = c1638d.f31219a;
            if (i != 1) {
                c1638d.k("");
                accessibilityNodeInfo.setBoundsInParent(Chip.f9287w);
                return;
            }
            Chip chip = Chip.this;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                c1638d.k(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                c1638d.k(chip.getContext().getString(com.luminary.mobile.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            c1638d.b(C1638d.a.f31222e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        super(Y2.a.a(context, attributeSet, com.luminary.mobile.R.attr.chipStyle, 2132083859), attributeSet, com.luminary.mobile.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f9304t = new Rect();
        this.f9305u = new RectF();
        this.f9306v = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet);
        int[] iArr = C1279a.i;
        TypedArray d10 = i.d(aVar.f9342g0, attributeSet, iArr, com.luminary.mobile.R.attr.chipStyle, 2132083859, new int[0]);
        aVar.f9326H0 = d10.hasValue(37);
        Context context3 = aVar.f9342g0;
        ColorStateList b9 = c.b(d10, context3, 24);
        if (aVar.f9359y != b9) {
            aVar.f9359y = b9;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList b10 = c.b(d10, context3, 11);
        if (aVar.f9361z != b10) {
            aVar.f9361z = b10;
            aVar.onStateChange(aVar.getState());
        }
        float dimension = d10.getDimension(19, 0.0f);
        if (aVar.f9311A != dimension) {
            aVar.f9311A = dimension;
            aVar.invalidateSelf();
            aVar.D();
        }
        if (d10.hasValue(12)) {
            aVar.J(d10.getDimension(12, 0.0f));
        }
        aVar.O(c.b(d10, context3, 22));
        aVar.P(d10.getDimension(23, 0.0f));
        aVar.Y(c.b(d10, context3, 36));
        String text = d10.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(aVar.f9321F, text);
        f fVar = aVar.f9348m0;
        if (!equals) {
            aVar.f9321F = text;
            fVar.f2129e = true;
            aVar.invalidateSelf();
            aVar.D();
        }
        d dVar = (!d10.hasValue(0) || (resourceId3 = d10.getResourceId(0, 0)) == 0) ? null : new d(context3, resourceId3);
        dVar.f3061k = d10.getDimension(1, dVar.f3061k);
        fVar.b(dVar, context3);
        int i = d10.getInt(3, 0);
        if (i == 1) {
            aVar.f9320E0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            aVar.f9320E0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            aVar.f9320E0 = TextUtils.TruncateAt.END;
        }
        aVar.N(d10.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.N(d10.getBoolean(15, false));
        }
        aVar.K(c.d(d10, context3, 14));
        if (d10.hasValue(17)) {
            aVar.M(c.b(d10, context3, 17));
        }
        aVar.L(d10.getDimension(16, -1.0f));
        aVar.V(d10.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.V(d10.getBoolean(26, false));
        }
        aVar.Q(c.d(d10, context3, 25));
        aVar.U(c.b(d10, context3, 30));
        aVar.S(d10.getDimension(28, 0.0f));
        aVar.F(d10.getBoolean(6, false));
        aVar.I(d10.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.I(d10.getBoolean(8, false));
        }
        aVar.G(c.d(d10, context3, 7));
        if (d10.hasValue(9)) {
            aVar.H(c.b(d10, context3, 9));
        }
        aVar.V = (!d10.hasValue(39) || (resourceId2 = d10.getResourceId(39, 0)) == 0) ? null : C1517f.a(context3, resourceId2);
        aVar.W = (!d10.hasValue(33) || (resourceId = d10.getResourceId(33, 0)) == 0) ? null : C1517f.a(context3, resourceId);
        float dimension2 = d10.getDimension(21, 0.0f);
        if (aVar.X != dimension2) {
            aVar.X = dimension2;
            aVar.invalidateSelf();
            aVar.D();
        }
        aVar.X(d10.getDimension(35, 0.0f));
        aVar.W(d10.getDimension(34, 0.0f));
        float dimension3 = d10.getDimension(41, 0.0f);
        if (aVar.f9337a0 != dimension3) {
            aVar.f9337a0 = dimension3;
            aVar.invalidateSelf();
            aVar.D();
        }
        float dimension4 = d10.getDimension(40, 0.0f);
        if (aVar.f9338b0 != dimension4) {
            aVar.f9338b0 = dimension4;
            aVar.invalidateSelf();
            aVar.D();
        }
        aVar.T(d10.getDimension(29, 0.0f));
        aVar.R(d10.getDimension(27, 0.0f));
        float dimension5 = d10.getDimension(13, 0.0f);
        if (aVar.f9341f0 != dimension5) {
            aVar.f9341f0 = dimension5;
            aVar.invalidateSelf();
            aVar.D();
        }
        aVar.f9324G0 = d10.getDimensionPixelSize(4, Integer.MAX_VALUE);
        d10.recycle();
        i.a(context2, attributeSet, com.luminary.mobile.R.attr.chipStyle, 2132083859);
        i.b(context2, attributeSet, iArr, com.luminary.mobile.R.attr.chipStyle, 2132083859, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.luminary.mobile.R.attr.chipStyle, 2132083859);
        this.f9298n = obtainStyledAttributes.getBoolean(32, false);
        this.f9300p = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(k.b(getContext(), 48))));
        obtainStyledAttributes.recycle();
        setChipDrawable(aVar);
        aVar.n(C1596C.d.e(this));
        i.a(context2, attributeSet, com.luminary.mobile.R.attr.chipStyle, 2132083859);
        i.b(context2, attributeSet, iArr, com.luminary.mobile.R.attr.chipStyle, 2132083859, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.luminary.mobile.R.attr.chipStyle, 2132083859);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f9302r = new b(this);
        f();
        if (!hasValue) {
            setOutlineProvider(new C2.b(this));
        }
        setChecked(this.f9294j);
        setText(aVar.f9321F);
        setEllipsize(aVar.f9320E0);
        i();
        if (!this.f9290e.f9322F0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        h();
        if (this.f9298n) {
            setMinHeight(this.f9300p);
        }
        this.f9299o = getLayoutDirection();
        super.setOnCheckedChangeListener(new C2.a(this, 0));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f9305u;
        rectF.setEmpty();
        if (d() && this.f9293h != null) {
            com.google.android.material.chip.a aVar = this.f9290e;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.b0()) {
                float f10 = aVar.f9341f0 + aVar.f9340d0 + aVar.f9334P + aVar.f9339c0 + aVar.f9338b0;
                if (aVar.getLayoutDirection() == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i9 = (int) closeIconTouchBounds.top;
        int i10 = (int) closeIconTouchBounds.right;
        int i11 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f9304t;
        rect.set(i, i9, i10, i11);
        return rect;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9348m0.f2131g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f9296l != z10) {
            this.f9296l = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f9295k != z10) {
            this.f9295k = z10;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0103a
    public final void a() {
        c(this.f9300p);
        requestLayout();
        invalidateOutline();
    }

    public final void c(int i) {
        this.f9300p = i;
        if (!this.f9298n) {
            InsetDrawable insetDrawable = this.f9291f;
            if (insetDrawable == null) {
                int[] iArr = Q2.a.f3179a;
                g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f9291f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = Q2.a.f3179a;
                    g();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f9290e.f9311A));
        int max2 = Math.max(0, i - this.f9290e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f9291f;
            if (insetDrawable2 == null) {
                int[] iArr3 = Q2.a.f3179a;
                g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f9291f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = Q2.a.f3179a;
                    g();
                    return;
                }
                return;
            }
        }
        int i9 = max2 > 0 ? max2 / 2 : 0;
        int i10 = max > 0 ? max / 2 : 0;
        if (this.f9291f != null) {
            Rect rect = new Rect();
            this.f9291f.getPadding(rect);
            if (rect.top == i10 && rect.bottom == i10 && rect.left == i9 && rect.right == i9) {
                int[] iArr5 = Q2.a.f3179a;
                g();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f9291f = new InsetDrawable((Drawable) this.f9290e, i9, i10, i9, i10);
        int[] iArr6 = Q2.a.f3179a;
        g();
    }

    public final boolean d() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            Object obj = aVar.f9331M;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof o0.b) {
                obj = ((o0.b) obj).b();
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f9303s) {
            return super.dispatchHoverEvent(motionEvent);
        }
        b bVar = this.f9302r;
        AccessibilityManager accessibilityManager = bVar.f1006h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x9 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Chip chip = Chip.this;
                int i9 = (chip.d() && chip.getCloseIconTouchBounds().contains(x9, y10)) ? 1 : 0;
                int i10 = bVar.f1010m;
                if (i10 != i9) {
                    bVar.f1010m = i9;
                    bVar.q(i9, 128);
                    bVar.q(i10, 256);
                }
                if (i9 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = bVar.f1010m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                bVar.f1010m = Integer.MIN_VALUE;
                bVar.q(Integer.MIN_VALUE, 128);
                bVar.q(i, 256);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (r7 == false) goto L57;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f9303s
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            com.google.android.material.chip.Chip$b r0 = r9.f9302r
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 1
            if (r1 == r2) goto La4
            int r1 = r10.getKeyCode()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 61
            r5 = 0
            if (r1 == r4) goto L87
            r4 = 0
            r6 = 66
            if (r1 == r6) goto L56
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L56;
                default: goto L28;
            }
        L28:
            goto La4
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto La4
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r6 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r6 = 17
            goto L44
        L42:
            r6 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r2
            r7 = r4
        L4a:
            if (r4 >= r1) goto L9d
            boolean r8 = r0.m(r6, r5)
            if (r8 == 0) goto L9d
            int r4 = r4 + 1
            r7 = r2
            goto L4a
        L56:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto La4
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto La4
            int r1 = r0.f1009l
            if (r1 == r3) goto L9f
            com.google.android.material.chip.Chip r5 = com.google.android.material.chip.Chip.this
            if (r1 != 0) goto L6f
            boolean r1 = r5.performClick()
            goto L9f
        L6f:
            if (r1 != r2) goto L9f
            r5.playSoundEffect(r4)
            android.view.View$OnClickListener r1 = r5.f9293h
            if (r1 == 0) goto L7c
            r1.onClick(r5)
            r4 = r2
        L7c:
            boolean r1 = r5.f9303s
            if (r1 == 0) goto L85
            com.google.android.material.chip.Chip$b r1 = r5.f9302r
            r1.q(r2, r2)
        L85:
            r1 = r4
            goto L9f
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r7 = r0.m(r1, r5)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r2)
            if (r1 == 0) goto La4
            boolean r7 = r0.m(r2, r5)
        L9d:
            if (r7 == 0) goto La4
        L9f:
            int r0 = r0.f1009l
            if (r0 == r3) goto La4
            return r2
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // m.C1004f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null || !com.google.android.material.chip.a.C(aVar.f9331M)) {
            return;
        }
        com.google.android.material.chip.a aVar2 = this.f9290e;
        ?? isEnabled = isEnabled();
        int i = isEnabled;
        if (this.f9297m) {
            i = isEnabled + 1;
        }
        int i9 = i;
        if (this.f9296l) {
            i9 = i + 1;
        }
        int i10 = i9;
        if (this.f9295k) {
            i10 = i9 + 1;
        }
        int i11 = i10;
        if (isChecked()) {
            i11 = i10 + 1;
        }
        int[] iArr = new int[i11];
        int i12 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i12 = 1;
        }
        if (this.f9297m) {
            iArr[i12] = 16842908;
            i12++;
        }
        if (this.f9296l) {
            iArr[i12] = 16843623;
            i12++;
        }
        if (this.f9295k) {
            iArr[i12] = 16842919;
            i12++;
        }
        if (isChecked()) {
            iArr[i12] = 16842913;
        }
        if (Arrays.equals(aVar2.f9312A0, iArr)) {
            return;
        }
        aVar2.f9312A0 = iArr;
        if (aVar2.b0() && aVar2.E(aVar2.getState(), iArr)) {
            invalidate();
        }
    }

    public final boolean e() {
        com.google.android.material.chip.a aVar = this.f9290e;
        return aVar != null && aVar.R;
    }

    public final void f() {
        com.google.android.material.chip.a aVar;
        if (!d() || (aVar = this.f9290e) == null || !aVar.f9330L || this.f9293h == null) {
            C1596C.o(this, null);
            this.f9303s = false;
        } else {
            C1596C.o(this, this.f9302r);
            this.f9303s = true;
        }
    }

    public final void g() {
        this.f9292g = new RippleDrawable(Q2.a.c(this.f9290e.f9319E), getBackgroundDrawable(), null);
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar.f9314B0) {
            aVar.f9314B0 = false;
            aVar.f9316C0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.f9292g;
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        setBackground(rippleDrawable);
        h();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f9301q)) {
            return this.f9301q;
        }
        if (!e()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof C2.c)) {
            return "android.widget.Button";
        }
        ((C2.c) parent).getClass();
        throw null;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f9291f;
        return insetDrawable == null ? this.f9290e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.T;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.U;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9361z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.A());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f9290e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9341f0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null || (drawable = aVar.f9325H) == 0) {
            return null;
        }
        boolean z10 = drawable instanceof o0.b;
        Drawable drawable2 = drawable;
        if (z10) {
            drawable2 = ((o0.b) drawable).b();
        }
        return drawable2;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9328J;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9327I;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9311A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9315C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9317D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null || (drawable = aVar.f9331M) == 0) {
            return null;
        }
        boolean z10 = drawable instanceof o0.b;
        Drawable drawable2 = drawable;
        if (z10) {
            drawable2 = ((o0.b) drawable).b();
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9335Q;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9340d0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9334P;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9339c0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9333O;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9320E0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f9303s) {
            b bVar = this.f9302r;
            if (bVar.f1009l == 1 || bVar.f1008k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C1517f getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.W;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9336Z;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.Y;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9319E;
        }
        return null;
    }

    public T2.i getShapeAppearanceModel() {
        return this.f9290e.f3448a.f3471a;
    }

    public C1517f getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9338b0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            return aVar.f9337a0;
        }
        return 0.0f;
    }

    public final void h() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f9290e) == null) {
            return;
        }
        int z10 = (int) (aVar.z() + aVar.f9341f0 + aVar.f9338b0);
        com.google.android.material.chip.a aVar2 = this.f9290e;
        int y10 = (int) (aVar2.y() + aVar2.X + aVar2.f9337a0);
        if (this.f9291f != null) {
            Rect rect = new Rect();
            this.f9291f.getPadding(rect);
            y10 += rect.left;
            z10 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
        setPaddingRelative(y10, paddingTop, z10, paddingBottom);
    }

    public final void i() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f9306v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Ja.a.y(this, this.f9290e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9288x);
        }
        if (e()) {
            View.mergeDrawableStates(onCreateDrawableState, f9289y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i, Rect rect) {
        super.onFocusChanged(z10, i, rect);
        if (this.f9303s) {
            b bVar = this.f9302r;
            int i9 = bVar.f1009l;
            if (i9 != Integer.MIN_VALUE) {
                bVar.j(i9);
            }
            if (z10) {
                bVar.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof C2.c) {
            C2.c cVar = (C2.c) getParent();
            if (cVar.f2113c) {
                i = 0;
                for (int i9 = 0; i9 < cVar.getChildCount(); i9++) {
                    View childAt = cVar.getChildAt(i9);
                    if ((childAt instanceof Chip) && cVar.getChildAt(i9).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            i = -1;
            Object tag = getTag(com.luminary.mobile.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C1638d.f.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, isChecked()).f31234a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f9299o != i) {
            this.f9299o = i;
            h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L51
        L21:
            boolean r0 = r5.f9295k
            if (r0 == 0) goto L51
            if (r1 != 0) goto L57
            r5.setCloseIconPressed(r2)
            goto L57
        L2b:
            boolean r0 = r5.f9295k
            if (r0 == 0) goto L44
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f9293h
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.f9303s
            if (r0 == 0) goto L42
            com.google.android.material.chip.Chip$b r0 = r5.f9302r
            r0.q(r3, r3)
        L42:
            r0 = r3
            goto L45
        L44:
            r0 = r2
        L45:
            r5.setCloseIconPressed(r2)
            if (r0 != 0) goto L57
            goto L51
        L4b:
            if (r1 == 0) goto L51
            r5.setCloseIconPressed(r3)
            goto L57
        L51:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L58
        L57:
            r2 = r3
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f9301q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f9292g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // m.C1004f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f9292g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // m.C1004f, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.F(z10);
        }
    }

    public void setCheckableResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.F(aVar.f9342g0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null) {
            this.f9294j = z10;
        } else if (aVar.R) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.G(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.G(U4.b.j(aVar.f9342g0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.H(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.H(C0913a.getColorStateList(aVar.f9342g0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.I(aVar.f9342g0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null || aVar.f9361z == colorStateList) {
            return;
        }
        aVar.f9361z = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateList;
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null || aVar.f9361z == (colorStateList = C0913a.getColorStateList(aVar.f9342g0, i))) {
            return;
        }
        aVar.f9361z = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.J(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.J(aVar.f9342g0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f9290e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.f9318D0 = new WeakReference<>(null);
            }
            this.f9290e = aVar;
            aVar.f9322F0 = false;
            aVar.f9318D0 = new WeakReference<>(this);
            c(this.f9300p);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null || aVar.f9341f0 == f10) {
            return;
        }
        aVar.f9341f0 = f10;
        aVar.invalidateSelf();
        aVar.D();
    }

    public void setChipEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            float dimension = aVar.f9342g0.getResources().getDimension(i);
            if (aVar.f9341f0 != dimension) {
                aVar.f9341f0 = dimension;
                aVar.invalidateSelf();
                aVar.D();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.K(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.K(U4.b.j(aVar.f9342g0, i));
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.L(f10);
        }
    }

    public void setChipIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.L(aVar.f9342g0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.M(C0913a.getColorStateList(aVar.f9342g0, i));
        }
    }

    public void setChipIconVisible(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.N(aVar.f9342g0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null || aVar.f9311A == f10) {
            return;
        }
        aVar.f9311A = f10;
        aVar.invalidateSelf();
        aVar.D();
    }

    public void setChipMinHeightResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            float dimension = aVar.f9342g0.getResources().getDimension(i);
            if (aVar.f9311A != dimension) {
                aVar.f9311A = dimension;
                aVar.invalidateSelf();
                aVar.D();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null || aVar.X == f10) {
            return;
        }
        aVar.X = f10;
        aVar.invalidateSelf();
        aVar.D();
    }

    public void setChipStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            float dimension = aVar.f9342g0.getResources().getDimension(i);
            if (aVar.X != dimension) {
                aVar.X = dimension;
                aVar.invalidateSelf();
                aVar.D();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.O(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.O(C0913a.getColorStateList(aVar.f9342g0, i));
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.P(f10);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.P(aVar.f9342g0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.Q(drawable);
        }
        f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null || aVar.f9335Q == charSequence) {
            return;
        }
        C1538a c2 = C1538a.c();
        aVar.f9335Q = c2.d(charSequence, c2.f30516c);
        aVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.R(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.R(aVar.f9342g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.Q(U4.b.j(aVar.f9342g0, i));
        }
        f();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.S(f10);
        }
    }

    public void setCloseIconSizeResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.S(aVar.f9342g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.T(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.T(aVar.f9342g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.U(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.U(C0913a.getColorStateList(aVar.f9342g0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // m.C1004f, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // m.C1004f, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i9, int i10, int i11) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i9, i10, i11);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i9, int i10, int i11) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i9, i10, i11);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.n(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f9290e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.f9320E0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f9298n = z10;
        c(this.f9300p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C1517f c1517f) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.W = c1517f;
        }
    }

    public void setHideMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.W = C1517f.a(aVar.f9342g0, i);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.W(f10);
        }
    }

    public void setIconEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.W(aVar.f9342g0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.X(f10);
        }
    }

    public void setIconStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.X(aVar.f9342g0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f9290e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.f9324G0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f9293h = onClickListener;
        f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.Y(colorStateList);
        }
        if (this.f9290e.f9314B0) {
            return;
        }
        g();
    }

    public void setRippleColorResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.Y(C0913a.getColorStateList(aVar.f9342g0, i));
            if (this.f9290e.f9314B0) {
                return;
            }
            g();
        }
    }

    @Override // T2.m
    public void setShapeAppearanceModel(T2.i iVar) {
        this.f9290e.setShapeAppearanceModel(iVar);
    }

    public void setShowMotionSpec(C1517f c1517f) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.V = c1517f;
        }
    }

    public void setShowMotionSpecResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.V = C1517f.a(aVar.f9342g0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.f9322F0 ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f9290e;
        if (aVar2 == null || TextUtils.equals(aVar2.f9321F, charSequence)) {
            return;
        }
        aVar2.f9321F = charSequence;
        aVar2.f9348m0.f2129e = true;
        aVar2.invalidateSelf();
        aVar2.D();
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.f9348m0.b(dVar, aVar.f9342g0);
        }
        i();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null || aVar.f9338b0 == f10) {
            return;
        }
        aVar.f9338b0 = f10;
        aVar.invalidateSelf();
        aVar.D();
    }

    public void setTextEndPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            float dimension = aVar.f9342g0.getResources().getDimension(i);
            if (aVar.f9338b0 != dimension) {
                aVar.f9338b0 = dimension;
                aVar.invalidateSelf();
                aVar.D();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f10) {
        super.setTextSize(i, f10);
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f10, getResources().getDisplayMetrics());
            f fVar = aVar.f9348m0;
            d dVar = fVar.f2131g;
            if (dVar != null) {
                dVar.f3061k = applyDimension;
                fVar.f2125a.setTextSize(applyDimension);
                aVar.a();
            }
        }
        i();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar == null || aVar.f9337a0 == f10) {
            return;
        }
        aVar.f9337a0 = f10;
        aVar.invalidateSelf();
        aVar.D();
    }

    public void setTextStartPaddingResource(int i) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            float dimension = aVar.f9342g0.getResources().getDimension(i);
            if (aVar.f9337a0 != dimension) {
                aVar.f9337a0 = dimension;
                aVar.invalidateSelf();
                aVar.D();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.V(z10);
        }
        f();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.I(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            aVar.N(z10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            Context context2 = aVar.f9342g0;
            aVar.f9348m0.b(new d(context2, i), context2);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.a aVar = this.f9290e;
        if (aVar != null) {
            Context context = aVar.f9342g0;
            aVar.f9348m0.b(new d(context, i), context);
        }
        i();
    }

    public class a extends Ha.c {
        public a() {
        }

        @Override // Ha.c
        public final void J(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f9290e;
            chip.setText(aVar.f9322F0 ? aVar.f9321F : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }

        @Override // Ha.c
        public final void I(int i) {
        }
    }

    public void setInternalOnCheckedChangeListener(J2.d<Chip> dVar) {
    }
}
