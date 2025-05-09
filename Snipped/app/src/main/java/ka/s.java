package Ka;

import java.nio.ByteBuffer;
import okio.ByteString;

/* compiled from: RealBufferedSink.kt */
/* loaded from: classes2.dex */
public final class s implements h {

    /* renamed from: a, reason: collision with root package name */
    public final w f2328a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2329b = new f();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2330c;

    public s(w wVar) {
        this.f2328a = wVar;
    }

    @Override // Ka.h
    public final h F(String str) {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2329b.o0(str);
        v();
        return this;
    }

    @Override // Ka.h
    public final h L(long j10) {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2329b.a0(j10);
        v();
        return this;
    }

    @Override // Ka.h
    public final h X(byte[] bArr) {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f2329b;
        fVar.getClass();
        fVar.V(bArr, 0, bArr.length);
        v();
        return this;
    }

    @Override // Ka.h
    public final h Z(ByteString byteString) {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2329b.T(byteString);
        v();
        return this;
    }

    @Override // Ka.w
    public final z b() {
        return this.f2328a.b();
    }

    @Override // Ka.h
    public final long c0(y yVar) {
        long j10 = 0;
        while (true) {
            long i02 = yVar.i0(this.f2329b, 8192L);
            if (i02 == -1) {
                return j10;
            }
            j10 += i02;
            v();
        }
    }

    @Override // Ka.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.f2328a;
        if (this.f2330c) {
            return;
        }
        try {
            f fVar = this.f2329b;
            long j10 = fVar.f2294b;
            if (j10 > 0) {
                wVar.z(fVar, j10);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            wVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f2330c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // Ka.h
    public final h e0(int i, int i9, byte[] bArr) {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2329b.V(bArr, i, i9);
        v();
        return this;
    }

    @Override // Ka.h, Ka.w, java.io.Flushable
    public final void flush() {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f2329b;
        long j10 = fVar.f2294b;
        w wVar = this.f2328a;
        if (j10 > 0) {
            wVar.z(fVar, j10);
        }
        wVar.flush();
    }

    @Override // Ka.h
    public final f getBuffer() {
        return this.f2329b;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2330c;
    }

    @Override // Ka.h
    public final h j0(long j10) {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2329b.Y(j10);
        v();
        return this;
    }

    @Override // Ka.h
    public final h k() {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f2329b;
        long j10 = fVar.f2294b;
        if (j10 > 0) {
            this.f2328a.z(fVar, j10);
        }
        return this;
    }

    @Override // Ka.h
    public final h l(int i) {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2329b.g0(i);
        v();
        return this;
    }

    @Override // Ka.h
    public final h o(int i) {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2329b.d0(i);
        v();
        return this;
    }

    @Override // Ka.h
    public final h s(int i) {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2329b.W(i);
        v();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f2328a + ')';
    }

    @Override // Ka.h
    public final h v() {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f2329b;
        long j10 = fVar.j();
        if (j10 > 0) {
            this.f2328a.z(fVar, j10);
        }
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.f2329b.write(byteBuffer);
        v();
        return write;
    }

    @Override // Ka.w
    public final void z(f fVar, long j10) {
        if (!(!this.f2330c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2329b.z(fVar, j10);
        v();
    }
}
