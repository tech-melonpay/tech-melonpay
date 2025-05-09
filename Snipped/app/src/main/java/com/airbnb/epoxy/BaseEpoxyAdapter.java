package com.airbnb.epoxy;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseEpoxyAdapter extends RecyclerView.Adapter<EpoxyViewHolder> implements StickyHeaderCallbacks {
    private static final String SAVED_STATE_ARG_VIEW_HOLDERS = "saved_state_view_holders";
    private final GridLayoutManager.c spanSizeLookup;
    private int spanCount = 1;
    private final ViewTypeManager viewTypeManager = new ViewTypeManager();
    private final BoundViewHolders boundViewHolders = new BoundViewHolders();
    private ViewHolderState viewHolderState = new ViewHolderState();

    public BaseEpoxyAdapter() {
        GridLayoutManager.c cVar = new GridLayoutManager.c() { // from class: com.airbnb.epoxy.BaseEpoxyAdapter.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int getSpanSize(int i) {
                try {
                    return BaseEpoxyAdapter.this.getModelForPosition(i).spanSize(BaseEpoxyAdapter.this.spanCount, i, BaseEpoxyAdapter.this.getItemCount());
                } catch (IndexOutOfBoundsException e10) {
                    BaseEpoxyAdapter.this.onExceptionSwallowed(e10);
                    return 1;
                }
            }
        };
        this.spanSizeLookup = cVar;
        setHasStableIds(true);
        cVar.setSpanIndexCacheEnabled(true);
    }

    public boolean diffPayloadsEnabled() {
        return false;
    }

    public BoundViewHolders getBoundViewHolders() {
        return this.boundViewHolders;
    }

    public abstract List<? extends EpoxyModel<?>> getCurrentModels();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getCurrentModels().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return getCurrentModels().get(i).id();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.viewTypeManager.getViewTypeAndRememberModel(getModelForPosition(i));
    }

    public EpoxyModel<?> getModelForPosition(int i) {
        return getCurrentModels().get(i);
    }

    public int getModelPosition(EpoxyModel<?> epoxyModel) {
        int size = getCurrentModels().size();
        for (int i = 0; i < size; i++) {
            if (epoxyModel == getCurrentModels().get(i)) {
                return i;
            }
        }
        return -1;
    }

    public int getSpanCount() {
        return this.spanCount;
    }

    public GridLayoutManager.c getSpanSizeLookup() {
        return this.spanSizeLookup;
    }

    public boolean isEmpty() {
        return getCurrentModels().isEmpty();
    }

    public boolean isMultiSpan() {
        return this.spanCount > 1;
    }

    @Override // com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public boolean isStickyHeader(int i) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.viewTypeManager.lastModelForViewTypeLookup = null;
    }

    public void onModelBound(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel, int i) {
    }

    public void onRestoreInstanceState(Bundle bundle) {
        if (this.boundViewHolders.size() > 0) {
            throw new IllegalStateException("State cannot be restored once views have been bound. It should be done before adding the adapter to the recycler view.");
        }
        if (bundle != null) {
            ViewHolderState viewHolderState = (ViewHolderState) bundle.getParcelable(SAVED_STATE_ARG_VIEW_HOLDERS);
            this.viewHolderState = viewHolderState;
            if (viewHolderState == null) {
                throw new IllegalStateException("Tried to restore instance state, but onSaveInstanceState was never called.");
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Iterator<EpoxyViewHolder> it = this.boundViewHolders.iterator();
        while (it.hasNext()) {
            this.viewHolderState.save(it.next());
        }
        if (this.viewHolderState.size() > 0 && !hasStableIds()) {
            throw new IllegalStateException("Must have stable ids when saving view holder state");
        }
        bundle.putParcelable(SAVED_STATE_ARG_VIEW_HOLDERS, this.viewHolderState);
    }

    public void setSpanCount(int i) {
        this.spanCount = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(EpoxyViewHolder epoxyViewHolder, int i, List list) {
        onBindViewHolder2(epoxyViewHolder, i, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public EpoxyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        EpoxyModel<?> modelForViewType = this.viewTypeManager.getModelForViewType(this, i);
        return new EpoxyViewHolder(viewGroup, modelForViewType.buildView(viewGroup), modelForViewType.shouldSaveViewState());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(EpoxyViewHolder epoxyViewHolder) {
        return epoxyViewHolder.getModel().onFailedToRecycleView(epoxyViewHolder.objectToBind());
    }

    public void onModelBound(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel, int i, List<Object> list) {
        onModelBound(epoxyViewHolder, epoxyModel, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(EpoxyViewHolder epoxyViewHolder) {
        epoxyViewHolder.getModel().onViewAttachedToWindow(epoxyViewHolder.objectToBind());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(EpoxyViewHolder epoxyViewHolder) {
        epoxyViewHolder.getModel().onViewDetachedFromWindow(epoxyViewHolder.objectToBind());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(EpoxyViewHolder epoxyViewHolder) {
        this.viewHolderState.save(epoxyViewHolder);
        this.boundViewHolders.remove(epoxyViewHolder);
        EpoxyModel<?> model = epoxyViewHolder.getModel();
        epoxyViewHolder.unbind();
        onModelUnbound(epoxyViewHolder, model);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(EpoxyViewHolder epoxyViewHolder, int i) {
        onBindViewHolder2(epoxyViewHolder, i, Collections.emptyList());
    }

    public void onModelBound(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel, int i, EpoxyModel<?> epoxyModel2) {
        onModelBound(epoxyViewHolder, epoxyModel, i);
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(EpoxyViewHolder epoxyViewHolder, int i, List<Object> list) {
        EpoxyModel<?> modelForPosition = getModelForPosition(i);
        EpoxyModel<?> modelFromPayload = diffPayloadsEnabled() ? DiffPayload.getModelFromPayload(list, getItemId(i)) : null;
        epoxyViewHolder.bind(modelForPosition, modelFromPayload, list, i);
        if (list.isEmpty()) {
            this.viewHolderState.restore(epoxyViewHolder);
        }
        this.boundViewHolders.put(epoxyViewHolder);
        if (diffPayloadsEnabled()) {
            onModelBound(epoxyViewHolder, modelForPosition, i, modelFromPayload);
        } else {
            onModelBound(epoxyViewHolder, modelForPosition, i, list);
        }
    }

    public void onExceptionSwallowed(RuntimeException runtimeException) {
    }

    @Override // com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void setupStickyHeaderView(View view) {
    }

    @Override // com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void teardownStickyHeaderView(View view) {
    }

    public void onModelUnbound(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel) {
    }
}
