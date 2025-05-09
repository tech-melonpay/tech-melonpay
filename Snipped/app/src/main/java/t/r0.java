package t;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.core.internal.compat.ImageWriterCompat;

/* compiled from: ZslControlImpl.java */
/* loaded from: classes.dex */
public final class r0 extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f27373a;

    public r0(s0 s0Var) {
        this.f27373a = s0Var;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface inputSurface = cameraCaptureSession.getInputSurface();
        if (inputSurface != null) {
            this.f27373a.f27383j = ImageWriterCompat.newInstance(inputSurface, 1);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
    }
}
