package t6;

import android.util.SparseIntArray;
import android.view.View;
import com.luminary.mobile.R;

/* compiled from: CellSettingsAccountBusinessBindingImpl.java */
/* renamed from: t6.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1475y1 extends AbstractC1468x1 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f29840z;

    /* renamed from: y, reason: collision with root package name */
    public long f29841y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29840z = sparseIntArray;
        sparseIntArray.put(R.id.constraintLayout, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1475y1(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.C1475y1.f29840z
            r1 = 7
            java.lang.Object[] r0 = F0.f.h(r12, r1, r0)
            r1 = 6
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 3
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 4
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 2
            r1 = r0[r1]
            r9 = r1
            com.google.android.material.imageview.ShapeableImageView r9 = (com.google.android.material.imageview.ShapeableImageView) r9
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.f29841y = r1
            android.widget.ImageView r11 = r10.f29776n
            r1 = 0
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29777o
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29778p
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29779q
            r11.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r11 = r10.f29780r
            r11.setTag(r1)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 128(0x80, double:6.3E-322)
            r10.f29841y = r11     // Catch: java.lang.Throwable -> L63
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L63
            r10.i()
            return
        L63:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L63
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1475y1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f29841y;
            this.f29841y = 0L;
        }
        String str = this.f29783u;
        String str2 = this.f29781s;
        Boolean bool = this.f29785w;
        View.OnClickListener onClickListener = this.f29786x;
        String str3 = this.f29782t;
        String str4 = this.f29784v;
        long j11 = 129 & j10;
        long j12 = 130 & j10;
        long j13 = 132 & j10;
        boolean k3 = j13 != 0 ? F0.f.k(bool) : false;
        long j14 = 144 & j10;
        long j15 = 160 & j10;
        long j16 = j10 & 192;
        if (j14 != 0) {
            this.f29776n.setOnClickListener(onClickListener);
        }
        if (j12 != 0) {
            G0.c.a(this.f29777o, str2);
        }
        if (j15 != 0) {
            G0.c.a(this.f29778p, str3);
        }
        if (j11 != 0) {
            G0.c.a(this.f29779q, str);
        }
        if (j13 != 0) {
            C8.a.b(this.f29780r, k3);
        }
        if (j16 != 0) {
            C8.a.e(this.f29780r, str4);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29841y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (16 == i) {
            this.f29783u = (String) obj;
            synchronized (this) {
                this.f29841y |= 1;
            }
            a();
            i();
        } else if (101 == i) {
            this.f29781s = (String) obj;
            synchronized (this) {
                this.f29841y |= 2;
            }
            a();
            i();
        } else if (68 == i) {
            this.f29785w = (Boolean) obj;
            synchronized (this) {
                this.f29841y |= 4;
            }
            a();
            i();
        } else if (128 == i) {
        } else if (103 == i) {
            this.f29786x = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29841y |= 16;
            }
            a();
            i();
        } else if (131 == i) {
            this.f29782t = (String) obj;
            synchronized (this) {
                this.f29841y |= 32;
            }
            a();
            i();
        } else {
            if (127 != i) {
                return false;
            }
            this.f29784v = (String) obj;
            synchronized (this) {
                this.f29841y |= 64;
            }
            a();
            i();
        }
        return true;
    }
}
