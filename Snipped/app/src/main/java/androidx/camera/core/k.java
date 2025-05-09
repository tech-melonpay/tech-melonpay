package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageAnalysisNonBlockingAnalyzer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5380b;

    public /* synthetic */ k(Object obj, int i) {
        this.f5379a = i;
        this.f5380b = obj;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        switch (this.f5379a) {
            case 0:
                ((ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy) this.f5380b).lambda$new$1(imageProxy);
                break;
            default:
                ((SafeCloseImageReaderProxy) this.f5380b).lambda$new$0(imageProxy);
                break;
        }
    }
}
