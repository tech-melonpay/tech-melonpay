package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCardBindingImpl.java */
/* loaded from: classes2.dex */
public final class R2 extends Q2 {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f28408A;

    /* renamed from: z, reason: collision with root package name */
    public long f28409z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28408A = sparseIntArray;
        sparseIntArray.put(R.id.clCard, 1);
        sparseIntArray.put(R.id.ivCard, 2);
        sparseIntArray.put(R.id.textWrapperLayout, 3);
        sparseIntArray.put(R.id.tvTitle, 4);
        sparseIntArray.put(R.id.tvNumber, 5);
        sparseIntArray.put(R.id.tvValidTitle, 6);
        sparseIntArray.put(R.id.tvValidValue, 7);
        sparseIntArray.put(R.id.tvCvvTitle, 8);
        sparseIntArray.put(R.id.tvCvvValue, 9);
        sparseIntArray.put(R.id.guideline4, 10);
        sparseIntArray.put(R.id.ivSecurity, 11);
        sparseIntArray.put(R.id.ivCardClose, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public R2(F0.c r17, android.view.View r18) {
        /*
            r16 = this;
            r15 = r16
            r0 = r18
            android.util.SparseIntArray r1 = t6.R2.f28408A
            r2 = 13
            java.lang.Object[] r1 = F0.f.h(r0, r2, r1)
            r2 = 1
            r2 = r1[r2]
            r4 = r2
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r2 = 10
            r2 = r1[r2]
            androidx.constraintlayout.widget.Guideline r2 = (androidx.constraintlayout.widget.Guideline) r2
            r2 = 2
            r2 = r1[r2]
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r2 = 12
            r2 = r1[r2]
            r6 = r2
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r2 = 11
            r2 = r1[r2]
            r7 = r2
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            r2 = 0
            r2 = r1[r2]
            r8 = r2
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r2 = 3
            r2 = r1[r2]
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2 = 8
            r2 = r1[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = 9
            r2 = r1[r2]
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            r2 = 5
            r2 = r1[r2]
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            r2 = 4
            r2 = r1[r2]
            r12 = r2
            android.widget.TextView r12 = (android.widget.TextView) r12
            r2 = 6
            r2 = r1[r2]
            r13 = r2
            android.widget.TextView r13 = (android.widget.TextView) r13
            r2 = 7
            r1 = r1[r2]
            r14 = r1
            android.widget.TextView r14 = (android.widget.TextView) r14
            r1 = r16
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -1
            r15.f28409z = r1
            androidx.constraintlayout.widget.ConstraintLayout r1 = r15.f28383r
            r2 = 0
            r1.setTag(r2)
            r15.l(r0)
            monitor-enter(r16)
            r0 = 1
            r15.f28409z = r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L7d
            r16.i()
            return
        L7d:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L7d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.R2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28409z = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28409z != 0;
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
