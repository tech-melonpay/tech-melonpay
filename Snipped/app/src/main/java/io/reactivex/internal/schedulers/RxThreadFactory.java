package io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: a, reason: collision with root package name */
    public final String f21784a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21785b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21786c;

    public static final class a extends Thread {
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f21784a + '-' + incrementAndGet();
        Thread aVar = this.f21786c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f21785b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return androidx.camera.core.impl.utils.a.n(new StringBuilder("RxThreadFactory["), this.f21784a, "]");
    }

    public RxThreadFactory(String str, int i, boolean z10) {
        this.f21784a = str;
        this.f21785b = i;
        this.f21786c = z10;
    }
}
