package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentSelectCardTypeBindingImpl.java */
/* loaded from: classes2.dex */
public final class H5 extends G5 {

    /* renamed from: q, reason: collision with root package name */
    public static final SparseIntArray f27949q;

    /* renamed from: p, reason: collision with root package name */
    public long f27950p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27949q = sparseIntArray;
        sparseIntArray.put(R.id.textView17, 1);
        sparseIntArray.put(R.id.epoxyCarousel, 2);
        sparseIntArray.put(R.id.button_done, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public H5(F0.c r5, android.view.View r6) {
        /*
            r4 = this;
            android.util.SparseIntArray r0 = t6.H5.f27949q
            r1 = 4
            java.lang.Object[] r0 = F0.f.h(r6, r1, r0)
            r1 = 3
            r1 = r0[r1]
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r2 = 2
            r2 = r0[r2]
            com.luminary.business.presentation.ui.views.CyclicCarousel r2 = (com.luminary.business.presentation.ui.views.CyclicCarousel) r2
            r3 = 1
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4.<init>(r5, r6, r1, r2)
            r1 = -1
            r4.f27950p = r1
            r5 = 0
            r5 = r0[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 0
            r5.setTag(r0)
            r4.l(r6)
            monitor-enter(r4)
            r5 = 1
            r4.f27950p = r5     // Catch: java.lang.Throwable -> L33
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
            r4.i()
            return
        L33:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L33
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.H5.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27950p = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27950p != 0;
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
