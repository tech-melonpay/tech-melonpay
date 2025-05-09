package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.Objects;
import pa.C1124b;
import x0.InterfaceC1579a;

/* loaded from: classes.dex */
class SingleBundlingNode implements BundlingNode {
    private ProcessingNode.In mOutputEdge;
    ProcessingRequest mPendingRequest;

    /* JADX INFO: Access modifiers changed from: private */
    public void matchImageWithRequest(ImageProxy imageProxy) {
        Threads.checkMainThread();
        C1124b.q(this.mPendingRequest != null, null);
        Object tag = imageProxy.getImageInfo().getTagBundle().getTag(this.mPendingRequest.getTagBundleKey());
        Objects.requireNonNull(tag);
        C1124b.q(((Integer) tag).intValue() == this.mPendingRequest.getStageIds().get(0).intValue(), null);
        this.mOutputEdge.getEdge().accept(ProcessingNode.InputPacket.of(this.mPendingRequest, imageProxy));
        this.mPendingRequest = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trackIncomingRequest(final ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        C1124b.q(processingRequest.getStageIds().size() == 1, "Cannot handle multi-image capture.");
        C1124b.q(this.mPendingRequest == null, "Already has an existing request.");
        this.mPendingRequest = processingRequest;
        Futures.addCallback(processingRequest.getCaptureFuture(), new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.SingleBundlingNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Threads.checkMainThread();
                ProcessingRequest processingRequest2 = processingRequest;
                SingleBundlingNode singleBundlingNode = SingleBundlingNode.this;
                if (processingRequest2 == singleBundlingNode.mPendingRequest) {
                    singleBundlingNode.mPendingRequest = null;
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r12) {
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.processing.Node
    public ProcessingNode.In transform(CaptureNode.Out out) {
        final int i = 0;
        out.getImageEdge().setListener(new InterfaceC1579a(this) { // from class: androidx.camera.core.imagecapture.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleBundlingNode f5347b;

            {
                this.f5347b = this;
            }

            @Override // x0.InterfaceC1579a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f5347b.matchImageWithRequest((ImageProxy) obj);
                        break;
                    default:
                        this.f5347b.trackIncomingRequest((ProcessingRequest) obj);
                        break;
                }
            }
        });
        final int i9 = 1;
        out.getRequestEdge().setListener(new InterfaceC1579a(this) { // from class: androidx.camera.core.imagecapture.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SingleBundlingNode f5347b;

            {
                this.f5347b = this;
            }

            @Override // x0.InterfaceC1579a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        this.f5347b.matchImageWithRequest((ImageProxy) obj);
                        break;
                    default:
                        this.f5347b.trackIncomingRequest((ProcessingRequest) obj);
                        break;
                }
            }
        });
        ProcessingNode.In of = ProcessingNode.In.of(out.getInputFormat(), out.getOutputFormat());
        this.mOutputEdge = of;
        return of;
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
    }
}
