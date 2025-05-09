package J2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
import k1.AbstractC0919C;
import k1.L;

/* compiled from: TextScale.java */
/* loaded from: classes.dex */
public final class g extends AbstractC0919C {

    /* compiled from: TextScale.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f2133a;

        public a(TextView textView) {
            this.f2133a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.f2133a;
            textView.setScaleX(floatValue);
            textView.setScaleY(floatValue);
        }
    }

    @Override // k1.AbstractC0919C
    public final void g(L l10) {
        View view = l10.f22762b;
        if (view instanceof TextView) {
            l10.f22761a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // k1.AbstractC0919C
    public final void j(L l10) {
        View view = l10.f22762b;
        if (view instanceof TextView) {
            l10.f22761a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // k1.AbstractC0919C
    public final Animator n(ViewGroup viewGroup, L l10, L l11) {
        if (l10 == null || l11 == null || !(l10.f22762b instanceof TextView)) {
            return null;
        }
        View view = l11.f22762b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = l10.f22761a;
        HashMap hashMap2 = l11.f22761a;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
