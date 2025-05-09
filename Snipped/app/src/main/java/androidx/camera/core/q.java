package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageProxy f5423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageProxy f5424c;

    public /* synthetic */ q(ImageProxy imageProxy, ImageProxy imageProxy2, int i) {
        this.f5422a = i;
        this.f5423b = imageProxy;
        this.f5424c = imageProxy2;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ImageProxy imageProxy) {
        switch (this.f5422a) {
            case 0:
                ImageProcessingUtil.lambda$convertYUVToRGB$0(this.f5423b, this.f5424c, imageProxy);
                break;
            default:
                ImageProcessingUtil.lambda$rotateYUV$1(this.f5423b, this.f5424c, imageProxy);
                break;
        }
    }
}
