package t;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import androidx.camera.core.ExposureState;

/* compiled from: ExposureStateImpl.java */
/* loaded from: classes.dex */
public final class P implements ExposureState {

    /* renamed from: b, reason: collision with root package name */
    public final u.n f27151b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f27150a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f27152c = 0;

    public P(u.n nVar) {
        this.f27151b = nVar;
    }

    @Override // androidx.camera.core.ExposureState
    public final int getExposureCompensationIndex() {
        int i;
        synchronized (this.f27150a) {
            i = this.f27152c;
        }
        return i;
    }

    @Override // androidx.camera.core.ExposureState
    public final Range<Integer> getExposureCompensationRange() {
        return (Range) this.f27151b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // androidx.camera.core.ExposureState
    public final Rational getExposureCompensationStep() {
        return !isExposureCompensationSupported() ? Rational.ZERO : (Rational) this.f27151b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // androidx.camera.core.ExposureState
    public final boolean isExposureCompensationSupported() {
        Range range = (Range) this.f27151b.a(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }
}
