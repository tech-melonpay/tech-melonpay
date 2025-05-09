package t6;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellPaymentBindingImpl.java */
/* renamed from: t6.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1354i1 extends AbstractC1346h1 {

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f29093v;

    /* renamed from: w, reason: collision with root package name */
    public final View f29094w;

    /* renamed from: x, reason: collision with root package name */
    public long f29095x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1354i1(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 5
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r11, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r7 = r2
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            r2 = 1
            r2 = r0[r2]
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            r2 = 2
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3 = r9
            r4 = r11
            r8 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.f29095x = r2
            com.google.android.material.imageview.ShapeableImageView r10 = r9.f29044n
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.f29093v = r10
            r10.setTag(r1)
            r10 = 4
            r10 = r0[r10]
            android.view.View r10 = (android.view.View) r10
            r9.f29094w = r10
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f29045o
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f29046p
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 32
            r9.f29095x = r10     // Catch: java.lang.Throwable -> L52
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L52
            r9.i()
            return
        L52:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L52
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1354i1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f29095x;
            this.f29095x = 0L;
        }
        String str = this.f29047q;
        String str2 = this.f29048r;
        View.OnClickListener onClickListener = this.f29051u;
        Integer num = this.f29049s;
        long j11 = 33 & j10;
        long j12 = 34 & j10;
        long j13 = 36 & j10;
        long j14 = 40 & j10;
        long j15 = j10 & 48;
        boolean z10 = j15 != 0 ? !F0.f.k(this.f29050t) : false;
        if (j14 != 0) {
            C8.a.d(this.f29044n, num);
        }
        if (j13 != 0) {
            this.f29093v.setOnClickListener(onClickListener);
        }
        if (j15 != 0) {
            C8.a.b(this.f29094w, z10);
        }
        if (j11 != 0) {
            G0.c.a(this.f29045o, str);
        }
        if (j12 != 0) {
            G0.c.a(this.f29046p, str2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29095x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (101 == i) {
            this.f29047q = (String) obj;
            synchronized (this) {
                this.f29095x |= 1;
            }
            a();
            i();
        } else if (99 == i) {
            this.f29048r = (String) obj;
            synchronized (this) {
                this.f29095x |= 2;
            }
            a();
            i();
        } else if (105 == i) {
            this.f29051u = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29095x |= 4;
            }
            a();
            i();
        } else if (15 == i) {
            this.f29049s = (Integer) obj;
            synchronized (this) {
                this.f29095x |= 8;
            }
            a();
            i();
        } else {
            if (49 != i) {
                return false;
            }
            this.f29050t = (Boolean) obj;
            synchronized (this) {
                this.f29095x |= 16;
            }
            a();
            i();
        }
        return true;
    }
}
