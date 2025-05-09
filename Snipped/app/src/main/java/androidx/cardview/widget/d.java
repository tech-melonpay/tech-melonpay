package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable.java */
/* loaded from: classes.dex */
public final class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f5870a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f5871b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f5872c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f5873d;

    /* renamed from: e, reason: collision with root package name */
    public float f5874e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f5877h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f5878j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5875f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5876g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f5879k = PorterDuff.Mode.SRC_IN;

    public d(ColorStateList colorStateList, float f10) {
        this.f5870a = f10;
        Paint paint = new Paint(5);
        this.f5871b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f5877h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f5877h.getDefaultColor()));
        this.f5872c = new RectF();
        this.f5873d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f5872c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f5873d;
        rect2.set(rect);
        if (this.f5875f) {
            rect2.inset((int) Math.ceil(e.a(this.f5874e, this.f5870a, this.f5876g)), (int) Math.ceil(e.b(this.f5874e, this.f5870a, this.f5876g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f5871b;
        if (this.i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.i);
            z10 = true;
        }
        RectF rectF = this.f5872c;
        float f10 = this.f5870a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f5873d, this.f5870a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f5878j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f5877h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f5877h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f5871b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f5878j;
        if (colorStateList2 == null || (mode = this.f5879k) == null) {
            return z10;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f5871b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5871b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f5878j = colorStateList;
        this.i = a(colorStateList, this.f5879k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f5879k = mode;
        this.i = a(this.f5878j, mode);
        invalidateSelf();
    }
}
