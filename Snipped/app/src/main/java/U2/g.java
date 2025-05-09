package u2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* compiled from: MotionTiming.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public long f30152a;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f30154c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f30155d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f30156e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f30153b = 150;

    public g(long j10) {
        this.f30152a = j10;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f30152a);
        animator.setDuration(this.f30153b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f30155d);
            valueAnimator.setRepeatMode(this.f30156e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f30154c;
        return timeInterpolator != null ? timeInterpolator : C1512a.f30142b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f30152a == gVar.f30152a && this.f30153b == gVar.f30153b && this.f30155d == gVar.f30155d && this.f30156e == gVar.f30156e) {
            return b().getClass().equals(gVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f30152a;
        long j11 = this.f30153b;
        return ((((b().getClass().hashCode() + (((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31)) * 31) + this.f30155d) * 31) + this.f30156e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(g.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f30152a);
        sb2.append(" duration: ");
        sb2.append(this.f30153b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f30155d);
        sb2.append(" repeatMode: ");
        return s3.b.m(sb2, this.f30156e, "}\n");
    }
}
