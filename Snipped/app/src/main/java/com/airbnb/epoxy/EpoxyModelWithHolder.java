package com.airbnb.epoxy;

import android.view.ViewParent;
import com.airbnb.epoxy.EpoxyHolder;
import java.util.List;

/* loaded from: classes.dex */
public abstract class EpoxyModelWithHolder<T extends EpoxyHolder> extends EpoxyModel<T> {
    public EpoxyModelWithHolder() {
    }

    public abstract T createNewHolder(ViewParent viewParent);

    public EpoxyModelWithHolder(long j10) {
        super(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.epoxy.EpoxyModel
    public /* bridge */ /* synthetic */ void bind(Object obj, EpoxyModel epoxyModel) {
        bind((EpoxyModelWithHolder<T>) obj, (EpoxyModel<?>) epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean onFailedToRecycleView(T t3) {
        return super.onFailedToRecycleView((EpoxyModelWithHolder<T>) t3);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void onViewAttachedToWindow(T t3) {
        super.onViewAttachedToWindow((EpoxyModelWithHolder<T>) t3);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void onViewDetachedFromWindow(T t3) {
        super.onViewDetachedFromWindow((EpoxyModelWithHolder<T>) t3);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void onVisibilityChanged(float f10, float f11, int i, int i9, T t3) {
        super.onVisibilityChanged(f10, f11, i, i9, (int) t3);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void onVisibilityStateChanged(int i, T t3) {
        super.onVisibilityStateChanged(i, (int) t3);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void unbind(T t3) {
        super.unbind((EpoxyModelWithHolder<T>) t3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.epoxy.EpoxyModel
    public /* bridge */ /* synthetic */ void bind(Object obj, List list) {
        bind((EpoxyModelWithHolder<T>) obj, (List<Object>) list);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void bind(T t3) {
        super.bind((EpoxyModelWithHolder<T>) t3);
    }

    public void bind(T t3, List<Object> list) {
        super.bind((EpoxyModelWithHolder<T>) t3, list);
    }

    public void bind(T t3, EpoxyModel<?> epoxyModel) {
        super.bind((EpoxyModelWithHolder<T>) t3, epoxyModel);
    }
}
