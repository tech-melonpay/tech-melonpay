package com.bumptech.glide.load.data;

/* loaded from: classes.dex */
public interface DataRewinder<T> {

    public interface Factory<T> {
        DataRewinder<T> build(T t3);

        Class<T> getDataClass();
    }

    void cleanup();

    T rewindAndGet();
}
