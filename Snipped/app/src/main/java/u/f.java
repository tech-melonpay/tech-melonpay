package u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import u.f;
import u.k;

/* compiled from: CameraCaptureSessionCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final k f30037a;

    /* compiled from: CameraCaptureSessionCompat.java */
    public interface a {
        int a(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int b(ArrayList arrayList, Executor executor, androidx.camera.camera2.internal.h hVar);
    }

    /* compiled from: CameraCaptureSessionCompat.java */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.CaptureCallback f30038a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f30039b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f30039b = executor;
            this.f30038a = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            this.f30039b.execute(new androidx.camera.core.g(this, cameraCaptureSession, captureRequest, surface, j10, 1));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f30039b.execute(new M.g(this, cameraCaptureSession, captureRequest, totalCaptureResult, 5));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f30039b.execute(new M.g(this, cameraCaptureSession, captureRequest, captureFailure, 7));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f30039b.execute(new M.g(this, cameraCaptureSession, captureRequest, captureResult, 6));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            this.f30039b.execute(new Z0.a(this, cameraCaptureSession, i, 5));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i, final long j10) {
            this.f30039b.execute(new Runnable() { // from class: u.h
                @Override // java.lang.Runnable
                public final void run() {
                    f.b.this.f30038a.onCaptureSequenceCompleted(cameraCaptureSession, i, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j10, final long j11) {
            this.f30039b.execute(new Runnable() { // from class: u.g
                @Override // java.lang.Runnable
                public final void run() {
                    f.b.this.f30038a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                }
            });
        }
    }

    /* compiled from: CameraCaptureSessionCompat.java */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f30040a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f30041b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f30041b = executor;
            this.f30040a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f30041b.execute(new i(this, cameraCaptureSession, 0));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f30041b.execute(new i(this, cameraCaptureSession, 2));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f30041b.execute(new i(this, cameraCaptureSession, 1));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f30041b.execute(new i(this, cameraCaptureSession, 5));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f30041b.execute(new i(this, cameraCaptureSession, 3));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f30041b.execute(new i(this, cameraCaptureSession, 4));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f30041b.execute(new C.y(this, cameraCaptureSession, surface, 20));
        }
    }

    public f(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f30037a = new j(cameraCaptureSession, null);
        } else {
            this.f30037a = new k(cameraCaptureSession, new k.a(handler));
        }
    }

    public final CameraCaptureSession a() {
        return this.f30037a.f30054a;
    }
}
