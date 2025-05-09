package com.airbnb.epoxy;

import java.util.ArrayList;

/* loaded from: classes.dex */
class UpdateOp {
    static final int ADD = 0;
    static final int MOVE = 3;
    static final int REMOVE = 1;
    static final int UPDATE = 2;
    int itemCount;
    ArrayList<EpoxyModel<?>> payloads;
    int positionStart;
    int type;

    private UpdateOp() {
    }

    public static UpdateOp instance(int i, int i9, int i10, EpoxyModel<?> epoxyModel) {
        UpdateOp updateOp = new UpdateOp();
        updateOp.type = i;
        updateOp.positionStart = i9;
        updateOp.itemCount = i10;
        updateOp.addPayload(epoxyModel);
        return updateOp;
    }

    public void addPayload(EpoxyModel<?> epoxyModel) {
        if (epoxyModel == null) {
            return;
        }
        ArrayList<EpoxyModel<?>> arrayList = this.payloads;
        if (arrayList == null) {
            this.payloads = new ArrayList<>(1);
        } else if (arrayList.size() == 1) {
            this.payloads.ensureCapacity(10);
        }
        this.payloads.add(epoxyModel);
    }

    public boolean contains(int i) {
        return i >= this.positionStart && i < positionEnd();
    }

    public boolean isAfter(int i) {
        return i < this.positionStart;
    }

    public boolean isBefore(int i) {
        return i >= positionEnd();
    }

    public int positionEnd() {
        return this.positionStart + this.itemCount;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateOp{type=");
        sb2.append(this.type);
        sb2.append(", positionStart=");
        sb2.append(this.positionStart);
        sb2.append(", itemCount=");
        return androidx.camera.core.impl.utils.a.m(sb2, this.itemCount, '}');
    }
}
