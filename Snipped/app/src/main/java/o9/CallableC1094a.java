package o9;

import j9.AbstractC0909d;
import java.util.concurrent.Callable;

/* compiled from: MaybeFromCallable.java */
/* renamed from: o9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC1094a<T> extends AbstractC0909d<T> implements Callable<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Callable<? extends T> f24399a;

    public CallableC1094a(Callable<? extends T> callable) {
        this.f24399a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return this.f24399a.call();
    }
}
