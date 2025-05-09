package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.Resource;

/* loaded from: classes.dex */
public interface ResourceDecoder<T, Z> {
    Resource<Z> decode(T t3, int i, int i9, Options options);

    boolean handles(T t3, Options options);
}
