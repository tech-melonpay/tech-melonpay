package androidx.camera.core.internal;

import androidx.camera.core.ZoomState;

/* loaded from: classes.dex */
public abstract class ImmutableZoomState implements ZoomState {
    public static ZoomState create(float f10, float f11, float f12, float f13) {
        return new AutoValue_ImmutableZoomState(f10, f11, f12, f13);
    }

    @Override // androidx.camera.core.ZoomState
    public abstract float getLinearZoom();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMaxZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMinZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getZoomRatio();

    public static ZoomState create(ZoomState zoomState) {
        return new AutoValue_ImmutableZoomState(zoomState.getZoomRatio(), zoomState.getMaxZoomRatio(), zoomState.getMinZoomRatio(), zoomState.getLinearZoom());
    }
}
