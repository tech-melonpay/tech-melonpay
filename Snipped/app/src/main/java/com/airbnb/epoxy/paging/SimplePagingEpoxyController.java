package com.airbnb.epoxy.paging;

import com.airbnb.epoxy.EpoxyModel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class SimplePagingEpoxyController<T> extends PagingEpoxyController<T> {
    public abstract EpoxyModel<?> buildModel(T t3);

    @Override // com.airbnb.epoxy.paging.PagingEpoxyController
    public final void buildModels(List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            add(buildModel(it.next()));
        }
    }
}
