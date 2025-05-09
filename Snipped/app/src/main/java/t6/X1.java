package t6;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellTransferAccountBindingImpl.java */
/* loaded from: classes2.dex */
public final class X1 extends W1 {

    /* renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f28659y;

    /* renamed from: z, reason: collision with root package name */
    public long f28660z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X1(F0.c r12, android.view.View r13) {
        /*
            r11 = this;
            r0 = 6
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r13, r0, r1)
            r2 = 4
            r2 = r0[r2]
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            r2 = 5
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 2
            r2 = r0[r2]
            r9 = r2
            com.google.android.material.imageview.ShapeableImageView r9 = (com.google.android.material.imageview.ShapeableImageView) r9
            r2 = 3
            r2 = r0[r2]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 1
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r3 = r11
            r4 = r13
            r10 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = -1
            r11.f28660z = r2
            android.widget.TextView r12 = r11.f28610n
            r12.setTag(r1)
            android.widget.TextView r12 = r11.f28611o
            r12.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r12 = r11.f28612p
            r12.setTag(r1)
            android.widget.TextView r12 = r11.f28613q
            r12.setTag(r1)
            android.widget.TextView r12 = r11.f28614r
            r12.setTag(r1)
            r12 = 0
            r12 = r0[r12]
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r11.f28659y = r12
            r12.setTag(r1)
            r11.l(r13)
            monitor-enter(r11)
            r12 = 64
            r11.f28660z = r12     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L5e
            r11.i()
            return
        L5e:
            r12 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L5e
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.X1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28660z;
            this.f28660z = 0L;
        }
        String str = this.f28617u;
        String str2 = this.f28618v;
        Integer num = this.f28615s;
        String str3 = this.f28619w;
        View.OnClickListener onClickListener = this.f28620x;
        String str4 = this.f28616t;
        long j11 = 65 & j10;
        long j12 = 66 & j10;
        long j13 = 68 & j10;
        long j14 = 72 & j10;
        long j15 = 80 & j10;
        long j16 = j10 & 96;
        if (j12 != 0) {
            G0.c.a(this.f28610n, str2);
        }
        if (j14 != 0) {
            G0.c.a(this.f28611o, str3);
        }
        if (j13 != 0) {
            C8.a.d(this.f28612p, num);
        }
        if (j11 != 0) {
            G0.c.a(this.f28613q, str);
        }
        if (j16 != 0) {
            G0.c.a(this.f28614r, str4);
        }
        if (j15 != 0) {
            this.f28659y.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28660z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (146 == i) {
            this.f28617u = (String) obj;
            synchronized (this) {
                this.f28660z |= 1;
            }
            a();
            i();
        } else if (3 == i) {
            this.f28618v = (String) obj;
            synchronized (this) {
                this.f28660z |= 2;
            }
            a();
            i();
        } else if (44 == i) {
            this.f28615s = (Integer) obj;
            synchronized (this) {
                this.f28660z |= 4;
            }
            a();
            i();
        } else if (4 == i) {
            this.f28619w = (String) obj;
            synchronized (this) {
                this.f28660z |= 8;
            }
            a();
            i();
        } else if (104 == i) {
            this.f28620x = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28660z |= 16;
            }
            a();
            i();
        } else {
            if (101 != i) {
                return false;
            }
            this.f28616t = (String) obj;
            synchronized (this) {
                this.f28660z |= 32;
            }
            a();
            i();
        }
        return true;
    }
}
