package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCryptoListBindingImpl.java */
/* loaded from: classes2.dex */
public final class J3 extends I3 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f28028z;

    /* renamed from: y, reason: collision with root package name */
    public long f28029y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28028z = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.tab_crypto, 2);
        sparseIntArray.put(R.id.viewFlipper, 3);
        sparseIntArray.put(R.id.epoxyRecyclerView, 4);
        sparseIntArray.put(R.id.cryptoInputLayout, 5);
        sparseIntArray.put(R.id.cryptoInputView, 6);
        sparseIntArray.put(R.id.imageView6, 7);
        sparseIntArray.put(R.id.ivCurrency, 8);
        sparseIntArray.put(R.id.networkInputLayout, 9);
        sparseIntArray.put(R.id.networkInputView, 10);
        sparseIntArray.put(R.id.imageView7, 11);
        sparseIntArray.put(R.id.addressInputLayout, 12);
        sparseIntArray.put(R.id.addressInputView, 13);
        sparseIntArray.put(R.id.empty_layout, 14);
        sparseIntArray.put(R.id.empty_text, 15);
        sparseIntArray.put(R.id.confirm_button, 16);
        sparseIntArray.put(R.id.confirm_button_k, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public J3(F0.c r18, android.view.View r19) {
        /*
            r17 = this;
            r15 = r17
            r0 = r19
            android.util.SparseIntArray r1 = t6.J3.f28028z
            r2 = 18
            java.lang.Object[] r16 = F0.f.h(r0, r2, r1)
            r1 = 12
            r1 = r16[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 13
            r1 = r16[r1]
            r4 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r4 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r4
            r1 = 16
            r1 = r16[r1]
            r5 = r1
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r1 = 17
            r1 = r16[r1]
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            r1 = 5
            r1 = r16[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 6
            r1 = r16[r1]
            r7 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r7
            r1 = 14
            r1 = r16[r1]
            r8 = r1
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r1 = 15
            r1 = r16[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 4
            r1 = r16[r1]
            r10 = r1
            com.airbnb.epoxy.EpoxyRecyclerView r10 = (com.airbnb.epoxy.EpoxyRecyclerView) r10
            r1 = 7
            r1 = r16[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 11
            r1 = r16[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 8
            r1 = r16[r1]
            r11 = r1
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r1 = 1
            r1 = r16[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 9
            r1 = r16[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 10
            r1 = r16[r1]
            r12 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r12 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r12
            r1 = 2
            r1 = r16[r1]
            r13 = r1
            com.google.android.material.tabs.TabLayout r13 = (com.google.android.material.tabs.TabLayout) r13
            r1 = 3
            r1 = r16[r1]
            r14 = r1
            android.widget.ViewFlipper r14 = (android.widget.ViewFlipper) r14
            r1 = r17
            r2 = r18
            r3 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -1
            r15.f28029y = r1
            r1 = 0
            r1 = r16[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 0
            r1.setTag(r2)
            r15.l(r0)
            monitor-enter(r17)
            r0 = 1
            r15.f28029y = r0     // Catch: java.lang.Throwable -> L99
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L99
            r17.i()
            return
        L99:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L99
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.J3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28029y = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28029y != 0;
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
