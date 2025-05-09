package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentAccountDetailsBindingImpl.java */
/* loaded from: classes2.dex */
public final class B2 extends A2 {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f27643t;

    /* renamed from: s, reason: collision with root package name */
    public long f27644s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27643t = sparseIntArray;
        sparseIntArray.put(R.id.swipeToRefresh, 1);
        sparseIntArray.put(R.id.epoxyRecyclerView, 2);
        sparseIntArray.put(R.id.view4, 3);
        sparseIntArray.put(R.id.empty_layout, 4);
        sparseIntArray.put(R.id.empty_text, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public B2(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.B2.f27643t
            r1 = 6
            java.lang.Object[] r0 = F0.f.h(r12, r1, r0)
            r1 = 4
            r1 = r0[r1]
            r5 = r1
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            com.airbnb.epoxy.EpoxyRecyclerView r7 = (com.airbnb.epoxy.EpoxyRecyclerView) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r8 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            android.view.View r9 = (android.view.View) r9
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.f27644s = r1
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r0 = 0
            r11.setTag(r0)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 1
            r10.f27644s = r11     // Catch: java.lang.Throwable -> L45
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            r10.i()
            return
        L45:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.B2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27644s = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27644s != 0;
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
