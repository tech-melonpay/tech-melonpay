package androidx.camera.camera2.internal;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.ArrayList;

/* compiled from: SynchronizedCaptureSession.java */
/* loaded from: classes.dex */
public interface o {
    void abortCaptures();

    p b();

    void c();

    void close();

    u.f d();

    CameraDevice e();

    int f(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    int h(ArrayList arrayList, h hVar);

    InterfaceFutureC0509a<Void> i();

    void stopRepeating();

    /* compiled from: SynchronizedCaptureSession.java */
    public static abstract class a {
        public void j(p pVar) {
        }

        public void k(p pVar) {
        }

        public void l(o oVar) {
        }

        public void m(o oVar) {
        }

        public void n(p pVar) {
        }

        public void o(p pVar) {
        }

        public void p(o oVar) {
        }

        public void q(p pVar, Surface surface) {
        }
    }
}
