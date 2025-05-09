package A2;

import X2.h;
import android.animation.ValueAnimator;
import android.view.View;
import h.C0790q;
import y0.G;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34b;

    public /* synthetic */ a(C0790q.c cVar, View view) {
        this.f33a = 4;
        this.f34b = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f33a) {
            case 0:
                c cVar = (c) this.f34b;
                cVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.f45j.setAlpha((int) (255.0f * floatValue));
                cVar.f59x = floatValue;
                break;
            case 1:
                h hVar = (h) this.f34b;
                hVar.getClass();
                hVar.f3982d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                com.sumsub.sns.camera.photo.presentation.document.a.a((View) this.f34b, valueAnimator);
                break;
            case 3:
                com.sumsub.sns.presentation.screen.preview.photo.mrtd.a.a((com.sumsub.sns.presentation.screen.preview.photo.mrtd.a) this.f34b, valueAnimator);
                break;
            default:
                ((View) ((C0790q.c) ((G) this.f34b)).f21011a.f20989d.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ a(Object obj, int i) {
        this.f33a = i;
        this.f34b = obj;
    }
}
