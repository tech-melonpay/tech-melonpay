package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentWelcomeBindingImpl.java */
/* loaded from: classes2.dex */
public final class C6 extends B6 {

    /* renamed from: q, reason: collision with root package name */
    public static final SparseIntArray f27700q;

    /* renamed from: p, reason: collision with root package name */
    public long f27701p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27700q = sparseIntArray;
        sparseIntArray.put(R.id.imageView16, 1);
        sparseIntArray.put(R.id.textView32, 2);
        sparseIntArray.put(R.id.textView33, 3);
        sparseIntArray.put(R.id.button_create, 4);
        sparseIntArray.put(R.id.textView_create, 5);
        sparseIntArray.put(R.id.button_login, 6);
        sparseIntArray.put(R.id.textView_login, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6(F0.c r5, android.view.View r6) {
        /*
            r4 = this;
            android.util.SparseIntArray r0 = t6.C6.f27700q
            r1 = 8
            java.lang.Object[] r0 = F0.f.h(r6, r1, r0)
            r1 = 4
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2 = 6
            r2 = r0[r2]
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r3 = 1
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3 = 2
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 3
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 5
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3 = 7
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4.<init>(r5, r6, r1, r2)
            r1 = -1
            r4.f27701p = r1
            r5 = 0
            r5 = r0[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r0 = 0
            r5.setTag(r0)
            r4.l(r6)
            monitor-enter(r4)
            r5 = 1
            r4.f27701p = r5     // Catch: java.lang.Throwable -> L48
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L48
            r4.i()
            return
        L48:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L48
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C6.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f27701p = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27701p != 0;
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
