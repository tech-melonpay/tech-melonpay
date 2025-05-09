package i1;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes.dex */
public final class g extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f21282c;

    public g(SwipeRefreshLayout swipeRefreshLayout, int i, int i9) {
        this.f21282c = swipeRefreshLayout;
        this.f21280a = i;
        this.f21281b = i9;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        this.f21282c.f7901B.setAlpha((int) (((this.f21281b - r0) * f10) + this.f21280a));
    }
}
