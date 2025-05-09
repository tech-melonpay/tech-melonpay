package Ka;

/* compiled from: ForwardingSource.kt */
/* loaded from: classes2.dex */
public abstract class l implements y {

    /* renamed from: a, reason: collision with root package name */
    public final y f2308a;

    public l(y yVar) {
        this.f2308a = yVar;
    }

    @Override // Ka.y
    public final z b() {
        return this.f2308a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2308a.close();
    }

    @Override // Ka.y
    public long i0(f fVar, long j10) {
        return this.f2308a.i0(fVar, j10);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f2308a + ')';
    }
}
