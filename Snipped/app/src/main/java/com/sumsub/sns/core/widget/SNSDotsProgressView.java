package com.sumsub.sns.core.widget;

import O9.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR*\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSDotsProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "w", "h", "oldw", "oldh", "LO9/p;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Paint;", "completePaint", "Landroid/graphics/Paint;", "dotPaint", "dotRadius", "I", "minGap", "value", "progress", "getProgress", "()I", "setProgress", "(I)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSDotsProgressView extends View {
    private final Paint completePaint;
    private final Paint dotPaint;
    private int dotRadius;
    private int minGap;
    private int progress;

    public SNSDotsProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final int getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / ((this.dotRadius * 2) + this.minGap);
        int height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop();
        int width2 = width > 1 ? (((getWidth() - getPaddingLeft()) - getPaddingRight()) - ((this.dotRadius * width) * 2)) / (width - 1) : 0;
        int paddingLeft = getPaddingLeft() + this.dotRadius;
        for (int i = 0; i < width; i++) {
            canvas.drawCircle(paddingLeft, height, this.dotRadius, (i * 100) / width >= this.progress ? this.dotPaint : this.completePaint);
            paddingLeft += (this.dotRadius * 2) + width2;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int w2, int h9, int oldw, int oldh) {
        super.onSizeChanged(w2, h9, oldw, oldh);
        int paddingTop = (h9 - getPaddingTop()) - getPaddingBottom();
        if (paddingTop < 0) {
            paddingTop = 0;
        }
        this.dotRadius = paddingTop / 2;
    }

    public final void setProgress(int i) {
        if (i != this.progress) {
            this.progress = i;
            invalidate();
        }
    }

    public /* synthetic */ SNSDotsProgressView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_DotsProgressViewStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSDotsProgressView : i9);
    }

    public SNSDotsProgressView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        this.completePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.dotPaint = paint2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSDotsProgressView, i, i9);
        paint2.setColor(com.sumsub.sns.core.common.b.a(obtainStyledAttributes, R$styleable.SNSDotsProgressView_sns_dotsProgressDotBackgroundColor, 0));
        paint.setColor(com.sumsub.sns.core.common.b.a(obtainStyledAttributes, R$styleable.SNSDotsProgressView_sns_dotsProgressDotCompleteColor, 0));
        this.minGap = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSDotsProgressView_sns_dotsProgressMinGap, 0);
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
    }
}
