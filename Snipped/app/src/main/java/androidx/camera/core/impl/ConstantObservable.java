package androidx.camera.core.impl;

import a3.InterfaceFutureC0509a;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ConstantObservable<T> implements Observable<T> {
    private static final ConstantObservable<Object> NULL_OBSERVABLE = new ConstantObservable<>(null);
    private static final String TAG = "ConstantObservable";
    private final InterfaceFutureC0509a<T> mValueFuture;

    private ConstantObservable(T t3) {
        this.mValueFuture = Futures.immediateFuture(t3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addObserver$0(Observable.Observer observer) {
        try {
            observer.onNewData(this.mValueFuture.get());
        } catch (InterruptedException | ExecutionException e10) {
            observer.onError(e10);
        }
    }

    public static <U> Observable<U> withValue(U u6) {
        return u6 == null ? NULL_OBSERVABLE : new ConstantObservable(u6);
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(Executor executor, Observable.Observer<? super T> observer) {
        this.mValueFuture.addListener(new g(3, this, observer), executor);
    }

    @Override // androidx.camera.core.impl.Observable
    public InterfaceFutureC0509a<T> fetchData() {
        return this.mValueFuture;
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(Observable.Observer<? super T> observer) {
    }
}
