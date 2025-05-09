package N2;

import N2.c;
import N2.k;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import pa.C1124b;

/* compiled from: DeterminateDrawable.java */
/* loaded from: classes.dex */
public final class h<S extends c> extends j {

    /* renamed from: q, reason: collision with root package name */
    public static final a f2788q = new a("indicatorLevel");

    /* renamed from: l, reason: collision with root package name */
    public final k<S> f2789l;

    /* renamed from: m, reason: collision with root package name */
    public final H0.f f2790m;

    /* renamed from: n, reason: collision with root package name */
    public final H0.e f2791n;

    /* renamed from: o, reason: collision with root package name */
    public final k.a f2792o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2793p;

    /* compiled from: DeterminateDrawable.java */
    public class a extends H0.c<h<?>> {
        @Override // H0.c
        public final float getValue(h<?> hVar) {
            return hVar.f2792o.f2808b * 10000.0f;
        }

        @Override // H0.c
        public final void setValue(h<?> hVar, float f10) {
            h<?> hVar2 = hVar;
            hVar2.f2792o.f2808b = f10 / 10000.0f;
            hVar2.invalidateSelf();
        }
    }

    public h(Context context, c cVar, k<S> kVar) {
        super(context, cVar);
        this.f2793p = false;
        this.f2789l = kVar;
        this.f2792o = new k.a();
        H0.f fVar = new H0.f();
        this.f2790m = fVar;
        fVar.a(1.0f);
        fVar.b(50.0f);
        H0.e eVar = new H0.e(this, f2788q);
        eVar.f1406t = Float.MAX_VALUE;
        eVar.f1407u = false;
        this.f2791n = eVar;
        eVar.f1405s = fVar;
        if (this.f2804h != 1.0f) {
            this.f2804h = 1.0f;
            invalidateSelf();
        }
    }

    @Override // N2.j
    public final boolean d(boolean z10, boolean z11, boolean z12) {
        boolean d10 = super.d(z10, z11, z12);
        N2.a aVar = this.f2799c;
        ContentResolver contentResolver = this.f2797a.getContentResolver();
        aVar.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f10 == 0.0f) {
            this.f2793p = true;
        } else {
            this.f2793p = false;
            this.f2790m.b(50.0f / f10);
        }
        return d10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            k<S> kVar = this.f2789l;
            Rect bounds = getBounds();
            float b9 = b();
            ValueAnimator valueAnimator = this.f2800d;
            boolean z10 = valueAnimator != null && valueAnimator.isRunning();
            ValueAnimator valueAnimator2 = this.f2801e;
            boolean z11 = valueAnimator2 != null && valueAnimator2.isRunning();
            kVar.f2806a.a();
            kVar.a(canvas, bounds, b9, z10, z11);
            Paint paint = this.i;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            c cVar = this.f2798b;
            int i = cVar.f2762c[0];
            k.a aVar = this.f2792o;
            aVar.f2809c = i;
            int i9 = cVar.f2766g;
            if (i9 > 0) {
                if (!(this.f2789l instanceof n)) {
                    i9 = (int) ((C1124b.r(aVar.f2808b, 0.0f, 0.01f) * i9) / 0.01f);
                }
                this.f2789l.d(canvas, paint, aVar.f2808b, 1.0f, cVar.f2763d, this.f2805j, i9);
            } else {
                this.f2789l.d(canvas, paint, 0.0f, 1.0f, cVar.f2763d, this.f2805j, 0);
            }
            this.f2789l.c(canvas, paint, aVar, this.f2805j);
            this.f2789l.b(canvas, paint, cVar.f2762c[0], this.f2805j);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2789l.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2789l.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f2791n.f();
        this.f2792o.f2808b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z10 = this.f2793p;
        k.a aVar = this.f2792o;
        H0.e eVar = this.f2791n;
        if (z10) {
            eVar.f();
            aVar.f2808b = i / 10000.0f;
            invalidateSelf();
        } else {
            eVar.f1391b = aVar.f2808b * 10000.0f;
            eVar.f1392c = true;
            eVar.e(i);
        }
        return true;
    }
}
