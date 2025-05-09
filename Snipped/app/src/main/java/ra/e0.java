package ra;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: Primitives.kt */
/* loaded from: classes2.dex */
public final class e0 implements pa.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f26391a;

    /* renamed from: b, reason: collision with root package name */
    public final pa.e f26392b;

    public e0(String str, pa.e eVar) {
        this.f26391a = str;
        this.f26392b = eVar;
    }

    @Override // pa.f
    public final String a() {
        return this.f26391a;
    }

    @Override // pa.f
    public final boolean c() {
        return false;
    }

    @Override // pa.f
    public final int d(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // pa.f
    public final pa.g e() {
        return this.f26392b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (kotlin.jvm.internal.f.b(this.f26391a, e0Var.f26391a)) {
            if (kotlin.jvm.internal.f.b(this.f26392b, e0Var.f26392b)) {
                return true;
            }
        }
        return false;
    }

    @Override // pa.f
    public final int f() {
        return 0;
    }

    @Override // pa.f
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // pa.f
    public final List<Annotation> getAnnotations() {
        return EmptyList.f23104a;
    }

    @Override // pa.f
    public final List<Annotation> h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f26392b.hashCode() * 31) + this.f26391a.hashCode();
    }

    @Override // pa.f
    public final pa.f i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // pa.f
    public final boolean isInline() {
        return false;
    }

    @Override // pa.f
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return C.v.q(new StringBuilder("PrimitiveDescriptor("), this.f26391a, ')');
    }
}
