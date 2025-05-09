package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentValidationBindingImpl.java */
/* loaded from: classes2.dex */
public final class u6 extends t6 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f29691z;

    /* renamed from: y, reason: collision with root package name */
    public long f29692y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29691z = sparseIntArray;
        sparseIntArray.put(R.id.countryInputLayout, 1);
        sparseIntArray.put(R.id.countryInputView, 2);
        sparseIntArray.put(R.id.imageView6, 3);
        sparseIntArray.put(R.id.phoneNumberInputLayout, 4);
        sparseIntArray.put(R.id.phoneNumbertInputView, 5);
        sparseIntArray.put(R.id.secondnputLayout, 6);
        sparseIntArray.put(R.id.secondInputView, 7);
        sparseIntArray.put(R.id.send_code, 8);
        sparseIntArray.put(R.id.confirm_button, 9);
        sparseIntArray.put(R.id.confirm_button_k, 10);
        sparseIntArray.put(R.id.tvSkip, 11);
        sparseIntArray.put(R.id.empty_layout, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u6(F0.c r18, android.view.View r19) {
        /*
            r17 = this;
            r15 = r17
            r0 = r19
            android.util.SparseIntArray r1 = t6.u6.f29691z
            r2 = 13
            java.lang.Object[] r16 = F0.f.h(r0, r2, r1)
            r1 = 9
            r1 = r16[r1]
            r4 = r1
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r1 = 10
            r1 = r16[r1]
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 1
            r1 = r16[r1]
            r6 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r6 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r6
            r1 = 2
            r1 = r16[r1]
            r7 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r7
            r1 = 12
            r1 = r16[r1]
            r8 = r1
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r1 = 3
            r1 = r16[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 4
            r1 = r16[r1]
            r9 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r9 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r9
            r1 = 5
            r1 = r16[r1]
            r10 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r10 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r10
            r1 = 7
            r1 = r16[r1]
            r11 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r11 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r11
            r1 = 6
            r1 = r16[r1]
            r12 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r12 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r12
            r1 = 8
            r1 = r16[r1]
            r13 = r1
            com.google.android.material.button.MaterialButton r13 = (com.google.android.material.button.MaterialButton) r13
            r1 = 11
            r1 = r16[r1]
            r14 = r1
            android.widget.TextView r14 = (android.widget.TextView) r14
            r1 = r17
            r2 = r18
            r3 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -1
            r15.f29692y = r1
            r1 = 0
            r1 = r16[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2 = 0
            r1.setTag(r2)
            r15.l(r0)
            monitor-enter(r17)
            r0 = 1
            r15.f29692y = r0     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L7b
            r17.i()
            return
        L7b:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L7b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.u6.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29692y = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29692y != 0;
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
