package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class EpoxyModelWithView<T extends View> extends EpoxyModel<T> {
    @Override // com.airbnb.epoxy.EpoxyModel
    public abstract T buildView(ViewGroup viewGroup);

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        throw new UnsupportedOperationException("Layout resources are unsupported. Views must be created with `buildView`");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int getViewType() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public EpoxyModel<T> layout(int i) {
        throw new UnsupportedOperationException("Layout resources are unsupported. Views must be created with `buildView`");
    }
}
