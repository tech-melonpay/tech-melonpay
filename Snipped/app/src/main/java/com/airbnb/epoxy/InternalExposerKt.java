package com.airbnb.epoxy;

import kotlin.Metadata;

/* compiled from: InternalExposer.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u0000\u001a\u001a\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u0005H\u0000¨\u0006\f"}, d2 = {"boundViewHoldersInternal", "Lcom/airbnb/epoxy/BoundViewHolders;", "kotlin.jvm.PlatformType", "Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "getModelForPositionInternal", "Lcom/airbnb/epoxy/EpoxyModel;", "position", "", "objectToBindInternal", "", "Lcom/airbnb/epoxy/EpoxyViewHolder;", "viewTypeInternal", "epoxy-adapter_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InternalExposerKt {
    public static final BoundViewHolders boundViewHoldersInternal(BaseEpoxyAdapter baseEpoxyAdapter) {
        return baseEpoxyAdapter.getBoundViewHolders();
    }

    public static final EpoxyModel<?> getModelForPositionInternal(BaseEpoxyAdapter baseEpoxyAdapter, int i) {
        return baseEpoxyAdapter.getModelForPosition(i);
    }

    public static final Object objectToBindInternal(EpoxyViewHolder epoxyViewHolder) {
        return epoxyViewHolder.objectToBind();
    }

    public static final int viewTypeInternal(EpoxyModel<?> epoxyModel) {
        return epoxyModel.getViewType();
    }
}
