package t;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.CameraCaptureCallback;

/* compiled from: CaptureCallbackContainer.java */
/* loaded from: classes.dex */
public final class G extends CameraCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f27125a;

    public G(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f27125a = captureCallback;
    }
}
