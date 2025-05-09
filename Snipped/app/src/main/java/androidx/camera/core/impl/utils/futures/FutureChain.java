package androidx.camera.core.impl.utils.futures;

import a3.InterfaceFutureC0509a;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p.InterfaceC1096a;
import pa.C1124b;

/* loaded from: classes.dex */
public class FutureChain<V> implements InterfaceFutureC0509a<V> {
    CallbackToFutureAdapter.a<V> mCompleter;
    private final InterfaceFutureC0509a<V> mDelegate;

    public FutureChain(InterfaceFutureC0509a<V> interfaceFutureC0509a) {
        interfaceFutureC0509a.getClass();
        this.mDelegate = interfaceFutureC0509a;
    }

    public static <V> FutureChain<V> from(InterfaceFutureC0509a<V> interfaceFutureC0509a) {
        return interfaceFutureC0509a instanceof FutureChain ? (FutureChain) interfaceFutureC0509a : new FutureChain<>(interfaceFutureC0509a);
    }

    public final void addCallback(FutureCallback<? super V> futureCallback, Executor executor) {
        Futures.addCallback(this, futureCallback, executor);
    }

    @Override // a3.InterfaceFutureC0509a
    public void addListener(Runnable runnable, Executor executor) {
        this.mDelegate.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.mDelegate.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.mDelegate.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mDelegate.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mDelegate.isDone();
    }

    public boolean set(V v10) {
        CallbackToFutureAdapter.a<V> aVar = this.mCompleter;
        if (aVar != null) {
            return aVar.b(v10);
        }
        return false;
    }

    public boolean setException(Throwable th) {
        CallbackToFutureAdapter.a<V> aVar = this.mCompleter;
        if (aVar != null) {
            return aVar.c(th);
        }
        return false;
    }

    public final <T> FutureChain<T> transform(InterfaceC1096a<? super V, T> interfaceC1096a, Executor executor) {
        return (FutureChain) Futures.transform(this, interfaceC1096a, executor);
    }

    public final <T> FutureChain<T> transformAsync(AsyncFunction<? super V, T> asyncFunction, Executor executor) {
        return (FutureChain) Futures.transformAsync(this, asyncFunction, executor);
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.mDelegate.get(j10, timeUnit);
    }

    public FutureChain() {
        this.mDelegate = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b<V>() { // from class: androidx.camera.core.impl.utils.futures.FutureChain.1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public Object attachCompleter(CallbackToFutureAdapter.a<V> aVar) {
                C1124b.q(FutureChain.this.mCompleter == null, "The result can only set once!");
                FutureChain.this.mCompleter = aVar;
                return "FutureChain[" + FutureChain.this + "]";
            }
        });
    }
}
