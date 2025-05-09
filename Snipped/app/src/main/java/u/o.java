package u;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import java.util.concurrent.Executor;
import u.t;

/* compiled from: CameraDeviceCompat.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final r f30062a;

    /* compiled from: CameraDeviceCompat.java */
    public interface a {
        void a(v.l lVar);
    }

    /* compiled from: CameraDeviceCompat.java */
    public static final class b extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        public final CameraDevice.StateCallback f30063a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f30064b;

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f30064b = executor;
            this.f30063a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            this.f30064b.execute(new p(this, cameraDevice, 0));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            this.f30064b.execute(new p(this, cameraDevice, 1));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            this.f30064b.execute(new Z0.a(this, cameraDevice, i, 6));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            this.f30064b.execute(new p(this, cameraDevice, 2));
        }
    }

    public o(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f30062a = new r(cameraDevice, new t.a(handler));
        } else {
            cameraDevice.getClass();
            this.f30062a = new s(cameraDevice, null);
        }
    }
}
