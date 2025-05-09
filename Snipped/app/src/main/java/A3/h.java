package A3;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzbh;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.mlkit:common@@18.7.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class h extends zzbh {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f67b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f68a;

    public h() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: A3.o
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return defaultThreadFactory.newThread(new n(runnable, 0));
            }
        });
        this.f68a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbh, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f67b.get();
        if (deque == null || deque.size() > 1) {
            this.f68a.execute(new n(runnable, 1));
            return;
        }
        Preconditions.checkNotNull(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbh, com.google.android.gms.internal.mlkit_common.zzaj
    public final /* synthetic */ Object zza() {
        return this.f68a;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbh
    public final ExecutorService zzb() {
        return this.f68a;
    }
}
