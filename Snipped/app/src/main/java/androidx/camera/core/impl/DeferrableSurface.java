package androidx.camera.core.impl;

import a3.InterfaceFutureC0509a;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class DeferrableSurface {
    private CallbackToFutureAdapter.a<Void> mCloseCompleter;
    private final InterfaceFutureC0509a<Void> mCloseFuture;
    private boolean mClosed;
    Class<?> mContainerClass;
    private final Object mLock;
    private final Size mPrescribedSize;
    private final int mPrescribedStreamFormat;
    private CallbackToFutureAdapter.a<Void> mTerminationCompleter;
    private final InterfaceFutureC0509a<Void> mTerminationFuture;
    private int mUseCount;
    public static final Size SIZE_UNDEFINED = new Size(0, 0);
    private static final String TAG = "DeferrableSurface";
    private static final boolean DEBUG = Logger.isDebugEnabled(TAG);
    private static final AtomicInteger USED_COUNT = new AtomicInteger(0);
    private static final AtomicInteger TOTAL_COUNT = new AtomicInteger(0);

    public static final class SurfaceClosedException extends Exception {
        DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }

        public DeferrableSurface getDeferrableSurface() {
            return this.mDeferrableSurface;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(String str) {
            super(str);
        }
    }

    public DeferrableSurface() {
        this(SIZE_UNDEFINED, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(CallbackToFutureAdapter.a aVar) {
        synchronized (this.mLock) {
            this.mTerminationCompleter = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$1(CallbackToFutureAdapter.a aVar) {
        synchronized (this.mLock) {
            this.mCloseCompleter = aVar;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(String str) {
        try {
            this.mTerminationFuture.get();
            printGlobalDebugCounts("Surface terminated", TOTAL_COUNT.decrementAndGet(), USED_COUNT.get());
        } catch (Exception e10) {
            Logger.e(TAG, "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.mLock) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.mClosed), Integer.valueOf(this.mUseCount)), e10);
            }
        }
    }

    private void printGlobalDebugCounts(String str, int i, int i9) {
        if (!DEBUG && Logger.isDebugEnabled(TAG)) {
            Logger.d(TAG, "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        Logger.d(TAG, str + "[total_surfaces=" + i + ", used_surfaces=" + i9 + "](" + this + "}");
    }

    public void close() {
        CallbackToFutureAdapter.a<Void> aVar;
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    aVar = null;
                } else {
                    this.mClosed = true;
                    this.mCloseCompleter.b(null);
                    if (this.mUseCount == 0) {
                        aVar = this.mTerminationCompleter;
                        this.mTerminationCompleter = null;
                    } else {
                        aVar = null;
                    }
                    if (Logger.isDebugEnabled(TAG)) {
                        Logger.d(TAG, "surface closed,  useCount=" + this.mUseCount + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public void decrementUseCount() {
        CallbackToFutureAdapter.a<Void> aVar;
        synchronized (this.mLock) {
            try {
                int i = this.mUseCount;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i9 = i - 1;
                this.mUseCount = i9;
                if (i9 == 0 && this.mClosed) {
                    aVar = this.mTerminationCompleter;
                    this.mTerminationCompleter = null;
                } else {
                    aVar = null;
                }
                if (Logger.isDebugEnabled(TAG)) {
                    Logger.d(TAG, "use count-1,  useCount=" + this.mUseCount + " closed=" + this.mClosed + " " + this);
                    if (this.mUseCount == 0) {
                        printGlobalDebugCounts("Surface no longer in use", TOTAL_COUNT.get(), USED_COUNT.decrementAndGet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public InterfaceFutureC0509a<Void> getCloseFuture() {
        return Futures.nonCancellationPropagating(this.mCloseFuture);
    }

    public Class<?> getContainerClass() {
        return this.mContainerClass;
    }

    public Size getPrescribedSize() {
        return this.mPrescribedSize;
    }

    public int getPrescribedStreamFormat() {
        return this.mPrescribedStreamFormat;
    }

    public final InterfaceFutureC0509a<Surface> getSurface() {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return Futures.immediateFailedFuture(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return provideSurface();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceFutureC0509a<Void> getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.mTerminationFuture);
    }

    public int getUseCount() {
        int i;
        synchronized (this.mLock) {
            i = this.mUseCount;
        }
        return i;
    }

    public void incrementUseCount() {
        synchronized (this.mLock) {
            try {
                int i = this.mUseCount;
                if (i == 0 && this.mClosed) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.mUseCount = i + 1;
                if (Logger.isDebugEnabled(TAG)) {
                    if (this.mUseCount == 1) {
                        printGlobalDebugCounts("New surface in use", TOTAL_COUNT.get(), USED_COUNT.incrementAndGet());
                    }
                    Logger.d(TAG, "use count+1, useCount=" + this.mUseCount + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this.mLock) {
            z10 = this.mClosed;
        }
        return z10;
    }

    public abstract InterfaceFutureC0509a<Surface> provideSurface();

    public void setContainerClass(Class<?> cls) {
        this.mContainerClass = cls;
    }

    public DeferrableSurface(Size size, int i) {
        this.mLock = new Object();
        this.mUseCount = 0;
        this.mClosed = false;
        this.mPrescribedSize = size;
        this.mPrescribedStreamFormat = i;
        final int i9 = 0;
        CallbackToFutureAdapter.c a10 = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b(this) { // from class: androidx.camera.core.impl.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeferrableSurface f5354b;

            {
                this.f5354b = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                Object lambda$new$0;
                Object lambda$new$1;
                switch (i9) {
                    case 0:
                        lambda$new$0 = this.f5354b.lambda$new$0(aVar);
                        return lambda$new$0;
                    default:
                        lambda$new$1 = this.f5354b.lambda$new$1(aVar);
                        return lambda$new$1;
                }
            }
        });
        this.mTerminationFuture = a10;
        final int i10 = 1;
        this.mCloseFuture = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b(this) { // from class: androidx.camera.core.impl.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeferrableSurface f5354b;

            {
                this.f5354b = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public final Object attachCompleter(CallbackToFutureAdapter.a aVar) {
                Object lambda$new$0;
                Object lambda$new$1;
                switch (i10) {
                    case 0:
                        lambda$new$0 = this.f5354b.lambda$new$0(aVar);
                        return lambda$new$0;
                    default:
                        lambda$new$1 = this.f5354b.lambda$new$1(aVar);
                        return lambda$new$1;
                }
            }
        });
        if (Logger.isDebugEnabled(TAG)) {
            printGlobalDebugCounts("Surface created", TOTAL_COUNT.incrementAndGet(), USED_COUNT.get());
            a10.f5933b.addListener(new g(4, this, Log.getStackTraceString(new Exception())), CameraXExecutors.directExecutor());
        }
    }
}
