package N2;

import N2.b;
import N2.k;
import android.animation.ObjectAnimator;
import android.util.Property;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes.dex */
public final class p extends l<ObjectAnimator> {
    public static final a i = new a(Float.class, "animationFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f2823c;

    /* renamed from: d, reason: collision with root package name */
    public final P0.a f2824d;

    /* renamed from: e, reason: collision with root package name */
    public final s f2825e;

    /* renamed from: f, reason: collision with root package name */
    public int f2826f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2827g;

    /* renamed from: h, reason: collision with root package name */
    public float f2828h;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    public class a extends Property<p, Float> {
        @Override // android.util.Property
        public final Float get(p pVar) {
            return Float.valueOf(pVar.f2828h);
        }

        @Override // android.util.Property
        public final void set(p pVar, Float f10) {
            p pVar2 = pVar;
            float floatValue = f10.floatValue();
            pVar2.f2828h = floatValue;
            ArrayList arrayList = pVar2.f2812b;
            ((k.a) arrayList.get(0)).f2807a = 0.0f;
            float b9 = l.b((int) (floatValue * 333.0f), 0, 667);
            k.a aVar = (k.a) arrayList.get(0);
            k.a aVar2 = (k.a) arrayList.get(1);
            P0.a aVar3 = pVar2.f2824d;
            float interpolation = aVar3.getInterpolation(b9);
            aVar2.f2807a = interpolation;
            aVar.f2808b = interpolation;
            k.a aVar4 = (k.a) arrayList.get(1);
            k.a aVar5 = (k.a) arrayList.get(2);
            float interpolation2 = aVar3.getInterpolation(b9 + 0.49925038f);
            aVar5.f2807a = interpolation2;
            aVar4.f2808b = interpolation2;
            ((k.a) arrayList.get(2)).f2808b = 1.0f;
            if (pVar2.f2827g && ((k.a) arrayList.get(1)).f2808b < 1.0f) {
                ((k.a) arrayList.get(2)).f2809c = ((k.a) arrayList.get(1)).f2809c;
                ((k.a) arrayList.get(1)).f2809c = ((k.a) arrayList.get(0)).f2809c;
                ((k.a) arrayList.get(0)).f2809c = pVar2.f2825e.f2762c[pVar2.f2826f];
                pVar2.f2827g = false;
            }
            pVar2.f2811a.invalidateSelf();
        }
    }

    public p(s sVar) {
        super(3);
        this.f2826f = 1;
        this.f2825e = sVar;
        this.f2824d = new P0.a(1);
    }

    @Override // N2.l
    public final void a() {
        ObjectAnimator objectAnimator = this.f2823c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // N2.l
    public final void c() {
        h();
    }

    @Override // N2.l
    public final void f() {
        if (this.f2823c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.f2823c = ofFloat;
            ofFloat.setDuration(333L);
            this.f2823c.setInterpolator(null);
            this.f2823c.setRepeatCount(-1);
            this.f2823c.addListener(new o(this, 0));
        }
        h();
        this.f2823c.start();
    }

    public final void h() {
        this.f2827g = true;
        this.f2826f = 1;
        Iterator it = this.f2812b.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            s sVar = this.f2825e;
            aVar.f2809c = sVar.f2762c[0];
            aVar.f2810d = sVar.f2766g / 2;
        }
    }

    @Override // N2.l
    public final void e() {
    }

    @Override // N2.l
    public final void g() {
    }

    @Override // N2.l
    public final void d(b.c cVar) {
    }
}
