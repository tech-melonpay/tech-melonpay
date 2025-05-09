package androidx.camera.core;

import android.graphics.PointF;
import android.util.Rational;

/* loaded from: classes.dex */
public abstract class MeteringPointFactory {
    private Rational mSurfaceAspectRatio;

    public MeteringPointFactory() {
        this(null);
    }

    public static float getDefaultPointSize() {
        return 0.15f;
    }

    public abstract PointF convertPoint(float f10, float f11);

    public final MeteringPoint createPoint(float f10, float f11) {
        return createPoint(f10, f11, getDefaultPointSize());
    }

    public MeteringPointFactory(Rational rational) {
        this.mSurfaceAspectRatio = rational;
    }

    public final MeteringPoint createPoint(float f10, float f11, float f12) {
        PointF convertPoint = convertPoint(f10, f11);
        return new MeteringPoint(convertPoint.x, convertPoint.y, f12, this.mSurfaceAspectRatio);
    }
}
