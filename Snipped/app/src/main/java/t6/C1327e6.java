package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentStatusBindingImpl.java */
/* renamed from: t6.e6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1327e6 extends AbstractC1319d6 {

    /* renamed from: r, reason: collision with root package name */
    public static final SparseIntArray f28966r;

    /* renamed from: q, reason: collision with root package name */
    public long f28967q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28966r = sparseIntArray;
        sparseIntArray.put(R.id.constraintLayout4, 1);
        sparseIntArray.put(R.id.image, 2);
        sparseIntArray.put(R.id.title, 3);
        sparseIntArray.put(R.id.button_done, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1327e6(F0.c r9, android.view.View r10) {
        /*
            r8 = this;
            android.util.SparseIntArray r0 = t6.C1327e6.f28966r
            r1 = 5
            java.lang.Object[] r0 = F0.f.h(r10, r1, r0)
            r1 = 4
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 1
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = -1
            r8.f28967q = r1
            r9 = 0
            r9 = r0[r9]
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r0 = 0
            r9.setTag(r0)
            r8.l(r10)
            monitor-enter(r8)
            r9 = 1
            r8.f28967q = r9     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            r8.i()
            return
        L3e:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3e
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1327e6.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28967q = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28967q != 0;
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
