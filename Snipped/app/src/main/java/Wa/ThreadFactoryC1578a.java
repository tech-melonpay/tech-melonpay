package wa;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* renamed from: wa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC1578a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30871b;

    public /* synthetic */ ThreadFactoryC1578a(String str, boolean z10) {
        this.f30870a = str;
        this.f30871b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f30870a);
        thread.setDaemon(this.f30871b);
        return thread;
    }
}
