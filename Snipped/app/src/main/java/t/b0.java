package t;

import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurfaces;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProcessingCaptureSession f27198b;

    public /* synthetic */ b0(ProcessingCaptureSession processingCaptureSession, int i) {
        this.f27197a = i;
        this.f27198b = processingCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27197a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("== deInitSession (id=");
                ProcessingCaptureSession processingCaptureSession = this.f27198b;
                sb2.append(processingCaptureSession.f5219o);
                sb2.append(")");
                Logger.d("ProcessingCaptureSession", sb2.toString());
                processingCaptureSession.f5206a.deInitSession();
                break;
            default:
                DeferrableSurfaces.decrementAll(this.f27198b.f5211f);
                break;
        }
    }
}
