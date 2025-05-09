package t;

import a3.InterfaceFutureC0509a;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.SessionConfig;
import java.util.HashMap;
import java.util.List;

/* compiled from: CaptureSessionInterface.java */
/* loaded from: classes.dex */
public interface J {
    void a();

    void b(HashMap hashMap);

    List<CaptureConfig> c();

    void close();

    void d(List<CaptureConfig> list);

    void e(SessionConfig sessionConfig);

    InterfaceFutureC0509a<Void> f(SessionConfig sessionConfig, CameraDevice cameraDevice, androidx.camera.camera2.internal.r rVar);

    SessionConfig getSessionConfig();

    InterfaceFutureC0509a release();
}
