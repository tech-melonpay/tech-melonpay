package t6;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellPlanDataBindingImpl.java */
/* renamed from: t6.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1418q1 extends F0.f {

    /* renamed from: n, reason: collision with root package name */
    public final TextView f29498n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f29499o;

    /* renamed from: p, reason: collision with root package name */
    public String f29500p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f29501q;

    /* renamed from: r, reason: collision with root package name */
    public String f29502r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f29503s;

    /* renamed from: t, reason: collision with root package name */
    public long f29504t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418q1(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 3, null);
        TextView textView = (TextView) h9[1];
        TextView textView2 = (TextView) h9[2];
        this.f29498n = textView;
        this.f29499o = textView2;
        this.f29504t = -1L;
        ((ConstraintLayout) h9[0]).setTag(null);
        this.f29498n.setTag(null);
        this.f29499o.setTag(null);
        l(view);
        synchronized (this) {
            this.f29504t = 16L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f29504t;
            this.f29504t = 0L;
        }
        String str = this.f29500p;
        String str2 = this.f29502r;
        Integer num = this.f29503s;
        Integer num2 = this.f29501q;
        long j11 = 17 & j10;
        long j12 = 18 & j10;
        long j13 = 20 & j10;
        if ((j10 & 24) != 0) {
            C8.a.c(this.f29498n, num2);
        }
        if (j11 != 0) {
            G0.c.a(this.f29498n, str);
        }
        if (j13 != 0) {
            C8.a.c(this.f29499o, num);
        }
        if (j12 != 0) {
            G0.c.a(this.f29499o, str2);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29504t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (148 == i) {
            this.f29500p = (String) obj;
            synchronized (this) {
                this.f29504t |= 1;
            }
            a();
            i();
        } else if (150 == i) {
            this.f29502r = (String) obj;
            synchronized (this) {
                this.f29504t |= 2;
            }
            a();
            i();
        } else if (151 == i) {
            this.f29503s = (Integer) obj;
            synchronized (this) {
                this.f29504t |= 4;
            }
            a();
            i();
        } else {
            if (149 != i) {
                return false;
            }
            this.f29501q = (Integer) obj;
            synchronized (this) {
                this.f29504t |= 8;
            }
            a();
            i();
        }
        return true;
    }
}
