package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewCompanyInputAddressBindingImpl.java */
/* loaded from: classes2.dex */
public final class B4 extends A4 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f27647z;

    /* renamed from: y, reason: collision with root package name */
    public long f27648y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27647z = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.addressLine1InputLayout, 2);
        sparseIntArray.put(R.id.addressLine1InputView, 3);
        sparseIntArray.put(R.id.addressLine2InputLayout, 4);
        sparseIntArray.put(R.id.addressLine2InputView, 5);
        sparseIntArray.put(R.id.cityInputLayout, 6);
        sparseIntArray.put(R.id.cityInputView, 7);
        sparseIntArray.put(R.id.postalCodeInputLayout, 8);
        sparseIntArray.put(R.id.postalCodeInputView, 9);
        sparseIntArray.put(R.id.countryInputLayout, 10);
        sparseIntArray.put(R.id.countryInputView, 11);
        sparseIntArray.put(R.id.imageView6, 12);
        sparseIntArray.put(R.id.button_done, 13);
        sparseIntArray.put(R.id.button_done_k, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public B4(F0.c r18, android.view.View r19) {
        /*
            r17 = this;
            r15 = r17
            r0 = r19
            android.util.SparseIntArray r1 = t6.B4.f27647z
            r2 = 15
            java.lang.Object[] r16 = F0.f.h(r0, r2, r1)
            r1 = 2
            r1 = r16[r1]
            r4 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r4 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r4
            r1 = 3
            r1 = r16[r1]
            r5 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r5 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r5
            r1 = 4
            r1 = r16[r1]
            r6 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r6 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r6
            r1 = 5
            r1 = r16[r1]
            r7 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r7
            r1 = 13
            r1 = r16[r1]
            r8 = r1
            android.widget.Button r8 = (android.widget.Button) r8
            r1 = 14
            r1 = r16[r1]
            r9 = r1
            android.widget.Button r9 = (android.widget.Button) r9
            r1 = 6
            r1 = r16[r1]
            r10 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r10 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r10
            r1 = 7
            r1 = r16[r1]
            r11 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r11 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r11
            r1 = 10
            r1 = r16[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 11
            r1 = r16[r1]
            r12 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r12 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r12
            r1 = 12
            r1 = r16[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r1 = r16[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 8
            r1 = r16[r1]
            r13 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r13 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r13
            r1 = 9
            r1 = r16[r1]
            r14 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r14 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r14
            r1 = r17
            r2 = r18
            r3 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -1
            r15.f27648y = r1
            r1 = 0
            r1 = r16[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 0
            r1.setTag(r2)
            r15.l(r0)
            monitor-enter(r17)
            r0 = 1
            r15.f27648y = r0     // Catch: java.lang.Throwable -> L87
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L87
            r17.i()
            return
        L87:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L87
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.B4.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27648y = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27648y != 0;
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
