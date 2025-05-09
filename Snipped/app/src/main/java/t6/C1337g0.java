package t6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luminary.mobile.R;

/* compiled from: CellExcahngeAccountBindingImpl.java */
/* renamed from: t6.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1337g0 extends AbstractC1329f0 {

    /* renamed from: x, reason: collision with root package name */
    public final ConstraintLayout f29012x;

    /* renamed from: y, reason: collision with root package name */
    public long f29013y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1337g0(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            r0 = 5
            r1 = 0
            java.lang.Object[] r0 = F0.f.h(r12, r0, r1)
            r2 = 2
            r2 = r0[r2]
            r8 = r2
            com.google.android.material.imageview.ShapeableImageView r8 = (com.google.android.material.imageview.ShapeableImageView) r8
            r2 = 1
            r2 = r0[r2]
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            r2 = 3
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 4
            r2 = r0[r2]
            r7 = r2
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3 = r10
            r4 = r12
            r9 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2 = -1
            r10.f29013y = r2
            com.google.android.material.imageview.ShapeableImageView r11 = r10.f28968n
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r10.f29012x = r11
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f28969o
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f28970p
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f28971q
            r11.setTag(r1)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 64
            r10.f29013y = r11     // Catch: java.lang.Throwable -> L53
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L53
            r10.i()
            return
        L53:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L53
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1337g0.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        Drawable drawable;
        Context context;
        int i;
        synchronized (this) {
            j10 = this.f29013y;
            this.f29013y = 0L;
        }
        String str = this.f28972r;
        Boolean bool = this.f28976v;
        String str2 = this.f28974t;
        View.OnClickListener onClickListener = this.f28977w;
        Integer num = this.f28975u;
        String str3 = this.f28973s;
        long j11 = j10 & 66;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 256L : 128L;
            }
            if (k3) {
                context = this.f29012x.getContext();
                i = R.drawable.cell_bg_bottom;
            } else {
                context = this.f29012x.getContext();
                i = R.drawable.cell_bg_middle;
            }
            drawable = U4.b.j(context, i);
        } else {
            drawable = null;
        }
        long j12 = 68 & j10;
        long j13 = 72 & j10;
        long j14 = j10 & 96;
        if ((80 & j10) != 0) {
            C8.a.d(this.f28968n, num);
        }
        if ((66 & j10) != 0) {
            this.f29012x.setBackground(drawable);
        }
        if (j13 != 0) {
            this.f29012x.setOnClickListener(onClickListener);
        }
        if (j12 != 0) {
            G0.c.a(this.f28969o, str2);
        }
        if ((j10 & 65) != 0) {
            G0.c.a(this.f28970p, str);
        }
        if (j14 != 0) {
            G0.c.a(this.f28971q, str3);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29013y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (101 == i) {
            this.f28972r = (String) obj;
            synchronized (this) {
                this.f29013y |= 1;
            }
            a();
            i();
            return true;
        }
        if (64 == i) {
            this.f28976v = (Boolean) obj;
            synchronized (this) {
                this.f29013y |= 2;
            }
            a();
            i();
            return true;
        }
        if (3 == i) {
            this.f28974t = (String) obj;
            synchronized (this) {
                this.f29013y |= 4;
            }
            a();
            i();
            return true;
        }
        if (105 == i) {
            this.f28977w = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29013y |= 8;
            }
            a();
            i();
            return true;
        }
        if (15 == i) {
            this.f28975u = (Integer) obj;
            synchronized (this) {
                this.f29013y |= 16;
            }
            a();
            i();
            return true;
        }
        if (1 != i) {
            return false;
        }
        this.f28973s = (String) obj;
        synchronized (this) {
            this.f29013y |= 32;
        }
        a();
        i();
        return true;
    }
}
