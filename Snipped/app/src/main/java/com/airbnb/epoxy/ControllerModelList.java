package com.airbnb.epoxy;

import com.airbnb.epoxy.ModelList;

/* loaded from: classes.dex */
class ControllerModelList extends ModelList {
    private static final ModelList.ModelListObserver OBSERVER = new ModelList.ModelListObserver() { // from class: com.airbnb.epoxy.ControllerModelList.1
        @Override // com.airbnb.epoxy.ModelList.ModelListObserver
        public void onItemRangeInserted(int i, int i9) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }

        @Override // com.airbnb.epoxy.ModelList.ModelListObserver
        public void onItemRangeRemoved(int i, int i9) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    };

    public ControllerModelList(int i) {
        super(i);
        pauseNotifications();
    }

    public void freeze() {
        setObserver(OBSERVER);
        resumeNotifications();
    }
}
