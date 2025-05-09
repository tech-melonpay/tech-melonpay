package t6;

import android.view.View;

/* compiled from: CellKeyValueBindingImpl.java */
/* loaded from: classes2.dex */
public final class N0 extends M0 {

    /* renamed from: s, reason: collision with root package name */
    public long f28211s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N0(F0.c r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 3
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r6, r0, r1)
            r2 = 2
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 1
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4.<init>(r5, r6, r2, r3)
            r2 = -1
            r4.f28211s = r2
            android.widget.TextView r5 = r4.f28135n
            r5.setTag(r1)
            r5 = 0
            r5 = r0[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r5.setTag(r1)
            android.widget.TextView r5 = r4.f28136o
            r5.setTag(r1)
            r4.l(r6)
            monitor-enter(r4)
            r5 = 8
            r4.f28211s = r5     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            r4.i()
            return
        L36:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.N0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28211s;
            this.f28211s = 0L;
        }
        String str = this.f28138q;
        View.OnClickListener onClickListener = this.f28139r;
        String str2 = this.f28137p;
        long j11 = 9 & j10;
        long j12 = 10 & j10;
        long j13 = j10 & 12;
        if (j12 != 0) {
            this.f28135n.setOnClickListener(onClickListener);
        }
        if (j11 != 0) {
            G0.c.a(this.f28135n, str);
        }
        if (j13 != 0) {
            G0.c.a(this.f28136o, str2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28211s != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (154 == i) {
            this.f28138q = (String) obj;
            synchronized (this) {
                this.f28211s |= 1;
            }
            a();
            i();
        } else if (115 == i) {
            this.f28139r = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28211s |= 2;
            }
            a();
            i();
        } else {
            if (84 != i) {
                return false;
            }
            this.f28137p = (String) obj;
            synchronized (this) {
                this.f28211s |= 4;
            }
            a();
            i();
        }
        return true;
    }
}
