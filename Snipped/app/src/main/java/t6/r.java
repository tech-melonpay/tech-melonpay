package t6;

import android.text.SpannedString;
import android.view.View;
import android.widget.TextView;
import com.luminary.mobile.R;

/* compiled from: CellAccountDetailsTopBindingImpl.java */
/* loaded from: classes2.dex */
public final class r extends AbstractC1416q {

    /* renamed from: B, reason: collision with root package name */
    public long f29520B;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(F0.c r13, android.view.View r14) {
        /*
            r12 = this;
            r0 = 7
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r14, r0, r1)
            r2 = 2
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            r2 = 4
            r2 = r0[r2]
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2 = 5
            r2 = r0[r2]
            r9 = r2
            com.luminary.business.presentation.ui.views.ButtonSmall r9 = (com.luminary.business.presentation.ui.views.ButtonSmall) r9
            r2 = 3
            r2 = r0[r2]
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            r2 = 6
            r2 = r0[r2]
            r11 = r2
            com.luminary.business.presentation.ui.views.ButtonSmall r11 = (com.luminary.business.presentation.ui.views.ButtonSmall) r11
            r3 = r12
            r4 = r13
            r5 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = -1
            r12.f29520B = r2
            android.widget.TextView r13 = r12.f29484n
            r13.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r13 = r12.f29485o
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f29486p
            r13.setTag(r1)
            com.luminary.business.presentation.ui.views.ButtonSmall r13 = r12.f29487q
            r13.setTag(r1)
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r13.setTag(r1)
            android.widget.TextView r13 = r12.f29488r
            r13.setTag(r1)
            com.luminary.business.presentation.ui.views.ButtonSmall r13 = r12.f29489s
            r13.setTag(r1)
            r12.l(r14)
            monitor-enter(r12)
            r13 = 256(0x100, double:1.265E-321)
            r12.f29520B = r13     // Catch: java.lang.Throwable -> L67
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L67
            r12.i()
            return
        L67:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L67
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.r.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        int i;
        TextView textView;
        int i9;
        synchronized (this) {
            j10 = this.f29520B;
            this.f29520B = 0L;
        }
        Integer num = this.f29493w;
        View.OnClickListener onClickListener = this.f29483A;
        Boolean bool = this.f29494x;
        Boolean bool2 = this.f29495y;
        String str = this.f29490t;
        View.OnClickListener onClickListener2 = this.f29496z;
        SpannedString spannedString = this.f29492v;
        String str2 = this.f29491u;
        long j11 = j10 & 260;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 1024L : 512L;
            }
            if (k3) {
                textView = this.f29488r;
                i9 = R.color.black;
            } else {
                textView = this.f29488r;
                i9 = R.color.text_disable;
            }
            i = F0.f.d(i9, textView);
        } else {
            i = 0;
        }
        long j12 = j10 & 264;
        boolean k10 = j12 != 0 ? F0.f.k(bool2) : false;
        long j13 = j10 & 272;
        long j14 = j10 & 288;
        long j15 = j10 & 384;
        if ((j10 & 320) != 0) {
            G0.c.a(this.f29484n, spannedString);
        }
        if ((257 & j10) != 0) {
            C8.a.d(this.f29485o, num);
        }
        if (j15 != 0) {
            G0.c.a(this.f29486p, str2);
        }
        if (j14 != 0) {
            this.f29487q.setOnClickListener(onClickListener2);
        }
        if (j13 != 0) {
            G0.c.a(this.f29488r, str);
        }
        if ((260 & j10) != 0) {
            this.f29488r.setTextColor(i);
        }
        if (j12 != 0) {
            C8.a.b(this.f29489s, k10);
        }
        if ((j10 & 258) != 0) {
            this.f29489s.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29520B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (44 == i) {
            this.f29493w = (Integer) obj;
            synchronized (this) {
                this.f29520B |= 1;
            }
            a();
            i();
        } else if (115 == i) {
            this.f29483A = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29520B |= 2;
            }
            a();
            i();
        } else if (56 == i) {
            this.f29494x = (Boolean) obj;
            synchronized (this) {
                this.f29520B |= 4;
            }
            a();
            i();
        } else if (70 == i) {
            this.f29495y = (Boolean) obj;
            synchronized (this) {
                this.f29520B |= 8;
            }
            a();
            i();
        } else if (101 == i) {
            this.f29490t = (String) obj;
            synchronized (this) {
                this.f29520B |= 16;
            }
            a();
            i();
        } else if (112 == i) {
            this.f29496z = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29520B |= 32;
            }
            a();
            i();
        } else if (3 == i) {
            this.f29492v = (SpannedString) obj;
            synchronized (this) {
                this.f29520B |= 64;
            }
            a();
            i();
        } else {
            if (21 != i) {
                return false;
            }
            this.f29491u = (String) obj;
            synchronized (this) {
                this.f29520B |= 128;
            }
            a();
            i();
        }
        return true;
    }
}
