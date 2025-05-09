package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes.dex */
public interface ArrayPool {
    public static final int STANDARD_BUFFER_SIZE_BYTES = 65536;

    void clearMemory();

    <T> T get(int i, Class<T> cls);

    <T> T getExact(int i, Class<T> cls);

    <T> void put(T t3);

    @Deprecated
    <T> void put(T t3, Class<T> cls);

    void trimMemory(int i);
}
