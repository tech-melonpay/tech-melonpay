package com.airbnb.epoxy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class EpoxyAdapter extends BaseEpoxyAdapter {
    private DiffHelper diffHelper;
    private final HiddenEpoxyModel hiddenModel = new HiddenEpoxyModel();
    protected final List<EpoxyModel<?>> models = new ModelList();

    private void pauseModelListNotifications() {
        ((ModelList) this.models).pauseNotifications();
    }

    private void resumeModelListNotifications() {
        ((ModelList) this.models).resumeNotifications();
    }

    public void addModel(EpoxyModel<?> epoxyModel) {
        int size = this.models.size();
        pauseModelListNotifications();
        this.models.add(epoxyModel);
        resumeModelListNotifications();
        notifyItemRangeInserted(size, 1);
    }

    public void addModels(EpoxyModel<?>... epoxyModelArr) {
        int size = this.models.size();
        int length = epoxyModelArr.length;
        ((ModelList) this.models).ensureCapacity(size + length);
        pauseModelListNotifications();
        Collections.addAll(this.models, epoxyModelArr);
        resumeModelListNotifications();
        notifyItemRangeInserted(size, length);
    }

    public void enableDiffing() {
        if (this.diffHelper != null) {
            throw new IllegalStateException("Diffing was already enabled");
        }
        if (!this.models.isEmpty()) {
            throw new IllegalStateException("You must enable diffing before modifying models");
        }
        if (!hasStableIds()) {
            throw new IllegalStateException("You must have stable ids to use diffing");
        }
        this.diffHelper = new DiffHelper(this, false);
    }

    public List<EpoxyModel<?>> getAllModelsAfter(EpoxyModel<?> epoxyModel) {
        int modelPosition = getModelPosition(epoxyModel);
        if (modelPosition != -1) {
            List<EpoxyModel<?>> list = this.models;
            return list.subList(modelPosition + 1, list.size());
        }
        throw new IllegalStateException("Model is not added: " + epoxyModel);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public List<EpoxyModel<?>> getCurrentModels() {
        return this.models;
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public EpoxyModel<?> getModelForPosition(int i) {
        EpoxyModel<?> epoxyModel = this.models.get(i);
        return epoxyModel.isShown() ? epoxyModel : this.hiddenModel;
    }

    public void hideAllAfterModel(EpoxyModel<?> epoxyModel) {
        hideModels(getAllModelsAfter(epoxyModel));
    }

    public void hideModel(EpoxyModel<?> epoxyModel) {
        showModel(epoxyModel, false);
    }

    public void hideModels(Iterable<EpoxyModel<?>> iterable) {
        showModels(iterable, false);
    }

    public void insertModelAfter(EpoxyModel<?> epoxyModel, EpoxyModel<?> epoxyModel2) {
        int modelPosition = getModelPosition(epoxyModel2);
        if (modelPosition == -1) {
            throw new IllegalStateException("Model is not added: " + epoxyModel2);
        }
        int i = modelPosition + 1;
        pauseModelListNotifications();
        this.models.add(i, epoxyModel);
        resumeModelListNotifications();
        notifyItemInserted(i);
    }

    public void insertModelBefore(EpoxyModel<?> epoxyModel, EpoxyModel<?> epoxyModel2) {
        int modelPosition = getModelPosition(epoxyModel2);
        if (modelPosition == -1) {
            throw new IllegalStateException("Model is not added: " + epoxyModel2);
        }
        pauseModelListNotifications();
        this.models.add(modelPosition, epoxyModel);
        resumeModelListNotifications();
        notifyItemInserted(modelPosition);
    }

    public void notifyModelChanged(EpoxyModel<?> epoxyModel) {
        notifyModelChanged(epoxyModel, null);
    }

    public void notifyModelsChanged() {
        DiffHelper diffHelper = this.diffHelper;
        if (diffHelper == null) {
            throw new IllegalStateException("You must enable diffing before notifying models changed");
        }
        diffHelper.notifyModelChanges();
    }

    public void removeAllAfterModel(EpoxyModel<?> epoxyModel) {
        List<EpoxyModel<?>> allModelsAfter = getAllModelsAfter(epoxyModel);
        int size = allModelsAfter.size();
        int size2 = this.models.size();
        pauseModelListNotifications();
        allModelsAfter.clear();
        resumeModelListNotifications();
        notifyItemRangeRemoved(size2 - size, size);
    }

    public void removeAllModels() {
        int size = this.models.size();
        pauseModelListNotifications();
        this.models.clear();
        resumeModelListNotifications();
        notifyItemRangeRemoved(0, size);
    }

    public void removeModel(EpoxyModel<?> epoxyModel) {
        int modelPosition = getModelPosition(epoxyModel);
        if (modelPosition != -1) {
            pauseModelListNotifications();
            this.models.remove(modelPosition);
            resumeModelListNotifications();
            notifyItemRemoved(modelPosition);
        }
    }

    public void showModel(EpoxyModel<?> epoxyModel, boolean z10) {
        if (epoxyModel.isShown() == z10) {
            return;
        }
        epoxyModel.show2(z10);
        notifyModelChanged(epoxyModel);
    }

    public void showModels(EpoxyModel<?>... epoxyModelArr) {
        showModels(Arrays.asList(epoxyModelArr));
    }

    public void hideModels(EpoxyModel<?>... epoxyModelArr) {
        hideModels(Arrays.asList(epoxyModelArr));
    }

    public void notifyModelChanged(EpoxyModel<?> epoxyModel, Object obj) {
        int modelPosition = getModelPosition(epoxyModel);
        if (modelPosition != -1) {
            notifyItemChanged(modelPosition, obj);
        }
    }

    public void showModels(boolean z10, EpoxyModel<?>... epoxyModelArr) {
        showModels(Arrays.asList(epoxyModelArr), z10);
    }

    public void showModels(Iterable<EpoxyModel<?>> iterable) {
        showModels(iterable, true);
    }

    public void showModel(EpoxyModel<?> epoxyModel) {
        showModel(epoxyModel, true);
    }

    public void showModels(Iterable<EpoxyModel<?>> iterable, boolean z10) {
        Iterator<EpoxyModel<?>> it = iterable.iterator();
        while (it.hasNext()) {
            showModel(it.next(), z10);
        }
    }

    public void addModels(Collection<? extends EpoxyModel<?>> collection) {
        int size = this.models.size();
        pauseModelListNotifications();
        this.models.addAll(collection);
        resumeModelListNotifications();
        notifyItemRangeInserted(size, collection.size());
    }
}
