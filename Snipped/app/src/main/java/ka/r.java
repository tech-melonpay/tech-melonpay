package Ka;

/* compiled from: PeekSource.kt */
/* loaded from: classes2.dex */
public final class r implements y {

    /* renamed from: a, reason: collision with root package name */
    public final i f2322a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2323b;

    /* renamed from: c, reason: collision with root package name */
    public u f2324c;

    /* renamed from: d, reason: collision with root package name */
    public int f2325d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2326e;

    /* renamed from: f, reason: collision with root package name */
    public long f2327f;

    public r(i iVar) {
        this.f2322a = iVar;
        f buffer = iVar.getBuffer();
        this.f2323b = buffer;
        u uVar = buffer.f2293a;
        this.f2324c = uVar;
        this.f2325d = uVar != null ? uVar.f2336b : -1;
    }

    @Override // Ka.y
    public final z b() {
        return this.f2322a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2326e = true;
    }

    @Override // Ka.y
    public final long i0(f fVar, long j10) {
        u uVar;
        u uVar2;
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f2326e)) {
            throw new IllegalStateException("closed".toString());
        }
        u uVar3 = this.f2324c;
        f fVar2 = this.f2323b;
        if (uVar3 != null && (uVar3 != (uVar2 = fVar2.f2293a) || this.f2325d != uVar2.f2336b)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f2322a.O(this.f2327f + 1)) {
            return -1L;
        }
        if (this.f2324c == null && (uVar = fVar2.f2293a) != null) {
            this.f2324c = uVar;
            this.f2325d = uVar.f2336b;
        }
        long min = Math.min(j10, fVar2.f2294b - this.f2327f);
        this.f2323b.p(fVar, this.f2327f, min);
        this.f2327f += min;
        return min;
    }
}
