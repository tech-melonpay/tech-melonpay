package i1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public final class d extends Drawable implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final LinearInterpolator f21250g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    public static final P0.a f21251h = new P0.a(1);
    public static final int[] i = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    public final a f21252a;

    /* renamed from: b, reason: collision with root package name */
    public float f21253b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f21254c;

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f21255d;

    /* renamed from: e, reason: collision with root package name */
    public float f21256e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21257f;

    /* compiled from: CircularProgressDrawable.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final RectF f21258a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public final Paint f21259b;

        /* renamed from: c, reason: collision with root package name */
        public final Paint f21260c;

        /* renamed from: d, reason: collision with root package name */
        public final Paint f21261d;

        /* renamed from: e, reason: collision with root package name */
        public float f21262e;

        /* renamed from: f, reason: collision with root package name */
        public float f21263f;

        /* renamed from: g, reason: collision with root package name */
        public float f21264g;

        /* renamed from: h, reason: collision with root package name */
        public float f21265h;
        public int[] i;

        /* renamed from: j, reason: collision with root package name */
        public int f21266j;

        /* renamed from: k, reason: collision with root package name */
        public float f21267k;

        /* renamed from: l, reason: collision with root package name */
        public float f21268l;

        /* renamed from: m, reason: collision with root package name */
        public float f21269m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f21270n;

        /* renamed from: o, reason: collision with root package name */
        public Path f21271o;

        /* renamed from: p, reason: collision with root package name */
        public float f21272p;

        /* renamed from: q, reason: collision with root package name */
        public float f21273q;

        /* renamed from: r, reason: collision with root package name */
        public int f21274r;

        /* renamed from: s, reason: collision with root package name */
        public int f21275s;

        /* renamed from: t, reason: collision with root package name */
        public int f21276t;

        /* renamed from: u, reason: collision with root package name */
        public int f21277u;

        public a() {
            Paint paint = new Paint();
            this.f21259b = paint;
            Paint paint2 = new Paint();
            this.f21260c = paint2;
            Paint paint3 = new Paint();
            this.f21261d = paint3;
            this.f21262e = 0.0f;
            this.f21263f = 0.0f;
            this.f21264g = 0.0f;
            this.f21265h = 5.0f;
            this.f21272p = 1.0f;
            this.f21276t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i) {
            this.f21266j = i;
            this.f21277u = this.i[i];
        }
    }

    public d(Context context) {
        context.getClass();
        this.f21254c = context.getResources();
        a aVar = new a();
        this.f21252a = aVar;
        aVar.i = i;
        aVar.a(0);
        aVar.f21265h = 2.5f;
        aVar.f21259b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f21250g);
        ofFloat.addListener(new c(this, aVar));
        this.f21255d = ofFloat;
    }

    public static void d(float f10, a aVar) {
        if (f10 <= 0.75f) {
            aVar.f21277u = aVar.i[aVar.f21266j];
            return;
        }
        float f11 = (f10 - 0.75f) / 0.25f;
        int[] iArr = aVar.i;
        int i9 = aVar.f21266j;
        int i10 = iArr[i9];
        int i11 = iArr[(i9 + 1) % iArr.length];
        aVar.f21277u = ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r1) * f11))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r3) * f11))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r4) * f11))) << 8) | ((i10 & 255) + ((int) (f11 * ((i11 & 255) - r2))));
    }

    public final void a(float f10, a aVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f21257f) {
            d(f10, aVar);
            float floor = (float) (Math.floor(aVar.f21269m / 0.8f) + 1.0d);
            float f12 = aVar.f21267k;
            float f13 = aVar.f21268l;
            aVar.f21262e = (((f13 - 0.01f) - f12) * f10) + f12;
            aVar.f21263f = f13;
            float f14 = aVar.f21269m;
            aVar.f21264g = com.google.android.gms.measurement.internal.a.d(floor, f14, f10, f14);
            return;
        }
        if (f10 != 1.0f || z10) {
            float f15 = aVar.f21269m;
            P0.a aVar2 = f21251h;
            if (f10 < 0.5f) {
                interpolation = aVar.f21267k;
                f11 = (aVar2.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f16 = aVar.f21267k + 0.79f;
                interpolation = f16 - (((1.0f - aVar2.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = f16;
            }
            float f17 = (0.20999998f * f10) + f15;
            float f18 = (f10 + this.f21256e) * 216.0f;
            aVar.f21262e = interpolation;
            aVar.f21263f = f11;
            aVar.f21264g = f17;
            this.f21253b = f18;
        }
    }

    public final void b(float f10, float f11, float f12, float f13) {
        float f14 = this.f21254c.getDisplayMetrics().density;
        float f15 = f11 * f14;
        a aVar = this.f21252a;
        aVar.f21265h = f15;
        aVar.f21259b.setStrokeWidth(f15);
        aVar.f21273q = f10 * f14;
        aVar.a(0);
        aVar.f21274r = (int) (f12 * f14);
        aVar.f21275s = (int) (f13 * f14);
    }

    public final void c(int i9) {
        if (i9 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f21253b, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f21252a;
        RectF rectF = aVar.f21258a;
        float f10 = aVar.f21273q;
        float f11 = (aVar.f21265h / 2.0f) + f10;
        if (f10 <= 0.0f) {
            f11 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.f21274r * aVar.f21272p) / 2.0f, aVar.f21265h / 2.0f);
        }
        rectF.set(bounds.centerX() - f11, bounds.centerY() - f11, bounds.centerX() + f11, bounds.centerY() + f11);
        float f12 = aVar.f21262e;
        float f13 = aVar.f21264g;
        float f14 = (f12 + f13) * 360.0f;
        float f15 = ((aVar.f21263f + f13) * 360.0f) - f14;
        Paint paint = aVar.f21259b;
        paint.setColor(aVar.f21277u);
        paint.setAlpha(aVar.f21276t);
        float f16 = aVar.f21265h / 2.0f;
        rectF.inset(f16, f16);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f21261d);
        float f17 = -f16;
        rectF.inset(f17, f17);
        canvas.drawArc(rectF, f14, f15, false, paint);
        if (aVar.f21270n) {
            Path path = aVar.f21271o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f21271o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f18 = (aVar.f21274r * aVar.f21272p) / 2.0f;
            aVar.f21271o.moveTo(0.0f, 0.0f);
            aVar.f21271o.lineTo(aVar.f21274r * aVar.f21272p, 0.0f);
            Path path3 = aVar.f21271o;
            float f19 = aVar.f21274r;
            float f20 = aVar.f21272p;
            path3.lineTo((f19 * f20) / 2.0f, aVar.f21275s * f20);
            aVar.f21271o.offset((rectF.centerX() + min) - f18, (aVar.f21265h / 2.0f) + rectF.centerY());
            aVar.f21271o.close();
            Paint paint2 = aVar.f21260c;
            paint2.setColor(aVar.f21277u);
            paint2.setAlpha(aVar.f21276t);
            canvas.save();
            canvas.rotate(f14 + f15, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f21271o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f21252a.f21276t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f21255d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.f21252a.f21276t = i9;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21252a.f21259b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f21255d.cancel();
        a aVar = this.f21252a;
        float f10 = aVar.f21262e;
        aVar.f21267k = f10;
        float f11 = aVar.f21263f;
        aVar.f21268l = f11;
        aVar.f21269m = aVar.f21264g;
        if (f11 != f10) {
            this.f21257f = true;
            this.f21255d.setDuration(666L);
            this.f21255d.start();
            return;
        }
        aVar.a(0);
        aVar.f21267k = 0.0f;
        aVar.f21268l = 0.0f;
        aVar.f21269m = 0.0f;
        aVar.f21262e = 0.0f;
        aVar.f21263f = 0.0f;
        aVar.f21264g = 0.0f;
        this.f21255d.setDuration(1332L);
        this.f21255d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f21255d.cancel();
        this.f21253b = 0.0f;
        a aVar = this.f21252a;
        if (aVar.f21270n) {
            aVar.f21270n = false;
        }
        aVar.a(0);
        aVar.f21267k = 0.0f;
        aVar.f21268l = 0.0f;
        aVar.f21269m = 0.0f;
        aVar.f21262e = 0.0f;
        aVar.f21263f = 0.0f;
        aVar.f21264g = 0.0f;
        invalidateSelf();
    }
}
