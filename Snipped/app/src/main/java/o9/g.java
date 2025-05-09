package O9;

/* compiled from: UByte.kt */
/* loaded from: classes2.dex */
public final class g implements Comparable<g> {

    /* renamed from: a, reason: collision with root package name */
    public final byte f3017a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(g gVar) {
        return kotlin.jvm.internal.f.c(this.f3017a & 255, gVar.f3017a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f3017a == ((g) obj).f3017a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f3017a);
    }

    public final String toString() {
        return String.valueOf(this.f3017a & 255);
    }
}
