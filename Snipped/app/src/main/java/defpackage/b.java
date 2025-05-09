package defpackage;

/* compiled from: Token.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.b("exp")
    private final long f8271a;

    public final long a() {
        return this.f8271a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f8271a == ((b) obj).f8271a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8271a);
    }

    public final String toString() {
        return "Token(expDate=" + this.f8271a + ")";
    }
}
