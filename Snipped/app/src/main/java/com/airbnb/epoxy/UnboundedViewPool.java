package com.airbnb.epoxy;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;

/* compiled from: UnboundedViewPool.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/airbnb/epoxy/UnboundedViewPool;", "Landroidx/recyclerview/widget/RecyclerView$t;", "<init>", "()V", "", "viewType", "Ljava/util/Queue;", "Landroidx/recyclerview/widget/RecyclerView$C;", "getScrapHeapForType", "(I)Ljava/util/Queue;", "LO9/p;", "clear", "max", "setMaxRecycledViews", "(II)V", "getRecycledView", "(I)Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "putRecycledView", "(Landroidx/recyclerview/widget/RecyclerView$C;)V", "getRecycledViewCount", "(I)I", "Landroid/util/SparseArray;", "scrapHeaps", "Landroid/util/SparseArray;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class UnboundedViewPool extends RecyclerView.t {
    private final SparseArray<Queue<RecyclerView.C>> scrapHeaps = new SparseArray<>();

    private final Queue<RecyclerView.C> getScrapHeapForType(int viewType) {
        Queue<RecyclerView.C> queue = this.scrapHeaps.get(viewType);
        if (queue != null) {
            return queue;
        }
        LinkedList linkedList = new LinkedList();
        this.scrapHeaps.put(viewType, linkedList);
        return linkedList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void clear() {
        this.scrapHeaps.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public RecyclerView.C getRecycledView(int viewType) {
        Queue<RecyclerView.C> queue = this.scrapHeaps.get(viewType);
        if (queue != null) {
            return queue.poll();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public int getRecycledViewCount(int viewType) {
        Queue<RecyclerView.C> queue = this.scrapHeaps.get(viewType);
        if (queue != null) {
            return queue.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void putRecycledView(RecyclerView.C viewHolder) {
        getScrapHeapForType(viewHolder.getItemViewType()).add(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void setMaxRecycledViews(int viewType, int max) {
        throw new UnsupportedOperationException("UnboundedViewPool does not support setting a maximum number of recycled views");
    }
}
