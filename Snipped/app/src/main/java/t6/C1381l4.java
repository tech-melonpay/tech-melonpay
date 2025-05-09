package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentLoansHistoryBindingImpl.java */
/* renamed from: t6.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1381l4 extends E2 {

    /* renamed from: p, reason: collision with root package name */
    public static final SparseIntArray f29244p;

    /* renamed from: o, reason: collision with root package name */
    public long f29245o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29244p = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
        sparseIntArray.put(R.id.empty_layout, 2);
        sparseIntArray.put(R.id.empty_text, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1381l4(F0.c r3, android.view.View r4) {
        /*
            r2 = this;
            android.util.SparseIntArray r0 = t6.C1381l4.f29244p
            r1 = 4
            java.lang.Object[] r0 = F0.f.h(r4, r1, r0)
            r1 = 2
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 3
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 1
            r1 = r0[r1]
            com.airbnb.epoxy.EpoxyRecyclerView r1 = (com.airbnb.epoxy.EpoxyRecyclerView) r1
            r1 = 0
            r0 = r0[r1]
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            r2.<init>(r3, r4, r0)
            r0 = -1
            r2.f29245o = r0
            android.view.ViewGroup r3 = r2.f27773n
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r3 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r3
            r0 = 0
            r3.setTag(r0)
            r2.l(r4)
            monitor-enter(r2)
            r3 = 1
            r2.f29245o = r3     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            r2.i()
            return
        L37:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1381l4.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29245o = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29245o != 0;
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
