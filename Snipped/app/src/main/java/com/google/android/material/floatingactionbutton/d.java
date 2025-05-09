package com.google.android.material.floatingactionbutton;

import L2.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.luminary.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import pa.C1124b;
import u2.C1512a;
import u2.C1513b;
import u2.C1515d;
import u2.C1516e;
import u2.C1517f;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public T2.i f9553a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9554b;

    /* renamed from: d, reason: collision with root package name */
    public float f9556d;

    /* renamed from: e, reason: collision with root package name */
    public float f9557e;

    /* renamed from: f, reason: collision with root package name */
    public float f9558f;

    /* renamed from: g, reason: collision with root package name */
    public Animator f9559g;

    /* renamed from: h, reason: collision with root package name */
    public C1517f f9560h;
    public C1517f i;

    /* renamed from: j, reason: collision with root package name */
    public float f9561j;

    /* renamed from: l, reason: collision with root package name */
    public int f9563l;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f9565n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f9566o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList<f> f9567p;

    /* renamed from: q, reason: collision with root package name */
    public final FloatingActionButton f9568q;

    /* renamed from: r, reason: collision with root package name */
    public final S2.b f9569r;

    /* renamed from: w, reason: collision with root package name */
    public I2.b f9574w;

    /* renamed from: x, reason: collision with root package name */
    public static final P0.a f9550x = C1512a.f30143c;

    /* renamed from: y, reason: collision with root package name */
    public static final int f9551y = R.attr.motionDurationLong2;

    /* renamed from: z, reason: collision with root package name */
    public static final int f9552z = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: A, reason: collision with root package name */
    public static final int f9542A = R.attr.motionDurationMedium1;

    /* renamed from: B, reason: collision with root package name */
    public static final int f9543B = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f9544C = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f9545D = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f9546E = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f9547F = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f9548G = {android.R.attr.state_enabled};

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f9549H = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public boolean f9555c = true;

    /* renamed from: k, reason: collision with root package name */
    public float f9562k = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public int f9564m = 0;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f9570s = new Rect();

    /* renamed from: t, reason: collision with root package name */
    public final RectF f9571t = new RectF();

    /* renamed from: u, reason: collision with root package name */
    public final RectF f9572u = new RectF();

    /* renamed from: v, reason: collision with root package name */
    public final Matrix f9573v = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    public class a extends C1516e {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            d.this.f9562k = f10;
            float[] fArr = this.f30147a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f30148b;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f11 = fArr2[i];
                float f12 = fArr[i];
                fArr2[i] = com.google.android.gms.measurement.internal.a.d(f11, f12, f10, f12);
            }
            Matrix matrix3 = this.f30149c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f9576a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f9577b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f9578c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f9579d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f9580e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f9581f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f9582g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Matrix f9583h;

        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f9576a = f10;
            this.f9577b = f11;
            this.f9578c = f12;
            this.f9579d = f13;
            this.f9580e = f14;
            this.f9581f = f15;
            this.f9582g = f16;
            this.f9583h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d dVar = d.this;
            dVar.f9568q.setAlpha(C1512a.b(this.f9576a, this.f9577b, 0.0f, 0.2f, floatValue));
            FloatingActionButton floatingActionButton = dVar.f9568q;
            float f10 = this.f9578c;
            float f11 = this.f9579d;
            floatingActionButton.setScaleX(C1512a.a(f10, f11, floatValue));
            dVar.f9568q.setScaleY(C1512a.a(this.f9580e, f11, floatValue));
            float f12 = this.f9581f;
            float f13 = this.f9582g;
            dVar.f9562k = C1512a.a(f12, f13, floatValue);
            float a10 = C1512a.a(f12, f13, floatValue);
            Matrix matrix = this.f9583h;
            dVar.a(a10, matrix);
            dVar.f9568q.setImageMatrix(matrix);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class c extends i {
        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    public class C0104d extends i {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f9584c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0104d(I2.c cVar) {
            super(cVar);
            this.f9584c = cVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f9584c;
            return dVar.f9556d + dVar.f9557e;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class e extends i {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f9585c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(I2.c cVar) {
            super(cVar);
            this.f9585c = cVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            d dVar = this.f9585c;
            return dVar.f9556d + dVar.f9558f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public interface f {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public interface g {
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class h extends i {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f9586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(I2.c cVar) {
            super(cVar);
            this.f9586c = cVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.i
        public final float a() {
            return this.f9586c.f9556d;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f9587a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f9588b;

        public i(I2.c cVar) {
            this.f9588b = cVar;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f9588b.getClass();
            this.f9587a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z10 = this.f9587a;
            d dVar = this.f9588b;
            if (!z10) {
                dVar.getClass();
                a();
                this.f9587a = true;
            }
            valueAnimator.getAnimatedFraction();
            dVar.getClass();
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f9568q = floatingActionButton;
        this.f9569r = bVar;
        J2.e eVar = new J2.e();
        I2.c cVar = (I2.c) this;
        eVar.a(f9544C, d(new e(cVar)));
        eVar.a(f9545D, d(new C0104d(cVar)));
        eVar.a(f9546E, d(new C0104d(cVar)));
        eVar.a(f9547F, d(new C0104d(cVar)));
        eVar.a(f9548G, d(new h(cVar)));
        eVar.a(f9549H, d(new c(cVar)));
        this.f9561j = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f9550x);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f9568q.getDrawable() == null || this.f9563l == 0) {
            return;
        }
        RectF rectF = this.f9571t;
        RectF rectF2 = this.f9572u;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i9 = this.f9563l;
        rectF2.set(0.0f, 0.0f, i9, i9);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i10 = this.f9563l;
        matrix.postScale(f10, f10, i10 / 2.0f, i10 / 2.0f);
    }

    public final AnimatorSet b(C1517f c1517f, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f9568q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        c1517f.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        c1517f.c("scale").a(ofFloat2);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 == 26) {
            I2.a aVar = new I2.a(0);
            aVar.f1727b = new FloatEvaluator();
            ofFloat2.setEvaluator(aVar);
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        c1517f.c("scale").a(ofFloat3);
        if (i9 == 26) {
            I2.a aVar2 = new I2.a(0);
            aVar2.f1727b = new FloatEvaluator();
            ofFloat3.setEvaluator(aVar2);
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f9573v;
        a(f12, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new C1515d(), new a(), new Matrix(matrix));
        c1517f.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C1513b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12, int i9, int i10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f9568q;
        ofFloat.addUpdateListener(new b(floatingActionButton.getAlpha(), f10, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f9562k, f12, new Matrix(this.f9573v)));
        arrayList.add(ofFloat);
        C1513b.a(animatorSet, arrayList);
        animatorSet.setDuration(k.c(floatingActionButton.getContext(), i9, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(k.d(floatingActionButton.getContext(), i10, C1512a.f30142b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int max = this.f9554b ? Math.max((0 - this.f9568q.getSizeDimension()) / 2, 0) : 0;
        int max2 = Math.max(max, (int) Math.ceil(this.f9555c ? e() + this.f9558f : 0.0f));
        int max3 = Math.max(max, (int) Math.ceil(r0 * 1.5f));
        rect.set(max2, max3, max2, max3);
    }

    public void g() {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i(int[] iArr) {
        throw null;
    }

    public void j(float f10, float f11, float f12) {
        throw null;
    }

    public final void k() {
        ArrayList<f> arrayList = this.f9567p;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().a();
                throw null;
            }
        }
    }

    public final void l() {
        f(this.f9570s);
        C1124b.p(null, "Didn't initialize content background");
        throw null;
    }
}
