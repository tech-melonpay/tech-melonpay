package i1;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes.dex */
public final class h extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f21283a;

    public h(SwipeRefreshLayout swipeRefreshLayout) {
        this.f21283a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f21283a;
        float f11 = swipeRefreshLayout.f7936x;
        swipeRefreshLayout.setAnimationProgress(((-f11) * f10) + f11);
        swipeRefreshLayout.e(f10);
    }
}
