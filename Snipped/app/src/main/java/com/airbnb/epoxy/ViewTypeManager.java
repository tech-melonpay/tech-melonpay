package com.airbnb.epoxy;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class ViewTypeManager {
    private static final Map<Class, Integer> VIEW_TYPE_MAP = new HashMap();
    EpoxyModel<?> lastModelForViewTypeLookup;

    public static int getViewType(EpoxyModel<?> epoxyModel) {
        int viewType = epoxyModel.getViewType();
        if (viewType != 0) {
            return viewType;
        }
        Class<?> cls = epoxyModel.getClass();
        Map<Class, Integer> map = VIEW_TYPE_MAP;
        Integer num = map.get(cls);
        if (num == null) {
            num = Integer.valueOf((-map.size()) - 1);
            map.put(cls, num);
        }
        return num.intValue();
    }

    public EpoxyModel<?> getModelForViewType(BaseEpoxyAdapter baseEpoxyAdapter, int i) {
        EpoxyModel<?> epoxyModel = this.lastModelForViewTypeLookup;
        if (epoxyModel != null && getViewType(epoxyModel) == i) {
            return this.lastModelForViewTypeLookup;
        }
        baseEpoxyAdapter.onExceptionSwallowed(new IllegalStateException("Last model did not match expected view type"));
        for (EpoxyModel<?> epoxyModel2 : baseEpoxyAdapter.getCurrentModels()) {
            if (getViewType(epoxyModel2) == i) {
                return epoxyModel2;
            }
        }
        HiddenEpoxyModel hiddenEpoxyModel = new HiddenEpoxyModel();
        if (i == hiddenEpoxyModel.getViewType()) {
            return hiddenEpoxyModel;
        }
        throw new IllegalStateException(com.google.android.gms.measurement.internal.a.g(i, "Could not find model for view type: "));
    }

    public int getViewTypeAndRememberModel(EpoxyModel<?> epoxyModel) {
        this.lastModelForViewTypeLookup = epoxyModel;
        return getViewType(epoxyModel);
    }

    public void resetMapForTesting() {
        VIEW_TYPE_MAP.clear();
    }
}
