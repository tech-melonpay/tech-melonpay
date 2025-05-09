package a3;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture.java */
/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceFutureC0509a<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
