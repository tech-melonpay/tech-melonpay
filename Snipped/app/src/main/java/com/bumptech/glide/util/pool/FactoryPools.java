package com.bumptech.glide.util.pool;

import a0.C0506b;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import x0.d;
import x0.e;

/* loaded from: classes.dex */
public final class FactoryPools {
    private static final int DEFAULT_POOL_SIZE = 20;
    private static final Resetter<Object> EMPTY_RESETTER = new Resetter<Object>() { // from class: com.bumptech.glide.util.pool.FactoryPools.1
        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public void reset(Object obj) {
        }
    };
    private static final String TAG = "FactoryPools";

    public interface Factory<T> {
        T create();
    }

    public static final class FactoryPool<T> implements d<T> {
        private final Factory<T> factory;
        private final d<T> pool;
        private final Resetter<T> resetter;

        public FactoryPool(d<T> dVar, Factory<T> factory, Resetter<T> resetter) {
            this.pool = dVar;
            this.factory = factory;
            this.resetter = resetter;
        }

        @Override // x0.d
        public T acquire() {
            T acquire = this.pool.acquire();
            if (acquire == null) {
                acquire = this.factory.create();
                if (Log.isLoggable(FactoryPools.TAG, 2)) {
                    Log.v(FactoryPools.TAG, "Created new " + acquire.getClass());
                }
            }
            if (acquire instanceof Poolable) {
                acquire.getVerifier().setRecycled(false);
            }
            return (T) acquire;
        }

        @Override // x0.d
        public boolean release(T t3) {
            if (t3 instanceof Poolable) {
                ((Poolable) t3).getVerifier().setRecycled(true);
            }
            this.resetter.reset(t3);
            return this.pool.release(t3);
        }
    }

    public interface Poolable {
        StateVerifier getVerifier();
    }

    public interface Resetter<T> {
        void reset(T t3);
    }

    private FactoryPools() {
    }

    private static <T extends Poolable> d<T> build(d<T> dVar, Factory<T> factory) {
        return build(dVar, factory, emptyResetter());
    }

    private static <T> Resetter<T> emptyResetter() {
        return (Resetter<T>) EMPTY_RESETTER;
    }

    public static <T extends Poolable> d<T> simple(int i, Factory<T> factory) {
        return build(new C0506b(i), factory);
    }

    public static <T extends Poolable> d<T> threadSafe(int i, Factory<T> factory) {
        return build(new e(i), factory);
    }

    public static <T> d<List<T>> threadSafeList() {
        return threadSafeList(20);
    }

    private static <T> d<T> build(d<T> dVar, Factory<T> factory, Resetter<T> resetter) {
        return new FactoryPool(dVar, factory, resetter);
    }

    public static <T extends Poolable> d<T> threadSafe(int i, Factory<T> factory, Resetter<T> resetter) {
        return build(new e(i), factory, resetter);
    }

    public static <T> d<List<T>> threadSafeList(int i) {
        return build(new e(i), new Factory<List<T>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.2
            @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
            public List<T> create() {
                return new ArrayList();
            }
        }, new Resetter<List<T>>() { // from class: com.bumptech.glide.util.pool.FactoryPools.3
            @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
            public void reset(List<T> list) {
                list.clear();
            }
        });
    }
}
