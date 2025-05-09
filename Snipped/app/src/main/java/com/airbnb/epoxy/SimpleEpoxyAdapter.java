package com.airbnb.epoxy;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class SimpleEpoxyAdapter extends EpoxyAdapter {
    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void addModels(EpoxyModel<?>... epoxyModelArr) {
        super.addModels(epoxyModelArr);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void enableDiffing() {
        super.enableDiffing();
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public List<EpoxyModel<?>> getAllModelsAfter(EpoxyModel<?> epoxyModel) {
        return super.getAllModelsAfter(epoxyModel);
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public BoundViewHolders getBoundViewHolders() {
        return super.getBoundViewHolders();
    }

    @Override // com.airbnb.epoxy.BaseEpoxyAdapter
    public int getModelPosition(EpoxyModel<?> epoxyModel) {
        return super.getModelPosition(epoxyModel);
    }

    public List<EpoxyModel<?>> getModels() {
        return this.models;
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void hideAllAfterModel(EpoxyModel<?> epoxyModel) {
        super.hideAllAfterModel(epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void hideModel(EpoxyModel<?> epoxyModel) {
        super.hideModel(epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void hideModels(Iterable<EpoxyModel<?>> iterable) {
        super.hideModels(iterable);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void insertModelAfter(EpoxyModel<?> epoxyModel, EpoxyModel<?> epoxyModel2) {
        super.insertModelAfter(epoxyModel, epoxyModel2);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void insertModelBefore(EpoxyModel<?> epoxyModel, EpoxyModel<?> epoxyModel2) {
        super.insertModelBefore(epoxyModel, epoxyModel2);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void notifyModelChanged(EpoxyModel<?> epoxyModel) {
        super.notifyModelChanged(epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void notifyModelsChanged() {
        super.notifyModelsChanged();
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void removeAllAfterModel(EpoxyModel<?> epoxyModel) {
        super.removeAllAfterModel(epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void removeAllModels() {
        super.removeAllModels();
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void removeModel(EpoxyModel<?> epoxyModel) {
        super.removeModel(epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void showModel(EpoxyModel<?> epoxyModel, boolean z10) {
        super.showModel(epoxyModel, z10);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void showModels(EpoxyModel<?>... epoxyModelArr) {
        super.showModels(epoxyModelArr);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void addModels(Collection<? extends EpoxyModel<?>> collection) {
        super.addModels(collection);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void hideModels(EpoxyModel<?>... epoxyModelArr) {
        super.hideModels(epoxyModelArr);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void showModel(EpoxyModel<?> epoxyModel) {
        super.showModel(epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void showModels(boolean z10, EpoxyModel<?>... epoxyModelArr) {
        super.showModels(z10, epoxyModelArr);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void showModels(Iterable<EpoxyModel<?>> iterable) {
        super.showModels(iterable);
    }

    @Override // com.airbnb.epoxy.EpoxyAdapter
    public void showModels(Iterable<EpoxyModel<?>> iterable, boolean z10) {
        super.showModels(iterable, z10);
    }
}
