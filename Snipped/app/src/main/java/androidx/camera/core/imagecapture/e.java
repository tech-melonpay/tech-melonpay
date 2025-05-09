package androidx.camera.core.imagecapture;

import androidx.camera.core.impl.ImageReaderProxy;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements CallbackToFutureAdapter.b, ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5345b;

    public /* synthetic */ e(Object obj, int i) {
        this.f5344a = i;
        this.f5345b = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        Object lambda$new$0;
        Object lambda$new$1;
        switch (this.f5344a) {
            case 0:
                lambda$new$0 = ((RequestWithCallback) this.f5345b).lambda$new$0(aVar);
                return lambda$new$0;
            default:
                lambda$new$1 = ((RequestWithCallback) this.f5345b).lambda$new$1(aVar);
                return lambda$new$1;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        ((CaptureNode) this.f5345b).lambda$transform$1(imageReaderProxy);
    }
}
