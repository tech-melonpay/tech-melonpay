package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.sessionprocessor.YuvToJpegConverter;
import androidx.camera.extensions.internal.sessionprocessor.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import t.C1253e;

/* loaded from: classes.dex */
class StillCaptureProcessor {
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "StillCaptureProcessor";
    final CaptureProcessorImpl mCaptureProcessorImpl;
    final a mCaptureResultImageMatcher;
    HashMap<Integer, Pair<b, TotalCaptureResult>> mCaptureResults;
    boolean mIsClosed;
    final Object mLock;
    OnCaptureResultCallback mOnCaptureResultCallback;
    final ImageReaderProxy mProcessedYuvImageReader;
    TotalCaptureResult mSourceCaptureResult;
    YuvToJpegConverter mYuvToJpegConverter;

    public interface OnCaptureResultCallback {
        void onCaptureResult(long j10, List<Pair<CaptureResult.Key, Object>> list);

        void onCompleted();

        void onError(Exception exc);
    }

    public StillCaptureProcessor(CaptureProcessorImpl captureProcessorImpl, Surface surface, Size size) {
        this.mCaptureResultImageMatcher = new a();
        this.mLock = new Object();
        this.mCaptureResults = new HashMap<>();
        this.mOnCaptureResultCallback = null;
        this.mSourceCaptureResult = null;
        this.mIsClosed = false;
        this.mCaptureProcessorImpl = captureProcessorImpl;
        ImageReaderProxy createIsolatedReader = ImageReaderProxys.createIsolatedReader(size.getWidth(), size.getHeight(), 35, 2);
        this.mProcessedYuvImageReader = createIsolatedReader;
        this.mYuvToJpegConverter = new YuvToJpegConverter(surface);
        createIsolatedReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.extensions.internal.sessionprocessor.f
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                StillCaptureProcessor.this.lambda$new$0(imageReaderProxy);
            }
        }, CameraXExecutors.ioExecutor());
        captureProcessorImpl.onOutputSurface(createIsolatedReader.getSurface(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ImageReaderProxy imageReaderProxy) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    Logger.d(TAG, "Ignore JPEG processing in closed state");
                    return;
                }
                ImageProxy acquireNextImage = imageReaderProxy.acquireNextImage();
                TotalCaptureResult totalCaptureResult = this.mSourceCaptureResult;
                OnCaptureResultCallback onCaptureResultCallback = null;
                if (totalCaptureResult != null) {
                    SettableImageProxy settableImageProxy = new SettableImageProxy(acquireNextImage, null, new CameraCaptureResultImageInfo(new C1253e(totalCaptureResult)));
                    this.mSourceCaptureResult = null;
                    acquireNextImage = settableImageProxy;
                }
                if (acquireNextImage != null) {
                    try {
                        this.mYuvToJpegConverter.a(acquireNextImage);
                        e = null;
                    } catch (YuvToJpegConverter.ConversionFailedException e10) {
                        e = e10;
                    }
                    OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback2 != null) {
                        this.mOnCaptureResultCallback = null;
                        onCaptureResultCallback = onCaptureResultCallback2;
                    }
                } else {
                    e = null;
                }
                if (onCaptureResultCallback != null) {
                    if (e != null) {
                        onCaptureResultCallback.onError(e);
                    } else {
                        onCaptureResultCallback.onCompleted();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCapture$1(List list, final OnCaptureResultCallback onCaptureResultCallback, b bVar, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    bVar.a();
                    Logger.d(TAG, "Ignore image in closed state");
                    return;
                }
                Logger.d(TAG, "onImageReferenceIncoming  captureStageId=" + i);
                this.mCaptureResults.put(Integer.valueOf(i), new Pair<>(bVar, totalCaptureResult));
                Logger.d(TAG, "mCaptureResult has capture stage Id: " + this.mCaptureResults.keySet());
                Exception exc = null;
                if (this.mCaptureResults.keySet().containsAll(list)) {
                    HashMap hashMap = new HashMap();
                    for (Integer num : this.mCaptureResults.keySet()) {
                        Pair<b, TotalCaptureResult> pair = this.mCaptureResults.get(num);
                        hashMap.put(num, new Pair(((b) pair.first).get(), (TotalCaptureResult) pair.second));
                    }
                    Logger.d(TAG, "CaptureProcessorImpl.process()");
                    try {
                        A.a aVar = A.d.f11a;
                        if (A.c.b(aVar) && A.b.c(aVar)) {
                            this.mCaptureProcessorImpl.process(hashMap, new ProcessResultImpl() { // from class: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor.1
                                public void onCaptureCompleted(long j10, List<Pair<CaptureResult.Key, Object>> list2) {
                                    onCaptureResultCallback.onCaptureResult(j10, list2);
                                }

                                public void onCaptureProcessProgressed(int i9) {
                                }
                            }, CameraXExecutors.ioExecutor());
                        } else {
                            this.mCaptureProcessorImpl.process(hashMap);
                        }
                    } catch (Exception e10) {
                        this.mOnCaptureResultCallback = null;
                        exc = e10;
                    }
                    clearCaptureResults();
                }
                if (exc == null || onCaptureResultCallback == null) {
                    return;
                }
                onCaptureResultCallback.onError(exc);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<b, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next().first).a();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        Logger.d(TAG, "Close the processor");
        synchronized (this.mLock) {
            this.mIsClosed = true;
            clearCaptureResults();
            this.mProcessedYuvImageReader.clearOnImageAvailableListener();
            a aVar = this.mCaptureResultImageMatcher;
            synchronized (aVar.f5444a) {
                aVar.f5448e = null;
            }
            this.mCaptureResultImageMatcher.b();
            this.mProcessedYuvImageReader.close();
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult, int i) {
        this.mCaptureResultImageMatcher.a(totalCaptureResult, i);
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyImage(b bVar) {
        this.mCaptureResultImageMatcher.c(bVar);
    }

    public void setJpegQuality(int i) {
        this.mYuvToJpegConverter.f5442b = i;
    }

    public void setRotationDegrees(int i) {
        this.mYuvToJpegConverter.f5443c = i;
    }

    public void startCapture(final List<Integer> list, final OnCaptureResultCallback onCaptureResultCallback) {
        Logger.d(TAG, "Start the processor");
        synchronized (this.mLock) {
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.b();
        a aVar = this.mCaptureResultImageMatcher;
        a.InterfaceC0063a interfaceC0063a = new a.InterfaceC0063a() { // from class: androidx.camera.extensions.internal.sessionprocessor.e
            @Override // androidx.camera.extensions.internal.sessionprocessor.a.InterfaceC0063a
            public final void a(b bVar, TotalCaptureResult totalCaptureResult, int i) {
                StillCaptureProcessor.this.lambda$startCapture$1(list, onCaptureResultCallback, bVar, totalCaptureResult, i);
            }
        };
        synchronized (aVar.f5444a) {
            aVar.f5448e = interfaceC0063a;
        }
    }

    public StillCaptureProcessor(CaptureProcessorImpl captureProcessorImpl, Surface surface, Size size, YuvToJpegConverter yuvToJpegConverter) {
        this(captureProcessorImpl, surface, size);
        this.mYuvToJpegConverter = yuvToJpegConverter;
    }
}
