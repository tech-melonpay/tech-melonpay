package N2;

import N2.b;
import N2.k;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import l1.AbstractC0978c;
import pa.C1124b;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes.dex */
public final class r extends l<ObjectAnimator> {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2831k = {533, 567, 850, 750};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f2832l = {1267, 1000, 333, 0};

    /* renamed from: m, reason: collision with root package name */
    public static final a f2833m = new a(Float.class, "animationFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f2834c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f2835d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator[] f2836e;

    /* renamed from: f, reason: collision with root package name */
    public final s f2837f;

    /* renamed from: g, reason: collision with root package name */
    public int f2838g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2839h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0978c f2840j;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    public class a extends Property<r, Float> {
        @Override // android.util.Property
        public final Float get(r rVar) {
            return Float.valueOf(rVar.i);
        }

        @Override // android.util.Property
        public final void set(r rVar, Float f10) {
            ArrayList arrayList;
            r rVar2 = rVar;
            float floatValue = f10.floatValue();
            rVar2.i = floatValue;
            int i = (int) (floatValue * 1800.0f);
            int i9 = 0;
            while (true) {
                arrayList = rVar2.f2812b;
                if (i9 >= arrayList.size()) {
                    break;
                }
                k.a aVar = (k.a) arrayList.get(i9);
                int[] iArr = r.f2832l;
                int i10 = i9 * 2;
                int i11 = iArr[i10];
                int[] iArr2 = r.f2831k;
                float b9 = l.b(i, i11, iArr2[i10]);
                Interpolator[] interpolatorArr = rVar2.f2836e;
                aVar.f2807a = C1124b.r(interpolatorArr[i10].getInterpolation(b9), 0.0f, 1.0f);
                int i12 = i10 + 1;
                aVar.f2808b = C1124b.r(interpolatorArr[i12].getInterpolation(l.b(i, iArr[i12], iArr2[i12])), 0.0f, 1.0f);
                i9++;
            }
            if (rVar2.f2839h) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((k.a) it.next()).f2809c = rVar2.f2837f.f2762c[rVar2.f2838g];
                }
                rVar2.f2839h = false;
            }
            rVar2.f2811a.invalidateSelf();
        }
    }

    public r(Context context, s sVar) {
        super(2);
        this.f2838g = 0;
        this.f2840j = null;
        this.f2837f = sVar;
        this.f2836e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // N2.l
    public final void a() {
        ObjectAnimator objectAnimator = this.f2834c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // N2.l
    public final void c() {
        h();
    }

    @Override // N2.l
    public final void d(b.c cVar) {
        this.f2840j = cVar;
    }

    @Override // N2.l
    public final void e() {
        ObjectAnimator objectAnimator = this.f2835d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f2811a.isVisible()) {
            this.f2835d.setFloatValues(this.i, 1.0f);
            this.f2835d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.f2835d.start();
        }
    }

    @Override // N2.l
    public final void f() {
        ObjectAnimator objectAnimator = this.f2834c;
        a aVar = f2833m;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, aVar, 0.0f, 1.0f);
            this.f2834c = ofFloat;
            ofFloat.setDuration(1800L);
            this.f2834c.setInterpolator(null);
            this.f2834c.setRepeatCount(-1);
            this.f2834c.addListener(new q(this, 0));
        }
        if (this.f2835d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f);
            this.f2835d = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f2835d.setInterpolator(null);
            this.f2835d.addListener(new q(this, 1));
        }
        h();
        this.f2834c.start();
    }

    @Override // N2.l
    public final void g() {
        this.f2840j = null;
    }

    public final void h() {
        this.f2838g = 0;
        Iterator it = this.f2812b.iterator();
        while (it.hasNext()) {
            ((k.a) it.next()).f2809c = this.f2837f.f2762c[0];
        }
    }
}
