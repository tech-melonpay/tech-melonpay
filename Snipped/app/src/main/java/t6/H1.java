package t6;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellStatementsSelectorBindingImpl.java */
/* loaded from: classes2.dex */
public final class H1 extends G1 {

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f27941v;

    /* renamed from: w, reason: collision with root package name */
    public long f27942w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public H1(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 4
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r11, r0, r1)
            r2 = 3
            r2 = r0[r2]
            r6 = r2
            com.google.android.material.imageview.ShapeableImageView r6 = (com.google.android.material.imageview.ShapeableImageView) r6
            r2 = 2
            r2 = r0[r2]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2 = 1
            r2 = r0[r2]
            r8 = r2
            com.google.android.material.imageview.ShapeableImageView r8 = (com.google.android.material.imageview.ShapeableImageView) r8
            r3 = r9
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.f27942w = r2
            com.google.android.material.imageview.ShapeableImageView r10 = r9.f27876n
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f27877o
            r10.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r10 = r9.f27878p
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.f27941v = r10
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 32
            r9.f27942w = r10     // Catch: java.lang.Throwable -> L48
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            r9.i()
            return
        L48:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.H1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        boolean z10;
        boolean z11;
        TextView textView;
        int i;
        synchronized (this) {
            j10 = this.f27942w;
            this.f27942w = 0L;
        }
        Integer num = this.f27879q;
        Boolean bool = this.f27883u;
        String str = this.f27880r;
        View.OnClickListener onClickListener = this.f27881s;
        Boolean bool2 = this.f27882t;
        int i9 = 0;
        if ((j10 & 34) != 0) {
            z10 = F0.f.k(bool);
            z11 = !z10;
        } else {
            z10 = false;
            z11 = false;
        }
        long j11 = j10 & 48;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool2);
            if (j11 != 0) {
                j10 |= k3 ? 128L : 64L;
            }
            if (k3) {
                textView = this.f27877o;
                i = R.color.text_black;
            } else {
                textView = this.f27877o;
                i = R.color.text_gray;
            }
            i9 = F0.f.d(i, textView);
        }
        if ((j10 & 34) != 0) {
            C8.a.b(this.f27876n, z11);
            C8.a.b(this.f27878p, z10);
        }
        if ((33 & j10) != 0) {
            C8.a.d(this.f27876n, num);
        }
        if ((36 & j10) != 0) {
            G0.c.a(this.f27877o, str);
        }
        if ((j10 & 48) != 0) {
            this.f27877o.setTextColor(i9);
        }
        if ((j10 & 40) != 0) {
            this.f27941v.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f27942w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (44 == i) {
            this.f27879q = (Integer) obj;
            synchronized (this) {
                this.f27942w |= 1;
            }
            a();
            i();
        } else if (65 == i) {
            this.f27883u = (Boolean) obj;
            synchronized (this) {
                this.f27942w |= 2;
            }
            a();
            i();
        } else if (101 == i) {
            this.f27880r = (String) obj;
            synchronized (this) {
                this.f27942w |= 4;
            }
            a();
            i();
        } else if (104 == i) {
            this.f27881s = (View.OnClickListener) obj;
            synchronized (this) {
                this.f27942w |= 8;
            }
            a();
            i();
        } else {
            if (49 != i) {
                return false;
            }
            this.f27882t = (Boolean) obj;
            synchronized (this) {
                this.f27942w |= 16;
            }
            a();
            i();
        }
        return true;
    }
}
