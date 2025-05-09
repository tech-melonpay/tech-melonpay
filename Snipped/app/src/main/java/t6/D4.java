package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewCompanyPosistionInCompanyBindingImpl.java */
/* loaded from: classes2.dex */
public final class D4 extends C4 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f27746x;

    /* renamed from: w, reason: collision with root package name */
    public long f27747w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27746x = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.myPositionInputLayout, 2);
        sparseIntArray.put(R.id.myPositionInputView, 3);
        sparseIntArray.put(R.id.imageView6, 4);
        sparseIntArray.put(R.id.beneficiaryTypeInputLayout, 5);
        sparseIntArray.put(R.id.beneficiaryTypeInputView, 6);
        sparseIntArray.put(R.id.imageView7, 7);
        sparseIntArray.put(R.id.shareAmountInputLayout, 8);
        sparseIntArray.put(R.id.shareAmountInputView, 9);
        sparseIntArray.put(R.id.percentTextView, 10);
        sparseIntArray.put(R.id.button_done, 11);
        sparseIntArray.put(R.id.button_done_k, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public D4(F0.c r16, android.view.View r17) {
        /*
            r15 = this;
            r13 = r15
            r0 = r17
            android.util.SparseIntArray r1 = t6.D4.f27746x
            r2 = 13
            java.lang.Object[] r14 = F0.f.h(r0, r2, r1)
            r1 = 5
            r1 = r14[r1]
            r4 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r4 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r4
            r1 = 6
            r1 = r14[r1]
            r5 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r5 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r5
            r1 = 11
            r1 = r14[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 12
            r1 = r14[r1]
            r7 = r1
            android.widget.Button r7 = (android.widget.Button) r7
            r1 = 4
            r1 = r14[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 7
            r1 = r14[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 2
            r1 = r14[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r8
            r1 = 3
            r1 = r14[r1]
            r9 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r9 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r9
            r1 = 1
            r1 = r14[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 10
            r1 = r14[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 8
            r1 = r14[r1]
            r11 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r11 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r11
            r1 = 9
            r1 = r14[r1]
            r12 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r12 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r12
            r1 = r15
            r2 = r16
            r3 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.f27747w = r1
            r1 = 0
            r1 = r14[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 0
            r1.setTag(r2)
            r15.l(r0)
            monitor-enter(r15)
            r0 = 1
            r13.f27747w = r0     // Catch: java.lang.Throwable -> L77
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L77
            r15.i()
            return
        L77:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L77
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.D4.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27747w = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27747w != 0;
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
