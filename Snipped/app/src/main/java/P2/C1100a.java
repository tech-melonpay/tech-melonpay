package p2;

/* compiled from: AutoValue_EventStoreConfig.java */
/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100a extends AbstractC1103d {

    /* renamed from: b, reason: collision with root package name */
    public final long f25587b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25588c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25589d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25590e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25591f;

    public C1100a(long j10, int i, int i9, long j11, int i10) {
        this.f25587b = j10;
        this.f25588c = i;
        this.f25589d = i9;
        this.f25590e = j11;
        this.f25591f = i10;
    }

    @Override // p2.AbstractC1103d
    public final int a() {
        return this.f25589d;
    }

    @Override // p2.AbstractC1103d
    public final long b() {
        return this.f25590e;
    }

    @Override // p2.AbstractC1103d
    public final int c() {
        return this.f25588c;
    }

    @Override // p2.AbstractC1103d
    public final int d() {
        return this.f25591f;
    }

    @Override // p2.AbstractC1103d
    public final long e() {
        return this.f25587b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1103d)) {
            return false;
        }
        AbstractC1103d abstractC1103d = (AbstractC1103d) obj;
        return this.f25587b == abstractC1103d.e() && this.f25588c == abstractC1103d.c() && this.f25589d == abstractC1103d.a() && this.f25590e == abstractC1103d.b() && this.f25591f == abstractC1103d.d();
    }

    public final int hashCode() {
        long j10 = this.f25587b;
        int i = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f25588c) * 1000003) ^ this.f25589d) * 1000003;
        long j11 = this.f25590e;
        return ((i ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f25591f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f25587b);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f25588c);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f25589d);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f25590e);
        sb2.append(", maxBlobByteSizePerRow=");
        return s3.b.m(sb2, this.f25591f, "}");
    }
}
