package t6;

import android.view.View;
import android.widget.TextView;
import com.luminary.mobile.R;

/* compiled from: CellHeaderTopBlueBindingImpl.java */
/* renamed from: t6.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1460w0 extends AbstractC1453v0 {

    /* renamed from: u, reason: collision with root package name */
    public long f29730u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1460w0(F0.c r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 3
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r6, r0, r1)
            r2 = 2
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 1
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4.<init>(r5, r6, r2, r3)
            r2 = -1
            r4.f29730u = r2
            android.widget.TextView r5 = r4.f29695n
            r5.setTag(r1)
            r5 = 0
            r5 = r0[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r5.setTag(r1)
            android.widget.TextView r5 = r4.f29696o
            r5.setTag(r1)
            r4.l(r6)
            monitor-enter(r4)
            r5 = 32
            r4.f29730u = r5     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            r4.i()
            return
        L36:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1460w0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        TextView textView;
        int i;
        synchronized (this) {
            j10 = this.f29730u;
            this.f29730u = 0L;
        }
        String str = this.f29697p;
        View.OnClickListener onClickListener = this.f29701t;
        String str2 = this.f29700s;
        Boolean bool = this.f29698q;
        Boolean bool2 = this.f29699r;
        int i9 = 0;
        boolean k3 = (j10 & 40) != 0 ? F0.f.k(bool) : false;
        long j11 = j10 & 48;
        if (j11 != 0) {
            boolean k10 = F0.f.k(bool2);
            if (j11 != 0) {
                j10 |= k10 ? 128L : 64L;
            }
            if (k10) {
                textView = this.f29696o;
                i = R.color.main_color;
            } else {
                textView = this.f29696o;
                i = R.color.neutral_500;
            }
            i9 = F0.f.d(i, textView);
        }
        if ((j10 & 34) != 0) {
            this.f29695n.setOnClickListener(onClickListener);
        }
        if ((j10 & 36) != 0) {
            G0.c.a(this.f29695n, str2);
        }
        if ((j10 & 40) != 0) {
            C8.a.b(this.f29695n, k3);
        }
        if ((33 & j10) != 0) {
            G0.c.a(this.f29696o, str);
        }
        if ((j10 & 48) != 0) {
            this.f29696o.setTextColor(i9);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29730u != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (94 == i) {
            this.f29697p = (String) obj;
            synchronized (this) {
                this.f29730u |= 1;
            }
            a();
            i();
        } else if (115 == i) {
            this.f29701t = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29730u |= 2;
            }
            a();
            i();
        } else if (129 == i) {
            this.f29700s = (String) obj;
            synchronized (this) {
                this.f29730u |= 4;
            }
            a();
            i();
        } else if (69 == i) {
            this.f29698q = (Boolean) obj;
            synchronized (this) {
                this.f29730u |= 8;
            }
            a();
            i();
        } else {
            if (49 != i) {
                return false;
            }
            this.f29699r = (Boolean) obj;
            synchronized (this) {
                this.f29730u |= 16;
            }
            a();
            i();
        }
        return true;
    }
}
