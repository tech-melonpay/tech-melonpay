package t6;

import android.text.SpannedString;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellAccountHorisontalBindingImpl.java */
/* renamed from: t6.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1438t extends AbstractC1431s {

    /* renamed from: A, reason: collision with root package name */
    public final ConstraintLayout f29595A;

    /* renamed from: B, reason: collision with root package name */
    public long f29596B;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1438t(F0.c r13, android.view.View r14) {
        /*
            r12 = this;
            r0 = 7
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r14, r0, r1)
            r2 = 2
            r2 = r0[r2]
            r6 = r2
            com.google.android.material.imageview.ShapeableImageView r6 = (com.google.android.material.imageview.ShapeableImageView) r6
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            r2 = 5
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = 4
            r2 = r0[r2]
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            r2 = 3
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
            r12.f29596B = r2
            com.google.android.material.imageview.ShapeableImageView r13 = r12.f29547n
            r13.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r13 = r12.f29548o
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f29549p
            r13.setTag(r1)
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r12.f29595A = r13
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f29550q
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f29551r
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f29552s
            r13.setTag(r1)
            r12.l(r14)
            monitor-enter(r12)
            r13 = 512(0x200, double:2.53E-321)
            r12.f29596B = r13     // Catch: java.lang.Throwable -> L69
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L69
            r12.i()
            return
        L69:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L69
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1438t.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f29596B;
            this.f29596B = 0L;
        }
        Integer num = this.f29556w;
        Boolean bool = this.f29559z;
        View.OnClickListener onClickListener = this.f29555v;
        SpannedString spannedString = this.f29553t;
        String str = this.f29554u;
        Integer num2 = this.f29557x;
        Boolean bool2 = this.f29558y;
        long j11 = 513 & j10;
        long j12 = 514 & j10;
        long j13 = 516 & j10;
        long j14 = 520 & j10;
        long j15 = j10 & 528;
        long j16 = j10 & 544;
        int j17 = j16 != 0 ? F0.f.j(num2) : 0;
        if ((j10 & 768) != 0) {
            C8.a.j(this.f29547n, bool2);
            C8.a.j(this.f29551r, bool2);
        }
        if (j11 != 0) {
            C8.a.d(this.f29548o, num);
        }
        if (j15 != 0) {
            G0.c.a(this.f29549p, str);
        }
        if (j13 != 0) {
            this.f29595A.setOnClickListener(onClickListener);
        }
        if (j16 != 0) {
            ConstraintLayout constraintLayout = this.f29595A;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.width = (int) D9.b.T(j17);
            constraintLayout.setLayoutParams(layoutParams);
        }
        if (j14 != 0) {
            G0.c.a(this.f29550q, spannedString);
        }
        if (j12 != 0) {
            C8.a.j(this.f29552s, bool);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29596B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (44 == i) {
            this.f29556w = (Integer) obj;
            synchronized (this) {
                this.f29596B |= 1;
            }
            a();
            i();
        } else if (138 == i) {
            this.f29559z = (Boolean) obj;
            synchronized (this) {
                this.f29596B |= 2;
            }
            a();
            i();
        } else if (105 == i) {
            this.f29555v = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29596B |= 4;
            }
            a();
            i();
        } else if (20 == i) {
            this.f29553t = (SpannedString) obj;
            synchronized (this) {
                this.f29596B |= 8;
            }
            a();
            i();
        } else if (2 == i) {
            this.f29554u = (String) obj;
            synchronized (this) {
                this.f29596B |= 16;
            }
            a();
            i();
        } else if (167 == i) {
            this.f29557x = (Integer) obj;
            synchronized (this) {
                this.f29596B |= 32;
            }
            a();
            i();
        } else if (114 == i) {
        } else if (49 == i) {
        } else {
            if (59 != i) {
                return false;
            }
            this.f29558y = (Boolean) obj;
            synchronized (this) {
                this.f29596B |= 256;
            }
            a();
            i();
        }
        return true;
    }
}
