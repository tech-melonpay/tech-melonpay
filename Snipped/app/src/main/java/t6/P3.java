package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentEditAccountBindingImpl.java */
/* loaded from: classes2.dex */
public final class P3 extends O3 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f28319z;

    /* renamed from: y, reason: collision with root package name */
    public long f28320y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28319z = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.constraintLayout5, 2);
        sparseIntArray.put(R.id.amount, 3);
        sparseIntArray.put(R.id.name, 4);
        sparseIntArray.put(R.id.icon, 5);
        sparseIntArray.put(R.id.key1, 6);
        sparseIntArray.put(R.id.value1, 7);
        sparseIntArray.put(R.id.key2, 8);
        sparseIntArray.put(R.id.value2, 9);
        sparseIntArray.put(R.id.nameInputLayout, 10);
        sparseIntArray.put(R.id.nameInputView, 11);
        sparseIntArray.put(R.id.errorText, 12);
        sparseIntArray.put(R.id.button_done, 13);
        sparseIntArray.put(R.id.button_done_k, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public P3(F0.c r18, android.view.View r19) {
        /*
            r17 = this;
            r15 = r17
            r0 = r19
            android.util.SparseIntArray r1 = t6.P3.f28319z
            r2 = 15
            java.lang.Object[] r16 = F0.f.h(r0, r2, r1)
            r1 = 3
            r1 = r16[r1]
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1 = 13
            r1 = r16[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 14
            r1 = r16[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 2
            r1 = r16[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 12
            r1 = r16[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 5
            r1 = r16[r1]
            r7 = r1
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            r1 = 6
            r1 = r16[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 8
            r1 = r16[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 4
            r1 = r16[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 10
            r1 = r16[r1]
            r11 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r11 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r11
            r1 = 11
            r1 = r16[r1]
            r12 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r12 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r12
            r1 = 1
            r1 = r16[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 7
            r1 = r16[r1]
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            r1 = 9
            r1 = r16[r1]
            r14 = r1
            android.widget.TextView r14 = (android.widget.TextView) r14
            r1 = r17
            r2 = r18
            r3 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -1
            r15.f28320y = r1
            r1 = 0
            r1 = r16[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2 = 0
            r1.setTag(r2)
            r15.l(r0)
            monitor-enter(r17)
            r0 = 1
            r15.f28320y = r0     // Catch: java.lang.Throwable -> L87
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L87
            r17.i()
            return
        L87:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L87
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.P3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28320y = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28320y != 0;
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
