package o2;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import j2.AbstractC0892k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import k2.j;
import p2.InterfaceC1102c;
import p2.h;
import q2.InterfaceC1129a;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24347a;

    /* renamed from: b, reason: collision with root package name */
    public final k2.d f24348b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1102c f24349c;

    /* renamed from: d, reason: collision with root package name */
    public final f f24350d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f24351e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1129a f24352f;

    /* renamed from: g, reason: collision with root package name */
    public final r2.a f24353g;

    public c(Context context, k2.d dVar, InterfaceC1102c interfaceC1102c, f fVar, Executor executor, InterfaceC1129a interfaceC1129a, r2.a aVar) {
        this.f24347a = context;
        this.f24348b = dVar;
        this.f24349c = interfaceC1102c;
        this.f24350d = fVar;
        this.f24351e = executor;
        this.f24352f = interfaceC1129a;
        this.f24353g = aVar;
    }

    public final void a(final AbstractC0892k abstractC0892k, final int i) {
        com.google.android.datatransport.runtime.backends.a b9;
        j jVar = this.f24348b.get(abstractC0892k.b());
        B.e eVar = new B.e(6, this, abstractC0892k);
        InterfaceC1129a interfaceC1129a = this.f24352f;
        final Iterable iterable = (Iterable) interfaceC1129a.d(eVar);
        if (iterable.iterator().hasNext()) {
            if (jVar == null) {
                j3.e.j("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC0892k);
                b9 = new com.google.android.datatransport.runtime.backends.a(BackendResponse.Status.f8956c, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((h) it.next()).a());
                }
                b9 = jVar.b(new k2.a(arrayList, abstractC0892k.c()));
            }
            final com.google.android.datatransport.runtime.backends.a aVar = b9;
            interfaceC1129a.d(new InterfaceC1129a.InterfaceC0457a() { // from class: o2.b
                @Override // q2.InterfaceC1129a.InterfaceC0457a
                public final Object execute() {
                    c cVar = c.this;
                    cVar.getClass();
                    BackendResponse backendResponse = aVar;
                    BackendResponse.Status b10 = backendResponse.b();
                    BackendResponse.Status status = BackendResponse.Status.f8955b;
                    Iterable<h> iterable2 = iterable;
                    AbstractC0892k abstractC0892k2 = abstractC0892k;
                    f fVar = cVar.f24350d;
                    InterfaceC1102c interfaceC1102c = cVar.f24349c;
                    if (b10 == status) {
                        interfaceC1102c.f0(iterable2);
                        fVar.b(abstractC0892k2, i + 1);
                        return null;
                    }
                    interfaceC1102c.f(iterable2);
                    if (backendResponse.b() == BackendResponse.Status.f8954a) {
                        interfaceC1102c.u(backendResponse.a() + cVar.f24353g.a(), abstractC0892k2);
                    }
                    if (!interfaceC1102c.K(abstractC0892k2)) {
                        return null;
                    }
                    fVar.a(abstractC0892k2, 1, true);
                    return null;
                }
            });
        }
    }
}
