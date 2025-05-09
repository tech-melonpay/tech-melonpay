package I5;

/* compiled from: LivenessDomain.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f1751a;

    public f(Boolean bool) {
        this.f1751a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.f.b(this.f1751a, ((f) obj).f1751a);
    }

    public final int hashCode() {
        Boolean bool = this.f1751a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "LivenessDomain(isAlive=" + this.f1751a + ")";
    }
}
