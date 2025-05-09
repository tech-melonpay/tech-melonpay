package t6;

import android.graphics.drawable.Drawable;
import android.text.SpannedString;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellAccountHorisontalOldBindingImpl.java */
/* renamed from: t6.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1452v extends AbstractC1445u {

    /* renamed from: A, reason: collision with root package name */
    public long f29693A;

    /* renamed from: z, reason: collision with root package name */
    public final ConstraintLayout f29694z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1452v(F0.c r12, android.view.View r13) {
        /*
            r11 = this;
            r0 = 6
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r13, r0, r1)
            r2 = 5
            r2 = r0[r2]
            r6 = r2
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = 3
            r2 = r0[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = 4
            r2 = r0[r2]
            r10 = r2
            android.view.View r10 = (android.view.View) r10
            r3 = r11
            r4 = r12
            r5 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = -1
            r11.f29693A = r2
            android.widget.ImageView r12 = r11.f29632n
            r12.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r12 = r11.f29633o
            r12.setTag(r1)
            android.widget.TextView r12 = r11.f29634p
            r12.setTag(r1)
            r12 = 0
            r12 = r0[r12]
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r11.f29694z = r12
            r12.setTag(r1)
            android.widget.TextView r12 = r11.f29635q
            r12.setTag(r1)
            android.view.View r12 = r11.f29636r
            r12.setTag(r1)
            r11.l(r13)
            monitor-enter(r11)
            r12 = 128(0x80, double:6.3E-322)
            r11.f29693A = r12     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L5e
            r11.i()
            return
        L5e:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L5e
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1452v.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        Drawable drawable;
        synchronized (this) {
            j10 = this.f29693A;
            this.f29693A = 0L;
        }
        Integer num = this.f29641w;
        SpannedString spannedString = this.f29638t;
        View.OnClickListener onClickListener = this.f29639u;
        String str = this.f29637s;
        Integer num2 = this.f29643y;
        View.OnClickListener onClickListener2 = this.f29640v;
        Boolean bool = this.f29642x;
        boolean z10 = false;
        int j11 = (j10 & 144) != 0 ? F0.f.j(num2) : 0;
        long j12 = j10 & 192;
        if (j12 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j12 != 0) {
                j10 |= k3 ? 512L : 256L;
            }
            drawable = U4.b.j(this.f29694z.getContext(), k3 ? R.drawable.cell_bg_interactive_16 : R.drawable.cell_bg_full_inactive_16);
            z10 = !k3;
        } else {
            drawable = null;
        }
        if ((j10 & 160) != 0) {
            this.f29632n.setOnClickListener(onClickListener2);
        }
        if ((129 & j10) != 0) {
            C8.a.d(this.f29633o, num);
        }
        if ((136 & j10) != 0) {
            G0.c.a(this.f29634p, str);
        }
        if ((j10 & 192) != 0) {
            this.f29694z.setBackground(drawable);
            C8.a.b(this.f29636r, z10);
        }
        if ((132 & j10) != 0) {
            this.f29694z.setOnClickListener(onClickListener);
        }
        if ((j10 & 144) != 0) {
            ConstraintLayout constraintLayout = this.f29694z;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.width = (int) D9.b.T(j11);
            constraintLayout.setLayoutParams(layoutParams);
        }
        if ((j10 & 130) != 0) {
            G0.c.a(this.f29635q, spannedString);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29693A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (44 == i) {
            this.f29641w = (Integer) obj;
            synchronized (this) {
                this.f29693A |= 1;
            }
            a();
            i();
        } else if (3 == i) {
            this.f29638t = (SpannedString) obj;
            synchronized (this) {
                this.f29693A |= 2;
            }
            a();
            i();
        } else if (105 == i) {
            this.f29639u = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29693A |= 4;
            }
            a();
            i();
        } else if (21 == i) {
            this.f29637s = (String) obj;
            synchronized (this) {
                this.f29693A |= 8;
            }
            a();
            i();
        } else if (167 == i) {
            this.f29643y = (Integer) obj;
            synchronized (this) {
                this.f29693A |= 16;
            }
            a();
            i();
        } else if (114 == i) {
            this.f29640v = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29693A |= 32;
            }
            a();
            i();
        } else {
            if (49 != i) {
                return false;
            }
            this.f29642x = (Boolean) obj;
            synchronized (this) {
                this.f29693A |= 64;
            }
            a();
            i();
        }
        return true;
    }
}
