package P9;

/* compiled from: IndexedValue.kt */
/* loaded from: classes2.dex */
public final class u<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f3164a;

    /* renamed from: b, reason: collision with root package name */
    public final T f3165b;

    public u(int i, T t3) {
        this.f3164a = i;
        this.f3165b = t3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f3164a == uVar.f3164a && kotlin.jvm.internal.f.b(this.f3165b, uVar.f3165b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f3164a) * 31;
        T t3 = this.f3165b;
        return hashCode + (t3 == null ? 0 : t3.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f3164a + ", value=" + this.f3165b + ')';
    }
}
