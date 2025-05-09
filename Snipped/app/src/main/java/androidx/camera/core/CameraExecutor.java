package androidx.camera.core;

import androidx.camera.core.impl.CameraFactory;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class CameraExecutor implements Executor {
    private static final int DEFAULT_CORE_THREADS = 1;
    private static final int DEFAULT_MAX_THREADS = 1;
    private static final String TAG = "CameraExecutor";
    private static final ThreadFactory THREAD_FACTORY = new ThreadFactory() { // from class: androidx.camera.core.CameraExecutor.1
        private static final String THREAD_NAME_STEM = "CameraX-core_camera_%d";
        private final AtomicInteger mThreadId = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Locale locale = Locale.US;
            thread.setName("CameraX-core_camera_" + this.mThreadId.getAndIncrement());
            return thread;
        }
    };
    private final Object mExecutorLock = new Object();
    private ThreadPoolExecutor mThreadPoolExecutor = createExecutor();

    private static ThreadPoolExecutor createExecutor() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), THREAD_FACTORY);
        threadPoolExecutor.setRejectedExecutionHandler(new c());
        return threadPoolExecutor;
    }

    public void deinit() {
        synchronized (this.mExecutorLock) {
            try {
                if (!this.mThreadPoolExecutor.isShutdown()) {
                    this.mThreadPoolExecutor.shutdown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.mExecutorLock) {
            this.mThreadPoolExecutor.execute(runnable);
        }
    }

    public void init(CameraFactory cameraFactory) {
        ThreadPoolExecutor threadPoolExecutor;
        cameraFactory.getClass();
        synchronized (this.mExecutorLock) {
            try {
                if (this.mThreadPoolExecutor.isShutdown()) {
                    this.mThreadPoolExecutor = createExecutor();
                }
                threadPoolExecutor = this.mThreadPoolExecutor;
            } catch (Throwable th) {
                throw th;
            }
        }
        int max = Math.max(1, cameraFactory.getAvailableCameraIds().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }
}
