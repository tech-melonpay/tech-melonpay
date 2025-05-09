package t;

import androidx.camera.camera2.internal.ProcessingCaptureSession;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.SessionProcessor;

/* compiled from: ProcessingCaptureSession.java */
/* loaded from: classes.dex */
public final class d0 implements SessionProcessor.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CaptureConfig f27202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProcessingCaptureSession f27203b;

    public d0(ProcessingCaptureSession processingCaptureSession, CaptureConfig captureConfig) {
        this.f27203b = processingCaptureSession;
        this.f27202a = captureConfig;
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureFailed(int i) {
        this.f27203b.f5208c.execute(new c0(this.f27202a, 1));
    }

    @Override // androidx.camera.core.impl.SessionProcessor.CaptureCallback
    public final void onCaptureSequenceCompleted(int i) {
        this.f27203b.f5208c.execute(new c0(this.f27202a, 0));
    }
}
