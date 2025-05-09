package androidx.camera.core.impl;

import a3.InterfaceFutureC0509a;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.utils.futures.Futures;

/* loaded from: classes.dex */
public final class ImmediateSurface extends DeferrableSurface {
    private final Surface mSurface;

    public ImmediateSurface(Surface surface, Size size, int i) {
        super(size, i);
        this.mSurface = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public InterfaceFutureC0509a<Surface> provideSurface() {
        return Futures.immediateFuture(this.mSurface);
    }

    public ImmediateSurface(Surface surface) {
        this.mSurface = surface;
    }
}
