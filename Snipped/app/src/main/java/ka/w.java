package Ka;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: Sink.kt */
/* loaded from: classes2.dex */
public interface w extends Closeable, Flushable {
    z b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void z(f fVar, long j10);
}
