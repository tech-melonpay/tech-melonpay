package t6;

import android.view.View;

/* compiled from: CellLogoutButtonBindingImpl.java */
/* loaded from: classes2.dex */
public final class W0 extends V0 {

    /* renamed from: p, reason: collision with root package name */
    public long f28609p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public W0(F0.c r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r6, r0, r1)
            r2 = 1
            r2 = r0[r2]
            android.widget.Button r2 = (android.widget.Button) r2
            r4.<init>(r5, r6, r2)
            r2 = -1
            r4.f28609p = r2
            android.widget.Button r5 = r4.f28583n
            java.lang.String r2 = "layout/cell_logout_button_0"
            r5.setTag(r2)
            r5 = 0
            r5 = r0[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r5.setTag(r1)
            r4.l(r6)
            monitor-enter(r4)
            r5 = 2
            r4.f28609p = r5     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            r4.i()
            return
        L2e:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2e
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.W0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28609p;
            this.f28609p = 0L;
        }
        View.OnClickListener onClickListener = this.f28584o;
        if ((j10 & 3) != 0) {
            this.f28583n.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28609p != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (113 != i) {
            return false;
        }
        this.f28584o = (View.OnClickListener) obj;
        synchronized (this) {
            this.f28609p |= 1;
        }
        a();
        i();
        return true;
    }
}
