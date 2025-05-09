package t6;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellInvoicesTopBindingImpl.java */
/* loaded from: classes2.dex */
public final class L0 extends K0 {

    /* renamed from: G, reason: collision with root package name */
    public final ConstraintLayout f28099G;

    /* renamed from: H, reason: collision with root package name */
    public final ConstraintLayout f28100H;

    /* renamed from: I, reason: collision with root package name */
    public long f28101I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public L0(F0.c r16, android.view.View r17) {
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
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1 = 1
            r1 = r14[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 4
            r1 = r14[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 5
            r1 = r14[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 6
            r1 = r14[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 7
            r1 = r14[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 8
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
            r12.f28101I = r1
            android.widget.ImageView r1 = r12.f28044n
            r1.setTag(r13)
            android.widget.ImageView r1 = r12.f28045o
            r1.setTag(r13)
            r1 = 0
            r1 = r14[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r12.f28099G = r1
            r1.setTag(r13)
            r1 = 2
            r1 = r14[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r12.f28100H = r1
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f28046p
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f28047q
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f28048r
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f28049s
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f28050t
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f28051u
            r1.setTag(r13)
            r15.l(r0)
            monitor-enter(r15)
            r0 = 32768(0x8000, double:1.61895E-319)
            r12.f28101I = r0     // Catch: java.lang.Throwable -> L92
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L92
            r15.i()
            return
        L92:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L92
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.L0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        boolean z10;
        Drawable drawable;
        synchronized (this) {
            j10 = this.f28101I;
            this.f28101I = 0L;
        }
        String str = this.f28039B;
        String str2 = this.f28052v;
        String str3 = this.f28041D;
        String str4 = this.f28056z;
        String str5 = this.f28040C;
        Boolean bool = this.f28055y;
        Integer num = this.f28042E;
        Boolean bool2 = this.f28053w;
        Boolean bool3 = this.f28054x;
        String str6 = this.f28038A;
        View.OnClickListener onClickListener = this.f28043F;
        long j11 = j10 & 34048;
        if (j11 != 0) {
            z10 = F0.f.k(bool);
            if (j11 != 0) {
                j10 = z10 ? j10 | 524288 : j10 | 262144;
            }
        } else {
            z10 = false;
        }
        boolean k3 = (j10 & 34816) != 0 ? F0.f.k(bool3) : false;
        long j12 = j10 & 262144;
        Drawable drawable2 = null;
        if (j12 != 0) {
            boolean k10 = F0.f.k(bool2);
            if (j12 != 0) {
                j10 |= k10 ? 131072L : 65536L;
            }
            drawable = k10 ? U4.b.j(this.f28100H.getContext(), R.drawable.transaction_bg_incoming) : U4.b.j(this.f28100H.getContext(), R.drawable.transaction_bg_out);
        } else {
            drawable = null;
        }
        long j13 = j10 & 34048;
        if (j13 != 0) {
            if (z10) {
                drawable = U4.b.j(this.f28100H.getContext(), R.drawable.transaction_bg_decline);
            }
            drawable2 = drawable;
        }
        Drawable drawable3 = drawable2;
        if ((j10 & 33280) != 0) {
            C8.a.d(this.f28044n, num);
            C8.a.d(this.f28045o, num);
        }
        if ((40960 & j10) != 0) {
            this.f28099G.setOnClickListener(onClickListener);
        }
        if (j13 != 0) {
            this.f28100H.setBackground(drawable3);
        }
        if ((32770 & j10) != 0) {
            G0.c.a(this.f28046p, str2);
        }
        if ((32784 & j10) != 0) {
            G0.c.a(this.f28047q, str3);
        }
        if ((32800 & j10) != 0) {
            G0.c.a(this.f28048r, str4);
        }
        if ((36864 & j10) != 0) {
            G0.c.a(this.f28049s, str6);
        }
        if ((32896 & j10) != 0) {
            G0.c.a(this.f28050t, str5);
        }
        if ((j10 & 34816) != 0) {
            C8.a.b(this.f28050t, k3);
            C8.a.b(this.f28051u, k3);
        }
        if ((j10 & 32769) != 0) {
            G0.c.a(this.f28051u, str);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28101I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (6 == i) {
            this.f28039B = (String) obj;
            synchronized (this) {
                this.f28101I |= 1;
            }
            a();
            i();
        } else if (100 == i) {
            this.f28052v = (String) obj;
            synchronized (this) {
                this.f28101I |= 2;
            }
            a();
            i();
        } else if (134 == i) {
        } else if (101 == i) {
        } else if (24 == i) {
            this.f28041D = (String) obj;
            synchronized (this) {
                this.f28101I |= 16;
            }
            a();
            i();
        } else if (3 == i) {
            this.f28056z = (String) obj;
            synchronized (this) {
                this.f28101I |= 32;
            }
            a();
            i();
        } else if (130 == i) {
        } else if (5 == i) {
            this.f28040C = (String) obj;
            synchronized (this) {
                this.f28101I |= 128;
            }
            a();
            i();
        } else if (54 == i) {
            this.f28055y = (Boolean) obj;
            synchronized (this) {
                this.f28101I |= 256;
            }
            a();
            i();
        } else if (165 == i) {
            this.f28042E = (Integer) obj;
            synchronized (this) {
                this.f28101I |= 512;
            }
            a();
            i();
        } else if (46 == i) {
            this.f28053w = (Boolean) obj;
            synchronized (this) {
                this.f28101I |= 1024;
            }
            a();
            i();
        } else if (132 == i) {
            this.f28054x = (Boolean) obj;
            synchronized (this) {
                this.f28101I |= 2048;
            }
            a();
            i();
        } else if (4 == i) {
            this.f28038A = (String) obj;
            synchronized (this) {
                this.f28101I |= 4096;
            }
            a();
            i();
        } else if (105 == i) {
            this.f28043F = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28101I |= 8192;
            }
            a();
            i();
        } else {
            if (133 != i) {
                return false;
            }
        }
        return true;
    }
}
