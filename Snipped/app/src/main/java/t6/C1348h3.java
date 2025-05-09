package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCompanyNotApprovedBindingImpl.java */
/* renamed from: t6.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1348h3 extends AbstractC1340g3 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f29054u;

    /* renamed from: t, reason: collision with root package name */
    public long f29055t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29054u = sparseIntArray;
        sparseIntArray.put(R.id.constraintLayout, 1);
        sparseIntArray.put(R.id.shortName, 2);
        sparseIntArray.put(R.id.name, 3);
        sparseIntArray.put(R.id.view, 4);
        sparseIntArray.put(R.id.first_label, 5);
        sparseIntArray.put(R.id.second_label, 6);
        sparseIntArray.put(R.id.first_value, 7);
        sparseIntArray.put(R.id.second_value, 8);
        sparseIntArray.put(R.id.button_delete, 9);
        sparseIntArray.put(R.id.button_contact, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1348h3(F0.c r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = t6.C1348h3.f29054u
            r1 = 11
            java.lang.Object[] r0 = F0.f.h(r13, r1, r0)
            r1 = 10
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 9
            r1 = r0[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 1
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 7
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 6
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 8
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 2
            r1 = r0[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 4
            r1 = r0[r1]
            android.view.View r1 = (android.view.View) r1
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = -1
            r11.f29055t = r1
            r12 = 0
            r12 = r0[r12]
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r0 = 0
            r12.setTag(r0)
            r11.l(r13)
            monitor-enter(r11)
            r12 = 1
            r11.f29055t = r12     // Catch: java.lang.Throwable -> L63
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L63
            r11.i()
            return
        L63:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L63
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1348h3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29055t = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29055t != 0;
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
