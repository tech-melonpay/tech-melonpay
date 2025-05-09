package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.List;
import u.f;
import u.t;
import v.l;

/* compiled from: CameraDeviceCompatApi24Impl.java */
/* loaded from: classes.dex */
public class r extends q {
    @Override // u.o.a
    public void a(v.l lVar) {
        CameraDevice cameraDevice = this.f30068a;
        t.b(cameraDevice, lVar);
        l.c cVar = lVar.f30502a;
        f.c cVar2 = new f.c(cVar.e(), cVar.b());
        List<v.f> g10 = cVar.g();
        t.a aVar = (t.a) this.f30069b;
        aVar.getClass();
        v.e a10 = cVar.a();
        Handler handler = aVar.f30070a;
        try {
            if (a10 != null) {
                InputConfiguration a11 = a10.f30491a.a();
                a11.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(a11, v.l.a(g10), cVar2, handler);
            } else if (cVar.f() == 1) {
                cameraDevice.createConstrainedHighSpeedCaptureSession(t.c(g10), cVar2, handler);
            } else {
                cameraDevice.createCaptureSessionByOutputConfigurations(v.l.a(g10), cVar2, handler);
            }
        } catch (CameraAccessException e10) {
            throw new CameraAccessExceptionCompat(e10);
        }
    }
}
