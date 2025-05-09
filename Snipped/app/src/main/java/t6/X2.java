package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCardSecurityVarificationBindingImpl.java */
/* loaded from: classes2.dex */
public final class X2 extends W2 {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f28661v;

    /* renamed from: u, reason: collision with root package name */
    public long f28662u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28661v = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.infoLayout, 2);
        sparseIntArray.put(R.id.phoneCountryInputLayout, 3);
        sparseIntArray.put(R.id.phoneCountryInputView, 4);
        sparseIntArray.put(R.id.ccpView, 5);
        sparseIntArray.put(R.id.imageView6, 6);
        sparseIntArray.put(R.id.phoneInputLayout, 7);
        sparseIntArray.put(R.id.phoneInputView, 8);
        sparseIntArray.put(R.id.passwordInputLayout, 9);
        sparseIntArray.put(R.id.passwordInputView, 10);
        sparseIntArray.put(R.id.buttonDone, 11);
        sparseIntArray.put(R.id.buttonDoneK, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X2(F0.c r13, android.view.View r14) {
        /*
            r12 = this;
            android.util.SparseIntArray r0 = t6.X2.f28661v
            r1 = 13
            java.lang.Object[] r0 = F0.f.h(r14, r1, r0)
            r1 = 11
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 12
            r1 = r0[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 5
            r1 = r0[r1]
            com.hbb20.CountryCodePicker r1 = (com.hbb20.CountryCodePicker) r1
            r1 = 6
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 2
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.InfoView r1 = (com.luminary.business.presentation.ui.views.InfoView) r1
            r1 = 1
            r1 = r0[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 9
            r1 = r0[r1]
            r7 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r7
            r1 = 10
            r1 = r0[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r8
            r1 = 3
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 4
            r1 = r0[r1]
            r9 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r9 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r9
            r1 = 7
            r1 = r0[r1]
            r10 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r10 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r10
            r1 = 8
            r1 = r0[r1]
            r11 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r11 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r11
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1
            r12.f28662u = r1
            r13 = 0
            r13 = r0[r13]
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r0 = 0
            r13.setTag(r0)
            r12.l(r14)
            monitor-enter(r12)
            r13 = 1
            r12.f28662u = r13     // Catch: java.lang.Throwable -> L70
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L70
            r12.i()
            return
        L70:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L70
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.X2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28662u = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28662u != 0;
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
