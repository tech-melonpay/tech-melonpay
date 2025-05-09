package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.luminary.mobile.R;
import k1.AbstractC0919C;

/* compiled from: Fade.java */
/* renamed from: k1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930k extends W {

    /* compiled from: Fade.java */
    /* renamed from: k1.k$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC0919C.g {

        /* renamed from: a, reason: collision with root package name */
        public final View f22892a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f22893b = false;

        public a(View view) {
            this.f22892a = view;
        }

        @Override // k1.AbstractC0919C.g
        public final void c() {
            View view = this.f22892a;
            view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? P.f22778a.a(view) : 0.0f));
        }

        @Override // k1.AbstractC0919C.g
        public final void j() {
            this.f22892a.setTag(R.id.transition_pause_alpha, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            P.b(this.f22892a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.f22892a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f22893b = true;
                view.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) {
            boolean z11 = this.f22893b;
            View view = this.f22892a;
            if (z11) {
                view.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            P.b(view, 1.0f);
            P.f22778a.getClass();
        }

        @Override // k1.AbstractC0919C.g
        public final void a(AbstractC0919C abstractC0919C) {
        }

        @Override // k1.AbstractC0919C.g
        public final void e(AbstractC0919C abstractC0919C) {
        }

        @Override // k1.AbstractC0919C.g
        public final void h(AbstractC0919C abstractC0919C) {
        }

        @Override // k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
        }
    }

    public C0930k(int i) {
        X(i);
    }

    public static float Z(L l10, float f10) {
        Float f11;
        return (l10 == null || (f11 = (Float) l10.f22761a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // k1.AbstractC0919C
    public final boolean A() {
        return true;
    }

    @Override // k1.W
    public final ObjectAnimator V(ViewGroup viewGroup, View view, L l10, L l11) {
        P.f22778a.getClass();
        return Y(view, Z(l10, 0.0f), 1.0f);
    }

    @Override // k1.W
    public final ObjectAnimator W(ViewGroup viewGroup, View view, L l10, L l11) {
        P.f22778a.getClass();
        ObjectAnimator Y = Y(view, Z(l10, 1.0f), 0.0f);
        if (Y == null) {
            P.b(view, Z(l11, 1.0f));
        }
        return Y;
    }

    public final ObjectAnimator Y(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        P.b(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, P.f22779b, f11);
        a aVar = new a(view);
        ofFloat.addListener(aVar);
        u().a(aVar);
        return ofFloat;
    }

    @Override // k1.AbstractC0919C
    public final void j(L l10) {
        W.T(l10);
        View view = l10.f22762b;
        Float f10 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f10 == null) {
            f10 = view.getVisibility() == 0 ? Float.valueOf(P.f22778a.a(view)) : Float.valueOf(0.0f);
        }
        l10.f22761a.put("android:fade:transitionAlpha", f10);
    }
}
