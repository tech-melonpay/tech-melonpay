package M2;

import android.animation.ValueAnimator;

/* compiled from: NavigationBarItemView.java */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f2564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f2565b;

    public b(a aVar, float f10) {
        this.f2565b = aVar;
        this.f2564a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2565b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f2564a);
    }
}
