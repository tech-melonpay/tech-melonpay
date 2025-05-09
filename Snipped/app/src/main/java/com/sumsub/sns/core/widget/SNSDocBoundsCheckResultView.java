package com.sumsub.sns.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import com.sumsub.sns.R$dimen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR.\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR.\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0011\u001a\u0004\u0018\u00010$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/graphics/Canvas;", "canvas", "LO9/p;", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "value", "transformMatrix", "Landroid/graphics/Matrix;", "getTransformMatrix", "()Landroid/graphics/Matrix;", "setTransformMatrix", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "Landroid/graphics/Rect;", "docRect", "Landroid/graphics/Rect;", "getDocRect", "()Landroid/graphics/Rect;", "setDocRect", "(Landroid/graphics/Rect;)V", "Landroid/graphics/RectF;", "docRectF", "Landroid/graphics/RectF;", "getDocRectF", "()Landroid/graphics/RectF;", "setDocRectF", "(Landroid/graphics/RectF;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSDocBoundsCheckResultView extends View {
    private Rect docRect;
    private RectF docRectF;
    private final Paint paint;
    private Matrix transformMatrix;

    public SNSDocBoundsCheckResultView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public final Rect getDocRect() {
        return this.docRect;
    }

    public final RectF getDocRectF() {
        return this.docRectF;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    public final Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.docRectF;
        if (rectF == null) {
            return;
        }
        canvas.drawRect(rectF, this.paint);
    }

    public final void setDocRect(Rect rect) {
        this.docRect = rect;
        setDocRectF(rect != null ? new RectF(rect) : null);
    }

    public final void setDocRectF(RectF rectF) {
        this.docRectF = rectF;
        invalidate();
    }

    public final void setTransformMatrix(Matrix matrix) {
        this.transformMatrix = matrix;
        invalidate();
    }

    public SNSDocBoundsCheckResultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SNSDocBoundsCheckResultView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ SNSDocBoundsCheckResultView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i, (i10 & 8) != 0 ? 0 : i9);
    }

    public SNSDocBoundsCheckResultView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        Paint paint = new Paint();
        this.paint = paint;
        paint.setColor(-16711936);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R$dimen.sns_frame_stroke_width));
    }
}
