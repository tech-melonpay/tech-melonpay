package com.airbnb.epoxy;

import android.view.View;
import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes.dex */
public interface OnModelClickListener<T extends EpoxyModel<?>, V> {
    void onClick(T t3, V v10, View view, int i);
}
