package t6;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellStatementsSelectorCardBindingImpl.java */
/* loaded from: classes2.dex */
public final class J1 extends I1 {

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f28026v;

    /* renamed from: w, reason: collision with root package name */
    public long f28027w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public J1(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 4
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r11, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            r2 = 2
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            r3 = r9
            r4 = r11
            r8 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.f28027w = r2
            android.widget.TextView r10 = r9.f27958n
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f27959o
            r10.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r10 = r9.f27960p
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.f28026v = r10
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 32
            r9.f28027w = r10     // Catch: java.lang.Throwable -> L48
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            r9.i()
            return
        L48:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.J1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28027w;
            this.f28027w = 0L;
        }
        String str = this.f27963s;
        Integer num = this.f27961q;
        View.OnClickListener onClickListener = this.f27964t;
        Boolean bool = this.f27965u;
        String str2 = this.f27962r;
        long j11 = 33 & j10;
        long j12 = 34 & j10;
        long j13 = 36 & j10;
        long j14 = 40 & j10;
        boolean k3 = j14 != 0 ? F0.f.k(bool) : false;
        long j15 = j10 & 48;
        if (j11 != 0) {
            G0.c.a(this.f27958n, str);
        }
        if (j15 != 0) {
            G0.c.a(this.f27959o, str2);
        }
        if (j14 != 0) {
            C8.a.b(this.f27960p, k3);
        }
        if (j12 != 0) {
            C8.a.d(this.f27960p, num);
        }
        if (j13 != 0) {
            this.f28026v.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28027w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (146 == i) {
            this.f27963s = (String) obj;
            synchronized (this) {
                this.f28027w |= 1;
            }
            a();
            i();
        } else if (44 == i) {
            this.f27961q = (Integer) obj;
            synchronized (this) {
                this.f28027w |= 2;
            }
            a();
            i();
        } else if (104 == i) {
            this.f27964t = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28027w |= 4;
            }
            a();
            i();
        } else if (65 == i) {
            this.f27965u = (Boolean) obj;
            synchronized (this) {
                this.f28027w |= 8;
            }
            a();
            i();
        } else {
            if (101 != i) {
                return false;
            }
            this.f27962r = (String) obj;
            synchronized (this) {
                this.f28027w |= 16;
            }
            a();
            i();
        }
        return true;
    }
}
