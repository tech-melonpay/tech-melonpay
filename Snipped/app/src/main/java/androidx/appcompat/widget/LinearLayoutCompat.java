package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.card.MaterialCardView;
import g.C0756a;
import m.Z;
import m.e0;
import y0.C1596C;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4971a;

    /* renamed from: b, reason: collision with root package name */
    public int f4972b;

    /* renamed from: c, reason: collision with root package name */
    public int f4973c;

    /* renamed from: d, reason: collision with root package name */
    public int f4974d;

    /* renamed from: e, reason: collision with root package name */
    public int f4975e;

    /* renamed from: f, reason: collision with root package name */
    public int f4976f;

    /* renamed from: g, reason: collision with root package name */
    public float f4977g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4978h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f4979j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f4980k;

    /* renamed from: l, reason: collision with root package name */
    public int f4981l;

    /* renamed from: m, reason: collision with root package name */
    public int f4982m;

    /* renamed from: n, reason: collision with root package name */
    public int f4983n;

    /* renamed from: o, reason: collision with root package name */
    public int f4984o;

    public static class a extends LinearLayout.LayoutParams {
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void f(Canvas canvas, int i) {
        this.f4980k.setBounds(getPaddingLeft() + this.f4984o, i, (getWidth() - getPaddingRight()) - this.f4984o, this.f4982m + i);
        this.f4980k.draw(canvas);
    }

    public final void g(Canvas canvas, int i) {
        this.f4980k.setBounds(i, getPaddingTop() + this.f4984o, this.f4981l + i, (getHeight() - getPaddingBottom()) - this.f4984o);
        this.f4980k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f4972b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i9 = this.f4972b;
        if (childCount <= i9) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i9);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f4972b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i10 = this.f4973c;
        if (this.f4974d == 1 && (i = this.f4975e & 112) != 48) {
            if (i == 16) {
                i10 = com.google.android.gms.measurement.internal.a.t(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f4976f, 2, i10);
            } else if (i == 80) {
                i10 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4976f;
            }
        }
        return i10 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4972b;
    }

    public Drawable getDividerDrawable() {
        return this.f4980k;
    }

    public int getDividerPadding() {
        return this.f4984o;
    }

    public int getDividerWidth() {
        return this.f4981l;
    }

    public int getGravity() {
        return this.f4975e;
    }

    public int getOrientation() {
        return this.f4974d;
    }

    public int getShowDividers() {
        return this.f4983n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4977g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i = this.f4974d;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public final boolean k(int i) {
        if (i == 0) {
            return (this.f4983n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f4983n & 4) != 0;
        }
        if ((this.f4983n & 2) == 0) {
            return false;
        }
        for (int i9 = i - 1; i9 >= 0; i9--) {
            if (getChildAt(i9).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f4980k == null) {
            return;
        }
        int i9 = 0;
        if (this.f4974d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i9 < virtualChildCount) {
                View childAt = getChildAt(i9);
                if (childAt != null && childAt.getVisibility() != 8 && k(i9)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f4982m);
                }
                i9++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4982m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z10 = e0.f23753a;
        boolean z11 = getLayoutDirection() == 1;
        while (i9 < virtualChildCount2) {
            View childAt3 = getChildAt(i9);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i9)) {
                a aVar = (a) childAt3.getLayoutParams();
                g(canvas, z11 ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f4981l);
            }
            i9++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (z11) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i = this.f4981l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (z11) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f4981l;
                right = left - i;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02e0, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L148;
     */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f4971a = z10;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f4972b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4980k) {
            return;
        }
        this.f4980k = drawable;
        if (drawable != null) {
            this.f4981l = drawable.getIntrinsicWidth();
            this.f4982m = drawable.getIntrinsicHeight();
        } else {
            this.f4981l = 0;
            this.f4982m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f4984o = i;
    }

    public void setGravity(int i) {
        if (this.f4975e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4975e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i9 = i & 8388615;
        int i10 = this.f4975e;
        if ((8388615 & i10) != i9) {
            this.f4975e = i9 | ((-8388616) & i10);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f4978h = z10;
    }

    public void setOrientation(int i) {
        if (this.f4974d != i) {
            this.f4974d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f4983n) {
            requestLayout();
        }
        this.f4983n = i;
    }

    public void setVerticalGravity(int i) {
        int i9 = i & 112;
        int i10 = this.f4975e;
        if ((i10 & 112) != i9) {
            this.f4975e = i9 | (i10 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f4977g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4971a = true;
        this.f4972b = -1;
        this.f4973c = 0;
        this.f4975e = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        int[] iArr = C0756a.f20741n;
        Z f10 = Z.f(context, attributeSet, iArr, i, 0);
        C1596C.n(this, context, iArr, attributeSet, f10.f23728b, i);
        TypedArray typedArray = f10.f23728b;
        int i9 = typedArray.getInt(1, -1);
        if (i9 >= 0) {
            setOrientation(i9);
        }
        int i10 = typedArray.getInt(0, -1);
        if (i10 >= 0) {
            setGravity(i10);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f4977g = typedArray.getFloat(4, -1.0f);
        this.f4972b = typedArray.getInt(3, -1);
        this.f4978h = typedArray.getBoolean(7, false);
        setDividerDrawable(f10.b(5));
        this.f4983n = typedArray.getInt(8, 0);
        this.f4984o = typedArray.getDimensionPixelSize(6, 0);
        f10.g();
    }
}
