package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentVerifyAddressBindingImpl.java */
/* loaded from: classes2.dex */
public final class y6 extends x6 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f29875u;

    /* renamed from: t, reason: collision with root package name */
    public long f29876t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29875u = sparseIntArray;
        sparseIntArray.put(R.id.cryptoInputLayout, 1);
        sparseIntArray.put(R.id.cryptoInputView, 2);
        sparseIntArray.put(R.id.imageView6, 3);
        sparseIntArray.put(R.id.networkInputLayout, 4);
        sparseIntArray.put(R.id.networkInputView, 5);
        sparseIntArray.put(R.id.imageView7, 6);
        sparseIntArray.put(R.id.addressInputLayout, 7);
        sparseIntArray.put(R.id.addressInputView, 8);
        sparseIntArray.put(R.id.accountNameInputLayout, 9);
        sparseIntArray.put(R.id.accountNameInputView, 10);
        sparseIntArray.put(R.id.confirm_button, 11);
        sparseIntArray.put(R.id.confirm_button_k, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y6(F0.c r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = t6.y6.f29875u
            r1 = 13
            java.lang.Object[] r0 = F0.f.h(r13, r1, r0)
            r1 = 9
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 10
            r1 = r0[r1]
            r5 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r5 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r5
            r1 = 7
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 8
            r1 = r0[r1]
            r6 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r6 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r6
            r1 = 11
            r1 = r0[r1]
            r7 = r1
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            r1 = 12
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            r1 = 1
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 2
            r1 = r0[r1]
            r9 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r9 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r9
            r1 = 3
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 6
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 4
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 5
            r1 = r0[r1]
            r10 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r10 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r10
            r2 = r11
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = -1
            r11.f29876t = r1
            r12 = 0
            r12 = r0[r12]
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r0 = 0
            r12.setTag(r0)
            r11.l(r13)
            monitor-enter(r11)
            r12 = 1
            r11.f29876t = r12     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L6f
            r11.i()
            return
        L6f:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L6f
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.y6.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29876t = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29876t != 0;
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
