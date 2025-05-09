package N2;

import N2.b;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import java.util.ArrayList;
import u2.C1512a;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes.dex */
public abstract class j extends Drawable implements Animatable {

    /* renamed from: k, reason: collision with root package name */
    public static final a f2796k = new a(Float.class, "growFraction");

    /* renamed from: a, reason: collision with root package name */
    public final Context f2797a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2798b;

    /* renamed from: d, reason: collision with root package name */
    public ValueAnimator f2800d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f2801e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f2802f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2803g;

    /* renamed from: h, reason: collision with root package name */
    public float f2804h;

    /* renamed from: j, reason: collision with root package name */
    public int f2805j;
    public final Paint i = new Paint();

    /* renamed from: c, reason: collision with root package name */
    public N2.a f2799c = new N2.a();

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    public class a extends Property<j, Float> {
        @Override // android.util.Property
        public final Float get(j jVar) {
            return Float.valueOf(jVar.b());
        }

        @Override // android.util.Property
        public final void set(j jVar, Float f10) {
            j jVar2 = jVar;
            float floatValue = f10.floatValue();
            if (jVar2.f2804h != floatValue) {
                jVar2.f2804h = floatValue;
                jVar2.invalidateSelf();
            }
        }
    }

    public j(Context context, c cVar) {
        this.f2797a = context;
        this.f2798b = cVar;
        setAlpha(255);
    }

    public final float b() {
        c cVar = this.f2798b;
        if (cVar.f2764e == 0 && cVar.f2765f == 0) {
            return 1.0f;
        }
        return this.f2804h;
    }

    public final boolean c(boolean z10, boolean z11, boolean z12) {
        N2.a aVar = this.f2799c;
        ContentResolver contentResolver = this.f2797a.getContentResolver();
        aVar.getClass();
        return d(z10, z11, z12 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean d(boolean z10, boolean z11, boolean z12) {
        int i = 1;
        int i9 = 0;
        ValueAnimator valueAnimator = this.f2800d;
        a aVar = f2796k;
        if (valueAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.f2800d = ofFloat;
            ofFloat.setDuration(500L);
            this.f2800d.setInterpolator(C1512a.f30142b);
            ValueAnimator valueAnimator2 = this.f2800d;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f2800d = valueAnimator2;
            valueAnimator2.addListener(new i(this, i9));
        }
        if (this.f2801e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f, 0.0f);
            this.f2801e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f2801e.setInterpolator(C1512a.f30142b);
            ValueAnimator valueAnimator3 = this.f2801e;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f2801e = valueAnimator3;
            valueAnimator3.addListener(new i(this, i));
        }
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator4 = z10 ? this.f2800d : this.f2801e;
        ValueAnimator valueAnimator5 = z10 ? this.f2801e : this.f2800d;
        if (!z12) {
            if (valueAnimator5.isRunning()) {
                boolean z13 = this.f2803g;
                this.f2803g = true;
                new ValueAnimator[]{valueAnimator5}[0].cancel();
                this.f2803g = z13;
            }
            if (valueAnimator4.isRunning()) {
                valueAnimator4.end();
            } else {
                boolean z14 = this.f2803g;
                this.f2803g = true;
                new ValueAnimator[]{valueAnimator4}[0].end();
                this.f2803g = z14;
            }
            return super.setVisible(z10, false);
        }
        if (valueAnimator4.isRunning()) {
            return false;
        }
        boolean z15 = !z10 || super.setVisible(z10, false);
        c cVar = this.f2798b;
        if (!z10 ? cVar.f2765f != 0 : cVar.f2764e != 0) {
            boolean z16 = this.f2803g;
            this.f2803g = true;
            new ValueAnimator[]{valueAnimator4}[0].end();
            this.f2803g = z16;
            return z15;
        }
        if (z11 || !valueAnimator4.isPaused()) {
            valueAnimator4.start();
        } else {
            valueAnimator4.resume();
        }
        return z15;
    }

    public final void e(b.d dVar) {
        ArrayList arrayList = this.f2802f;
        if (arrayList == null || !arrayList.contains(dVar)) {
            return;
        }
        this.f2802f.remove(dVar);
        if (this.f2802f.isEmpty()) {
            this.f2802f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2805j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f2800d;
        return (valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = this.f2801e) != null && valueAnimator.isRunning());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f2805j = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        return c(z10, z11, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
