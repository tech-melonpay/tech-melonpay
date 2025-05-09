package com.airbnb.epoxy;

import android.view.View;
import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes.dex */
public interface EpoxyDragCallback<T extends EpoxyModel> extends BaseEpoxyTouchCallback<T> {
    void onDragReleased(T t3, View view);

    void onDragStarted(T t3, View view, int i);

    void onModelMoved(int i, int i9, T t3, View view);
}
