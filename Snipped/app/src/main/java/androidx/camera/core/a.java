package androidx.camera.core;

import android.net.Uri;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5305c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f5303a = i;
        this.f5304b = obj;
        this.f5305c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5303a) {
            case 0:
                ((AndroidImageReaderProxy) this.f5304b).lambda$setOnImageAvailableListener$0((ImageReaderProxy.OnImageAvailableListener) this.f5305c);
                break;
            case 1:
                ((ImageCapture.ImageCaptureRequest) this.f5304b).lambda$dispatchImage$0((ImageProxy) this.f5305c);
                break;
            case 2:
                ((ImageSaver) this.f5304b).lambda$run$0((File) this.f5305c);
                break;
            case 3:
                ((ImageSaver) this.f5304b).lambda$postSuccess$1((Uri) this.f5305c);
                break;
            case 4:
                ((CameraX) this.f5304b).lambda$shutdownInternal$3((CallbackToFutureAdapter.a) this.f5305c);
                break;
            case 5:
                ImageAnalysis.lambda$createPipeline$0((SafeCloseImageReaderProxy) this.f5304b, (SafeCloseImageReaderProxy) this.f5305c);
                break;
            case 6:
                ((MetadataImageReader) this.f5304b).lambda$enqueueImageProxy$1((ImageReaderProxy.OnImageAvailableListener) this.f5305c);
                break;
            default:
                ((Preview.SurfaceProvider) this.f5304b).onSurfaceRequested((SurfaceRequest) this.f5305c);
                break;
        }
    }
}
