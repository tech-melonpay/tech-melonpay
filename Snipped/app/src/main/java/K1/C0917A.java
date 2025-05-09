package k1;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: Slide.java */
/* renamed from: k1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0917A extends W {

    /* renamed from: N, reason: collision with root package name */
    public static final DecelerateInterpolator f22669N = new DecelerateInterpolator();

    /* renamed from: O, reason: collision with root package name */
    public static final AccelerateInterpolator f22670O = new AccelerateInterpolator();

    /* renamed from: P, reason: collision with root package name */
    public static final a f22671P = new a();

    /* renamed from: Q, reason: collision with root package name */
    public static final b f22672Q = new b();
    public static final c R = new c();
    public static final d S = new d();
    public static final e T = new e();
    public static final f U = new f();

    /* renamed from: M, reason: collision with root package name */
    public g f22673M;

    /* compiled from: Slide.java */
    /* renamed from: k1.A$a */
    public class a extends h {
        @Override // k1.C0917A.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* renamed from: k1.A$b */
    public class b extends h {
        @Override // k1.C0917A.g
        public final float a(View view, ViewGroup viewGroup) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* renamed from: k1.A$c */
    public class c extends i {
        @Override // k1.C0917A.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* compiled from: Slide.java */
    /* renamed from: k1.A$d */
    public class d extends h {
        @Override // k1.C0917A.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* renamed from: k1.A$e */
    public class e extends h {
        @Override // k1.C0917A.g
        public final float a(View view, ViewGroup viewGroup) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* renamed from: k1.A$f */
    public class f extends i {
        @Override // k1.C0917A.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* compiled from: Slide.java */
    /* renamed from: k1.A$g */
    public interface g {
        float a(View view, ViewGroup viewGroup);

        float b(View view, ViewGroup viewGroup);
    }

    /* compiled from: Slide.java */
    /* renamed from: k1.A$h */
    public static abstract class h implements g {
        @Override // k1.C0917A.g
        public final float b(View view, ViewGroup viewGroup) {
            return view.getTranslationY();
        }
    }

    /* compiled from: Slide.java */
    /* renamed from: k1.A$i */
    public static abstract class i implements g {
        @Override // k1.C0917A.g
        public final float a(View view, ViewGroup viewGroup) {
            return view.getTranslationX();
        }
    }

    @Override // k1.AbstractC0919C
    public final boolean A() {
        return true;
    }

    @Override // k1.W
    public final ObjectAnimator V(ViewGroup viewGroup, View view, L l10, L l11) {
        if (l11 == null) {
            return null;
        }
        int[] iArr = (int[]) l11.f22761a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return M.a(view, l11, iArr[0], iArr[1], this.f22673M.a(view, viewGroup), this.f22673M.b(view, viewGroup), translationX, translationY, f22669N, this);
    }

    @Override // k1.W
    public final ObjectAnimator W(ViewGroup viewGroup, View view, L l10, L l11) {
        if (l10 == null) {
            return null;
        }
        int[] iArr = (int[]) l10.f22761a.get("android:slide:screenPosition");
        return M.a(view, l10, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f22673M.a(view, viewGroup), this.f22673M.b(view, viewGroup), f22670O, this);
    }

    @Override // k1.W, k1.AbstractC0919C
    public final void g(L l10) {
        W.T(l10);
        int[] iArr = new int[2];
        l10.f22762b.getLocationOnScreen(iArr);
        l10.f22761a.put("android:slide:screenPosition", iArr);
    }

    @Override // k1.AbstractC0919C
    public final void j(L l10) {
        W.T(l10);
        int[] iArr = new int[2];
        l10.f22762b.getLocationOnScreen(iArr);
        l10.f22761a.put("android:slide:screenPosition", iArr);
    }
}
