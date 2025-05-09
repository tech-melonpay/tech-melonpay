package com.bumptech.glide.load;

import androidx.camera.core.impl.utils.a;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class Option<T> {
    private static final CacheKeyUpdater<Object> EMPTY_UPDATER = new CacheKeyUpdater<Object>() { // from class: com.bumptech.glide.load.Option.1
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public void update(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    };
    private final CacheKeyUpdater<T> cacheKeyUpdater;
    private final T defaultValue;
    private final String key;
    private volatile byte[] keyBytes;

    public interface CacheKeyUpdater<T> {
        void update(byte[] bArr, T t3, MessageDigest messageDigest);
    }

    private Option(String str, T t3, CacheKeyUpdater<T> cacheKeyUpdater) {
        this.key = Preconditions.checkNotEmpty(str);
        this.defaultValue = t3;
        this.cacheKeyUpdater = (CacheKeyUpdater) Preconditions.checkNotNull(cacheKeyUpdater);
    }

    public static <T> Option<T> disk(String str, CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, null, cacheKeyUpdater);
    }

    private static <T> CacheKeyUpdater<T> emptyUpdater() {
        return (CacheKeyUpdater<T>) EMPTY_UPDATER;
    }

    private byte[] getKeyBytes() {
        if (this.keyBytes == null) {
            this.keyBytes = this.key.getBytes(Key.CHARSET);
        }
        return this.keyBytes;
    }

    public static <T> Option<T> memory(String str) {
        return new Option<>(str, null, emptyUpdater());
    }

    public boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.key.equals(((Option) obj).key);
        }
        return false;
    }

    public T getDefaultValue() {
        return this.defaultValue;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return a.n(new StringBuilder("Option{key='"), this.key, "'}");
    }

    public void update(T t3, MessageDigest messageDigest) {
        this.cacheKeyUpdater.update(getKeyBytes(), t3, messageDigest);
    }

    public static <T> Option<T> disk(String str, T t3, CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, t3, cacheKeyUpdater);
    }

    public static <T> Option<T> memory(String str, T t3) {
        return new Option<>(str, t3, emptyUpdater());
    }
}
