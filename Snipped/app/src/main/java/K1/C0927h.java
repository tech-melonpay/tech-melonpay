package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.luminary.mobile.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.WeakHashMap;
import y0.C1596C;

/* compiled from: ChangeTransform.java */
/* renamed from: k1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0927h extends AbstractC0919C {

    /* renamed from: N, reason: collision with root package name */
    public static final String[] f22859N = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: O, reason: collision with root package name */
    public static final a f22860O = new a(float[].class, "nonTranslations");

    /* renamed from: P, reason: collision with root package name */
    public static final b f22861P = new b(PointF.class, "translations");

    /* renamed from: Q, reason: collision with root package name */
    public static final boolean f22862Q = true;

    /* renamed from: K, reason: collision with root package name */
    public boolean f22863K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f22864L;

    /* renamed from: M, reason: collision with root package name */
    public Matrix f22865M;

    /* compiled from: ChangeTransform.java */
    /* renamed from: k1.h$a */
    public class a extends Property<e, float[]> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(e eVar, float[] fArr) {
            e eVar2 = eVar;
            float[] fArr2 = fArr;
            eVar2.getClass();
            System.arraycopy(fArr2, 0, eVar2.f22878c, 0, fArr2.length);
            eVar2.a();
        }
    }

    /* compiled from: ChangeTransform.java */
    /* renamed from: k1.h$b */
    public class b extends Property<e, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(e eVar, PointF pointF) {
            e eVar2 = eVar;
            PointF pointF2 = pointF;
            eVar2.getClass();
            eVar2.f22879d = pointF2.x;
            eVar2.f22880e = pointF2.y;
            eVar2.a();
        }
    }

    /* compiled from: ChangeTransform.java */
    /* renamed from: k1.h$c */
    public static class c extends G {

        /* renamed from: a, reason: collision with root package name */
        public View f22866a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC0935p f22867b;

        @Override // k1.G, k1.AbstractC0919C.g
        public final void c() {
            this.f22867b.setVisibility(4);
        }

        @Override // k1.G, k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
            abstractC0919C.G(this);
            int i = Build.VERSION.SDK_INT;
            View view = this.f22866a;
            if (i == 28) {
                if (!C.N.f533h) {
                    try {
                        C.N.g();
                        Method declaredMethod = C.N.f528c.getDeclaredMethod("removeGhost", View.class);
                        C.N.f532g = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e10) {
                        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e10);
                    }
                    C.N.f533h = true;
                }
                Method method = C.N.f532g;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused) {
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException(e11.getCause());
                    }
                }
            } else {
                int i9 = r.f22909g;
                r rVar = (r) view.getTag(R.id.ghost_view);
                if (rVar != null) {
                    int i10 = rVar.f22913d - 1;
                    rVar.f22913d = i10;
                    if (i10 <= 0) {
                        ((C0936q) rVar.getParent()).removeView(rVar);
                    }
                }
            }
            view.setTag(R.id.transition_transform, null);
            view.setTag(R.id.parent_matrix, null);
        }

        @Override // k1.G, k1.AbstractC0919C.g
        public final void j() {
            this.f22867b.setVisibility(0);
        }
    }

    /* compiled from: ChangeTransform.java */
    /* renamed from: k1.h$d */
    public static class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f22868a;

        /* renamed from: b, reason: collision with root package name */
        public final Matrix f22869b = new Matrix();

        /* renamed from: c, reason: collision with root package name */
        public final boolean f22870c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f22871d;

        /* renamed from: e, reason: collision with root package name */
        public final View f22872e;

        /* renamed from: f, reason: collision with root package name */
        public final f f22873f;

        /* renamed from: g, reason: collision with root package name */
        public final e f22874g;

        /* renamed from: h, reason: collision with root package name */
        public final Matrix f22875h;

        public d(View view, f fVar, e eVar, Matrix matrix, boolean z10, boolean z11) {
            this.f22870c = z10;
            this.f22871d = z11;
            this.f22872e = view;
            this.f22873f = fVar;
            this.f22874g = eVar;
            this.f22875h = matrix;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f22868a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z10 = this.f22868a;
            f fVar = this.f22873f;
            View view = this.f22872e;
            if (!z10) {
                if (this.f22870c && this.f22871d) {
                    Matrix matrix = this.f22869b;
                    matrix.set(this.f22875h);
                    view.setTag(R.id.transition_transform, matrix);
                    fVar.getClass();
                    String[] strArr = C0927h.f22859N;
                    view.setTranslationX(fVar.f22881a);
                    view.setTranslationY(fVar.f22882b);
                    WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
                    C1596C.d.o(view, fVar.f22883c);
                    view.setScaleX(fVar.f22884d);
                    view.setScaleY(fVar.f22885e);
                    view.setRotationX(fVar.f22886f);
                    view.setRotationY(fVar.f22887g);
                    view.setRotation(fVar.f22888h);
                } else {
                    view.setTag(R.id.transition_transform, null);
                    view.setTag(R.id.parent_matrix, null);
                }
            }
            P.f22778a.d(view, null);
            fVar.getClass();
            String[] strArr2 = C0927h.f22859N;
            view.setTranslationX(fVar.f22881a);
            view.setTranslationY(fVar.f22882b);
            WeakHashMap<View, y0.E> weakHashMap2 = C1596C.f30963a;
            C1596C.d.o(view, fVar.f22883c);
            view.setScaleX(fVar.f22884d);
            view.setScaleY(fVar.f22885e);
            view.setRotationX(fVar.f22886f);
            view.setRotationY(fVar.f22887g);
            view.setRotation(fVar.f22888h);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = this.f22874g.f22876a;
            Matrix matrix2 = this.f22869b;
            matrix2.set(matrix);
            View view = this.f22872e;
            view.setTag(R.id.transition_transform, matrix2);
            f fVar = this.f22873f;
            fVar.getClass();
            String[] strArr = C0927h.f22859N;
            view.setTranslationX(fVar.f22881a);
            view.setTranslationY(fVar.f22882b);
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            C1596C.d.o(view, fVar.f22883c);
            view.setScaleX(fVar.f22884d);
            view.setScaleY(fVar.f22885e);
            view.setRotationX(fVar.f22886f);
            view.setRotationY(fVar.f22887g);
            view.setRotation(fVar.f22888h);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.f22872e;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            C1596C.d.o(view, 0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotationX(0.0f);
            view.setRotationY(0.0f);
            view.setRotation(0.0f);
        }
    }

    /* compiled from: ChangeTransform.java */
    /* renamed from: k1.h$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f22876a = new Matrix();

        /* renamed from: b, reason: collision with root package name */
        public final View f22877b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f22878c;

        /* renamed from: d, reason: collision with root package name */
        public float f22879d;

        /* renamed from: e, reason: collision with root package name */
        public float f22880e;

        public e(View view, float[] fArr) {
            this.f22877b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f22878c = fArr2;
            this.f22879d = fArr2[2];
            this.f22880e = fArr2[5];
            a();
        }

        public final void a() {
            float f10 = this.f22879d;
            float[] fArr = this.f22878c;
            fArr[2] = f10;
            fArr[5] = this.f22880e;
            Matrix matrix = this.f22876a;
            matrix.setValues(fArr);
            P.f22778a.d(this.f22877b, matrix);
        }
    }

    /* compiled from: ChangeTransform.java */
    /* renamed from: k1.h$f */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final float f22881a;

        /* renamed from: b, reason: collision with root package name */
        public final float f22882b;

        /* renamed from: c, reason: collision with root package name */
        public final float f22883c;

        /* renamed from: d, reason: collision with root package name */
        public final float f22884d;

        /* renamed from: e, reason: collision with root package name */
        public final float f22885e;

        /* renamed from: f, reason: collision with root package name */
        public final float f22886f;

        /* renamed from: g, reason: collision with root package name */
        public final float f22887g;

        /* renamed from: h, reason: collision with root package name */
        public final float f22888h;

        public f(View view) {
            this.f22881a = view.getTranslationX();
            this.f22882b = view.getTranslationY();
            WeakHashMap<View, y0.E> weakHashMap = C1596C.f30963a;
            this.f22883c = C1596C.d.g(view);
            this.f22884d = view.getScaleX();
            this.f22885e = view.getScaleY();
            this.f22886f = view.getRotationX();
            this.f22887g = view.getRotationY();
            this.f22888h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.f22881a == this.f22881a && fVar.f22882b == this.f22882b && fVar.f22883c == this.f22883c && fVar.f22884d == this.f22884d && fVar.f22885e == this.f22885e && fVar.f22886f == this.f22886f && fVar.f22887g == this.f22887g && fVar.f22888h == this.f22888h;
        }

        public final int hashCode() {
            float f10 = this.f22881a;
            int floatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
            float f11 = this.f22882b;
            int floatToIntBits2 = (floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f22883c;
            int floatToIntBits3 = (floatToIntBits2 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f22884d;
            int floatToIntBits4 = (floatToIntBits3 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f22885e;
            int floatToIntBits5 = (floatToIntBits4 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f22886f;
            int floatToIntBits6 = (floatToIntBits5 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f22887g;
            int floatToIntBits7 = (floatToIntBits6 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31;
            float f17 = this.f22888h;
            return floatToIntBits7 + (f17 != 0.0f ? Float.floatToIntBits(f17) : 0);
        }
    }

    public final void T(L l10) {
        View view = l10.f22762b;
        if (view.getVisibility() == 8) {
            return;
        }
        HashMap hashMap = l10.f22761a;
        hashMap.put("android:changeTransform:parent", view.getParent());
        hashMap.put("android:changeTransform:transforms", new f(view));
        Matrix matrix = view.getMatrix();
        hashMap.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f22864L) {
            Matrix matrix2 = new Matrix();
            P.f22778a.e((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            hashMap.put("android:changeTransform:parentMatrix", matrix2);
            hashMap.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            hashMap.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    @Override // k1.AbstractC0919C
    public final void g(L l10) {
        T(l10);
    }

    @Override // k1.AbstractC0919C
    public final void j(L l10) {
        T(l10);
        if (f22862Q) {
            return;
        }
        View view = l10.f22762b;
        ((ViewGroup) view.getParent()).startViewTransition(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0308, code lost:
    
        if (k1.C0936q.a.a(r15) > k1.C0936q.a.a(r0)) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0396, code lost:
    
        if (r2.size() == r1) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [C.N] */
    @Override // k1.AbstractC0919C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator n(android.view.ViewGroup r25, k1.L r26, k1.L r27) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C0927h.n(android.view.ViewGroup, k1.L, k1.L):android.animation.Animator");
    }

    @Override // k1.AbstractC0919C
    public final String[] w() {
        return f22859N;
    }
}
