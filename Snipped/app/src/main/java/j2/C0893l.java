package j2;

import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* renamed from: j2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0893l implements g2.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set<g2.b> f22443a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0892k f22444b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0895n f22445c;

    public C0893l(Set set, C0884c c0884c, InterfaceC0895n interfaceC0895n) {
        this.f22443a = set;
        this.f22444b = c0884c;
        this.f22445c = interfaceC0895n;
    }

    @Override // g2.f
    public final C0894m a(String str, g2.b bVar, g2.d dVar) {
        Set<g2.b> set = this.f22443a;
        if (set.contains(bVar)) {
            return new C0894m(this.f22444b, str, bVar, dVar, this.f22445c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, set));
    }
}
