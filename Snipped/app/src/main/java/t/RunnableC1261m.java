package t;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.UseCaseConfig;

/* compiled from: R8$$SyntheticClass */
/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1261m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f27293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SessionConfig f27295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UseCaseConfig f27296e;

    public /* synthetic */ RunnableC1261m(Camera2CameraImpl camera2CameraImpl, String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, int i) {
        this.f27292a = i;
        this.f27293b = camera2CameraImpl;
        this.f27294c = str;
        this.f27295d = sessionConfig;
        this.f27296e = useCaseConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27292a) {
            case 0:
                Camera2CameraImpl camera2CameraImpl = this.f27293b;
                camera2CameraImpl.getClass();
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str = this.f27294c;
                sb2.append(str);
                sb2.append(" UPDATED");
                camera2CameraImpl.e(sb2.toString(), null);
                camera2CameraImpl.f5126a.updateUseCase(str, this.f27295d, this.f27296e);
                camera2CameraImpl.x();
                break;
            default:
                Camera2CameraImpl camera2CameraImpl2 = this.f27293b;
                camera2CameraImpl2.getClass();
                StringBuilder sb3 = new StringBuilder("Use case ");
                String str2 = this.f27294c;
                sb3.append(str2);
                sb3.append(" ACTIVE");
                camera2CameraImpl2.e(sb3.toString(), null);
                UseCaseAttachState useCaseAttachState = camera2CameraImpl2.f5126a;
                SessionConfig sessionConfig = this.f27295d;
                UseCaseConfig<?> useCaseConfig = this.f27296e;
                useCaseAttachState.setUseCaseActive(str2, sessionConfig, useCaseConfig);
                useCaseAttachState.updateUseCase(str2, sessionConfig, useCaseConfig);
                camera2CameraImpl2.x();
                break;
        }
    }
}
