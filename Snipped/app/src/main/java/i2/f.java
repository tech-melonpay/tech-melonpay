package i2;

/* compiled from: AutoValue_LogResponse.java */
/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    public final long f21317a;

    public f(long j10) {
        this.f21317a = j10;
    }

    @Override // i2.j
    public final long b() {
        return this.f21317a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof j) && this.f21317a == ((j) obj).b();
    }

    public final int hashCode() {
        long j10 = this.f21317a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f21317a + "}";
    }
}
