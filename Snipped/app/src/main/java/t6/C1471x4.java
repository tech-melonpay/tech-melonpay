package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewCompanyConfirmCompanyAddressBindingImpl.java */
/* renamed from: t6.x4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1471x4 extends AbstractC1464w4 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f29791u;

    /* renamed from: t, reason: collision with root package name */
    public long f29792t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29791u = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.houseInputLayout, 2);
        sparseIntArray.put(R.id.houseInputView, 3);
        sparseIntArray.put(R.id.streetInputLayout, 4);
        sparseIntArray.put(R.id.streetInputView, 5);
        sparseIntArray.put(R.id.cityInputLayout, 6);
        sparseIntArray.put(R.id.cityCodeInputView, 7);
        sparseIntArray.put(R.id.postCodeInputLayout, 8);
        sparseIntArray.put(R.id.postCodeInputView, 9);
        sparseIntArray.put(R.id.button_done, 10);
        sparseIntArray.put(R.id.button_done_k, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1471x4(F0.c r12, android.view.View r13) {
        /*
            r11 = this;
            android.util.SparseIntArray r0 = t6.C1471x4.f29791u
            r1 = 12
            java.lang.Object[] r0 = F0.f.h(r13, r1, r0)
            r1 = 10
            r1 = r0[r1]
            r4 = r1
            android.widget.Button r4 = (android.widget.Button) r4
            r1 = 11
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 7
            r1 = r0[r1]
            r6 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r6 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r6
            r1 = 6
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 2
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r7
            r1 = 1
            r1 = r0[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 8
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 9
            r1 = r0[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r8
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
            r11.f29792t = r1
            r12 = 0
            r12 = r0[r12]
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r0 = 0
            r12.setTag(r0)
            r11.l(r13)
            monitor-enter(r11)
            r12 = 1
            r11.f29792t = r12     // Catch: java.lang.Throwable -> L69
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L69
            r11.i()
            return
        L69:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L69
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1471x4.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29792t = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29792t != 0;
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
