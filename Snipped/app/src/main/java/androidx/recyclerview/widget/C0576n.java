package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0578p;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576n extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0578p.a f7667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7669c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0578p f7670d;

    public C0576n(C0578p c0578p, C0578p.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7670d = c0578p;
        this.f7667a = aVar;
        this.f7668b = viewPropertyAnimator;
        this.f7669c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7668b.setListener(null);
        View view = this.f7669c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C0578p.a aVar = this.f7667a;
        RecyclerView.C c2 = aVar.f7686a;
        C0578p c0578p = this.f7670d;
        c0578p.c(c2);
        c0578p.f7685r.remove(aVar.f7686a);
        c0578p.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.C c2 = this.f7667a.f7686a;
        this.f7670d.getClass();
    }
}
