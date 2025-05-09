package com.airbnb.epoxy;

import android.view.View;
import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes.dex */
interface BaseEpoxyTouchCallback<T extends EpoxyModel> {
    void clearView(T t3, View view);

    int getMovementFlagsForModel(T t3, int i);
}
