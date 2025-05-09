package t6;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellCompanyNewBindingImpl.java */
/* loaded from: classes2.dex */
public final class T extends S {

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f28495u;

    /* renamed from: v, reason: collision with root package name */
    public long f28496v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 4
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r11, r0, r1)
            r2 = 2
            r2 = r0[r2]
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            r2 = 3
            r2 = r0[r2]
            r7 = r2
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            r2 = 1
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3 = r9
            r4 = r11
            r8 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.f28496v = r2
            android.widget.TextView r10 = r9.f28420n
            r10.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r10 = r9.f28421o
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.f28495u = r10
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f28422p
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 64
            r9.f28496v = r10     // Catch: java.lang.Throwable -> L48
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            r9.i()
            return
        L48:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.T.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28496v;
            this.f28496v = 0L;
        }
        String str = this.f28423q;
        Integer num = this.f28425s;
        View.OnClickListener onClickListener = this.f28426t;
        String str2 = this.f28424r;
        long j11 = 66 & j10;
        long j12 = 68 & j10;
        long j13 = 72 & j10;
        if ((j10 & 80) != 0) {
            G0.c.a(this.f28420n, str2);
        }
        if (j12 != 0) {
            C8.a.d(this.f28421o, num);
        }
        if (j13 != 0) {
            this.f28495u.setOnClickListener(onClickListener);
        }
        if (j11 != 0) {
            G0.c.a(this.f28422p, str);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28496v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (141 == i) {
        } else if (148 == i) {
            this.f28423q = (String) obj;
            synchronized (this) {
                this.f28496v |= 2;
            }
            a();
            i();
        } else if (43 == i) {
            this.f28425s = (Integer) obj;
            synchronized (this) {
                this.f28496v |= 4;
            }
            a();
            i();
        } else if (104 == i) {
            this.f28426t = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28496v |= 8;
            }
            a();
            i();
        } else if (25 == i) {
            this.f28424r = (String) obj;
            synchronized (this) {
                this.f28496v |= 16;
            }
            a();
            i();
        } else {
            if (9 != i) {
                return false;
            }
        }
        return true;
    }
}
