package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: DialogInputTextBindingImpl.java */
/* renamed from: t6.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1323e2 extends AbstractC1315d2 {

    /* renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f28951t;

    /* renamed from: s, reason: collision with root package name */
    public long f28952s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28951t = sparseIntArray;
        sparseIntArray.put(R.id.title_text, 1);
        sparseIntArray.put(R.id.close, 2);
        sparseIntArray.put(R.id.firstnputLayout, 3);
        sparseIntArray.put(R.id.firstInputView, 4);
        sparseIntArray.put(R.id.button_cancel, 5);
        sparseIntArray.put(R.id.button_accept, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1323e2(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = t6.C1323e2.f28951t
            r1 = 7
            java.lang.Object[] r0 = F0.f.h(r11, r1, r0)
            r1 = 6
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r8
            r1 = 3
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = -1
            r9.f28952s = r1
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r0 = 0
            r10.setTag(r0)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 1
            r9.f28952s = r10     // Catch: java.lang.Throwable -> L49
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L49
            r9.i()
            return
        L49:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L49
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1323e2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28952s = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28952s != 0;
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
