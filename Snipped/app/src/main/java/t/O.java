package t;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* compiled from: ExposureControl.java */
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final C1257i f27144a;

    /* renamed from: b, reason: collision with root package name */
    public final P f27145b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f27146c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27147d = false;

    /* renamed from: e, reason: collision with root package name */
    public CallbackToFutureAdapter.a<Integer> f27148e;

    /* renamed from: f, reason: collision with root package name */
    public N f27149f;

    public O(C1257i c1257i, u.n nVar, Executor executor) {
        this.f27144a = c1257i;
        this.f27145b = new P(nVar);
        this.f27146c = executor;
    }

    public final void a() {
        CallbackToFutureAdapter.a<Integer> aVar = this.f27148e;
        if (aVar != null) {
            s3.b.v("Cancelled by another setExposureCompensationIndex()", aVar);
            this.f27148e = null;
        }
        N n10 = this.f27149f;
        if (n10 != null) {
            this.f27144a.f27244a.f27268a.remove(n10);
            this.f27149f = null;
        }
    }
}
