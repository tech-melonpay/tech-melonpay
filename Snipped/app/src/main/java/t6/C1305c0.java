package t6;

import android.view.View;

/* compiled from: CellData1BindingImpl.java */
/* renamed from: t6.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1305c0 extends AbstractC1297b0 {

    /* renamed from: x, reason: collision with root package name */
    public long f28848x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1305c0(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            r0 = 5
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r12, r0, r1)
            r2 = 1
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 4
            r2 = r0[r2]
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r2 = 2
            r2 = r0[r2]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 3
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r3 = r10
            r4 = r12
            r9 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = -1
            r10.f28848x = r2
            android.widget.TextView r11 = r10.f28804n
            r11.setTag(r1)
            android.widget.ImageView r11 = r10.f28805o
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f28806p
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f28807q
            r11.setTag(r1)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 128(0x80, double:6.3E-322)
            r10.f28848x = r11     // Catch: java.lang.Throwable -> L51
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L51
            r10.i()
            return
        L51:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L51
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1305c0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28848x;
            this.f28848x = 0L;
        }
        Boolean bool = this.f28811u;
        String str = this.f28809s;
        String str2 = this.f28810t;
        String str3 = this.f28808r;
        View.OnLongClickListener onLongClickListener = this.f28813w;
        View.OnClickListener onClickListener = this.f28812v;
        long j11 = 129 & j10;
        boolean k3 = j11 != 0 ? F0.f.k(bool) : false;
        long j12 = 132 & j10;
        long j13 = 136 & j10;
        long j14 = 144 & j10;
        long j15 = 160 & j10;
        long j16 = j10 & 192;
        if (j14 != 0) {
            G0.c.a(this.f28804n, str3);
        }
        if (j11 != 0) {
            C8.a.b(this.f28805o, k3);
        }
        if (j16 != 0) {
            this.f28805o.setOnClickListener(onClickListener);
            this.f28806p.setOnClickListener(onClickListener);
        }
        if (j12 != 0) {
            G0.c.a(this.f28806p, str);
        }
        if (j15 != 0) {
            this.f28807q.setOnLongClickListener(onLongClickListener);
        }
        if (j13 != 0) {
            G0.c.a(this.f28807q, str2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28848x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (63 == i) {
            this.f28811u = (Boolean) obj;
            synchronized (this) {
                this.f28848x |= 1;
            }
            a();
            i();
        } else if (56 == i) {
        } else if (84 == i) {
            this.f28809s = (String) obj;
            synchronized (this) {
                this.f28848x |= 4;
            }
            a();
            i();
        } else if (154 == i) {
            this.f28810t = (String) obj;
            synchronized (this) {
                this.f28848x |= 8;
            }
            a();
            i();
        } else if (39 == i) {
            this.f28808r = (String) obj;
            synchronized (this) {
                this.f28848x |= 16;
            }
            a();
            i();
        } else if (104 == i) {
            this.f28813w = (View.OnLongClickListener) obj;
            synchronized (this) {
                this.f28848x |= 32;
            }
            a();
            i();
        } else {
            if (110 != i) {
                return false;
            }
            this.f28812v = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28848x |= 64;
            }
            a();
            i();
        }
        return true;
    }
}
