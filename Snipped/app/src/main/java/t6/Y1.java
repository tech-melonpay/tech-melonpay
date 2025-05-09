package t6;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: CellWalletHeaderBindingImpl.java */
/* loaded from: classes2.dex */
public final class Y1 extends F0.f {

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f28676n;

    /* renamed from: o, reason: collision with root package name */
    public String f28677o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f28678p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f28679q;

    /* renamed from: r, reason: collision with root package name */
    public long f28680r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(F0.c cVar, View view) {
        super(cVar, view, 0);
        Object[] h9 = F0.f.h(view, 3, null);
        ImageView imageView = (ImageView) h9[2];
        this.f28676n = imageView;
        this.f28680r = -1L;
        this.f28676n.setTag(null);
        ((LinearLayout) h9[0]).setTag(null);
        TextView textView = (TextView) h9[1];
        this.f28679q = textView;
        textView.setTag(null);
        l(view);
        synchronized (this) {
            this.f28680r = 4L;
        }
        i();
    }

    @Override // F0.f
    public final void b() {
        long j10;
        synchronized (this) {
            j10 = this.f28680r;
            this.f28680r = 0L;
        }
        String str = this.f28677o;
        Boolean bool = this.f28678p;
        long j11 = 5 & j10;
        if ((j10 & 6) != 0) {
            C8.a.j(this.f28676n, bool);
        }
        if (j11 != 0) {
            G0.c.a(this.f28679q, str);
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f28680r != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        if (148 == i) {
            this.f28677o = (String) obj;
            synchronized (this) {
                this.f28680r |= 1;
            }
            a();
            i();
        } else {
            if (12 != i) {
                return false;
            }
            this.f28678p = (Boolean) obj;
            synchronized (this) {
                this.f28680r |= 2;
            }
            a();
            i();
        }
        return true;
    }
}
