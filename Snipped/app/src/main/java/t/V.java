package t;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: FocusMeteringControl.java */
/* loaded from: classes.dex */
public final class V extends CameraCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.a f27164a = null;

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void onCaptureCancelled() {
        CallbackToFutureAdapter.a aVar = this.f27164a;
        if (aVar != null) {
            s3.b.v("Camera is closed", aVar);
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
        CallbackToFutureAdapter.a aVar = this.f27164a;
        if (aVar != null) {
            aVar.b(cameraCaptureResult);
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
        CallbackToFutureAdapter.a aVar = this.f27164a;
        if (aVar != null) {
            aVar.c(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
        }
    }
}
