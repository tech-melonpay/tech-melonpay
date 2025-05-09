package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentSignerListBindingImpl.java */
/* loaded from: classes2.dex */
public final class Y5 extends X5 {

    /* renamed from: q, reason: collision with root package name */
    public static final SparseIntArray f28711q;

    /* renamed from: p, reason: collision with root package name */
    public long f28712p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28711q = sparseIntArray;
        sparseIntArray.put(R.id.textview2, 1);
        sparseIntArray.put(R.id.pb, 2);
        sparseIntArray.put(R.id.timerTextView, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Y5(F0.c r4, android.view.View r5) {
        /*
            r3 = this;
            android.util.SparseIntArray r0 = t6.Y5.f28711q
            r1 = 4
            java.lang.Object[] r0 = F0.f.h(r5, r1, r0)
            r1 = 2
            r1 = r0[r1]
            antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator r1 = (antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator) r1
            r2 = 1
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 3
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3.<init>(r4, r5, r1, r2)
            r1 = -1
            r3.f28712p = r1
            r4 = 0
            r4 = r0[r4]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0 = 0
            r4.setTag(r0)
            r3.l(r5)
            monitor-enter(r3)
            r4 = 1
            r3.f28712p = r4     // Catch: java.lang.Throwable -> L33
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            r3.i()
            return
        L33:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.Y5.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28712p = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28712p != 0;
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
