package t6;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellCountryBindingImpl.java */
/* loaded from: classes2.dex */
public final class V extends U {

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f28581v;

    /* renamed from: w, reason: collision with root package name */
    public long f28582w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V(F0.c r10, android.view.View r11) {
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
            r9.f28582w = r2
            android.widget.TextView r10 = r9.f28519n
            r10.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r10 = r9.f28520o
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f28521p
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.f28581v = r10
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 32
            r9.f28582w = r10     // Catch: java.lang.Throwable -> L48
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            r9.i()
            return
        L48:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.V.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        boolean z10;
        boolean z11;
        synchronized (this) {
            j10 = this.f28582w;
            this.f28582w = 0L;
        }
        String str = this.f28524s;
        String str2 = this.f28523r;
        Boolean bool = this.f28522q;
        View.OnClickListener onClickListener = this.f28526u;
        String str3 = this.f28525t;
        long j11 = 33 & j10;
        long j12 = 34 & j10;
        long j13 = 36 & j10;
        if (j13 != 0) {
            z10 = F0.f.k(bool);
            z11 = !z10;
        } else {
            z10 = false;
            z11 = false;
        }
        long j14 = 40 & j10;
        long j15 = j10 & 48;
        if (j11 != 0) {
            G0.c.a(this.f28519n, str);
        }
        if (j13 != 0) {
            C8.a.b(this.f28519n, z10);
            C8.a.b(this.f28520o, z11);
        }
        if (j12 != 0) {
            C8.a.i(this.f28520o, str2);
        }
        if (j15 != 0) {
            G0.c.a(this.f28521p, str3);
        }
        if (j14 != 0) {
            this.f28581v.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28582w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (126 == i) {
            this.f28524s = (String) obj;
            synchronized (this) {
                this.f28582w |= 1;
            }
            a();
            i();
        } else if (18 == i) {
            this.f28523r = (String) obj;
            synchronized (this) {
                this.f28582w |= 2;
            }
            a();
            i();
        } else if (53 == i) {
            this.f28522q = (Boolean) obj;
            synchronized (this) {
                this.f28582w |= 4;
            }
            a();
            i();
        } else if (104 == i) {
            this.f28526u = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28582w |= 8;
            }
            a();
            i();
        } else {
            if (19 != i) {
                return false;
            }
            this.f28525t = (String) obj;
            synchronized (this) {
                this.f28582w |= 16;
            }
            a();
            i();
        }
        return true;
    }
}
