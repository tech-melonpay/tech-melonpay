package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.g f9540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f9541c;

    public c(d dVar, boolean z10, a aVar) {
        this.f9541c = dVar;
        this.f9539a = z10;
        this.f9540b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f9541c;
        dVar.f9564m = 0;
        dVar.f9559g = null;
        d.g gVar = this.f9540b;
        if (gVar != null) {
            ((a) gVar).f9533a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f9541c;
        dVar.f9568q.b(0, this.f9539a);
        dVar.f9564m = 2;
        dVar.f9559g = animator;
    }
}
