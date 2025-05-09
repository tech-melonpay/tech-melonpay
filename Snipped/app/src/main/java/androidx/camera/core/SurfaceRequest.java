package androidx.camera.core;

import a3.InterfaceFutureC0509a;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import pa.C1124b;
import x0.InterfaceC1579a;

/* loaded from: classes.dex */
public final class SurfaceRequest {
    public static final Range<Integer> FRAME_RATE_RANGE_UNSPECIFIED = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    private final CameraInternal mCamera;
    private final DynamicRange mDynamicRange;
    private final Range<Integer> mExpectedFrameRate;
    private final DeferrableSurface mInternalDeferrableSurface;
    private final Object mLock;
    private final CallbackToFutureAdapter.a<Void> mRequestCancellationCompleter;
    private final Size mResolution;
    private final InterfaceFutureC0509a<Void> mSessionStatusFuture;
    private final CallbackToFutureAdapter.a<Surface> mSurfaceCompleter;
    final InterfaceFutureC0509a<Surface> mSurfaceFuture;
    private final CallbackToFutureAdapter.a<Void> mSurfaceRecreationCompleter;
    private TransformationInfo mTransformationInfo;
    private Executor mTransformationInfoExecutor;
    private TransformationInfoListener mTransformationInfoListener;

    public static final class RequestCancelledException extends RuntimeException {
        public RequestCancelledException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static abstract class Result {
        public static final int RESULT_INVALID_SURFACE = 2;
        public static final int RESULT_REQUEST_CANCELLED = 1;
        public static final int RESULT_SURFACE_ALREADY_PROVIDED = 3;
        public static final int RESULT_SURFACE_USED_SUCCESSFULLY = 0;
        public static final int RESULT_WILL_NOT_PROVIDE_SURFACE = 4;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        public static Result of(int i, Surface surface) {
            return new AutoValue_SurfaceRequest_Result(i, surface);
        }

        public abstract int getResultCode();

        public abstract Surface getSurface();
    }

    public static abstract class TransformationInfo {
        public static TransformationInfo of(Rect rect, int i, int i9, boolean z10, Matrix matrix, boolean z11) {
            return new AutoValue_SurfaceRequest_TransformationInfo(rect, i, i9, z10, matrix, z11);
        }

        public abstract Rect getCropRect();

        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();

        public abstract Matrix getSensorToBufferTransform();

        public abstract int getTargetRotation();

        public abstract boolean hasCameraTransform();
    }

    public interface TransformationInfoListener {
        void onTransformationInfoUpdate(TransformationInfo transformationInfo);
    }

    public SurfaceRequest(Size size, CameraInternal cameraInternal, Runnable runnable) {
        this(size, cameraInternal, DynamicRange.SDR, FRAME_RATE_RANGE_UNSPECIFIED, runnable);
    }

    private CallbackToFutureAdapter.a<Void> initialSurfaceRecreationCompleter(Executor executor, final Runnable runnable) {
        AtomicReference atomicReference = new AtomicReference(null);
        Futures.addCallback(CallbackToFutureAdapter.a(new d(2, this, atomicReference)), new FutureCallback<Void>() { // from class: androidx.camera.core.SurfaceRequest.5
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r12) {
                runnable.run();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
            }
        }, executor);
        CallbackToFutureAdapter.a<Void> aVar = (CallbackToFutureAdapter.a) atomicReference.get();
        aVar.getClass();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$initialSurfaceRecreationCompleter$6(AtomicReference atomicReference, CallbackToFutureAdapter.a aVar) {
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + hashCode() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$0(AtomicReference atomicReference, String str, CallbackToFutureAdapter.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$1(AtomicReference atomicReference, String str, CallbackToFutureAdapter.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$2(AtomicReference atomicReference, String str, CallbackToFutureAdapter.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        this.mSurfaceFuture.cancel(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$provideSurface$4(InterfaceC1579a interfaceC1579a, Surface surface) {
        interfaceC1579a.accept(Result.of(3, surface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$provideSurface$5(InterfaceC1579a interfaceC1579a, Surface surface) {
        interfaceC1579a.accept(Result.of(4, surface));
    }

    @SuppressLint({"PairedRegistration"})
    public void addRequestCancellationListener(Executor executor, Runnable runnable) {
        this.mRequestCancellationCompleter.a(runnable, executor);
    }

    public void clearTransformationInfoListener() {
        synchronized (this.mLock) {
            this.mTransformationInfoListener = null;
            this.mTransformationInfoExecutor = null;
        }
    }

    public CameraInternal getCamera() {
        return this.mCamera;
    }

    public DeferrableSurface getDeferrableSurface() {
        return this.mInternalDeferrableSurface;
    }

    public DynamicRange getDynamicRange() {
        return this.mDynamicRange;
    }

    public Range<Integer> getExpectedFrameRate() {
        return this.mExpectedFrameRate;
    }

    public Size getResolution() {
        return this.mResolution;
    }

    public boolean invalidate() {
        willNotProvideSurface();
        return this.mSurfaceRecreationCompleter.b(null);
    }

    public boolean isServiced() {
        return this.mSurfaceFuture.isDone();
    }

    public void provideSurface(final Surface surface, Executor executor, final InterfaceC1579a<Result> interfaceC1579a) {
        if (this.mSurfaceCompleter.b(surface) || this.mSurfaceFuture.isCancelled()) {
            Futures.addCallback(this.mSessionStatusFuture, new FutureCallback<Void>() { // from class: androidx.camera.core.SurfaceRequest.4
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable th) {
                    C1124b.q(th instanceof RequestCancelledException, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
                    interfaceC1579a.accept(Result.of(1, surface));
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(Void r32) {
                    interfaceC1579a.accept(Result.of(0, surface));
                }
            }, executor);
            return;
        }
        C1124b.q(this.mSurfaceFuture.isDone(), null);
        try {
            this.mSurfaceFuture.get();
            final int i = 0;
            executor.execute(new Runnable() { // from class: androidx.camera.core.t
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            SurfaceRequest.lambda$provideSurface$4(interfaceC1579a, surface);
                            break;
                        default:
                            SurfaceRequest.lambda$provideSurface$5(interfaceC1579a, surface);
                            break;
                    }
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            final int i9 = 1;
            executor.execute(new Runnable() { // from class: androidx.camera.core.t
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            SurfaceRequest.lambda$provideSurface$4(interfaceC1579a, surface);
                            break;
                        default:
                            SurfaceRequest.lambda$provideSurface$5(interfaceC1579a, surface);
                            break;
                    }
                }
            });
        }
    }

    public void setTransformationInfoListener(Executor executor, TransformationInfoListener transformationInfoListener) {
        TransformationInfo transformationInfo;
        synchronized (this.mLock) {
            this.mTransformationInfoListener = transformationInfoListener;
            this.mTransformationInfoExecutor = executor;
            transformationInfo = this.mTransformationInfo;
        }
        if (transformationInfo != null) {
            executor.execute(new s(transformationInfoListener, transformationInfo, 1));
        }
    }

    public void updateTransformationInfo(TransformationInfo transformationInfo) {
        TransformationInfoListener transformationInfoListener;
        Executor executor;
        synchronized (this.mLock) {
            this.mTransformationInfo = transformationInfo;
            transformationInfoListener = this.mTransformationInfoListener;
            executor = this.mTransformationInfoExecutor;
        }
        if (transformationInfoListener == null || executor == null) {
            return;
        }
        executor.execute(new s(transformationInfoListener, transformationInfo, 0));
    }

    public boolean willNotProvideSurface() {
        return this.mSurfaceCompleter.c(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    public SurfaceRequest(Size size, CameraInternal cameraInternal, DynamicRange dynamicRange, Range<Integer> range, Runnable runnable) {
        this.mLock = new Object();
        this.mResolution = size;
        this.mCamera = cameraInternal;
        this.mDynamicRange = dynamicRange;
        this.mExpectedFrameRate = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i = 0;
        final CallbackToFutureAdapter.c a10 = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: androidx.camera.core.u
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                Object lambda$new$0;
                Object lambda$new$1;
                Object lambda$new$2;
                switch (i) {
                    case 0:
                        lambda$new$0 = SurfaceRequest.lambda$new$0(atomicReference, str, aVar);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = SurfaceRequest.lambda$new$1(atomicReference, str, aVar);
                        return lambda$new$1;
                    default:
                        lambda$new$2 = SurfaceRequest.lambda$new$2(atomicReference, str, aVar);
                        return lambda$new$2;
                }
            }
        });
        final CallbackToFutureAdapter.a<Void> aVar = (CallbackToFutureAdapter.a) atomicReference.get();
        aVar.getClass();
        this.mRequestCancellationCompleter = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i9 = 1;
        CallbackToFutureAdapter.c a11 = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: androidx.camera.core.u
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar2) {
                Object lambda$new$0;
                Object lambda$new$1;
                Object lambda$new$2;
                switch (i9) {
                    case 0:
                        lambda$new$0 = SurfaceRequest.lambda$new$0(atomicReference2, str, aVar2);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = SurfaceRequest.lambda$new$1(atomicReference2, str, aVar2);
                        return lambda$new$1;
                    default:
                        lambda$new$2 = SurfaceRequest.lambda$new$2(atomicReference2, str, aVar2);
                        return lambda$new$2;
                }
            }
        });
        this.mSessionStatusFuture = a11;
        Futures.addCallback(a11, new FutureCallback<Void>() { // from class: androidx.camera.core.SurfaceRequest.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                if (th instanceof RequestCancelledException) {
                    C1124b.q(a10.cancel(false), null);
                } else {
                    C1124b.q(aVar.b(null), null);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r22) {
                C1124b.q(aVar.b(null), null);
            }
        }, CameraXExecutors.directExecutor());
        final CallbackToFutureAdapter.a aVar2 = (CallbackToFutureAdapter.a) atomicReference2.get();
        aVar2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i10 = 2;
        CallbackToFutureAdapter.c a12 = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b() { // from class: androidx.camera.core.u
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar22) {
                Object lambda$new$0;
                Object lambda$new$1;
                Object lambda$new$2;
                switch (i10) {
                    case 0:
                        lambda$new$0 = SurfaceRequest.lambda$new$0(atomicReference3, str, aVar22);
                        return lambda$new$0;
                    case 1:
                        lambda$new$1 = SurfaceRequest.lambda$new$1(atomicReference3, str, aVar22);
                        return lambda$new$1;
                    default:
                        lambda$new$2 = SurfaceRequest.lambda$new$2(atomicReference3, str, aVar22);
                        return lambda$new$2;
                }
            }
        });
        this.mSurfaceFuture = a12;
        CallbackToFutureAdapter.a<Surface> aVar3 = (CallbackToFutureAdapter.a) atomicReference3.get();
        aVar3.getClass();
        this.mSurfaceCompleter = aVar3;
        DeferrableSurface deferrableSurface = new DeferrableSurface(size, 34) { // from class: androidx.camera.core.SurfaceRequest.2
            @Override // androidx.camera.core.impl.DeferrableSurface
            public InterfaceFutureC0509a<Surface> provideSurface() {
                return SurfaceRequest.this.mSurfaceFuture;
            }
        };
        this.mInternalDeferrableSurface = deferrableSurface;
        final InterfaceFutureC0509a<Void> terminationFuture = deferrableSurface.getTerminationFuture();
        Futures.addCallback(a12, new FutureCallback<Surface>() { // from class: androidx.camera.core.SurfaceRequest.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                if (th instanceof CancellationException) {
                    C1124b.q(aVar2.c(new RequestCancelledException(androidx.camera.core.impl.utils.a.n(new StringBuilder(), str, " cancelled."), th)), null);
                } else {
                    aVar2.b(null);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Surface surface) {
                Futures.propagate(terminationFuture, aVar2);
            }
        }, CameraXExecutors.directExecutor());
        terminationFuture.addListener(new l(this, 2), CameraXExecutors.directExecutor());
        this.mSurfaceRecreationCompleter = initialSurfaceRecreationCompleter(CameraXExecutors.directExecutor(), runnable);
    }
}
