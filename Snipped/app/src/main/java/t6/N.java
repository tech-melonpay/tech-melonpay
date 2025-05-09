package t6;

import android.graphics.drawable.Drawable;
import android.text.SpannedString;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellCardtransactionMiddleBindingImpl.java */
/* loaded from: classes2.dex */
public final class N extends M {

    /* renamed from: I, reason: collision with root package name */
    public final ConstraintLayout f28207I;

    /* renamed from: J, reason: collision with root package name */
    public final View f28208J;

    /* renamed from: K, reason: collision with root package name */
    public final ConstraintLayout f28209K;

    /* renamed from: L, reason: collision with root package name */
    public long f28210L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N(F0.c r17, android.view.View r18) {
        /*
            r16 = this;
            r13 = r16
            r0 = r18
            r1 = 12
            r14 = 0
            java.lang.Object[] r15 = F0.f.h(r0, r1, r14)
            r1 = 3
            r1 = r15[r1]
            r4 = r1
            com.google.android.material.imageview.ShapeableImageView r4 = (com.google.android.material.imageview.ShapeableImageView) r4
            r1 = 6
            r1 = r15[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 2
            r1 = r15[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 1
            r1 = r15[r1]
            r7 = r1
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r1 = 4
            r1 = r15[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 7
            r1 = r15[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 8
            r1 = r15[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 9
            r1 = r15[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 11
            r1 = r15[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r1 = r16
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.f28210L = r1
            com.google.android.material.imageview.ShapeableImageView r1 = r13.f28122n
            r1.setTag(r14)
            android.widget.ImageView r1 = r13.f28123o
            r1.setTag(r14)
            android.widget.ImageView r1 = r13.f28124p
            r1.setTag(r14)
            r1 = 0
            r1 = r15[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r13.f28207I = r1
            r1.setTag(r14)
            r1 = 10
            r1 = r15[r1]
            android.view.View r1 = (android.view.View) r1
            r13.f28208J = r1
            r1.setTag(r14)
            r1 = 5
            r1 = r15[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r13.f28209K = r1
            r1.setTag(r14)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r13.f28125q
            r1.setTag(r14)
            android.widget.TextView r1 = r13.f28126r
            r1.setTag(r14)
            android.widget.TextView r1 = r13.f28127s
            r1.setTag(r14)
            android.widget.TextView r1 = r13.f28128t
            r1.setTag(r14)
            android.widget.TextView r1 = r13.f28129u
            r1.setTag(r14)
            android.widget.TextView r1 = r13.f28130v
            r1.setTag(r14)
            r13.l(r0)
            monitor-enter(r16)
            r0 = 65536(0x10000, double:3.2379E-319)
            r13.f28210L = r0     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r16)     // Catch: java.lang.Throwable -> Lab
            r16.i()
            return
        Lab:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> Lab
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.N.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        int i;
        long j11;
        Drawable drawable;
        SpannedString spannedString;
        long j12;
        Drawable j13;
        synchronized (this) {
            j10 = this.f28210L;
            this.f28210L = 0L;
        }
        String str = this.f28131w;
        SpannedString spannedString2 = this.f28114A;
        String str2 = this.f28115B;
        Boolean bool = this.f28120G;
        SpannedString spannedString3 = this.f28134z;
        String str3 = this.f28116C;
        Boolean bool2 = this.f28133y;
        Integer num = this.f28117D;
        Boolean bool3 = this.f28132x;
        Integer num2 = this.f28118E;
        View.OnClickListener onClickListener = this.f28121H;
        Integer num3 = this.f28119F;
        long j14 = j10 & 65568;
        boolean z10 = false;
        if (j14 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j14 != 0) {
                j10 |= k3 ? 262144L : 131072L;
            }
            i = k3 ? 23 : 16;
        } else {
            i = 0;
        }
        long j15 = j10 & 66816;
        float f10 = 0.0f;
        if (j15 != 0) {
            z10 = F0.f.k(bool2);
            if (j15 != 0) {
                j10 = z10 ? j10 | 1048576 : j10 | 524288;
            }
            j11 = 0;
            if ((j10 & 65792) != 0) {
                j10 |= z10 ? 4194304L : 2097152L;
            }
            if ((j10 & 65792) != 0) {
                f10 = z10 ? 0.3f : 1.0f;
            }
        } else {
            j11 = 0;
        }
        boolean z11 = z10;
        float f11 = f10;
        long j16 = j10 & 524288;
        Drawable drawable2 = null;
        if (j16 != j11) {
            boolean k10 = F0.f.k(bool3);
            if (j16 != j11) {
                j10 |= k10 ? 16777216L : 8388608L;
            }
            if (k10) {
                j12 = j10;
                j13 = U4.b.j(this.f28209K.getContext(), R.drawable.transaction_bg_incoming);
            } else {
                j12 = j10;
                j13 = U4.b.j(this.f28209K.getContext(), R.drawable.transaction_bg_out);
            }
            drawable = j13;
            j10 = j12;
        } else {
            drawable = null;
        }
        long j17 = j10 & 66816;
        if (j17 == 0) {
            spannedString = spannedString3;
        } else if (z11) {
            spannedString = spannedString3;
            drawable2 = U4.b.j(this.f28209K.getContext(), R.drawable.transaction_bg_decline);
        } else {
            spannedString = spannedString3;
            drawable2 = drawable;
        }
        Drawable drawable3 = drawable2;
        if ((j10 & 69632) != 0) {
            C8.a.d(this.f28122n, num2);
        }
        if ((66048 & j10) != 0) {
            C8.a.d(this.f28123o, num);
            C8.a.d(this.f28124p, num);
        }
        if ((j10 & 65792) != 0) {
            if (F0.f.f1141j >= 11) {
                this.f28124p.setAlpha(f11);
                this.f28208J.setAlpha(f11);
                this.f28125q.setAlpha(f11);
                this.f28127s.setAlpha(f11);
                this.f28128t.setAlpha(f11);
                this.f28129u.setAlpha(f11);
                this.f28130v.setAlpha(f11);
            }
            C8.a.b(this.f28208J, z11);
        }
        if ((98304 & j10) != 0) {
            C8.a.a(this.f28207I, num3);
        }
        if ((73728 & j10) != 0) {
            this.f28207I.setOnClickListener(onClickListener);
        }
        if (j17 != 0) {
            this.f28209K.setBackground(drawable3);
        }
        if ((j10 & 65568) != 0) {
            C8.a.f(i, this.f28125q);
        }
        if ((65664 & j10) != 0) {
            G0.c.a(this.f28126r, str3);
        }
        if ((65537 & j10) != 0) {
            G0.c.a(this.f28127s, str);
        }
        if ((65552 & j10) != 0) {
            G0.c.a(this.f28128t, str2);
        }
        if ((65540 & j10) != 0) {
            this.f28129u.setText(spannedString2);
        }
        if ((j10 & 65600) != 0) {
            this.f28130v.setText(spannedString);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28210L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (100 == i) {
            this.f28131w = (String) obj;
            synchronized (this) {
                this.f28210L |= 1;
            }
            a();
            i();
        } else if (134 == i) {
        } else if (29 == i) {
            this.f28114A = (SpannedString) obj;
            synchronized (this) {
                this.f28210L |= 4;
            }
            a();
            i();
        } else if (101 == i) {
        } else if (24 == i) {
            this.f28115B = (String) obj;
            synchronized (this) {
                this.f28210L |= 16;
            }
            a();
            i();
        } else if (64 == i) {
            this.f28120G = (Boolean) obj;
            synchronized (this) {
                this.f28210L |= 32;
            }
            a();
            i();
        } else if (140 == i) {
            this.f28134z = (SpannedString) obj;
            synchronized (this) {
                this.f28210L |= 64;
            }
            a();
            i();
        } else if (130 == i) {
            this.f28116C = (String) obj;
            synchronized (this) {
                this.f28210L |= 128;
            }
            a();
            i();
        } else if (54 == i) {
            this.f28133y = (Boolean) obj;
            synchronized (this) {
                this.f28210L |= 256;
            }
            a();
            i();
        } else if (165 == i) {
            this.f28117D = (Integer) obj;
            synchronized (this) {
                this.f28210L |= 512;
            }
            a();
            i();
        } else if (46 == i) {
            this.f28132x = (Boolean) obj;
            synchronized (this) {
                this.f28210L |= 1024;
            }
            a();
            i();
        } else if (132 == i) {
        } else if (22 == i) {
            this.f28118E = (Integer) obj;
            synchronized (this) {
                this.f28210L |= 4096;
            }
            a();
            i();
        } else if (105 == i) {
            this.f28121H = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28210L |= 8192;
            }
            a();
            i();
        } else if (133 == i) {
        } else {
            if (11 != i) {
                return false;
            }
            this.f28119F = (Integer) obj;
            synchronized (this) {
                this.f28210L |= 32768;
            }
            a();
            i();
        }
        return true;
    }
}
