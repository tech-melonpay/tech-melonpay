package t6;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellCardDetailsBindingImpl.java */
/* renamed from: t6.G, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1287G extends AbstractC1286F {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f27870A;

    /* renamed from: B, reason: collision with root package name */
    public final View f27871B;

    /* renamed from: C, reason: collision with root package name */
    public long f27872C;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1287G(F0.c r12, android.view.View r13) {
        /*
            r11 = this;
            r0 = 7
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r13, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r6 = r2
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r2 = 4
            r2 = r0[r2]
            r7 = r2
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r2 = 5
            r2 = r0[r2]
            r8 = r2
            com.google.android.material.imageview.ShapeableImageView r8 = (com.google.android.material.imageview.ShapeableImageView) r8
            r2 = 1
            r2 = r0[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = 2
            r2 = r0[r2]
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = -1
            r11.f27872C = r2
            androidx.constraintlayout.widget.ConstraintLayout r12 = r11.f27827n
            r12.setTag(r1)
            android.widget.ImageView r12 = r11.f27828o
            r12.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r12 = r11.f27829p
            r12.setTag(r1)
            r12 = 0
            r12 = r0[r12]
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r11.f27870A = r12
            r12.setTag(r1)
            r12 = 6
            r12 = r0[r12]
            android.view.View r12 = (android.view.View) r12
            r11.f27871B = r12
            r12.setTag(r1)
            android.widget.TextView r12 = r11.f27830q
            r12.setTag(r1)
            android.widget.TextView r12 = r11.f27831r
            r12.setTag(r1)
            r11.l(r13)
            monitor-enter(r11)
            r12 = 256(0x100, double:1.265E-321)
            r11.f27872C = r12     // Catch: java.lang.Throwable -> L68
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L68
            r11.i()
            return
        L68:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L68
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1287G.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        Drawable drawable;
        boolean z10;
        boolean z11;
        int i;
        boolean z12;
        boolean z13;
        Drawable drawable2;
        synchronized (this) {
            j10 = this.f27872C;
            this.f27872C = 0L;
        }
        String str = this.f27832s;
        Boolean bool = this.f27839z;
        Boolean bool2 = this.f27837x;
        Boolean bool3 = this.f27835v;
        Boolean bool4 = this.f27836w;
        String str2 = this.f27833t;
        View.OnClickListener onClickListener = this.f27838y;
        Integer num = this.f27834u;
        Drawable drawable3 = null;
        if ((j10 & 258) != 0) {
            boolean k3 = F0.f.k(bool);
            if ((j10 & 32768) != 0) {
                j10 = k3 ? j10 | 4096 : j10 | 2048;
            }
            if ((j10 & 258) != 0) {
                j10 = k3 ? j10 | 16384 : j10 | 8192;
            }
            drawable = k3 ? U4.b.j(this.f27870A.getContext(), R.drawable.cell_bg_full_16) : U4.b.j(this.f27870A.getContext(), R.drawable.cell_bg_interactive_16);
        } else {
            drawable = null;
        }
        long j11 = j10 & 262;
        if (j11 != 0) {
            z10 = F0.f.k(bool2);
            if (j11 != 0) {
                j10 = z10 ? j10 | 65536 : j10 | 32768;
            }
        } else {
            z10 = false;
        }
        long j12 = j10 & 264;
        if (j12 != 0) {
            boolean k10 = F0.f.k(bool3);
            if (j12 != 0) {
                j10 |= k10 ? 1024L : 512L;
            }
            i = F0.f.d(k10 ? R.color.black : R.color.neutral_500, this.f27830q);
            z11 = !k10;
        } else {
            z11 = false;
            i = 0;
        }
        if ((j10 & 272) != 0) {
            boolean k11 = F0.f.k(bool4);
            z12 = !k11;
            z13 = k11;
        } else {
            z12 = false;
            z13 = false;
        }
        long j13 = j10 & 32768;
        if (j13 != 0) {
            boolean k12 = F0.f.k(bool);
            if (j13 != 0) {
                j10 = k12 ? j10 | 4096 : j10 | 2048;
            }
            if ((j10 & 258) != 0) {
                j10 = k12 ? j10 | 16384 : j10 | 8192;
            }
            drawable2 = k12 ? U4.b.j(this.f27827n.getContext(), R.drawable.card_details_bg_active) : U4.b.j(this.f27827n.getContext(), R.drawable.card_details_bg);
        } else {
            drawable2 = null;
        }
        long j14 = 262 & j10;
        if (j14 != 0) {
            if (z10) {
                drawable2 = U4.b.j(this.f27827n.getContext(), R.drawable.circle_main_color);
            }
            drawable3 = drawable2;
        }
        Drawable drawable4 = drawable3;
        if (j14 != 0) {
            this.f27827n.setBackground(drawable4);
        }
        if ((j10 & 272) != 0) {
            C8.a.b(this.f27828o, z12);
            C8.a.b(this.f27829p, z13);
        }
        if ((384 & j10) != 0) {
            C8.a.d(this.f27828o, num);
            C8.a.d(this.f27829p, num);
        }
        if ((258 & j10) != 0) {
            this.f27870A.setBackground(drawable);
        }
        if ((320 & j10) != 0) {
            this.f27870A.setOnClickListener(onClickListener);
        }
        if ((j10 & 264) != 0) {
            C8.a.b(this.f27871B, z11);
            this.f27830q.setTextColor(i);
        }
        if ((257 & j10) != 0) {
            G0.c.a(this.f27830q, str);
        }
        if ((j10 & 288) != 0) {
            G0.c.a(this.f27831r, str2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27872C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (101 == i) {
            this.f27832s = (String) obj;
            synchronized (this) {
                this.f27872C |= 1;
            }
            a();
            i();
        } else if (48 == i) {
            this.f27839z = (Boolean) obj;
            synchronized (this) {
                this.f27872C |= 2;
            }
            a();
            i();
        } else if (62 == i) {
            this.f27837x = (Boolean) obj;
            synchronized (this) {
                this.f27872C |= 4;
            }
            a();
            i();
        } else if (49 == i) {
            this.f27835v = (Boolean) obj;
            synchronized (this) {
                this.f27872C |= 8;
            }
            a();
            i();
        } else if (58 == i) {
            this.f27836w = (Boolean) obj;
            synchronized (this) {
                this.f27872C |= 16;
            }
            a();
            i();
        } else if (99 == i) {
            this.f27833t = (String) obj;
            synchronized (this) {
                this.f27872C |= 32;
            }
            a();
            i();
        } else if (105 == i) {
            this.f27838y = (View.OnClickListener) obj;
            synchronized (this) {
                this.f27872C |= 64;
            }
            a();
            i();
        } else {
            if (15 != i) {
                return false;
            }
            this.f27834u = (Integer) obj;
            synchronized (this) {
                this.f27872C |= 128;
            }
            a();
            i();
        }
        return true;
    }
}
