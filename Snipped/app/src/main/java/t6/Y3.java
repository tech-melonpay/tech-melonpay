package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentForgotPasswordEmailCodeBindingImpl.java */
/* loaded from: classes2.dex */
public final class Y3 extends X3 {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f28707t;

    /* renamed from: s, reason: collision with root package name */
    public long f28708s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28707t = sparseIntArray;
        sparseIntArray.put(R.id.firstnputLayout, 1);
        sparseIntArray.put(R.id.firstInputView, 2);
        sparseIntArray.put(R.id.secondnputLayout, 3);
        sparseIntArray.put(R.id.secondInputView, 4);
        sparseIntArray.put(R.id.send_code, 5);
        sparseIntArray.put(R.id.confirm_button, 6);
        sparseIntArray.put(R.id.confirm_button_k, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Y3(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.Y3.f28707t
            r1 = 8
            java.lang.Object[] r0 = F0.f.h(r12, r1, r0)
            r1 = 6
            r1 = r0[r1]
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 7
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r7
            r1 = 1
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r8
            r1 = 3
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 5
            r1 = r0[r1]
            r9 = r1
            com.google.android.material.button.MaterialButton r9 = (com.google.android.material.button.MaterialButton) r9
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.f28708s = r1
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r0 = 0
            r11.setTag(r0)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 1
            r10.f28708s = r11     // Catch: java.lang.Throwable -> L50
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L50
            r10.i()
            return
        L50:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L50
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.Y3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28708s = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28708s != 0;
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
