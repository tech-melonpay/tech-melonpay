package b3;

import b3.p;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: Registry.java */
/* loaded from: classes.dex */
public final class n implements p.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f8308a;

    public n(f fVar) {
        this.f8308a = fVar;
    }

    @Override // b3.p.a
    public final d a(Class cls) {
        try {
            return new d(this.f8308a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // b3.p.a
    public final d b() {
        f fVar = this.f8308a;
        return new d(fVar, fVar.f8294c);
    }

    @Override // b3.p.a
    public final Class<?> c() {
        return this.f8308a.getClass();
    }

    @Override // b3.p.a
    public final Set<Class<?>> d() {
        return this.f8308a.f8293b.keySet();
    }
}
