package t6;

import android.view.View;
import android.widget.TextView;

/* compiled from: CellExcahngeAccountHeaderBindingImpl.java */
/* renamed from: t6.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1345h0 extends F0.f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29040n;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f29041o;

    /* renamed from: p, reason: collision with root package name */
    public String f29042p;

    /* renamed from: q, reason: collision with root package name */
    public long f29043q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1345h0(Object obj, View view, TextView textView, int i) {
        super(obj, view, 0);
        this.f29040n = i;
        this.f29041o = textView;
    }

    @Override // F0.f
    public final void b() {
        long j10;
        long j11;
        long j12;
        long j13;
        switch (this.f29040n) {
            case 0:
                synchronized (this) {
                    j10 = this.f29043q;
                    this.f29043q = 0L;
                }
                String str = this.f29042p;
                if ((j10 & 3) != 0) {
                    G0.c.a(this.f29041o, str);
                    return;
                }
                return;
            case 1:
                synchronized (this) {
                    j11 = this.f29043q;
                    this.f29043q = 0L;
                }
                String str2 = this.f29042p;
                if ((j11 & 3) != 0) {
                    G0.c.a(this.f29041o, str2);
                    return;
                }
                return;
            case 2:
                synchronized (this) {
                    j12 = this.f29043q;
                    this.f29043q = 0L;
                }
                String str3 = this.f29042p;
                if ((j12 & 3) != 0) {
                    G0.c.a(this.f29041o, str3);
                    return;
                }
                return;
            default:
                synchronized (this) {
                    j13 = this.f29043q;
                    this.f29043q = 0L;
                }
                String str4 = this.f29042p;
                if ((j13 & 3) != 0) {
                    G0.c.a(this.f29041o, str4);
                    return;
                }
                return;
        }
    }

    @Override // F0.f
    public final boolean e() {
        switch (this.f29040n) {
            case 0:
                synchronized (this) {
                    try {
                        return this.f29043q != 0;
                    } finally {
                    }
                }
            case 1:
                synchronized (this) {
                    try {
                        return this.f29043q != 0;
                    } finally {
                    }
                }
            case 2:
                synchronized (this) {
                    try {
                        return this.f29043q != 0;
                    } finally {
                    }
                }
            default:
                synchronized (this) {
                    try {
                        return this.f29043q != 0;
                    } finally {
                    }
                }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        switch (this.f29040n) {
            case 0:
                if (94 != i) {
                    return false;
                }
                this.f29042p = (String) obj;
                synchronized (this) {
                    this.f29043q |= 1;
                }
                a();
                i();
                return true;
            case 1:
                if (147 != i) {
                    return false;
                }
                this.f29042p = (String) obj;
                synchronized (this) {
                    this.f29043q |= 1;
                }
                a();
                i();
                return true;
            case 2:
                if (39 != i) {
                    return false;
                }
                this.f29042p = (String) obj;
                synchronized (this) {
                    this.f29043q |= 1;
                }
                a();
                i();
                return true;
            default:
                if (31 != i) {
                    return false;
                }
                this.f29042p = (String) obj;
                synchronized (this) {
                    this.f29043q |= 1;
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
    public C1345h0(F0.c r5, android.view.View r6, int r7) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1345h0.<init>(F0.c, android.view.View, int):void");
    }
}
