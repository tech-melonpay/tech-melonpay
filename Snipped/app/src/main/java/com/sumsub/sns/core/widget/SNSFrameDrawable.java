package com.sumsub.sns.core.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.sumsub.sns.R$id;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b&\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-¨\u0006/"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSFrameDrawable;", "Landroid/graphics/drawable/Drawable;", "frame", "", "fillColor", "", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "<init>", "(Landroid/graphics/drawable/Drawable;IFFFF)V", "LO9/p;", "redrawBuffer", "()V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "alpha", "setAlpha", "(I)V", "getOpacity", "()I", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "left", "top", "right", "bottom", "setBounds", "(IIII)V", "width", "color", "setStroke", "(II)V", "setFillColor", "I", "F", "Landroid/graphics/Bitmap;", "buffer", "Landroid/graphics/Bitmap;", "border", "Landroid/graphics/drawable/Drawable;", "mask", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSFrameDrawable extends Drawable {
    private final Drawable border;
    private Bitmap buffer;
    private int fillColor;
    private final Drawable mask;
    private final float paddingBottom;
    private final float paddingLeft;
    private final float paddingRight;
    private final float paddingTop;

    public SNSFrameDrawable(Drawable drawable, int i, float f10, float f11, float f12, float f13) {
        Drawable findDrawableByLayerId;
        this.fillColor = i;
        this.paddingLeft = f10;
        this.paddingRight = f11;
        this.paddingTop = f12;
        this.paddingBottom = f13;
        boolean z10 = drawable instanceof LayerDrawable;
        LayerDrawable layerDrawable = z10 ? (LayerDrawable) drawable : null;
        this.border = layerDrawable != null ? layerDrawable.findDrawableByLayerId(R$id.sns_frame_border) : null;
        LayerDrawable layerDrawable2 = z10 ? (LayerDrawable) drawable : null;
        if (layerDrawable2 != null && (findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R$id.sns_frame_mask)) != null) {
            drawable = findDrawableByLayerId;
        }
        this.mask = drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void redrawBuffer() {
        int i;
        Bitmap bitmap;
        Pair pair;
        int i9 = getBounds().left;
        int i10 = getBounds().right;
        int i11 = getBounds().top;
        int i12 = getBounds().bottom;
        Drawable drawable = this.mask;
        if (drawable != null) {
            float O6 = ha.h.O(((i10 - i9) - this.paddingLeft) - this.paddingRight, 0.0f);
            float O8 = ha.h.O(((i12 - i11) - this.paddingTop) - this.paddingBottom, 0.0f);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth < 1) {
                intrinsicWidth = 1;
            }
            float f10 = O6 / intrinsicWidth;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight < 1) {
                intrinsicHeight = 1;
            }
            if (O8 / intrinsicHeight > f10) {
                pair = new Pair(Float.valueOf(O6), Float.valueOf((drawable.getIntrinsicHeight() * O6) / (drawable.getIntrinsicWidth() >= 1 ? r10 : 1)));
            } else {
                pair = new Pair(Float.valueOf((drawable.getIntrinsicWidth() * O8) / (drawable.getIntrinsicHeight() >= 1 ? r9 : 1)), Float.valueOf(O8));
            }
            float floatValue = ((Number) pair.f23089a).floatValue();
            float floatValue2 = ((Number) pair.f23090b).floatValue();
            float f11 = 2;
            float f12 = ((O6 - floatValue) / f11) + i9 + this.paddingLeft;
            float f13 = ((O8 - floatValue2) / f11) + i11 + this.paddingTop;
            drawable.setBounds((int) f12, (int) f13, (int) (f12 + floatValue), (int) (f13 + floatValue2));
            Drawable drawable2 = this.border;
            if (drawable2 != null) {
                drawable2.setBounds(drawable.getBounds());
            }
        }
        int i13 = i10 - i9;
        if (i13 <= 0 || (i = i12 - i11) <= 0) {
            return;
        }
        Bitmap bitmap2 = this.buffer;
        if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.buffer) != null) {
            bitmap.recycle();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i13, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Drawable drawable3 = this.mask;
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
        canvas.drawColor(this.fillColor, PorterDuff.Mode.SRC_OUT);
        Drawable drawable4 = this.border;
        if (drawable4 != null) {
            drawable4.draw(canvas);
        }
        this.buffer = createBitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.buffer;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().left, getBounds().top, (Paint) null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int left, int top, int right, int bottom) {
        super.setBounds(left, top, right, bottom);
        redrawBuffer();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        invalidateSelf();
    }

    public final void setFillColor(int color) {
        this.fillColor = color;
        redrawBuffer();
        invalidateSelf();
    }

    public final void setStroke(int width, int color) {
        Drawable drawable = this.border;
        GradientDrawable gradientDrawable = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(width, color);
        }
        redrawBuffer();
        invalidateSelf();
    }
}
