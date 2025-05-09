package C;

/* compiled from: AutoValue_RecordingStats.java */
/* renamed from: C.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492h extends D {

    /* renamed from: a, reason: collision with root package name */
    public final long f554a;

    /* renamed from: b, reason: collision with root package name */
    public final long f555b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0485a f556c;

    public C0492h(long j10, long j11, C0486b c0486b) {
        this.f554a = j10;
        this.f555b = j11;
        this.f556c = c0486b;
    }

    @Override // C.D
    public final AbstractC0485a a() {
        return this.f556c;
    }

    @Override // C.D
    public final long b() {
        return this.f555b;
    }

    @Override // C.D
    public final long c() {
        return this.f554a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return this.f554a == d10.c() && this.f555b == d10.b() && this.f556c.equals(d10.a());
    }

    public final int hashCode() {
        long j10 = this.f554a;
        int i = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f555b;
        return ((i ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f556c.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f554a + ", numBytesRecorded=" + this.f555b + ", audioStats=" + this.f556c + "}";
    }
}
