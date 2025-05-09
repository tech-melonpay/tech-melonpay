package com.airbnb.epoxy;

import android.widget.Space;
import com.luminary.mobile.R;

/* loaded from: classes.dex */
class HiddenEpoxyModel extends EpoxyModel<Space> {
    @Override // com.airbnb.epoxy.EpoxyModel
    public int getDefaultLayout() {
        return R.layout.view_holder_empty_view;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int getSpanSize(int i, int i9, int i10) {
        return 0;
    }
}
