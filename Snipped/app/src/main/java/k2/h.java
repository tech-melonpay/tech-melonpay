package k2;

import C.N;
import android.content.Context;
import l2.InterfaceC0982b;
import p2.C1104e;
import p2.C1105f;
import p2.l;
import r2.b;
import r2.c;

/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes.dex */
public final class h implements InterfaceC0982b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22931a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final N9.a f22932b;

    /* renamed from: c, reason: collision with root package name */
    public final N9.a f22933c;

    /* renamed from: d, reason: collision with root package name */
    public final N9.a f22934d;

    public h(N9.a aVar) {
        C1104e c1104e = C1104e.a.f25596a;
        C1105f c1105f = C1105f.a.f25597a;
        this.f22932b = aVar;
        this.f22933c = c1104e;
        this.f22934d = c1105f;
    }

    @Override // N9.a
    public final Object get() {
        switch (this.f22931a) {
            case 0:
                return new g((Context) this.f22932b.get(), (r2.a) this.f22933c.get(), (r2.a) this.f22934d.get());
            default:
                return new l((Context) this.f22932b.get(), (String) this.f22933c.get(), ((Integer) this.f22934d.get()).intValue());
        }
    }

    public h(N n10) {
        r2.b bVar = b.a.f26146a;
        r2.c cVar = c.a.f26147a;
        this.f22932b = n10;
        this.f22933c = bVar;
        this.f22934d = cVar;
    }
}
