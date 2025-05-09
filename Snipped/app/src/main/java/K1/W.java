package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.luminary.mobile.R;
import java.util.HashMap;
import k1.AbstractC0919C;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class W extends AbstractC0919C {

    /* renamed from: L, reason: collision with root package name */
    public static final String[] f22789L = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: K, reason: collision with root package name */
    public int f22790K;

    /* compiled from: Visibility.java */
    public static class a extends AnimatorListenerAdapter implements AbstractC0919C.g {

        /* renamed from: a, reason: collision with root package name */
        public final View f22791a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22792b;

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f22793c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22795e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22796f = false;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f22794d = true;

        public a(int i, View view) {
            this.f22791a = view;
            this.f22792b = i;
            this.f22793c = (ViewGroup) view.getParent();
            d(true);
        }

        @Override // k1.AbstractC0919C.g
        public final void c() {
            d(false);
            if (this.f22796f) {
                return;
            }
            P.c(this.f22791a, this.f22792b);
        }

        public final void d(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f22794d || this.f22795e == z10 || (viewGroup = this.f22793c) == null) {
                return;
            }
            this.f22795e = z10;
            O.a(viewGroup, z10);
        }

        @Override // k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
            abstractC0919C.G(this);
        }

        @Override // k1.AbstractC0919C.g
        public final void j() {
            d(true);
            if (this.f22796f) {
                return;
            }
            P.c(this.f22791a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f22796f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f22796f) {
                P.c(this.f22791a, this.f22792b);
                ViewGroup viewGroup = this.f22793c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            d(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                P.c(this.f22791a, 0);
                ViewGroup viewGroup = this.f22793c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            if (!this.f22796f) {
                P.c(this.f22791a, this.f22792b);
                ViewGroup viewGroup = this.f22793c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            d(false);
        }

        @Override // k1.AbstractC0919C.g
        public final void a(AbstractC0919C abstractC0919C) {
        }

        @Override // k1.AbstractC0919C.g
        public final void e(AbstractC0919C abstractC0919C) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }

    /* compiled from: Visibility.java */
    public class b extends AnimatorListenerAdapter implements AbstractC0919C.g {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f22797a;

        /* renamed from: b, reason: collision with root package name */
        public final View f22798b;

        /* renamed from: c, reason: collision with root package name */
        public final View f22799c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22800d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f22797a = viewGroup;
            this.f22798b = view;
            this.f22799c = view2;
        }

        @Override // k1.AbstractC0919C.g
        public final void a(AbstractC0919C abstractC0919C) {
            if (this.f22800d) {
                d();
            }
        }

        public final void d() {
            this.f22799c.setTag(R.id.save_overlay_view, null);
            this.f22797a.getOverlay().remove(this.f22798b);
            this.f22800d = false;
        }

        @Override // k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
            abstractC0919C.G(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            d();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.f22797a.getOverlay().remove(this.f22798b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.f22798b;
            if (view.getParent() == null) {
                this.f22797a.getOverlay().add(view);
            } else {
                W.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                View view = this.f22799c;
                View view2 = this.f22798b;
                view.setTag(R.id.save_overlay_view, view2);
                this.f22797a.getOverlay().add(view2);
                this.f22800d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            d();
        }

        @Override // k1.AbstractC0919C.g
        public final void c() {
        }

        @Override // k1.AbstractC0919C.g
        public final void j() {
        }

        @Override // k1.AbstractC0919C.g
        public final void e(AbstractC0919C abstractC0919C) {
        }
    }

    /* compiled from: Visibility.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f22802a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f22803b;

        /* renamed from: c, reason: collision with root package name */
        public int f22804c;

        /* renamed from: d, reason: collision with root package name */
        public int f22805d;

        /* renamed from: e, reason: collision with root package name */
        public ViewGroup f22806e;

        /* renamed from: f, reason: collision with root package name */
        public ViewGroup f22807f;
    }

    public W() {
        this.f22790K = 3;
    }

    public static void T(L l10) {
        int visibility = l10.f22762b.getVisibility();
        HashMap hashMap = l10.f22761a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = l10.f22762b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k1.W.c U(k1.L r8, k1.L r9) {
        /*
            k1.W$c r0 = new k1.W$c
            r0.<init>()
            r1 = 0
            r0.f22802a = r1
            r0.f22803b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f22761a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f22804c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f22806e = r6
            goto L33
        L2f:
            r0.f22804c = r3
            r0.f22806e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f22761a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f22805d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f22807f = r2
            goto L56
        L52:
            r0.f22805d = r3
            r0.f22807f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f22804c
            int r9 = r0.f22805d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f22806e
            android.view.ViewGroup r4 = r0.f22807f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f22803b = r1
            r0.f22802a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f22803b = r2
            r0.f22802a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f22807f
            if (r8 != 0) goto L81
            r0.f22803b = r1
            r0.f22802a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f22806e
            if (r8 != 0) goto L9f
            r0.f22803b = r2
            r0.f22802a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f22805d
            if (r8 != 0) goto L95
            r0.f22803b = r2
            r0.f22802a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f22804c
            if (r8 != 0) goto L9f
            r0.f22803b = r1
            r0.f22802a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.W.U(k1.L, k1.L):k1.W$c");
    }

    @Override // k1.AbstractC0919C
    public final boolean B(L l10, L l11) {
        if (l10 == null && l11 == null) {
            return false;
        }
        if (l10 != null && l11 != null && l11.f22761a.containsKey("android:visibility:visibility") != l10.f22761a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c U = U(l10, l11);
        if (U.f22802a) {
            return U.f22804c == 0 || U.f22805d == 0;
        }
        return false;
    }

    public abstract ObjectAnimator V(ViewGroup viewGroup, View view, L l10, L l11);

    public abstract ObjectAnimator W(ViewGroup viewGroup, View view, L l10, L l11);

    public final void X(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f22790K = i;
    }

    @Override // k1.AbstractC0919C
    public void g(L l10) {
        T(l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (U(t(r5, false), x(r5, false)).f22802a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    @Override // k1.AbstractC0919C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator n(android.view.ViewGroup r21, k1.L r22, k1.L r23) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.W.n(android.view.ViewGroup, k1.L, k1.L):android.animation.Animator");
    }

    @Override // k1.AbstractC0919C
    public final String[] w() {
        return f22789L;
    }

    public W(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22790K = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0918B.f22677d);
        int b9 = m0.i.b(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (b9 != 0) {
            X(b9);
        }
    }
}
