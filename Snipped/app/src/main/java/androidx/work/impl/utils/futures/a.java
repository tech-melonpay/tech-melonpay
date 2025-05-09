package androidx.work.impl.utils.futures;

import a3.InterfaceFutureC0509a;
import androidx.work.impl.utils.futures.AbstractFuture;

/* compiled from: SettableFuture.java */
/* loaded from: classes.dex */
public final class a<V> extends AbstractFuture<V> {
    public final boolean i(V v10) {
        if (v10 == null) {
            v10 = (V) AbstractFuture.f8219g;
        }
        if (!AbstractFuture.f8218f.b(this, null, v10)) {
            return false;
        }
        AbstractFuture.b(this);
        return true;
    }

    public final boolean j(Throwable th) {
        th.getClass();
        if (!AbstractFuture.f8218f.b(this, null, new AbstractFuture.Failure(th))) {
            return false;
        }
        AbstractFuture.b(this);
        return true;
    }

    public final boolean k(InterfaceFutureC0509a<? extends V> interfaceFutureC0509a) {
        AbstractFuture.Failure failure;
        interfaceFutureC0509a.getClass();
        Object obj = this.f8220a;
        if (obj == null) {
            if (interfaceFutureC0509a.isDone()) {
                if (!AbstractFuture.f8218f.b(this, null, AbstractFuture.e(interfaceFutureC0509a))) {
                    return false;
                }
                AbstractFuture.b(this);
            } else {
                AbstractFuture.e eVar = new AbstractFuture.e(this, interfaceFutureC0509a);
                if (AbstractFuture.f8218f.b(this, null, eVar)) {
                    try {
                        interfaceFutureC0509a.addListener(eVar, DirectExecutor.f8243a);
                    } catch (Throwable th) {
                        try {
                            failure = new AbstractFuture.Failure(th);
                        } catch (Throwable unused) {
                            failure = AbstractFuture.Failure.f8223b;
                        }
                        AbstractFuture.f8218f.b(this, eVar, failure);
                    }
                } else {
                    obj = this.f8220a;
                }
            }
            return true;
        }
        if (!(obj instanceof AbstractFuture.b)) {
            return false;
        }
        interfaceFutureC0509a.cancel(((AbstractFuture.b) obj).f8227a);
        return false;
    }
}
