package t;

import androidx.camera.core.impl.utils.Threads;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.C0559z;
import java.util.concurrent.Executor;

/* compiled from: TorchControl.java */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1257i f27297a;

    /* renamed from: b, reason: collision with root package name */
    public final C0559z<Integer> f27298b = new C0559z<>(0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27299c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f27300d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27301e;

    /* renamed from: f, reason: collision with root package name */
    public CallbackToFutureAdapter.a<Void> f27302f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27303g;

    public m0(C1257i c1257i, u.n nVar, Executor executor) {
        this.f27297a = c1257i;
        this.f27300d = executor;
        this.f27299c = x.d.a(new com.sumsub.sns.geo.presentation.d(nVar, 19));
        c1257i.a(new l0(this, 0));
    }

    public static void b(C0559z c0559z, Integer num) {
        if (Threads.isMainThread()) {
            c0559z.setValue(num);
        } else {
            c0559z.postValue(num);
        }
    }

    public final void a(CallbackToFutureAdapter.a<Void> aVar, boolean z10) {
        if (!this.f27299c) {
            if (aVar != null) {
                aVar.c(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z11 = this.f27301e;
        C0559z<Integer> c0559z = this.f27298b;
        if (!z11) {
            b(c0559z, 0);
            if (aVar != null) {
                s3.b.v("Camera is not active.", aVar);
                return;
            }
            return;
        }
        this.f27303g = z10;
        this.f27297a.c(z10);
        b(c0559z, Integer.valueOf(z10 ? 1 : 0));
        CallbackToFutureAdapter.a<Void> aVar2 = this.f27302f;
        if (aVar2 != null) {
            s3.b.v("There is a new enableTorch being set", aVar2);
        }
        this.f27302f = aVar;
    }
}
