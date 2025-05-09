package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCompanyUnderReviewBindingImpl.java */
/* renamed from: t6.j3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1364j3 extends AbstractC1356i3 {

    /* renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f29129s;

    /* renamed from: r, reason: collision with root package name */
    public long f29130r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29129s = sparseIntArray;
        sparseIntArray.put(R.id.constraintLayout, 1);
        sparseIntArray.put(R.id.name, 2);
        sparseIntArray.put(R.id.view, 3);
        sparseIntArray.put(R.id.first_label, 4);
        sparseIntArray.put(R.id.first_value, 5);
        sparseIntArray.put(R.id.second_label, 6);
        sparseIntArray.put(R.id.second_value, 7);
        sparseIntArray.put(R.id.third_label, 8);
        sparseIntArray.put(R.id.third_value, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1364j3(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = t6.C1364j3.f29129s
            r1 = 10
            java.lang.Object[] r0 = F0.f.h(r11, r1, r0)
            r1 = 1
            r1 = r0[r1]
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1 = 4
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 5
            r1 = r0[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 6
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 7
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 8
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 9
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 3
            r1 = r0[r1]
            android.view.View r1 = (android.view.View) r1
            r2 = r9
            r3 = r11
            r8 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = -1
            r9.f29130r = r1
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r0 = 0
            r10.setTag(r0)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 1
            r9.f29130r = r10     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L5b
            r9.i()
            return
        L5b:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L5b
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1364j3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29130r = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29130r != 0;
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
