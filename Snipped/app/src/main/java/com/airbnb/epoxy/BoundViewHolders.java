package com.airbnb.epoxy;

import androidx.collection.d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class BoundViewHolders implements Iterable<EpoxyViewHolder> {
    private final d<EpoxyViewHolder> holders = new d<>();

    public class HolderIterator implements Iterator<EpoxyViewHolder> {
        private int position;

        private HolderIterator() {
            this.position = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < BoundViewHolders.this.holders.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public EpoxyViewHolder next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            d dVar = BoundViewHolders.this.holders;
            int i = this.position;
            this.position = i + 1;
            return (EpoxyViewHolder) dVar.valueAt(i);
        }
    }

    public EpoxyViewHolder get(EpoxyViewHolder epoxyViewHolder) {
        return this.holders.get(epoxyViewHolder.getItemId());
    }

    public EpoxyViewHolder getHolderForModel(EpoxyModel<?> epoxyModel) {
        return this.holders.get(epoxyModel.id());
    }

    @Override // java.lang.Iterable
    public Iterator<EpoxyViewHolder> iterator() {
        return new HolderIterator();
    }

    public void put(EpoxyViewHolder epoxyViewHolder) {
        this.holders.put(epoxyViewHolder.getItemId(), epoxyViewHolder);
    }

    public void remove(EpoxyViewHolder epoxyViewHolder) {
        this.holders.remove(epoxyViewHolder.getItemId());
    }

    public int size() {
        return this.holders.size();
    }
}
