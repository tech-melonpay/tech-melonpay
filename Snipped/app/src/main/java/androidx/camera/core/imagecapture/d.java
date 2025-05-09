package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.ProcessingNode;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5343c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f5341a = i;
        this.f5342b = obj;
        this.f5343c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5341a) {
            case 0:
                ((ProcessingRequest) this.f5342b).onProcessFailure((ImageCaptureException) this.f5343c);
                break;
            case 1:
                ((ProcessingRequest) this.f5342b).onFinalResult((ImageProxy) this.f5343c);
                break;
            case 2:
                ((ProcessingRequest) this.f5342b).onFinalResult((ImageCapture.OutputFileResults) this.f5343c);
                break;
            case 3:
                ((ProcessingNode) this.f5342b).lambda$transform$0((ProcessingNode.InputPacket) this.f5343c);
                break;
            case 4:
                ((TakePictureManager) this.f5342b).lambda$trackCurrentRequests$1((RequestWithCallback) this.f5343c);
                break;
            case 5:
                ((TakePictureRequest) this.f5342b).lambda$onResult$2((ImageProxy) this.f5343c);
                break;
            case 6:
                ((TakePictureRequest) this.f5342b).lambda$onResult$1((ImageCapture.OutputFileResults) this.f5343c);
                break;
            default:
                ((TakePictureRequest) this.f5342b).lambda$onError$0((ImageCaptureException) this.f5343c);
                break;
        }
    }
}
