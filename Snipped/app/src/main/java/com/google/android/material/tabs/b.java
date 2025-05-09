package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout.java */
/* loaded from: classes.dex */
public class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TabLayout.f f9877c;

    public b(TabLayout.f fVar, View view, View view2) {
        this.f9877c = fVar;
        this.f9875a = view;
        this.f9876b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f9877c.c(this.f9875a, this.f9876b, valueAnimator.getAnimatedFraction());
    }
}
