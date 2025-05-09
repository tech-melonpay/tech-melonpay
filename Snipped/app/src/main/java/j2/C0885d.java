package j2;

import C.N;
import android.content.Context;
import j2.C0889h;
import java.util.concurrent.Executor;
import l2.C0981a;
import n2.C1062c;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0885d extends p {

    /* renamed from: a, reason: collision with root package name */
    public N9.a<Executor> f22432a;

    /* renamed from: b, reason: collision with root package name */
    public N f22433b;

    /* renamed from: c, reason: collision with root package name */
    public N9.a f22434c;

    /* renamed from: d, reason: collision with root package name */
    public N9.a<p2.j> f22435d;

    /* renamed from: e, reason: collision with root package name */
    public N9.a<o> f22436e;

    /* compiled from: DaggerTransportRuntimeComponent.java */
    /* renamed from: j2.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Context f22437a;

        public final C0885d a() {
            Context context = this.f22437a;
            if (context == null) {
                throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
            }
            C0885d c0885d = new C0885d();
            c0885d.f22432a = C0981a.a(C0889h.a.f22440a);
            N n10 = new N(context, 20);
            c0885d.f22433b = n10;
            c0885d.f22434c = C0981a.a(new B1.f(12, n10, new k2.h(n10)));
            N9.a<p2.j> a10 = C0981a.a(new C1062c(new k2.h((N9.a) c0885d.f22433b)));
            c0885d.f22435d = a10;
            N n11 = new N(22, (byte) 0);
            N n12 = c0885d.f22433b;
            C1062c c1062c = new C1062c(n12, a10, n11);
            N9.a<Executor> aVar = c0885d.f22432a;
            N9.a aVar2 = c0885d.f22434c;
            c0885d.f22436e = C0981a.a(new q(new q(aVar, aVar2, c1062c, a10, a10), new o2.d(n12, aVar2, a10, c1062c, aVar, a10), new C1062c(aVar, a10, c1062c, a10)));
            return c0885d;
        }
    }
}
