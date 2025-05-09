package ra;

import ia.InterfaceC0835c;
import java.util.List;

/* compiled from: Caching.kt */
/* loaded from: classes2.dex */
public final class I implements ia.k {

    /* renamed from: a, reason: collision with root package name */
    public final ia.k f26355a;

    public I(ia.k kVar) {
        this.f26355a = kVar;
    }

    @Override // ia.k
    public final List<ia.l> a() {
        return this.f26355a.a();
    }

    @Override // ia.k
    public final boolean c() {
        return this.f26355a.c();
    }

    @Override // ia.k
    public final InterfaceC0835c e() {
        return this.f26355a.e();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        I i = obj instanceof I ? (I) obj : null;
        ia.k kVar = i != null ? i.f26355a : null;
        ia.k kVar2 = this.f26355a;
        if (!kotlin.jvm.internal.f.b(kVar2, kVar)) {
            return false;
        }
        InterfaceC0835c e10 = kVar2.e();
        if (e10 instanceof InterfaceC0835c) {
            ia.k kVar3 = obj instanceof ia.k ? (ia.k) obj : null;
            InterfaceC0835c e11 = kVar3 != null ? kVar3.e() : null;
            if (e11 != null && (e11 instanceof InterfaceC0835c)) {
                return kotlin.jvm.internal.f.b(((kotlin.jvm.internal.a) e10).g(), ((kotlin.jvm.internal.a) e11).g());
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26355a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f26355a;
    }
}
