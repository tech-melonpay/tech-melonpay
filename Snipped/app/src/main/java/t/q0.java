package t;

import androidx.camera.core.ZoomState;

/* compiled from: ZoomStateImpl.java */
/* loaded from: classes.dex */
public final class q0 implements ZoomState {

    /* renamed from: a, reason: collision with root package name */
    public float f27332a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27333b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27334c;

    /* renamed from: d, reason: collision with root package name */
    public float f27335d;

    public q0(float f10, float f11) {
        this.f27333b = f10;
        this.f27334c = f11;
    }

    public final void a(float f10) {
        if (f10 > 1.0f || f10 < 0.0f) {
            throw new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]");
        }
        this.f27335d = f10;
        float f11 = this.f27333b;
        if (f10 != 1.0f) {
            float f12 = this.f27334c;
            if (f10 == 0.0f) {
                f11 = f12;
            } else {
                double d10 = 1.0f / f12;
                double d11 = 1.0d / ((((1.0f / f11) - d10) * f10) + d10);
                double d12 = f12;
                double d13 = f11;
                if (d11 < d12) {
                    d11 = d12;
                } else if (d11 > d13) {
                    d11 = d13;
                }
                f11 = (float) d11;
            }
        }
        this.f27332a = f11;
    }

    public final void b(float f10) {
        float f11 = this.f27333b;
        float f12 = this.f27334c;
        if (f10 > f11 || f10 < f12) {
            throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + f12 + " , " + f11 + "]");
        }
        this.f27332a = f10;
        float f13 = 0.0f;
        if (f11 != f12) {
            if (f10 == f11) {
                f13 = 1.0f;
            } else if (f10 != f12) {
                float f14 = 1.0f / f12;
                f13 = ((1.0f / f10) - f14) / ((1.0f / f11) - f14);
            }
        }
        this.f27335d = f13;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getLinearZoom() {
        return this.f27335d;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getMaxZoomRatio() {
        return this.f27333b;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getMinZoomRatio() {
        return this.f27334c;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getZoomRatio() {
        return this.f27332a;
    }
}
