package t6;

import android.util.SparseIntArray;
import android.view.View;
import com.luminary.mobile.R;

/* compiled from: CellSettingsAccountBindingImpl.java */
/* renamed from: t6.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1461w1 extends AbstractC1454v1 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f29731z;

    /* renamed from: y, reason: collision with root package name */
    public long f29732y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29731z = sparseIntArray;
        sparseIntArray.put(R.id.constraintLayout, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1461w1(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.C1461w1.f29731z
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
            r10.f29732y = r1
            android.widget.ImageView r11 = r10.f29702n
            r1 = 0
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29703o
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29704p
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29705q
            r11.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r11 = r10.f29706r
            r11.setTag(r1)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 128(0x80, double:6.3E-322)
            r10.f29732y = r11     // Catch: java.lang.Throwable -> L63
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L63
            r10.i()
            return
        L63:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L63
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1461w1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f29732y;
            this.f29732y = 0L;
        }
        String str = this.f29709u;
        String str2 = this.f29707s;
        Boolean bool = this.f29711w;
        View.OnClickListener onClickListener = this.f29712x;
        String str3 = this.f29708t;
        String str4 = this.f29710v;
        long j11 = 129 & j10;
        long j12 = 130 & j10;
        long j13 = 132 & j10;
        boolean k3 = j13 != 0 ? F0.f.k(bool) : false;
        long j14 = 144 & j10;
        long j15 = 160 & j10;
        long j16 = j10 & 192;
        if (j14 != 0) {
            this.f29702n.setOnClickListener(onClickListener);
        }
        if (j12 != 0) {
            G0.c.a(this.f29703o, str2);
        }
        if (j15 != 0) {
            G0.c.a(this.f29704p, str3);
        }
        if (j11 != 0) {
            G0.c.a(this.f29705q, str);
        }
        if (j13 != 0) {
            C8.a.b(this.f29706r, k3);
        }
        if (j16 != 0) {
            C8.a.e(this.f29706r, str4);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29732y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (16 == i) {
            this.f29709u = (String) obj;
            synchronized (this) {
                this.f29732y |= 1;
            }
            a();
            i();
        } else if (101 == i) {
            this.f29707s = (String) obj;
            synchronized (this) {
                this.f29732y |= 2;
            }
            a();
            i();
        } else if (68 == i) {
            this.f29711w = (Boolean) obj;
            synchronized (this) {
                this.f29732y |= 4;
            }
            a();
            i();
        } else if (128 == i) {
        } else if (103 == i) {
            this.f29712x = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29732y |= 16;
            }
            a();
            i();
        } else if (131 == i) {
            this.f29708t = (String) obj;
            synchronized (this) {
                this.f29732y |= 32;
            }
            a();
            i();
        } else {
            if (127 != i) {
                return false;
            }
            this.f29710v = (String) obj;
            synchronized (this) {
                this.f29732y |= 64;
            }
            a();
            i();
        }
        return true;
    }
}
