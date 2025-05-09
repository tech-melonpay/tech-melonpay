package androidx.camera.video.internal.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface AudioStream {

    public static class AudioStreamException extends Exception {
    }

    public interface a {
    }

    public static abstract class b {
        public abstract int a();

        public abstract long b();
    }

    void a(a aVar, Executor executor);

    e read(ByteBuffer byteBuffer);

    void release();

    void start();

    void stop();
}
