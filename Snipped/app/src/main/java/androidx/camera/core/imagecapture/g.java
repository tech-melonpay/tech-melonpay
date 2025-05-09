package androidx.camera.core.imagecapture;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TakePictureManager f5349b;

    public /* synthetic */ g(TakePictureManager takePictureManager, int i) {
        this.f5348a = i;
        this.f5349b = takePictureManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5348a) {
            case 0:
                this.f5349b.lambda$trackCurrentRequests$0();
                break;
            default:
                this.f5349b.issueNextRequest();
                break;
        }
    }
}
