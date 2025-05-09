package t6;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellPaymentSavedBindingImpl.java */
/* renamed from: t6.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1370k1 extends AbstractC1362j1 {

    /* renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f29180A;

    /* renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f29181y;

    /* renamed from: z, reason: collision with root package name */
    public long f29182z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29180A = sparseIntArray;
        sparseIntArray.put(R.id.constraintLayout, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1370k1(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.C1370k1.f29180A
            r1 = 8
            java.lang.Object[] r0 = F0.f.h(r12, r1, r0)
            r1 = 7
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.imageview.ShapeableImageView r8 = (com.google.android.material.imageview.ShapeableImageView) r8
            r1 = 3
            r1 = r0[r1]
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1 = 6
            r1 = r0[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 5
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = r10
            r3 = r12
            r9 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.f29182z = r1
            com.google.android.material.imageview.ShapeableImageView r11 = r10.f29116n
            r1 = 0
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r11.setTag(r1)
            r11 = 2
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r10.f29181y = r11
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29117o
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29118p
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29119q
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29120r
            r11.setTag(r1)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 512(0x200, double:2.53E-321)
            r10.f29182z = r11     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6e
            r10.i()
            return
        L6e:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6e
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1370k1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f29182z;
            this.f29182z = 0L;
        }
        Boolean bool = this.f29126x;
        String str = this.f29121s;
        String str2 = this.f29122t;
        Integer num = this.f29124v;
        View.OnClickListener onClickListener = this.f29125w;
        String str3 = this.f29123u;
        long j11 = 514 & j10;
        long j12 = 516 & j10;
        long j13 = 528 & j10;
        long j14 = 576 & j10;
        long j15 = 640 & j10;
        long j16 = j10 & 768;
        if (j14 != 0) {
            C8.a.d(this.f29116n, num);
        }
        if (j15 != 0) {
            this.f29181y.setOnClickListener(onClickListener);
        }
        if (j16 != 0) {
            G0.c.a(this.f29117o, str3);
        }
        if (j13 != 0) {
            G0.c.a(this.f29118p, str2);
        }
        if (j12 != 0) {
            G0.c.a(this.f29119q, str);
        }
        if (j11 != 0) {
            C8.a.j(this.f29120r, bool);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29182z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (66 == i) {
        } else if (57 == i) {
            this.f29126x = (Boolean) obj;
            synchronized (this) {
                this.f29182z |= 2;
            }
            a();
            i();
        } else if (101 == i) {
            this.f29121s = (String) obj;
            synchronized (this) {
                this.f29182z |= 4;
            }
            a();
            i();
        } else if (46 == i) {
        } else if (24 == i) {
            this.f29122t = (String) obj;
            synchronized (this) {
                this.f29182z |= 16;
            }
            a();
            i();
        } else if (3 == i) {
        } else if (22 == i) {
            this.f29124v = (Integer) obj;
            synchronized (this) {
                this.f29182z |= 64;
            }
            a();
            i();
        } else if (105 == i) {
            this.f29125w = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29182z |= 128;
            }
            a();
            i();
        } else {
            if (130 != i) {
                return false;
            }
            this.f29123u = (String) obj;
            synchronized (this) {
                this.f29182z |= 256;
            }
            a();
            i();
        }
        return true;
    }
}
