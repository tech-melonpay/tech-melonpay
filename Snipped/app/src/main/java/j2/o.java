package j2;

import android.content.Context;
import c.RunnableC0615f;
import h2.C0794a;
import j2.C0884c;
import j2.C0885d;
import java.util.Collections;
import java.util.Set;
import n2.InterfaceC1061b;

/* compiled from: TransportRuntime.java */
/* loaded from: classes.dex */
public final class o implements InterfaceC0895n {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0885d f22451e;

    /* renamed from: a, reason: collision with root package name */
    public final r2.a f22452a;

    /* renamed from: b, reason: collision with root package name */
    public final r2.a f22453b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1061b f22454c;

    /* renamed from: d, reason: collision with root package name */
    public final o2.c f22455d;

    public o(r2.a aVar, r2.a aVar2, InterfaceC1061b interfaceC1061b, o2.c cVar, o2.e eVar) {
        this.f22452a = aVar;
        this.f22453b = aVar2;
        this.f22454c = interfaceC1061b;
        this.f22455d = cVar;
        eVar.getClass();
        eVar.f24361a.execute(new RunnableC0615f(eVar, 14));
    }

    public static o a() {
        C0885d c0885d = f22451e;
        if (c0885d != null) {
            return c0885d.f22436e.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f22451e == null) {
            synchronized (o.class) {
                try {
                    if (f22451e == null) {
                        C0885d.a aVar = new C0885d.a();
                        context.getClass();
                        aVar.f22437a = context;
                        f22451e = aVar.a();
                    }
                } finally {
                }
            }
        }
    }

    public final C0893l c(C0794a c0794a) {
        Set singleton;
        if (c0794a instanceof InterfaceC0886e) {
            c0794a.getClass();
            singleton = Collections.unmodifiableSet(C0794a.f21025d);
        } else {
            singleton = Collections.singleton(new g2.b("proto"));
        }
        C0884c.a a10 = AbstractC0892k.a();
        c0794a.getClass();
        a10.b("cct");
        a10.f22430b = c0794a.b();
        return new C0893l(singleton, a10.a(), this);
    }
}
