package com.airbnb.epoxy;

import android.graphics.Canvas;
import android.view.View;
import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes.dex */
public interface EpoxySwipeCallback<T extends EpoxyModel> extends BaseEpoxyTouchCallback<T> {
    void onSwipeCompleted(T t3, View view, int i, int i9);

    void onSwipeProgressChanged(T t3, View view, float f10, Canvas canvas);

    void onSwipeReleased(T t3, View view);

    void onSwipeStarted(T t3, View view, int i);
}
