package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: DialogSortBindingImpl.java */
/* renamed from: t6.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1387m2 extends AbstractC1379l2 {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f29308E;

    /* renamed from: D, reason: collision with root package name */
    public long f29309D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29308E = sparseIntArray;
        sparseIntArray.put(R.id.title_text, 1);
        sparseIntArray.put(R.id.close, 2);
        sparseIntArray.put(R.id.tabSort, 3);
        sparseIntArray.put(R.id.new_to_old, 4);
        sparseIntArray.put(R.id.new_to_old_imageView, 5);
        sparseIntArray.put(R.id.new_to_old_title, 6);
        sparseIntArray.put(R.id.new_to_old_description, 7);
        sparseIntArray.put(R.id.old_to_new, 8);
        sparseIntArray.put(R.id.old_to_new_imageView, 9);
        sparseIntArray.put(R.id.old_to_new_title, 10);
        sparseIntArray.put(R.id.old_to_new_description, 11);
        sparseIntArray.put(R.id.high_to_low, 12);
        sparseIntArray.put(R.id.high_to_low_imageView, 13);
        sparseIntArray.put(R.id.high_to_low_title, 14);
        sparseIntArray.put(R.id.high_to_low_description, 15);
        sparseIntArray.put(R.id.low_to_high, 16);
        sparseIntArray.put(R.id.low_to_high_imageView, 17);
        sparseIntArray.put(R.id.low_to_high_title, 18);
        sparseIntArray.put(R.id.low_to_high_description, 19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1387m2(F0.c r21, android.view.View r22) {
        /*
            r20 = this;
            r3 = r20
            r0 = r22
            android.util.SparseIntArray r1 = t6.C1387m2.f29308E
            r2 = 20
            java.lang.Object[] r19 = F0.f.h(r0, r2, r1)
            r1 = 2
            r1 = r19[r1]
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1 = 12
            r1 = r19[r1]
            r5 = r1
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r1 = 15
            r1 = r19[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 13
            r1 = r19[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 14
            r1 = r19[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 16
            r1 = r19[r1]
            r8 = r1
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r1 = 19
            r1 = r19[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 17
            r1 = r19[r1]
            r10 = r1
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r1 = 18
            r1 = r19[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 4
            r1 = r19[r1]
            r11 = r1
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r1 = 7
            r1 = r19[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r1 = 5
            r1 = r19[r1]
            r13 = r1
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r1 = 6
            r1 = r19[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 8
            r1 = r19[r1]
            r14 = r1
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r1 = 11
            r1 = r19[r1]
            r15 = r1
            android.widget.TextView r15 = (android.widget.TextView) r15
            r1 = 9
            r1 = r19[r1]
            r16 = r1
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            r1 = 10
            r1 = r19[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 3
            r1 = r19[r1]
            r17 = r1
            com.google.android.material.tabs.TabLayout r17 = (com.google.android.material.tabs.TabLayout) r17
            r1 = 1
            r1 = r19[r1]
            r18 = r1
            android.widget.TextView r18 = (android.widget.TextView) r18
            r1 = r20
            r2 = r21
            r3 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = -1
            r3 = r20
            r3.f29309D = r1
            r1 = 0
            r1 = r19[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2 = 0
            r1.setTag(r2)
            r3.l(r0)
            monitor-enter(r20)
            r0 = 1
            r3.f29309D = r0     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lae
            r20.i()
            return
        Lae:
            r0 = move-exception
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lae
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1387m2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29309D = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29309D != 0;
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
