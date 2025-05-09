package androidx.camera.core;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements CallbackToFutureAdapter.b, ImageAnalysis.Analyzer, ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5311a;

    public /* synthetic */ e(Object obj) {
        this.f5311a = obj;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy imageProxy) {
        ((ImageAnalysis.Analyzer) this.f5311a).analyze(imageProxy);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(CallbackToFutureAdapter.a aVar) {
        Object lambda$shutdownInternal$4;
        lambda$shutdownInternal$4 = ((CameraX) this.f5311a).lambda$shutdownInternal$4(aVar);
        return lambda$shutdownInternal$4;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        ((MetadataImageReader) this.f5311a).lambda$new$0(imageReaderProxy);
    }
}
