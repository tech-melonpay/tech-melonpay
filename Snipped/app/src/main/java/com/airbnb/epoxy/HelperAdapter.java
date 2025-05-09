package com.airbnb.epoxy;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ModelGroupHolder.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/airbnb/epoxy/HelperAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/airbnb/epoxy/EpoxyViewHolder;", "<init>", "()V", "Landroid/view/ViewParent;", "modelGroupParent", "Lcom/airbnb/epoxy/EpoxyModel;", "model", "Landroid/view/ViewGroup;", "parent", "", "viewType", "createViewHolder", "(Landroid/view/ViewParent;Lcom/airbnb/epoxy/EpoxyModel;Landroid/view/ViewGroup;I)Lcom/airbnb/epoxy/EpoxyViewHolder;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/airbnb/epoxy/EpoxyViewHolder;", "holder", "position", "LO9/p;", "onBindViewHolder", "(Lcom/airbnb/epoxy/EpoxyViewHolder;I)V", "getItemCount", "()I", "Lcom/airbnb/epoxy/EpoxyModel;", "Landroid/view/ViewParent;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HelperAdapter extends RecyclerView.Adapter<EpoxyViewHolder> {
    private EpoxyModel<?> model;
    private ViewParent modelGroupParent;

    public final EpoxyViewHolder createViewHolder(ViewParent modelGroupParent, EpoxyModel<?> model, ViewGroup parent, int viewType) {
        this.model = model;
        this.modelGroupParent = modelGroupParent;
        EpoxyViewHolder createViewHolder = createViewHolder(parent, viewType);
        this.model = null;
        this.modelGroupParent = null;
        return createViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(EpoxyViewHolder holder, int position) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public EpoxyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EpoxyViewHolder(this.modelGroupParent, this.model.buildView(parent), this.model.shouldSaveViewState());
    }
}
