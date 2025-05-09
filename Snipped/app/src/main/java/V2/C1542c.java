package v2;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* compiled from: CollapsingToolbarLayout.java */
/* renamed from: v2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1542c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f30541a;

    public C1542c(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f30541a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f30541a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
