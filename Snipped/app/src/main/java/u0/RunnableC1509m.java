package u0;

import android.os.Handler;
import java.util.concurrent.Callable;
import x0.InterfaceC1579a;

/* compiled from: RequestExecutor.java */
/* renamed from: u0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1509m<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public Callable<T> f30124a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1579a<T> f30125b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f30126c;

    /* compiled from: RequestExecutor.java */
    /* renamed from: u0.m$a */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1579a f30127a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f30128b;

        public a(InterfaceC1579a interfaceC1579a, Object obj) {
            this.f30127a = interfaceC1579a;
            this.f30128b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f30127a.accept(this.f30128b);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t3;
        try {
            t3 = this.f30124a.call();
        } catch (Exception unused) {
            t3 = null;
        }
        this.f30126c.post(new a(this.f30125b, t3));
    }
}
