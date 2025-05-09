package u0;

import java.util.concurrent.Executor;
import n0.e;
import pa.C1124b;
import u0.C1505i;

/* compiled from: CallbackWrapper.java */
/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1498b {

    /* renamed from: a, reason: collision with root package name */
    public final C1124b f30086a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f30087b;

    public C1498b(e.a aVar, t0.e eVar) {
        this.f30086a = aVar;
        this.f30087b = eVar;
    }

    public final void a(C1505i.a aVar) {
        int i = aVar.f30113b;
        Executor executor = this.f30087b;
        C1124b c1124b = this.f30086a;
        if (i != 0) {
            executor.execute(new RunnableC1497a(c1124b, i));
        } else {
            executor.execute(new A3.k(4, c1124b, aVar.f30112a));
        }
    }
}
