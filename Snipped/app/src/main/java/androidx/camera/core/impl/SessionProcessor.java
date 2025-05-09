package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import android.util.Pair;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.RestrictedCameraControl;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public interface SessionProcessor {
    void abortCapture(int i);

    void deInitSession();

    default Pair<Long, Long> getRealtimeCaptureLatency() {
        return null;
    }

    @RestrictedCameraControl.CameraOperation
    default Set<Integer> getSupportedCameraOperations() {
        return Collections.emptySet();
    }

    SessionConfig initSession(CameraInfo cameraInfo, OutputSurface outputSurface, OutputSurface outputSurface2, OutputSurface outputSurface3);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(RequestProcessor requestProcessor);

    void setParameters(Config config);

    int startCapture(CaptureCallback captureCallback);

    int startRepeating(CaptureCallback captureCallback);

    default int startTrigger(Config config, CaptureCallback captureCallback) {
        return -1;
    }

    void stopRepeating();

    public interface CaptureCallback {
        default void onCaptureFailed(int i) {
        }

        default void onCaptureProcessStarted(int i) {
        }

        default void onCaptureSequenceAborted(int i) {
        }

        default void onCaptureSequenceCompleted(int i) {
        }

        default void onCaptureStarted(int i, long j10) {
        }

        default void onCaptureCompleted(long j10, int i, Map<CaptureResult.Key, Object> map) {
        }
    }
}
