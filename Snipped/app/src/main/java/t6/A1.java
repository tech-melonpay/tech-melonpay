package t6;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.Switch;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellSettingsBindingImpl.java */
/* loaded from: classes2.dex */
public final class A1 extends AbstractC1482z1 {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f27597A;

    /* renamed from: B, reason: collision with root package name */
    public final View f27598B;

    /* renamed from: C, reason: collision with root package name */
    public long f27599C;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public A1(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            r0 = 6
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r12, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r6 = r2
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            r2 = 4
            r2 = r0[r2]
            r7 = r2
            android.widget.Switch r7 = (android.widget.Switch) r7
            r2 = 1
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = 2
            r2 = r0[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r3 = r10
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = -1
            r10.f27599C = r2
            androidx.appcompat.widget.AppCompatImageView r11 = r10.f29880n
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r10.f27597A = r11
            r11.setTag(r1)
            r11 = 5
            r11 = r0[r11]
            android.view.View r11 = (android.view.View) r11
            r10.f27598B = r11
            r11.setTag(r1)
            android.widget.Switch r11 = r10.f29881o
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29882p
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29883q
            r11.setTag(r1)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 512(0x200, double:2.53E-321)
            r10.f27599C = r11     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5d
            r10.i()
            return
        L5d:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5d
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.A1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        boolean z10;
        int i;
        boolean z11;
        synchronized (this) {
            j10 = this.f27599C;
            this.f27599C = 0L;
        }
        Boolean bool = this.f29888v;
        Boolean bool2 = this.f29889w;
        String str = this.f29884r;
        String str2 = this.f29886t;
        Boolean bool3 = this.f29890x;
        View.OnClickListener onClickListener = this.f29892z;
        Boolean bool4 = this.f29885s;
        View.OnClickListener onClickListener2 = this.f29891y;
        Boolean bool5 = this.f29887u;
        boolean k3 = (j10 & 513) != 0 ? F0.f.k(bool) : false;
        long j11 = j10 & 514;
        if (j11 != 0) {
            z10 = F0.f.k(bool2);
            if (j11 != 0) {
                j10 |= z10 ? 2048L : 1024L;
            }
            i = F0.f.d(z10 ? R.color.black : R.color.text_disable, this.f29880n);
            z11 = !z10;
        } else {
            z10 = false;
            i = 0;
            z11 = false;
        }
        long j12 = j10 & 516;
        long j13 = j10 & 520;
        long j14 = j10 & 528;
        boolean k10 = j14 != 0 ? F0.f.k(bool3) : false;
        long j15 = j10 & 544;
        long j16 = j10 & 576;
        boolean k11 = j16 != 0 ? F0.f.k(bool4) : false;
        long j17 = j10 & 640;
        long j18 = j10 & 768;
        boolean k12 = j18 != 0 ? F0.f.k(bool5) : false;
        if ((j10 & 514) != 0) {
            if (F0.f.f1141j >= 21) {
                this.f29880n.setImageTintList(ColorStateList.valueOf(i));
            }
            C8.a.b(this.f27598B, z11);
            this.f29881o.setEnabled(z10);
        }
        if ((j10 & 513) != 0) {
            C8.a.b(this.f29880n, k3);
        }
        if (j17 != 0) {
            this.f27597A.setOnClickListener(onClickListener2);
        }
        if (j16 != 0) {
            C8.a.b(this.f27597A, k11);
            C8.a.b(this.f29882p, k11);
            C8.a.b(this.f29883q, k11);
        }
        if (j14 != 0) {
            Switch r02 = this.f29881o;
            if (r02.isChecked() != k10) {
                r02.setChecked(k10);
            }
        }
        if (j15 != 0) {
            this.f29881o.setOnClickListener(onClickListener);
        }
        if (j18 != 0) {
            C8.a.b(this.f29881o, k12);
        }
        if (j12 != 0) {
            G0.c.a(this.f29882p, str);
        }
        if (j13 != 0) {
            G0.c.a(this.f29883q, str2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27599C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (36 == i) {
            this.f29888v = (Boolean) obj;
            synchronized (this) {
                this.f27599C |= 1;
            }
            a();
            i();
        } else if (56 == i) {
            this.f29889w = (Boolean) obj;
            synchronized (this) {
                this.f27599C |= 2;
            }
            a();
            i();
        } else if (101 == i) {
            this.f29884r = (String) obj;
            synchronized (this) {
                this.f27599C |= 4;
            }
            a();
            i();
        } else if (25 == i) {
            this.f29886t = (String) obj;
            synchronized (this) {
                this.f27599C |= 8;
            }
            a();
            i();
        } else if (49 == i) {
            this.f29890x = (Boolean) obj;
            synchronized (this) {
                this.f27599C |= 16;
            }
            a();
            i();
        } else if (119 == i) {
            this.f29892z = (View.OnClickListener) obj;
            synchronized (this) {
                this.f27599C |= 32;
            }
            a();
            i();
        } else if (37 == i) {
            this.f29885s = (Boolean) obj;
            synchronized (this) {
                this.f27599C |= 64;
            }
            a();
            i();
        } else if (105 == i) {
            this.f29891y = (View.OnClickListener) obj;
            synchronized (this) {
                this.f27599C |= 128;
            }
            a();
            i();
        } else {
            if (38 != i) {
                return false;
            }
            this.f29887u = (Boolean) obj;
            synchronized (this) {
                this.f27599C |= 256;
            }
            a();
            i();
        }
        return true;
    }
}
