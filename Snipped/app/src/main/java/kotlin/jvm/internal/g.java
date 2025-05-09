package kotlin.jvm.internal;

/* compiled from: PackageReference.kt */
/* loaded from: classes2.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f23185a;

    public g(Class cls) {
        this.f23185a = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (f.b(this.f23185a, ((g) obj).f23185a)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.jvm.internal.a
    public final Class<?> g() {
        return this.f23185a;
    }

    public final int hashCode() {
        return this.f23185a.hashCode();
    }

    public final String toString() {
        return this.f23185a + " (Kotlin reflection is not available)";
    }
}
