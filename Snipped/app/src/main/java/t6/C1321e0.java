package t6;

import android.view.View;

/* compiled from: CellData2BindingImpl.java */
/* renamed from: t6.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1321e0 extends AbstractC1313d0 {

    /* renamed from: B, reason: collision with root package name */
    public long f28948B;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1321e0(F0.c r13, android.view.View r14) {
        /*
            r12 = this;
            r0 = 7
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r14, r0, r1)
            r2 = 1
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 4
            r2 = r0[r2]
            r7 = r2
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = 5
            r2 = r0[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = 3
            r2 = r0[r2]
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            r2 = 6
            r2 = r0[r2]
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = -1
            r12.f28948B = r2
            android.widget.TextView r13 = r12.f28904n
            r13.setTag(r1)
            android.widget.ImageView r13 = r12.f28905o
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28906p
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28907q
            r13.setTag(r1)
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28908r
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28909s
            r13.setTag(r1)
            r12.l(r14)
            monitor-enter(r12)
            r13 = 512(0x200, double:2.53E-321)
            r12.f28948B = r13     // Catch: java.lang.Throwable -> L67
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L67
            r12.i()
            return
        L67:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L67
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1321e0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28948B;
            this.f28948B = 0L;
        }
        String str = this.f28911u;
        String str2 = this.f28913w;
        Boolean bool = this.f28915y;
        String str3 = this.f28914x;
        String str4 = this.f28912v;
        String str5 = this.f28910t;
        View.OnLongClickListener onLongClickListener = this.f28903A;
        View.OnClickListener onClickListener = this.f28916z;
        long j11 = 513 & j10;
        long j12 = 514 & j10;
        long j13 = 516 & j10;
        boolean k3 = j13 != 0 ? F0.f.k(bool) : false;
        long j14 = j10 & 528;
        long j15 = j10 & 544;
        long j16 = j10 & 576;
        long j17 = j10 & 640;
        long j18 = j10 & 768;
        if (j16 != 0) {
            G0.c.a(this.f28904n, str5);
        }
        if (j13 != 0) {
            C8.a.b(this.f28905o, k3);
        }
        if (j18 != 0) {
            this.f28905o.setOnClickListener(onClickListener);
            this.f28906p.setOnClickListener(onClickListener);
            this.f28907q.setOnClickListener(onClickListener);
        }
        if (j11 != 0) {
            G0.c.a(this.f28906p, str);
        }
        if (j12 != 0) {
            G0.c.a(this.f28907q, str2);
        }
        if (j17 != 0) {
            this.f28908r.setOnLongClickListener(onLongClickListener);
            this.f28909s.setOnLongClickListener(onLongClickListener);
        }
        if (j15 != 0) {
            G0.c.a(this.f28908r, str4);
        }
        if (j14 != 0) {
            G0.c.a(this.f28909s, str3);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28948B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (85 == i) {
            this.f28911u = (String) obj;
            synchronized (this) {
                this.f28948B |= 1;
            }
            a();
            i();
        } else if (86 == i) {
            this.f28913w = (String) obj;
            synchronized (this) {
                this.f28948B |= 2;
            }
            a();
            i();
        } else if (63 == i) {
            this.f28915y = (Boolean) obj;
            synchronized (this) {
                this.f28948B |= 4;
            }
            a();
            i();
        } else if (56 == i) {
        } else if (156 == i) {
            this.f28914x = (String) obj;
            synchronized (this) {
                this.f28948B |= 16;
            }
            a();
            i();
        } else if (155 == i) {
            this.f28912v = (String) obj;
            synchronized (this) {
                this.f28948B |= 32;
            }
            a();
            i();
        } else if (39 == i) {
            this.f28910t = (String) obj;
            synchronized (this) {
                this.f28948B |= 64;
            }
            a();
            i();
        } else if (104 == i) {
            this.f28903A = (View.OnLongClickListener) obj;
            synchronized (this) {
                this.f28948B |= 128;
            }
            a();
            i();
        } else {
            if (110 != i) {
                return false;
            }
            this.f28916z = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28948B |= 256;
            }
            a();
            i();
        }
        return true;
    }
}
