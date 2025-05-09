package com.airbnb.epoxy;

/* loaded from: classes.dex */
class ModelState {
    int hashCode;
    long id;
    int lastMoveOp;
    EpoxyModel<?> model;
    ModelState pair;
    int position;

    public static ModelState build(EpoxyModel<?> epoxyModel, int i, boolean z10) {
        ModelState modelState = new ModelState();
        modelState.lastMoveOp = 0;
        modelState.pair = null;
        modelState.id = epoxyModel.id();
        modelState.position = i;
        if (z10) {
            modelState.model = epoxyModel;
        } else {
            modelState.hashCode = epoxyModel.hashCode();
        }
        return modelState;
    }

    public void pairWithSelf() {
        if (this.pair != null) {
            throw new IllegalStateException("Already paired.");
        }
        ModelState modelState = new ModelState();
        this.pair = modelState;
        modelState.lastMoveOp = 0;
        modelState.id = this.id;
        modelState.position = this.position;
        modelState.hashCode = this.hashCode;
        modelState.pair = this;
        this.pair.model = this.model;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ModelState{id=");
        sb2.append(this.id);
        sb2.append(", model=");
        sb2.append(this.model);
        sb2.append(", hashCode=");
        sb2.append(this.hashCode);
        sb2.append(", position=");
        sb2.append(this.position);
        sb2.append(", pair=");
        sb2.append(this.pair);
        sb2.append(", lastMoveOp=");
        return androidx.camera.core.impl.utils.a.m(sb2, this.lastMoveOp, '}');
    }
}
