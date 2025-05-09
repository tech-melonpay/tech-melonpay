package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class DiffHelper {
    private final BaseEpoxyAdapter adapter;
    private final boolean immutableModels;
    private final RecyclerView.h observer;
    private ArrayList<ModelState> oldStateList = new ArrayList<>();
    private Map<Long, ModelState> oldStateMap = new HashMap();
    private ArrayList<ModelState> currentStateList = new ArrayList<>();
    private Map<Long, ModelState> currentStateMap = new HashMap();

    public DiffHelper(BaseEpoxyAdapter baseEpoxyAdapter, boolean z10) {
        RecyclerView.h hVar = new RecyclerView.h() { // from class: com.airbnb.epoxy.DiffHelper.1
            @Override // androidx.recyclerview.widget.RecyclerView.h
            public void onChanged() {
                throw new UnsupportedOperationException("Diffing is enabled. You should use notifyModelsChanged instead of notifyDataSetChanged");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            public void onItemRangeChanged(int i, int i9) {
                for (int i10 = i; i10 < i + i9; i10++) {
                    ((ModelState) DiffHelper.this.currentStateList.get(i10)).hashCode = DiffHelper.this.adapter.getCurrentModels().get(i10).hashCode();
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            public void onItemRangeInserted(int i, int i9) {
                if (i9 == 0) {
                    return;
                }
                if (i9 == 1 || i == DiffHelper.this.currentStateList.size()) {
                    for (int i10 = i; i10 < i + i9; i10++) {
                        DiffHelper.this.currentStateList.add(i10, DiffHelper.this.createStateForPosition(i10));
                    }
                } else {
                    ArrayList arrayList = new ArrayList(i9);
                    for (int i11 = i; i11 < i + i9; i11++) {
                        arrayList.add(DiffHelper.this.createStateForPosition(i11));
                    }
                    DiffHelper.this.currentStateList.addAll(i, arrayList);
                }
                int size = DiffHelper.this.currentStateList.size();
                for (int i12 = i + i9; i12 < size; i12++) {
                    ((ModelState) DiffHelper.this.currentStateList.get(i12)).position += i9;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            public void onItemRangeMoved(int i, int i9, int i10) {
                if (i == i9) {
                    return;
                }
                if (i10 != 1) {
                    throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.g(i10, "Moving more than 1 item at a time is not supported. Number of items moved: "));
                }
                ModelState modelState = (ModelState) DiffHelper.this.currentStateList.remove(i);
                modelState.position = i9;
                DiffHelper.this.currentStateList.add(i9, modelState);
                if (i < i9) {
                    while (i < i9) {
                        ((ModelState) DiffHelper.this.currentStateList.get(i)).position--;
                        i++;
                    }
                    return;
                }
                for (int i11 = i9 + 1; i11 <= i; i11++) {
                    ((ModelState) DiffHelper.this.currentStateList.get(i11)).position++;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.h
            public void onItemRangeRemoved(int i, int i9) {
                if (i9 == 0) {
                    return;
                }
                List subList = DiffHelper.this.currentStateList.subList(i, i + i9);
                Iterator it = subList.iterator();
                while (it.hasNext()) {
                    DiffHelper.this.currentStateMap.remove(Long.valueOf(((ModelState) it.next()).id));
                }
                subList.clear();
                int size = DiffHelper.this.currentStateList.size();
                while (i < size) {
                    ((ModelState) DiffHelper.this.currentStateList.get(i)).position -= i9;
                    i++;
                }
            }
        };
        this.observer = hVar;
        this.adapter = baseEpoxyAdapter;
        this.immutableModels = z10;
        baseEpoxyAdapter.registerAdapterDataObserver(hVar);
    }

    private UpdateOpHelper buildDiff(UpdateOpHelper updateOpHelper) {
        prepareStateForDiff();
        collectRemovals(updateOpHelper);
        if (this.oldStateList.size() - updateOpHelper.getNumRemovals() != this.currentStateList.size()) {
            collectInsertions(updateOpHelper);
        }
        collectMoves(updateOpHelper);
        collectChanges(updateOpHelper);
        resetOldState();
        return updateOpHelper;
    }

    private void collectChanges(UpdateOpHelper updateOpHelper) {
        Iterator<ModelState> it = this.currentStateList.iterator();
        while (it.hasNext()) {
            ModelState next = it.next();
            ModelState modelState = next.pair;
            if (modelState != null) {
                if (this.immutableModels) {
                    if (modelState.model.isDebugValidationEnabled()) {
                        modelState.model.validateStateHasNotChangedSinceAdded("Model was changed before it could be diffed.", modelState.position);
                    }
                    if (!modelState.model.equals(next.model)) {
                        updateOpHelper.update(next.position, modelState.model);
                    }
                } else if (modelState.hashCode != next.hashCode) {
                    updateOpHelper.update(next.position, modelState.model);
                }
            }
        }
    }

    private void collectInsertions(UpdateOpHelper updateOpHelper) {
        Iterator<ModelState> it = this.oldStateList.iterator();
        Iterator<ModelState> it2 = this.currentStateList.iterator();
        while (it2.hasNext()) {
            ModelState next = it2.next();
            if (next.pair != null) {
                ModelState nextItemWithPair = getNextItemWithPair(it);
                if (nextItemWithPair != null) {
                    nextItemWithPair.position += updateOpHelper.getNumInsertions();
                }
            } else {
                updateOpHelper.add(next.position);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x000e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void collectMoves(com.airbnb.epoxy.UpdateOpHelper r12) {
        /*
            r11 = this;
            java.util.ArrayList<com.airbnb.epoxy.ModelState> r0 = r11.oldStateList
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList<com.airbnb.epoxy.ModelState> r1 = r11.currentStateList
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        Ld:
            r3 = r2
        Le:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L8c
            java.lang.Object r4 = r1.next()
            com.airbnb.epoxy.ModelState r4 = (com.airbnb.epoxy.ModelState) r4
            com.airbnb.epoxy.ModelState r5 = r4.pair
            if (r5 != 0) goto L2a
            java.util.List<com.airbnb.epoxy.UpdateOp> r5 = r12.moves
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L27
            goto Le
        L27:
            r4.pairWithSelf()
        L2a:
            if (r3 != 0) goto L34
            com.airbnb.epoxy.ModelState r3 = r11.getNextItemWithPair(r0)
            if (r3 != 0) goto L34
            com.airbnb.epoxy.ModelState r3 = r4.pair
        L34:
            if (r3 == 0) goto Le
            com.airbnb.epoxy.ModelState r5 = r4.pair
            java.util.List<com.airbnb.epoxy.UpdateOp> r6 = r12.moves
            r11.updateItemPosition(r5, r6)
            java.util.List<com.airbnb.epoxy.UpdateOp> r5 = r12.moves
            r11.updateItemPosition(r3, r5)
            long r5 = r4.id
            long r7 = r3.id
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L51
            int r5 = r4.position
            int r6 = r3.position
            if (r5 != r6) goto L51
        L50:
            goto Ld
        L51:
            com.airbnb.epoxy.ModelState r5 = r4.pair
            int r5 = r5.position
            int r6 = r4.position
            int r7 = r5 - r6
            com.airbnb.epoxy.ModelState r8 = r3.pair
            int r8 = r8.position
            int r9 = r3.position
            int r10 = r8 - r9
            if (r7 != 0) goto L66
            if (r10 != 0) goto L66
            goto L50
        L66:
            if (r10 <= r7) goto L7c
            r12.move(r9, r8)
            com.airbnb.epoxy.ModelState r5 = r3.pair
            int r5 = r5.position
            r3.position = r5
            int r5 = r12.getNumMoves()
            r3.lastMoveOp = r5
            com.airbnb.epoxy.ModelState r3 = r11.getNextItemWithPair(r0)
            goto L34
        L7c:
            r12.move(r5, r6)
            com.airbnb.epoxy.ModelState r5 = r4.pair
            int r4 = r4.position
            r5.position = r4
            int r4 = r12.getNumMoves()
            r5.lastMoveOp = r4
            goto Le
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.DiffHelper.collectMoves(com.airbnb.epoxy.UpdateOpHelper):void");
    }

    private void collectRemovals(UpdateOpHelper updateOpHelper) {
        Iterator<ModelState> it = this.oldStateList.iterator();
        while (it.hasNext()) {
            ModelState next = it.next();
            next.position -= updateOpHelper.getNumRemovals();
            ModelState modelState = this.currentStateMap.get(Long.valueOf(next.id));
            next.pair = modelState;
            if (modelState != null) {
                modelState.pair = next;
            } else {
                updateOpHelper.remove(next.position);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ModelState createStateForPosition(int i) {
        EpoxyModel<?> epoxyModel = this.adapter.getCurrentModels().get(i);
        epoxyModel.addedToAdapter = true;
        ModelState build = ModelState.build(epoxyModel, i, this.immutableModels);
        ModelState put = this.currentStateMap.put(Long.valueOf(build.id), build);
        if (put == null) {
            return build;
        }
        int i9 = put.position;
        throw new IllegalStateException("Two models have the same ID. ID's must be unique! Model at position " + i + ": " + epoxyModel + " Model at position " + i9 + ": " + this.adapter.getCurrentModels().get(i9));
    }

    private ModelState getNextItemWithPair(Iterator<ModelState> it) {
        ModelState modelState;
        loop0: while (true) {
            modelState = null;
            while (modelState == null && it.hasNext()) {
                modelState = it.next();
                if (modelState.pair == null) {
                    break;
                }
            }
        }
        return modelState;
    }

    private void notifyChanges(UpdateOpHelper updateOpHelper) {
        ArrayList<EpoxyModel<?>> arrayList;
        for (UpdateOp updateOp : updateOpHelper.opList) {
            int i = updateOp.type;
            if (i == 0) {
                this.adapter.notifyItemRangeInserted(updateOp.positionStart, updateOp.itemCount);
            } else if (i == 1) {
                this.adapter.notifyItemRangeRemoved(updateOp.positionStart, updateOp.itemCount);
            } else if (i != 2) {
                if (i != 3) {
                    throw new IllegalArgumentException("Unknown type: " + updateOp.type);
                }
                this.adapter.notifyItemMoved(updateOp.positionStart, updateOp.itemCount);
            } else if (!this.immutableModels || (arrayList = updateOp.payloads) == null) {
                this.adapter.notifyItemRangeChanged(updateOp.positionStart, updateOp.itemCount);
            } else {
                this.adapter.notifyItemRangeChanged(updateOp.positionStart, updateOp.itemCount, new DiffPayload(arrayList));
            }
        }
    }

    private void prepareStateForDiff() {
        this.oldStateList.clear();
        this.oldStateMap.clear();
        ArrayList<ModelState> arrayList = this.oldStateList;
        ArrayList<ModelState> arrayList2 = this.currentStateList;
        this.oldStateList = arrayList2;
        this.currentStateList = arrayList;
        Map<Long, ModelState> map = this.oldStateMap;
        this.oldStateMap = this.currentStateMap;
        this.currentStateMap = map;
        Iterator<ModelState> it = arrayList2.iterator();
        while (it.hasNext()) {
            it.next().pair = null;
        }
        int size = this.adapter.getCurrentModels().size();
        this.currentStateList.ensureCapacity(size);
        for (int i = 0; i < size; i++) {
            this.currentStateList.add(createStateForPosition(i));
        }
    }

    private void resetOldState() {
        this.oldStateList.clear();
        this.oldStateMap.clear();
    }

    private void updateItemPosition(ModelState modelState, List<UpdateOp> list) {
        int size = list.size();
        for (int i = modelState.lastMoveOp; i < size; i++) {
            UpdateOp updateOp = list.get(i);
            int i9 = updateOp.positionStart;
            int i10 = updateOp.itemCount;
            int i11 = modelState.position;
            if (i11 > i9 && i11 <= i10) {
                modelState.position = i11 - 1;
            } else if (i11 < i9 && i11 >= i10) {
                modelState.position = i11 + 1;
            }
        }
        modelState.lastMoveOp = size;
    }

    public void notifyModelChanges() {
        UpdateOpHelper updateOpHelper = new UpdateOpHelper();
        buildDiff(updateOpHelper);
        this.adapter.unregisterAdapterDataObserver(this.observer);
        notifyChanges(updateOpHelper);
        this.adapter.registerAdapterDataObserver(this.observer);
    }
}
