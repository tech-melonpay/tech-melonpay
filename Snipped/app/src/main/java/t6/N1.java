package t6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellTransactionBindingImpl.java */
/* loaded from: classes2.dex */
public final class N1 extends M1 {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f28212A;

    /* renamed from: B, reason: collision with root package name */
    public long f28213B;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public N1(F0.c r13, android.view.View r14) {
        /*
            r12 = this;
            r0 = 7
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r14, r0, r1)
            r2 = 1
            r2 = r0[r2]
            r6 = r2
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r2 = 4
            r2 = r0[r2]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 3
            r2 = r0[r2]
            r8 = r2
            com.google.android.material.imageview.ShapeableImageView r8 = (com.google.android.material.imageview.ShapeableImageView) r8
            r2 = 5
            r2 = r0[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = 2
            r2 = r0[r2]
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            r2 = 6
            r2 = r0[r2]
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = -1
            r12.f28213B = r2
            androidx.constraintlayout.widget.ConstraintLayout r13 = r12.f28140n
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28141o
            r13.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r13 = r12.f28142p
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28143q
            r13.setTag(r1)
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r12.f28212A = r13
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28144r
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28145s
            r13.setTag(r1)
            r12.l(r14)
            monitor-enter(r12)
            r13 = 128(0x80, double:6.3E-322)
            r12.f28213B = r13     // Catch: java.lang.Throwable -> L69
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L69
            r12.i()
            return
        L69:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L69
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.N1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        int i;
        Drawable drawable;
        int i9;
        Context context;
        int i10;
        synchronized (this) {
            j10 = this.f28213B;
            this.f28213B = 0L;
        }
        String str = this.f28146t;
        String str2 = this.f28149w;
        String str3 = this.f28148v;
        String str4 = this.f28150x;
        Boolean bool = this.f28147u;
        Integer num = this.f28151y;
        View.OnClickListener onClickListener = this.f28152z;
        long j11 = j10 & 144;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 10752L : 5376L;
            }
            i = F0.f.d(k3 ? R.color.white : R.color.outcoming_text, this.f28144r);
            i9 = k3 ? F0.f.d(R.color.main_color, this.f28145s) : F0.f.d(R.color.black, this.f28145s);
            if (k3) {
                context = this.f28140n.getContext();
                i10 = R.drawable.transaction_bg_incoming;
            } else {
                context = this.f28140n.getContext();
                i10 = R.drawable.transaction_bg_outcoming;
            }
            drawable = U4.b.j(context, i10);
        } else {
            i = 0;
            drawable = null;
            i9 = 0;
        }
        long j12 = j10 & 160;
        long j13 = j10 & 192;
        if ((j10 & 144) != 0) {
            this.f28140n.setBackground(drawable);
            this.f28144r.setTextColor(i);
            this.f28145s.setTextColor(i9);
        }
        if ((129 & j10) != 0) {
            G0.c.a(this.f28141o, str);
        }
        if (j12 != 0) {
            C8.a.d(this.f28142p, num);
        }
        if ((130 & j10) != 0) {
            G0.c.a(this.f28143q, str2);
        }
        if (j13 != 0) {
            this.f28212A.setOnClickListener(onClickListener);
        }
        if ((136 & j10) != 0) {
            G0.c.a(this.f28144r, str4);
        }
        if ((j10 & 132) != 0) {
            G0.c.a(this.f28145s, str3);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28213B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (101 == i) {
            this.f28146t = (String) obj;
            synchronized (this) {
                this.f28213B |= 1;
            }
            a();
            i();
        } else if (24 == i) {
            this.f28149w = (String) obj;
            synchronized (this) {
                this.f28213B |= 2;
            }
            a();
            i();
        } else if (3 == i) {
            this.f28148v = (String) obj;
            synchronized (this) {
                this.f28213B |= 4;
            }
            a();
            i();
        } else if (130 == i) {
            this.f28150x = (String) obj;
            synchronized (this) {
                this.f28213B |= 8;
            }
            a();
            i();
        } else if (46 == i) {
            this.f28147u = (Boolean) obj;
            synchronized (this) {
                this.f28213B |= 16;
            }
            a();
            i();
        } else if (22 == i) {
            this.f28151y = (Integer) obj;
            synchronized (this) {
                this.f28213B |= 32;
            }
            a();
            i();
        } else {
            if (105 != i) {
                return false;
            }
            this.f28152z = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28213B |= 64;
            }
            a();
            i();
        }
        return true;
    }
}
