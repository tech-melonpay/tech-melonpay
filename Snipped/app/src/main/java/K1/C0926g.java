package k1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: ChangeScroll.java */
/* renamed from: k1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0926g extends AbstractC0919C {

    /* renamed from: K, reason: collision with root package name */
    public static final String[] f22858K = {"android:changeScroll:x", "android:changeScroll:y"};

    public static void T(L l10) {
        HashMap hashMap = l10.f22761a;
        View view = l10.f22762b;
        hashMap.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
        hashMap.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
    }

    @Override // k1.AbstractC0919C
    public final boolean A() {
        return true;
    }

    @Override // k1.AbstractC0919C
    public final void g(L l10) {
        T(l10);
    }

    @Override // k1.AbstractC0919C
    public final void j(L l10) {
        T(l10);
    }

    @Override // k1.AbstractC0919C
    public final Animator n(ViewGroup viewGroup, L l10, L l11) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (l10 == null || l11 == null) {
            return null;
        }
        HashMap hashMap = l10.f22761a;
        int intValue = ((Integer) hashMap.get("android:changeScroll:x")).intValue();
        HashMap hashMap2 = l11.f22761a;
        int intValue2 = ((Integer) hashMap2.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) hashMap.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) hashMap2.get("android:changeScroll:y")).intValue();
        View view = l11.f22762b;
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        boolean z10 = K.f22757a;
        if (objectAnimator == null) {
            return objectAnimator2;
        }
        if (objectAnimator2 == null) {
            return objectAnimator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimator, objectAnimator2);
        return animatorSet;
    }

    @Override // k1.AbstractC0919C
    public final String[] w() {
        return f22858K;
    }
}
