package antonkozyriatskyi.circularprogressindicator;

import F1.c;
import F1.d;
import F1.f;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import org.bouncycastle.tls.CipherSuite;

/* loaded from: classes.dex */
public class CircularProgressIndicator extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f8251a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f8252b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f8253c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f8254d;

    /* renamed from: e, reason: collision with root package name */
    public int f8255e;

    /* renamed from: f, reason: collision with root package name */
    public int f8256f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f8257g;

    /* renamed from: h, reason: collision with root package name */
    public String f8258h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f8259j;

    /* renamed from: k, reason: collision with root package name */
    public float f8260k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8261l;

    /* renamed from: m, reason: collision with root package name */
    public double f8262m;

    /* renamed from: n, reason: collision with root package name */
    public double f8263n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8264o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8265p;

    /* renamed from: q, reason: collision with root package name */
    public int f8266q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f8267r;

    /* renamed from: s, reason: collision with root package name */
    public b f8268s;

    /* renamed from: t, reason: collision with root package name */
    public Interpolator f8269t;

    public interface a {
    }

    public interface b {
        String d(double d10);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        int i9;
        int i10;
        int i11;
        Paint.Cap cap;
        this.f8255e = 270;
        this.f8256f = 0;
        this.f8262m = 100.0d;
        this.f8263n = 0.0d;
        this.f8266q = 1;
        this.f8269t = new AccelerateDecelerateInterpolator();
        int parseColor = Color.parseColor("#3F51B5");
        int parseColor2 = Color.parseColor("#e0e0e0");
        int c2 = c(8.0f);
        int applyDimension = (int) TypedValue.applyDimension(2, 24.0f, getResources().getDisplayMetrics());
        this.f8261l = true;
        Paint.Cap cap2 = Paint.Cap.ROUND;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f1161a);
            int color = obtainStyledAttributes.getColor(15, parseColor);
            parseColor2 = obtainStyledAttributes.getColor(12, parseColor2);
            c2 = obtainStyledAttributes.getDimensionPixelSize(16, c2);
            i11 = obtainStyledAttributes.getDimensionPixelSize(13, c2);
            i = obtainStyledAttributes.getColor(18, color);
            applyDimension = obtainStyledAttributes.getDimensionPixelSize(19, applyDimension);
            this.f8261l = obtainStyledAttributes.getBoolean(3, true);
            i9 = obtainStyledAttributes.getColor(1, color);
            i10 = obtainStyledAttributes.getDimensionPixelSize(2, c2);
            int i12 = obtainStyledAttributes.getInt(17, 270);
            this.f8255e = i12;
            if (i12 < 0 || i12 > 360) {
                this.f8255e = 270;
            }
            this.f8264o = obtainStyledAttributes.getBoolean(4, true);
            this.f8265p = obtainStyledAttributes.getBoolean(5, false);
            this.f8266q = obtainStyledAttributes.getInt(0, 1);
            cap = obtainStyledAttributes.getInt(14, 0) == 0 ? cap2 : Paint.Cap.BUTT;
            String string = obtainStyledAttributes.getString(6);
            if (string != null) {
                antonkozyriatskyi.circularprogressindicator.b bVar = new antonkozyriatskyi.circularprogressindicator.b();
                bVar.f8270a = string;
                this.f8268s = bVar;
            } else {
                this.f8268s = new antonkozyriatskyi.circularprogressindicator.a();
            }
            this.f8258h = this.f8268s.d(this.f8263n);
            int color2 = obtainStyledAttributes.getColor(8, 0);
            if (color2 != 0) {
                int color3 = obtainStyledAttributes.getColor(7, -1);
                if (color3 == -1) {
                    throw new IllegalArgumentException("did you forget to specify gradientColorEnd?");
                }
                post(new F1.a(this, color2, color3));
            }
            obtainStyledAttributes.recycle();
            parseColor = color;
        } else {
            i = parseColor;
            i9 = i;
            i10 = c2;
            i11 = i10;
            cap = cap2;
        }
        Paint paint = new Paint();
        this.f8251a = paint;
        paint.setStrokeCap(cap);
        this.f8251a.setStrokeWidth(c2);
        Paint paint2 = this.f8251a;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f8251a.setColor(parseColor);
        this.f8251a.setAntiAlias(true);
        style = this.f8265p ? Paint.Style.FILL_AND_STROKE : style;
        Paint paint3 = new Paint();
        this.f8252b = paint3;
        paint3.setStyle(style);
        this.f8252b.setStrokeWidth(i11);
        this.f8252b.setColor(parseColor2);
        this.f8252b.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.f8253c = paint4;
        paint4.setStrokeCap(cap2);
        this.f8253c.setStrokeWidth(i10);
        this.f8253c.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f8253c.setColor(i9);
        this.f8253c.setAntiAlias(true);
        TextPaint textPaint = new TextPaint();
        this.f8254d = textPaint;
        textPaint.setStrokeCap(cap2);
        this.f8254d.setColor(i);
        this.f8254d.setAntiAlias(true);
        this.f8254d.setTextSize(applyDimension);
        this.f8257g = new RectF();
    }

    public final void a(int i, int i9) {
        float f10 = i;
        this.f8260k = f10 / 2.0f;
        float strokeWidth = this.f8253c.getStrokeWidth();
        float strokeWidth2 = this.f8251a.getStrokeWidth();
        float strokeWidth3 = this.f8252b.getStrokeWidth();
        float max = (this.f8261l ? Math.max(strokeWidth, Math.max(strokeWidth2, strokeWidth3)) : Math.max(strokeWidth2, strokeWidth3)) / 2.0f;
        RectF rectF = this.f8257g;
        rectF.left = max;
        rectF.top = max;
        rectF.right = f10 - max;
        rectF.bottom = i9 - max;
        this.f8260k = rectF.width() / 2.0f;
        b();
    }

    public final Rect b() {
        Rect rect = new Rect();
        TextPaint textPaint = this.f8254d;
        String str = this.f8258h;
        textPaint.getTextBounds(str, 0, str.length(), rect);
        this.i = this.f8257g.centerX() - (rect.width() / 2.0f);
        this.f8259j = (rect.height() / 2.0f) + this.f8257g.centerY();
        return rect;
    }

    public final int c(float f10) {
        return (int) TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics());
    }

    public final void d() {
        a(getWidth(), getHeight());
        requestLayout();
        invalidate();
    }

    public int getDirection() {
        return this.f8266q;
    }

    public int getDotColor() {
        return this.f8253c.getColor();
    }

    public float getDotWidth() {
        return this.f8253c.getStrokeWidth();
    }

    public int getGradientType() {
        Shader shader = this.f8251a.getShader();
        if (shader instanceof LinearGradient) {
            return 1;
        }
        if (shader instanceof RadialGradient) {
            return 2;
        }
        return shader instanceof SweepGradient ? 3 : 0;
    }

    public Interpolator getInterpolator() {
        return this.f8269t;
    }

    public double getMaxProgress() {
        return this.f8262m;
    }

    public a getOnProgressChangeListener() {
        return null;
    }

    public double getProgress() {
        return this.f8263n;
    }

    public int getProgressBackgroundColor() {
        return this.f8252b.getColor();
    }

    public float getProgressBackgroundStrokeWidth() {
        return this.f8252b.getStrokeWidth();
    }

    public int getProgressColor() {
        return this.f8251a.getColor();
    }

    public int getProgressStrokeCap() {
        return this.f8251a.getStrokeCap() == Paint.Cap.ROUND ? 0 : 1;
    }

    public float getProgressStrokeWidth() {
        return this.f8251a.getStrokeWidth();
    }

    public b getProgressTextAdapter() {
        return this.f8268s;
    }

    public int getStartAngle() {
        return this.f8255e;
    }

    public int getTextColor() {
        return this.f8254d.getColor();
    }

    public float getTextSize() {
        return this.f8254d.getTextSize();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f8267r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawArc(this.f8257g, 0.0f, 360.0f, false, this.f8252b);
        canvas.drawArc(this.f8257g, this.f8255e, this.f8256f, false, this.f8251a);
        if (this.f8261l) {
            double radians = Math.toRadians(this.f8255e + this.f8256f + CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256);
            canvas.drawPoint(this.f8257g.centerX() - (this.f8260k * ((float) Math.cos(radians))), this.f8257g.centerY() - (this.f8260k * ((float) Math.sin(radians))), this.f8253c);
        }
        canvas.drawText(this.f8258h, this.i, this.f8259j, this.f8254d);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i9) {
        super.onMeasure(i, i9);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i9);
        Rect rect = new Rect();
        TextPaint textPaint = this.f8254d;
        String str = this.f8258h;
        textPaint.getTextBounds(str, 0, str.length(), rect);
        float strokeWidth = this.f8253c.getStrokeWidth();
        float strokeWidth2 = this.f8251a.getStrokeWidth();
        float strokeWidth3 = this.f8252b.getStrokeWidth();
        float max = Math.max(paddingBottom + paddingTop, paddingLeft + paddingRight) + c(150.0f) + ((int) (this.f8261l ? Math.max(strokeWidth, Math.max(strokeWidth2, strokeWidth3)) : Math.max(strokeWidth2, strokeWidth3)));
        int max2 = (int) ((0.1f * max) + Math.max(rect.width(), rect.height()) + max);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(max2, size);
        } else if (mode != 1073741824) {
            size = max2;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(max2, size2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        int min = Math.min((size2 - paddingTop) - paddingBottom, (size - paddingLeft) - paddingRight);
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i9, int i10, int i11) {
        a(i, i9);
        boolean z10 = this.f8251a.getShader() instanceof RadialGradient;
    }

    public void setAnimationEnabled(boolean z10) {
        ValueAnimator valueAnimator;
        this.f8264o = z10;
        if (z10 || (valueAnimator = this.f8267r) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    public void setCurrentProgress(double d10) {
        if (d10 > this.f8262m) {
            this.f8262m = d10;
        }
        double d11 = this.f8262m;
        double d12 = this.f8266q == 1 ? -((d10 / d11) * 360.0d) : (d10 / d11) * 360.0d;
        double d13 = this.f8263n;
        this.f8262m = d11;
        double min = Math.min(d10, d11);
        this.f8263n = min;
        this.f8258h = this.f8268s.d(min);
        b();
        ValueAnimator valueAnimator = this.f8267r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!this.f8264o) {
            this.f8256f = (int) d12;
            invalidate();
            return;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("angle", this.f8256f, (int) d12);
        ValueAnimator ofObject = ValueAnimator.ofObject(new F1.b(), Double.valueOf(d13), Double.valueOf(this.f8263n));
        this.f8267r = ofObject;
        ofObject.setDuration(1000L);
        this.f8267r.setValues(ofInt);
        this.f8267r.setInterpolator(this.f8269t);
        this.f8267r.addUpdateListener(new c(this));
        this.f8267r.addListener(new d(this, d12));
        this.f8267r.start();
    }

    public void setDirection(int i) {
        this.f8266q = i;
        invalidate();
    }

    public void setDotColor(int i) {
        this.f8253c.setColor(i);
        invalidate();
    }

    public void setDotWidthDp(int i) {
        setDotWidthPx(c(i));
    }

    public void setDotWidthPx(int i) {
        this.f8253c.setStrokeWidth(i);
        d();
    }

    public void setFillBackgroundEnabled(boolean z10) {
        if (z10 == this.f8265p) {
            return;
        }
        this.f8265p = z10;
        this.f8252b.setStyle(z10 ? Paint.Style.FILL_AND_STROKE : Paint.Style.STROKE);
        invalidate();
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f8269t = interpolator;
    }

    public void setMaxProgress(double d10) {
        this.f8262m = d10;
        if (d10 < this.f8263n) {
            setCurrentProgress(d10);
        }
        invalidate();
    }

    public void setProgressBackgroundColor(int i) {
        this.f8252b.setColor(i);
        invalidate();
    }

    public void setProgressBackgroundStrokeWidthDp(int i) {
        setProgressBackgroundStrokeWidthPx(c(i));
    }

    public void setProgressBackgroundStrokeWidthPx(int i) {
        this.f8252b.setStrokeWidth(i);
        d();
    }

    public void setProgressColor(int i) {
        this.f8251a.setColor(i);
        invalidate();
    }

    public void setProgressStrokeCap(int i) {
        Paint.Cap cap = i == 0 ? Paint.Cap.ROUND : Paint.Cap.BUTT;
        if (this.f8251a.getStrokeCap() != cap) {
            this.f8251a.setStrokeCap(cap);
            invalidate();
        }
    }

    public void setProgressStrokeWidthDp(int i) {
        setProgressStrokeWidthPx(c(i));
    }

    public void setProgressStrokeWidthPx(int i) {
        this.f8251a.setStrokeWidth(i);
        d();
    }

    public void setProgressTextAdapter(b bVar) {
        if (bVar != null) {
            this.f8268s = bVar;
        } else {
            this.f8268s = new antonkozyriatskyi.circularprogressindicator.a();
        }
        this.f8258h = this.f8268s.d(this.f8263n);
        d();
    }

    public void setShouldDrawDot(boolean z10) {
        this.f8261l = z10;
        if (this.f8253c.getStrokeWidth() > this.f8251a.getStrokeWidth()) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public void setStartAngle(int i) {
        this.f8255e = i;
        invalidate();
    }

    public void setTextColor(int i) {
        this.f8254d.setColor(i);
        Rect rect = new Rect();
        TextPaint textPaint = this.f8254d;
        String str = this.f8258h;
        textPaint.getTextBounds(str, 0, str.length(), rect);
        invalidate(rect);
    }

    public void setTextSizePx(int i) {
        float measureText = this.f8254d.measureText(this.f8258h) / this.f8254d.getTextSize();
        float width = this.f8257g.width() - (this.f8261l ? Math.max(this.f8253c.getStrokeWidth(), this.f8251a.getStrokeWidth()) : this.f8251a.getStrokeWidth());
        if (i * measureText >= width) {
            i = (int) (width / measureText);
        }
        this.f8254d.setTextSize(i);
        invalidate(b());
    }

    public void setTextSizeSp(int i) {
        setTextSizePx((int) TypedValue.applyDimension(2, i, getResources().getDisplayMetrics()));
    }

    public void setOnProgressChangeListener(a aVar) {
    }
}
