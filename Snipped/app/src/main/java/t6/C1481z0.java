package t6;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellHubCardBindingImpl.java */
/* renamed from: t6.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1481z0 extends AbstractC1474y0 {

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f29878u;

    /* renamed from: v, reason: collision with root package name */
    public long f29879v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1481z0(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 4
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r11, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r6 = r2
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.f29879v = r2
            androidx.constraintlayout.widget.ConstraintLayout r10 = r9.f29833n
            r10.setTag(r1)
            android.widget.ImageView r10 = r9.f29834o
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.f29878u = r10
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f29835p
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 64
            r9.f29879v = r10     // Catch: java.lang.Throwable -> L48
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            r9.i()
            return
        L48:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1481z0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f29879v;
            this.f29879v = 0L;
        }
        View.OnClickListener onClickListener = this.f29838s;
        String str = this.f29836q;
        Boolean bool = this.f29839t;
        Integer num = this.f29837r;
        long j11 = 65 & j10;
        long j12 = 68 & j10;
        long j13 = 72 & j10;
        boolean k3 = j13 != 0 ? F0.f.k(bool) : false;
        long j14 = j10 & 96;
        if (j13 != 0) {
            C8.a.b(this.f29833n, k3);
        }
        if (j14 != 0) {
            C8.a.d(this.f29834o, num);
        }
        if (j11 != 0) {
            this.f29878u.setOnClickListener(onClickListener);
        }
        if (j12 != 0) {
            G0.c.a(this.f29835p, str);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29879v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (106 == i) {
            this.f29838s = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29879v |= 1;
            }
            a();
            i();
        } else if (14 == i) {
        } else if (101 == i) {
            this.f29836q = (String) obj;
            synchronized (this) {
                this.f29879v |= 4;
            }
            a();
            i();
        } else if (139 == i) {
            this.f29839t = (Boolean) obj;
            synchronized (this) {
                this.f29879v |= 8;
            }
            a();
            i();
        } else if (73 == i) {
        } else {
            if (15 != i) {
                return false;
            }
            this.f29837r = (Integer) obj;
            synchronized (this) {
                this.f29879v |= 32;
            }
            a();
            i();
        }
        return true;
    }
}
