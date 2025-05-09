package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import com.luminary.mobile.R;
import k1.AbstractC0919C;

/* compiled from: TranslationAnimationCreator.java */
/* loaded from: classes.dex */
public final class M {
    public static ObjectAnimator a(View view, L l10, int i, int i9, float f10, float f11, float f12, float f13, BaseInterpolator baseInterpolator, AbstractC0919C abstractC0919C) {
        float f14;
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) l10.f22762b.getTag(R.id.transition_position)) != null) {
            f14 = (r7[0] - i) + translationX;
            f15 = (r7[1] - i9) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f15, f13));
        a aVar = new a(view, l10.f22762b, translationX, translationY);
        abstractC0919C.a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.setInterpolator(baseInterpolator);
        return ofPropertyValuesHolder;
    }

    /* compiled from: TranslationAnimationCreator.java */
    public static class a extends AnimatorListenerAdapter implements AbstractC0919C.g {

        /* renamed from: a, reason: collision with root package name */
        public final View f22764a;

        /* renamed from: b, reason: collision with root package name */
        public final View f22765b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f22766c;

        /* renamed from: d, reason: collision with root package name */
        public float f22767d;

        /* renamed from: e, reason: collision with root package name */
        public float f22768e;

        /* renamed from: f, reason: collision with root package name */
        public final float f22769f;

        /* renamed from: g, reason: collision with root package name */
        public final float f22770g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f22771h;

        public a(View view, View view2, float f10, float f11) {
            this.f22765b = view;
            this.f22764a = view2;
            this.f22769f = f10;
            this.f22770g = f11;
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.f22766c = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, null);
            }
        }

        @Override // k1.AbstractC0919C.g
        public final void a(AbstractC0919C abstractC0919C) {
            this.f22771h = true;
            float f10 = this.f22769f;
            View view = this.f22765b;
            view.setTranslationX(f10);
            view.setTranslationY(this.f22770g);
        }

        @Override // k1.AbstractC0919C.g
        public final void b(AbstractC0919C abstractC0919C) {
            if (this.f22771h) {
                return;
            }
            this.f22764a.setTag(R.id.transition_position, null);
        }

        @Override // k1.AbstractC0919C.g
        public final void c() {
            if (this.f22766c == null) {
                this.f22766c = new int[2];
            }
            int[] iArr = this.f22766c;
            View view = this.f22765b;
            view.getLocationOnScreen(iArr);
            this.f22764a.setTag(R.id.transition_position, this.f22766c);
            this.f22767d = view.getTranslationX();
            this.f22768e = view.getTranslationY();
            view.setTranslationX(this.f22769f);
            view.setTranslationY(this.f22770g);
        }

        @Override // k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
            b(abstractC0919C);
        }

        @Override // k1.AbstractC0919C.g
        public final void j() {
            float f10 = this.f22767d;
            View view = this.f22765b;
            view.setTranslationX(f10);
            view.setTranslationY(this.f22768e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f22771h = true;
            float f10 = this.f22769f;
            View view = this.f22765b;
            view.setTranslationX(f10);
            view.setTranslationY(this.f22770g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            float f10 = this.f22769f;
            View view = this.f22765b;
            view.setTranslationX(f10);
            view.setTranslationY(this.f22770g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // k1.AbstractC0919C.g
        public final void e(AbstractC0919C abstractC0919C) {
        }
    }
}
