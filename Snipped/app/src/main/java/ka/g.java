package Ka;

import java.io.OutputStream;

/* compiled from: Buffer.kt */
/* loaded from: classes2.dex */
public final class g extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f2303a;

    public g(f fVar) {
        this.f2303a = fVar;
    }

    public final String toString() {
        return this.f2303a + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f2303a.W(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i9) {
        this.f2303a.V(bArr, i, i9);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
