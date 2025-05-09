package t;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CaptureConfig f27200b;

    public /* synthetic */ c0(CaptureConfig captureConfig, int i) {
        this.f27199a = i;
        this.f27200b = captureConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27199a) {
            case 0:
                Iterator<CameraCaptureCallback> it = this.f27200b.getCameraCaptureCallbacks().iterator();
                while (it.hasNext()) {
                    it.next().onCaptureCompleted(new CameraCaptureResult.EmptyCameraCaptureResult());
                }
                break;
            case 1:
                Iterator<CameraCaptureCallback> it2 = this.f27200b.getCameraCaptureCallbacks().iterator();
                while (it2.hasNext()) {
                    it2.next().onCaptureFailed(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
                }
                break;
            case 2:
                Iterator<CameraCaptureCallback> it3 = this.f27200b.getCameraCaptureCallbacks().iterator();
                while (it3.hasNext()) {
                    it3.next().onCaptureCompleted(new CameraCaptureResult.EmptyCameraCaptureResult());
                }
                break;
            default:
                Iterator<CameraCaptureCallback> it4 = this.f27200b.getCameraCaptureCallbacks().iterator();
                while (it4.hasNext()) {
                    it4.next().onCaptureFailed(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
                }
                break;
        }
    }
}
