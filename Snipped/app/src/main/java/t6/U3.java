package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentFeeDetailsBindingImpl.java */
/* loaded from: classes2.dex */
public final class U3 extends T3 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f28567y;

    /* renamed from: x, reason: collision with root package name */
    public long f28568x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28567y = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.constraintLayout6, 2);
        sparseIntArray.put(R.id.icon, 3);
        sparseIntArray.put(R.id.ic_exchange, 4);
        sparseIntArray.put(R.id.shortName, 5);
        sparseIntArray.put(R.id.amount, 6);
        sparseIntArray.put(R.id.name, 7);
        sparseIntArray.put(R.id.exchange_layout, 8);
        sparseIntArray.put(R.id.exchange_from, 9);
        sparseIntArray.put(R.id.excahnge_arrow, 10);
        sparseIntArray.put(R.id.exchange_to, 11);
        sparseIntArray.put(R.id.payment_type, 12);
        sparseIntArray.put(R.id.first_label, 13);
        sparseIntArray.put(R.id.second_label, 14);
        sparseIntArray.put(R.id.third_label, 15);
        sparseIntArray.put(R.id.first_value, 16);
        sparseIntArray.put(R.id.second_value, 17);
        sparseIntArray.put(R.id.third_value, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public U3(F0.c r17, android.view.View r18) {
        /*
            r16 = this;
            r14 = r16
            r0 = r18
            android.util.SparseIntArray r1 = t6.U3.f28567y
            r2 = 19
            java.lang.Object[] r15 = F0.f.h(r0, r2, r1)
            r1 = 6
            r1 = r15[r1]
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1 = 2
            r1 = r15[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 10
            r1 = r15[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 9
            r1 = r15[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 8
            r1 = r15[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 11
            r1 = r15[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 13
            r1 = r15[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 16
            r1 = r15[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 4
            r1 = r15[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 3
            r1 = r15[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 7
            r1 = r15[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 1
            r1 = r15[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 12
            r1 = r15[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 14
            r1 = r15[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 17
            r1 = r15[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 5
            r1 = r15[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 15
            r1 = r15[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r1 = 18
            r1 = r15[r1]
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            r1 = r16
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -1
            r14.f28568x = r1
            r1 = 0
            r1 = r15[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2 = 0
            r1.setTag(r2)
            r14.l(r0)
            monitor-enter(r16)
            r0 = 1
            r14.f28568x = r0     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L9e
            r16.i()
            return
        L9e:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L9e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.U3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28568x = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28568x != 0;
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
