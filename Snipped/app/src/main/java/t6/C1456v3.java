package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentCreateNewAccountBindingImpl.java */
/* renamed from: t6.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1456v3 extends AbstractC1449u3 {

    /* renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f29715s;

    /* renamed from: r, reason: collision with root package name */
    public long f29716r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29715s = sparseIntArray;
        sparseIntArray.put(R.id.epoxyRecyclerView, 1);
        sparseIntArray.put(R.id.nameInputLayout, 2);
        sparseIntArray.put(R.id.nameInputView, 3);
        sparseIntArray.put(R.id.button_done, 4);
        sparseIntArray.put(R.id.button_done_k, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1456v3(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = t6.C1456v3.f29715s
            r1 = 6
            java.lang.Object[] r0 = F0.f.h(r11, r1, r0)
            r1 = 4
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            com.airbnb.epoxy.EpoxyRecyclerView r7 = (com.airbnb.epoxy.EpoxyRecyclerView) r7
            r1 = 2
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r8 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r8
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = -1
            r9.f29716r = r1
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r0 = 0
            r10.setTag(r0)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 1
            r9.f29716r = r10     // Catch: java.lang.Throwable -> L44
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L44
            r9.i()
            return
        L44:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L44
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1456v3.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29716r = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29716r != 0;
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
