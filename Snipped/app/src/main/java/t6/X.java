package t6;

import android.util.SparseIntArray;
import android.view.View;
import com.luminary.mobile.R;

/* compiled from: CellCreateCompanyBindingImpl.java */
/* loaded from: classes2.dex */
public final class X extends W {

    /* renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f28649u;

    /* renamed from: t, reason: collision with root package name */
    public long f28650t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28649u = sparseIntArray;
        sparseIntArray.put(R.id.imagePlus, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X(F0.c r9, android.view.View r10) {
        /*
            r8 = this;
            android.util.SparseIntArray r0 = t6.X.f28649u
            r1 = 5
            java.lang.Object[] r0 = F0.f.h(r10, r1, r0)
            r1 = 4
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 1
            r1 = r0[r1]
            r5 = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r5 = (com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout) r5
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            com.google.android.material.textfield.TextInputEditText r6 = (com.google.android.material.textfield.TextInputEditText) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1 = -1
            r8.f28650t = r1
            com.luminary.business.presentation.ui.views.customtextinput.CustomTextInputLayout r9 = r8.f28603n
            r1 = 0
            r9.setTag(r1)
            com.google.android.material.textfield.TextInputEditText r9 = r8.f28604o
            r9.setTag(r1)
            r9 = 0
            r9 = r0[r9]
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r9.setTag(r1)
            androidx.constraintlayout.widget.ConstraintLayout r9 = r8.f28605p
            r9.setTag(r1)
            r8.l(r10)
            monitor-enter(r8)
            r9 = 8
            r8.f28650t = r9     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4d
            r8.i()
            return
        L4d:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4d
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.X.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28650t;
            this.f28650t = 0L;
        }
        String str = this.f28607r;
        View.OnClickListener onClickListener = this.f28608s;
        String str2 = this.f28606q;
        long j11 = 9 & j10;
        long j12 = 10 & j10;
        if ((j10 & 12) != 0) {
            this.f28603n.setHint(str2);
        }
        if (j11 != 0) {
            G0.c.a(this.f28604o, str);
        }
        if (j12 != 0) {
            this.f28605p.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28650t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (154 == i) {
            this.f28607r = (String) obj;
            synchronized (this) {
                this.f28650t |= 1;
            }
            a();
            i();
        } else if (115 == i) {
            this.f28608s = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28650t |= 2;
            }
            a();
            i();
        } else {
            if (42 != i) {
                return false;
            }
            this.f28606q = (String) obj;
            synchronized (this) {
                this.f28650t |= 4;
            }
            a();
            i();
        }
        return true;
    }
}
