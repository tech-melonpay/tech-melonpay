package t6;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellCompanyBindingImpl.java */
/* loaded from: classes2.dex */
public final class P extends O {

    /* renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f28310s;

    /* renamed from: t, reason: collision with root package name */
    public long f28311t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public P(F0.c r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 3
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r6, r0, r1)
            r2 = 1
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4.<init>(r5, r6, r2, r3)
            r2 = -1
            r4.f28311t = r2
            android.widget.TextView r5 = r4.f28223n
            r5.setTag(r1)
            r5 = 0
            r5 = r0[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r4.f28310s = r5
            r5.setTag(r1)
            android.widget.TextView r5 = r4.f28224o
            r5.setTag(r1)
            r4.l(r6)
            monitor-enter(r4)
            r5 = 256(0x100, double:1.265E-321)
            r4.f28311t = r5     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            r4.i()
            return
        L38:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.P.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28311t;
            this.f28311t = 0L;
        }
        String str = this.f28226q;
        View.OnClickListener onClickListener = this.f28227r;
        String str2 = this.f28225p;
        long j11 = 258 & j10;
        long j12 = 272 & j10;
        if ((j10 & 320) != 0) {
            G0.c.a(this.f28223n, str2);
        }
        if (j12 != 0) {
            this.f28310s.setOnClickListener(onClickListener);
        }
        if (j11 != 0) {
            G0.c.a(this.f28224o, str);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28311t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (61 == i) {
        } else if (125 == i) {
            this.f28226q = (String) obj;
            synchronized (this) {
                this.f28311t |= 2;
            }
            a();
            i();
        } else if (60 == i) {
        } else if (143 == i) {
        } else if (105 == i) {
            this.f28227r = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28311t |= 16;
            }
            a();
            i();
        } else if (52 == i) {
        } else if (101 == i) {
            this.f28225p = (String) obj;
            synchronized (this) {
                this.f28311t |= 64;
            }
            a();
            i();
        } else {
            if (49 != i) {
                return false;
            }
        }
        return true;
    }
}
