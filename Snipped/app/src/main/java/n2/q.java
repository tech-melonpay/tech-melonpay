package N2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import l1.AbstractC0978c;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* loaded from: classes.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f2830b;

    public /* synthetic */ q(r rVar, int i) {
        this.f2829a = i;
        this.f2830b = rVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2829a) {
            case 1:
                super.onAnimationEnd(animator);
                r rVar = this.f2830b;
                rVar.a();
                AbstractC0978c abstractC0978c = rVar.f2840j;
                if (abstractC0978c != null) {
                    abstractC0978c.a(rVar.f2811a);
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
        switch (this.f2829a) {
            case 0:
                super.onAnimationRepeat(animator);
                r rVar = this.f2830b;
                rVar.f2838g = (rVar.f2838g + 1) % rVar.f2837f.f2762c.length;
                rVar.f2839h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
