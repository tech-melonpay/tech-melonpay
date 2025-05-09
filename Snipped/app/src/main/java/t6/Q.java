package t6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: CellCompanyHeaderNewBindingImpl.java */
/* loaded from: classes2.dex */
public final class Q extends F0.f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28341n = 1;

    /* renamed from: o, reason: collision with root package name */
    public long f28342o;

    /* renamed from: p, reason: collision with root package name */
    public Object f28343p;

    /* renamed from: q, reason: collision with root package name */
    public Object f28344q;

    /* renamed from: r, reason: collision with root package name */
    public Object f28345r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 1, null);
        this.f28342o = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) h9[0];
        this.f28345r = constraintLayout;
        constraintLayout.setTag(null);
        l(view);
        synchronized (this) {
            this.f28342o = 4L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        long j10;
        int i;
        long j11;
        switch (this.f28341n) {
            case 0:
                synchronized (this) {
                    j10 = this.f28342o;
                    this.f28342o = 0L;
                }
                Boolean bool = (Boolean) this.f28345r;
                String str = (String) this.f28344q;
                long j12 = j10 & 5;
                if (j12 != 0) {
                    boolean k3 = F0.f.k(bool);
                    if (j12 != 0) {
                        j10 |= k3 ? 16L : 8L;
                    }
                    i = k3 ? 16 : 24;
                } else {
                    i = 0;
                }
                long j13 = 6 & j10;
                if ((j10 & 5) != 0) {
                    C8.a.h(i, (TextView) this.f28343p);
                }
                if (j13 != 0) {
                    G0.c.a((TextView) this.f28343p, str);
                    return;
                }
                return;
            default:
                synchronized (this) {
                    j11 = this.f28342o;
                    this.f28342o = 0L;
                }
                Integer num = (Integer) this.f28344q;
                Integer num2 = (Integer) this.f28343p;
                long j14 = 5 & j11;
                int j15 = j14 != 0 ? F0.f.j(num) : 0;
                long j16 = j11 & 6;
                int j17 = j16 != 0 ? F0.f.j(num2) : 0;
                if (j14 != 0) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) this.f28345r;
                    ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                    layoutParams.height = (int) D9.b.T(j15);
                    constraintLayout.setLayoutParams(layoutParams);
                }
                if (j16 != 0) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f28345r;
                    ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
                    layoutParams2.width = (int) D9.b.T(j17);
                    constraintLayout2.setLayoutParams(layoutParams2);
                    return;
                }
                return;
        }
    }

    @Override // F0.f
    public final boolean e() {
        switch (this.f28341n) {
            case 0:
                synchronized (this) {
                    try {
                        return this.f28342o != 0;
                    } finally {
                    }
                }
            default:
                synchronized (this) {
                    try {
                        return this.f28342o != 0;
                    } finally {
                    }
                }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        switch (this.f28341n) {
            case 0:
                if (57 == i) {
                    this.f28345r = (Boolean) obj;
                    synchronized (this) {
                        this.f28342o |= 1;
                    }
                    a();
                    i();
                } else {
                    if (147 != i) {
                        return false;
                    }
                    this.f28344q = (String) obj;
                    synchronized (this) {
                        this.f28342o |= 2;
                    }
                    a();
                    i();
                }
                return true;
            default:
                if (41 == i) {
                    this.f28344q = (Integer) obj;
                    synchronized (this) {
                        this.f28342o |= 1;
                    }
                    a();
                    i();
                } else {
                    if (167 != i) {
                        return false;
                    }
                    this.f28343p = (Integer) obj;
                    synchronized (this) {
                        this.f28342o |= 2;
                    }
                    a();
                    i();
                }
                return true;
        }
    }

    public Q(Object obj, View view, TextView textView) {
        super(obj, view, 0);
        this.f28343p = textView;
    }
}
