package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentHomeBindingImpl.java */
/* loaded from: classes2.dex */
public final class Z3 extends E2 {

    /* renamed from: p, reason: collision with root package name */
    public static final SparseIntArray f28738p;

    /* renamed from: o, reason: collision with root package name */
    public long f28739o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28738p = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
        sparseIntArray.put(R.id.view4, 2);
        sparseIntArray.put(R.id.empty_layout, 3);
        sparseIntArray.put(R.id.empty_text, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Z3(F0.c r4, android.view.View r5) {
        /*
            r3 = this;
            android.util.SparseIntArray r0 = t6.Z3.f28738p
            r1 = 5
            java.lang.Object[] r0 = F0.f.h(r5, r1, r0)
            r1 = 3
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 4
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 1
            r1 = r0[r1]
            com.airbnb.epoxy.EpoxyRecyclerView r1 = (com.airbnb.epoxy.EpoxyRecyclerView) r1
            r1 = 0
            r1 = r0[r1]
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r1
            r2 = 2
            r0 = r0[r2]
            android.view.View r0 = (android.view.View) r0
            r3.<init>(r4, r5, r1)
            r0 = -1
            r3.f28739o = r0
            android.view.ViewGroup r4 = r3.f27773n
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r4 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r4
            r0 = 0
            r4.setTag(r0)
            r3.l(r5)
            monitor-enter(r3)
            r4 = 1
            r3.f28739o = r4     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            r3.i()
            return
        L3c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.Z3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28739o = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28739o != 0;
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
