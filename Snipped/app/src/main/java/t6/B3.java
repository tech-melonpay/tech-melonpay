package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCreateNewVirtualCardBindingImpl.java */
/* loaded from: classes2.dex */
public final class B3 extends A3 {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f27645w;

    /* renamed from: v, reason: collision with root package name */
    public long f27646v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27645w = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.vaultTypeInputLayout, 2);
        sparseIntArray.put(R.id.vaultTypeInputView, 3);
        sparseIntArray.put(R.id.img_arrow_from, 4);
        sparseIntArray.put(R.id.infoLayout, 5);
        sparseIntArray.put(R.id.cardImageView, 6);
        sparseIntArray.put(R.id.typeCard, 7);
        sparseIntArray.put(R.id.cardNameInputLayout, 8);
        sparseIntArray.put(R.id.cardNameInputView, 9);
        sparseIntArray.put(R.id.buttonDone, 10);
        sparseIntArray.put(R.id.buttonDoneK, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public B3(F0.c r14, android.view.View r15) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = t6.B3.f27645w
            r1 = 12
            java.lang.Object[] r0 = F0.f.h(r15, r1, r0)
            r1 = 10
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 11
            r1 = r0[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 6
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 8
            r1 = r0[r1]
            r7 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r7 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r7
            r1 = 9
            r1 = r0[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r8
            r1 = 4
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 5
            r1 = r0[r1]
            r9 = r1
            com.luminary.business.presentation.ui.views.InfoView r9 = (com.luminary.business.presentation.ui.views.InfoView) r9
            r1 = 1
            r1 = r0[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r1 = 7
            r1 = r0[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 2
            r1 = r0[r1]
            r11 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r11 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r11
            r1 = 3
            r1 = r0[r1]
            r12 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r12 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r12
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.f27646v = r1
            r14 = 0
            r14 = r0[r14]
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r0 = 0
            r14.setTag(r0)
            r13.l(r15)
            monitor-enter(r13)
            r14 = 1
            r13.f27646v = r14     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L6b
            r13.i()
            return
        L6b:
            r14 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L6b
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.B3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27646v = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27646v != 0;
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
