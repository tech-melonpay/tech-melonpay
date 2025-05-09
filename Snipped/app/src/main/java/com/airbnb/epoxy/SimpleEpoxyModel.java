package com.airbnb.epoxy;

import android.view.View;

/* loaded from: classes.dex */
public class SimpleEpoxyModel extends EpoxyModel<View> {
    private final int layoutRes;
    private View.OnClickListener onClickListener;
    private int spanCount = 1;

    public SimpleEpoxyModel(int i) {
        this.layoutRes = i;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleEpoxyModel) || !super.equals(obj)) {
            return false;
        }
        SimpleEpoxyModel simpleEpoxyModel = (SimpleEpoxyModel) obj;
        if (this.layoutRes != simpleEpoxyModel.layoutRes || this.spanCount != simpleEpoxyModel.spanCount) {
            return false;
        }
        View.OnClickListener onClickListener = this.onClickListener;
        return onClickListener != null ? onClickListener.equals(simpleEpoxyModel.onClickListener) : simpleEpoxyModel.onClickListener == null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int getDefaultLayout() {
        return this.layoutRes;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int getSpanSize(int i, int i9, int i10) {
        return this.spanCount;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.layoutRes) * 31;
        View.OnClickListener onClickListener = this.onClickListener;
        return ((hashCode + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31) + this.spanCount;
    }

    public SimpleEpoxyModel onClick(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
        return this;
    }

    public SimpleEpoxyModel span(int i) {
        this.spanCount = i;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void bind(View view) {
        super.bind((SimpleEpoxyModel) view);
        view.setOnClickListener(this.onClickListener);
        view.setClickable(this.onClickListener != null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void unbind(View view) {
        super.unbind((SimpleEpoxyModel) view);
        view.setOnClickListener(null);
    }
}
