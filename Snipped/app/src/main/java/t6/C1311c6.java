package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentStatisticsBindingImpl.java */
/* renamed from: t6.c6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1311c6 extends AbstractC1303b6 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f28878x;

    /* renamed from: w, reason: collision with root package name */
    public long f28879w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28878x = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.tab_statistics, 2);
        sparseIntArray.put(R.id.filterTitleTextView, 3);
        sparseIntArray.put(R.id.totalLayout, 4);
        sparseIntArray.put(R.id.status_layout, 5);
        sparseIntArray.put(R.id.imageView3, 6);
        sparseIntArray.put(R.id.title_text, 7);
        sparseIntArray.put(R.id.textView57, 8);
        sparseIntArray.put(R.id.textView58, 9);
        sparseIntArray.put(R.id.statisticView, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1311c6(F0.c r15, android.view.View r16) {
        /*
            r14 = this;
            r13 = r14
            r0 = r16
            android.util.SparseIntArray r1 = t6.C1311c6.f28878x
            r2 = 11
            java.lang.Object[] r1 = F0.f.h(r0, r2, r1)
            r2 = 3
            r2 = r1[r2]
            r4 = r2
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2 = 6
            r2 = r1[r2]
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r2 = 1
            r2 = r1[r2]
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            r2 = 10
            r2 = r1[r2]
            r6 = r2
            com.luminary.business.presentation.ui.views.StatisticView r6 = (com.luminary.business.presentation.ui.views.StatisticView) r6
            r2 = 5
            r2 = r1[r2]
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r2 = 0
            r2 = r1[r2]
            r7 = r2
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r7 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r7
            r2 = 2
            r2 = r1[r2]
            r8 = r2
            com.google.android.material.tabs.TabLayout r8 = (com.google.android.material.tabs.TabLayout) r8
            r2 = 8
            r2 = r1[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = 9
            r2 = r1[r2]
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            r2 = 7
            r2 = r1[r2]
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            r2 = 4
            r1 = r1[r2]
            r12 = r1
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r1 = r14
            r2 = r15
            r3 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.f28879w = r1
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r13.f28840q
            r2 = 0
            r1.setTag(r2)
            r14.l(r0)
            monitor-enter(r14)
            r0 = 1
            r13.f28879w = r0     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L6c
            r14.i()
            return
        L6c:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L6c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1311c6.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28879w = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28879w != 0;
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
