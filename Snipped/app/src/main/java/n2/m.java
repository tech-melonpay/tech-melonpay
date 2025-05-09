package N2;

import N2.c;
import N2.k;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;

/* compiled from: IndeterminateDrawable.java */
/* loaded from: classes.dex */
public final class m<S extends c> extends j {

    /* renamed from: l, reason: collision with root package name */
    public final k<S> f2813l;

    /* renamed from: m, reason: collision with root package name */
    public l<ObjectAnimator> f2814m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2815n;

    public m(Context context, c cVar, k<S> kVar, l<ObjectAnimator> lVar) {
        super(context, cVar);
        this.f2813l = kVar;
        this.f2814m = lVar;
        lVar.f2811a = this;
    }

    @Override // N2.j
    public final boolean d(boolean z10, boolean z11, boolean z12) {
        Drawable drawable;
        boolean d10 = super.d(z10, z11, z12);
        if (this.f2799c != null && Settings.Global.getFloat(this.f2797a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (drawable = this.f2815n) != null) {
            return drawable.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.f2814m.a();
        }
        if (z10 && z12) {
            this.f2814m.f();
        }
        return d10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            boolean z10 = this.f2799c != null && Settings.Global.getFloat(this.f2797a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f;
            c cVar = this.f2798b;
            if (z10 && (drawable = this.f2815n) != null) {
                drawable.setBounds(getBounds());
                this.f2815n.setTint(cVar.f2762c[0]);
                this.f2815n.draw(canvas);
                return;
            }
            canvas.save();
            k<S> kVar = this.f2813l;
            Rect bounds = getBounds();
            float b9 = b();
            ValueAnimator valueAnimator = this.f2800d;
            boolean z11 = valueAnimator != null && valueAnimator.isRunning();
            ValueAnimator valueAnimator2 = this.f2801e;
            boolean z12 = valueAnimator2 != null && valueAnimator2.isRunning();
            kVar.f2806a.a();
            kVar.a(canvas, bounds, b9, z11, z12);
            int i = cVar.f2766g;
            int i9 = this.f2805j;
            Paint paint = this.i;
            if (i == 0) {
                this.f2813l.d(canvas, paint, 0.0f, 1.0f, cVar.f2763d, i9, 0);
            } else {
                k.a aVar = (k.a) this.f2814m.f2812b.get(0);
                k.a aVar2 = (k.a) com.google.android.gms.measurement.internal.a.f(1, this.f2814m.f2812b);
                k<S> kVar2 = this.f2813l;
                if (kVar2 instanceof n) {
                    kVar2.d(canvas, paint, 0.0f, aVar.f2807a, cVar.f2763d, i9, i);
                    this.f2813l.d(canvas, paint, aVar2.f2808b, 1.0f, cVar.f2763d, i9, i);
                } else {
                    i9 = 0;
                    kVar2.d(canvas, paint, aVar2.f2808b, aVar.f2807a + 1.0f, cVar.f2763d, 0, i);
                }
            }
            for (int i10 = 0; i10 < this.f2814m.f2812b.size(); i10++) {
                k.a aVar3 = (k.a) this.f2814m.f2812b.get(i10);
                this.f2813l.c(canvas, paint, aVar3, this.f2805j);
                if (i10 > 0 && i > 0) {
                    this.f2813l.d(canvas, paint, ((k.a) this.f2814m.f2812b.get(i10 - 1)).f2808b, aVar3.f2807a, cVar.f2763d, i9, i);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2813l.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2813l.f();
    }
}
