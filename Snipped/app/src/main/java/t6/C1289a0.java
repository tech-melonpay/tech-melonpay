package t6;

import android.view.View;

/* compiled from: CellCryptoWalletBindingImpl.java */
/* renamed from: t6.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1289a0 extends Z {

    /* renamed from: B, reason: collision with root package name */
    public final View f28780B;

    /* renamed from: C, reason: collision with root package name */
    public long f28781C;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1289a0(F0.c r13, android.view.View r14) {
        /*
            r12 = this;
            r0 = 7
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r14, r0, r1)
            r2 = 2
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 5
            r2 = r0[r2]
            r7 = r2
            com.google.android.material.textview.MaterialTextView r7 = (com.google.android.material.textview.MaterialTextView) r7
            r2 = 4
            r2 = r0[r2]
            r8 = r2
            com.google.android.material.imageview.ShapeableImageView r8 = (com.google.android.material.imageview.ShapeableImageView) r8
            r2 = 3
            r2 = r0[r2]
            r9 = r2
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r2 = 1
            r2 = r0[r2]
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            r2 = 0
            r2 = r0[r2]
            r11 = r2
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = -1
            r12.f28781C = r2
            android.widget.TextView r13 = r12.f28714n
            r13.setTag(r1)
            com.google.android.material.textview.MaterialTextView r13 = r12.f28715o
            r13.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r13 = r12.f28716p
            r13.setTag(r1)
            android.widget.ImageView r13 = r12.f28717q
            r13.setTag(r1)
            r13 = 6
            r13 = r0[r13]
            android.view.View r13 = (android.view.View) r13
            r12.f28780B = r13
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28718r
            r13.setTag(r1)
            androidx.constraintlayout.widget.ConstraintLayout r13 = r12.f28719s
            r13.setTag(r1)
            r12.l(r14)
            monitor-enter(r12)
            r13 = 1024(0x400, double:5.06E-321)
            r12.f28781C = r13     // Catch: java.lang.Throwable -> L69
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L69
            r12.i()
            return
        L69:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L69
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1289a0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28781C;
            this.f28781C = 0L;
        }
        Integer num = this.f28724x;
        Integer num2 = this.f28722v;
        String str = this.f28713A;
        String str2 = this.f28720t;
        View.OnClickListener onClickListener = this.f28725y;
        String str3 = this.f28721u;
        Boolean bool = this.f28723w;
        Boolean bool2 = this.f28726z;
        boolean k3 = (j10 & 1280) != 0 ? F0.f.k(bool) : false;
        long j11 = j10 & 1536;
        float f10 = 0.0f;
        if (j11 != 0) {
            boolean k10 = F0.f.k(bool2);
            if (j11 != 0) {
                j10 |= k10 ? 4096L : 2048L;
            }
            if (k10) {
                f10 = 0.5f;
            }
        }
        float f11 = f10;
        if ((j10 & 1152) != 0) {
            G0.c.a(this.f28714n, str3);
        }
        if ((j10 & 1536) != 0) {
            C8.a.j(this.f28715o, bool2);
            C8.a.j(this.f28716p, bool2);
            if (F0.f.f1141j >= 11) {
                this.f28780B.setAlpha(f11);
            }
        }
        if ((1032 & j10) != 0) {
            G0.c.a(this.f28715o, str);
        }
        if ((1025 & j10) != 0) {
            C8.a.d(this.f28717q, num);
        }
        if ((1040 & j10) != 0) {
            G0.c.a(this.f28718r, str2);
        }
        if ((1280 & j10) != 0) {
            this.f28719s.setEnabled(k3);
        }
        if ((1088 & j10) != 0) {
            this.f28719s.setOnClickListener(onClickListener);
        }
        if ((j10 & 1028) != 0) {
            C8.a.a(this.f28719s, num2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28781C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (43 == i) {
            this.f28724x = (Integer) obj;
            synchronized (this) {
                this.f28781C |= 1;
            }
            a();
            i();
        } else if (166 == i) {
        } else if (9 == i) {
            this.f28722v = (Integer) obj;
            synchronized (this) {
                this.f28781C |= 4;
            }
            a();
            i();
        } else if (35 == i) {
            this.f28713A = (String) obj;
            synchronized (this) {
                this.f28781C |= 8;
            }
            a();
            i();
        } else if (148 == i) {
            this.f28720t = (String) obj;
            synchronized (this) {
                this.f28781C |= 16;
            }
            a();
            i();
        } else if (40 == i) {
        } else if (104 == i) {
            this.f28725y = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28781C |= 64;
            }
            a();
            i();
        } else if (25 == i) {
            this.f28721u = (String) obj;
            synchronized (this) {
                this.f28781C |= 128;
            }
            a();
            i();
        } else if (32 == i) {
            this.f28723w = (Boolean) obj;
            synchronized (this) {
                this.f28781C |= 256;
            }
            a();
            i();
        } else {
            if (59 != i) {
                return false;
            }
            this.f28726z = (Boolean) obj;
            synchronized (this) {
                this.f28781C |= 512;
            }
            a();
            i();
        }
        return true;
    }
}
