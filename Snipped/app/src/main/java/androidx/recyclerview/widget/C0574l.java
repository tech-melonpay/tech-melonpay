package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.C f7657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7659c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0578p f7660d;

    public C0574l(View view, ViewPropertyAnimator viewPropertyAnimator, C0578p c0578p, RecyclerView.C c2) {
        this.f7660d = c0578p;
        this.f7657a = c2;
        this.f7658b = view;
        this.f7659c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7658b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7659c.setListener(null);
        C0578p c0578p = this.f7660d;
        RecyclerView.C c2 = this.f7657a;
        c0578p.c(c2);
        c0578p.f7682o.remove(c2);
        c0578p.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7660d.getClass();
    }
}
