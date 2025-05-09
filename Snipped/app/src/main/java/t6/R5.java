package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentSettingsBindingImpl.java */
/* loaded from: classes2.dex */
public final class R5 extends Q5 {

    /* renamed from: p, reason: collision with root package name */
    public static final SparseIntArray f28416p;

    /* renamed from: o, reason: collision with root package name */
    public long f28417o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28416p = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public R5(F0.c r4, android.view.View r5) {
        /*
            r3 = this;
            android.util.SparseIntArray r0 = t6.R5.f28416p
            r1 = 2
            java.lang.Object[] r0 = F0.f.h(r5, r1, r0)
            r1 = 1
            r1 = r0[r1]
            com.airbnb.epoxy.EpoxyRecyclerView r1 = (com.airbnb.epoxy.EpoxyRecyclerView) r1
            r3.<init>(r4, r5, r1)
            r1 = -1
            r3.f28417o = r1
            r4 = 0
            r4 = r0[r4]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0 = 0
            r4.setTag(r0)
            r3.l(r5)
            monitor-enter(r3)
            r4 = 1
            r3.f28417o = r4     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            r3.i()
            return
        L29:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.R5.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28417o = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28417o != 0;
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
