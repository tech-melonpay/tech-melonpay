package com.airbnb.epoxy;

import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes.dex */
public interface OnModelVisibilityChangedListener<T extends EpoxyModel<V>, V> {
    void onVisibilityChanged(T t3, V v10, float f10, float f11, int i, int i9);
}
