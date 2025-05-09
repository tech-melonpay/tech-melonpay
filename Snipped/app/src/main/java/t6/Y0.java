package t6;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellNewAccountTypeBindingImpl.java */
/* loaded from: classes2.dex */
public final class Y0 extends X0 {

    /* renamed from: v, reason: collision with root package name */
    public final ConstraintLayout f28674v;

    /* renamed from: w, reason: collision with root package name */
    public long f28675w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Y0(F0.c r10, android.view.View r11) {
        /*
            r9 = this;
            r0 = 4
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r11, r0, r1)
            r2 = 2
            r2 = r0[r2]
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            r2 = 1
            r2 = r0[r2]
            r7 = r2
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            r2 = 3
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3 = r9
            r4 = r11
            r8 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r2 = -1
            r9.f28675w = r2
            android.widget.TextView r10 = r9.f28651n
            r10.setTag(r1)
            com.google.android.material.imageview.ShapeableImageView r10 = r9.f28652o
            r10.setTag(r1)
            android.widget.TextView r10 = r9.f28653p
            r10.setTag(r1)
            r10 = 0
            r10 = r0[r10]
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r9.f28674v = r10
            r10.setTag(r1)
            r9.l(r11)
            monitor-enter(r9)
            r10 = 32
            r9.f28675w = r10     // Catch: java.lang.Throwable -> L48
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            r9.i()
            return
        L48:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L48
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.Y0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        int i;
        Drawable drawable;
        int i9;
        TextView textView;
        synchronized (this) {
            j10 = this.f28675w;
            this.f28675w = 0L;
        }
        Integer num = this.f28657t;
        String str = this.f28654q;
        View.OnClickListener onClickListener = this.f28658u;
        Boolean bool = this.f28655r;
        String str2 = this.f28656s;
        long j11 = j10 & 40;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 2688L : 1344L;
            }
            drawable = U4.b.j(this.f28674v.getContext(), k3 ? R.drawable.cell_bg_full_chose : R.drawable.cell_bg_full_16);
            int i10 = R.color.white;
            TextView textView2 = this.f28653p;
            i = k3 ? F0.f.d(R.color.white, textView2) : F0.f.d(R.color.neutral_500, textView2);
            if (k3) {
                textView = this.f28651n;
            } else {
                textView = this.f28651n;
                i10 = R.color.black;
            }
            i9 = F0.f.d(i10, textView);
        } else {
            i = 0;
            drawable = null;
            i9 = 0;
        }
        long j12 = 48 & j10;
        if ((34 & j10) != 0) {
            G0.c.a(this.f28651n, str);
        }
        if ((40 & j10) != 0) {
            this.f28651n.setTextColor(i9);
            this.f28653p.setTextColor(i);
            this.f28674v.setBackground(drawable);
        }
        if ((33 & j10) != 0) {
            C8.a.d(this.f28652o, num);
        }
        if (j12 != 0) {
            G0.c.a(this.f28653p, str2);
        }
        if ((j10 & 36) != 0) {
            this.f28674v.setOnClickListener(onClickListener);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28675w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (44 == i) {
            this.f28657t = (Integer) obj;
            synchronized (this) {
                this.f28675w |= 1;
            }
            a();
            i();
        } else if (101 == i) {
            this.f28654q = (String) obj;
            synchronized (this) {
                this.f28675w |= 2;
            }
            a();
            i();
        } else if (105 == i) {
            this.f28658u = (View.OnClickListener) obj;
            synchronized (this) {
                this.f28675w |= 4;
            }
            a();
            i();
        } else if (51 == i) {
            this.f28655r = (Boolean) obj;
            synchronized (this) {
                this.f28675w |= 8;
            }
            a();
            i();
        } else {
            if (25 != i) {
                return false;
            }
            this.f28656s = (String) obj;
            synchronized (this) {
                this.f28675w |= 16;
            }
            a();
            i();
        }
        return true;
    }
}
