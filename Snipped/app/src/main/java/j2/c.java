package J2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import t2.C1279a;

/* compiled from: ForegroundLinearLayout.java */
/* loaded from: classes.dex */
public class c extends LinearLayoutCompat {

    /* renamed from: p, reason: collision with root package name */
    public Drawable f2115p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f2116q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f2117r;

    /* renamed from: s, reason: collision with root package name */
    public int f2118s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2119t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2120u;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2115p;
        if (drawable != null) {
            if (this.f2120u) {
                this.f2120u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.f2119t;
                Rect rect = this.f2116q;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f2118s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f2117r;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f2115p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2115p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f2115p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f2115p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f2118s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2115p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i9, int i10, int i11) {
        super.onLayout(z10, i, i9, i10, i11);
        this.f2120u = z10 | this.f2120u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i9, int i10, int i11) {
        super.onSizeChanged(i, i9, i10, i11);
        this.f2120u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f2115p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f2115p);
            }
            this.f2115p = drawable;
            this.f2120u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f2118s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f2118s != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2118s = i;
            if (i == 119 && this.f2115p != null) {
                this.f2115p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2115p;
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f2116q = new Rect();
        this.f2117r = new Rect();
        this.f2118s = 119;
        this.f2119t = true;
        this.f2120u = false;
        int[] iArr = C1279a.f27499q;
        i.a(context, attributeSet, 0, 0);
        i.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f2118s = obtainStyledAttributes.getInt(1, this.f2118s);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f2119t = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }
}
