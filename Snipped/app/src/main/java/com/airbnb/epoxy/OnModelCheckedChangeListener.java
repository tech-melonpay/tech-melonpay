package com.airbnb.epoxy;

import android.widget.CompoundButton;
import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes.dex */
public interface OnModelCheckedChangeListener<T extends EpoxyModel<?>, V> {
    void onChecked(T t3, V v10, CompoundButton compoundButton, boolean z10, int i);
}
