package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: DialogTimerBindingImpl.java */
/* renamed from: t6.t2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1441t2 extends AbstractC1434s2 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f29613u;

    /* renamed from: t, reason: collision with root package name */
    public long f29614t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29613u = sparseIntArray;
        sparseIntArray.put(R.id.pb, 1);
        sparseIntArray.put(R.id.pintTextView, 2);
        sparseIntArray.put(R.id.title, 3);
        sparseIntArray.put(R.id.description, 4);
        sparseIntArray.put(R.id.button_accept, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1441t2(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.C1441t2.f29613u
            r1 = 6
            java.lang.Object[] r0 = F0.f.h(r12, r1, r0)
            r1 = 5
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator r7 = (antonkozyriatskyi.circularprogressindicator.CircularProgressIndicator) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.f29614t = r1
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r0 = 0
            r11.setTag(r0)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 1
            r10.f29614t = r11     // Catch: java.lang.Throwable -> L45
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            r10.i()
            return
        L45:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1441t2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29614t = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29614t != 0;
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
