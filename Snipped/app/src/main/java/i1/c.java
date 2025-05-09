package i1;

import android.animation.Animator;
import i1.d;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d.a f21248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f21249b;

    public c(d dVar, d.a aVar) {
        this.f21249b = dVar;
        this.f21248a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        d dVar = this.f21249b;
        d.a aVar = this.f21248a;
        dVar.a(1.0f, aVar, true);
        aVar.f21267k = aVar.f21262e;
        aVar.f21268l = aVar.f21263f;
        aVar.f21269m = aVar.f21264g;
        aVar.a((aVar.f21266j + 1) % aVar.i.length);
        if (!dVar.f21257f) {
            dVar.f21256e += 1.0f;
            return;
        }
        dVar.f21257f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (aVar.f21270n) {
            aVar.f21270n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f21249b.f21256e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
