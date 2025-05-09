package t6;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.luminary.mobile.R;
import java.util.List;
import k0.C0913a;

/* compiled from: CellPlanCarouselItemBindingImpl.java */
/* renamed from: t6.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1410p1 extends AbstractC1402o1 {

    /* renamed from: I, reason: collision with root package name */
    public static final SparseIntArray f29447I;

    /* renamed from: F, reason: collision with root package name */
    public final ConstraintLayout f29448F;

    /* renamed from: G, reason: collision with root package name */
    public final EpoxyRecyclerView f29449G;

    /* renamed from: H, reason: collision with root package name */
    public long f29450H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29447I = sparseIntArray;
        sparseIntArray.put(R.id.view5, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1410p1(F0.c r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = t6.C1410p1.f29447I
            r1 = 8
            java.lang.Object[] r0 = F0.f.h(r12, r1, r0)
            r1 = 6
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 4
            r1 = r0[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 7
            r1 = r0[r1]
            android.view.View r1 = (android.view.View) r1
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.f29450H = r1
            android.widget.Button r11 = r10.f29397n
            r1 = 0
            r11.setTag(r1)
            r11 = 0
            r11 = r0[r11]
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r10.f29448F = r11
            r11.setTag(r1)
            r11 = 5
            r11 = r0[r11]
            com.airbnb.epoxy.EpoxyRecyclerView r11 = (com.airbnb.epoxy.EpoxyRecyclerView) r11
            r10.f29449G = r11
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29398o
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29399p
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29400q
            r11.setTag(r1)
            android.widget.TextView r11 = r10.f29401r
            r11.setTag(r1)
            r10.l(r12)
            monitor-enter(r10)
            r11 = 8192(0x2000, double:4.0474E-320)
            r10.f29450H = r11     // Catch: java.lang.Throwable -> L70
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L70
            r10.i()
            return
        L70:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L70
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1410p1.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        long j10;
        Integer num;
        int i;
        Drawable drawable;
        Context context;
        int i9;
        synchronized (this) {
            j10 = this.f29450H;
            this.f29450H = 0L;
        }
        Boolean bool = this.f29395D;
        Integer num2 = this.f29402s;
        Integer num3 = this.f29406w;
        C6.a aVar = this.f29393B;
        String str = this.f29407x;
        String str2 = this.f29405v;
        Integer num4 = this.f29392A;
        String str3 = this.f29394C;
        String str4 = this.f29409z;
        String str5 = this.f29403t;
        Integer num5 = this.f29408y;
        View.OnClickListener onClickListener = this.f29396E;
        Integer num6 = this.f29404u;
        long j11 = j10 & 8193;
        if (j11 != 0) {
            boolean k3 = F0.f.k(bool);
            if (j11 != 0) {
                j10 |= k3 ? 163840L : 81920L;
            }
            long j12 = j10;
            int d10 = F0.f.d(k3 ? R.color.black : R.color.white, this.f29397n);
            if (k3) {
                context = this.f29397n.getContext();
                i9 = R.drawable.bg_botton_disable_with_border;
            } else {
                context = this.f29397n.getContext();
                i9 = R.drawable.bg_button_black;
            }
            drawable = U4.b.j(context, i9);
            num = num4;
            i = d10;
            j10 = j12;
        } else {
            num = num4;
            i = 0;
            drawable = null;
        }
        long j13 = j10 & 8194;
        long j14 = j10 & 8196;
        long j15 = j10 & 8200;
        List<EpoxyModel<?>> list = (j15 == 0 || aVar == null) ? null : aVar.f680a;
        long j16 = j10 & 8208;
        long j17 = j10 & 8224;
        long j18 = j10 & 8256;
        long j19 = j10 & 8320;
        long j20 = j10 & 8448;
        long j21 = j10 & 8704;
        long j22 = j10 & 9216;
        long j23 = j10 & 10240;
        long j24 = j10 & 12288;
        if ((j10 & 8193) != 0) {
            this.f29397n.setBackground(drawable);
            this.f29397n.setTextColor(i);
        }
        if (j23 != 0) {
            this.f29397n.setOnClickListener(onClickListener);
        }
        if (j19 != 0) {
            G0.c.a(this.f29397n, str3);
        }
        if (j13 != 0) {
            ConstraintLayout constraintLayout = this.f29448F;
            Drawable drawable2 = C0913a.getDrawable(constraintLayout.getContext(), R.drawable.bg_plan_basic);
            if (drawable2 != null && num2 != null) {
                drawable2.setTint(num2.intValue());
                constraintLayout.setBackground(drawable2);
            }
        }
        if (j15 != 0) {
            this.f29449G.setModels(list);
        }
        if (j21 != 0) {
            G0.c.a(this.f29398o, str5);
        }
        if (j24 != 0) {
            C8.a.c(this.f29398o, num6);
        }
        if (j17 != 0) {
            G0.c.a(this.f29399p, str2);
        }
        if (j14 != 0) {
            C8.a.c(this.f29399p, num3);
        }
        if (j16 != 0) {
            G0.c.a(this.f29400q, str);
        }
        if (j22 != 0) {
            C8.a.c(this.f29400q, num5);
        }
        if (j20 != 0) {
            G0.c.a(this.f29401r, str4);
        }
        if (j18 != 0) {
            C8.a.c(this.f29401r, num);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29450H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (50 == i) {
            this.f29395D = (Boolean) obj;
            synchronized (this) {
                this.f29450H |= 1;
            }
            a();
            i();
        } else if (10 == i) {
            this.f29402s = (Integer) obj;
            synchronized (this) {
                this.f29450H |= 2;
            }
            a();
            i();
        } else if (151 == i) {
            this.f29406w = (Integer) obj;
            synchronized (this) {
                this.f29450H |= 4;
            }
            a();
            i();
        } else if (23 == i) {
            this.f29393B = (C6.a) obj;
            synchronized (this) {
                this.f29450H |= 8;
            }
            a();
            i();
        } else if (25 == i) {
            this.f29407x = (String) obj;
            synchronized (this) {
                this.f29450H |= 16;
            }
            a();
            i();
        } else if (150 == i) {
            this.f29405v = (String) obj;
            synchronized (this) {
                this.f29450H |= 32;
            }
            a();
            i();
        } else if (28 == i) {
            this.f29392A = (Integer) obj;
            synchronized (this) {
                this.f29450H |= 64;
            }
            a();
            i();
        } else if (13 == i) {
            this.f29394C = (String) obj;
            synchronized (this) {
                this.f29450H |= 128;
            }
            a();
            i();
        } else if (27 == i) {
            this.f29409z = (String) obj;
            synchronized (this) {
                this.f29450H |= 256;
            }
            a();
            i();
        } else if (148 == i) {
            this.f29403t = (String) obj;
            synchronized (this) {
                this.f29450H |= 512;
            }
            a();
            i();
        } else if (26 == i) {
            this.f29408y = (Integer) obj;
            synchronized (this) {
                this.f29450H |= 1024;
            }
            a();
            i();
        } else if (104 == i) {
            this.f29396E = (View.OnClickListener) obj;
            synchronized (this) {
                this.f29450H |= 2048;
            }
            a();
            i();
        } else {
            if (149 != i) {
                return false;
            }
            this.f29404u = (Integer) obj;
            synchronized (this) {
                this.f29450H |= 4096;
            }
            a();
            i();
        }
        return true;
    }
}
