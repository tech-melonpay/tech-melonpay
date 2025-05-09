package L2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: MaterialBottomContainerBackHelper.java */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f2481a;

    public f(g gVar) {
        this.f2481a = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g gVar = this.f2481a;
        gVar.f2468b.setTranslationY(0.0f);
        gVar.b(0.0f);
    }
}
