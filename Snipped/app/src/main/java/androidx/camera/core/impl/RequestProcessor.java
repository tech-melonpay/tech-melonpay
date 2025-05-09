package androidx.camera.core.impl;

import java.util.List;

/* loaded from: classes.dex */
public interface RequestProcessor {

    public interface Request {
        Config getParameters();

        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void abortCaptures();

    int setRepeating(Request request, Callback callback);

    void stopRepeating();

    int submit(Request request, Callback callback);

    int submit(List<Request> list, Callback callback);

    public interface Callback {
        default void onCaptureSequenceAborted(int i) {
        }

        default void onCaptureCompleted(Request request, CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(Request request, CameraCaptureFailure cameraCaptureFailure) {
        }

        default void onCaptureProgressed(Request request, CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureSequenceCompleted(int i, long j10) {
        }

        default void onCaptureBufferLost(Request request, long j10, int i) {
        }

        default void onCaptureStarted(Request request, long j10, long j11) {
        }
    }
}
