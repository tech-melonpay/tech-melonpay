package androidx.camera.core.imagecapture;

import a3.InterfaceFutureC0509a;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Node;
import c.RunnableC0615f;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import pa.C1124b;
import x0.InterfaceC1579a;

/* loaded from: classes.dex */
class CaptureNode implements Node<In, Out> {
    static final int MAX_IMAGES = 4;
    private static final String TAG = "CaptureNode";
    private In mInputEdge;
    private Out mOutputEdge;
    SafeCloseImageReaderProxy mSafeCloseImageReaderProxy;
    private final Set<Integer> mPendingStageIds = new HashSet();
    ProcessingRequest mCurrentRequest = null;

    public static abstract class In {
        private CameraCaptureCallback mCameraCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.core.imagecapture.CaptureNode.In.1
        };
        private DeferrableSurface mSurface;

        public static In of(Size size, int i, int i9, boolean z10, ImageReaderProxyProvider imageReaderProxyProvider) {
            return new AutoValue_CaptureNode_In(size, i, i9, z10, imageReaderProxyProvider, new Edge(), new Edge());
        }

        public CameraCaptureCallback getCameraCaptureCallback() {
            return this.mCameraCaptureCallback;
        }

        public abstract Edge<ImageCaptureException> getErrorEdge();

        public abstract ImageReaderProxyProvider getImageReaderProxyProvider();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract Edge<ProcessingRequest> getRequestEdge();

        public abstract Size getSize();

        public DeferrableSurface getSurface() {
            DeferrableSurface deferrableSurface = this.mSurface;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        public abstract boolean isVirtualCamera();

        public void setCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCameraCaptureCallback = cameraCaptureCallback;
        }

        public void setSurface(Surface surface) {
            C1124b.q(this.mSurface == null, "The surface is already set.");
            this.mSurface = new ImmediateSurface(surface, getSize(), getInputFormat());
        }
    }

    public static abstract class Out {
        public static Out of(int i, int i9) {
            return new AutoValue_CaptureNode_Out(new Edge(), new Edge(), i, i9);
        }

        public abstract Edge<ImageProxy> getImageEdge();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract Edge<ProcessingRequest> getRequestEdge();
    }

    private static ImageReaderProxy createImageReaderProxy(ImageReaderProxyProvider imageReaderProxyProvider, int i, int i9, int i10) {
        return imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance(i, i9, i10, 4, 0L) : ImageReaderProxys.createIsolatedReader(i, i9, i10, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$0(NoMetadataImageReader noMetadataImageReader, ProcessingRequest processingRequest) {
        onRequestAvailable(processingRequest);
        noMetadataImageReader.acceptProcessingRequest(processingRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$1(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage != null) {
                onImageProxyAvailable(acquireLatestImage);
            } else {
                sendCaptureError(new ImageCaptureException(2, "Failed to acquire latest image", null));
            }
        } catch (IllegalStateException e10) {
            sendCaptureError(new ImageCaptureException(2, "Failed to acquire latest image", e10));
        }
    }

    private void matchAndPropagateImage(ImageProxy imageProxy) {
        Object tag = imageProxy.getImageInfo().getTagBundle().getTag(this.mCurrentRequest.getTagBundleKey());
        Objects.requireNonNull(tag);
        Integer num = (Integer) tag;
        int intValue = num.intValue();
        C1124b.q(this.mPendingStageIds.contains(num), "Received an unexpected stage id" + intValue);
        this.mPendingStageIds.remove(num);
        Out out = this.mOutputEdge;
        Objects.requireNonNull(out);
        out.getImageEdge().accept(imageProxy);
        if (this.mPendingStageIds.isEmpty()) {
            ProcessingRequest processingRequest = this.mCurrentRequest;
            this.mCurrentRequest = null;
            processingRequest.onImageCaptured();
        }
    }

    private void releaseInputResources(In in, SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        in.getSurface().close();
        InterfaceFutureC0509a<Void> terminationFuture = in.getSurface().getTerminationFuture();
        Objects.requireNonNull(safeCloseImageReaderProxy);
        terminationFuture.addListener(new RunnableC0615f(safeCloseImageReaderProxy, 22), CameraXExecutors.mainThreadExecutor());
    }

    public int getCapacity() {
        Threads.checkMainThread();
        C1124b.q(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        return this.mSafeCloseImageReaderProxy.getCapacity();
    }

    public In getInputEdge() {
        In in = this.mInputEdge;
        Objects.requireNonNull(in);
        return in;
    }

    public SafeCloseImageReaderProxy getSafeCloseImageReaderProxy() {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        return safeCloseImageReaderProxy;
    }

    public void onImageProxyAvailable(ImageProxy imageProxy) {
        Threads.checkMainThread();
        if (this.mCurrentRequest != null) {
            matchAndPropagateImage(imageProxy);
            return;
        }
        Logger.d(TAG, "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
        imageProxy.close();
    }

    public void onRequestAvailable(final ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        C1124b.q(getCapacity() > 0, "Too many acquire images. Close image to be able to process next.");
        C1124b.q(this.mCurrentRequest == null || this.mPendingStageIds.isEmpty(), "The previous request is not complete");
        this.mCurrentRequest = processingRequest;
        this.mPendingStageIds.addAll(processingRequest.getStageIds());
        Out out = this.mOutputEdge;
        Objects.requireNonNull(out);
        out.getRequestEdge().accept(processingRequest);
        Futures.addCallback(processingRequest.getCaptureFuture(), new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.CaptureNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Threads.checkMainThread();
                ProcessingRequest processingRequest2 = processingRequest;
                CaptureNode captureNode = CaptureNode.this;
                if (processingRequest2 == captureNode.mCurrentRequest) {
                    captureNode.mCurrentRequest = null;
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r12) {
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        Threads.checkMainThread();
        In in = this.mInputEdge;
        Objects.requireNonNull(in);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        releaseInputResources(in, safeCloseImageReaderProxy);
    }

    public void sendCaptureError(ImageCaptureException imageCaptureException) {
        Threads.checkMainThread();
        ProcessingRequest processingRequest = this.mCurrentRequest;
        if (processingRequest != null) {
            processingRequest.onCaptureFailure(imageCaptureException);
        }
    }

    public void setOnImageCloseListener(ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        Threads.checkMainThread();
        C1124b.q(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        this.mSafeCloseImageReaderProxy.setOnImageCloseListener(onImageCloseListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.processing.Node
    public Out transform(In in) {
        InterfaceC1579a<ProcessingRequest> interfaceC1579a;
        NoMetadataImageReader noMetadataImageReader;
        C1124b.q(this.mInputEdge == null && this.mSafeCloseImageReaderProxy == null, "CaptureNode does not support recreation yet.");
        this.mInputEdge = in;
        Size size = in.getSize();
        int inputFormat = in.getInputFormat();
        if ((true ^ in.isVirtualCamera()) && in.getImageReaderProxyProvider() == null) {
            MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), inputFormat, 4);
            in.setCameraCaptureCallback(metadataImageReader.getCameraCaptureCallback());
            interfaceC1579a = new a(this, 0);
            noMetadataImageReader = metadataImageReader;
        } else {
            final NoMetadataImageReader noMetadataImageReader2 = new NoMetadataImageReader(createImageReaderProxy(in.getImageReaderProxyProvider(), size.getWidth(), size.getHeight(), inputFormat));
            interfaceC1579a = new InterfaceC1579a() { // from class: androidx.camera.core.imagecapture.b
                @Override // x0.InterfaceC1579a
                public final void accept(Object obj) {
                    CaptureNode.this.lambda$transform$0(noMetadataImageReader2, (ProcessingRequest) obj);
                }
            };
            noMetadataImageReader = noMetadataImageReader2;
        }
        Surface surface = noMetadataImageReader.getSurface();
        Objects.requireNonNull(surface);
        in.setSurface(surface);
        this.mSafeCloseImageReaderProxy = new SafeCloseImageReaderProxy(noMetadataImageReader);
        noMetadataImageReader.setOnImageAvailableListener(new e(this, 2), CameraXExecutors.mainThreadExecutor());
        in.getRequestEdge().setListener(interfaceC1579a);
        in.getErrorEdge().setListener(new a(this, 1));
        Out of = Out.of(in.getInputFormat(), in.getOutputFormat());
        this.mOutputEdge = of;
        return of;
    }
}
