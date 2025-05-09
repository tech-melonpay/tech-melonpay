package androidx.camera.core.impl.utils.futures;

import a3.InterfaceFutureC0509a;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {
    private AsyncFunction<? super I, ? extends O> mFunction;
    private InterfaceFutureC0509a<? extends I> mInputFuture;
    private final BlockingQueue<Boolean> mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    private final CountDownLatch mOutputCreated = new CountDownLatch(1);
    volatile InterfaceFutureC0509a<? extends O> mOutputFuture;

    public ChainingListenableFuture(AsyncFunction<? super I, ? extends O> asyncFunction, InterfaceFutureC0509a<? extends I> interfaceFutureC0509a) {
        asyncFunction.getClass();
        this.mFunction = asyncFunction;
        interfaceFutureC0509a.getClass();
        this.mInputFuture = interfaceFutureC0509a;
    }

    private <E> void putUninterruptibly(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
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
    }

    private <E> E takeUninterruptibly(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z10 = false;
        while (true) {
            try {
                take = blockingQueue.take();
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
        return take;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, Boolean.valueOf(z10));
        cancel(this.mInputFuture, z10);
        cancel(this.mOutputFuture, z10);
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get() {
        if (!isDone()) {
            InterfaceFutureC0509a<? extends I> interfaceFutureC0509a = this.mInputFuture;
            if (interfaceFutureC0509a != null) {
                interfaceFutureC0509a.get();
            }
            this.mOutputCreated.await();
            InterfaceFutureC0509a<? extends O> interfaceFutureC0509a2 = this.mOutputFuture;
            if (interfaceFutureC0509a2 != null) {
                interfaceFutureC0509a2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a3.a<? extends I>, androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>] */
    @Override // java.lang.Runnable
    public void run() {
        final InterfaceFutureC0509a<? extends O> apply;
        ?? r02 = (AsyncFunction<? super I, ? extends O>) null;
        try {
        } catch (UndeclaredThrowableException e10) {
            setException(e10.getCause());
        }
        try {
            try {
                try {
                    try {
                        apply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                        this.mOutputFuture = apply;
                    } catch (CancellationException unused) {
                        cancel(false);
                    } catch (ExecutionException e11) {
                        setException(e11.getCause());
                    }
                } catch (Error e12) {
                    setException(e12);
                }
            } catch (Exception e13) {
                setException(e13);
            }
            if (!isCancelled()) {
                apply.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            try {
                                ChainingListenableFuture.this.set(Futures.getUninterruptibly(apply));
                            } catch (CancellationException unused2) {
                                ChainingListenableFuture.this.cancel(false);
                                ChainingListenableFuture.this.mOutputFuture = null;
                                return;
                            } catch (ExecutionException e14) {
                                ChainingListenableFuture.this.setException(e14.getCause());
                            }
                            ChainingListenableFuture.this.mOutputFuture = null;
                        } catch (Throwable th) {
                            ChainingListenableFuture.this.mOutputFuture = null;
                            throw th;
                        }
                    }
                }, CameraXExecutors.directExecutor());
            } else {
                apply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
                this.mOutputFuture = null;
            }
        } finally {
            this.mFunction = null;
            this.mInputFuture = null;
            this.mOutputCreated.countDown();
        }
    }

    private void cancel(Future<?> future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get(long j10, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            InterfaceFutureC0509a<? extends I> interfaceFutureC0509a = this.mInputFuture;
            if (interfaceFutureC0509a != null) {
                long nanoTime = System.nanoTime();
                interfaceFutureC0509a.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.mOutputCreated.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - nanoTime2);
                InterfaceFutureC0509a<? extends O> interfaceFutureC0509a2 = this.mOutputFuture;
                if (interfaceFutureC0509a2 != null) {
                    interfaceFutureC0509a2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j10, timeUnit);
    }
}
