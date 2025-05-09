package t6;

import android.text.SpannedString;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellExchangeMiddleBindingImpl.java */
/* renamed from: t6.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1393n0 extends AbstractC1385m0 {

    /* renamed from: G, reason: collision with root package name */
    public final ConstraintLayout f29331G;

    /* renamed from: H, reason: collision with root package name */
    public final View f29332H;

    /* renamed from: I, reason: collision with root package name */
    public long f29333I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1393n0(F0.c r16, android.view.View r17) {
        /*
            r15 = this;
            r12 = r15
            r0 = r17
            r1 = 10
            r13 = 0
            java.lang.Object[] r14 = F0.f.h(r0, r1, r13)
            r1 = 3
            r1 = r14[r1]
            r4 = r1
            com.google.android.material.imageview.ShapeableImageView r4 = (com.google.android.material.imageview.ShapeableImageView) r4
            r1 = 2
            r1 = r14[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 1
            r1 = r14[r1]
            r6 = r1
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r1 = 4
            r1 = r14[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 5
            r1 = r14[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 6
            r1 = r14[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 7
            r1 = r14[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 9
            r1 = r14[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = r15
            r2 = r16
            r3 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1
            r12.f29333I = r1
            com.google.android.material.imageview.ShapeableImageView r1 = r12.f29275n
            r1.setTag(r13)
            android.widget.ImageView r1 = r12.f29276o
            r1.setTag(r13)
            r1 = 0
            r1 = r14[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r12.f29331G = r1
            r1.setTag(r13)
            r1 = 8
            r1 = r14[r1]
            android.view.View r1 = (android.view.View) r1
            r12.f29332H = r1
            r1.setTag(r13)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r12.f29277p
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f29278q
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f29279r
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f29280s
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f29281t
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f29282u
            r1.setTag(r13)
            r15.l(r0)
            monitor-enter(r15)
            r0 = 65536(0x10000, double:3.2379E-319)
            r12.f29333I = r0     // Catch: java.lang.Throwable -> L92
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L92
            r15.i()
            return
        L92:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L92
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1393n0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        int i;
        float f10;
        synchronized (this) {
            j10 = this.f29333I;
            this.f29333I = 0L;
        }
        String str = this.f29283v;
        SpannedString spannedString = this.f29286y;
        String str2 = this.f29287z;
        Boolean bool = this.f29273E;
        SpannedString spannedString2 = this.f29285x;
        String str3 = this.f29269A;
        Integer num = this.f29271C;
        Boolean bool2 = this.f29284w;
        Integer num2 = this.f29270B;
        View.OnClickListener onClickListener = this.f29274F;
        Integer num3 = this.f29272D;
        long j11 = j10 & 65568;
        boolean z10 = false;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 262144L : 131072L;
            }
            i = k3 ? 23 : 16;
        } else {
            i = 0;
        }
        long j12 = j10 & 66048;
        if (j12 != 0) {
            z10 = F0.f.k(bool2);
            if (j12 != 0) {
                j10 |= z10 ? 1048576L : 524288L;
            }
            f10 = z10 ? 0.3f : 1.0f;
        } else {
            f10 = 0.0f;
        }
        boolean z11 = z10;
        long j13 = j10 & 73728;
        long j14 = j10 & 98304;
        if ((j10 & 69632) != 0) {
            C8.a.d(this.f29275n, num2);
        }
        if ((65792 & j10) != 0) {
            C8.a.d(this.f29276o, num);
        }
        if ((j10 & 66048) != 0) {
            if (F0.f.f1141j >= 11) {
                this.f29276o.setAlpha(f10);
                this.f29332H.setAlpha(f10);
                this.f29277p.setAlpha(f10);
                this.f29279r.setAlpha(f10);
                this.f29280s.setAlpha(f10);
                this.f29281t.setAlpha(f10);
                this.f29282u.setAlpha(f10);
            }
            C8.a.b(this.f29332H, z11);
        }
        if (j14 != 0) {
            C8.a.a(this.f29331G, num3);
        }
        if (j13 != 0) {
            this.f29331G.setOnClickListener(onClickListener);
        }
        if ((j10 & 65568) != 0) {
            C8.a.f(i, this.f29277p);
        }
        if ((65664 & j10) != 0) {
            G0.c.a(this.f29278q, str3);
        }
        if ((65537 & j10) != 0) {
            G0.c.a(this.f29279r, str);
        }
        if ((65552 & j10) != 0) {
            G0.c.a(this.f29280s, str2);
        }
        if ((65540 & j10) != 0) {
            this.f29281t.setText(spannedString);
        }
        if ((j10 & 65600) != 0) {
            this.f29282u.setText(spannedString2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29333I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (100 == i) {
            this.f29283v = (String) obj;
            synchronized (this) {
                this.f29333I |= 1;
            }
            a();
            i();
        } else if (134 == i) {
        } else if (29 == i) {
            this.f29286y = (SpannedString) obj;
            synchronized (this) {
                this.f29333I |= 4;
            }
            a();
            i();
        } else if (101 == i) {
        } else if (24 == i) {
            this.f29287z = (String) obj;
            synchronized (this) {
                this.f29333I |= 16;
            }
            a();
            i();
        } else if (64 == i) {
            this.f29273E = (Boolean) obj;
            synchronized (this) {
                this.f29333I |= 32;
            }
            a();
            i();
        } else if (140 == i) {
            this.f29285x = (SpannedString) obj;
            synchronized (this) {
                this.f29333I |= 64;
            }
            a();
            i();
        } else if (130 == i) {
            this.f29269A = (String) obj;
            synchronized (this) {
                this.f29333I |= 128;
            }
            a();
            i();
        } else if (142 == i) {
            this.f29271C = (Integer) obj;
            synchronized (this) {
                this.f29333I |= 256;
            }
            a();
            i();
        } else if (54 == i) {
            this.f29284w = (Boolean) obj;
            synchronized (this) {
                this.f29333I |= 512;
            }
            a();
            i();
        } else if (46 == i) {
        } else if (132 == i) {
        } else if (22 == i) {
            this.f29270B = (Integer) obj;
            synchronized (this) {
                this.f29333I |= 4096;
            }
            a();
            i();
        } else if (105 == i) {
            this.f29274F = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29333I |= 8192;
            }
            a();
            i();
        } else if (133 == i) {
        } else {
            if (11 != i) {
                return false;
            }
            this.f29272D = (Integer) obj;
            synchronized (this) {
                this.f29333I |= 32768;
            }
            a();
            i();
        }
        return true;
    }
}
