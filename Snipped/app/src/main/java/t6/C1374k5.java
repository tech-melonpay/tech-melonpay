package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewPaymentToBankAccountBindingImpl.java */
/* renamed from: t6.k5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1374k5 extends AbstractC1366j5 {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f29195A;

    /* renamed from: z, reason: collision with root package name */
    public long f29196z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29195A = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.tab_home, 2);
        sparseIntArray.put(R.id.fromInputLayout, 3);
        sparseIntArray.put(R.id.fromInputView, 4);
        sparseIntArray.put(R.id.img_arrow_from, 5);
        sparseIntArray.put(R.id.image_from, 6);
        sparseIntArray.put(R.id.amountInputLayout, 7);
        sparseIntArray.put(R.id.amountInputView, 8);
        sparseIntArray.put(R.id.feeInputLayout, 9);
        sparseIntArray.put(R.id.feeInputView, 10);
        sparseIntArray.put(R.id.referenceInputLayout, 11);
        sparseIntArray.put(R.id.referenceInputView, 12);
        sparseIntArray.put(R.id.balance, 13);
        sparseIntArray.put(R.id.cbOwnAccount, 14);
        sparseIntArray.put(R.id.cbOwnAccountsText, 15);
        sparseIntArray.put(R.id.button_done, 16);
        sparseIntArray.put(R.id.button_done_k, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1374k5(F0.c r19, android.view.View r20) {
        /*
            r18 = this;
            r15 = r18
            r0 = r20
            android.util.SparseIntArray r1 = t6.C1374k5.f29195A
            r2 = 18
            java.lang.Object[] r16 = F0.f.h(r0, r2, r1)
            r1 = 7
            r1 = r16[r1]
            r4 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r4 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r4
            r1 = 8
            r1 = r16[r1]
            r5 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r5 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r5
            r1 = 13
            r1 = r16[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 16
            r1 = r16[r1]
            r7 = r1
            android.widget.Button r7 = (android.widget.Button) r7
            r1 = 17
            r1 = r16[r1]
            r8 = r1
            android.widget.Button r8 = (android.widget.Button) r8
            r1 = 14
            r1 = r16[r1]
            r9 = r1
            android.widget.CheckBox r9 = (android.widget.CheckBox) r9
            r1 = 15
            r1 = r16[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 9
            r1 = r16[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 10
            r1 = r16[r1]
            r10 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r10 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r10
            r1 = 3
            r1 = r16[r1]
            r11 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r11 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r11
            r1 = 4
            r1 = r16[r1]
            r12 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r12 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r12
            r1 = 6
            r1 = r16[r1]
            r13 = r1
            com.google.android.material.imageview.ShapeableImageView r13 = (com.google.android.material.imageview.ShapeableImageView) r13
            r1 = 5
            r1 = r16[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r1 = r16[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 11
            r1 = r16[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 12
            r1 = r16[r1]
            r14 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r14 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r14
            r1 = 2
            r1 = r16[r1]
            r17 = r1
            com.google.android.material.tabs.TabLayout r17 = (com.google.android.material.tabs.TabLayout) r17
            r1 = r18
            r2 = r19
            r3 = r20
            r15 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = -1
            r3 = r18
            r3.f29196z = r1
            r1 = 0
            r1 = r16[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 0
            r1.setTag(r2)
            r3.l(r0)
            monitor-enter(r18)
            r0 = 1
            r3.f29196z = r0     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L9f
            r18.i()
            return
        L9f:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L9f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1374k5.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29196z = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29196z != 0;
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
