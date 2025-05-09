package L2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: MaterialSideContainerBackHelper.java */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f2486c;

    public i(j jVar, boolean z10, int i) {
        this.f2486c = jVar;
        this.f2484a = z10;
        this.f2485b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j jVar = this.f2486c;
        jVar.f2468b.setTranslationX(0.0f);
        jVar.a(0.0f, this.f2484a, this.f2485b);
    }
}
