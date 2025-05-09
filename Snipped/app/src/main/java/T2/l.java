package T2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f3529a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f3530b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f3531c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f3532d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f3533e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f3534f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3535g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3536h = new ArrayList();

    /* compiled from: ShapePath.java */
    public static class a extends f {

        /* renamed from: c, reason: collision with root package name */
        public final c f3537c;

        public a(c cVar) {
            this.f3537c = cVar;
        }

        @Override // T2.l.f
        public final void a(Matrix matrix, S2.a aVar, int i, Canvas canvas) {
            c cVar = this.f3537c;
            float f10 = cVar.f3546f;
            float f11 = cVar.f3547g;
            RectF rectF = new RectF(cVar.f3542b, cVar.f3543c, cVar.f3544d, cVar.f3545e);
            aVar.getClass();
            boolean z10 = f11 < 0.0f;
            Path path = aVar.f3373g;
            int[] iArr = S2.a.f3365k;
            if (z10) {
                iArr[0] = 0;
                iArr[1] = aVar.f3372f;
                iArr[2] = aVar.f3371e;
                iArr[3] = aVar.f3370d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f10, f11);
                path.close();
                float f12 = -i;
                rectF.inset(f12, f12);
                iArr[0] = 0;
                iArr[1] = aVar.f3370d;
                iArr[2] = aVar.f3371e;
                iArr[3] = aVar.f3372f;
            }
            float width = rectF.width() / 2.0f;
            if (width <= 0.0f) {
                return;
            }
            float f13 = 1.0f - (i / width);
            float[] fArr = S2.a.f3366l;
            fArr[1] = f13;
            fArr[2] = ((1.0f - f13) / 2.0f) + f13;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aVar.f3368b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f3374h);
            }
            canvas.drawArc(rectF, f10, f11, true, paint);
            canvas.restore();
        }
    }

    /* compiled from: ShapePath.java */
    public static class b extends f {

        /* renamed from: c, reason: collision with root package name */
        public final d f3538c;

        /* renamed from: d, reason: collision with root package name */
        public final float f3539d;

        /* renamed from: e, reason: collision with root package name */
        public final float f3540e;

        public b(d dVar, float f10, float f11) {
            this.f3538c = dVar;
            this.f3539d = f10;
            this.f3540e = f11;
        }

        @Override // T2.l.f
        public final void a(Matrix matrix, S2.a aVar, int i, Canvas canvas) {
            d dVar = this.f3538c;
            float f10 = dVar.f3549c;
            float f11 = this.f3540e;
            float f12 = dVar.f3548b;
            float f13 = this.f3539d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
            Matrix matrix2 = this.f3552a;
            matrix2.set(matrix);
            matrix2.preTranslate(f13, f11);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = S2.a.i;
            iArr[0] = aVar.f3372f;
            iArr[1] = aVar.f3371e;
            iArr[2] = aVar.f3370d;
            Paint paint = aVar.f3369c;
            float f14 = rectF.left;
            paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, S2.a.f3364j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f3538c;
            return (float) Math.toDegrees(Math.atan((dVar.f3549c - this.f3540e) / (dVar.f3548b - this.f3539d)));
        }
    }

    /* compiled from: ShapePath.java */
    public static class c extends e {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f3541h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final float f3542b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public final float f3543c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final float f3544d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public final float f3545e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f3546f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f3547g;

        public c(float f10, float f11, float f12, float f13) {
            this.f3542b = f10;
            this.f3543c = f11;
            this.f3544d = f12;
            this.f3545e = f13;
        }

        @Override // T2.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f3550a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f3541h;
            rectF.set(this.f3542b, this.f3543c, this.f3544d, this.f3545e);
            path.arcTo(rectF, this.f3546f, this.f3547g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static class d extends e {

        /* renamed from: b, reason: collision with root package name */
        public float f3548b;

        /* renamed from: c, reason: collision with root package name */
        public float f3549c;

        @Override // T2.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f3550a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f3548b, this.f3549c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f3550a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    public static abstract class f {

        /* renamed from: b, reason: collision with root package name */
        public static final Matrix f3551b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f3552a = new Matrix();

        public abstract void a(Matrix matrix, S2.a aVar, int i, Canvas canvas);
    }

    public l() {
        e(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        c cVar = new c(f10, f11, f12, f13);
        cVar.f3546f = f14;
        cVar.f3547g = f15;
        this.f3535g.add(cVar);
        a aVar = new a(cVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        float f17 = z10 ? (180.0f + f16) % 360.0f : f16;
        b(f14);
        this.f3536h.add(aVar);
        this.f3533e = f17;
        double d10 = f16;
        this.f3531c = (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
        this.f3532d = (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f11 + f13) * 0.5f);
    }

    public final void b(float f10) {
        float f11 = this.f3533e;
        if (f11 == f10) {
            return;
        }
        float f12 = ((f10 - f11) + 360.0f) % 360.0f;
        if (f12 > 180.0f) {
            return;
        }
        float f13 = this.f3531c;
        float f14 = this.f3532d;
        c cVar = new c(f13, f14, f13, f14);
        cVar.f3546f = this.f3533e;
        cVar.f3547g = f12;
        this.f3536h.add(new a(cVar));
        this.f3533e = f10;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f3535g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void d(float f10, float f11) {
        d dVar = new d();
        dVar.f3548b = f10;
        dVar.f3549c = f11;
        this.f3535g.add(dVar);
        b bVar = new b(dVar, this.f3531c, this.f3532d);
        float b9 = bVar.b() + 270.0f;
        float b10 = bVar.b() + 270.0f;
        b(b9);
        this.f3536h.add(bVar);
        this.f3533e = b10;
        this.f3531c = f10;
        this.f3532d = f11;
    }

    public final void e(float f10, float f11, float f12) {
        this.f3529a = 0.0f;
        this.f3530b = f10;
        this.f3531c = 0.0f;
        this.f3532d = f10;
        this.f3533e = f11;
        this.f3534f = (f11 + f12) % 360.0f;
        this.f3535g.clear();
        this.f3536h.clear();
    }
}
