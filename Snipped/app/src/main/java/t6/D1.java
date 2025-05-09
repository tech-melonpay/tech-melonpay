package t6;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellStatementsSelectorAccountBindingImpl.java */
/* loaded from: classes2.dex */
public final class D1 extends C1 {

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f27740u;

    /* renamed from: v, reason: collision with root package name */
    public long f27741v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public D1(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 4
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r11, r0, r1)
            r2 = 2
            r2 = r0[r2]
            r7 = r2
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            r2 = 3
            r2 = r0[r2]
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            r2 = 1
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3 = r9
            r4 = r11
            r8 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.f27741v = r2
            com.google.android.material.imageview.ShapeableImageView r10 = r9.f27656n
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f27657o
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f27658p
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.f27740u = r10
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 16
            r9.f27741v = r10     // Catch: java.lang.Throwable -> L48
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            r9.i()
            return
        L48:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.D1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f27741v;
            this.f27741v = 0L;
        }
        String str = this.f27661s;
        Integer num = this.f27659q;
        View.OnClickListener onClickListener = this.f27662t;
        String str2 = this.f27660r;
        long j11 = 17 & j10;
        long j12 = 18 & j10;
        long j13 = 20 & j10;
        long j14 = j10 & 24;
        if (j12 != 0) {
            C8.a.d(this.f27656n, num);
        }
        if (j11 != 0) {
            G0.c.a(this.f27657o, str);
        }
        if (j14 != 0) {
            G0.c.a(this.f27658p, str2);
        }
        if (j13 != 0) {
            this.f27740u.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27741v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (146 == i) {
            this.f27661s = (String) obj;
            synchronized (this) {
                this.f27741v |= 1;
            }
            a();
            i();
        } else if (44 == i) {
            this.f27659q = (Integer) obj;
            synchronized (this) {
                this.f27741v |= 2;
            }
            a();
            i();
        } else if (104 == i) {
            this.f27662t = (View.OnClickListener) obj;
            synchronized (this) {
                this.f27741v |= 4;
            }
            a();
            i();
        } else {
            if (101 != i) {
                return false;
            }
            this.f27660r = (String) obj;
            synchronized (this) {
                this.f27741v |= 8;
            }
            a();
            i();
        }
        return true;
    }
}
