package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public final class D extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.collection.a f22736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0919C f22737b;

    public D(AbstractC0919C abstractC0919C, androidx.collection.a aVar) {
        this.f22737b = abstractC0919C;
        this.f22736a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f22736a.remove(animator);
        this.f22737b.f22710s.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f22737b.f22710s.add(animator);
    }
}
