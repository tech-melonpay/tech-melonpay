package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f5239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SessionConfig f5241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UseCaseConfig f5242d;

    public /* synthetic */ d(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig) {
        this.f5239a = camera2CameraImpl;
        this.f5240b = str;
        this.f5241c = sessionConfig;
        this.f5242d = useCaseConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Camera2CameraImpl camera2CameraImpl = this.f5239a;
        String str = this.f5240b;
        SessionConfig sessionConfig = this.f5241c;
        UseCaseConfig<?> useCaseConfig = this.f5242d;
        camera2CameraImpl.getClass();
        camera2CameraImpl.e("Use case " + str + " RESET", null);
        camera2CameraImpl.f5126a.updateUseCase(str, sessionConfig, useCaseConfig);
        camera2CameraImpl.a();
        camera2CameraImpl.q();
        camera2CameraImpl.x();
        if (camera2CameraImpl.f5130e == Camera2CameraImpl.InternalState.f5154d) {
            camera2CameraImpl.m();
        }
    }
}
