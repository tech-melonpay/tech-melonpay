package x8;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: CyclicAdapter.java */
/* renamed from: x8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1593a extends RecyclerView.Adapter {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView.Adapter f30946d;

    /* compiled from: CyclicAdapter.java */
    /* renamed from: x8.a$a, reason: collision with other inner class name */
    public class C0477a extends RecyclerView.h {
        public C0477a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onChanged() {
            C1593a.this.f30946d.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeChanged(int i, int i9) {
            C1593a c1593a = C1593a.this;
            c1593a.f30946d.notifyItemRangeChanged(c1593a.d(i), i9);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeInserted(int i, int i9) {
            C1593a c1593a = C1593a.this;
            c1593a.f30946d.notifyItemRangeInserted(c1593a.d(i), i9);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeRemoved(int i, int i9) {
            C1593a c1593a = C1593a.this;
            c1593a.f30946d.notifyItemRangeRemoved(c1593a.d(i), i9);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeChanged(int i, int i9, Object obj) {
            C1593a c1593a = C1593a.this;
            c1593a.f30946d.notifyItemRangeChanged(c1593a.d(i), i9, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onItemRangeMoved(int i, int i9, int i10) {
        }
    }

    public C1593a(RecyclerView.Adapter adapter) {
        C0477a c0477a = new C0477a();
        this.f30946d = adapter;
        super.setHasStableIds(adapter.hasStableIds());
        super.registerAdapterDataObserver(c0477a);
    }

    public final int d(int i) {
        return i % this.f30946d.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.f30946d.getItemId(d(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.f30946d.getItemViewType(d(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f30946d.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c2, int i) {
        this.f30946d.onBindViewHolder(c2, d(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f30946d.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f30946d.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.C c2) {
        return this.f30946d.onFailedToRecycleView(c2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.C c2) {
        this.f30946d.onViewAttachedToWindow(c2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.C c2) {
        this.f30946d.onViewDetachedFromWindow(c2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.C c2) {
        this.f30946d.onViewRecycled(c2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void registerAdapterDataObserver(RecyclerView.h hVar) {
        this.f30946d.registerAdapterDataObserver(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f30946d.setHasStableIds(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void unregisterAdapterDataObserver(RecyclerView.h hVar) {
        this.f30946d.unregisterAdapterDataObserver(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c2, int i, List list) {
        this.f30946d.onBindViewHolder(c2, d(i), list);
    }
}
