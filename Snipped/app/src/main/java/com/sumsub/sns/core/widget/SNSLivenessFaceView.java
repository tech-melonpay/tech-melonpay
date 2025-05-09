package com.sumsub.sns.core.widget;

import H0.b;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.internal.core.common.i;
import ha.C0806e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001A\u0018\u0000 }2\u00020\u0001:\u0003}~\u007fB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\rJ/\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\"J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010\u001fJ\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b(\u0010\u001fJ\u000f\u0010)\u001a\u00020\u000bH\u0002¢\u0006\u0004\b)\u0010\rR\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\"\u0004\b3\u00104R.\u00105\u001a\u0004\u0018\u00010*2\b\u00100\u001a\u0004\u0018\u00010*8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.\"\u0004\b7\u00108R(\u0010:\u001a\u0004\u0018\u0001092\b\u00100\u001a\u0004\u0018\u0001098\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010N\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bN\u00102\"\u0004\bO\u00104R\u001c\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bQ\u0010R\u0012\u0004\bS\u0010\rR\u001c\u0010T\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bT\u00102\u0012\u0004\bU\u0010\rR\u001c\u0010V\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bV\u00102\u0012\u0004\bW\u0010\rR\u001a\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bY\u0010Z\u0012\u0004\b[\u0010\rR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010^R$\u0010`\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b`\u00102\"\u0004\ba\u00104R\u001a\u0010b\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bb\u0010^\u0012\u0004\bc\u0010\rR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010fR\u0014\u0010h\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010fR\u0014\u0010i\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010fR\u0014\u0010j\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010fR\u0014\u0010k\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010fR\u0016\u0010l\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010?R\u0016\u0010m\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010?R\u0016\u0010n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010?R\u0014\u0010o\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010?R\u0014\u0010p\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010?R$\u0010r\u001a\u00020q2\u0006\u00100\u001a\u00020q8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\br\u0010s\"\u0004\bt\u0010uR\u0011\u0010y\u001a\u00020v8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010{\u001a\u00020z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006\u0080\u0001"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "LO9/p;", "setRecognizingState", "()V", "setFaceDetectedState", "setFaceAnalyzingState", "setScanCompleteState", "onDetachedFromWindow", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "color", "setOverlayColor", "(I)V", "setFaceRecognizedColor", "setFaceMarkerActiveColor", "setFaceMarkerInActiveColor", "drawRecognizingCircle", "drawMarkers", "drawRecognizingArc", "updateOverlay", "Landroid/graphics/RectF;", "helperRectF", "Landroid/graphics/RectF;", "getHelperRectF", "()Landroid/graphics/RectF;", "", "value", "recognizingFactor", "F", "setRecognizingFactor", "(F)V", "faceRectangle", "getFaceRectangle", "setFaceRectangle", "(Landroid/graphics/RectF;)V", "Landroid/graphics/Bitmap;", "bgBitmap", "Landroid/graphics/Bitmap;", "setBgBitmap", "(Landroid/graphics/Bitmap;)V", "maxRadius", "I", "focusRadius", "com/sumsub/sns/core/widget/SNSLivenessFaceView$radiusHolder$1", "radiusHolder", "Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$radiusHolder$1;", "LH0/e;", "radiusAnimation", "LH0/e;", "Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;", "stateListener", "Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;", "getStateListener", "()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;", "setStateListener", "(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;)V", "detectingFactor", "setDetectingFactor", "", "detectingAnimationSpeed", "J", "getDetectingAnimationSpeed$annotations", "detectingArc1RotationAngle", "getDetectingArc1RotationAngle$annotations", "detectingArc2RotationAngle", "getDetectingArc2RotationAngle$annotations", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "updater", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "getUpdater$annotations", "Landroid/animation/ValueAnimator;", "recognizingAnimationDirect", "Landroid/animation/ValueAnimator;", "recognizingAnimationInDirect", "progressRotationAngle", "setProgressRotationAngle", "progressRotationAnimator", "getProgressRotationAnimator$annotations", "Landroid/graphics/Paint;", "mFaceProgressMarkerPaint", "Landroid/graphics/Paint;", "mFaceDetectionCirclePaint", "mFaceCutCirclePaint", "mFaceScanCompletePaint", "mFaceRecognizingPaint", "mFaceRectanglePaint", "mColorFaceMarkerActive", "mColorFaceMarkerInActive", "mColorOverlay", "mMarkerSize", "mMarkerPadding", "Lha/e;", "progressRange", "Lha/e;", "setProgressRange", "(Lha/e;)V", "Landroid/graphics/Rect;", "getFaceCapturingRect", "()Landroid/graphics/Rect;", "faceCapturingRect", "", "isAnalyzing", "()Z", "Companion", "SNSFaceStateListener", "SNSFaceViewState", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSLivenessFaceView extends View {
    private Bitmap bgBitmap;
    private long detectingAnimationSpeed;
    private float detectingArc1RotationAngle;
    private float detectingArc2RotationAngle;
    private float detectingFactor;
    private RectF faceRectangle;
    private int focusRadius;
    private final RectF helperRectF;
    private int mColorFaceMarkerActive;
    private int mColorFaceMarkerInActive;
    private int mColorOverlay;
    private final Paint mFaceCutCirclePaint;
    private final Paint mFaceDetectionCirclePaint;
    private final Paint mFaceProgressMarkerPaint;
    private final Paint mFaceRecognizingPaint;
    private final Paint mFaceRectanglePaint;
    private final Paint mFaceScanCompletePaint;
    private final int mMarkerPadding;
    private final int mMarkerSize;
    private int maxRadius;
    private C0806e progressRange;
    private float progressRotationAngle;
    private final ValueAnimator progressRotationAnimator;
    private final H0.e radiusAnimation;
    private final SNSLivenessFaceView$radiusHolder$1 radiusHolder;
    private final ValueAnimator recognizingAnimationDirect;
    private final ValueAnimator recognizingAnimationInDirect;
    private float recognizingFactor;
    private SNSFaceStateListener stateListener;
    private final ValueAnimator.AnimatorUpdateListener updater;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;", "", "Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;", "state", "LO9/p;", "onState", "(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public interface SNSFaceStateListener {
        void onState(SNSFaceViewState state);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;", "", "(Ljava/lang/String;I)V", "Recognizing", "Recognized", "Analyzing", "Complete", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum SNSFaceViewState {
        Recognizing,
        Recognized,
        Analyzing,
        Complete
    }

    public SNSLivenessFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd A[LOOP:0: B:9:0x0070->B:17:0x00cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8 A[EDGE_INSN: B:18:0x00d8->B:19:0x00d8 BREAK  A[LOOP:0: B:9:0x0070->B:17:0x00cd], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void drawMarkers(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.core.widget.SNSLivenessFaceView.drawMarkers(android.graphics.Canvas):void");
    }

    private final void drawRecognizingArc(Canvas canvas) {
        this.helperRectF.set(getFaceCapturingRect());
        this.helperRectF.inset(0.0f, (this.helperRectF.height() * (1 - Math.abs(this.detectingFactor))) / 2);
        float f10 = this.detectingFactor > 0.0f ? 180.0f : 0.0f;
        canvas.save();
        canvas.rotate(this.detectingArc1RotationAngle, this.helperRectF.centerX(), this.helperRectF.centerY());
        float f11 = f10;
        canvas.drawArc(this.helperRectF, f11, 180.0f, false, this.mFaceRecognizingPaint);
        canvas.rotate((-this.detectingArc1RotationAngle) - this.detectingArc2RotationAngle, this.helperRectF.centerX(), this.helperRectF.centerY());
        canvas.drawArc(this.helperRectF, f11, 180.0f, false, this.mFaceRecognizingPaint);
        canvas.restore();
    }

    private final void drawRecognizingCircle(Canvas canvas) {
        float centerX = getFaceCapturingRect().centerX();
        float centerY = getFaceCapturingRect().centerY();
        float max = Math.max((1 - this.recognizingFactor) * this.focusRadius, getFaceCapturingRect().width() / 2.0f);
        Bitmap bitmap = this.bgBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        if (isAnalyzing()) {
            canvas.drawCircle(centerX, centerY, max, this.mFaceScanCompletePaint);
        } else {
            canvas.drawCircle(centerX, centerY, max, this.mFaceDetectionCirclePaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAnalyzing() {
        if (this.recognizingFactor == 0.0f) {
            C0806e c0806e = this.progressRange;
            C0806e c0806e2 = C0806e.f21233d;
            if (kotlin.jvm.internal.f.b(c0806e, C0806e.f21233d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: progressRotationAnimator$lambda-8$lambda-7, reason: not valid java name */
    public static final void m53progressRotationAnimator$lambda8$lambda7(SNSLivenessFaceView sNSLivenessFaceView, ValueAnimator valueAnimator) {
        sNSLivenessFaceView.setProgressRotationAngle(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: radiusAnimation$lambda-1$lambda-0, reason: not valid java name */
    public static final void m54radiusAnimation$lambda1$lambda0(SNSLivenessFaceView sNSLivenessFaceView, H0.b bVar, boolean z10, float f10, float f11) {
        SNSFaceStateListener sNSFaceStateListener = sNSLivenessFaceView.stateListener;
        if (sNSFaceStateListener != null) {
            float f12 = sNSLivenessFaceView.recognizingFactor;
            sNSFaceStateListener.onState(f12 == 0.0f ? sNSLivenessFaceView.isAnalyzing() ? SNSFaceViewState.Analyzing : SNSFaceViewState.Recognized : f12 == 1.0f ? SNSFaceViewState.Complete : SNSFaceViewState.Recognizing);
        }
    }

    private final void setBgBitmap(Bitmap bitmap) {
        this.bgBitmap = bitmap;
        updateOverlay();
        invalidate();
    }

    private final void setDetectingFactor(float f10) {
        if (this.detectingFactor == f10) {
            return;
        }
        this.detectingFactor = f10;
        postInvalidateOnAnimation();
    }

    private final void setFaceMarkerActiveColor(int color) {
        this.mColorFaceMarkerActive = color;
    }

    private final void setFaceMarkerInActiveColor(int color) {
        this.mColorFaceMarkerInActive = color;
    }

    private final void setFaceRecognizedColor(int color) {
        this.mFaceRecognizingPaint.setColor(color);
        this.mFaceDetectionCirclePaint.setColor(color);
        invalidate();
    }

    private final void setOverlayColor(int color) {
        this.mColorOverlay = color;
        invalidate();
    }

    private final void setProgressRange(C0806e c0806e) {
        if (kotlin.jvm.internal.f.b(c0806e, this.progressRange)) {
            return;
        }
        this.progressRange = c0806e;
        postInvalidateOnAnimation();
    }

    private final void setProgressRotationAngle(float f10) {
        if (f10 == this.progressRotationAngle) {
            return;
        }
        this.progressRotationAngle = f10;
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRecognizingFactor(float f10) {
        if (this.recognizingFactor == f10) {
            return;
        }
        this.recognizingFactor = ha.h.R(f10, -1.0f, 1.0f);
        updateOverlay();
        postInvalidate();
    }

    private final void updateOverlay() {
        float centerX = getFaceCapturingRect().centerX();
        float centerY = getFaceCapturingRect().centerY();
        float max = Math.max((1 - this.recognizingFactor) * this.focusRadius, getFaceCapturingRect().width() / 2.0f);
        Bitmap bitmap = this.bgBitmap;
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(this.mColorOverlay);
            canvas.drawCircle(centerX, centerY, max, this.mFaceCutCirclePaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updater$lambda-2, reason: not valid java name */
    public static final void m55updater$lambda2(SNSLivenessFaceView sNSLivenessFaceView, ValueAnimator valueAnimator) {
        sNSLivenessFaceView.setDetectingFactor(((Float) valueAnimator.getAnimatedValue()).floatValue());
        sNSLivenessFaceView.detectingArc1RotationAngle = (Math.abs(sNSLivenessFaceView.detectingFactor) * 0.3f) + sNSLivenessFaceView.detectingArc1RotationAngle;
        sNSLivenessFaceView.detectingArc2RotationAngle = (Math.abs(sNSLivenessFaceView.detectingFactor) * 0.5f) + sNSLivenessFaceView.detectingArc2RotationAngle;
    }

    public final Rect getFaceCapturingRect() {
        int strokeWidth = (this.mMarkerSize * 2) + (this.mMarkerPadding * 2) + ((int) this.mFaceProgressMarkerPaint.getStrokeWidth());
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width > height) {
            width = height;
        }
        int i = width - strokeWidth;
        int paddingLeft = getPaddingLeft() + ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - i) / 2);
        int paddingTop = getPaddingTop() + ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - i) / 2);
        return new Rect(paddingLeft, paddingTop, paddingLeft + i, i + paddingTop);
    }

    public final RectF getFaceRectangle() {
        return this.faceRectangle;
    }

    public final RectF getHelperRectF() {
        return this.helperRectF;
    }

    public final SNSFaceStateListener getStateListener() {
        return this.stateListener;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.radiusAnimation.b();
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF;
        super.onDraw(canvas);
        canvas.save();
        drawRecognizingCircle(canvas);
        if (isAnalyzing()) {
            drawMarkers(canvas);
        }
        if (this.recognizingFactor == 0.0f && !isAnalyzing()) {
            drawRecognizingArc(canvas);
        }
        if (this.recognizingFactor < 0.0f && (rectF = this.faceRectangle) != null) {
            canvas.drawRect(rectF, this.mFaceRectanglePaint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        if (paddingStart > paddingTop) {
            paddingStart = paddingTop;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingEnd() + getPaddingStart() + paddingStart, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + paddingStart, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int w2, int h9, int oldw, int oldh) {
        Bitmap bitmap;
        super.onSizeChanged(w2, h9, oldw, oldh);
        Rect faceCapturingRect = getFaceCapturingRect();
        int centerX = faceCapturingRect.centerX();
        int centerX2 = w2 - faceCapturingRect.centerX();
        if (centerX < centerX2) {
            centerX = centerX2;
        }
        float f10 = centerX;
        int centerY = faceCapturingRect.centerY();
        int centerY2 = h9 - faceCapturingRect.centerY();
        if (centerY < centerY2) {
            centerY = centerY2;
        }
        float f11 = centerY;
        this.maxRadius = (int) Math.sqrt((f11 * f11) + (f10 * f10));
        this.focusRadius = getFaceCapturingRect().width() / 2;
        Bitmap bitmap2 = this.bgBitmap;
        if (bitmap2 != null && !bitmap2.isRecycled() && (bitmap = this.bgBitmap) != null) {
            bitmap.recycle();
        }
        setBgBitmap(Bitmap.createBitmap(w2, h9, Bitmap.Config.ARGB_8888));
    }

    public final void setFaceAnalyzingState() {
        this.radiusAnimation.e(0.0f);
        C0806e c0806e = C0806e.f21233d;
        setProgressRange(C0806e.f21233d);
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
        if (this.progressRotationAnimator.isStarted()) {
            return;
        }
        this.progressRotationAnimator.start();
    }

    public final void setFaceDetectedState() {
        this.radiusAnimation.e(0.0f);
        if (!this.recognizingAnimationDirect.isStarted() && !this.recognizingAnimationInDirect.isStarted()) {
            this.recognizingAnimationDirect.start();
            this.recognizingAnimationInDirect.cancel();
        }
        setProgressRange(new C0806e(0, 360, 1));
        if (this.progressRotationAnimator.isStarted()) {
            return;
        }
        this.progressRotationAnimator.start();
    }

    public final void setFaceRectangle(RectF rectF) {
        if (kotlin.jvm.internal.f.b(rectF, this.faceRectangle)) {
            return;
        }
        this.faceRectangle = rectF;
        postInvalidate();
    }

    public final void setRecognizingState() {
        this.radiusAnimation.e(-50.0f);
        C0806e c0806e = C0806e.f21233d;
        setProgressRange(C0806e.f21233d);
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
        this.progressRotationAnimator.cancel();
    }

    public final void setScanCompleteState() {
        this.radiusAnimation.e(1000.0f);
        C0806e c0806e = C0806e.f21233d;
        setProgressRange(C0806e.f21233d);
        this.recognizingAnimationDirect.cancel();
        this.recognizingAnimationInDirect.cancel();
        this.progressRotationAnimator.cancel();
    }

    public final void setStateListener(SNSFaceStateListener sNSFaceStateListener) {
        this.stateListener = sNSFaceStateListener;
    }

    public /* synthetic */ SNSLivenessFaceView(Context context, AttributeSet attributeSet, int i, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R$attr.sns_ProofaceViewStyle : i, (i10 & 8) != 0 ? R$style.SNSProofaceViewStyle : i9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v0, types: [H0.c, com.sumsub.sns.core.widget.SNSLivenessFaceView$radiusHolder$1] */
    public SNSLivenessFaceView(Context context, AttributeSet attributeSet, int i, int i9) {
        super(context, attributeSet, i);
        Integer a10;
        Integer a11;
        Integer a12;
        final int i10 = 1;
        final int i11 = 0;
        this.helperRectF = new RectF();
        this.recognizingFactor = -1.0f;
        ?? r52 = new H0.c<SNSLivenessFaceView>() { // from class: com.sumsub.sns.core.widget.SNSLivenessFaceView$radiusHolder$1
            {
                super("recognizingFactor");
            }

            @Override // H0.c
            public float getValue(SNSLivenessFaceView view) {
                float f10;
                f10 = SNSLivenessFaceView.this.recognizingFactor;
                return f10 * 1000.0f;
            }

            @Override // H0.c
            public void setValue(SNSLivenessFaceView view, float value) {
                SNSLivenessFaceView.this.setRecognizingFactor(value / 1000.0f);
            }
        };
        this.radiusHolder = r52;
        H0.e eVar = new H0.e(this, r52, this.recognizingFactor);
        eVar.f1405s.a(0.75f);
        eVar.f1405s.b(200.0f);
        eVar.f1397h = -1000.0f;
        eVar.f1396g = 1000.0f;
        f fVar = new f(this, i11);
        ArrayList<b.q> arrayList = eVar.f1399k;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        this.radiusAnimation = eVar;
        this.detectingFactor = -1.0f;
        this.detectingAnimationSpeed = 1000L;
        this.detectingArc1RotationAngle = 25.0f;
        this.detectingArc2RotationAngle = 25.0f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.sumsub.sns.core.widget.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SNSLivenessFaceView f14385b;

            {
                this.f14385b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        SNSLivenessFaceView.m55updater$lambda2(this.f14385b, valueAnimator);
                        break;
                    default:
                        SNSLivenessFaceView.m53progressRotationAnimator$lambda8$lambda7(this.f14385b, valueAnimator);
                        break;
                }
            }
        };
        this.updater = animatorUpdateListener;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(this.detectingAnimationSpeed);
        ofFloat.addUpdateListener(animatorUpdateListener);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.sumsub.sns.core.widget.SNSLivenessFaceView$recognizingAnimationDirect$lambda-4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                boolean isAnalyzing;
                ValueAnimator valueAnimator;
                isAnalyzing = SNSLivenessFaceView.this.isAnalyzing();
                if (isAnalyzing) {
                    return;
                }
                valueAnimator = SNSLivenessFaceView.this.recognizingAnimationInDirect;
                valueAnimator.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.recognizingAnimationDirect = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, -1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(this.detectingAnimationSpeed);
        ofFloat2.addUpdateListener(animatorUpdateListener);
        ofFloat2.addListener(new Animator.AnimatorListener() { // from class: com.sumsub.sns.core.widget.SNSLivenessFaceView$recognizingAnimationInDirect$lambda-6$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                boolean isAnalyzing;
                ValueAnimator valueAnimator;
                isAnalyzing = SNSLivenessFaceView.this.isAnalyzing();
                if (isAnalyzing) {
                    return;
                }
                valueAnimator = SNSLivenessFaceView.this.recognizingAnimationDirect;
                valueAnimator.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.recognizingAnimationInDirect = ofFloat2;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 4.0f);
        ofFloat3.setDuration(this.detectingAnimationSpeed);
        ofFloat3.setInterpolator(new LinearInterpolator());
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.sumsub.sns.core.widget.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SNSLivenessFaceView f14385b;

            {
                this.f14385b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        SNSLivenessFaceView.m55updater$lambda2(this.f14385b, valueAnimator);
                        break;
                    default:
                        SNSLivenessFaceView.m53progressRotationAnimator$lambda8$lambda7(this.f14385b, valueAnimator);
                        break;
                }
            }
        });
        ofFloat3.setRepeatCount(-1);
        this.progressRotationAnimator = ofFloat3;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        paint.setStrokeJoin(Paint.Join.ROUND);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.mFaceProgressMarkerPaint = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.mFaceDetectionCirclePaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.mFaceCutCirclePaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        this.mFaceScanCompletePaint = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style2);
        paint5.setStrokeCap(cap);
        this.mFaceRecognizingPaint = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style2);
        paint6.setColor(-65281);
        paint6.setStrokeWidth(i.a(2));
        this.mFaceRectanglePaint = paint6;
        this.progressRange = C0806e.f21233d;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSLivenessFaceView, i, i9);
        this.mColorFaceMarkerActive = com.sumsub.sns.core.common.b.a(obtainStyledAttributes, R$styleable.SNSLivenessFaceView_sns_ProofaceMarkerActiveColor, -65281);
        this.mColorFaceMarkerInActive = com.sumsub.sns.core.common.b.a(obtainStyledAttributes, R$styleable.SNSLivenessFaceView_sns_ProofaceMarkerInActiveColor, -65281);
        paint.setStrokeWidth(obtainStyledAttributes.getDimension(R$styleable.SNSLivenessFaceView_sns_ProofaceMarkerStroke, 0.0f));
        paint2.setStrokeWidth(paint.getStrokeWidth());
        this.mMarkerSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_sns_ProofaceMarkerSize, 0);
        this.mMarkerPadding = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_sns_ProofaceMarkerPadding, 0);
        this.mColorOverlay = com.sumsub.sns.core.common.b.a(obtainStyledAttributes, R$styleable.SNSLivenessFaceView_sns_ProofaceOverlayColor, -1);
        paint4.setColor(com.sumsub.sns.core.common.b.a(obtainStyledAttributes, R$styleable.SNSLivenessFaceView_sns_ProofaceCompleteOverlayColor, -1));
        paint5.setColor(com.sumsub.sns.core.common.b.a(obtainStyledAttributes, R$styleable.SNSLivenessFaceView_sns_ProofaceRecognizingColor, -1));
        paint2.setColor(paint5.getColor());
        paint5.setStrokeWidth(obtainStyledAttributes.getDimension(R$styleable.SNSLivenessFaceView_sns_ProofaceRecognizingStroke, 0.0f));
        this.detectingAnimationSpeed = obtainStyledAttributes.getInt(R$styleable.SNSLivenessFaceView_sns_ProofaceRecognizingAnimationSpeed, 1000);
        int i12 = R$styleable.SNSLivenessFaceView_android_padding;
        if (obtainStyledAttributes.hasValue(i12)) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i12, 0);
            setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        } else {
            setPadding(obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_android_paddingLeft, getPaddingLeft()), obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_android_paddingTop, getPaddingTop()), obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_android_paddingRight, getPaddingRight()), obtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSLivenessFaceView_android_paddingBottom, getPaddingBottom()));
        }
        obtainStyledAttributes.recycle();
        paint.setColor(this.mColorFaceMarkerActive);
        com.sumsub.sns.core.presentation.helper.a aVar = com.sumsub.sns.core.presentation.helper.a.f14273a;
        SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_COMMON;
        com.sumsub.sns.internal.core.theme.d a13 = aVar.a();
        if (a13 != null && (a12 = aVar.a(a13, sNSColorElement, aVar.a(this))) != null) {
            setOverlayColor(a12.intValue());
        }
        SNSColorElement sNSColorElement2 = SNSColorElement.CONTENT_SUCCESS;
        com.sumsub.sns.internal.core.theme.d a14 = aVar.a();
        if (a14 != null && (a11 = aVar.a(a14, sNSColorElement2, aVar.a(this))) != null) {
            int intValue = a11.intValue();
            setFaceRecognizedColor(intValue);
            setFaceMarkerActiveColor(intValue);
        }
        SNSColorElement sNSColorElement3 = SNSColorElement.CONTENT_WEAK;
        com.sumsub.sns.internal.core.theme.d a15 = aVar.a();
        if (a15 == null || (a10 = aVar.a(a15, sNSColorElement3, aVar.a(this))) == null) {
            return;
        }
        setFaceMarkerInActiveColor(a10.intValue());
    }

    private static /* synthetic */ void getDetectingAnimationSpeed$annotations() {
    }

    private static /* synthetic */ void getDetectingArc1RotationAngle$annotations() {
    }

    private static /* synthetic */ void getDetectingArc2RotationAngle$annotations() {
    }

    private static /* synthetic */ void getProgressRotationAnimator$annotations() {
    }

    private static /* synthetic */ void getUpdater$annotations() {
    }
}
