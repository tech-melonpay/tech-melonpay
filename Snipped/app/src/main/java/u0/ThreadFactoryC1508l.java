package u0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: RequestExecutor.java */
/* renamed from: u0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1508l implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public String f30121a;

    /* renamed from: b, reason: collision with root package name */
    public int f30122b;

    /* compiled from: RequestExecutor.java */
    /* renamed from: u0.l$a */
    public static class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final int f30123a;

        public a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.f30123a = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f30123a);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f30121a, this.f30122b);
    }
}
