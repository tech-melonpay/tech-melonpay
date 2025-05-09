package androidx.camera.core.impl;

import a3.InterfaceFutureC0509a;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public class RestrictedCameraControl extends ForwardingCameraControl {
    public static final int AE_REGION = 3;
    public static final int AF_REGION = 2;
    public static final int AUTO_FOCUS = 1;
    public static final int AWB_REGION = 4;
    public static final int EXPOSURE_COMPENSATION = 7;
    public static final int FLASH = 5;
    public static final int TORCH = 6;
    public static final int ZOOM = 0;
    private final CameraControlInternal mCameraControl;

    @CameraOperation
    private volatile Set<Integer> mRestrictedCameraOperations;
    private volatile boolean mUseRestrictedCameraOperations;

    public @interface CameraOperation {
    }

    public RestrictedCameraControl(CameraControlInternal cameraControlInternal) {
        super(cameraControlInternal);
        this.mUseRestrictedCameraOperations = false;
        this.mCameraControl = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public InterfaceFutureC0509a<Void> cancelFocusAndMetering() {
        return this.mCameraControl.cancelFocusAndMetering();
    }

    public void enableRestrictedOperations(boolean z10, @CameraOperation Set<Integer> set) {
        this.mUseRestrictedCameraOperations = z10;
        this.mRestrictedCameraOperations = set;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public InterfaceFutureC0509a<Void> enableTorch(boolean z10) {
        return !isOperationSupported(6) ? Futures.immediateFailedFuture(new IllegalStateException("Torch is not supported")) : this.mCameraControl.enableTorch(z10);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    public CameraControlInternal getImplementation() {
        return this.mCameraControl;
    }

    public FocusMeteringAction getModifiedFocusMeteringAction(FocusMeteringAction focusMeteringAction) {
        boolean z10;
        FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(focusMeteringAction);
        boolean z11 = true;
        if (focusMeteringAction.getMeteringPointsAf().isEmpty() || isOperationSupported(1, 2)) {
            z10 = false;
        } else {
            builder.removePoints(1);
            z10 = true;
        }
        if (focusMeteringAction.getMeteringPointsAe().isEmpty() || isOperationSupported(3)) {
            z11 = z10;
        } else {
            builder.removePoints(2);
        }
        if (!focusMeteringAction.getMeteringPointsAwb().isEmpty() && !isOperationSupported(4)) {
            builder.removePoints(4);
        } else if (!z11) {
            return focusMeteringAction;
        }
        FocusMeteringAction build = builder.build();
        if (build.getMeteringPointsAf().isEmpty() && build.getMeteringPointsAe().isEmpty() && build.getMeteringPointsAwb().isEmpty()) {
            return null;
        }
        return builder.build();
    }

    public boolean isOperationSupported(@CameraOperation int... iArr) {
        if (!this.mUseRestrictedCameraOperations || this.mRestrictedCameraOperations == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return this.mRestrictedCameraOperations.containsAll(arrayList);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public InterfaceFutureC0509a<Integer> setExposureCompensationIndex(int i) {
        return !isOperationSupported(7) ? Futures.immediateFailedFuture(new IllegalStateException("ExposureCompensation is not supported")) : this.mCameraControl.setExposureCompensationIndex(i);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public InterfaceFutureC0509a<Void> setLinearZoom(float f10) {
        return !isOperationSupported(0) ? Futures.immediateFailedFuture(new IllegalStateException("Zoom is not supported")) : this.mCameraControl.setLinearZoom(f10);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public InterfaceFutureC0509a<Void> setZoomRatio(float f10) {
        return !isOperationSupported(0) ? Futures.immediateFailedFuture(new IllegalStateException("Zoom is not supported")) : this.mCameraControl.setZoomRatio(f10);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public InterfaceFutureC0509a<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        FocusMeteringAction modifiedFocusMeteringAction = getModifiedFocusMeteringAction(focusMeteringAction);
        return modifiedFocusMeteringAction == null ? Futures.immediateFailedFuture(new IllegalStateException("FocusMetering is not supported")) : this.mCameraControl.startFocusAndMetering(modifiedFocusMeteringAction);
    }
}
