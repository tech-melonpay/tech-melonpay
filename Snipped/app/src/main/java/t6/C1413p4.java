package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentLoginBindingImpl.java */
/* renamed from: t6.p4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1413p4 extends AbstractC1405o4 {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f29455v;

    /* renamed from: u, reason: collision with root package name */
    public long f29456u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29455v = sparseIntArray;
        sparseIntArray.put(R.id.firstnputLayout, 1);
        sparseIntArray.put(R.id.firstInputView, 2);
        sparseIntArray.put(R.id.secondInputLayout, 3);
        sparseIntArray.put(R.id.secondInputView, 4);
        sparseIntArray.put(R.id.imageButton2, 5);
        sparseIntArray.put(R.id.companyInputLayout, 6);
        sparseIntArray.put(R.id.companyInputView, 7);
        sparseIntArray.put(R.id.forgot_password_button, 8);
        sparseIntArray.put(R.id.confirm_button, 9);
        sparseIntArray.put(R.id.confirm_button_k, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1413p4(F0.c r13, android.view.View r14) {
        /*
            r12 = this;
            android.util.SparseIntArray r0 = t6.C1413p4.f29455v
            r1 = 11
            java.lang.Object[] r0 = F0.f.h(r14, r1, r0)
            r1 = 6
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 7
            r1 = r0[r1]
            android.widget.Spinner r1 = (android.widget.Spinner) r1
            r1 = 9
            r1 = r0[r1]
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 10
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r8
            r1 = 8
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 5
            r1 = r0[r1]
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r1 = 3
            r1 = r0[r1]
            r10 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r10 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r10
            r1 = 4
            r1 = r0[r1]
            r11 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r11 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r11
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1
            r12.f29456u = r1
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r0 = 0
            r13.setTag(r0)
            r12.l(r14)
            monitor-enter(r12)
            r13 = 1
            r12.f29456u = r13     // Catch: java.lang.Throwable -> L64
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L64
            r12.i()
            return
        L64:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L64
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1413p4.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29456u = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29456u != 0;
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
