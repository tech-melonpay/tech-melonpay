package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentAddBankBindingImpl.java */
/* loaded from: classes2.dex */
public final class H2 extends G2 {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f27943t;

    /* renamed from: s, reason: collision with root package name */
    public long f27944s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27943t = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.bankNameInputLayout, 2);
        sparseIntArray.put(R.id.bankNameInputView, 3);
        sparseIntArray.put(R.id.countryInputLayout, 4);
        sparseIntArray.put(R.id.countryInputView, 5);
        sparseIntArray.put(R.id.imageView6, 6);
        sparseIntArray.put(R.id.additionalInformationInputLayout, 7);
        sparseIntArray.put(R.id.additionalInformationInputView, 8);
        sparseIntArray.put(R.id.button_done, 9);
        sparseIntArray.put(R.id.button_done_k, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public H2(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.H2.f27943t
            r1 = 11
            java.lang.Object[] r0 = F0.f.h(r12, r1, r0)
            r1 = 7
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 8
            r1 = r0[r1]
            r5 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r5 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r5
            r1 = 2
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r6 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r6
            r1 = 9
            r1 = r0[r1]
            r7 = r1
            android.widget.Button r7 = (android.widget.Button) r7
            r1 = 10
            r1 = r0[r1]
            r8 = r1
            android.widget.Button r8 = (android.widget.Button) r8
            r1 = 4
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 5
            r1 = r0[r1]
            r9 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r9 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r9
            r1 = 6
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r1 = r0[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.f27944s = r1
            r11 = 0
            r11 = r0[r11]
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r0 = 0
            r11.setTag(r0)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 1
            r10.f27944s = r11     // Catch: java.lang.Throwable -> L62
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L62
            r10.i()
            return
        L62:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L62
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.H2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27944s = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27944s != 0;
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
