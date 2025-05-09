package com.google.android.material.behavior;

import L2.k;
import N2.o;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.luminary.mobile.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.bouncycastle.tls.CipherSuite;
import u2.C1512a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<a> f9106b;

    /* renamed from: c, reason: collision with root package name */
    public int f9107c;

    /* renamed from: d, reason: collision with root package name */
    public int f9108d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f9109e;

    /* renamed from: f, reason: collision with root package name */
    public TimeInterpolator f9110f;

    /* renamed from: g, reason: collision with root package name */
    public int f9111g;

    /* renamed from: h, reason: collision with root package name */
    public int f9112h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public ViewPropertyAnimator f9113j;

    public interface a {
        void a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f9106b = new LinkedHashSet<>();
        this.f9111g = 0;
        this.f9112h = 2;
        this.i = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i) {
        this.f9111g = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f9107c = k.c(v10.getContext(), R.attr.motionDurationLong2, 225);
        this.f9108d = k.c(v10.getContext(), R.attr.motionDurationMedium4, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384);
        this.f9109e = k.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, C1512a.f30144d);
        this.f9110f = k.d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, C1512a.f30143c);
        return super.onLayoutChild(coordinatorLayout, v10, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i, int i9, int i10, int i11, int i12, int[] iArr) {
        LinkedHashSet<a> linkedHashSet = this.f9106b;
        if (i9 > 0) {
            if (this.f9112h == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f9113j;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v10.clearAnimation();
            }
            this.f9112h = 1;
            Iterator<a> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f9113j = v10.animate().translationY(this.f9111g + this.i).setInterpolator(this.f9110f).setDuration(this.f9108d).setListener(new o(this, 3));
            return;
        }
        if (i9 >= 0 || this.f9112h == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f9113j;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            v10.clearAnimation();
        }
        this.f9112h = 2;
        Iterator<a> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.f9113j = v10.animate().translationY(0).setInterpolator(this.f9109e).setDuration(this.f9107c).setListener(new o(this, 3));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i, int i9) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9106b = new LinkedHashSet<>();
        this.f9111g = 0;
        this.f9112h = 2;
        this.i = 0;
    }
}
