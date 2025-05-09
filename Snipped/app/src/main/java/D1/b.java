package D1;

import C1.k;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: classes.dex */
public final class b implements D1.a {

    /* renamed from: a, reason: collision with root package name */
    public final k f858a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f859b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final a f860c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            b.this.f859b.post(runnable);
        }
    }

    public b(ExecutorService executorService) {
        this.f858a = new k(executorService);
    }

    public final void a(Runnable runnable) {
        this.f858a.execute(runnable);
    }
}
