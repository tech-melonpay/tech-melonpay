package androidx.camera.core;

import android.graphics.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import x0.InterfaceC1579a;

/* loaded from: classes.dex */
public interface SurfaceOutput extends Closeable {

    public static abstract class Event {
        public static final int EVENT_REQUEST_CLOSE = 0;

        @Retention(RetentionPolicy.SOURCE)
        public @interface EventCode {
        }

        public static Event of(int i, SurfaceOutput surfaceOutput) {
            return new AutoValue_SurfaceOutput_Event(i, surfaceOutput);
        }

        public abstract int getEventCode();

        public abstract SurfaceOutput getSurfaceOutput();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    default int getFormat() {
        return 34;
    }

    default Matrix getSensorToBufferTransform() {
        return new Matrix();
    }

    Size getSize();

    Surface getSurface(Executor executor, InterfaceC1579a<Event> interfaceC1579a);

    int getTargets();

    void updateTransformMatrix(float[] fArr, float[] fArr2);
}
