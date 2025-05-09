package X1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.github.barteksc.pdfviewer.PDFView;

/* compiled from: AnimationManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public PDFView f3891a;

    /* renamed from: b, reason: collision with root package name */
    public ValueAnimator f3892b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f3893c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3894d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3895e;

    /* compiled from: AnimationManager.java */
    /* renamed from: X1.a$a, reason: collision with other inner class name */
    public class C0047a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public C0047a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            a aVar = a.this;
            aVar.f3891a.n();
            aVar.f3895e = false;
            aVar.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            aVar.f3891a.n();
            aVar.f3895e = false;
            aVar.a();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a aVar = a.this;
            PDFView pDFView = aVar.f3891a;
            pDFView.o(floatValue, pDFView.getCurrentYOffset());
            aVar.f3891a.m();
        }
    }

    /* compiled from: AnimationManager.java */
    public class b extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            a aVar = a.this;
            aVar.f3891a.n();
            aVar.f3895e = false;
            aVar.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            aVar.f3891a.n();
            aVar.f3895e = false;
            aVar.a();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a aVar = a.this;
            PDFView pDFView = aVar.f3891a;
            pDFView.o(pDFView.getCurrentXOffset(), floatValue);
            aVar.f3891a.m();
        }
    }

    public final void a() {
        this.f3891a.getScrollHandle();
    }

    public final void b(float f10, float f11) {
        e();
        this.f3892b = ValueAnimator.ofFloat(f10, f11);
        C0047a c0047a = new C0047a();
        this.f3892b.setInterpolator(new DecelerateInterpolator());
        this.f3892b.addUpdateListener(c0047a);
        this.f3892b.addListener(c0047a);
        this.f3892b.setDuration(400L);
        this.f3892b.start();
    }

    public final void c(float f10, float f11) {
        e();
        this.f3892b = ValueAnimator.ofFloat(f10, f11);
        b bVar = new b();
        this.f3892b.setInterpolator(new DecelerateInterpolator());
        this.f3892b.addUpdateListener(bVar);
        this.f3892b.addListener(bVar);
        this.f3892b.setDuration(400L);
        this.f3892b.start();
    }

    public final void d(float f10, float f11, float f12, float f13) {
        e();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f13);
        this.f3892b = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator());
        c cVar = new c(f10, f11);
        this.f3892b.addUpdateListener(cVar);
        this.f3892b.addListener(cVar);
        this.f3892b.setDuration(400L);
        this.f3892b.start();
    }

    public final void e() {
        ValueAnimator valueAnimator = this.f3892b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3892b = null;
        }
        this.f3894d = false;
        this.f3893c.forceFinished(true);
    }

    /* compiled from: AnimationManager.java */
    public class c implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final float f3898a;

        /* renamed from: b, reason: collision with root package name */
        public final float f3899b;

        public c(float f10, float f11) {
            this.f3898a = f10;
            this.f3899b = f11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            a aVar = a.this;
            aVar.f3891a.n();
            aVar.a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            aVar.f3891a.n();
            aVar.f3891a.p();
            aVar.a();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f3891a.s(((Float) valueAnimator.getAnimatedValue()).floatValue(), new PointF(this.f3898a, this.f3899b));
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
