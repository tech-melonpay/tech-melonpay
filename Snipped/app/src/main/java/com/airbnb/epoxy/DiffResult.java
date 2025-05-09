package com.airbnb.epoxy;

import androidx.recyclerview.widget.C0564b;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class DiffResult {
    final q.d differResult;
    final List<? extends EpoxyModel<?>> newModels;
    final List<? extends EpoxyModel<?>> previousModels;

    private DiffResult(List<? extends EpoxyModel<?>> list, List<? extends EpoxyModel<?>> list2, q.d dVar) {
        this.previousModels = list;
        this.newModels = list2;
        this.differResult = dVar;
    }

    public static DiffResult clear(List<? extends EpoxyModel<?>> list) {
        return new DiffResult(list, Collections.EMPTY_LIST, null);
    }

    public static DiffResult diff(List<? extends EpoxyModel<?>> list, List<? extends EpoxyModel<?>> list2, q.d dVar) {
        return new DiffResult(list, list2, dVar);
    }

    public static DiffResult inserted(List<? extends EpoxyModel<?>> list) {
        return new DiffResult(Collections.EMPTY_LIST, list, null);
    }

    public static DiffResult noOp(List<? extends EpoxyModel<?>> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        return new DiffResult(list, list, null);
    }

    public void dispatchTo(RecyclerView.Adapter adapter) {
        dispatchTo(new C0564b(adapter));
    }

    public void dispatchTo(D d10) {
        q.d dVar = this.differResult;
        if (dVar != null) {
            dVar.a(d10);
            return;
        }
        if (this.newModels.isEmpty() && !this.previousModels.isEmpty()) {
            d10.onRemoved(0, this.previousModels.size());
        } else {
            if (this.newModels.isEmpty() || !this.previousModels.isEmpty()) {
                return;
            }
            d10.onInserted(0, this.newModels.size());
        }
    }
}
