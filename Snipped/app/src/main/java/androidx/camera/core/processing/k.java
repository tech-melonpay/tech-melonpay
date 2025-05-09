package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5419b;

    public /* synthetic */ k(Object obj, int i) {
        this.f5418a = i;
        this.f5419b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5418a) {
            case 0:
                ((SurfaceEdge.SettableSurface) this.f5419b).decrementUseCount();
                break;
            case 1:
                DefaultSurfaceProcessor.lambda$snapshot$6((CallbackToFutureAdapter.a) this.f5419b);
                break;
            case 2:
                ((SurfaceOutput) this.f5419b).close();
                break;
            case 3:
                ((SurfaceRequest) this.f5419b).willNotProvideSurface();
                break;
            case 4:
                ((DefaultSurfaceProcessor) this.f5419b).lambda$release$4();
                break;
            default:
                ((SurfaceProcessorNode) this.f5419b).lambda$release$2();
                break;
        }
    }
}
