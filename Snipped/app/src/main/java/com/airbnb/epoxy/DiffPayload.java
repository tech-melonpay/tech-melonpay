package com.airbnb.epoxy;

import androidx.collection.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class DiffPayload {
    private final d<EpoxyModel<?>> modelsById;
    private final EpoxyModel<?> singleModel;

    public DiffPayload(List<? extends EpoxyModel<?>> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Models must not be empty");
        }
        int size = list.size();
        if (size == 1) {
            this.singleModel = list.get(0);
            this.modelsById = null;
            return;
        }
        this.singleModel = null;
        this.modelsById = new d<>(size);
        for (EpoxyModel<?> epoxyModel : list) {
            this.modelsById.put(epoxyModel.id(), epoxyModel);
        }
    }

    public static EpoxyModel<?> getModelFromPayload(List<Object> list, long j10) {
        if (list.isEmpty()) {
            return null;
        }
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            DiffPayload diffPayload = (DiffPayload) it.next();
            EpoxyModel<?> epoxyModel = diffPayload.singleModel;
            if (epoxyModel == null) {
                EpoxyModel<?> epoxyModel2 = diffPayload.modelsById.get(j10);
                if (epoxyModel2 != null) {
                    return epoxyModel2;
                }
            } else if (epoxyModel.id() == j10) {
                return diffPayload.singleModel;
            }
        }
        return null;
    }

    public boolean equalsForTesting(DiffPayload diffPayload) {
        EpoxyModel<?> epoxyModel = this.singleModel;
        if (epoxyModel != null) {
            return diffPayload.singleModel == epoxyModel;
        }
        int size = this.modelsById.size();
        if (size != diffPayload.modelsById.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.modelsById.keyAt(i) != diffPayload.modelsById.keyAt(i) || this.modelsById.valueAt(i) != diffPayload.modelsById.valueAt(i)) {
                return false;
            }
        }
        return true;
    }

    public DiffPayload(EpoxyModel<?> epoxyModel) {
        this((List<? extends EpoxyModel<?>>) Collections.singletonList(epoxyModel));
    }
}
