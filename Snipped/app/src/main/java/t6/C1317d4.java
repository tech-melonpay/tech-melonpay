package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentInvoiceDetailsBindingImpl.java */
/* renamed from: t6.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1317d4 extends AbstractC1309c4 {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f28926A;

    /* renamed from: z, reason: collision with root package name */
    public long f28927z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28926A = sparseIntArray;
        sparseIntArray.put(R.id.header, 1);
        sparseIntArray.put(R.id.icon, 2);
        sparseIntArray.put(R.id.ic_exchange, 3);
        sparseIntArray.put(R.id.icon_small_bg, 4);
        sparseIntArray.put(R.id.icon_small, 5);
        sparseIntArray.put(R.id.amount, 6);
        sparseIntArray.put(R.id.name, 7);
        sparseIntArray.put(R.id.status, 8);
        sparseIntArray.put(R.id.add_invoice, 9);
        sparseIntArray.put(R.id.footer, 10);
        sparseIntArray.put(R.id.clContent, 11);
        sparseIntArray.put(R.id.imageView19, 12);
        sparseIntArray.put(R.id.pdfView, 13);
        sparseIntArray.put(R.id.button_download, 14);
        sparseIntArray.put(R.id.button_delete, 15);
        sparseIntArray.put(R.id.button_edit, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1317d4(F0.c r19, android.view.View r20) {
        /*
            r18 = this;
            r15 = r18
            r0 = r20
            android.util.SparseIntArray r1 = t6.C1317d4.f28926A
            r2 = 17
            java.lang.Object[] r16 = F0.f.h(r0, r2, r1)
            r1 = 9
            r1 = r16[r1]
            r4 = r1
            com.luminary.business.presentation.ui.views.ButtonSmall r4 = (com.luminary.business.presentation.ui.views.ButtonSmall) r4
            r1 = 6
            r1 = r16[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 15
            r1 = r16[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 14
            r1 = r16[r1]
            r7 = r1
            android.widget.Button r7 = (android.widget.Button) r7
            r1 = 16
            r1 = r16[r1]
            r8 = r1
            android.widget.Button r8 = (android.widget.Button) r8
            r1 = 11
            r1 = r16[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 10
            r1 = r16[r1]
            r9 = r1
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r1 = 1
            r1 = r16[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 3
            r1 = r16[r1]
            r10 = r1
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r1 = 2
            r1 = r16[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 5
            r1 = r16[r1]
            r11 = r1
            com.google.android.material.imageview.ShapeableImageView r11 = (com.google.android.material.imageview.ShapeableImageView) r11
            r1 = 4
            r1 = r16[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 12
            r1 = r16[r1]
            r12 = r1
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r1 = 7
            r1 = r16[r1]
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            r1 = 13
            r1 = r16[r1]
            r14 = r1
            com.github.barteksc.pdfviewer.PDFView r14 = (com.github.barteksc.pdfviewer.PDFView) r14
            r1 = 8
            r1 = r16[r1]
            r17 = r1
            android.widget.TextView r17 = (android.widget.TextView) r17
            r1 = r18
            r2 = r19
            r3 = r20
            r15 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = -1
            r3 = r18
            r3.f28927z = r1
            r1 = 0
            r1 = r16[r1]
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r2 = 0
            r1.setTag(r2)
            r3.l(r0)
            monitor-enter(r18)
            r0 = 1
            r3.f28927z = r0     // Catch: java.lang.Throwable -> L99
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L99
            r18.i()
            return
        L99:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> L99
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1317d4.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f28927z = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28927z != 0;
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
