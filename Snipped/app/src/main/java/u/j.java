package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: CameraCaptureSessionCompatApi28Impl.java */
/* loaded from: classes.dex */
public final class j extends k {
    @Override // u.k, u.f.a
    public final int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f30054a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    @Override // u.k, u.f.a
    public final int b(ArrayList arrayList, Executor executor, androidx.camera.camera2.internal.h hVar) {
        return this.f30054a.captureBurstRequests(arrayList, executor, hVar);
    }
}
