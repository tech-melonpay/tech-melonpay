package Ka;

import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: DeflaterSink.kt */
/* loaded from: classes2.dex */
public final class j implements w {

    /* renamed from: a, reason: collision with root package name */
    public final h f2304a;

    /* renamed from: b, reason: collision with root package name */
    public final Deflater f2305b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2306c;

    public j(f fVar, Deflater deflater) {
        this.f2304a = new s(fVar);
        this.f2305b = deflater;
    }

    @Override // Ka.w
    public final z b() {
        return this.f2304a.b();
    }

    @Override // Ka.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Deflater deflater = this.f2305b;
        if (this.f2306c) {
            return;
        }
        try {
            deflater.finish();
            d(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f2304a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f2306c = true;
        if (th != null) {
            throw th;
        }
    }

    public final void d(boolean z10) {
        u Q4;
        int deflate;
        h hVar = this.f2304a;
        f buffer = hVar.getBuffer();
        while (true) {
            Q4 = buffer.Q(1);
            Deflater deflater = this.f2305b;
            byte[] bArr = Q4.f2335a;
            if (z10) {
                try {
                    int i = Q4.f2337c;
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                int i9 = Q4.f2337c;
                deflate = deflater.deflate(bArr, i9, 8192 - i9);
            }
            if (deflate > 0) {
                Q4.f2337c += deflate;
                buffer.f2294b += deflate;
                hVar.v();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (Q4.f2336b == Q4.f2337c) {
            buffer.f2293a = Q4.a();
            v.a(Q4);
        }
    }

    @Override // Ka.w, java.io.Flushable
    public final void flush() {
        d(true);
        this.f2304a.flush();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f2304a + ')';
    }

    @Override // Ka.w
    public final void z(f fVar, long j10) {
        a.a(fVar.f2294b, 0L, j10);
        while (j10 > 0) {
            u uVar = fVar.f2293a;
            int min = (int) Math.min(j10, uVar.f2337c - uVar.f2336b);
            this.f2305b.setInput(uVar.f2335a, uVar.f2336b, min);
            d(false);
            long j11 = min;
            fVar.f2294b -= j11;
            int i = uVar.f2336b + min;
            uVar.f2336b = i;
            if (i == uVar.f2337c) {
                fVar.f2293a = uVar.a();
                v.a(uVar);
            }
            j10 -= j11;
        }
    }
}
