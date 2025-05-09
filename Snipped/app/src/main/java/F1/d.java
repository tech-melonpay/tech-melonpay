package F1;

import android.animation.Animator;
import antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator;

/* compiled from: CircularProgressIndicator.java */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f1159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CircularProgressIndicator f1160b;

    public d(CircularProgressIndicator circularProgressIndicator, double d10) {
        this.f1160b = circularProgressIndicator;
        this.f1159a = d10;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = (int) this.f1159a;
        CircularProgressIndicator circularProgressIndicator = this.f1160b;
        circularProgressIndicator.f8256f = i;
        circularProgressIndicator.invalidate();
        circularProgressIndicator.f8267r = null;
    }
}
