package t6;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellLoanHistoryBindingImpl.java */
/* loaded from: classes2.dex */
public final class R0 extends Q0 {

    /* renamed from: C, reason: collision with root package name */
    public final ConstraintLayout f28402C;

    /* renamed from: D, reason: collision with root package name */
    public long f28403D;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public R0(F0.c r14, android.view.View r15) {
        /*
            r13 = this;
            r0 = 8
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r15, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r6 = r2
            com.google.android.material.imageview.ShapeableImageView r6 = (com.google.android.material.imageview.ShapeableImageView) r6
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = 4
            r2 = r0[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = 5
            r2 = r0[r2]
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            r2 = 6
            r2 = r0[r2]
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            r2 = 7
            r2 = r0[r2]
            r12 = r2
            android.view.View r12 = (android.view.View) r12
            r3 = r13
            r4 = r14
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = -1
            r13.f28403D = r2
            com.google.android.material.imageview.ShapeableImageView r14 = r13.f28348n
            r14.setTag(r1)
            r14 = 0
            r14 = r0[r14]
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r13.f28402C = r14
            r14.setTag(r1)
            android.widget.TextView r14 = r13.f28349o
            r14.setTag(r1)
            android.widget.TextView r14 = r13.f28350p
            r14.setTag(r1)
            android.widget.TextView r14 = r13.f28351q
            r14.setTag(r1)
            android.widget.TextView r14 = r13.f28352r
            r14.setTag(r1)
            android.widget.TextView r14 = r13.f28353s
            r14.setTag(r1)
            android.view.View r14 = r13.f28354t
            r14.setTag(r1)
            r13.l(r15)
            monitor-enter(r13)
            r14 = 256(0x100, double:1.265E-321)
            r13.f28403D = r14     // Catch: java.lang.Throwable -> L75
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L75
            r13.i()
            return
        L75:
            r14 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L75
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.R0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        boolean z10;
        int i;
        int i9;
        int i10;
        String str;
        synchronized (this) {
            j10 = this.f28403D;
            this.f28403D = 0L;
        }
        String str2 = this.f28355u;
        String str3 = this.f28360z;
        Integer num = this.f28358x;
        Boolean bool = this.f28359y;
        String str4 = this.f28357w;
        String str5 = this.f28356v;
        String str6 = this.f28346A;
        View.OnClickListener onClickListener = this.f28347B;
        long j11 = j10 & 264;
        if (j11 != 0) {
            z10 = !F0.f.k(bool);
            if (j11 != 0) {
                j10 |= z10 ? 21504L : 10752L;
            }
            TextView textView = this.f28349o;
            i10 = z10 ? F0.f.d(R.color.neutral_400, textView) : F0.f.d(R.color.black, textView);
            TextView textView2 = this.f28352r;
            i = z10 ? F0.f.d(R.color.neutral_400, textView2) : F0.f.d(R.color.main_color, textView2);
            TextView textView3 = this.f28353s;
            i9 = z10 ? F0.f.d(R.color.neutral_400, textView3) : F0.f.d(R.color.main_color, textView3);
        } else {
            z10 = false;
            i = 0;
            i9 = 0;
            i10 = 0;
        }
        long j12 = 272 & j10;
        long j13 = j10 & 288;
        long j14 = j10 & 320;
        long j15 = j10 & 384;
        if ((j10 & 260) != 0) {
            str = str6;
            C8.a.d(this.f28348n, num);
        } else {
            str = str6;
        }
        if (j15 != 0) {
            this.f28402C.setOnClickListener(onClickListener);
        }
        if ((257 & j10) != 0) {
            G0.c.a(this.f28349o, str2);
        }
        if ((264 & j10) != 0) {
            this.f28349o.setTextColor(i10);
            this.f28352r.setTextColor(i);
            this.f28353s.setTextColor(i9);
            C8.a.b(this.f28354t, z10);
        }
        if (j13 != 0) {
            G0.c.a(this.f28350p, str5);
        }
        if (j12 != 0) {
            G0.c.a(this.f28351q, str4);
        }
        if ((j10 & 258) != 0) {
            G0.c.a(this.f28352r, str3);
        }
        if (j14 != 0) {
            G0.c.a(this.f28353s, str);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28403D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (101 == i) {
            this.f28355u = (String) obj;
            synchronized (this) {
                this.f28403D |= 1;
            }
            a();
            i();
        } else if (3 == i) {
            this.f28360z = (String) obj;
            synchronized (this) {
                this.f28403D |= 2;
            }
            a();
            i();
        } else if (144 == i) {
            this.f28358x = (Integer) obj;
            synchronized (this) {
                this.f28403D |= 4;
            }
            a();
            i();
        } else if (49 == i) {
            this.f28359y = (Boolean) obj;
            synchronized (this) {
                this.f28403D |= 8;
            }
            a();
            i();
        } else if (145 == i) {
            this.f28357w = (String) obj;
            synchronized (this) {
                this.f28403D |= 16;
            }
            a();
            i();
        } else if (99 == i) {
            this.f28356v = (String) obj;
            synchronized (this) {
                this.f28403D |= 32;
            }
            a();
            i();
        } else if (4 == i) {
            this.f28346A = (String) obj;
            synchronized (this) {
                this.f28403D |= 64;
            }
            a();
            i();
        } else {
            if (105 != i) {
                return false;
            }
            this.f28347B = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28403D |= 128;
            }
            a();
            i();
        }
        return true;
    }
}
