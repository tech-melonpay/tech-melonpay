package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: FragmentSumsubInreviewBindingImpl.java */
/* renamed from: t6.g6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1343g6 extends AbstractC1335f6 {

    /* renamed from: q, reason: collision with root package name */
    public static final SparseIntArray f29030q;

    /* renamed from: p, reason: collision with root package name */
    public long f29031p;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29030q = sparseIntArray;
        sparseIntArray.put(R.id.button_logout, 1);
        sparseIntArray.put(R.id.textView_create, 2);
        sparseIntArray.put(R.id.textView61, 3);
        sparseIntArray.put(R.id.textView62, 4);
        sparseIntArray.put(R.id.videoView, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1343g6(F0.c r4, android.view.View r5) {
        /*
            r3 = this;
            android.util.SparseIntArray r0 = t6.C1343g6.f29030q
            r1 = 6
            java.lang.Object[] r0 = F0.f.h(r5, r1, r0)
            r1 = 1
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r2 = 3
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 4
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 2
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 5
            r2 = r0[r2]
            android.widget.VideoView r2 = (android.widget.VideoView) r2
            r3.<init>(r4, r5, r1, r2)
            r1 = -1
            r3.f29031p = r1
            r4 = 0
            r4 = r0[r4]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0 = 0
            r4.setTag(r0)
            r3.l(r5)
            monitor-enter(r3)
            r4 = 1
            r3.f29031p = r4     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            r3.i()
            return
        L3d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1343g6.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29031p = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29031p != 0;
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
