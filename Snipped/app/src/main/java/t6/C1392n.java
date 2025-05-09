package t6;

import android.view.View;
import android.widget.ImageView;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import java.util.List;

/* compiled from: CellAccountCarouselBindingImpl.java */
/* renamed from: t6.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1392n extends F0.f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29327n;

    /* renamed from: o, reason: collision with root package name */
    public final View f29328o;

    /* renamed from: p, reason: collision with root package name */
    public Object f29329p;

    /* renamed from: q, reason: collision with root package name */
    public long f29330q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1392n(Object obj, View view, View view2, int i) {
        super(obj, view, 0);
        this.f29327n = i;
        this.f29328o = view2;
    }

    @Override // F0.f
    public final void b() {
        long j10;
        long j11;
        long j12;
        switch (this.f29327n) {
            case 0:
                synchronized (this) {
                    j10 = this.f29330q;
                    this.f29330q = 0L;
                }
                C6.a aVar = (C6.a) this.f29329p;
                long j13 = j10 & 3;
                List<EpoxyModel<?>> list = (j13 == 0 || aVar == null) ? null : aVar.f680a;
                if (j13 != 0) {
                    ((EpoxyRecyclerView) this.f29328o).setModels(list);
                    return;
                }
                return;
            case 1:
                synchronized (this) {
                    j11 = this.f29330q;
                    this.f29330q = 0L;
                }
                C6.a aVar2 = (C6.a) this.f29329p;
                long j14 = j11 & 48;
                List<EpoxyModel<?>> list2 = (j14 == 0 || aVar2 == null) ? null : aVar2.f680a;
                if (j14 != 0) {
                    ((EpoxyRecyclerView) this.f29328o).setModels(list2);
                    return;
                }
                return;
            default:
                synchronized (this) {
                    j12 = this.f29330q;
                    this.f29330q = 0L;
                }
                Integer num = (Integer) this.f29329p;
                if ((j12 & 3) != 0) {
                    C8.a.d((ImageView) this.f29328o, num);
                    return;
                }
                return;
        }
    }

    @Override // F0.f
    public final boolean e() {
        switch (this.f29327n) {
            case 0:
                synchronized (this) {
                    try {
                        return this.f29330q != 0;
                    } finally {
                    }
                }
            case 1:
                synchronized (this) {
                    try {
                        return this.f29330q != 0;
                    } finally {
                    }
                }
            default:
                synchronized (this) {
                    try {
                        return this.f29330q != 0;
                    } finally {
                    }
                }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        switch (this.f29327n) {
            case 0:
                if (23 != i) {
                    return false;
                }
                this.f29329p = (C6.a) obj;
                synchronized (this) {
                    this.f29330q |= 1;
                }
                a();
                i();
                return true;
            case 1:
                if (148 == i) {
                } else if (17 == i) {
                } else if (135 == i) {
                } else if (152 == i) {
                } else {
                    if (23 != i) {
                        return false;
                    }
                    this.f29329p = (C6.a) obj;
                    synchronized (this) {
                        this.f29330q |= 16;
                    }
                    a();
                    i();
                }
                return true;
            default:
                if (44 != i) {
                    return false;
                }
                this.f29329p = (Integer) obj;
                synchronized (this) {
                    this.f29330q |= 1;
                }
                a();
                i();
                return true;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1392n(F0.c r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            r3.f29327n = r6
            switch(r6) {
                case 1: goto L69;
                case 2: goto L37;
                default: goto L5;
            }
        L5:
            r6 = 2
            r0 = 0
            java.lang.Object[] r6 = F0.f.h(r5, r6, r0)
            r1 = 1
            r1 = r6[r1]
            com.airbnb.epoxy.EpoxyRecyclerView r1 = (com.airbnb.epoxy.EpoxyRecyclerView) r1
            r2 = 0
            r3.<init>(r4, r5, r1, r2)
            r1 = -1
            r3.f29330q = r1
            android.view.View r4 = r3.f29328o
            com.airbnb.epoxy.EpoxyRecyclerView r4 = (com.airbnb.epoxy.EpoxyRecyclerView) r4
            r4.setTag(r0)
            r4 = 0
            r4 = r6[r4]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r4.setTag(r0)
            r3.l(r5)
            monitor-enter(r3)
            r4 = 2
            r3.f29330q = r4     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            r3.i()
            return
        L34:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r4
        L37:
            r6 = 2
            r0 = 0
            java.lang.Object[] r6 = F0.f.h(r5, r6, r0)
            r1 = 1
            r1 = r6[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = 2
            r3.<init>(r4, r5, r1, r2)
            r1 = -1
            r3.f29330q = r1
            android.view.View r4 = r3.f29328o
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r4.setTag(r0)
            r4 = 0
            r4 = r6[r4]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r4.setTag(r0)
            r3.l(r5)
            monitor-enter(r3)
            r4 = 2
            r3.f29330q = r4     // Catch: java.lang.Throwable -> L66
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L66
            r3.i()
            return
        L66:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L66
            throw r4
        L69:
            r6 = 2
            r0 = 0
            java.lang.Object[] r6 = F0.f.h(r5, r6, r0)
            r1 = 1
            r1 = r6[r1]
            com.airbnb.epoxy.EpoxyRecyclerView r1 = (com.airbnb.epoxy.EpoxyRecyclerView) r1
            r2 = 1
            r3.<init>(r4, r5, r1, r2)
            r1 = -1
            r3.f29330q = r1
            android.view.View r4 = r3.f29328o
            com.airbnb.epoxy.EpoxyRecyclerView r4 = (com.airbnb.epoxy.EpoxyRecyclerView) r4
            r4.setTag(r0)
            r4 = 0
            r4 = r6[r4]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r4.setTag(r0)
            r3.l(r5)
            monitor-enter(r3)
            r4 = 32
            r3.f29330q = r4     // Catch: java.lang.Throwable -> L98
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L98
            r3.i()
            return
        L98:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L98
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1392n.<init>(F0.c, android.view.View, int):void");
    }
}
