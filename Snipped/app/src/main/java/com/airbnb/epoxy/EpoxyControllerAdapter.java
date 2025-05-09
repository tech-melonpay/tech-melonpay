package com.airbnb.epoxy;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.airbnb.epoxy.AsyncEpoxyDiffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class EpoxyControllerAdapter extends BaseEpoxyAdapter implements AsyncEpoxyDiffer.ResultCallback {
    private static final q.e<EpoxyModel<?>> ITEM_CALLBACK = new q.e<EpoxyModel<?>>() { // from class: com.airbnb.epoxy.EpoxyControllerAdapter.1
        @Override // androidx.recyclerview.widget.q.e
        public boolean areContentsTheSame(EpoxyModel<?> epoxyModel, EpoxyModel<?> epoxyModel2) {
            return epoxyModel.equals(epoxyModel2);
        }

        @Override // androidx.recyclerview.widget.q.e
        public boolean areItemsTheSame(EpoxyModel<?> epoxyModel, EpoxyModel<?> epoxyModel2) {
            return epoxyModel.id() == epoxyModel2.id();
        }

        @Override // androidx.recyclerview.widget.q.e
        public Object getChangePayload(EpoxyModel<?> epoxyModel, EpoxyModel<?> epoxyModel2) {
            return new DiffPayload(epoxyModel);
        }
    };
    private final AsyncEpoxyDiffer differ;
    private final EpoxyController epoxyController;
    private int itemCount;
    private final List<OnModelBuildFinishedListener> modelBuildListeners;
    private final NotifyBlocker notifyBlocker;

    public EpoxyControllerAdapter(EpoxyController epoxyController, Handler handler) {
        NotifyBlocker notifyBlocker = new NotifyBlocker();
        this.notifyBlocker = notifyBlocker;
        this.modelBuildListeners = new ArrayList();
        this.epoxyController = epoxyController;
        this.differ = new AsyncEpoxyDiffer(handler, this, ITEM_CALLBACK);
        registerAdapterDataObserver(notifyBlocker);
    }

    public void addModelBuildListener(OnModelBuildFinishedListener onModelBuildFinishedListener) {
        this.modelBuildListeners.add(onModelBuildFinishedListener);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public boolean diffPayloadsEnabled() {
        return true;
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public BoundViewHolders getBoundViewHolders() {
        return super.getBoundViewHolders();
    }

    public List<EpoxyModel<?>> getCopyOfModels() {
        return getCurrentModels();
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public List<? extends EpoxyModel<?>> getCurrentModels() {
        return this.differ.getCurrentList();
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.itemCount;
    }

    public EpoxyModel<?> getModelAtPosition(int i) {
        return getCurrentModels().get(i);
    }

    public EpoxyModel<?> getModelById(long j10) {
        for (EpoxyModel<?> epoxyModel : getCurrentModels()) {
            if (epoxyModel.id() == j10) {
                return epoxyModel;
            }
        }
        return null;
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public int getModelPosition(EpoxyModel<?> epoxyModel) {
        int size = getCurrentModels().size();
        for (int i = 0; i < size; i++) {
            if (getCurrentModels().get(i).id() == epoxyModel.id()) {
                return i;
            }
        }
        return -1;
    }

    public boolean isDiffInProgress() {
        return this.differ.isDiffInProgress();
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public boolean isStickyHeader(int i) {
        return this.epoxyController.isStickyHeader(i);
    }

    public void moveModel(int i, int i9) {
        ArrayList arrayList = new ArrayList(getCurrentModels());
        arrayList.add(i9, (EpoxyModel) arrayList.remove(i));
        this.notifyBlocker.allowChanges();
        notifyItemMoved(i, i9);
        this.notifyBlocker.blockChanges();
        if (this.differ.forceListOverride(arrayList)) {
            this.epoxyController.requestModelBuild();
        }
    }

    public void notifyModelChanged(int i) {
        ArrayList arrayList = new ArrayList(getCurrentModels());
        this.notifyBlocker.allowChanges();
        notifyItemChanged(i);
        this.notifyBlocker.blockChanges();
        if (this.differ.forceListOverride(arrayList)) {
            this.epoxyController.requestModelBuild();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.epoxyController.onAttachedToRecyclerViewInternal(recyclerView);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.epoxyController.onDetachedFromRecyclerViewInternal(recyclerView);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public void onExceptionSwallowed(RuntimeException runtimeException) {
        this.epoxyController.onExceptionSwallowed(runtimeException);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public void onModelBound(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel, int i, EpoxyModel<?> epoxyModel2) {
        this.epoxyController.onModelBound(epoxyViewHolder, epoxyModel, i, epoxyModel2);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public void onModelUnbound(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel) {
        this.epoxyController.onModelUnbound(epoxyViewHolder, epoxyModel);
    }

    @Override // com.airbnb.epoxy.AsyncEpoxyDiffer.ResultCallback
    public void onResult(DiffResult diffResult) {
        this.itemCount = diffResult.newModels.size();
        this.notifyBlocker.allowChanges();
        diffResult.dispatchTo(this);
        this.notifyBlocker.blockChanges();
        for (int size = this.modelBuildListeners.size() - 1; size >= 0; size--) {
            this.modelBuildListeners.get(size).onModelBuildFinished(diffResult);
        }
    }

    public void removeModelBuildListener(OnModelBuildFinishedListener onModelBuildFinishedListener) {
        this.modelBuildListeners.remove(onModelBuildFinishedListener);
    }

    public void setModels(ControllerModelList controllerModelList) {
        List<? extends EpoxyModel<?>> currentModels = getCurrentModels();
        if (!currentModels.isEmpty()) {
            if (currentModels.get(0).isDebugValidationEnabled()) {
                for (int i = 0; i < currentModels.size(); i++) {
                    currentModels.get(i).validateStateHasNotChangedSinceAdded("The model was changed between being bound and when models were rebuilt", i);
                }
            }
        }
        this.differ.submitList(controllerModelList);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void setupStickyHeaderView(View view) {
        this.epoxyController.setupStickyHeaderView(view);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
    public void teardownStickyHeaderView(View view) {
        this.epoxyController.teardownStickyHeaderView(view);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(EpoxyViewHolder epoxyViewHolder) {
        super.onViewAttachedToWindow(epoxyViewHolder);
        this.epoxyController.onViewAttachedToWindow(epoxyViewHolder, epoxyViewHolder.getModel());
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(EpoxyViewHolder epoxyViewHolder) {
        super.onViewDetachedFromWindow(epoxyViewHolder);
        this.epoxyController.onViewDetachedFromWindow(epoxyViewHolder, epoxyViewHolder.getModel());
    }
}
