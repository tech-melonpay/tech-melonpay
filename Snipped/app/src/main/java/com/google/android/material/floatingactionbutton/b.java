package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9536b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.g f9537c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f9538d;

    public b(d dVar, boolean z10, a aVar) {
        this.f9538d = dVar;
        this.f9536b = z10;
        this.f9537c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f9535a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f9538d;
        dVar.f9564m = 0;
        dVar.f9559g = null;
        if (this.f9535a) {
            return;
        }
        boolean z10 = this.f9536b;
        dVar.f9568q.b(z10 ? 8 : 4, z10);
        d.g gVar = this.f9537c;
        if (gVar != null) {
            a aVar = (a) gVar;
            aVar.f9533a.a(aVar.f9534b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f9538d;
        dVar.f9568q.b(0, this.f9536b);
        dVar.f9564m = 1;
        dVar.f9559g = animator;
        this.f9535a = false;
    }
}
