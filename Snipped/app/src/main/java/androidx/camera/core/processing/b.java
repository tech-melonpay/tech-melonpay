package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5395c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f5393a = i;
        this.f5394b = obj;
        this.f5395c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5393a) {
            case 0:
                ((DefaultSurfaceProcessor) this.f5394b).lambda$snapshot$5((DefaultSurfaceProcessor.PendingSnapshot) this.f5395c);
                break;
            case 1:
                ((SurfaceOutputImpl) this.f5394b).lambda$requestClose$1((AtomicReference) this.f5395c);
                break;
            case 2:
                ((DefaultSurfaceProcessor) this.f5394b).lambda$onOutputSurface$3((SurfaceOutput) this.f5395c);
                break;
            case 3:
                ((DefaultSurfaceProcessor) this.f5394b).lambda$onInputSurface$1((SurfaceRequest) this.f5395c);
                break;
            case 4:
                ((SurfaceProcessorWithExecutor) this.f5394b).lambda$onInputSurface$0((SurfaceRequest) this.f5395c);
                break;
            default:
                ((SurfaceProcessorWithExecutor) this.f5394b).lambda$onOutputSurface$1((SurfaceOutput) this.f5395c);
                break;
        }
    }
}
