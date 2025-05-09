package U1;

import C.N;
import androidx.lifecycle.AbstractC0557x;
import androidx.lifecycle.C0558y;
import androidx.lifecycle.C0559z;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;

/* compiled from: TransactionViewModel.kt */
/* loaded from: classes.dex */
public final class h extends Q {

    /* renamed from: B0, reason: collision with root package name */
    public final C0558y f3652B0;

    /* renamed from: C0, reason: collision with root package name */
    public final C0558y f3653C0;

    /* renamed from: D0, reason: collision with root package name */
    public final C0558y f3654D0;

    /* renamed from: E0, reason: collision with root package name */
    public final AbstractC0557x<HttpTransaction> f3655E0;

    /* renamed from: F0, reason: collision with root package name */
    public final C0558y f3656F0;

    /* renamed from: k, reason: collision with root package name */
    public final C0559z<Boolean> f3657k;

    /* renamed from: p, reason: collision with root package name */
    public final C0559z f3658p;

    public h(long j10) {
        C0559z<Boolean> c0559z = new C0559z<>(Boolean.FALSE);
        this.f3657k = c0559z;
        this.f3658p = c0559z;
        N n10 = Ja.a.f2210a;
        if (n10 == null) {
            throw new IllegalStateException("You can't access the transaction repository if you don't initialize it!".toString());
        }
        this.f3652B0 = S1.i.a(n10.i(j10), c0559z, new K8.c(6));
        N n11 = Ja.a.f2210a;
        if (n11 == null) {
            throw new IllegalStateException("You can't access the transaction repository if you don't initialize it!".toString());
        }
        this.f3653C0 = P.a(n11.i(j10), new Q3.a(21));
        N n12 = Ja.a.f2210a;
        if (n12 == null) {
            throw new IllegalStateException("You can't access the transaction repository if you don't initialize it!".toString());
        }
        C0558y a10 = P.a(n12.i(j10), new Q3.a(22));
        this.f3654D0 = a10;
        N n13 = Ja.a.f2210a;
        if (n13 == null) {
            throw new IllegalStateException("You can't access the transaction repository if you don't initialize it!".toString());
        }
        this.f3655E0 = n13.i(j10);
        this.f3656F0 = S1.i.a(a10, c0559z, new K8.c(7));
    }
}
