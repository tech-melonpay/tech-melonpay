package j2;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: SafeLoggingExecutor.java */
/* renamed from: j2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0890i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f22441a;

    /* compiled from: SafeLoggingExecutor.java */
    /* renamed from: j2.i$a */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f22442a;

        public a(Runnable runnable) {
            this.f22442a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f22442a.run();
            } catch (Exception e10) {
                Log.e("TransportRuntime.".concat("Executor"), "Background execution failure.", e10);
            }
        }
    }

    public ExecutorC0890i(ExecutorService executorService) {
        this.f22441a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f22441a.execute(new a(runnable));
    }
}
