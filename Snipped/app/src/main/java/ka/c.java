package Ka;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes2.dex */
public final class c implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2287a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2288b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2289c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f2287a = i;
        this.f2288b = obj;
        this.f2289c = obj2;
    }

    @Override // Ka.w
    public final z b() {
        switch (this.f2287a) {
            case 0:
                return (b) this.f2288b;
            default:
                return (z) this.f2289c;
        }
    }

    @Override // Ka.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj = this.f2288b;
        switch (this.f2287a) {
            case 0:
                w wVar = (w) this.f2289c;
                b bVar = (b) obj;
                bVar.i();
                try {
                    wVar.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // Ka.w, java.io.Flushable
    public final void flush() {
        Object obj = this.f2288b;
        switch (this.f2287a) {
            case 0:
                w wVar = (w) this.f2289c;
                b bVar = (b) obj;
                bVar.i();
                try {
                    wVar.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f2287a) {
            case 0:
                return "AsyncTimeout.sink(" + ((w) this.f2289c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f2288b) + ')';
        }
    }

    @Override // Ka.w
    public final void z(f fVar, long j10) {
        Object obj = this.f2288b;
        Object obj2 = this.f2289c;
        switch (this.f2287a) {
            case 0:
                a.a(fVar.f2294b, 0L, j10);
                while (j10 > 0) {
                    u uVar = fVar.f2293a;
                    long j11 = 0;
                    while (true) {
                        if (j11 < 65536) {
                            j11 += uVar.f2337c - uVar.f2336b;
                            if (j11 >= j10) {
                                j11 = j10;
                            } else {
                                uVar = uVar.f2340f;
                            }
                        }
                    }
                    w wVar = (w) obj2;
                    b bVar = (b) obj;
                    bVar.i();
                    try {
                        wVar.z(fVar, j11);
                        O9.p pVar = O9.p.f3034a;
                        if (bVar.j()) {
                            throw bVar.k(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!bVar.j()) {
                            throw e10;
                        }
                        throw bVar.k(e10);
                    } finally {
                        bVar.j();
                    }
                }
                return;
            default:
                a.a(fVar.f2294b, 0L, j10);
                while (j10 > 0) {
                    ((z) obj2).f();
                    u uVar2 = fVar.f2293a;
                    int min = (int) Math.min(j10, uVar2.f2337c - uVar2.f2336b);
                    ((OutputStream) obj).write(uVar2.f2335a, uVar2.f2336b, min);
                    int i = uVar2.f2336b + min;
                    uVar2.f2336b = i;
                    long j12 = min;
                    j10 -= j12;
                    fVar.f2294b -= j12;
                    if (i == uVar2.f2337c) {
                        fVar.f2293a = uVar2.a();
                        v.a(uVar2);
                    }
                }
                return;
        }
    }
}
