package com.sumsub.sns.camera.photo.presentation.document;

import O9.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$color;
import com.sumsub.sns.R$dimen;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSMetricElement;
import com.sumsub.sns.internal.core.common.i;
import k0.C0913a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001XB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R.\u0010.\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R.\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010'\u001a\u0004\u0018\u00010\u00168\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001cR*\u0010:\u001a\u0002032\u0006\u0010'\u001a\u0002038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010$R\u0014\u0010=\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u0016\u0010?\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00100R$\u0010E\u001a\u00020@2\u0006\u0010'\u001a\u00020@8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010K\u001a\u00020F2\u0006\u0010'\u001a\u00020F8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010R\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010U\u001a\u00020@2\u0006\u0010'\u001a\u00020@8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bS\u0010B\"\u0004\bT\u0010DR\u0014\u0010W\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010O¨\u0006Y"}, d2 = {"Lcom/sumsub/sns/camera/photo/presentation/document/SNSFrameViewWithBackground;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "w", "h", "oldw", "oldh", "LO9/p;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/RectF;", "b", "()Landroid/graphics/RectF;", "a", "()V", "frameRect", "(Landroid/graphics/RectF;)V", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "canvasBitmap", "Landroid/graphics/Canvas;", "drawCanvas", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "canvasPaint", "Landroid/util/SizeF;", "value", "d", "Landroid/util/SizeF;", "getFrameSize", "()Landroid/util/SizeF;", "setFrameSize", "(Landroid/util/SizeF;)V", "frameSize", "e", "Landroid/graphics/RectF;", "getFrameRect", "setFrameRect", "Lcom/sumsub/sns/camera/photo/presentation/document/SNSFrameViewWithBackground$State;", "f", "Lcom/sumsub/sns/camera/photo/presentation/document/SNSFrameViewWithBackground$State;", "getState", "()Lcom/sumsub/sns/camera/photo/presentation/document/SNSFrameViewWithBackground$State;", "setState", "(Lcom/sumsub/sns/camera/photo/presentation/document/SNSFrameViewWithBackground$State;)V", "state", "g", "rectPaint", "strokedRectPaint", "i", "strokedRect", "", "j", "F", "setStateFrameWidth", "(F)V", "stateFrameWidth", "Landroid/content/res/ColorStateList;", "k", "Landroid/content/res/ColorStateList;", "setStateFrameColors", "(Landroid/content/res/ColorStateList;)V", "stateFrameColors", "l", "I", "getFrameBackgroundColor", "()I", "setFrameBackgroundColor", "(I)V", "frameBackgroundColor", "m", "setStateFrameRadius", "stateFrameRadius", "getStateFrameColor", "stateFrameColor", "State", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSFrameViewWithBackground extends View {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Bitmap canvasBitmap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Canvas drawCanvas;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Paint canvasPaint;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public SizeF frameSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public RectF frameRect;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public State state;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Paint rectPaint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Paint strokedRectPaint;

    /* renamed from: i, reason: from kotlin metadata */
    public RectF strokedRect;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float stateFrameWidth;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public ColorStateList stateFrameColors;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int frameBackgroundColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public float stateFrameRadius;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sumsub/sns/camera/photo/presentation/document/SNSFrameViewWithBackground$State;", "", "(Ljava/lang/String;I)V", "DEFAULT", "RED", "YELLOW", "GREEN", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum State {
        DEFAULT,
        RED,
        YELLOW,
        GREEN
    }

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13894a;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.YELLOW.ordinal()] = 1;
            iArr[State.GREEN.ordinal()] = 2;
            iArr[State.RED.ordinal()] = 3;
            f13894a = iArr;
        }
    }

    public SNSFrameViewWithBackground(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    private final int getStateFrameColor() {
        int i = a.f13894a[this.state.ordinal()];
        int colorForState = this.stateFrameColors.getColorForState(i != 1 ? i != 2 ? i != 3 ? new int[]{R$attr.sns_stateInit} : new int[]{R$attr.sns_stateRejected} : new int[]{R$attr.sns_stateApproved} : new int[]{R$attr.sns_statePending}, -65281);
        return Color.rgb(Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState));
    }

    private final void setFrameBackgroundColor(int i) {
        this.frameBackgroundColor = i;
        invalidate();
    }

    private final void setFrameRect(RectF rectF) {
        this.frameRect = rectF;
        if (rectF != null) {
            a(rectF);
        }
    }

    private final void setStateFrameColors(ColorStateList colorStateList) {
        this.stateFrameColors = colorStateList;
        invalidate();
    }

    private final void setStateFrameRadius(float f10) {
        this.stateFrameRadius = f10;
        invalidate();
    }

    private final void setStateFrameWidth(float f10) {
        this.stateFrameWidth = f10;
        this.strokedRectPaint.setStrokeWidth(f10);
        invalidate();
    }

    public final void a() {
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        Integer a10 = aVar.a(this, SNSColorElement.CONTENT_WARNING);
        int intValue = a10 != null ? a10.intValue() : this.stateFrameColors.getColorForState(new int[]{R$attr.sns_statePending}, -65281);
        Integer a11 = aVar.a(this, SNSColorElement.CONTENT_SUCCESS);
        int intValue2 = a11 != null ? a11.intValue() : this.stateFrameColors.getColorForState(new int[]{R$attr.sns_stateApproved}, -65281);
        SNSColorElement sNSColorElement = SNSColorElement.CONTENT_CRITICAL;
        Integer a12 = aVar.a(this, sNSColorElement);
        int intValue3 = a12 != null ? a12.intValue() : this.stateFrameColors.getColorForState(new int[]{R$attr.sns_stateRejected}, -65281);
        Integer a13 = aVar.a(this, sNSColorElement);
        setStateFrameColors(new ColorStateList(new int[][]{new int[]{R$attr.sns_statePending}, new int[]{R$attr.sns_stateApproved}, new int[]{R$attr.sns_stateRejected}, new int[]{R$attr.sns_stateInit}}, new int[]{intValue, intValue2, intValue3, a13 != null ? a13.intValue() : this.stateFrameColors.getColorForState(new int[]{R$attr.sns_stateInit}, -65281)}));
    }

    public final RectF b() {
        SizeF sizeF;
        if (getWidth() == 0 || getHeight() == 0 || (sizeF = this.frameSize) == null) {
            return null;
        }
        float f10 = 2;
        float width = (getWidth() - sizeF.getWidth()) / f10;
        float height = (getHeight() - sizeF.getHeight()) / f10;
        RectF rectF = new RectF(width, height, sizeF.getWidth() + width, sizeF.getHeight() + height);
        setFrameRect(rectF);
        return rectF;
    }

    public final int getFrameBackgroundColor() {
        return this.frameBackgroundColor;
    }

    public final RectF getFrameRect() {
        return this.frameRect;
    }

    public final SizeF getFrameSize() {
        return this.frameSize;
    }

    public final State getState() {
        return this.state;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.canvasBitmap == null || (canvas2 = this.drawCanvas) == null) {
            return;
        }
        a(canvas2);
        Bitmap bitmap = this.canvasBitmap;
        if (bitmap == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.canvasPaint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w2, int h9, int oldw, int oldh) {
        Bitmap bitmap;
        super.onSizeChanged(w2, h9, oldw, oldh);
        Bitmap bitmap2 = this.canvasBitmap;
        if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.canvasBitmap) != null) {
            bitmap.recycle();
        }
        Bitmap createBitmap = Bitmap.createBitmap(w2, h9, Bitmap.Config.ARGB_8888);
        this.drawCanvas = new Canvas(createBitmap);
        this.canvasBitmap = createBitmap;
    }

    public final void setFrameSize(SizeF sizeF) {
        setFrameRect(null);
        this.frameSize = sizeF;
        invalidate();
    }

    public final void setState(State state) {
        this.state = state;
        RectF rectF = this.frameRect;
        if (rectF != null) {
            a(rectF);
            this.strokedRectPaint.setColor(getStateFrameColor());
        }
        invalidate();
    }

    public /* synthetic */ SNSFrameViewWithBackground(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.snsFrameViewWithBackgroundStyle : i, (i10 & 8) != 0 ? R$style.Widget_SNSFrameViewWithBackground : i9);
    }

    public SNSFrameViewWithBackground(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i, i9);
        this.canvasPaint = new Paint(4);
        this.state = State.RED;
        Paint paint = new Paint();
        this.rectPaint = paint;
        Paint paint2 = new Paint();
        this.strokedRectPaint = paint2;
        this.strokedRect = new RectF();
        this.stateFrameColors = ColorStateList.valueOf(-65281);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSFrameViewWithBackground, i, i9);
        int i10 = R$styleable.SNSFrameViewWithBackground_sns_stateFrameColor;
        if (obtainStyledAttributes.hasValue(i10)) {
            setStateFrameColors(i.a(obtainStyledAttributes, context, i10));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SNSFrameViewWithBackground_sns_stateFrameRadius)) {
            setStateFrameRadius(obtainStyledAttributes.getDimensionPixelSize(r8, context.getResources().getDimensionPixelSize(R$dimen.sns_state_frame_radius)));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.SNSFrameViewWithBackground_sns_stateFrameWidth)) {
            setStateFrameWidth(obtainStyledAttributes.getDimensionPixelSize(r8, context.getResources().getDimensionPixelSize(R$dimen.sns_frame_stroke_width)));
        }
        int i11 = R$styleable.SNSFrameViewWithBackground_sns_frameBackgroundColor;
        if (obtainStyledAttributes.hasValue(i11)) {
            setFrameBackgroundColor(obtainStyledAttributes.getColor(i11, C0913a.getColor(context, R$color.sns_auto_capture_frame_background)));
        }
        p pVar = p.f3034a;
        obtainStyledAttributes.recycle();
        a();
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        Float a10 = aVar.a(SNSMetricElement.DOCUMENT_FRAME_BORDER_WIDTH);
        if (a10 != null) {
            setStateFrameWidth(a10.floatValue());
        }
        Float a11 = aVar.a(SNSMetricElement.DOCUMENT_FRAME_CORNER_RADIUS);
        if (a11 != null) {
            setStateFrameRadius(a11.floatValue());
        }
        Integer a12 = aVar.a(this, SNSColorElement.CAMERA_BACKGROUND_OVERLAY);
        if (a12 != null) {
            setFrameBackgroundColor(a12.intValue());
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setDither(true);
        paint.setColor(0);
        paint2.setColor(getStateFrameColor());
        paint2.setStyle(Paint.Style.STROKE);
        Resources resources = context.getResources();
        int i12 = R$dimen.sns_frame_stroke_interval;
        paint2.setPathEffect(new DashPathEffect(new float[]{resources.getDimensionPixelSize(i12), context.getResources().getDimensionPixelSize(i12)}, 0.0f));
    }

    public final void a(Canvas canvas) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        RectF rectF = this.frameRect;
        if (rectF == null && (rectF = b()) == null) {
            return;
        }
        canvas.drawColor(this.frameBackgroundColor);
        float f10 = this.stateFrameRadius;
        canvas.drawRoundRect(rectF, f10, f10, this.rectPaint);
        RectF rectF2 = this.strokedRect;
        float f11 = this.stateFrameRadius;
        canvas.drawRoundRect(rectF2, f11, f11, this.strokedRectPaint);
    }

    public final void a(RectF frameRect) {
        float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.sns_frame_stroke_width);
        this.strokedRect = new RectF(frameRect.left - dimensionPixelSize, frameRect.top - dimensionPixelSize, frameRect.right + dimensionPixelSize, frameRect.bottom + dimensionPixelSize);
    }
}
