package X2;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.luminary.mobile.R;
import u2.C1512a;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes.dex */
public final class d extends i {

    /* renamed from: e, reason: collision with root package name */
    public final int f3954e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3955f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f3956g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f3957h;
    public EditText i;

    /* renamed from: j, reason: collision with root package name */
    public final J7.b f3958j;

    /* renamed from: k, reason: collision with root package name */
    public final a f3959k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f3960l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f3961m;

    public d(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f3958j = new J7.b(this, 4);
        this.f3959k = new a(this, 0);
        this.f3954e = L2.k.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f3955f = L2.k.c(aVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f3956g = L2.k.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, C1512a.f30141a);
        this.f3957h = L2.k.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, C1512a.f30144d);
    }

    @Override // X2.i
    public final void a() {
        if (this.f3980b.f9902p != null) {
            return;
        }
        t(u());
    }

    @Override // X2.i
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // X2.i
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // X2.i
    public final View.OnFocusChangeListener e() {
        return this.f3959k;
    }

    @Override // X2.i
    public final View.OnClickListener f() {
        return this.f3958j;
    }

    @Override // X2.i
    public final View.OnFocusChangeListener g() {
        return this.f3959k;
    }

    @Override // X2.i
    public final void m(EditText editText) {
        this.i = editText;
        this.f3979a.setEndIconVisible(u());
    }

    @Override // X2.i
    public final void p(boolean z10) {
        if (this.f3980b.f9902p == null) {
            return;
        }
        t(z10);
    }

    @Override // X2.i
    public final void r() {
        final int i = 1;
        final int i9 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f3957h);
        ofFloat.setDuration(this.f3955f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f3951b;

            {
                this.f3951b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        d dVar = this.f3951b;
                        dVar.getClass();
                        dVar.f3982d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f3951b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f3982d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3956g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f3954e;
        ofFloat2.setDuration(i10);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f3951b;

            {
                this.f3951b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i9) {
                    case 0:
                        d dVar = this.f3951b;
                        dVar.getClass();
                        dVar.f3982d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f3951b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f3982d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f3960l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f3960l.addListener(new c(this, i9));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i10);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f3951b;

            {
                this.f3951b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i9) {
                    case 0:
                        d dVar = this.f3951b;
                        dVar.getClass();
                        dVar.f3982d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f3951b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f3982d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f3961m = ofFloat3;
        ofFloat3.addListener(new c(this, i));
    }

    @Override // X2.i
    public final void s() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new B2.d(this, 14));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = this.f3980b.d() == z10;
        if (z10 && !this.f3960l.isRunning()) {
            this.f3961m.cancel();
            this.f3960l.start();
            if (z11) {
                this.f3960l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f3960l.cancel();
        this.f3961m.start();
        if (z11) {
            this.f3961m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.i;
        return editText != null && (editText.hasFocus() || this.f3982d.hasFocus()) && this.i.getText().length() > 0;
    }
}
