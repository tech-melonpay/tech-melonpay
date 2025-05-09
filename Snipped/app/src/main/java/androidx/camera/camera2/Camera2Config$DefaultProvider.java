package androidx.camera.camera2;

import androidx.camera.core.CameraXConfig;
import r.a;
import r.b;
import r.c;

/* loaded from: classes.dex */
public final class Camera2Config$DefaultProvider implements CameraXConfig.Provider {
    @Override // androidx.camera.core.CameraXConfig.Provider
    public CameraXConfig getCameraXConfig() {
        a aVar = new a();
        b bVar = new b();
        return new CameraXConfig.Builder().setCameraFactoryProvider(aVar).setDeviceSurfaceManagerProvider(bVar).setUseCaseConfigFactoryProvider(new c()).build();
    }
}
