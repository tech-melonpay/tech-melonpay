package t;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: Camera2CapturePipeline.java */
/* renamed from: t.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1266s extends CameraCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.a f27374a;

    public C1266s(CallbackToFutureAdapter.a aVar) {
        this.f27374a = aVar;
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void onCaptureCancelled() {
        this.f27374a.c(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
        this.f27374a.b(null);
    }

    @Override // androidx.camera.core.impl.CameraCaptureCallback
    public final void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
        this.f27374a.c(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.getReason(), null));
    }
}
