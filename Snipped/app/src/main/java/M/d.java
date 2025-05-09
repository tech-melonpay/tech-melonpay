package M;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.camera.core.MeteringPointFactory;

/* compiled from: PreviewViewMeteringPointFactory.java */
/* loaded from: classes.dex */
public final class d extends MeteringPointFactory {

    /* renamed from: c, reason: collision with root package name */
    public static final PointF f2507c = new PointF(2.0f, 2.0f);

    /* renamed from: a, reason: collision with root package name */
    public final androidx.camera.view.b f2508a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f2509b;

    public d(androidx.camera.view.b bVar) {
        this.f2508a = bVar;
    }

    @Override // androidx.camera.core.MeteringPointFactory
    public final PointF convertPoint(float f10, float f11) {
        float[] fArr = {f10, f11};
        synchronized (this) {
            try {
                Matrix matrix = this.f2509b;
                if (matrix == null) {
                    return f2507c;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
