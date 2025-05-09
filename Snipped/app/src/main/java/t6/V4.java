package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewPaymentBankBindingImpl.java */
/* loaded from: classes2.dex */
public final class V4 extends U4 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f28597y;

    /* renamed from: x, reason: collision with root package name */
    public long f28598x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28597y = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.beneficiaryInputLayout, 2);
        sparseIntArray.put(R.id.beneficiaryInputView, 3);
        sparseIntArray.put(R.id.bankInputLayout, 4);
        sparseIntArray.put(R.id.bankInputView, 5);
        sparseIntArray.put(R.id.referenceInputLayout, 6);
        sparseIntArray.put(R.id.referenceInputView, 7);
        sparseIntArray.put(R.id.amountInputLayout, 8);
        sparseIntArray.put(R.id.amountInputView, 9);
        sparseIntArray.put(R.id.text_fee, 10);
        sparseIntArray.put(R.id.button_done, 11);
        sparseIntArray.put(R.id.button_done_k, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V4(F0.c r17, android.view.View r18) {
        /*
            r16 = this;
            r14 = r16
            r0 = r18
            android.util.SparseIntArray r1 = t6.V4.f28597y
            r2 = 13
            java.lang.Object[] r15 = F0.f.h(r0, r2, r1)
            r1 = 8
            r1 = r15[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 9
            r1 = r15[r1]
            r4 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r4 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r4
            r1 = 4
            r1 = r15[r1]
            r5 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r5 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r5
            r1 = 5
            r1 = r15[r1]
            r6 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r6 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r6
            r1 = 2
            r1 = r15[r1]
            r7 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r7
            r1 = 3
            r1 = r15[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r8
            r1 = 11
            r1 = r15[r1]
            r9 = r1
            android.widget.Button r9 = (android.widget.Button) r9
            r1 = 12
            r1 = r15[r1]
            r10 = r1
            android.widget.Button r10 = (android.widget.Button) r10
            r1 = 1
            r1 = r15[r1]
            r11 = r1
            androidx.core.widget.NestedScrollView r11 = (androidx.core.widget.NestedScrollView) r11
            r1 = 6
            r1 = r15[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 7
            r1 = r15[r1]
            r12 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r12 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r12
            r1 = 10
            r1 = r15[r1]
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            r1 = r16
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -1
            r14.f28598x = r1
            r1 = 0
            r1 = r15[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 0
            r1.setTag(r2)
            r14.l(r0)
            monitor-enter(r16)
            r0 = 1
            r14.f28598x = r0     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L7a
            r16.i()
            return
        L7a:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L7a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.V4.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28598x = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28598x != 0;
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
