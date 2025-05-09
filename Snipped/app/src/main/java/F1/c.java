package F1;

import android.animation.ValueAnimator;
import antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator;

/* compiled from: CircularProgressIndicator.java */
/* loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CircularProgressIndicator f1158a;

    public c(CircularProgressIndicator circularProgressIndicator) {
        this.f1158a = circularProgressIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("angle")).intValue();
        CircularProgressIndicator circularProgressIndicator = this.f1158a;
        circularProgressIndicator.f8256f = intValue;
        circularProgressIndicator.invalidate();
    }
}
