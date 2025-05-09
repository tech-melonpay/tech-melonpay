package N2;

import N2.k;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: CircularDrawingDelegate.java */
/* loaded from: classes.dex */
public final class d extends k<g> {

    /* renamed from: b, reason: collision with root package name */
    public float f2767b;

    /* renamed from: c, reason: collision with root package name */
    public float f2768c;

    /* renamed from: d, reason: collision with root package name */
    public float f2769d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2770e;

    /* renamed from: f, reason: collision with root package name */
    public float f2771f;

    @Override // N2.k
    public final void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        float width = rect.width() / i();
        float height = rect.height() / i();
        S s10 = this.f2806a;
        float f11 = (((g) s10).f2786h / 2.0f) + ((g) s10).i;
        canvas.translate((f11 * width) + rect.left, (f11 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (((g) s10).f2787j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        this.f2770e = ((g) s10).f2760a / 2 <= ((g) s10).f2761b;
        this.f2767b = ((g) s10).f2760a * f10;
        this.f2768c = Math.min(((g) s10).f2760a / 2, ((g) s10).f2761b) * f10;
        float f13 = (((g) s10).f2786h - ((g) s10).f2760a) / 2.0f;
        this.f2769d = f13;
        if (z10 || z11) {
            if ((z10 && ((g) s10).f2764e == 2) || (z11 && ((g) s10).f2765f == 1)) {
                this.f2769d = (((1.0f - f10) * ((g) s10).f2760a) / 2.0f) + f13;
            } else if ((z10 && ((g) s10).f2764e == 1) || (z11 && ((g) s10).f2765f == 2)) {
                this.f2769d = f13 - (((1.0f - f10) * ((g) s10).f2760a) / 2.0f);
            }
        }
        if (z11 && ((g) s10).f2765f == 3) {
            this.f2771f = f10;
        } else {
            this.f2771f = 1.0f;
        }
    }

    @Override // N2.k
    public final void c(Canvas canvas, Paint paint, k.a aVar, int i) {
        int m2 = D9.b.m(aVar.f2809c, i);
        float f10 = aVar.f2807a;
        float f11 = aVar.f2808b;
        int i9 = aVar.f2810d;
        g(canvas, paint, f10, f11, m2, i9, i9);
    }

    @Override // N2.k
    public final void d(Canvas canvas, Paint paint, float f10, float f11, int i, int i9, int i10) {
        g(canvas, paint, f10, f11, D9.b.m(i, i9), i10, i10);
    }

    @Override // N2.k
    public final int e() {
        return i();
    }

    @Override // N2.k
    public final int f() {
        return i();
    }

    public final void g(Canvas canvas, Paint paint, float f10, float f11, int i, int i9, int i10) {
        float f12 = f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10;
        float f13 = f10 % 1.0f;
        if (this.f2771f < 1.0f) {
            float f14 = f13 + f12;
            if (f14 > 1.0f) {
                g(canvas, paint, f13, 1.0f, i, i9, 0);
                g(canvas, paint, 1.0f, f14, i, 0, i10);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f2768c / this.f2769d);
        if (f13 == 0.0f && f12 >= 0.99f) {
            f12 += (((degrees * 2.0f) / 360.0f) * (f12 - 0.99f)) / 0.01f;
        }
        float p10 = Ja.a.p(1.0f - this.f2771f, 1.0f, f13);
        float p11 = Ja.a.p(0.0f, this.f2771f, f12);
        float degrees2 = (float) Math.toDegrees(i9 / this.f2769d);
        float degrees3 = ((p11 * 360.0f) - degrees2) - ((float) Math.toDegrees(i10 / this.f2769d));
        float f15 = (p10 * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f2767b);
        float f16 = degrees * 2.0f;
        if (degrees3 < f16) {
            float f17 = degrees3 / f16;
            paint.setStyle(Paint.Style.FILL);
            h(canvas, paint, (degrees * f17) + f15, this.f2768c * 2.0f, this.f2767b, f17);
            return;
        }
        float f18 = this.f2769d;
        float f19 = -f18;
        RectF rectF = new RectF(f19, f19, f18, f18);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f2770e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f20 = f15 + degrees;
        canvas.drawArc(rectF, f20, degrees3 - f16, false, paint);
        if (this.f2770e || this.f2768c <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, f20, this.f2768c * 2.0f, this.f2767b, 1.0f);
        h(canvas, paint, (f15 + degrees3) - degrees, this.f2768c * 2.0f, this.f2767b, 1.0f);
    }

    public final void h(Canvas canvas, Paint paint, float f10, float f11, float f12, float f13) {
        float min = (int) Math.min(f12, this.f2767b);
        float f14 = f11 / 2.0f;
        float min2 = Math.min(f14, (this.f2768c * min) / this.f2767b);
        RectF rectF = new RectF((-min) / 2.0f, (-f11) / 2.0f, min / 2.0f, f14);
        canvas.save();
        double d10 = f10;
        canvas.translate((float) (Math.cos(Math.toRadians(d10)) * this.f2769d), (float) (Math.sin(Math.toRadians(d10)) * this.f2769d));
        canvas.rotate(f10);
        canvas.scale(f13, f13);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int i() {
        S s10 = this.f2806a;
        return (((g) s10).i * 2) + ((g) s10).f2786h;
    }

    @Override // N2.k
    public final void b(Canvas canvas, Paint paint, int i, int i9) {
    }
}
