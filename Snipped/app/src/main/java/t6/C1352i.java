package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: BottomDialogBindingImpl.java */
/* renamed from: t6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1352i extends AbstractC1344h {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f29078w;

    /* renamed from: v, reason: collision with root package name */
    public long f29079v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29078w = sparseIntArray;
        sparseIntArray.put(R.id.close, 1);
        sparseIntArray.put(R.id.card_img, 2);
        sparseIntArray.put(R.id.success_label, 3);
        sparseIntArray.put(R.id.layoutButton, 4);
        sparseIntArray.put(R.id.button_next, 5);
        sparseIntArray.put(R.id.button_cancel, 6);
        sparseIntArray.put(R.id.button_accept, 7);
        sparseIntArray.put(R.id.description_label, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1352i(F0.c r13, android.view.View r14) {
        /*
            r12 = this;
            android.util.SparseIntArray r0 = t6.C1352i.f29078w
            r1 = 9
            java.lang.Object[] r0 = F0.f.h(r14, r1, r0)
            r1 = 7
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 6
            r1 = r0[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 5
            r1 = r0[r1]
            r7 = r1
            android.widget.Button r7 = (android.widget.Button) r7
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r1 = 1
            r1 = r0[r1]
            r9 = r1
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r1 = 8
            r1 = r0[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 4
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 3
            r1 = r0[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1
            r12.f29079v = r1
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r0 = 0
            r13.setTag(r0)
            r12.l(r14)
            monitor-enter(r12)
            r13 = 1
            r12.f29079v = r13     // Catch: java.lang.Throwable -> L58
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L58
            r12.i()
            return
        L58:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L58
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1352i.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29079v = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29079v != 0;
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
