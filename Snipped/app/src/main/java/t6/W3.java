package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentForgotPasswordBindingImpl.java */
/* loaded from: classes2.dex */
public final class W3 extends V3 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f28628u;

    /* renamed from: t, reason: collision with root package name */
    public long f28629t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28628u = sparseIntArray;
        sparseIntArray.put(R.id.firstnputLayout, 1);
        sparseIntArray.put(R.id.firstInputView, 2);
        sparseIntArray.put(R.id.secondInputLayout, 3);
        sparseIntArray.put(R.id.secondInputView, 4);
        sparseIntArray.put(R.id.button_done, 5);
        sparseIntArray.put(R.id.button_done_k, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public W3(F0.c r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = t6.W3.f28628u
            r1 = 7
            java.lang.Object[] r0 = F0.f.h(r13, r1, r0)
            r1 = 5
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 6
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
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = -1
            r11.f28629t = r1
            r12 = 0
            r12 = r0[r12]
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r0 = 0
            r12.setTag(r0)
            r11.l(r13)
            monitor-enter(r11)
            r12 = 1
            r11.f28629t = r12     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L4b
            r11.i()
            return
        L4b:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L4b
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.W3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28629t = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28629t != 0;
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
