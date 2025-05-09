package androidx.camera.core.impl;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ZoomState;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.lifecycle.AbstractC0557x;
import androidx.lifecycle.C0559z;

/* loaded from: classes.dex */
public class RestrictedCameraInfo extends ForwardingCameraInfo {
    private final CameraInfoInternal mCameraInfo;
    private final RestrictedCameraControl mRestrictedCameraControl;

    public RestrictedCameraInfo(CameraInfoInternal cameraInfoInternal, RestrictedCameraControl restrictedCameraControl) {
        super(cameraInfoInternal);
        this.mCameraInfo = cameraInfoInternal;
        this.mRestrictedCameraControl = restrictedCameraControl;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public ExposureState getExposureState() {
        return !this.mRestrictedCameraControl.isOperationSupported(7) ? new ExposureState() { // from class: androidx.camera.core.impl.RestrictedCameraInfo.1
            @Override // androidx.camera.core.ExposureState
            public int getExposureCompensationIndex() {
                return 0;
            }

            @Override // androidx.camera.core.ExposureState
            public Range<Integer> getExposureCompensationRange() {
                return new Range<>(0, 0);
            }

            @Override // androidx.camera.core.ExposureState
            public Rational getExposureCompensationStep() {
                return Rational.ZERO;
            }

            @Override // androidx.camera.core.ExposureState
            public boolean isExposureCompensationSupported() {
                return false;
            }
        } : this.mCameraInfo.getExposureState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public CameraInfoInternal getImplementation() {
        return this.mCameraInfo;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public AbstractC0557x<Integer> getTorchState() {
        return !this.mRestrictedCameraControl.isOperationSupported(6) ? new C0559z(0) : this.mCameraInfo.getTorchState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public AbstractC0557x<ZoomState> getZoomState() {
        return !this.mRestrictedCameraControl.isOperationSupported(0) ? new C0559z(ImmutableZoomState.create(1.0f, 1.0f, 1.0f, 0.0f)) : this.mCameraInfo.getZoomState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        if (this.mRestrictedCameraControl.isOperationSupported(5)) {
            return this.mCameraInfo.hasFlashUnit();
        }
        return false;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        if (this.mRestrictedCameraControl.getModifiedFocusMeteringAction(focusMeteringAction) == null) {
            return false;
        }
        return this.mCameraInfo.isFocusMeteringSupported(focusMeteringAction);
    }
}
