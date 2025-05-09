package I5;

/* compiled from: TFARequest.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("code")
    private final String f1876a;

    /* renamed from: b, reason: collision with root package name */
    @l3.b("type")
    private final int f1877b;

    public final String a() {
        return this.f1876a;
    }

    public final int b() {
        return this.f1877b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.f.b(this.f1876a, rVar.f1876a) && this.f1877b == rVar.f1877b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1877b) + (this.f1876a.hashCode() * 31);
    }

    public final String toString() {
        return "TFARequest(code=" + this.f1876a + ", type=" + this.f1877b + ")";
    }
}
