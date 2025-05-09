package t6;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: ActivityErrorBindingImpl.java */
/* renamed from: t6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1288a extends F0.f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28778n;

    /* renamed from: o, reason: collision with root package name */
    public long f28779o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1288a(F0.c cVar, View view, int i) {
        super(cVar, view, 0);
        this.f28778n = i;
        switch (i) {
            case 1:
                Object[] h9 = F0.f.h(view, 1, null);
                super(cVar, view, 0);
                this.f28779o = -1L;
                ((FrameLayout) h9[0]).setTag(null);
                l(view);
                synchronized (this) {
                    this.f28779o = 1L;
                }
                i();
                return;
            case 2:
                Object[] h10 = F0.f.h(view, 1, null);
                super(cVar, view, 0);
                this.f28779o = -1L;
                ((ConstraintLayout) h10[0]).setTag(null);
                l(view);
                synchronized (this) {
                    this.f28779o = 1L;
                }
                i();
                return;
            default:
                Object[] h11 = F0.f.h(view, 1, null);
                this.f28779o = -1L;
                ((FrameLayout) h11[0]).setTag(null);
                l(view);
                synchronized (this) {
                    this.f28779o = 1L;
                }
                i();
                return;
        }
    }

    @Override // F0.f
    public final void b() {
        switch (this.f28778n) {
            case 0:
                synchronized (this) {
                    this.f28779o = 0L;
                }
                return;
            case 1:
                synchronized (this) {
                    this.f28779o = 0L;
                }
                return;
            default:
                synchronized (this) {
                    this.f28779o = 0L;
                }
                return;
        }
    }

    @Override // F0.f
    public final boolean e() {
        switch (this.f28778n) {
            case 0:
                synchronized (this) {
                    try {
                        return this.f28779o != 0;
                    } finally {
                    }
                }
            case 1:
                synchronized (this) {
                    try {
                        return this.f28779o != 0;
                    } finally {
                    }
                }
            default:
                synchronized (this) {
                    try {
                        return this.f28779o != 0;
                    } finally {
                    }
                }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        switch (this.f28778n) {
        }
        return true;
    }
}
