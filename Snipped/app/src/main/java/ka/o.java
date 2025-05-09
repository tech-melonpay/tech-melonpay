package Ka;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.kt */
/* loaded from: classes2.dex */
public final class o implements y {

    /* renamed from: a, reason: collision with root package name */
    public final i f2315a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f2316b;

    /* renamed from: c, reason: collision with root package name */
    public int f2317c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2318d;

    public o(t tVar, Inflater inflater) {
        this.f2315a = tVar;
        this.f2316b = inflater;
    }

    @Override // Ka.y
    public final z b() {
        return this.f2315a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2318d) {
            return;
        }
        this.f2316b.end();
        this.f2318d = true;
        this.f2315a.close();
    }

    public final long d(f fVar, long j10) {
        Inflater inflater = this.f2316b;
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.camera.core.impl.j.a("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f2318d)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            u Q4 = fVar.Q(1);
            int min = (int) Math.min(j10, 8192 - Q4.f2337c);
            boolean needsInput = inflater.needsInput();
            i iVar = this.f2315a;
            if (needsInput && !iVar.r()) {
                u uVar = iVar.getBuffer().f2293a;
                int i = uVar.f2337c;
                int i9 = uVar.f2336b;
                int i10 = i - i9;
                this.f2317c = i10;
                inflater.setInput(uVar.f2335a, i9, i10);
            }
            int inflate = inflater.inflate(Q4.f2335a, Q4.f2337c, min);
            int i11 = this.f2317c;
            if (i11 != 0) {
                int remaining = i11 - inflater.getRemaining();
                this.f2317c -= remaining;
                iVar.skip(remaining);
            }
            if (inflate > 0) {
                Q4.f2337c += inflate;
                long j11 = inflate;
                fVar.f2294b += j11;
                return j11;
            }
            if (Q4.f2336b == Q4.f2337c) {
                fVar.f2293a = Q4.a();
                v.a(Q4);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // Ka.y
    public final long i0(f fVar, long j10) {
        do {
            long d10 = d(fVar, j10);
            if (d10 > 0) {
                return d10;
            }
            Inflater inflater = this.f2316b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f2315a.r());
        throw new EOFException("source exhausted prematurely");
    }
}
