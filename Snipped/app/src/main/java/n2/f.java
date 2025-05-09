package N2;

import N2.b;
import N2.k;
import android.animation.ObjectAnimator;
import android.util.Property;
import java.util.ArrayList;
import l1.AbstractC0978c;
import u2.C1514c;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes.dex */
public final class f extends l<ObjectAnimator> {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2774k = {0, 1350, 2700, 4050};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f2775l = {667, 2017, 3367, 4717};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f2776m = {1000, 2350, 3700, 5050};

    /* renamed from: n, reason: collision with root package name */
    public static final a f2777n = new a(Float.class, "animationFraction");

    /* renamed from: o, reason: collision with root package name */
    public static final b f2778o = new b(Float.class, "completeEndFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f2779c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f2780d;

    /* renamed from: e, reason: collision with root package name */
    public final P0.a f2781e;

    /* renamed from: f, reason: collision with root package name */
    public final g f2782f;

    /* renamed from: g, reason: collision with root package name */
    public int f2783g;

    /* renamed from: h, reason: collision with root package name */
    public float f2784h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0978c f2785j;

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class a extends Property<f, Float> {
        @Override // android.util.Property
        public final Float get(f fVar) {
            return Float.valueOf(fVar.f2784h);
        }

        @Override // android.util.Property
        public final void set(f fVar, Float f10) {
            P0.a aVar;
            f fVar2 = fVar;
            float floatValue = f10.floatValue();
            fVar2.f2784h = floatValue;
            int i = (int) (floatValue * 5400.0f);
            ArrayList arrayList = fVar2.f2812b;
            k.a aVar2 = (k.a) arrayList.get(0);
            float f11 = fVar2.f2784h * 1520.0f;
            aVar2.f2807a = (-20.0f) + f11;
            aVar2.f2808b = f11;
            int i9 = 0;
            while (true) {
                aVar = fVar2.f2781e;
                if (i9 >= 4) {
                    break;
                }
                aVar2.f2808b = (aVar.getInterpolation(l.b(i, f.f2774k[i9], 667)) * 250.0f) + aVar2.f2808b;
                aVar2.f2807a = (aVar.getInterpolation(l.b(i, f.f2775l[i9], 667)) * 250.0f) + aVar2.f2807a;
                i9++;
            }
            float f12 = aVar2.f2807a;
            float f13 = aVar2.f2808b;
            aVar2.f2807a = (((f13 - f12) * fVar2.i) + f12) / 360.0f;
            aVar2.f2808b = f13 / 360.0f;
            int i10 = 0;
            while (true) {
                if (i10 >= 4) {
                    break;
                }
                float b9 = l.b(i, f.f2776m[i10], 333);
                if (b9 >= 0.0f && b9 <= 1.0f) {
                    int i11 = i10 + fVar2.f2783g;
                    int[] iArr = fVar2.f2782f.f2762c;
                    int length = i11 % iArr.length;
                    int length2 = (length + 1) % iArr.length;
                    int i12 = iArr[length];
                    int i13 = iArr[length2];
                    ((k.a) arrayList.get(0)).f2809c = C1514c.a(aVar.getInterpolation(b9), Integer.valueOf(i12), Integer.valueOf(i13)).intValue();
                    break;
                }
                i10++;
            }
            fVar2.f2811a.invalidateSelf();
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate.java */
    public class b extends Property<f, Float> {
        @Override // android.util.Property
        public final Float get(f fVar) {
            return Float.valueOf(fVar.i);
        }

        @Override // android.util.Property
        public final void set(f fVar, Float f10) {
            fVar.i = f10.floatValue();
        }
    }

    public f(g gVar) {
        super(1);
        this.f2783g = 0;
        this.f2785j = null;
        this.f2782f = gVar;
        this.f2781e = new P0.a(1);
    }

    @Override // N2.l
    public final void a() {
        ObjectAnimator objectAnimator = this.f2779c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // N2.l
    public final void c() {
        this.f2783g = 0;
        ((k.a) this.f2812b.get(0)).f2809c = this.f2782f.f2762c[0];
        this.i = 0.0f;
    }

    @Override // N2.l
    public final void d(b.c cVar) {
        this.f2785j = cVar;
    }

    @Override // N2.l
    public final void e() {
        ObjectAnimator objectAnimator = this.f2780d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f2811a.isVisible()) {
            this.f2780d.start();
        } else {
            a();
        }
    }

    @Override // N2.l
    public final void f() {
        if (this.f2779c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f2777n, 0.0f, 1.0f);
            this.f2779c = ofFloat;
            ofFloat.setDuration(5400L);
            this.f2779c.setInterpolator(null);
            this.f2779c.setRepeatCount(-1);
            this.f2779c.addListener(new e(this, 0));
        }
        if (this.f2780d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f2778o, 0.0f, 1.0f);
            this.f2780d = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f2780d.setInterpolator(this.f2781e);
            this.f2780d.addListener(new e(this, 1));
        }
        this.f2783g = 0;
        ((k.a) this.f2812b.get(0)).f2809c = this.f2782f.f2762c[0];
        this.i = 0.0f;
        this.f2779c.start();
    }

    @Override // N2.l
    public final void g() {
        this.f2785j = null;
    }
}
