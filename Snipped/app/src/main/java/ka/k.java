package Ka;

/* compiled from: ForwardingSink.kt */
/* loaded from: classes2.dex */
public abstract class k implements w {

    /* renamed from: a, reason: collision with root package name */
    public final w f2307a;

    public k(w wVar) {
        this.f2307a = wVar;
    }

    @Override // Ka.w
    public final z b() {
        return this.f2307a.b();
    }

    @Override // Ka.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2307a.close();
    }

    @Override // Ka.w, java.io.Flushable
    public void flush() {
        this.f2307a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f2307a + ')';
    }

    @Override // Ka.w
    public void z(f fVar, long j10) {
        this.f2307a.z(fVar, j10);
    }
}
