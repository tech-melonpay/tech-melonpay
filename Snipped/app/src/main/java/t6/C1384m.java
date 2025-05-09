package t6;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellAccountBindingImpl.java */
/* renamed from: t6.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1384m extends AbstractC1376l {

    /* renamed from: J, reason: collision with root package name */
    public final ConstraintLayout f29267J;

    /* renamed from: K, reason: collision with root package name */
    public long f29268K;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1384m(F0.c r19, android.view.View r20) {
        /*
            r18 = this;
            r15 = r18
            r0 = r20
            r1 = 12
            r14 = 0
            java.lang.Object[] r16 = F0.f.h(r0, r1, r14)
            r1 = 2
            r1 = r16[r1]
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1 = 1
            r1 = r16[r1]
            r5 = r1
            com.google.android.material.imageview.ShapeableImageView r5 = (com.google.android.material.imageview.ShapeableImageView) r5
            r1 = 3
            r1 = r16[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 5
            r1 = r16[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 7
            r1 = r16[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 9
            r1 = r16[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 4
            r1 = r16[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 6
            r1 = r16[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 8
            r1 = r16[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r1 = 11
            r1 = r16[r1]
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            r1 = 10
            r1 = r16[r1]
            r17 = r1
            android.view.View r17 = (android.view.View) r17
            r1 = r18
            r2 = r19
            r3 = r20
            r0 = r14
            r14 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -1
            r15.f29268K = r1
            android.widget.TextView r1 = r15.f29208n
            r1.setTag(r0)
            com.google.android.material.imageview.ShapeableImageView r1 = r15.f29209o
            r1.setTag(r0)
            android.widget.TextView r1 = r15.f29210p
            r1.setTag(r0)
            android.widget.TextView r1 = r15.f29211q
            r1.setTag(r0)
            android.widget.TextView r1 = r15.f29212r
            r1.setTag(r0)
            android.widget.TextView r1 = r15.f29213s
            r1.setTag(r0)
            r1 = 0
            r1 = r16[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r15.f29267J = r1
            r1.setTag(r0)
            android.widget.TextView r1 = r15.f29214t
            r1.setTag(r0)
            android.widget.TextView r1 = r15.f29215u
            r1.setTag(r0)
            android.widget.TextView r1 = r15.f29216v
            r1.setTag(r0)
            android.widget.TextView r1 = r15.f29217w
            r1.setTag(r0)
            android.view.View r1 = r15.f29218x
            r1.setTag(r0)
            r0 = r20
            r15.l(r0)
            monitor-enter(r18)
            r0 = 4096(0x1000, double:2.0237E-320)
            r15.f29268K = r0     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r18)     // Catch: java.lang.Throwable -> Lb2
            r18.i()
            return
        Lb2:
            r0 = move-exception
            monitor-exit(r18)     // Catch: java.lang.Throwable -> Lb2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1384m.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        boolean z10;
        Drawable drawable;
        String str;
        synchronized (this) {
            j10 = this.f29268K;
            this.f29268K = 0L;
        }
        Integer num = this.f29206H;
        String str2 = this.f29204F;
        String str3 = this.f29203E;
        String str4 = this.f29219y;
        String str5 = this.f29199A;
        Boolean bool = this.f29207I;
        String str6 = this.f29202D;
        String str7 = this.f29205G;
        String str8 = this.f29200B;
        View.OnClickListener onClickListener = this.f29201C;
        String str9 = this.f29220z;
        long j11 = j10 & 4160;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 16384L : 8192L;
            }
            drawable = U4.b.j(this.f29267J.getContext(), k3 ? R.drawable.cell_bg_interactive : R.drawable.cell_bg_full_inactive_16);
            z10 = !k3;
        } else {
            z10 = false;
            drawable = null;
        }
        long j12 = j10 & 4224;
        long j13 = j10 & 4352;
        long j14 = j10 & 4608;
        long j15 = j10 & 5120;
        long j16 = j10 & 6144;
        if ((j10 & 4112) != 0) {
            str = str3;
            G0.c.a(this.f29208n, str4);
        } else {
            str = str3;
        }
        if ((4097 & j10) != 0) {
            C8.a.d(this.f29209o, num);
        }
        if (j16 != 0) {
            G0.c.a(this.f29210p, str9);
        }
        if (j14 != 0) {
            G0.c.a(this.f29211q, str8);
        }
        if ((4100 & j10) != 0) {
            G0.c.a(this.f29212r, str2);
        }
        if (j13 != 0) {
            G0.c.a(this.f29213s, str7);
        }
        if ((j10 & 4160) != 0) {
            this.f29267J.setBackground(drawable);
            C8.a.b(this.f29217w, z10);
            C8.a.b(this.f29218x, z10);
        }
        if (j15 != 0) {
            this.f29267J.setOnClickListener(onClickListener);
        }
        if ((4128 & j10) != 0) {
            G0.c.a(this.f29214t, str5);
        }
        if (j12 != 0) {
            G0.c.a(this.f29215u, str6);
        }
        if ((j10 & 4104) != 0) {
            G0.c.a(this.f29216v, str);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29268K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (44 == i) {
            this.f29206H = (Integer) obj;
            synchronized (this) {
                this.f29268K |= 1;
            }
            a();
            i();
        } else if (7 == i) {
        } else if (123 == i) {
            this.f29204F = (String) obj;
            synchronized (this) {
                this.f29268K |= 4;
            }
            a();
            i();
        } else if (122 == i) {
            this.f29203E = (String) obj;
            synchronized (this) {
                this.f29268K |= 8;
            }
            a();
            i();
        } else if (101 == i) {
            this.f29219y = (String) obj;
            synchronized (this) {
                this.f29268K |= 16;
            }
            a();
            i();
        } else if (3 == i) {
            this.f29199A = (String) obj;
            synchronized (this) {
                this.f29268K |= 32;
            }
            a();
            i();
        } else if (49 == i) {
            this.f29207I = (Boolean) obj;
            synchronized (this) {
                this.f29268K |= 64;
            }
            a();
            i();
        } else if (121 == i) {
            this.f29202D = (String) obj;
            synchronized (this) {
                this.f29268K |= 128;
            }
            a();
            i();
        } else if (124 == i) {
            this.f29205G = (String) obj;
            synchronized (this) {
                this.f29268K |= 256;
            }
            a();
            i();
        } else if (4 == i) {
            this.f29200B = (String) obj;
            synchronized (this) {
                this.f29268K |= 512;
            }
            a();
            i();
        } else if (105 == i) {
            this.f29201C = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29268K |= 1024;
            }
            a();
            i();
        } else {
            if (21 != i) {
                return false;
            }
            this.f29220z = (String) obj;
            synchronized (this) {
                this.f29268K |= 2048;
            }
            a();
            i();
        }
        return true;
    }
}
