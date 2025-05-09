package androidx.camera.core.impl;

import a3.InterfaceFutureC0509a;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface Observable<T> {

    public interface Observer<T> {
        void onError(Throwable th);

        void onNewData(T t3);
    }

    void addObserver(Executor executor, Observer<? super T> observer);

    InterfaceFutureC0509a<T> fetchData();

    void removeObserver(Observer<? super T> observer);
}
