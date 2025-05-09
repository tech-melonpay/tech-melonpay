package com.airbnb.epoxy;

import android.view.View;
import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes.dex */
public interface OnModelLongClickListener<T extends EpoxyModel<?>, V> {
    boolean onLongClick(T t3, V v10, View view, int i);
}
