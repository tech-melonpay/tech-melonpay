package W1;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import com.luminary.mobile.R;

/* compiled from: VisibilityAnimationManager.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final View f3799a;

    /* renamed from: b, reason: collision with root package name */
    public final AnimatorSet f3800b;

    /* renamed from: c, reason: collision with root package name */
    public final AnimatorSet f3801c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3802d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3803e;

    public d(View view, float f10, float f11) {
        this.f3799a = view;
        this.f3802d = f10;
        this.f3803e = f11;
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), R.animator.fastscroll__default_hide);
        this.f3800b = animatorSet;
        animatorSet.setStartDelay(1000);
        animatorSet.setTarget(view);
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), R.animator.fastscroll__default_show);
        this.f3801c = animatorSet2;
        animatorSet2.setTarget(view);
        animatorSet.addListener(new c(view));
        a();
    }

    public final void a() {
        View view = this.f3799a;
        view.setPivotX(this.f3802d * view.getMeasuredWidth());
        view.setPivotY(this.f3803e * view.getMeasuredHeight());
    }
}
