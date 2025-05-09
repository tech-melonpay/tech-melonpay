package androidx.camera.core.processing;

import a3.InterfaceFutureC0509a;
import androidx.camera.core.SurfaceProcessor;
import androidx.camera.core.impl.utils.futures.Futures;

/* loaded from: classes.dex */
public interface SurfaceProcessorInternal extends SurfaceProcessor {
    void release();

    default InterfaceFutureC0509a<Void> snapshot(int i, int i9) {
        return Futures.immediateFuture(null);
    }
}
