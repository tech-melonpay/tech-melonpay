package M;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: PreviewStreamStateObserver.java */
/* loaded from: classes.dex */
public final class c extends CameraCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.a f2505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraInfo f2506b;

    public c(CallbackToFutureAdapter.a aVar, CameraInfo cameraInfo) {
        this.f2505a = aVar;
        this.f2506b = cameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
        this.f2505a.b(null);
        ((CameraInfoInternal) this.f2506b).removeSessionCaptureCallback(this);
    }
}
