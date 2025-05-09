package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.C f7653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7655c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0578p f7656d;

    public C0573k(View view, ViewPropertyAnimator viewPropertyAnimator, C0578p c0578p, RecyclerView.C c2) {
        this.f7656d = c0578p;
        this.f7653a = c2;
        this.f7654b = viewPropertyAnimator;
        this.f7655c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7654b.setListener(null);
        this.f7655c.setAlpha(1.0f);
        C0578p c0578p = this.f7656d;
        RecyclerView.C c2 = this.f7653a;
        c0578p.c(c2);
        c0578p.f7684q.remove(c2);
        c0578p.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7656d.getClass();
    }
}
