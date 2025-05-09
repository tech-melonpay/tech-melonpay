package t6;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellHeaderTopBindingImpl.java */
/* renamed from: t6.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1446u0 extends AbstractC1439t0 {

    /* renamed from: w, reason: collision with root package name */
    public final ConstraintLayout f29644w;

    /* renamed from: x, reason: collision with root package name */
    public long f29645x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1446u0(F0.c r5, android.view.View r6) {
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
            r4.f29645x = r2
            android.widget.TextView r5 = r4.f29597n
            r5.setTag(r1)
            r5 = 0
            r5 = r0[r5]
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r4.f29644w = r5
            r5.setTag(r1)
            android.widget.TextView r5 = r4.f29598o
            r5.setTag(r1)
            r4.l(r6)
            monitor-enter(r4)
            r5 = 128(0x80, double:6.3E-322)
            r4.f29645x = r5     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            r4.i()
            return
        L38:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1446u0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        TextView textView;
        int i;
        synchronized (this) {
            j10 = this.f29645x;
            this.f29645x = 0L;
        }
        String str = this.f29599p;
        View.OnClickListener onClickListener = this.f29605v;
        Integer num = this.f29602s;
        String str2 = this.f29604u;
        Boolean bool = this.f29600q;
        Integer num2 = this.f29603t;
        Boolean bool2 = this.f29601r;
        int i9 = 0;
        int j11 = (j10 & 132) != 0 ? F0.f.j(num) : 0;
        boolean k3 = (j10 & 144) != 0 ? F0.f.k(bool) : false;
        int j12 = (j10 & 160) != 0 ? F0.f.j(num2) : 0;
        long j13 = j10 & 192;
        if (j13 != 0) {
            boolean k10 = F0.f.k(bool2);
            if (j13 != 0) {
                j10 |= k10 ? 512L : 256L;
            }
            if (k10) {
                textView = this.f29598o;
                i = R.color.black;
            } else {
                textView = this.f29598o;
                i = R.color.middle_gray;
            }
            i9 = F0.f.d(i, textView);
        }
        if ((j10 & 130) != 0) {
            this.f29597n.setOnClickListener(onClickListener);
        }
        if ((j10 & 136) != 0) {
            G0.c.a(this.f29597n, str2);
        }
        if ((j10 & 144) != 0) {
            C8.a.b(this.f29597n, k3);
        }
        if ((j10 & 160) != 0) {
            C8.a.h(j12, this.f29644w);
        }
        if ((j10 & 132) != 0) {
            C8.a.f(j11, this.f29644w);
        }
        if ((129 & j10) != 0) {
            G0.c.a(this.f29598o, str);
        }
        if ((j10 & 192) != 0) {
            this.f29598o.setTextColor(i9);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29645x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (94 == i) {
            this.f29599p = (String) obj;
            synchronized (this) {
                this.f29645x |= 1;
            }
            a();
            i();
        } else if (115 == i) {
            this.f29605v = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29645x |= 2;
            }
            a();
            i();
        } else if (95 == i) {
            this.f29602s = (Integer) obj;
            synchronized (this) {
                this.f29645x |= 4;
            }
            a();
            i();
        } else if (129 == i) {
            this.f29604u = (String) obj;
            synchronized (this) {
                this.f29645x |= 8;
            }
            a();
            i();
        } else if (69 == i) {
            this.f29600q = (Boolean) obj;
            synchronized (this) {
                this.f29645x |= 16;
            }
            a();
            i();
        } else if (96 == i) {
            this.f29603t = (Integer) obj;
            synchronized (this) {
                this.f29645x |= 32;
            }
            a();
            i();
        } else {
            if (49 != i) {
                return false;
            }
            this.f29601r = (Boolean) obj;
            synchronized (this) {
                this.f29645x |= 64;
            }
            a();
            i();
        }
        return true;
    }
}
