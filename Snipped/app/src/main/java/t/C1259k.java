package t;

import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.l;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.RejectedExecutionException;
import pa.C1124b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: t.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1259k implements CallbackToFutureAdapter.b, l.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Camera2CameraImpl f27285b;

    public /* synthetic */ C1259k(Camera2CameraImpl camera2CameraImpl, int i) {
        this.f27284a = i;
        this.f27285b = camera2CameraImpl;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        switch (this.f27284a) {
            case 0:
                Camera2CameraImpl camera2CameraImpl = this.f27285b;
                camera2CameraImpl.getClass();
                camera2CameraImpl.f5128c.execute(new androidx.camera.camera2.internal.b(camera2CameraImpl, aVar, 1));
                return "Release[request=" + camera2CameraImpl.f5138n.getAndIncrement() + "]";
            case 1:
            default:
                Camera2CameraImpl camera2CameraImpl2 = this.f27285b;
                camera2CameraImpl2.getClass();
                try {
                    camera2CameraImpl2.f5128c.execute(new com.sumsub.sns.camera.photo.presentation.document.c(12, camera2CameraImpl2, aVar));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    aVar.c(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            case 2:
                Camera2CameraImpl camera2CameraImpl3 = this.f27285b;
                C1124b.q(camera2CameraImpl3.f5140p == null, "Camera can only be released once, so release completer should be null on creation.");
                camera2CameraImpl3.f5140p = aVar;
                return "Release[camera=" + camera2CameraImpl3 + "]";
        }
    }
}
