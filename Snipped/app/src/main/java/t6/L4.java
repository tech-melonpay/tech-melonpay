package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewCompanyTeamMembersBindingImpl.java */
/* loaded from: classes2.dex */
public final class L4 extends K4 {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f28108t;

    /* renamed from: s, reason: collision with root package name */
    public long f28109s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28108t = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
        sparseIntArray.put(R.id.subtitle_text, 2);
        sparseIntArray.put(R.id.button_next, 3);
        sparseIntArray.put(R.id.button_add_new, 4);
        sparseIntArray.put(R.id.button_add_new_empty, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public L4(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.L4.f28108t
            r1 = 6
            java.lang.Object[] r0 = F0.f.h(r12, r1, r0)
            r1 = 4
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            android.widget.Button r7 = (android.widget.Button) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            com.airbnb.epoxy.EpoxyRecyclerView r8 = (com.airbnb.epoxy.EpoxyRecyclerView) r8
            r1 = 2
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.f28109s = r1
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r0 = 0
            r11.setTag(r0)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 1
            r10.f28109s = r11     // Catch: java.lang.Throwable -> L45
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            r10.i()
            return
        L45:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L45
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.L4.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28109s = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28109s != 0;
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
