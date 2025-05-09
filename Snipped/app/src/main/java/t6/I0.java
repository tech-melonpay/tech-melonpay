package t6;

import android.graphics.drawable.Drawable;
import android.text.SpannedString;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellInvoicesMiddleBindingImpl.java */
/* loaded from: classes2.dex */
public final class I0 extends H0 {

    /* renamed from: E, reason: collision with root package name */
    public final ConstraintLayout f27955E;

    /* renamed from: F, reason: collision with root package name */
    public final ConstraintLayout f27956F;

    /* renamed from: G, reason: collision with root package name */
    public long f27957G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public I0(F0.c r13, android.view.View r14) {
        /*
            r12 = this;
            r0 = 8
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r14, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r6 = r2
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r2 = 4
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = 5
            r2 = r0[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = 6
            r2 = r0[r2]
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            r2 = 7
            r2 = r0[r2]
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = -1
            r12.f27957G = r2
            android.widget.ImageView r13 = r12.f27928n
            r13.setTag(r1)
            android.widget.ImageView r13 = r12.f27929o
            r13.setTag(r1)
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r12.f27955E = r13
            r13.setTag(r1)
            r13 = 2
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r12.f27956F = r13
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f27930p
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f27931q
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f27932r
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f27933s
            r13.setTag(r1)
            r12.l(r14)
            monitor-enter(r12)
            r13 = 32768(0x8000, double:1.61895E-319)
            r12.f27957G = r13     // Catch: java.lang.Throwable -> L75
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L75
            r12.i()
            return
        L75:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L75
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.I0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        int i;
        boolean z10;
        Drawable drawable;
        synchronized (this) {
            j10 = this.f27957G;
            this.f27957G = 0L;
        }
        String str = this.f27934t;
        SpannedString spannedString = this.f27939y;
        String str2 = this.f27940z;
        Boolean bool = this.f27925B;
        SpannedString spannedString2 = this.f27938x;
        Boolean bool2 = this.f27937w;
        Integer num = this.f27926C;
        Boolean bool3 = this.f27935u;
        Boolean bool4 = this.f27936v;
        View.OnClickListener onClickListener = this.f27927D;
        Integer num2 = this.f27924A;
        long j11 = j10 & 32800;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 524288L : 262144L;
            }
            i = k3 ? 23 : 16;
        } else {
            i = 0;
        }
        long j12 = j10 & 34048;
        if (j12 != 0) {
            z10 = F0.f.k(bool2);
            if (j12 != 0) {
                j10 = z10 ? j10 | 2097152 : j10 | 1048576;
            }
        } else {
            z10 = false;
        }
        boolean k10 = (j10 & 34816) != 0 ? F0.f.k(bool4) : false;
        long j13 = j10 & 1048576;
        Drawable drawable2 = null;
        if (j13 != 0) {
            boolean k11 = F0.f.k(bool3);
            if (j13 != 0) {
                j10 |= k11 ? 131072L : 65536L;
            }
            drawable = k11 ? U4.b.j(this.f27956F.getContext(), R.drawable.transaction_bg_incoming) : U4.b.j(this.f27956F.getContext(), R.drawable.transaction_bg_out);
        } else {
            drawable = null;
        }
        long j14 = j10 & 34048;
        if (j14 != 0) {
            if (z10) {
                drawable = U4.b.j(this.f27956F.getContext(), R.drawable.transaction_bg_decline);
            }
            drawable2 = drawable;
        }
        Drawable drawable3 = drawable2;
        if ((j10 & 33280) != 0) {
            C8.a.d(this.f27928n, num);
            C8.a.d(this.f27929o, num);
        }
        if ((j10 & 32800) != 0) {
            C8.a.f(i, this.f27929o);
        }
        if ((49152 & j10) != 0) {
            C8.a.a(this.f27955E, num2);
        }
        if ((36864 & j10) != 0) {
            this.f27955E.setOnClickListener(onClickListener);
        }
        if (j14 != 0) {
            this.f27956F.setBackground(drawable3);
        }
        if ((32769 & j10) != 0) {
            G0.c.a(this.f27930p, str);
        }
        if ((32784 & j10) != 0) {
            G0.c.a(this.f27931q, str2);
        }
        if ((32772 & j10) != 0) {
            G0.c.a(this.f27932r, spannedString);
        }
        if ((32832 & j10) != 0) {
            G0.c.a(this.f27933s, spannedString2);
        }
        if ((j10 & 34816) != 0) {
            C8.a.b(this.f27933s, k10);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27957G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (100 == i) {
            this.f27934t = (String) obj;
            synchronized (this) {
                this.f27957G |= 1;
            }
            a();
            i();
        } else if (134 == i) {
        } else if (29 == i) {
            this.f27939y = (SpannedString) obj;
            synchronized (this) {
                this.f27957G |= 4;
            }
            a();
            i();
        } else if (101 == i) {
        } else if (24 == i) {
            this.f27940z = (String) obj;
            synchronized (this) {
                this.f27957G |= 16;
            }
            a();
            i();
        } else if (64 == i) {
            this.f27925B = (Boolean) obj;
            synchronized (this) {
                this.f27957G |= 32;
            }
            a();
            i();
        } else if (140 == i) {
            this.f27938x = (SpannedString) obj;
            synchronized (this) {
                this.f27957G |= 64;
            }
            a();
            i();
        } else if (130 == i) {
        } else if (54 == i) {
            this.f27937w = (Boolean) obj;
            synchronized (this) {
                this.f27957G |= 256;
            }
            a();
            i();
        } else if (165 == i) {
            this.f27926C = (Integer) obj;
            synchronized (this) {
                this.f27957G |= 512;
            }
            a();
            i();
        } else if (46 == i) {
            this.f27935u = (Boolean) obj;
            synchronized (this) {
                this.f27957G |= 1024;
            }
            a();
            i();
        } else if (132 == i) {
            this.f27936v = (Boolean) obj;
            synchronized (this) {
                this.f27957G |= 2048;
            }
            a();
            i();
        } else if (105 == i) {
            this.f27927D = (View.OnClickListener) obj;
            synchronized (this) {
                this.f27957G |= 4096;
            }
            a();
            i();
        } else if (133 == i) {
        } else {
            if (11 != i) {
                return false;
            }
            this.f27924A = (Integer) obj;
            synchronized (this) {
                this.f27957G |= 16384;
            }
            a();
            i();
        }
        return true;
    }
}
