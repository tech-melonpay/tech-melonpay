package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes.dex */
interface ArrayAdapterInterface<T> {
    int getArrayLength(T t3);

    int getElementSizeInBytes();

    String getTag();

    T newArray(int i);
}
