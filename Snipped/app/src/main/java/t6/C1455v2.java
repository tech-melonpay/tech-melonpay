package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: DialogVersionBindingImpl.java */
/* renamed from: t6.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1455v2 extends AbstractC1448u2 {

    /* renamed from: q, reason: collision with root package name */
    public static final SparseIntArray f29713q;

    /* renamed from: p, reason: collision with root package name */
    public long f29714p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29713q = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.description, 2);
        sparseIntArray.put(R.id.button_accept, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1455v2(F0.c r4, android.view.View r5) {
        /*
            r3 = this;
            android.util.SparseIntArray r0 = t6.C1455v2.f29713q
            r1 = 4
            java.lang.Object[] r0 = F0.f.h(r5, r1, r0)
            r1 = 3
            r1 = r0[r1]
            android.widget.Button r1 = (android.widget.Button) r1
            r2 = 2
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 1
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3.<init>(r4, r5, r1)
            r1 = -1
            r3.f29714p = r1
            r4 = 0
            r4 = r0[r4]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0 = 0
            r4.setTag(r0)
            r3.l(r5)
            monitor-enter(r3)
            r4 = 1
            r3.f29714p = r4     // Catch: java.lang.Throwable -> L33
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            r3.i()
            return
        L33:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1455v2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29714p = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29714p != 0;
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
