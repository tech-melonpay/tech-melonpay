package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: CameraDeviceCompatApi28Impl.java */
/* loaded from: classes.dex */
public final class s extends r {
    @Override // u.r, u.o.a
    public final void a(v.l lVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) lVar.f30502a.d();
        sessionConfiguration.getClass();
        try {
            this.f30068a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e10) {
            throw new CameraAccessExceptionCompat(e10);
        }
    }
}
