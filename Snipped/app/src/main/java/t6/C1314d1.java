package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: CellNewPaymentSmallBindingImpl.java */
/* renamed from: t6.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1314d1 extends AbstractC1306c1 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f28917y;

    /* renamed from: x, reason: collision with root package name */
    public long f28918x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f28917y = sparseIntArray;
        sparseIntArray.put(R.id.circle_view, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1314d1(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.C1314d1.f28917y
            r1 = 7
            java.lang.Object[] r0 = F0.f.h(r12, r1, r0)
            r1 = 3
            r1 = r0[r1]
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1 = 4
            r1 = r0[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 6
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 2
            r1 = r0[r1]
            r8 = r1
            com.google.android.material.imageview.ShapeableImageView r8 = (com.google.android.material.imageview.ShapeableImageView) r8
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
            r10.f28918x = r1
            android.widget.TextView r11 = r10.f28849n
            r1 = 0
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f28850o
            r11.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r11 = r10.f28851p
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f28852q
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f28853r
            r11.setTag(r1)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 32
            r10.f28918x = r11     // Catch: java.lang.Throwable -> L63
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L63
            r10.i()
            return
        L63:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L63
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1314d1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28918x;
            this.f28918x = 0L;
        }
        String str = this.f28855t;
        Integer num = this.f28858w;
        String str2 = this.f28856u;
        String str3 = this.f28857v;
        String str4 = this.f28854s;
        long j11 = 33 & j10;
        long j12 = 34 & j10;
        long j13 = 36 & j10;
        long j14 = 40 & j10;
        long j15 = j10 & 48;
        if (j11 != 0) {
            G0.c.a(this.f28849n, str);
        }
        if (j13 != 0) {
            G0.c.a(this.f28850o, str2);
        }
        if (j12 != 0) {
            C8.a.d(this.f28851p, num);
        }
        if (j15 != 0) {
            G0.c.a(this.f28852q, str4);
        }
        if (j14 != 0) {
            G0.c.a(this.f28853r, str3);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28918x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (3 == i) {
            this.f28855t = (String) obj;
            synchronized (this) {
                this.f28918x |= 1;
            }
            a();
            i();
        } else if (22 == i) {
            this.f28858w = (Integer) obj;
            synchronized (this) {
                this.f28918x |= 2;
            }
            a();
            i();
        } else if (4 == i) {
            this.f28856u = (String) obj;
            synchronized (this) {
                this.f28918x |= 4;
            }
            a();
            i();
        } else if (130 == i) {
            this.f28857v = (String) obj;
            synchronized (this) {
                this.f28918x |= 8;
            }
            a();
            i();
        } else {
            if (101 != i) {
                return false;
            }
            this.f28854s = (String) obj;
            synchronized (this) {
                this.f28918x |= 16;
            }
            a();
            i();
        }
        return true;
    }
}
