package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: DialogFilterBindingImpl.java */
/* renamed from: t6.b2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1299b2 extends AbstractC1291a2 {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f28816u;

    /* renamed from: t, reason: collision with root package name */
    public long f28817t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28816u = sparseIntArray;
        sparseIntArray.put(R.id.title_text, 1);
        sparseIntArray.put(R.id.close, 2);
        sparseIntArray.put(R.id.firstnputLayout, 3);
        sparseIntArray.put(R.id.firstInputView, 4);
        sparseIntArray.put(R.id.imageView8, 5);
        sparseIntArray.put(R.id.secondInputLayout, 6);
        sparseIntArray.put(R.id.secondInputView, 7);
        sparseIntArray.put(R.id.imageView1, 8);
        sparseIntArray.put(R.id.button_cancel, 9);
        sparseIntArray.put(R.id.button_accept, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1299b2(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.C1299b2.f28816u
            r1 = 11
            java.lang.Object[] r0 = F0.f.h(r12, r1, r0)
            r1 = 10
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 9
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
            r1 = 8
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 6
            r1 = r0[r1]
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r1 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r1
            r1 = 7
            r1 = r0[r1]
            r9 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText r9 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputEditText) r9
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.f28817t = r1
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r0 = 0
            r11.setTag(r0)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 1
            r10.f28817t = r11     // Catch: java.lang.Throwable -> L62
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L62
            r10.i()
            return
        L62:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L62
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1299b2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28817t = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28817t != 0;
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
