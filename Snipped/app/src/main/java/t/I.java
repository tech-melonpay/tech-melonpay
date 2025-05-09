package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.SessionConfig;
import java.util.Collections;

/* compiled from: CaptureSession.java */
/* loaded from: classes.dex */
public final class I extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CaptureSession f27126a;

    public I(CaptureSession captureSession) {
        this.f27126a = captureSession;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        synchronized (this.f27126a.f5177a) {
            try {
                SessionConfig sessionConfig = this.f27126a.f5183g;
                if (sessionConfig == null) {
                    return;
                }
                CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
                Logger.d("CaptureSession", "Submit FLASH_MODE_OFF request");
                CaptureSession captureSession = this.f27126a;
                captureSession.f5192q.getClass();
                captureSession.d(Collections.singletonList(x.n.a(repeatingCaptureConfig)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
