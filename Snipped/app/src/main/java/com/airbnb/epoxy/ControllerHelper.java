package com.airbnb.epoxy;

import com.airbnb.epoxy.EpoxyController;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ControllerHelper<T extends EpoxyController> {
    public abstract void resetAutoModels();

    public void setControllerToStageTo(EpoxyModel<?> epoxyModel, T t3) {
        epoxyModel.controllerToStageTo = t3;
    }

    public void validateModelHashCodesHaveNotChanged(T t3) {
        List<EpoxyModel<?>> copyOfModels = t3.getAdapter().getCopyOfModels();
        for (int i = 0; i < copyOfModels.size(); i++) {
            copyOfModels.get(i).validateStateHasNotChangedSinceAdded("Model has changed since it was added to the controller.", i);
        }
    }
}
