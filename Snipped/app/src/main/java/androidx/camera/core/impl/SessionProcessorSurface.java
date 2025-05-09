package androidx.camera.core.impl;

import a3.InterfaceFutureC0509a;
import android.view.Surface;
import androidx.camera.core.impl.utils.futures.Futures;

/* loaded from: classes.dex */
public final class SessionProcessorSurface extends DeferrableSurface {
    private final int mOutputConfigId;
    private final Surface mSurface;

    public SessionProcessorSurface(Surface surface, int i) {
        this.mSurface = surface;
        this.mOutputConfigId = i;
    }

    public int getOutputConfigId() {
        return this.mOutputConfigId;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public InterfaceFutureC0509a<Surface> provideSurface() {
        return Futures.immediateFuture(this.mSurface);
    }
}
