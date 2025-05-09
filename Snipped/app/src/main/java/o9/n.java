package O9;

/* compiled from: UShort.kt */
/* loaded from: classes2.dex */
public final class n implements Comparable<n> {

    /* renamed from: a, reason: collision with root package name */
    public final short f3030a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(n nVar) {
        return kotlin.jvm.internal.f.c(this.f3030a & 65535, nVar.f3030a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f3030a == ((n) obj).f3030a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f3030a);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f3030a);
    }
}
