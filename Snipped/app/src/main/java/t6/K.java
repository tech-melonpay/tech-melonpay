package t6;

import android.text.SpannedString;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellCardVaultBindingImpl.java */
/* loaded from: classes2.dex */
public final class K extends J {

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f28035v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f28036w;

    /* renamed from: x, reason: collision with root package name */
    public long f28037x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public K(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 5
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r11, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 2
            r2 = r0[r2]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 1
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.f28037x = r2
            android.widget.TextView r10 = r9.f28016n
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.f28035v = r10
            r10.setTag(r1)
            r10 = 4
            r10 = r0[r10]
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r9.f28036w = r10
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f28017o
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f28018p
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 64
            r9.f28037x = r10     // Catch: java.lang.Throwable -> L52
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L52
            r9.i()
            return
        L52:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L52
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.K.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28037x;
            this.f28037x = 0L;
        }
        View.OnClickListener onClickListener = this.f28022t;
        SpannedString spannedString = this.f28020r;
        String str = this.f28021s;
        View.OnClickListener onClickListener2 = this.f28023u;
        String str2 = this.f28019q;
        long j11 = 65 & j10;
        long j12 = 66 & j10;
        long j13 = 68 & j10;
        long j14 = 72 & j10;
        long j15 = j10 & 96;
        if (j13 != 0) {
            G0.c.a(this.f28016n, str);
        }
        if (j14 != 0) {
            this.f28035v.setOnClickListener(onClickListener2);
        }
        if (j11 != 0) {
            this.f28036w.setOnClickListener(onClickListener);
        }
        if (j12 != 0) {
            G0.c.a(this.f28017o, spannedString);
        }
        if (j15 != 0) {
            G0.c.a(this.f28018p, str2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28037x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (153 == i) {
            this.f28022t = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28037x |= 1;
            }
            a();
            i();
        } else if (7 == i) {
            this.f28020r = (SpannedString) obj;
            synchronized (this) {
                this.f28037x |= 2;
            }
            a();
            i();
        } else if (8 == i) {
            this.f28021s = (String) obj;
            synchronized (this) {
                this.f28037x |= 4;
            }
            a();
            i();
        } else if (164 == i) {
            this.f28023u = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28037x |= 8;
            }
            a();
            i();
        } else if (21 == i) {
        } else {
            if (101 != i) {
                return false;
            }
            this.f28019q = (String) obj;
            synchronized (this) {
                this.f28037x |= 32;
            }
            a();
            i();
        }
        return true;
    }
}
