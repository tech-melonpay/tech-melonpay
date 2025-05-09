package u2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* compiled from: MotionSpec.java */
/* renamed from: u2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1517f {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.collection.g<String, g> f30150a = new androidx.collection.g<>();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.collection.g<String, PropertyValuesHolder[]> f30151b = new androidx.collection.g<>();

    public static C1517f a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e10);
            return null;
        }
    }

    public static C1517f b(ArrayList arrayList) {
        C1517f c1517f = new C1517f();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c1517f.f30151b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = C1512a.f30142b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = C1512a.f30143c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = C1512a.f30144d;
            }
            g gVar = new g();
            gVar.f30155d = 0;
            gVar.f30156e = 1;
            gVar.f30152a = startDelay;
            gVar.f30153b = duration;
            gVar.f30154c = interpolator;
            gVar.f30155d = objectAnimator.getRepeatCount();
            gVar.f30156e = objectAnimator.getRepeatMode();
            c1517f.f30150a.put(propertyName, gVar);
        }
        return c1517f;
    }

    public final g c(String str) {
        androidx.collection.g<String, g> gVar = this.f30150a;
        if (gVar.get(str) != null) {
            return gVar.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1517f) {
            return this.f30150a.equals(((C1517f) obj).f30150a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30150a.hashCode();
    }

    public final String toString() {
        return "\n" + C1517f.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f30150a + "}\n";
    }
}
