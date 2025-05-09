package t6;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellSupportItemBindingImpl.java */
/* loaded from: classes2.dex */
public final class L1 extends K1 {

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f28102u;

    /* renamed from: v, reason: collision with root package name */
    public long f28103v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public L1(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 4
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r11, r0, r1)
            r2 = 2
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 3
            r2 = r0[r2]
            r7 = r2
            androidx.appcompat.widget.AppCompatImageView r7 = (androidx.appcompat.widget.AppCompatImageView) r7
            r2 = 1
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.f28103v = r2
            android.widget.TextView r10 = r9.f28057n
            r10.setTag(r1)
            androidx.appcompat.widget.AppCompatImageView r10 = r9.f28058o
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.f28102u = r10
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f28059p
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 16
            r9.f28103v = r10     // Catch: java.lang.Throwable -> L48
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            r9.i()
            return
        L48:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.L1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28103v;
            this.f28103v = 0L;
        }
        String str = this.f28061r;
        Integer num = this.f28062s;
        String str2 = this.f28060q;
        View.OnClickListener onClickListener = this.f28063t;
        long j11 = 17 & j10;
        long j12 = 18 & j10;
        long j13 = 20 & j10;
        long j14 = j10 & 24;
        if (j11 != 0) {
            G0.c.a(this.f28057n, str);
        }
        if (j12 != 0) {
            C8.a.a(this.f28058o, num);
        }
        if (j14 != 0) {
            this.f28102u.setOnClickListener(onClickListener);
        }
        if (j13 != 0) {
            G0.c.a(this.f28059p, str2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28103v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (24 == i) {
            this.f28061r = (String) obj;
            synchronized (this) {
                this.f28103v |= 1;
            }
            a();
            i();
        } else if (45 == i) {
            this.f28062s = (Integer) obj;
            synchronized (this) {
                this.f28103v |= 2;
            }
            a();
            i();
        } else if (148 == i) {
            this.f28060q = (String) obj;
            synchronized (this) {
                this.f28103v |= 4;
            }
            a();
            i();
        } else {
            if (118 != i) {
                return false;
            }
            this.f28063t = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28103v |= 8;
            }
            a();
            i();
        }
        return true;
    }
}
