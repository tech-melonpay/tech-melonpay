package s1;

import C.v;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.java */
/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1191a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f26495a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26496b;

    public ThreadFactoryC1191a(boolean z10) {
        this.f26496b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder s10 = v.s(this.f26496b ? "WM.task-" : "androidx.work-");
        s10.append(this.f26495a.incrementAndGet());
        return new Thread(runnable, s10.toString());
    }
}
