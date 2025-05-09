package t6;

import android.text.SpannedString;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellStatementsSelectorAccountWithCurrencyBindingImpl.java */
/* loaded from: classes2.dex */
public final class F1 extends E1 {

    /* renamed from: x, reason: collision with root package name */
    public final ConstraintLayout f27859x;

    /* renamed from: y, reason: collision with root package name */
    public long f27860y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public F1(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            r0 = 5
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r12, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            com.google.android.material.imageview.ShapeableImageView r8 = (com.google.android.material.imageview.ShapeableImageView) r8
            r2 = 4
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3 = r10
            r4 = r12
            r9 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = -1
            r10.f27860y = r2
            android.widget.TextView r11 = r10.f27763n
            r11.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r11 = r10.f27764o
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f27765p
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f27766q
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r10.f27859x = r11
            r11.setTag(r1)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 64
            r10.f27860y = r11     // Catch: java.lang.Throwable -> L53
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L53
            r10.i()
            return
        L53:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L53
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.F1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        float f10;
        synchronized (this) {
            j10 = this.f27860y;
            this.f27860y = 0L;
        }
        Integer num = this.f27767r;
        String str = this.f27768s;
        String str2 = this.f27769t;
        SpannedString spannedString = this.f27770u;
        View.OnClickListener onClickListener = this.f27771v;
        Boolean bool = this.f27772w;
        long j11 = j10 & 96;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 256L : 128L;
            }
            f10 = k3 ? 1.0f : 0.5f;
        } else {
            f10 = 0.0f;
        }
        if ((72 & j10) != 0) {
            G0.c.a(this.f27763n, spannedString);
        }
        if ((65 & j10) != 0) {
            C8.a.d(this.f27764o, num);
        }
        if ((68 & j10) != 0) {
            G0.c.a(this.f27765p, str2);
        }
        if ((66 & j10) != 0) {
            G0.c.a(this.f27766q, str);
        }
        if ((j10 & 96) != 0 && F0.f.f1141j >= 11) {
            this.f27859x.setAlpha(f10);
        }
        if ((j10 & 80) != 0) {
            this.f27859x.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27860y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (44 == i) {
            this.f27767r = (Integer) obj;
            synchronized (this) {
                this.f27860y |= 1;
            }
            a();
            i();
        } else if (101 == i) {
            this.f27768s = (String) obj;
            synchronized (this) {
                this.f27860y |= 2;
            }
            a();
            i();
        } else if (146 == i) {
            this.f27769t = (String) obj;
            synchronized (this) {
                this.f27860y |= 4;
            }
            a();
            i();
        } else if (3 == i) {
            this.f27770u = (SpannedString) obj;
            synchronized (this) {
                this.f27860y |= 8;
            }
            a();
            i();
        } else if (104 == i) {
            this.f27771v = (View.OnClickListener) obj;
            synchronized (this) {
                this.f27860y |= 16;
            }
            a();
            i();
        } else {
            if (49 != i) {
                return false;
            }
            this.f27772w = (Boolean) obj;
            synchronized (this) {
                this.f27860y |= 32;
            }
            a();
            i();
        }
        return true;
    }
}
