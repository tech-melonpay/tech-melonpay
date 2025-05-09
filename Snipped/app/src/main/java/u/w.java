package u;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* compiled from: CameraManagerCompatApi28Impl.java */
/* loaded from: classes.dex */
public class w extends z {
    public static boolean f(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        return Build.VERSION.SDK_INT == 28 && runtimeException.getClass().equals(RuntimeException.class) && (stackTrace = runtimeException.getStackTrace()) != null && stackTrace.length >= 0 && "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // u.z, u.v.b
    public final void a(Camera2CameraImpl.b bVar) {
        this.f30080a.unregisterAvailabilityCallback(bVar);
    }

    @Override // u.z, u.v.b
    public CameraCharacteristics b(String str) {
        try {
            return super.b(str);
        } catch (RuntimeException e10) {
            if (f(e10)) {
                throw new CameraAccessExceptionCompat(e10);
            }
            throw e10;
        }
    }

    @Override // u.z, u.v.b
    public final void c(Executor executor, Camera2CameraImpl.b bVar) {
        this.f30080a.registerAvailabilityCallback(executor, bVar);
    }

    @Override // u.z, u.v.b
    public void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f30080a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw new CameraAccessExceptionCompat(e10);
        } catch (IllegalArgumentException e11) {
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (!f(e13)) {
                throw e13;
            }
            throw new CameraAccessExceptionCompat(e13);
        }
    }
}
