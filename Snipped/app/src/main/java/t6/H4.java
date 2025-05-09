package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentNewCompanySelectCountryBindingImpl.java */
/* loaded from: classes2.dex */
public final class H4 extends G4 {

    /* renamed from: r, reason: collision with root package name */
    public static final SparseIntArray f27947r;

    /* renamed from: q, reason: collision with root package name */
    public long f27948q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27947r = sparseIntArray;
        sparseIntArray.put(R.id.nestedScrollView, 1);
        sparseIntArray.put(R.id.countryInputLayout, 2);
        sparseIntArray.put(R.id.countryInputView, 3);
        sparseIntArray.put(R.id.imageView6, 4);
        sparseIntArray.put(R.id.button_done, 5);
        sparseIntArray.put(R.id.button_done_k, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public H4(F0.c r9, android.view.View r10) {
        /*
            r8 = this;
            android.util.SparseIntArray r0 = t6.H4.f27947r
            r1 = 7
            java.lang.Object[] r0 = F0.f.h(r10, r1, r0)
            r1 = 5
            r1 = r0[r1]
            r4 = r1
            android.widget.Button r4 = (android.widget.Button) r4
            r1 = 6
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 2
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r6 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r6
            r1 = 4
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r1 = r0[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r2 = r8
            r3 = r10
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = -1
            r8.f27948q = r1
            r9 = 0
            r9 = r0[r9]
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 0
            r9.setTag(r0)
            r8.l(r10)
            monitor-enter(r8)
            r9 = 1
            r8.f27948q = r9     // Catch: java.lang.Throwable -> L48
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L48
            r8.i()
            return
        L48:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L48
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.H4.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27948q = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27948q != 0;
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
