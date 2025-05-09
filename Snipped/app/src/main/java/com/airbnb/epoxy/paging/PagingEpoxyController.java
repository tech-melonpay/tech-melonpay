package com.airbnb.epoxy.paging;

import androidx.paging.e;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class PagingEpoxyController<T> extends EpoxyController {
    private static final e.b DEFAULT_CONFIG = new e.b(100, 20, 100);
    private boolean hasNotifiedInsufficientPageSize;
    private e<T> pagedList;
    private List<T> list = Collections.emptyList();
    private int lastBoundPositionWithinList = 0;
    private boolean scrollingTowardsEnd = true;
    private int lastBuiltLowerBound = 0;
    private int lastBuiltUpperBound = 0;
    private e.b customConfig = null;
    private boolean isFirstBuildForList = true;
    private final e.a callback = new e.a() { // from class: com.airbnb.epoxy.paging.PagingEpoxyController.1
        @Override // androidx.paging.e.a
        public void onChanged(int i, int i9) {
            PagingEpoxyController.this.updatePagedListSnapshot();
        }

        @Override // androidx.paging.e.a
        public void onInserted(int i, int i9) {
            PagingEpoxyController.this.updatePagedListSnapshot();
        }

        @Override // androidx.paging.e.a
        public void onRemoved(int i, int i9) {
            PagingEpoxyController.this.updatePagedListSnapshot();
        }
    };

    private e.b config() {
        e.b bVar = this.customConfig;
        return bVar != null ? bVar : DEFAULT_CONFIG;
    }

    private boolean hasBuiltFirstItem() {
        return this.lastBuiltLowerBound == 0;
    }

    private boolean hasBuiltLastItem() {
        return this.lastBuiltUpperBound >= totalListSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePagedListSnapshot() {
        this.list = Collections.emptyList();
        requestModelBuild();
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public final void buildModels() {
        int i = this.isFirstBuildForList ? config().f7356c : config().f7354a;
        if (!this.list.isEmpty()) {
            this.isFirstBuildForList = false;
        }
        int size = getAdapter().getBoundViewHolders().size();
        if (!this.hasNotifiedInsufficientPageSize && size > i) {
            onExceptionSwallowed(new IllegalStateException("The page size specified in your PagedList config is smaller than the number of items shown on screen. Increase your page size and/or initial load size."));
            this.hasNotifiedInsufficientPageSize = true;
        }
        int i9 = (int) (i * (this.scrollingTowardsEnd ? 0.7f : 0.3f));
        int i10 = i - i9;
        int size2 = this.list.size();
        int i11 = this.lastBoundPositionWithinList;
        int i12 = i9 - ((size2 - i11) - 1);
        if (i12 > 0) {
            i10 += i12;
            i9 -= i12;
        }
        int i13 = i10 - i11;
        if (i13 > 0) {
            i10 -= i13;
            i9 += i13;
        }
        this.lastBuiltLowerBound = Math.max(i11 - i10, 0);
        int min = Math.min(this.lastBoundPositionWithinList + i9, this.list.size());
        this.lastBuiltUpperBound = min;
        buildModels(this.list.subList(this.lastBuiltLowerBound, min));
    }

    public abstract void buildModels(List<T> list);

    public List<T> getCurrentList() {
        return this.list;
    }

    public e<T> getPagedList() {
        return this.pagedList;
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void onModelBound(EpoxyViewHolder epoxyViewHolder, EpoxyModel<?> epoxyModel, int i, EpoxyModel<?> epoxyModel2) {
        int i9 = this.lastBuiltLowerBound + i;
        this.scrollingTowardsEnd = this.lastBoundPositionWithinList < i9;
        this.lastBoundPositionWithinList = i9;
        int i10 = config().f7355b;
        if ((getAdapter().getItemCount() - i >= i10 || hasBuiltLastItem() || !this.scrollingTowardsEnd) && (i >= i10 || hasBuiltFirstItem() || this.scrollingTowardsEnd)) {
            return;
        }
        requestModelBuild();
    }

    public void setConfig(e.b bVar) {
        this.customConfig = bVar;
    }

    public void setList(List<T> list) {
        if (list == this.list) {
            return;
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        this.list = list;
        this.isFirstBuildForList = true;
        requestModelBuild();
    }

    public int totalListSize() {
        return this.list.size();
    }

    public void setList(e<T> eVar) {
        if (eVar == this.pagedList) {
            return;
        }
        this.isFirstBuildForList = true;
        updatePagedListSnapshot();
    }
}
