package t6;

import android.graphics.drawable.Drawable;
import android.text.SpannedString;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellTransactionTopBindingImpl.java */
/* loaded from: classes2.dex */
public final class V1 extends U1 {

    /* renamed from: H, reason: collision with root package name */
    public static final SparseIntArray f28585H;

    /* renamed from: E, reason: collision with root package name */
    public final ConstraintLayout f28586E;

    /* renamed from: F, reason: collision with root package name */
    public final ConstraintLayout f28587F;

    /* renamed from: G, reason: collision with root package name */
    public long f28588G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28585H = sparseIntArray;
        sparseIntArray.put(R.id.status_layout, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V1(F0.c r13, android.view.View r14) {
        /*
            r12 = this;
            android.util.SparseIntArray r0 = t6.V1.f28585H
            r1 = 10
            java.lang.Object[] r0 = F0.f.h(r14, r1, r0)
            r1 = 4
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 9
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 6
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 7
            r1 = r0[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 8
            r1 = r0[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1
            r12.f28588G = r1
            android.widget.ImageView r13 = r12.f28533n
            r1 = 0
            r13.setTag(r1)
            android.widget.ImageView r13 = r12.f28534o
            r13.setTag(r1)
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r12.f28586E = r13
            r13.setTag(r1)
            r13 = 3
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r12.f28587F = r13
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28535p
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28536q
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28537r
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28538s
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f28539t
            r13.setTag(r1)
            r12.l(r14)
            monitor-enter(r12)
            r13 = 8192(0x2000, double:4.0474E-320)
            r12.f28588G = r13     // Catch: java.lang.Throwable -> L88
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L88
            r12.i()
            return
        L88:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L88
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.V1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        boolean z10;
        Drawable drawable;
        synchronized (this) {
            j10 = this.f28588G;
            this.f28588G = 0L;
        }
        String str = this.f28540u;
        SpannedString spannedString = this.f28545z;
        String str2 = this.f28529A;
        SpannedString spannedString2 = this.f28544y;
        String str3 = this.f28530B;
        Boolean bool = this.f28543x;
        Integer num = this.f28531C;
        Boolean bool2 = this.f28541v;
        Boolean bool3 = this.f28542w;
        View.OnClickListener onClickListener = this.f28532D;
        long j11 = j10 & 8832;
        if (j11 != 0) {
            z10 = F0.f.k(bool);
            if (j11 != 0) {
                j10 = z10 ? j10 | 131072 : j10 | 65536;
            }
        } else {
            z10 = false;
        }
        boolean k3 = (j10 & 9216) != 0 ? F0.f.k(bool3) : false;
        long j12 = j10 & 65536;
        Drawable drawable2 = null;
        if (j12 != 0) {
            boolean k10 = F0.f.k(bool2);
            if (j12 != 0) {
                j10 |= k10 ? 32768L : 16384L;
            }
            drawable = k10 ? U4.b.j(this.f28587F.getContext(), R.drawable.transaction_bg_incoming) : U4.b.j(this.f28587F.getContext(), R.drawable.transaction_bg_out);
        } else {
            drawable = null;
        }
        long j13 = 8832 & j10;
        if (j13 != 0) {
            if (z10) {
                drawable = U4.b.j(this.f28587F.getContext(), R.drawable.transaction_bg_decline);
            }
            drawable2 = drawable;
        }
        Drawable drawable3 = drawable2;
        if ((8448 & j10) != 0) {
            C8.a.d(this.f28533n, num);
            C8.a.d(this.f28534o, num);
        }
        if ((10240 & j10) != 0) {
            this.f28586E.setOnClickListener(onClickListener);
        }
        if (j13 != 0) {
            this.f28587F.setBackground(drawable3);
        }
        if ((8256 & j10) != 0) {
            G0.c.a(this.f28535p, str3);
        }
        if ((8193 & j10) != 0) {
            G0.c.a(this.f28536q, str);
        }
        if ((8208 & j10) != 0) {
            G0.c.a(this.f28537r, str2);
        }
        if ((8196 & j10) != 0) {
            G0.c.a(this.f28538s, spannedString);
        }
        if ((8224 & j10) != 0) {
            G0.c.a(this.f28539t, spannedString2);
        }
        if ((j10 & 9216) != 0) {
            C8.a.b(this.f28539t, k3);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28588G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (100 == i) {
            this.f28540u = (String) obj;
            synchronized (this) {
                this.f28588G |= 1;
            }
            a();
            i();
        } else if (134 == i) {
        } else if (29 == i) {
            this.f28545z = (SpannedString) obj;
            synchronized (this) {
                this.f28588G |= 4;
            }
            a();
            i();
        } else if (101 == i) {
        } else if (24 == i) {
            this.f28529A = (String) obj;
            synchronized (this) {
                this.f28588G |= 16;
            }
            a();
            i();
        } else if (140 == i) {
            this.f28544y = (SpannedString) obj;
            synchronized (this) {
                this.f28588G |= 32;
            }
            a();
            i();
        } else if (130 == i) {
            this.f28530B = (String) obj;
            synchronized (this) {
                this.f28588G |= 64;
            }
            a();
            i();
        } else if (54 == i) {
            this.f28543x = (Boolean) obj;
            synchronized (this) {
                this.f28588G |= 128;
            }
            a();
            i();
        } else if (165 == i) {
            this.f28531C = (Integer) obj;
            synchronized (this) {
                this.f28588G |= 256;
            }
            a();
            i();
        } else if (46 == i) {
            this.f28541v = (Boolean) obj;
            synchronized (this) {
                this.f28588G |= 512;
            }
            a();
            i();
        } else if (132 == i) {
            this.f28542w = (Boolean) obj;
            synchronized (this) {
                this.f28588G |= 1024;
            }
            a();
            i();
        } else if (105 == i) {
            this.f28532D = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28588G |= 2048;
            }
            a();
            i();
        } else {
            if (133 != i) {
                return false;
            }
        }
        return true;
    }
}
