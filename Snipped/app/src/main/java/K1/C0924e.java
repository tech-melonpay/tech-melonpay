package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.luminary.mobile.R;
import java.util.HashMap;
import k1.AbstractC0919C;

/* compiled from: ChangeClipBounds.java */
/* renamed from: k1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0924e extends AbstractC0919C {

    /* renamed from: K, reason: collision with root package name */
    public static final String[] f22845K = {"android:clipBounds:clip"};

    /* renamed from: L, reason: collision with root package name */
    public static final Rect f22846L = new Rect();

    /* compiled from: ChangeClipBounds.java */
    /* renamed from: k1.e$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC0919C.g {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f22847a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f22848b;

        /* renamed from: c, reason: collision with root package name */
        public final View f22849c;

        public a(View view, Rect rect, Rect rect2) {
            this.f22849c = view;
            this.f22847a = rect;
            this.f22848b = rect2;
        }

        @Override // k1.AbstractC0919C.g
        public final void c() {
            View view = this.f22849c;
            Rect clipBounds = view.getClipBounds();
            if (clipBounds == null) {
                clipBounds = C0924e.f22846L;
            }
            view.setTag(R.id.transition_clip, clipBounds);
            view.setClipBounds(this.f22848b);
        }

        @Override // k1.AbstractC0919C.g
        public final void j() {
            View view = this.f22849c;
            view.setClipBounds((Rect) view.getTag(R.id.transition_clip));
            view.setTag(R.id.transition_clip, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) {
            View view = this.f22849c;
            if (z10) {
                view.setClipBounds(this.f22847a);
            } else {
                view.setClipBounds(this.f22848b);
            }
        }

        @Override // k1.AbstractC0919C.g
        public final void a(AbstractC0919C abstractC0919C) {
        }

        @Override // k1.AbstractC0919C.g
        public final void e(AbstractC0919C abstractC0919C) {
        }

        @Override // k1.AbstractC0919C.g
        public final void i(AbstractC0919C abstractC0919C) {
        }
    }

    public static void T(L l10, boolean z10) {
        View view = l10.f22762b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rect = z10 ? (Rect) view.getTag(R.id.transition_clip) : null;
        if (rect == null) {
            rect = view.getClipBounds();
        }
        Rect rect2 = rect != f22846L ? rect : null;
        HashMap hashMap = l10.f22761a;
        hashMap.put("android:clipBounds:clip", rect2);
        if (rect2 == null) {
            hashMap.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // k1.AbstractC0919C
    public final boolean A() {
        return true;
    }

    @Override // k1.AbstractC0919C
    public final void g(L l10) {
        T(l10, false);
    }

    @Override // k1.AbstractC0919C
    public final void j(L l10) {
        T(l10, true);
    }

    @Override // k1.AbstractC0919C
    public final Animator n(ViewGroup viewGroup, L l10, L l11) {
        if (l10 != null && l11 != null) {
            HashMap hashMap = l10.f22761a;
            if (hashMap.containsKey("android:clipBounds:clip")) {
                HashMap hashMap2 = l11.f22761a;
                if (hashMap2.containsKey("android:clipBounds:clip")) {
                    Rect rect = (Rect) hashMap.get("android:clipBounds:clip");
                    Rect rect2 = (Rect) hashMap2.get("android:clipBounds:clip");
                    if (rect == null && rect2 == null) {
                        return null;
                    }
                    Rect rect3 = rect == null ? (Rect) hashMap.get("android:clipBounds:bounds") : rect;
                    Rect rect4 = rect2 == null ? (Rect) hashMap2.get("android:clipBounds:bounds") : rect2;
                    if (rect3.equals(rect4)) {
                        return null;
                    }
                    View view = l11.f22762b;
                    view.setClipBounds(rect);
                    Rect rect5 = new Rect();
                    I2.a aVar = new I2.a(2);
                    aVar.f1727b = rect5;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, P.f22780c, aVar, rect3, rect4);
                    a aVar2 = new a(view, rect, rect2);
                    ofObject.addListener(aVar2);
                    a(aVar2);
                    return ofObject;
                }
            }
        }
        return null;
    }

    @Override // k1.AbstractC0919C
    public final String[] w() {
        return f22845K;
    }
}
