package androidx.camera.core.processing;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements CallbackToFutureAdapter.b, SurfaceRequest.TransformationInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5421b;

    public /* synthetic */ l(Object obj, int i) {
        this.f5420a = i;
        this.f5421b = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        Object lambda$new$0;
        Object lambda$new$02;
        switch (this.f5420a) {
            case 0:
                lambda$new$0 = ((SurfaceEdge.SettableSurface) this.f5421b).lambda$new$0(aVar);
                return lambda$new$0;
            default:
                lambda$new$02 = ((SurfaceOutputImpl) this.f5421b).lambda$new$0(aVar);
                return lambda$new$02;
        }
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        SurfaceProcessorNode.lambda$setUpRotationUpdates$1((Map) this.f5421b, transformationInfo);
    }
}
