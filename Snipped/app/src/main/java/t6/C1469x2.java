package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: Edit2faDialogBindingImpl.java */
/* renamed from: t6.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1469x2 extends AbstractC1462w2 {

    /* renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f29787s;

    /* renamed from: r, reason: collision with root package name */
    public long f29788r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29787s = sparseIntArray;
        sparseIntArray.put(R.id.title_text, 1);
        sparseIntArray.put(R.id.totp_layout, 2);
        sparseIntArray.put(R.id.phone_layout, 3);
        sparseIntArray.put(R.id.textView21, 4);
        sparseIntArray.put(R.id.textView30, 5);
        sparseIntArray.put(R.id.countryInputLayout, 6);
        sparseIntArray.put(R.id.countryInputView, 7);
        sparseIntArray.put(R.id.ccpView, 8);
        sparseIntArray.put(R.id.imageView6, 9);
        sparseIntArray.put(R.id.phoneNumberInputLayout, 10);
        sparseIntArray.put(R.id.phoneNumbertInputView, 11);
        sparseIntArray.put(R.id.codeTextView, 12);
        sparseIntArray.put(R.id.epoxyRecyclerView, 13);
        sparseIntArray.put(R.id.button_next, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1469x2(F0.c r9, android.view.View r10) {
        /*
            r8 = this;
            android.util.SparseIntArray r0 = t6.C1469x2.f29787s
            r1 = 15
            java.lang.Object[] r0 = F0.f.h(r10, r1, r0)
            r1 = 14
            r1 = r0[r1]
            android.widget.Button r1 = (android.widget.Button) r1
            r1 = 8
            r1 = r0[r1]
            com.hbb20.CountryCodePicker r1 = (com.hbb20.CountryCodePicker) r1
            r1 = 12
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.CodeTextView r1 = (com.luminary.business.presentation.ui.views.CodeTextView) r1
            r1 = 6
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 7
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r1
            r1 = 13
            r1 = r0[r1]
            r5 = r1
            com.airbnb.epoxy.EpoxyRecyclerView r5 = (com.airbnb.epoxy.EpoxyRecyclerView) r5
            r1 = 9
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r1 = 10
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 11
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r1
            r1 = 4
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = -1
            r8.f29788r = r1
            r9 = 0
            r9 = r0[r9]
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r0 = 0
            r9.setTag(r0)
            r8.l(r10)
            monitor-enter(r8)
            r9 = 1
            r8.f29788r = r9     // Catch: java.lang.Throwable -> L78
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L78
            r8.i()
            return
        L78:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L78
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1469x2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29788r = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29788r != 0;
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
