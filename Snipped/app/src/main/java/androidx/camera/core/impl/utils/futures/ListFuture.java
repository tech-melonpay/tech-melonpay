package androidx.camera.core.impl.utils.futures;

import a3.InterfaceFutureC0509a;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import pa.C1124b;

/* loaded from: classes.dex */
class ListFuture<V> implements InterfaceFutureC0509a<List<V>> {
    private final boolean mAllMustSucceed;
    List<? extends InterfaceFutureC0509a<? extends V>> mFutures;
    private final AtomicInteger mRemaining;
    private final InterfaceFutureC0509a<List<V>> mResult;
    CallbackToFutureAdapter.a<List<V>> mResultNotifier;
    List<V> mValues;

    public ListFuture(List<? extends InterfaceFutureC0509a<? extends V>> list, boolean z10, Executor executor) {
        list.getClass();
        this.mFutures = list;
        this.mValues = new ArrayList(list.size());
        this.mAllMustSucceed = z10;
        this.mRemaining = new AtomicInteger(list.size());
        this.mResult = CallbackToFutureAdapter.a(new CallbackToFutureAdapter.b<List<V>>() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
            public Object attachCompleter(CallbackToFutureAdapter.a<List<V>> aVar) {
                C1124b.q(ListFuture.this.mResultNotifier == null, "The result can only set once!");
                ListFuture.this.mResultNotifier = aVar;
                return "ListFuture[" + this + "]";
            }
        });
        init(executor);
    }

    private void callAllGets() {
        List<? extends InterfaceFutureC0509a<? extends V>> list = this.mFutures;
        if (list == null || isDone()) {
            return;
        }
        for (InterfaceFutureC0509a<? extends V> interfaceFutureC0509a : list) {
            while (!interfaceFutureC0509a.isDone()) {
                try {
                    interfaceFutureC0509a.get();
                } catch (Error e10) {
                    throw e10;
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (Throwable unused) {
                    if (this.mAllMustSucceed) {
                        return;
                    }
                }
            }
        }
    }

    private void init(Executor executor) {
        addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.2
            @Override // java.lang.Runnable
            public void run() {
                ListFuture listFuture = ListFuture.this;
                listFuture.mValues = null;
                listFuture.mFutures = null;
            }
        }, CameraXExecutors.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.b(new ArrayList(this.mValues));
            return;
        }
        for (int i = 0; i < this.mFutures.size(); i++) {
            this.mValues.add(null);
        }
        List<? extends InterfaceFutureC0509a<? extends V>> list = this.mFutures;
        for (final int i9 = 0; i9 < list.size(); i9++) {
            final InterfaceFutureC0509a<? extends V> interfaceFutureC0509a = list.get(i9);
            interfaceFutureC0509a.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ListFuture.3
                @Override // java.lang.Runnable
                public void run() {
                    ListFuture.this.setOneValue(i9, interfaceFutureC0509a);
                }
            }, executor);
        }
    }

    @Override // a3.InterfaceFutureC0509a
    public void addListener(Runnable runnable, Executor executor) {
        this.mResult.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List<? extends InterfaceFutureC0509a<? extends V>> list = this.mFutures;
        if (list != null) {
            Iterator<? extends InterfaceFutureC0509a<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z10);
            }
        }
        return this.mResult.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mResult.isDone();
    }

    public void setOneValue(int i, Future<? extends V> future) {
        CallbackToFutureAdapter.a<List<V>> aVar;
        ArrayList arrayList;
        int decrementAndGet;
        List<V> list = this.mValues;
        if (isDone() || list == null) {
            C1124b.q(this.mAllMustSucceed, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    C1124b.q(future.isDone(), "Tried to set value from future which is not done");
                    list.set(i, Futures.getUninterruptibly(future));
                    decrementAndGet = this.mRemaining.decrementAndGet();
                    C1124b.q(decrementAndGet >= 0, "Less than 0 remaining futures");
                } catch (RuntimeException e10) {
                    if (this.mAllMustSucceed) {
                        this.mResultNotifier.c(e10);
                    }
                    int decrementAndGet2 = this.mRemaining.decrementAndGet();
                    C1124b.q(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet2 != 0) {
                        return;
                    }
                    List<V> list2 = this.mValues;
                    if (list2 != null) {
                        aVar = this.mResultNotifier;
                        arrayList = new ArrayList(list2);
                    }
                } catch (ExecutionException e11) {
                    if (this.mAllMustSucceed) {
                        this.mResultNotifier.c(e11.getCause());
                    }
                    int decrementAndGet3 = this.mRemaining.decrementAndGet();
                    C1124b.q(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet3 != 0) {
                        return;
                    }
                    List<V> list3 = this.mValues;
                    if (list3 != null) {
                        aVar = this.mResultNotifier;
                        arrayList = new ArrayList(list3);
                    }
                }
            } catch (Error e12) {
                this.mResultNotifier.c(e12);
                int decrementAndGet4 = this.mRemaining.decrementAndGet();
                C1124b.q(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet4 != 0) {
                    return;
                }
                List<V> list4 = this.mValues;
                if (list4 != null) {
                    aVar = this.mResultNotifier;
                    arrayList = new ArrayList(list4);
                }
            } catch (CancellationException unused) {
                if (this.mAllMustSucceed) {
                    cancel(false);
                }
                int decrementAndGet5 = this.mRemaining.decrementAndGet();
                C1124b.q(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet5 != 0) {
                    return;
                }
                List<V> list5 = this.mValues;
                if (list5 != null) {
                    aVar = this.mResultNotifier;
                    arrayList = new ArrayList(list5);
                }
            }
            if (decrementAndGet == 0) {
                List<V> list6 = this.mValues;
                if (list6 != null) {
                    aVar = this.mResultNotifier;
                    arrayList = new ArrayList(list6);
                    aVar.b(arrayList);
                    return;
                }
                C1124b.q(isDone(), null);
            }
        } catch (Throwable th) {
            int decrementAndGet6 = this.mRemaining.decrementAndGet();
            C1124b.q(decrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List<V> list7 = this.mValues;
                if (list7 != null) {
                    this.mResultNotifier.b(new ArrayList(list7));
                } else {
                    C1124b.q(isDone(), null);
                }
            }
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public List<V> get() {
        callAllGets();
        return this.mResult.get();
    }

    @Override // java.util.concurrent.Future
    public List<V> get(long j10, TimeUnit timeUnit) {
        return this.mResult.get(j10, timeUnit);
    }
}
