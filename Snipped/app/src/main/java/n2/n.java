package N2;

import N2.k;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import pa.C1124b;

/* compiled from: LinearDrawingDelegate.java */
/* loaded from: classes.dex */
public final class n extends k<s> {

    /* renamed from: b, reason: collision with root package name */
    public float f2816b;

    /* renamed from: c, reason: collision with root package name */
    public float f2817c;

    /* renamed from: d, reason: collision with root package name */
    public float f2818d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2819e;

    /* renamed from: f, reason: collision with root package name */
    public float f2820f;

    @Override // N2.k
    public final void a(Canvas canvas, Rect rect, float f10, boolean z10, boolean z11) {
        this.f2816b = rect.width();
        S s10 = this.f2806a;
        float f11 = ((s) s10).f2760a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f11) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((s) s10).f2842j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f12 = this.f2816b / 2.0f;
        float f13 = f11 / 2.0f;
        canvas.clipRect(-f12, -f13, f12, f13);
        this.f2819e = ((s) s10).f2760a / 2 == ((s) s10).f2761b;
        this.f2817c = ((s) s10).f2760a * f10;
        this.f2818d = Math.min(((s) s10).f2760a / 2, ((s) s10).f2761b) * f10;
        if (z10 || z11) {
            if ((z10 && ((s) s10).f2764e == 2) || (z11 && ((s) s10).f2765f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z10 || (z11 && ((s) s10).f2765f != 3)) {
                canvas.translate(0.0f, ((1.0f - f10) * ((s) s10).f2760a) / 2.0f);
            }
        }
        if (z11 && ((s) s10).f2765f == 3) {
            this.f2820f = f10;
        } else {
            this.f2820f = 1.0f;
        }
    }

    @Override // N2.k
    public final void b(Canvas canvas, Paint paint, int i, int i9) {
        int m2 = D9.b.m(i, i9);
        s sVar = (s) this.f2806a;
        if (sVar.f2843k <= 0 || m2 == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(m2);
        PointF pointF = new PointF((this.f2816b / 2.0f) - (this.f2817c / 2.0f), 0.0f);
        int i10 = sVar.f2843k;
        h(canvas, paint, pointF, null, i10, i10);
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
        return ((s) this.f2806a).f2760a;
    }

    @Override // N2.k
    public final int f() {
        return -1;
    }

    public final void g(Canvas canvas, Paint paint, float f10, float f11, int i, int i9, int i10) {
        float r8 = C1124b.r(f10, 0.0f, 1.0f);
        float r10 = C1124b.r(f11, 0.0f, 1.0f);
        float p10 = Ja.a.p(1.0f - this.f2820f, 1.0f, r8);
        float p11 = Ja.a.p(1.0f - this.f2820f, 1.0f, r10);
        int r11 = (int) ((C1124b.r(p10, 0.0f, 0.01f) * i9) / 0.01f);
        float r12 = 1.0f - C1124b.r(p11, 0.99f, 1.0f);
        float f12 = this.f2816b;
        int i11 = (int) ((p10 * f12) + r11);
        int i12 = (int) ((p11 * f12) - ((int) ((r12 * i10) / 0.01f)));
        float f13 = (-f12) / 2.0f;
        if (i11 <= i12) {
            float f14 = this.f2818d;
            float f15 = i11 + f14;
            float f16 = i12 - f14;
            float f17 = f14 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f2817c);
            if (f15 >= f16) {
                h(canvas, paint, new PointF(f15 + f13, 0.0f), new PointF(f16 + f13, 0.0f), f17, this.f2817c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f2819e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f18 = f15 + f13;
            float f19 = f16 + f13;
            canvas.drawLine(f18, 0.0f, f19, 0.0f, paint);
            if (this.f2819e || this.f2818d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f15 > 0.0f) {
                h(canvas, paint, new PointF(f18, 0.0f), null, f17, this.f2817c);
            }
            if (f16 < this.f2816b) {
                h(canvas, paint, new PointF(f19, 0.0f), null, f17, this.f2817c);
            }
        }
    }

    public final void h(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f10, float f11) {
        float min = Math.min(f11, this.f2817c);
        float f12 = f10 / 2.0f;
        float min2 = Math.min(f12, (this.f2818d * min) / this.f2817c);
        RectF rectF = new RectF((-f10) / 2.0f, (-min) / 2.0f, f12, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
