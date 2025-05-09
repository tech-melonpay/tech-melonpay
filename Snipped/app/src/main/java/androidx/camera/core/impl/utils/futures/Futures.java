package androidx.camera.core.impl.utils.futures;

import A0.b;
import a3.InterfaceFutureC0509a;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.ImmediateFuture;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p.InterfaceC1096a;
import pa.C1124b;

/* loaded from: classes.dex */
public final class Futures {
    private static final InterfaceC1096a<?, ?> IDENTITY_FUNCTION = new InterfaceC1096a<Object, Object>() { // from class: androidx.camera.core.impl.utils.futures.Futures.2
        @Override // p.InterfaceC1096a
        public Object apply(Object obj) {
            return obj;
        }
    };

    public static final class CallbackListener<V> implements Runnable {
        final FutureCallback<? super V> mCallback;
        final Future<V> mFuture;

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mCallback.onSuccess(Futures.getDone(this.mFuture));
            } catch (Error e10) {
                e = e10;
                this.mCallback.onFailure(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.mCallback.onFailure(e);
            } catch (ExecutionException e12) {
                Throwable cause = e12.getCause();
                if (cause == null) {
                    this.mCallback.onFailure(e12);
                } else {
                    this.mCallback.onFailure(cause);
                }
            }
        }

        public String toString() {
            return CallbackListener.class.getSimpleName() + "," + this.mCallback;
        }
    }

    private Futures() {
    }

    public static <V> void addCallback(InterfaceFutureC0509a<V> interfaceFutureC0509a, FutureCallback<? super V> futureCallback, Executor executor) {
        futureCallback.getClass();
        interfaceFutureC0509a.addListener(new CallbackListener(interfaceFutureC0509a, futureCallback), executor);
    }

    public static <V> InterfaceFutureC0509a<List<V>> allAsList(Collection<? extends InterfaceFutureC0509a<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), true, CameraXExecutors.directExecutor());
    }

    public static <V> V getDone(Future<V> future) {
        C1124b.q(future.isDone(), "Future was expected to be done, " + future);
        return (V) getUninterruptibly(future);
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public static <V> InterfaceFutureC0509a<V> immediateFailedFuture(Throwable th) {
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(Throwable th) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(th);
    }

    public static <V> InterfaceFutureC0509a<V> immediateFuture(V v10) {
        return v10 == null ? ImmediateFuture.nullFuture() : new ImmediateFuture.ImmediateSuccessfulFuture(v10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$nonCancellationPropagating$0(InterfaceFutureC0509a interfaceFutureC0509a, CallbackToFutureAdapter.a aVar) {
        propagateTransform(false, interfaceFutureC0509a, IDENTITY_FUNCTION, aVar, CameraXExecutors.directExecutor());
        return "nonCancellationPropagating[" + interfaceFutureC0509a + "]";
    }

    public static <V> InterfaceFutureC0509a<V> nonCancellationPropagating(InterfaceFutureC0509a<V> interfaceFutureC0509a) {
        interfaceFutureC0509a.getClass();
        return interfaceFutureC0509a.isDone() ? interfaceFutureC0509a : CallbackToFutureAdapter.a(new b(interfaceFutureC0509a, 22));
    }

    public static <V> void propagate(InterfaceFutureC0509a<V> interfaceFutureC0509a, CallbackToFutureAdapter.a<V> aVar) {
        propagateTransform(interfaceFutureC0509a, IDENTITY_FUNCTION, aVar, CameraXExecutors.directExecutor());
    }

    private static <I, O> void propagateTransform(boolean z10, final InterfaceFutureC0509a<I> interfaceFutureC0509a, final InterfaceC1096a<? super I, ? extends O> interfaceC1096a, final CallbackToFutureAdapter.a<O> aVar, Executor executor) {
        interfaceFutureC0509a.getClass();
        interfaceC1096a.getClass();
        aVar.getClass();
        executor.getClass();
        addCallback(interfaceFutureC0509a, new FutureCallback<I>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                CallbackToFutureAdapter.a.this.c(th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(I i) {
                try {
                    CallbackToFutureAdapter.a.this.b(interfaceC1096a.apply(i));
                } catch (Throwable th) {
                    CallbackToFutureAdapter.a.this.c(th);
                }
            }
        }, executor);
        if (z10) {
            aVar.a(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures.4
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceFutureC0509a.this.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    public static <V> InterfaceFutureC0509a<List<V>> successfulAsList(Collection<? extends InterfaceFutureC0509a<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), false, CameraXExecutors.directExecutor());
    }

    public static <I, O> InterfaceFutureC0509a<O> transform(InterfaceFutureC0509a<I> interfaceFutureC0509a, final InterfaceC1096a<? super I, ? extends O> interfaceC1096a, Executor executor) {
        interfaceC1096a.getClass();
        return transformAsync(interfaceFutureC0509a, new AsyncFunction<I, O>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public InterfaceFutureC0509a<O> apply(I i) {
                return Futures.immediateFuture(InterfaceC1096a.this.apply(i));
            }
        }, executor);
    }

    public static <I, O> InterfaceFutureC0509a<O> transformAsync(InterfaceFutureC0509a<I> interfaceFutureC0509a, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, interfaceFutureC0509a);
        interfaceFutureC0509a.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    public static <I, O> void propagateTransform(InterfaceFutureC0509a<I> interfaceFutureC0509a, InterfaceC1096a<? super I, ? extends O> interfaceC1096a, CallbackToFutureAdapter.a<O> aVar, Executor executor) {
        propagateTransform(true, interfaceFutureC0509a, interfaceC1096a, aVar, executor);
    }
}
