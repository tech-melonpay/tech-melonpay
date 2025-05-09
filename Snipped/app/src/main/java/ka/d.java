package Ka;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import ka.C0969n;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes2.dex */
public final class d implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2290a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2291b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2292c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f2290a = i;
        this.f2291b = obj;
        this.f2292c = obj2;
    }

    @Override // Ka.y
    public final z b() {
        switch (this.f2290a) {
            case 0:
                return (b) this.f2291b;
            default:
                return (z) this.f2292c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.f2291b;
        switch (this.f2290a) {
            case 0:
                y yVar = (y) this.f2292c;
                b bVar = (b) obj;
                bVar.i();
                try {
                    yVar.close();
                    O9.p pVar = O9.p.f3034a;
                    if (bVar.j()) {
                        throw bVar.k(null);
                    }
                    return;
                } catch (IOException e10) {
                    if (!bVar.j()) {
                        throw e10;
                    }
                    throw bVar.k(e10);
                } finally {
                    bVar.j();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // Ka.y
    public final long i0(f fVar, long j10) {
        String message;
        Object obj = this.f2291b;
        Object obj2 = this.f2292c;
        switch (this.f2290a) {
            case 0:
                y yVar = (y) obj2;
                b bVar = (b) obj;
                bVar.i();
                try {
                    long i02 = yVar.i0(fVar, j10);
                    if (bVar.j()) {
                        throw bVar.k(null);
                    }
                    return i02;
                } catch (IOException e10) {
                    if (bVar.j()) {
                        throw bVar.k(e10);
                    }
                    throw e10;
                } finally {
                    bVar.j();
                }
            default:
                if (j10 == 0) {
                    return 0L;
                }
                if (j10 < 0) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.j.a("byteCount < 0: ", j10).toString());
                }
                try {
                    ((z) obj2).f();
                    u Q4 = fVar.Q(1);
                    int read = ((InputStream) obj).read(Q4.f2335a, Q4.f2337c, (int) Math.min(j10, 8192 - Q4.f2337c));
                    if (read == -1) {
                        if (Q4.f2336b == Q4.f2337c) {
                            fVar.f2293a = Q4.a();
                            v.a(Q4);
                        }
                        return -1L;
                    }
                    Q4.f2337c += read;
                    long j11 = read;
                    fVar.f2294b += j11;
                    return j11;
                } catch (AssertionError e11) {
                    Logger logger = p.f2319a;
                    if (e11.getCause() == null || (message = e11.getMessage()) == null || !C0969n.Y(message, "getsockname failed", false)) {
                        throw e11;
                    }
                    throw new IOException(e11);
                }
        }
    }

    public final String toString() {
        switch (this.f2290a) {
            case 0:
                return "AsyncTimeout.source(" + ((y) this.f2292c) + ')';
            default:
                return "source(" + ((InputStream) this.f2291b) + ')';
        }
    }
}
