package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.CaptureSession;
import androidx.camera.camera2.internal.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CaptureSession f5256a;

    public final void a() {
        CaptureSession captureSession = this.f5256a;
        synchronized (captureSession.f5177a) {
            try {
                if (captureSession.f5187l == CaptureSession.State.f5198e) {
                    captureSession.l(captureSession.f5183g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
