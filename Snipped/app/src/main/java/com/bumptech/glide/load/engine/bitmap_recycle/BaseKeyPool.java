package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import com.bumptech.glide.util.Util;
import java.util.Queue;

/* loaded from: classes.dex */
abstract class BaseKeyPool<T extends Poolable> {
    private static final int MAX_SIZE = 20;
    private final Queue<T> keyPool = Util.createQueue(20);

    public abstract T create();

    public T get() {
        T poll = this.keyPool.poll();
        return poll == null ? create() : poll;
    }

    public void offer(T t3) {
        if (this.keyPool.size() < 20) {
            this.keyPool.offer(t3);
        }
    }
}
