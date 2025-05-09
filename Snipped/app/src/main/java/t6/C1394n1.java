package t6;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellPersonalDataBindingImpl.java */
/* renamed from: t6.n1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1394n1 extends AbstractC1386m1 {

    /* renamed from: J, reason: collision with root package name */
    public static final SparseIntArray f29334J;

    /* renamed from: H, reason: collision with root package name */
    public final ConstraintLayout f29335H;

    /* renamed from: I, reason: collision with root package name */
    public long f29336I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29334J = sparseIntArray;
        sparseIntArray.put(R.id.edit_button, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1394n1(F0.c r16, android.view.View r17) {
        /*
            r15 = this;
            r13 = r15
            r0 = r17
            android.util.SparseIntArray r1 = t6.C1394n1.f29334J
            r2 = 11
            java.lang.Object[] r14 = F0.f.h(r0, r2, r1)
            r1 = 10
            r1 = r14[r1]
            android.widget.Button r1 = (android.widget.Button) r1
            r1 = 1
            r1 = r14[r1]
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1 = 2
            r1 = r14[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 4
            r1 = r14[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 6
            r1 = r14[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 8
            r1 = r14[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 3
            r1 = r14[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 5
            r1 = r14[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 7
            r1 = r14[r1]
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 9
            r1 = r14[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r1 = r15
            r2 = r16
            r3 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.f29336I = r1
            android.widget.TextView r1 = r13.f29295n
            r2 = 0
            r1.setTag(r2)
            android.widget.TextView r1 = r13.f29296o
            r1.setTag(r2)
            android.widget.TextView r1 = r13.f29297p
            r1.setTag(r2)
            android.widget.TextView r1 = r13.f29298q
            r1.setTag(r2)
            android.widget.TextView r1 = r13.f29299r
            r1.setTag(r2)
            r1 = 0
            r1 = r14[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r13.f29335H = r1
            r1.setTag(r2)
            android.widget.TextView r1 = r13.f29300s
            r1.setTag(r2)
            android.widget.TextView r1 = r13.f29301t
            r1.setTag(r2)
            android.widget.TextView r1 = r13.f29302u
            r1.setTag(r2)
            android.widget.TextView r1 = r13.f29303v
            r1.setTag(r2)
            r15.l(r0)
            monitor-enter(r15)
            r0 = 2048(0x800, double:1.012E-320)
            r13.f29336I = r0     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L9a
            r15.i()
            return
        L9a:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L9a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1394n1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        Drawable drawable;
        String str;
        synchronized (this) {
            j10 = this.f29336I;
            this.f29336I = 0L;
        }
        String str2 = this.f29289B;
        Boolean bool = this.f29293F;
        String str3 = this.f29288A;
        String str4 = this.f29292E;
        String str5 = this.f29304w;
        View.OnLongClickListener onLongClickListener = this.f29294G;
        String str6 = this.f29307z;
        String str7 = this.f29291D;
        String str8 = this.f29290C;
        String str9 = this.f29305x;
        String str10 = this.f29306y;
        long j11 = j10 & 2050;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 8192L : 4096L;
            }
            drawable = k3 ? U4.b.j(this.f29335H.getContext(), R.drawable.cell_bg_interactive) : U4.b.j(this.f29335H.getContext(), R.drawable.cell_bg_full_inactive_16);
        } else {
            drawable = null;
        }
        long j12 = 2052 & j10;
        long j13 = j10 & 2056;
        long j14 = j10 & 2080;
        long j15 = j10 & 2112;
        long j16 = j10 & 2176;
        long j17 = j10 & 2304;
        long j18 = j10 & 2560;
        long j19 = j10 & 3072;
        if ((j10 & 2064) != 0) {
            str = str4;
            G0.c.a(this.f29295n, str5);
        } else {
            str = str4;
        }
        if (j18 != 0) {
            G0.c.a(this.f29296o, str9);
        }
        if (j15 != 0) {
            G0.c.a(this.f29297p, str6);
        }
        if ((2049 & j10) != 0) {
            G0.c.a(this.f29298q, str2);
        }
        if (j16 != 0) {
            G0.c.a(this.f29299r, str7);
        }
        if ((j10 & 2050) != 0) {
            this.f29335H.setBackground(drawable);
        }
        if (j14 != 0) {
            this.f29300s.setOnLongClickListener(onLongClickListener);
            this.f29301t.setOnLongClickListener(onLongClickListener);
            this.f29302u.setOnLongClickListener(onLongClickListener);
            this.f29303v.setOnLongClickListener(onLongClickListener);
        }
        if (j19 != 0) {
            G0.c.a(this.f29300s, str10);
        }
        if (j12 != 0) {
            G0.c.a(this.f29301t, str3);
        }
        if (j17 != 0) {
            G0.c.a(this.f29302u, str8);
        }
        if (j13 != 0) {
            G0.c.a(this.f29303v, str);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29336I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (87 == i) {
            this.f29289B = (String) obj;
            synchronized (this) {
                this.f29336I |= 1;
            }
            a();
            i();
        } else if (56 == i) {
            this.f29293F = (Boolean) obj;
            synchronized (this) {
                this.f29336I |= 2;
            }
            a();
            i();
        } else if (156 == i) {
            this.f29288A = (String) obj;
            synchronized (this) {
                this.f29336I |= 4;
            }
            a();
            i();
        } else if (158 == i) {
            this.f29292E = (String) obj;
            synchronized (this) {
                this.f29336I |= 8;
            }
            a();
            i();
        } else if (39 == i) {
            this.f29304w = (String) obj;
            synchronized (this) {
                this.f29336I |= 16;
            }
            a();
            i();
        } else if (107 == i) {
            this.f29294G = (View.OnLongClickListener) obj;
            synchronized (this) {
                this.f29336I |= 32;
            }
            a();
            i();
        } else if (86 == i) {
            this.f29307z = (String) obj;
            synchronized (this) {
                this.f29336I |= 64;
            }
            a();
            i();
        } else if (88 == i) {
            this.f29291D = (String) obj;
            synchronized (this) {
                this.f29336I |= 128;
            }
            a();
            i();
        } else if (157 == i) {
            this.f29290C = (String) obj;
            synchronized (this) {
                this.f29336I |= 256;
            }
            a();
            i();
        } else if (84 == i) {
            this.f29305x = (String) obj;
            synchronized (this) {
                this.f29336I |= 512;
            }
            a();
            i();
        } else {
            if (154 != i) {
                return false;
            }
            this.f29306y = (String) obj;
            synchronized (this) {
                this.f29336I |= 1024;
            }
            a();
            i();
        }
        return true;
    }
}
