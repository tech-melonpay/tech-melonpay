package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentResetPasswordBindingImpl.java */
/* loaded from: classes2.dex */
public final class D5 extends C5 {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f27748w;

    /* renamed from: v, reason: collision with root package name */
    public long f27749v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27748w = sparseIntArray;
        sparseIntArray.put(R.id.firstnputLayout, 1);
        sparseIntArray.put(R.id.firstInputView, 2);
        sparseIntArray.put(R.id.secondInputLayout, 3);
        sparseIntArray.put(R.id.secondInputView, 4);
        sparseIntArray.put(R.id.thirdInputLayout, 5);
        sparseIntArray.put(R.id.thirdInputView, 6);
        sparseIntArray.put(R.id.button_done, 7);
        sparseIntArray.put(R.id.button_done_k, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public D5(F0.c r14, android.view.View r15) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = t6.D5.f27748w
            r1 = 9
            java.lang.Object[] r0 = F0.f.h(r15, r1, r0)
            r1 = 7
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 8
            r1 = r0[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r9 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r9
            r1 = 4
            r1 = r0[r1]
            r10 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r10 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r10
            r1 = 5
            r1 = r0[r1]
            r11 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r11 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r11
            r1 = 6
            r1 = r0[r1]
            r12 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r12 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r12
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.f27749v = r1
            r14 = 0
            r14 = r0[r14]
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r0 = 0
            r14.setTag(r0)
            r13.l(r15)
            monitor-enter(r13)
            r14 = 1
            r13.f27749v = r14     // Catch: java.lang.Throwable -> L59
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L59
            r13.i()
            return
        L59:
            r14 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L59
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.D5.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27749v = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27749v != 0;
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
