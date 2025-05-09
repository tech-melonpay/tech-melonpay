package j2;

import java.util.concurrent.Executor;
import l2.InterfaceC0982b;
import n2.C1060a;
import n2.C1062c;
import n2.InterfaceC1061b;
import p2.InterfaceC1102c;
import q2.InterfaceC1129a;
import r2.b;
import r2.c;

/* compiled from: TransportRuntime_Factory.java */
/* loaded from: classes.dex */
public final class q implements InterfaceC0982b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22456a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final N9.a f22457b;

    /* renamed from: c, reason: collision with root package name */
    public final N9.a f22458c;

    /* renamed from: d, reason: collision with root package name */
    public final N9.a f22459d;

    /* renamed from: e, reason: collision with root package name */
    public final N9.a f22460e;

    /* renamed from: f, reason: collision with root package name */
    public final N9.a f22461f;

    public q(q qVar, o2.d dVar, C1062c c1062c) {
        r2.b bVar = b.a.f26146a;
        r2.c cVar = c.a.f26147a;
        this.f22457b = bVar;
        this.f22458c = cVar;
        this.f22459d = qVar;
        this.f22460e = dVar;
        this.f22461f = c1062c;
    }

    @Override // N9.a
    public final Object get() {
        switch (this.f22456a) {
            case 0:
                return new o((r2.a) this.f22457b.get(), (r2.a) this.f22458c.get(), (InterfaceC1061b) this.f22459d.get(), (o2.c) this.f22460e.get(), (o2.e) this.f22461f.get());
            default:
                return new C1060a((Executor) this.f22457b.get(), (k2.d) this.f22458c.get(), (o2.f) this.f22459d.get(), (InterfaceC1102c) this.f22460e.get(), (InterfaceC1129a) this.f22461f.get());
        }
    }

    public q(N9.a aVar, N9.a aVar2, C1062c c1062c, N9.a aVar3, N9.a aVar4) {
        this.f22457b = aVar;
        this.f22458c = aVar2;
        this.f22459d = c1062c;
        this.f22460e = aVar3;
        this.f22461f = aVar4;
    }
}
