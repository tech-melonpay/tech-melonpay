package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentDepositCryptoBindingImpl.java */
/* loaded from: classes2.dex */
public final class L3 extends K3 {

    /* renamed from: p, reason: collision with root package name */
    public static final SparseIntArray f28106p;

    /* renamed from: o, reason: collision with root package name */
    public long f28107o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28106p = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.tvDepositFrom, 2);
        sparseIntArray.put(R.id.addAddressInputLayout, 3);
        sparseIntArray.put(R.id.addAddressInputView, 4);
        sparseIntArray.put(R.id.ivAdd, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public L3(F0.c r4, android.view.View r5) {
        /*
            r3 = this;
            android.util.SparseIntArray r0 = t6.L3.f28106p
            r1 = 6
            java.lang.Object[] r0 = F0.f.h(r5, r1, r0)
            r1 = 3
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 4
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r1
            r2 = 5
            r2 = r0[r2]
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2 = 1
            r2 = r0[r2]
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            r2 = 2
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3.<init>(r4, r5, r1)
            r1 = -1
            r3.f28107o = r1
            r4 = 0
            r4 = r0[r4]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0 = 0
            r4.setTag(r0)
            r3.l(r5)
            monitor-enter(r3)
            r4 = 1
            r3.f28107o = r4     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            r3.i()
            return
        L3d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.L3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28107o = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28107o != 0;
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
