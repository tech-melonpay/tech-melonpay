package t6;

import android.text.SpannedString;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellExchangeCryptoNewItemBindingImpl.java */
/* renamed from: t6.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1377l0 extends AbstractC1369k0 {

    /* renamed from: G, reason: collision with root package name */
    public static final SparseIntArray f29221G;

    /* renamed from: E, reason: collision with root package name */
    public final ConstraintLayout f29222E;

    /* renamed from: F, reason: collision with root package name */
    public long f29223F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29221G = sparseIntArray;
        sparseIntArray.put(R.id.icon_small, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1377l0(F0.c r14, android.view.View r15) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = t6.C1377l0.f29221G
            r1 = 11
            java.lang.Object[] r0 = F0.f.h(r15, r1, r0)
            r1 = 3
            r1 = r0[r1]
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1 = 9
            r1 = r0[r1]
            r6 = r1
            com.luminary.business.presentation.ui.views.ButtonSmall r6 = (com.luminary.business.presentation.ui.views.ButtonSmall) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 10
            r1 = r0[r1]
            com.google.android.material.imageview.ShapeableImageView r1 = (com.google.android.material.imageview.ShapeableImageView) r1
            r1 = 5
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 7
            r1 = r0[r1]
            r9 = r1
            com.luminary.business.presentation.ui.views.ButtonSmall r9 = (com.luminary.business.presentation.ui.views.ButtonSmall) r9
            r1 = 4
            r1 = r0[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 8
            r1 = r0[r1]
            r11 = r1
            com.luminary.business.presentation.ui.views.ButtonSmall r11 = (com.luminary.business.presentation.ui.views.ButtonSmall) r11
            r1 = 6
            r1 = r0[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.f29223F = r1
            android.widget.TextView r14 = r13.f29167n
            r1 = 0
            r14.setTag(r1)
            com.luminary.business.presentation.ui.views.ButtonSmall r14 = r13.f29168o
            r14.setTag(r1)
            android.widget.ImageView r14 = r13.f29169p
            r14.setTag(r1)
            android.widget.TextView r14 = r13.f29170q
            r14.setTag(r1)
            com.luminary.business.presentation.ui.views.ButtonSmall r14 = r13.f29171r
            r14.setTag(r1)
            r14 = 0
            r14 = r0[r14]
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r14.setTag(r1)
            r14 = 2
            r14 = r0[r14]
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r13.f29222E = r14
            r14.setTag(r1)
            android.widget.TextView r14 = r13.f29172s
            r14.setTag(r1)
            com.luminary.business.presentation.ui.views.ButtonSmall r14 = r13.f29173t
            r14.setTag(r1)
            android.widget.TextView r14 = r13.f29174u
            r14.setTag(r1)
            r13.l(r15)
            monitor-enter(r13)
            r14 = 2048(0x800, double:1.012E-320)
            r13.f29223F = r14     // Catch: java.lang.Throwable -> L92
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L92
            r13.i()
            return
        L92:
            r14 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L92
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1377l0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        int i;
        TextView textView;
        int i9;
        synchronized (this) {
            j10 = this.f29223F;
            this.f29223F = 0L;
        }
        Integer num = this.f29178y;
        Boolean bool = this.f29179z;
        View.OnClickListener onClickListener = this.f29165C;
        String str = this.f29175v;
        SpannedString spannedString = this.f29177x;
        Boolean bool2 = this.f29166D;
        View.OnClickListener onClickListener2 = this.f29164B;
        View.OnClickListener onClickListener3 = this.f29163A;
        String str2 = this.f29176w;
        long j11 = j10 & 2052;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 8192L : 4096L;
            }
            if (k3) {
                textView = this.f29172s;
                i9 = R.color.black;
            } else {
                textView = this.f29172s;
                i9 = R.color.text_disable;
            }
            i = F0.f.d(i9, textView);
        } else {
            i = 0;
        }
        long j12 = 2056 & j10;
        long j13 = j10 & 2064;
        long j14 = j10 & 2112;
        long j15 = j10 & 2176;
        long j16 = j10 & 2560;
        long j17 = j10 & 3072;
        if ((j10 & 2080) != 0) {
            G0.c.a(this.f29167n, spannedString);
        }
        if (j12 != 0) {
            this.f29168o.setOnClickListener(onClickListener);
        }
        if ((2049 & j10) != 0) {
            C8.a.d(this.f29169p, num);
        }
        if (j17 != 0) {
            G0.c.a(this.f29170q, str2);
        }
        if (j16 != 0) {
            this.f29171r.setOnClickListener(onClickListener3);
        }
        if (j14 != 0) {
            C8.a.j(this.f29222E, bool2);
            C8.a.j(this.f29174u, bool2);
        }
        if (j13 != 0) {
            G0.c.a(this.f29172s, str);
        }
        if ((j10 & 2052) != 0) {
            this.f29172s.setTextColor(i);
        }
        if (j15 != 0) {
            this.f29173t.setOnClickListener(onClickListener2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29223F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (44 == i) {
            this.f29178y = (Integer) obj;
            synchronized (this) {
                this.f29223F |= 1;
            }
            a();
            i();
        } else if (7 == i) {
        } else if (56 == i) {
            this.f29179z = (Boolean) obj;
            synchronized (this) {
                this.f29223F |= 4;
            }
            a();
            i();
        } else if (109 == i) {
            this.f29165C = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29223F |= 8;
            }
            a();
            i();
        } else if (101 == i) {
            this.f29175v = (String) obj;
            synchronized (this) {
                this.f29223F |= 16;
            }
            a();
            i();
        } else if (3 == i) {
            this.f29177x = (SpannedString) obj;
            synchronized (this) {
                this.f29223F |= 32;
            }
            a();
            i();
        } else if (59 == i) {
            this.f29166D = (Boolean) obj;
            synchronized (this) {
                this.f29223F |= 64;
            }
            a();
            i();
        } else if (115 == i) {
            this.f29164B = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29223F |= 128;
            }
            a();
            i();
        } else if (70 == i) {
        } else if (112 == i) {
            this.f29163A = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29223F |= 512;
            }
            a();
            i();
        } else {
            if (21 != i) {
                return false;
            }
            this.f29176w = (String) obj;
            synchronized (this) {
                this.f29223F |= 1024;
            }
            a();
            i();
        }
        return true;
    }
}
