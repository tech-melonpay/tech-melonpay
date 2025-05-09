package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class EpoxyHolder {
    public EpoxyHolder(ViewParent viewParent) {
        this();
    }

    public abstract void bindView(View view);

    public EpoxyHolder() {
    }
}
