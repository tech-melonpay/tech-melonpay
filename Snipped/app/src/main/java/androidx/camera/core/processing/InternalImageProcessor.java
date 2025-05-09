package androidx.camera.core.processing;

import C.y;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ProcessingException;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.Objects;
import java.util.concurrent.Executor;
import pa.C1124b;
import x0.InterfaceC1579a;

/* loaded from: classes.dex */
public class InternalImageProcessor {
    private final InterfaceC1579a<Throwable> mErrorListener;
    private final Executor mExecutor;
    private final ImageProcessor mImageProcessor;

    public InternalImageProcessor(CameraEffect cameraEffect) {
        C1124b.l(cameraEffect.getTargets() == 4);
        this.mExecutor = cameraEffect.getExecutor();
        ImageProcessor imageProcessor = cameraEffect.getImageProcessor();
        Objects.requireNonNull(imageProcessor);
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$safeProcess$0(ImageProcessor.Request request, CallbackToFutureAdapter.a aVar) {
        try {
            aVar.b(this.mImageProcessor.process(request));
        } catch (ProcessingException e10) {
            this.mErrorListener.accept(e10);
            aVar.c(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$safeProcess$1(ImageProcessor.Request request, CallbackToFutureAdapter.a aVar) {
        this.mExecutor.execute(new y(this, request, aVar, 9));
        return "InternalImageProcessor#process " + request.hashCode();
    }

    public ImageProcessor.Response safeProcess(final ImageProcessor.Request request) {
        try {
            return (ImageProcessor.Response) CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: androidx.camera.core.processing.f
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
                public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                    Object lambda$safeProcess$1;
                    lambda$safeProcess$1 = InternalImageProcessor.this.lambda$safeProcess$1(request, aVar);
                    return lambda$safeProcess$1;
                }
            }).f5933b.get();
        } catch (Exception e10) {
            e = e10;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
