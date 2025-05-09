package t6;

import android.text.SpannedString;
import android.view.View;
import android.widget.TextView;
import com.luminary.mobile.R;

/* compiled from: CellExchangeCryptoActionRequiredItemBindingImpl.java */
/* renamed from: t6.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1361j0 extends AbstractC1353i0 {

    /* renamed from: A, reason: collision with root package name */
    public long f29115A;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1361j0(F0.c r13, android.view.View r14) {
        /*
            r12 = this;
            r0 = 7
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r14, r0, r1)
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r2 = 4
            r2 = r0[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = 5
            r2 = r0[r2]
            r5 = r2
            android.widget.Button r5 = (android.widget.Button) r5
            r2 = 3
            r2 = r0[r2]
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            r2 = 6
            r2 = r0[r2]
            r6 = r2
            android.widget.Button r6 = (android.widget.Button) r6
            r3 = r12
            r4 = r14
            r11 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = -1
            r12.f29115A = r2
            android.widget.TextView r13 = r12.f29080n
            r13.setTag(r1)
            android.widget.ImageView r13 = r12.f29081o
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f29082p
            r13.setTag(r1)
            android.widget.Button r13 = r12.f29083q
            r13.setTag(r1)
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f29084r
            r13.setTag(r1)
            android.widget.Button r13 = r12.f29085s
            r13.setTag(r1)
            r12.l(r14)
            monitor-enter(r12)
            r13 = 1024(0x400, double:5.06E-321)
            r12.f29115A = r13     // Catch: java.lang.Throwable -> L67
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L67
            r12.i()
            return
        L67:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L67
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1361j0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        int i;
        TextView textView;
        int i9;
        synchronized (this) {
            j10 = this.f29115A;
            this.f29115A = 0L;
        }
        Integer num = this.f29089w;
        View.OnClickListener onClickListener = this.f29092z;
        Boolean bool = this.f29090x;
        String str = this.f29086t;
        View.OnClickListener onClickListener2 = this.f29091y;
        SpannedString spannedString = this.f29088v;
        String str2 = this.f29087u;
        long j11 = j10 & 1032;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 4096L : 2048L;
            }
            if (k3) {
                textView = this.f29084r;
                i9 = R.color.black;
            } else {
                textView = this.f29084r;
                i9 = R.color.text_disable;
            }
            i = F0.f.d(i9, textView);
        } else {
            i = 0;
        }
        long j12 = 1056 & j10;
        long j13 = 1088 & j10;
        long j14 = j10 & 1536;
        if ((j10 & 1152) != 0) {
            this.f29080n.setText(spannedString);
        }
        if ((1025 & j10) != 0) {
            C8.a.d(this.f29081o, num);
        }
        if (j14 != 0) {
            G0.c.a(this.f29082p, str2);
        }
        if (j13 != 0) {
            this.f29083q.setOnClickListener(onClickListener2);
        }
        if (j12 != 0) {
            G0.c.a(this.f29084r, str);
        }
        if ((1032 & j10) != 0) {
            this.f29084r.setTextColor(i);
        }
        if ((j10 & 1026) != 0) {
            this.f29085s.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29115A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (44 == i) {
            this.f29089w = (Integer) obj;
            synchronized (this) {
                this.f29115A |= 1;
            }
            a();
            i();
        } else if (115 == i) {
            this.f29092z = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29115A |= 2;
            }
            a();
            i();
        } else if (7 == i) {
        } else if (56 == i) {
            this.f29090x = (Boolean) obj;
            synchronized (this) {
                this.f29115A |= 8;
            }
            a();
            i();
        } else if (70 == i) {
        } else if (101 == i) {
            this.f29086t = (String) obj;
            synchronized (this) {
                this.f29115A |= 32;
            }
            a();
            i();
        } else if (112 == i) {
            this.f29091y = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29115A |= 64;
            }
            a();
            i();
        } else if (3 == i) {
            this.f29088v = (SpannedString) obj;
            synchronized (this) {
                this.f29115A |= 128;
            }
            a();
            i();
        } else if (4 == i) {
        } else {
            if (21 != i) {
                return false;
            }
            this.f29087u = (String) obj;
            synchronized (this) {
                this.f29115A |= 512;
            }
            a();
            i();
        }
        return true;
    }
}
