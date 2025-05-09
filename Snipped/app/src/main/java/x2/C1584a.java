package x2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar.java */
/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1584a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f30917b;

    public /* synthetic */ C1584a(BottomAppBar bottomAppBar, int i) {
        this.f30916a = i;
        this.f30917b = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f30916a) {
            case 0:
                BottomAppBar bottomAppBar = this.f30917b;
                bottomAppBar.getClass();
                bottomAppBar.V = null;
                break;
            case 1:
                BottomAppBar bottomAppBar2 = this.f30917b;
                bottomAppBar2.getClass();
                bottomAppBar2.W = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f30916a) {
            case 0:
                this.f30917b.getClass();
                return;
            case 1:
                this.f30917b.getClass();
                return;
            default:
                this.f30917b.getClass();
                throw null;
        }
    }
}
