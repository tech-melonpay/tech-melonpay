package P8;

import C.v;
import Ka.t;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MarkableInputStream.java */
/* loaded from: classes2.dex */
public final class f extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f3106a;

    /* renamed from: b, reason: collision with root package name */
    public long f3107b;

    /* renamed from: c, reason: collision with root package name */
    public long f3108c;

    /* renamed from: d, reason: collision with root package name */
    public long f3109d;

    /* renamed from: e, reason: collision with root package name */
    public long f3110e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3111f = true;

    /* renamed from: g, reason: collision with root package name */
    public final int f3112g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.BufferedInputStream] */
    public f(t.a aVar) {
        this.f3112g = -1;
        this.f3106a = aVar.markSupported() ? aVar : new BufferedInputStream(aVar, 4096);
        this.f3112g = 1024;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f3106a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3106a.close();
    }

    public final void d(long j10) {
        if (this.f3107b > this.f3109d || j10 < this.f3108c) {
            throw new IOException("Cannot reset");
        }
        this.f3106a.reset();
        j(this.f3108c, j10);
        this.f3107b = j10;
    }

    public final void i(long j10) {
        try {
            long j11 = this.f3108c;
            long j12 = this.f3107b;
            InputStream inputStream = this.f3106a;
            if (j11 >= j12 || j12 > this.f3109d) {
                this.f3108c = j12;
                inputStream.mark((int) (j10 - j12));
            } else {
                inputStream.reset();
                inputStream.mark((int) (j10 - this.f3108c));
                j(this.f3108c, this.f3107b);
            }
            this.f3109d = j10;
        } catch (IOException e10) {
            throw new IllegalStateException(v.m("Unable to mark: ", e10));
        }
    }

    public final void j(long j10, long j11) {
        while (j10 < j11) {
            long skip = this.f3106a.skip(j11 - j10);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j10 += skip;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        long j10 = this.f3107b + i;
        if (this.f3109d < j10) {
            i(j10);
        }
        this.f3110e = this.f3107b;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f3106a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.f3111f) {
            long j10 = this.f3107b + 1;
            long j11 = this.f3109d;
            if (j10 > j11) {
                i(j11 + this.f3112g);
            }
        }
        int read = this.f3106a.read();
        if (read != -1) {
            this.f3107b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final void reset() {
        d(this.f3110e);
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        if (!this.f3111f) {
            long j11 = this.f3107b;
            if (j11 + j10 > this.f3109d) {
                i(j11 + j10 + this.f3112g);
            }
        }
        long skip = this.f3106a.skip(j10);
        this.f3107b += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (!this.f3111f) {
            long j10 = this.f3107b;
            if (bArr.length + j10 > this.f3109d) {
                i(j10 + bArr.length + this.f3112g);
            }
        }
        int read = this.f3106a.read(bArr);
        if (read != -1) {
            this.f3107b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i9) {
        if (!this.f3111f) {
            long j10 = this.f3107b;
            long j11 = i9;
            if (j10 + j11 > this.f3109d) {
                i(j10 + j11 + this.f3112g);
            }
        }
        int read = this.f3106a.read(bArr, i, i9);
        if (read != -1) {
            this.f3107b += read;
        }
        return read;
    }
}
