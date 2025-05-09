package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class NotifyBlocker extends RecyclerView.h {
    private boolean changesAllowed;

    public void allowChanges() {
        this.changesAllowed = true;
    }

    public void blockChanges() {
        this.changesAllowed = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onChanged() {
        if (!this.changesAllowed) {
            throw new IllegalStateException("You cannot notify item changes directly. Call `requestModelBuild` instead.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onItemRangeChanged(int i, int i9) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onItemRangeInserted(int i, int i9) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onItemRangeMoved(int i, int i9, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onItemRangeRemoved(int i, int i9) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onItemRangeChanged(int i, int i9, Object obj) {
        onChanged();
    }
}
