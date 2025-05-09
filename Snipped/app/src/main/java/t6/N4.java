package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewCompanyUploadAdditionalDocumentBindingImpl.java */
/* loaded from: classes2.dex */
public final class N4 extends M4 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f28218u;

    /* renamed from: t, reason: collision with root package name */
    public long f28219t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28218u = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.filenameInputLayout, 2);
        sparseIntArray.put(R.id.filenameInputView, 3);
        sparseIntArray.put(R.id.uploadFileInputLayout, 4);
        sparseIntArray.put(R.id.uploadFileInputView, 5);
        sparseIntArray.put(R.id.imageView6, 6);
        sparseIntArray.put(R.id.additionalInformationInputLayout, 7);
        sparseIntArray.put(R.id.additionalInformationInputView, 8);
        sparseIntArray.put(R.id.expiryDateInputLayout, 9);
        sparseIntArray.put(R.id.expiryDateInputView, 10);
        sparseIntArray.put(R.id.button_done, 11);
        sparseIntArray.put(R.id.button_done_k, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N4(F0.c r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = t6.N4.f28218u
            r1 = 13
            java.lang.Object[] r0 = F0.f.h(r13, r1, r0)
            r1 = 7
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 8
            r1 = r0[r1]
            r6 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r6 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r6
            r1 = 11
            r1 = r0[r1]
            r4 = r1
            android.widget.Button r4 = (android.widget.Button) r4
            r1 = 12
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 9
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 10
            r1 = r0[r1]
            r7 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r7
            r1 = 2
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r8
            r1 = 6
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r1 = r0[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 4
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 5
            r1 = r0[r1]
            r9 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r9 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r9
            r2 = r11
            r3 = r13
            r10 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = -1
            r11.f28219t = r1
            r12 = 0
            r12 = r0[r12]
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r0 = 0
            r12.setTag(r0)
            r11.l(r13)
            monitor-enter(r11)
            r12 = 1
            r11.f28219t = r12     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L6f
            r11.i()
            return
        L6f:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L6f
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.N4.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28219t = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28219t != 0;
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
