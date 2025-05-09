package t6;

import android.view.View;

/* compiled from: CellHeaderBindingImpl.java */
/* renamed from: t6.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1432s0 extends AbstractC1424r0 {

    /* renamed from: t, reason: collision with root package name */
    public long f29560t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1432s0(F0.c r5, android.view.View r6) {
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
            r4.f29560t = r2
            android.widget.TextView r5 = r4.f29521n
            r5.setTag(r1)
            r5 = 0
            r5 = r0[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r5.setTag(r1)
            android.widget.TextView r5 = r4.f29522o
            r5.setTag(r1)
            r4.l(r6)
            monitor-enter(r4)
            r5 = 32
            r4.f29560t = r5     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            r4.i()
            return
        L36:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1432s0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f29560t;
            this.f29560t = 0L;
        }
        String str = this.f29523p;
        View.OnClickListener onClickListener = this.f29526s;
        Boolean bool = this.f29524q;
        String str2 = this.f29525r;
        long j11 = 33 & j10;
        long j12 = 34 & j10;
        long j13 = 36 & j10;
        boolean k3 = j13 != 0 ? F0.f.k(bool) : false;
        long j14 = j10 & 48;
        if (j12 != 0) {
            this.f29521n.setOnClickListener(onClickListener);
        }
        if (j14 != 0) {
            G0.c.a(this.f29521n, str2);
        }
        if (j13 != 0) {
            C8.a.b(this.f29521n, k3);
        }
        if (j11 != 0) {
            G0.c.a(this.f29522o, str);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29560t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (94 == i) {
            this.f29523p = (String) obj;
            synchronized (this) {
                this.f29560t |= 1;
            }
            a();
            i();
        } else if (115 == i) {
            this.f29526s = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29560t |= 2;
            }
            a();
            i();
        } else if (69 == i) {
            this.f29524q = (Boolean) obj;
            synchronized (this) {
                this.f29560t |= 4;
            }
            a();
            i();
        } else if (49 == i) {
        } else {
            if (129 != i) {
                return false;
            }
            this.f29525r = (String) obj;
            synchronized (this) {
                this.f29560t |= 16;
            }
            a();
            i();
        }
        return true;
    }
}
