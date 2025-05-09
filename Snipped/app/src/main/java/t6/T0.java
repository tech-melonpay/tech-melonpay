package t6;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellLoanMainBindingImpl.java */
/* loaded from: classes2.dex */
public final class T0 extends S0 {

    /* renamed from: D, reason: collision with root package name */
    public final ConstraintLayout f28497D;

    /* renamed from: E, reason: collision with root package name */
    public long f28498E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T0(F0.c r16, android.view.View r17) {
        /*
            r15 = this;
            r12 = r15
            r0 = r17
            r1 = 9
            r13 = 0
            java.lang.Object[] r14 = F0.f.h(r0, r1, r13)
            r1 = 3
            r1 = r14[r1]
            r4 = r1
            com.google.android.material.imageview.ShapeableImageView r4 = (com.google.android.material.imageview.ShapeableImageView) r4
            r1 = 8
            r1 = r14[r1]
            r5 = r1
            com.luminary.business.presentation.ui.views.ButtonSmall r5 = (com.luminary.business.presentation.ui.views.ButtonSmall) r5
            r1 = 1
            r1 = r14[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 2
            r1 = r14[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 4
            r1 = r14[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 5
            r1 = r14[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 6
            r1 = r14[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 7
            r1 = r14[r1]
            r11 = r1
            android.view.View r11 = (android.view.View) r11
            r1 = r15
            r2 = r16
            r3 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1
            r12.f28498E = r1
            com.google.android.material.imageview.ShapeableImageView r1 = r12.f28430n
            r1.setTag(r13)
            r1 = 0
            r1 = r14[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r12.f28497D = r1
            r1.setTag(r13)
            com.luminary.business.presentation.ui.views.ButtonSmall r1 = r12.f28431o
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f28432p
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f28433q
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f28434r
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f28435s
            r1.setTag(r13)
            android.widget.TextView r1 = r12.f28436t
            r1.setTag(r13)
            android.view.View r1 = r12.f28437u
            r1.setTag(r13)
            r15.l(r0)
            monitor-enter(r15)
            r0 = 256(0x100, double:1.265E-321)
            r12.f28498E = r0     // Catch: java.lang.Throwable -> L86
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L86
            r15.i()
            return
        L86:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L86
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.T0.<init>(F0.c, android.view.View):void");
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
            j10 = this.f28498E;
            this.f28498E = 0L;
        }
        String str2 = this.f28438v;
        String str3 = this.f28427A;
        Integer num = this.f28441y;
        Boolean bool = this.f28442z;
        String str4 = this.f28440x;
        String str5 = this.f28439w;
        String str6 = this.f28428B;
        View.OnClickListener onClickListener = this.f28429C;
        long j11 = j10 & 264;
        if (j11 != 0) {
            z10 = !F0.f.k(bool);
            if (j11 != 0) {
                j10 |= z10 ? 21504L : 10752L;
            }
            TextView textView = this.f28432p;
            i10 = z10 ? F0.f.d(R.color.neutral_400, textView) : F0.f.d(R.color.black, textView);
            TextView textView2 = this.f28435s;
            i = z10 ? F0.f.d(R.color.neutral_400, textView2) : F0.f.d(R.color.black, textView2);
            TextView textView3 = this.f28436t;
            i9 = z10 ? F0.f.d(R.color.neutral_400, textView3) : F0.f.d(R.color.black, textView3);
        } else {
            z10 = false;
            i = 0;
            i9 = 0;
            i10 = 0;
        }
        long j12 = j10 & 272;
        long j13 = j10 & 288;
        long j14 = j10 & 320;
        long j15 = j10 & 384;
        if ((j10 & 260) != 0) {
            str = str6;
            C8.a.d(this.f28430n, num);
        } else {
            str = str6;
        }
        if (j15 != 0) {
            this.f28497D.setOnClickListener(onClickListener);
            this.f28431o.setOnClickListener(onClickListener);
        }
        if ((257 & j10) != 0) {
            G0.c.a(this.f28432p, str2);
        }
        if ((264 & j10) != 0) {
            this.f28432p.setTextColor(i10);
            this.f28435s.setTextColor(i);
            this.f28436t.setTextColor(i9);
            C8.a.b(this.f28437u, z10);
        }
        if (j12 != 0) {
            G0.c.a(this.f28433q, str4);
        }
        if (j13 != 0) {
            G0.c.a(this.f28434r, str5);
        }
        if ((j10 & 258) != 0) {
            G0.c.a(this.f28435s, str3);
        }
        if (j14 != 0) {
            G0.c.a(this.f28436t, str);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28498E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (101 == i) {
            this.f28438v = (String) obj;
            synchronized (this) {
                this.f28498E |= 1;
            }
            a();
            i();
        } else if (3 == i) {
            this.f28427A = (String) obj;
            synchronized (this) {
                this.f28498E |= 2;
            }
            a();
            i();
        } else if (144 == i) {
            this.f28441y = (Integer) obj;
            synchronized (this) {
                this.f28498E |= 4;
            }
            a();
            i();
        } else if (49 == i) {
            this.f28442z = (Boolean) obj;
            synchronized (this) {
                this.f28498E |= 8;
            }
            a();
            i();
        } else if (145 == i) {
            this.f28440x = (String) obj;
            synchronized (this) {
                this.f28498E |= 16;
            }
            a();
            i();
        } else if (99 == i) {
            this.f28439w = (String) obj;
            synchronized (this) {
                this.f28498E |= 32;
            }
            a();
            i();
        } else if (4 == i) {
            this.f28428B = (String) obj;
            synchronized (this) {
                this.f28498E |= 64;
            }
            a();
            i();
        } else {
            if (105 != i) {
                return false;
            }
            this.f28429C = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28498E |= 128;
            }
            a();
            i();
        }
        return true;
    }
}
