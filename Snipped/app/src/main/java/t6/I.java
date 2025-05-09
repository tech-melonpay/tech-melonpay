package t6;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellCardSmallBindingImpl.java */
/* loaded from: classes2.dex */
public final class I extends H {

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f27953u;

    /* renamed from: v, reason: collision with root package name */
    public long f27954v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public I(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 4
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r11, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r2 = 1
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 2
            r2 = r0[r2]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3 = r9
            r4 = r11
            r8 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.f27954v = r2
            android.widget.ImageView r10 = r9.f27917n
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.f27953u = r10
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f27918o
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f27919p
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 16
            r9.f27954v = r10     // Catch: java.lang.Throwable -> L48
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            r9.i()
            return
        L48:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.I.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f27954v;
            this.f27954v = 0L;
        }
        View.OnClickListener onClickListener = this.f27923t;
        Integer num = this.f27922s;
        String str = this.f27920q;
        String str2 = this.f27921r;
        long j11 = 17 & j10;
        long j12 = 18 & j10;
        long j13 = 20 & j10;
        long j14 = j10 & 24;
        if (j12 != 0) {
            C8.a.d(this.f27917n, num);
        }
        if (j11 != 0) {
            this.f27953u.setOnClickListener(onClickListener);
        }
        if (j13 != 0) {
            G0.c.a(this.f27918o, str);
        }
        if (j14 != 0) {
            G0.c.a(this.f27919p, str2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27954v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (105 == i) {
            this.f27923t = (View.OnClickListener) obj;
            synchronized (this) {
                this.f27954v |= 1;
            }
            a();
            i();
        } else if (15 == i) {
            this.f27922s = (Integer) obj;
            synchronized (this) {
                this.f27954v |= 2;
            }
            a();
            i();
        } else if (101 == i) {
            this.f27920q = (String) obj;
            synchronized (this) {
                this.f27954v |= 4;
            }
            a();
            i();
        } else {
            if (99 != i) {
                return false;
            }
            this.f27921r = (String) obj;
            synchronized (this) {
                this.f27954v |= 8;
            }
            a();
            i();
        }
        return true;
    }
}
