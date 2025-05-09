package u;

import android.hardware.camera2.CameraAccessException;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* compiled from: CameraManagerCompatApi30Impl.java */
/* loaded from: classes.dex */
public final class y extends x {
    @Override // u.z, u.v.b
    public final Set<Set<String>> d() {
        try {
            return this.f30080a.getConcurrentCameraIds();
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.a(e10);
        }
    }
}
