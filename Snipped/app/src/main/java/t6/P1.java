package t6;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import com.luminary.mobile.R;

/* compiled from: CellTransactionHeaderBindingImpl.java */
/* loaded from: classes2.dex */
public final class P1 extends O1 {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f28314v;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f28315t;

    /* renamed from: u, reason: collision with root package name */
    public long f28316u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28314v = sparseIntArray;
        sparseIntArray.put(R.id.constraint_layout, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public P1(F0.c r4, android.view.View r5) {
        /*
            r3 = this;
            android.util.SparseIntArray r0 = t6.P1.f28314v
            r1 = 5
            java.lang.Object[] r0 = F0.f.h(r5, r1, r0)
            r1 = 4
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 3
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3.<init>(r4, r5, r1, r2)
            r1 = -1
            r3.f28316u = r1
            r4 = 0
            r4 = r0[r4]
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r1 = 0
            r4.setTag(r1)
            r4 = 2
            r4 = r0[r4]
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f28315t = r4
            r4.setTag(r1)
            android.widget.TextView r4 = r3.f28243n
            r4.setTag(r1)
            android.widget.TextView r4 = r3.f28244o
            r4.setTag(r1)
            r3.l(r5)
            monitor-enter(r3)
            r4 = 16
            r3.f28316u = r4     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            r3.i()
            return
        L47:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L47
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.P1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28316u;
            this.f28316u = 0L;
        }
        Boolean bool = this.f28247r;
        Boolean bool2 = this.f28246q;
        View.OnClickListener onClickListener = this.f28248s;
        String str = this.f28245p;
        long j11 = 17 & j10;
        long j12 = 18 & j10;
        long j13 = 20 & j10;
        long j14 = j10 & 24;
        if (j11 != 0) {
            C8.a.j(this.f28315t, bool);
        }
        if (j14 != 0) {
            G0.c.a(this.f28243n, str);
        }
        if (j12 != 0) {
            C8.a.j(this.f28244o, bool2);
        }
        if (j13 != 0) {
            this.f28244o.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28316u != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (136 == i) {
            this.f28247r = (Boolean) obj;
            synchronized (this) {
                this.f28316u |= 1;
            }
            a();
            i();
        } else if (137 == i) {
            this.f28246q = (Boolean) obj;
            synchronized (this) {
                this.f28316u |= 2;
            }
            a();
            i();
        } else if (104 == i) {
            this.f28248s = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28316u |= 4;
            }
            a();
            i();
        } else {
            if (147 != i) {
                return false;
            }
            this.f28245p = (String) obj;
            synchronized (this) {
                this.f28316u |= 8;
            }
            a();
            i();
        }
        return true;
    }
}
