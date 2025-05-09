package t6;

import android.view.View;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellSelectorBindingImpl.java */
/* renamed from: t6.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1433s1 extends AbstractC1425r1 {

    /* renamed from: t, reason: collision with root package name */
    public final ConstraintLayout f29561t;

    /* renamed from: u, reason: collision with root package name */
    public long f29562u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1433s1(F0.c r5, android.view.View r6) {
        /*
            r4 = this;
            r0 = 3
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r6, r0, r1)
            r2 = 1
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2
            r3 = r0[r3]
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3
            r4.<init>(r5, r6, r2, r3)
            r2 = -1
            r4.f29562u = r2
            android.widget.TextView r5 = r4.f29527n
            r5.setTag(r1)
            android.widget.CheckBox r5 = r4.f29528o
            r5.setTag(r1)
            r5 = 0
            r5 = r0[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r4.f29561t = r5
            r5.setTag(r1)
            r4.l(r6)
            monitor-enter(r4)
            r5 = 16
            r4.f29562u = r5     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            r4.i()
            return
        L38:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1433s1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f29562u;
            this.f29562u = 0L;
        }
        Boolean bool = this.f29530q;
        Boolean bool2 = this.f29531r;
        View.OnClickListener onClickListener = this.f29532s;
        String str = this.f29529p;
        long j11 = 17 & j10;
        boolean k3 = j11 != 0 ? F0.f.k(bool) : false;
        long j12 = 18 & j10;
        boolean k10 = j12 != 0 ? F0.f.k(bool2) : false;
        long j13 = 20 & j10;
        if ((j10 & 24) != 0) {
            G0.c.a(this.f29527n, str);
        }
        if (j12 != 0) {
            C8.a.b(this.f29528o, k10);
        }
        if (j11 != 0) {
            CheckBox checkBox = this.f29528o;
            if (checkBox.isChecked() != k3) {
                checkBox.setChecked(k3);
            }
        }
        if (j13 != 0) {
            this.f29528o.setOnClickListener(onClickListener);
            this.f29561t.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29562u != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (71 == i) {
            this.f29530q = (Boolean) obj;
            synchronized (this) {
                this.f29562u |= 1;
            }
            a();
            i();
        } else if (67 == i) {
            this.f29531r = (Boolean) obj;
            synchronized (this) {
                this.f29562u |= 2;
            }
            a();
            i();
        } else if (105 == i) {
            this.f29532s = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29562u |= 4;
            }
            a();
            i();
        } else {
            if (101 != i) {
                return false;
            }
            this.f29529p = (String) obj;
            synchronized (this) {
                this.f29562u |= 8;
            }
            a();
            i();
        }
        return true;
    }
}
