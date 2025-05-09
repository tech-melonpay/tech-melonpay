package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import pa.C1124b;

/* compiled from: SynchronizedCaptureSessionBaseImpl.java */
/* loaded from: classes.dex */
public final class q extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f5292a;

    public q(p pVar) {
        this.f5292a = pVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        p pVar = this.f5292a;
        pVar.r(cameraCaptureSession);
        pVar.j(pVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        p pVar = this.f5292a;
        pVar.r(cameraCaptureSession);
        pVar.k(pVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        p pVar = this.f5292a;
        pVar.r(cameraCaptureSession);
        pVar.l(pVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        CallbackToFutureAdapter.a<Void> aVar;
        try {
            this.f5292a.r(cameraCaptureSession);
            p pVar = this.f5292a;
            pVar.m(pVar);
            synchronized (this.f5292a.f5278a) {
                C1124b.p(this.f5292a.i, "OpenCaptureSession completer should not null");
                p pVar2 = this.f5292a;
                aVar = pVar2.i;
                pVar2.i = null;
            }
            aVar.c(new IllegalStateException("onConfigureFailed"));
        } catch (Throwable th) {
            synchronized (this.f5292a.f5278a) {
                C1124b.p(this.f5292a.i, "OpenCaptureSession completer should not null");
                p pVar3 = this.f5292a;
                CallbackToFutureAdapter.a<Void> aVar2 = pVar3.i;
                pVar3.i = null;
                aVar2.c(new IllegalStateException("onConfigureFailed"));
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CallbackToFutureAdapter.a<Void> aVar;
        try {
            this.f5292a.r(cameraCaptureSession);
            p pVar = this.f5292a;
            pVar.n(pVar);
            synchronized (this.f5292a.f5278a) {
                C1124b.p(this.f5292a.i, "OpenCaptureSession completer should not null");
                p pVar2 = this.f5292a;
                aVar = pVar2.i;
                pVar2.i = null;
            }
            aVar.b(null);
        } catch (Throwable th) {
            synchronized (this.f5292a.f5278a) {
                C1124b.p(this.f5292a.i, "OpenCaptureSession completer should not null");
                p pVar3 = this.f5292a;
                CallbackToFutureAdapter.a<Void> aVar2 = pVar3.i;
                pVar3.i = null;
                aVar2.b(null);
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        p pVar = this.f5292a;
        pVar.r(cameraCaptureSession);
        pVar.o(pVar);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        p pVar = this.f5292a;
        pVar.r(cameraCaptureSession);
        pVar.q(pVar, surface);
    }
}
