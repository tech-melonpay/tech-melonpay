package androidx.camera.core.impl.utils;

import B6.d;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import pa.C1124b;

/* loaded from: classes.dex */
public final class Threads {
    private static final long TIMEOUT_RUN_ON_MAIN_MS = 30000;

    private Threads() {
    }

    public static void checkBackgroundThread() {
        C1124b.q(isBackgroundThread(), "In application's main thread");
    }

    public static void checkMainThread() {
        C1124b.q(isMainThread(), "Not in application's main thread");
    }

    private static Handler getMainHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runOnMainSync$0(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    public static void runOnMain(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            C1124b.q(getMainHandler().post(runnable), "Unable to post to main thread");
        }
    }

    public static void runOnMainSync(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C1124b.q(getMainHandler().post(new d(24, runnable, countDownLatch)), "Unable to post to main thread");
        try {
            if (countDownLatch.await(TIMEOUT_RUN_ON_MAIN_MS, TimeUnit.MILLISECONDS)) {
            } else {
                throw new IllegalStateException("Timeout to wait main thread execution");
            }
        } catch (InterruptedException e10) {
            throw new InterruptedRuntimeException(e10);
        }
    }
}
