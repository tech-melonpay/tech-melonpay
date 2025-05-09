package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C0578p;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator.java */
/* renamed from: androidx.recyclerview.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0578p.a f7671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7673c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0578p f7674d;

    public C0577o(C0578p c0578p, C0578p.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7674d = c0578p;
        this.f7671a = aVar;
        this.f7672b = viewPropertyAnimator;
        this.f7673c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7672b.setListener(null);
        View view = this.f7673c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C0578p.a aVar = this.f7671a;
        RecyclerView.C c2 = aVar.f7687b;
        C0578p c0578p = this.f7674d;
        c0578p.c(c2);
        c0578p.f7685r.remove(aVar.f7687b);
        c0578p.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.C c2 = this.f7671a.f7687b;
        this.f7674d.getClass();
    }
}
