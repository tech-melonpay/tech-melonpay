package com.bumptech.glide.load.model;

import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.Queue;

/* loaded from: classes.dex */
public class ModelCache<A, B> {
    private static final int DEFAULT_SIZE = 250;
    private final LruCache<ModelKey<A>, B> cache;

    public static final class ModelKey<A> {
        private static final Queue<ModelKey<?>> KEY_QUEUE = Util.createQueue(0);
        private int height;
        private A model;
        private int width;

        private ModelKey() {
        }

        public static <A> ModelKey<A> get(A a10, int i, int i9) {
            ModelKey<A> modelKey;
            Queue<ModelKey<?>> queue = KEY_QUEUE;
            synchronized (queue) {
                modelKey = (ModelKey) queue.poll();
            }
            if (modelKey == null) {
                modelKey = new ModelKey<>();
            }
            modelKey.init(a10, i, i9);
            return modelKey;
        }

        private void init(A a10, int i, int i9) {
            this.model = a10;
            this.width = i;
            this.height = i9;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ModelKey)) {
                return false;
            }
            ModelKey modelKey = (ModelKey) obj;
            return this.width == modelKey.width && this.height == modelKey.height && this.model.equals(modelKey.model);
        }

        public int hashCode() {
            return this.model.hashCode() + (((this.height * 31) + this.width) * 31);
        }

        public void release() {
            Queue<ModelKey<?>> queue = KEY_QUEUE;
            synchronized (queue) {
                queue.offer(this);
            }
        }
    }

    public ModelCache() {
        this(250L);
    }

    public void clear() {
        this.cache.clearMemory();
    }

    public B get(A a10, int i, int i9) {
        ModelKey<A> modelKey = ModelKey.get(a10, i, i9);
        B b9 = this.cache.get(modelKey);
        modelKey.release();
        return b9;
    }

    public void put(A a10, int i, int i9, B b9) {
        this.cache.put(ModelKey.get(a10, i, i9), b9);
    }

    public ModelCache(long j10) {
        this.cache = new LruCache<ModelKey<A>, B>(j10) { // from class: com.bumptech.glide.load.model.ModelCache.1
            @Override // com.bumptech.glide.util.LruCache
            public /* bridge */ /* synthetic */ void onItemEvicted(Object obj, Object obj2) {
                onItemEvicted((ModelKey) obj, (ModelKey<A>) obj2);
            }

            public void onItemEvicted(ModelKey<A> modelKey, B b9) {
                modelKey.release();
            }
        };
    }
}
