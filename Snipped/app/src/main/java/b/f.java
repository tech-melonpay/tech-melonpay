package B;

import androidx.camera.core.CameraX;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: ProcessCameraProvider.java */
/* loaded from: classes.dex */
public final class f implements FutureCallback<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.a f180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraX f181b;

    public f(CameraX cameraX, CallbackToFutureAdapter.a aVar) {
        this.f180a = aVar;
        this.f181b = cameraX;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onFailure(Throwable th) {
        this.f180a.c(th);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public final void onSuccess(Void r22) {
        this.f180a.b(this.f181b);
    }
}
