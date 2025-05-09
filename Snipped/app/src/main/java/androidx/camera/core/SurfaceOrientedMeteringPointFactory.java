package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;
import android.util.Size;

/* loaded from: classes.dex */
public class SurfaceOrientedMeteringPointFactory extends MeteringPointFactory {
    private final float mHeight;
    private final float mWidth;

    public SurfaceOrientedMeteringPointFactory(float f10, float f11) {
        this.mWidth = f10;
        this.mHeight = f11;
    }

    private static Rational getUseCaseAspectRatio(UseCase useCase) {
        if (useCase == null) {
            return null;
        }
        Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
        if (attachedSurfaceResolution != null) {
            return new Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        throw new IllegalStateException("UseCase " + useCase + " is not bound.");
    }

    @Override // androidx.camera.core.MeteringPointFactory
    public PointF convertPoint(float f10, float f11) {
        return new PointF(f10 / this.mWidth, f11 / this.mHeight);
    }

    public SurfaceOrientedMeteringPointFactory(float f10, float f11, UseCase useCase) {
        super(getUseCaseAspectRatio(useCase));
        this.mWidth = f10;
        this.mHeight = f11;
    }
}
