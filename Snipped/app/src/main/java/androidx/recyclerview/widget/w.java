package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.u;

/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u.f f7821a;

    public w(u.f fVar) {
        this.f7821a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7821a.f7817m = valueAnimator.getAnimatedFraction();
    }
}
