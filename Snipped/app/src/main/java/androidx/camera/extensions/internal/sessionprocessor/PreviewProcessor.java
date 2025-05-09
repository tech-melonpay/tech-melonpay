package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.sessionprocessor.a;
import java.util.List;

/* loaded from: classes.dex */
class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";
    final PreviewImageProcessorImpl mPreviewImageProcessor;
    final a mCaptureResultImageMatcher = new a();
    final Object mLock = new Object();
    boolean mIsClosed = false;

    public interface OnCaptureResultCallback {
        void onCaptureResult(long j10, List<Pair<CaptureResult.Key, Object>> list);
    }

    public PreviewProcessor(PreviewImageProcessorImpl previewImageProcessorImpl, Surface surface, Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, b bVar, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    bVar.a();
                    Logger.d(TAG, "Ignore image in closed state");
                    return;
                }
                A.a aVar = A.d.f11a;
                if (A.b.c(aVar) && A.c.b(aVar)) {
                    this.mPreviewImageProcessor.process(bVar.get(), totalCaptureResult, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor.1
                        public void onCaptureCompleted(long j10, List<Pair<CaptureResult.Key, Object>> list) {
                            onCaptureResultCallback.onCaptureResult(j10, list);
                        }

                        public void onCaptureProcessProgressed(int i9) {
                        }
                    }, CameraXExecutors.ioExecutor());
                } else {
                    this.mPreviewImageProcessor.process(bVar.get(), totalCaptureResult);
                }
                bVar.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.b();
            a aVar = this.mCaptureResultImageMatcher;
            synchronized (aVar.f5444a) {
                aVar.f5448e = null;
            }
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.a(totalCaptureResult, 0);
    }

    public void notifyImage(b bVar) {
        this.mCaptureResultImageMatcher.c(bVar);
    }

    public void start(final OnCaptureResultCallback onCaptureResultCallback) {
        a aVar = this.mCaptureResultImageMatcher;
        a.InterfaceC0063a interfaceC0063a = new a.InterfaceC0063a() { // from class: androidx.camera.extensions.internal.sessionprocessor.c
            @Override // androidx.camera.extensions.internal.sessionprocessor.a.InterfaceC0063a
            public final void a(b bVar, TotalCaptureResult totalCaptureResult, int i) {
                PreviewProcessor.this.lambda$start$0(onCaptureResultCallback, bVar, totalCaptureResult, i);
            }
        };
        synchronized (aVar.f5444a) {
            aVar.f5448e = interfaceC0063a;
        }
    }
}
