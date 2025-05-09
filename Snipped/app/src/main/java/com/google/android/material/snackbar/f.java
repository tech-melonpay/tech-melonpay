package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f9789a;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f9789a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar = this.f9789a;
        BaseTransientBottomBar.e eVar = baseTransientBottomBar.i;
        if (eVar == null) {
            return;
        }
        ViewParent parent = eVar.getParent();
        BaseTransientBottomBar.e eVar2 = baseTransientBottomBar.i;
        if (parent != null) {
            eVar2.setVisibility(0);
        }
        if (eVar2.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(baseTransientBottomBar.f9746d);
            ofFloat.addUpdateListener(new a(baseTransientBottomBar));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat2.setInterpolator(baseTransientBottomBar.f9748f);
            ofFloat2.addUpdateListener(new b(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(baseTransientBottomBar.f9743a);
            animatorSet.addListener(new V2.a(baseTransientBottomBar, 3));
            animatorSet.start();
            return;
        }
        int height = eVar2.getHeight();
        ViewGroup.LayoutParams layoutParams = eVar2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        eVar2.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f9747e);
        valueAnimator.setDuration(baseTransientBottomBar.f9745c);
        valueAnimator.addListener(new V2.a(baseTransientBottomBar, 1));
        valueAnimator.addUpdateListener(new c(baseTransientBottomBar, height));
        valueAnimator.start();
    }
}
