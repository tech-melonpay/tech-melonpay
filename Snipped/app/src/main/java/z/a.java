package Z;

import androidx.concurrent.futures.AbstractResolvableFuture;

/* compiled from: ResolvableFuture.java */
/* loaded from: classes.dex */
public final class a<V> extends AbstractResolvableFuture<V> {
    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final boolean h(Throwable th) {
        throw null;
    }

    public final boolean i(V v10) {
        if (v10 == null) {
            v10 = (V) AbstractResolvableFuture.f5908g;
        }
        if (!AbstractResolvableFuture.f5907f.b(this, null, v10)) {
            return false;
        }
        AbstractResolvableFuture.b(this);
        return true;
    }
}
