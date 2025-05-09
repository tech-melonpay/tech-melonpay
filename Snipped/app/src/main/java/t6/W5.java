package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentSignerInitBindingImpl.java */
/* loaded from: classes2.dex */
public final class W5 extends V5 {

    /* renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f28647s;

    /* renamed from: r, reason: collision with root package name */
    public long f28648r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28647s = sparseIntArray;
        sparseIntArray.put(R.id.firstnputLayout, 1);
        sparseIntArray.put(R.id.firstInputView, 2);
        sparseIntArray.put(R.id.copy_button, 3);
        sparseIntArray.put(R.id.confirm_button, 4);
        sparseIntArray.put(R.id.confirm_button_k, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public W5(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = t6.W5.f28647s
            r1 = 6
            java.lang.Object[] r0 = F0.f.h(r11, r1, r0)
            r1 = 4
            r1 = r0[r1]
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r8
            r1 = 1
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = -1
            r9.f28648r = r1
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r0 = 0
            r10.setTag(r0)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 1
            r9.f28648r = r10     // Catch: java.lang.Throwable -> L44
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L44
            r9.i()
            return
        L44:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L44
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.W5.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28648r = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28648r != 0;
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
