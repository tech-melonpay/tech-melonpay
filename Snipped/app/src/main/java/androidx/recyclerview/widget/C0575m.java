package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.C f7661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7662b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7663c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0578p f7666f;

    public C0575m(C0578p c0578p, RecyclerView.C c2, int i, View view, int i9, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7666f = c0578p;
        this.f7661a = c2;
        this.f7662b = i;
        this.f7663c = view;
        this.f7664d = i9;
        this.f7665e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f7662b;
        View view = this.f7663c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f7664d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7665e.setListener(null);
        C0578p c0578p = this.f7666f;
        RecyclerView.C c2 = this.f7661a;
        c0578p.c(c2);
        c0578p.f7683p.remove(c2);
        c0578p.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7666f.getClass();
    }
}
