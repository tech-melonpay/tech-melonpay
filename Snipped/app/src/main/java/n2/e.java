package N2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import l1.AbstractC0978c;

/* compiled from: CircularIndeterminateAnimatorDelegate.java */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2773b;

    public /* synthetic */ e(f fVar, int i) {
        this.f2772a = i;
        this.f2773b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2772a) {
            case 1:
                super.onAnimationEnd(animator);
                f fVar = this.f2773b;
                fVar.a();
                AbstractC0978c abstractC0978c = fVar.f2785j;
                if (abstractC0978c != null) {
                    abstractC0978c.a(fVar.f2811a);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f2772a) {
            case 0:
                super.onAnimationRepeat(animator);
                f fVar = this.f2773b;
                fVar.f2783g = (fVar.f2783g + 4) % fVar.f2782f.f2762c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
