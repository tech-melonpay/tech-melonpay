package J2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f2121a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public ValueAnimator f2122b = null;

    /* renamed from: c, reason: collision with root package name */
    public final a f2123c = new a();

    /* compiled from: StateListAnimator.java */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            e eVar = e.this;
            if (eVar.f2122b == animator) {
                eVar.f2122b = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    public static class b {
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b();
        valueAnimator.addListener(this.f2123c);
        this.f2121a.add(bVar);
    }
}
