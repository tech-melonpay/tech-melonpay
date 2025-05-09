package com.airbnb.epoxy;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class UpdateOpHelper {
    private UpdateOp lastOp;
    private int numInsertionBatches;
    private int numInsertions;
    private int numRemovalBatches;
    private int numRemovals;
    final List<UpdateOp> opList = new ArrayList();
    final List<UpdateOp> moves = new ArrayList();

    private void addItemsToLastOperation(int i, EpoxyModel<?> epoxyModel) {
        UpdateOp updateOp = this.lastOp;
        updateOp.itemCount += i;
        updateOp.addPayload(epoxyModel);
    }

    private void addNewOperation(int i, int i9, int i10) {
        addNewOperation(i, i9, i10, null);
    }

    private boolean isLastOp(int i) {
        UpdateOp updateOp = this.lastOp;
        return updateOp != null && updateOp.type == i;
    }

    public void add(int i) {
        add(i, 1);
    }

    public int getNumInsertionBatches() {
        return this.numInsertionBatches;
    }

    public int getNumInsertions() {
        return this.numInsertions;
    }

    public int getNumMoves() {
        return this.moves.size();
    }

    public int getNumRemovalBatches() {
        return this.numRemovalBatches;
    }

    public int getNumRemovals() {
        return this.numRemovals;
    }

    public boolean hasInsertions() {
        return this.numInsertions > 0;
    }

    public boolean hasRemovals() {
        return this.numRemovals > 0;
    }

    public void move(int i, int i9) {
        this.lastOp = null;
        UpdateOp instance = UpdateOp.instance(3, i, i9, null);
        this.opList.add(instance);
        this.moves.add(instance);
    }

    public void remove(int i) {
        remove(i, 1);
    }

    public void reset() {
        this.opList.clear();
        this.moves.clear();
        this.lastOp = null;
        this.numInsertions = 0;
        this.numInsertionBatches = 0;
        this.numRemovals = 0;
        this.numRemovalBatches = 0;
    }

    public void update(int i) {
        update(i, null);
    }

    private void addNewOperation(int i, int i9, int i10, EpoxyModel<?> epoxyModel) {
        UpdateOp instance = UpdateOp.instance(i, i9, i10, epoxyModel);
        this.lastOp = instance;
        this.opList.add(instance);
    }

    public void add(int i, int i9) {
        this.numInsertions += i9;
        if (isLastOp(0) && (this.lastOp.contains(i) || this.lastOp.positionEnd() == i)) {
            addItemsToLastOperation(i9, null);
        } else {
            this.numInsertionBatches++;
            addNewOperation(0, i, i9);
        }
    }

    public void remove(int i, int i9) {
        this.numRemovals += i9;
        if (isLastOp(1)) {
            UpdateOp updateOp = this.lastOp;
            if (updateOp.positionStart != i) {
                if (updateOp.isAfter(i)) {
                    int i10 = i + i9;
                    UpdateOp updateOp2 = this.lastOp;
                    if (i10 >= updateOp2.positionStart) {
                        updateOp2.positionStart = i;
                    }
                }
            }
            addItemsToLastOperation(i9, null);
            return;
        }
        this.numRemovalBatches++;
        addNewOperation(1, i, i9);
    }

    public void update(int i, EpoxyModel<?> epoxyModel) {
        if (!isLastOp(2)) {
            addNewOperation(2, i, 1, epoxyModel);
            return;
        }
        UpdateOp updateOp = this.lastOp;
        if (updateOp.positionStart == i + 1) {
            addItemsToLastOperation(1, epoxyModel);
            this.lastOp.positionStart = i;
        } else if (updateOp.positionEnd() == i) {
            addItemsToLastOperation(1, epoxyModel);
        } else if (this.lastOp.contains(i)) {
            addItemsToLastOperation(0, epoxyModel);
        } else {
            addNewOperation(2, i, 1, epoxyModel);
        }
    }
}
