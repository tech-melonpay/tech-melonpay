package C1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: SerialExecutor.java */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f618b;

    /* renamed from: d, reason: collision with root package name */
    public volatile Runnable f620d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque<a> f617a = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    public final Object f619c = new Object();

    /* compiled from: SerialExecutor.java */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final k f621a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f622b;

        public a(k kVar, Runnable runnable) {
            this.f621a = kVar;
            this.f622b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            k kVar = this.f621a;
            try {
                this.f622b.run();
            } finally {
                kVar.a();
            }
        }
    }

    public k(ExecutorService executorService) {
        this.f618b = executorService;
    }

    public final void a() {
        synchronized (this.f619c) {
            try {
                a poll = this.f617a.poll();
                this.f620d = poll;
                if (poll != null) {
                    this.f618b.execute(this.f620d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f619c) {
            try {
                this.f617a.add(new a(this, runnable));
                if (this.f620d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
