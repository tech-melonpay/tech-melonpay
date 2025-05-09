package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* compiled from: CameraManagerCompatApi29Impl.java */
/* loaded from: classes.dex */
public class x extends w {
    @Override // u.w, u.z, u.v.b
    public final CameraCharacteristics b(String str) {
        try {
            return this.f30080a.getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.a(e10);
        }
    }

    @Override // u.w, u.z, u.v.b
    public final void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f30080a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw CameraAccessExceptionCompat.a(e10);
        }
    }
}
