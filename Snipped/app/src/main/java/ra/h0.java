package ra;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* compiled from: NullableSerializer.kt */
/* loaded from: classes2.dex */
public final class h0 implements pa.f, InterfaceC1177l {

    /* renamed from: a, reason: collision with root package name */
    public final pa.f f26401a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26402b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<String> f26403c;

    public h0(pa.f fVar) {
        this.f26401a = fVar;
        this.f26402b = fVar.a() + '?';
        this.f26403c = a0.b(fVar);
    }

    @Override // pa.f
    public final String a() {
        return this.f26402b;
    }

    @Override // ra.InterfaceC1177l
    public final Set<String> b() {
        return this.f26403c;
    }

    @Override // pa.f
    public final boolean c() {
        return true;
    }

    @Override // pa.f
    public final int d(String str) {
        return this.f26401a.d(str);
    }

    @Override // pa.f
    public final pa.g e() {
        return this.f26401a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return kotlin.jvm.internal.f.b(this.f26401a, ((h0) obj).f26401a);
        }
        return false;
    }

    @Override // pa.f
    public final int f() {
        return this.f26401a.f();
    }

    @Override // pa.f
    public final String g(int i) {
        return this.f26401a.g(i);
    }

    @Override // pa.f
    public final List<Annotation> getAnnotations() {
        return this.f26401a.getAnnotations();
    }

    @Override // pa.f
    public final List<Annotation> h(int i) {
        return this.f26401a.h(i);
    }

    public final int hashCode() {
        return this.f26401a.hashCode() * 31;
    }

    @Override // pa.f
    public final pa.f i(int i) {
        return this.f26401a.i(i);
    }

    @Override // pa.f
    public final boolean isInline() {
        return this.f26401a.isInline();
    }

    @Override // pa.f
    public final boolean j(int i) {
        return this.f26401a.j(i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26401a);
        sb2.append('?');
        return sb2.toString();
    }
}
