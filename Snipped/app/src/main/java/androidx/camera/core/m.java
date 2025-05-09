package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.processing.SurfaceEdge;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UseCase f5384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5386d;

    public /* synthetic */ m(UseCase useCase, Object obj, Object obj2, int i) {
        this.f5383a = i;
        this.f5384b = useCase;
        this.f5385c = obj;
        this.f5386d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5383a) {
            case 0:
                ((ImageCapture) this.f5384b).lambda$takePicture$1((Executor) this.f5385c, (ImageCapture.OnImageCapturedCallback) this.f5386d);
                break;
            default:
                ((Preview) this.f5384b).lambda$createPipeline$0((SurfaceEdge) this.f5385c, (CameraInternal) this.f5386d);
                break;
        }
    }
}
