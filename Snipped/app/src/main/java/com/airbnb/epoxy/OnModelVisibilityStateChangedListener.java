package com.airbnb.epoxy;

import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes.dex */
public interface OnModelVisibilityStateChangedListener<T extends EpoxyModel<V>, V> {
    void onVisibilityStateChanged(T t3, V v10, int i);
}
