package i1;

import android.animation.ValueAnimator;
import i1.d;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.a f21246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f21247b;

    public b(d dVar, d.a aVar) {
        this.f21247b = dVar;
        this.f21246a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f21247b;
        dVar.getClass();
        d.a aVar = this.f21246a;
        d.d(floatValue, aVar);
        dVar.a(floatValue, aVar, false);
        dVar.invalidateSelf();
    }
}
