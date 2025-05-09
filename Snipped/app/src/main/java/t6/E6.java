package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentWithdrawCryptoBindingImpl.java */
/* loaded from: classes2.dex */
public final class E6 extends D6 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f27825y;

    /* renamed from: x, reason: collision with root package name */
    public long f27826x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27825y = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.tvYouWithdraw, 2);
        sparseIntArray.put(R.id.amountInputLayout, 3);
        sparseIntArray.put(R.id.amountInputView, 4);
        sparseIntArray.put(R.id.balance, 5);
        sparseIntArray.put(R.id.tvToAddress, 6);
        sparseIntArray.put(R.id.viewFlipper, 7);
        sparseIntArray.put(R.id.addAddressInputLayout, 8);
        sparseIntArray.put(R.id.addAddressInputView, 9);
        sparseIntArray.put(R.id.ivAdd, 10);
        sparseIntArray.put(R.id.clWallet, 11);
        sparseIntArray.put(R.id.title, 12);
        sparseIntArray.put(R.id.description, 13);
        sparseIntArray.put(R.id.image, 14);
        sparseIntArray.put(R.id.button_done, 15);
        sparseIntArray.put(R.id.button_done_k, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public E6(F0.c r17, android.view.View r18) {
        /*
            r16 = this;
            r14 = r16
            r0 = r18
            android.util.SparseIntArray r1 = t6.E6.f27825y
            r2 = 17
            java.lang.Object[] r15 = F0.f.h(r0, r2, r1)
            r1 = 8
            r1 = r15[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 9
            r1 = r15[r1]
            r4 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r4 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r4
            r1 = 3
            r1 = r15[r1]
            r5 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r5 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r5
            r1 = 4
            r1 = r15[r1]
            r6 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r6 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r6
            r1 = 5
            r1 = r15[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 15
            r1 = r15[r1]
            r8 = r1
            android.widget.Button r8 = (android.widget.Button) r8
            r1 = 16
            r1 = r15[r1]
            r9 = r1
            android.widget.Button r9 = (android.widget.Button) r9
            r1 = 11
            r1 = r15[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 13
            r1 = r15[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 14
            r1 = r15[r1]
            r11 = r1
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r1 = 10
            r1 = r15[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r1 = r15[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 12
            r1 = r15[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r1 = 6
            r1 = r15[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 2
            r1 = r15[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 7
            r1 = r15[r1]
            r13 = r1
            android.widget.ViewFlipper r13 = (android.widget.ViewFlipper) r13
            r1 = r16
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -1
            r14.f27826x = r1
            r1 = 0
            r1 = r15[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 0
            r1.setTag(r2)
            r14.l(r0)
            monitor-enter(r16)
            r0 = 1
            r14.f27826x = r0     // Catch: java.lang.Throwable -> L92
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L92
            r16.i()
            return
        L92:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L92
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.E6.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27826x = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27826x != 0;
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
