package X2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3953b;

    public /* synthetic */ c(d dVar, int i) {
        this.f3952a = i;
        this.f3953b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f3952a) {
            case 1:
                this.f3953b.f3980b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3952a) {
            case 0:
                this.f3953b.f3980b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
