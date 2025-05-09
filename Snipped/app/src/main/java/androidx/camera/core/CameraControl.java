package androidx.camera.core;

import a3.InterfaceFutureC0509a;

/* loaded from: classes.dex */
public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }

        public OperationCanceledException(String str, Throwable th) {
            super(str, th);
        }
    }

    InterfaceFutureC0509a<Void> cancelFocusAndMetering();

    InterfaceFutureC0509a<Void> enableTorch(boolean z10);

    InterfaceFutureC0509a<Integer> setExposureCompensationIndex(int i);

    InterfaceFutureC0509a<Void> setLinearZoom(float f10);

    InterfaceFutureC0509a<Void> setZoomRatio(float f10);

    InterfaceFutureC0509a<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction);
}
