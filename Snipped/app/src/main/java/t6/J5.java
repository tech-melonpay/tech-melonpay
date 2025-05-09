package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentSelectPlansBindingImpl.java */
/* loaded from: classes2.dex */
public final class J5 extends I5 {

    /* renamed from: p, reason: collision with root package name */
    public static final SparseIntArray f28032p;

    /* renamed from: o, reason: collision with root package name */
    public long f28033o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28032p = sparseIntArray;
        sparseIntArray.put(R.id.epoxyCarousel, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public J5(F0.c r4, android.view.View r5) {
        /*
            r3 = this;
            android.util.SparseIntArray r0 = t6.J5.f28032p
            r1 = 2
            java.lang.Object[] r0 = F0.f.h(r5, r1, r0)
            r1 = 1
            r1 = r0[r1]
            com.airbnb.epoxy.Carousel r1 = (com.airbnb.epoxy.Carousel) r1
            r3.<init>(r4, r5, r1)
            r1 = -1
            r3.f28033o = r1
            r4 = 0
            r4 = r0[r4]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0 = 0
            r4.setTag(r0)
            r3.l(r5)
            monitor-enter(r3)
            r4 = 1
            r3.f28033o = r4     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            r3.i()
            return
        L29:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.J5.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28033o = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28033o != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        return true;
    }
}
