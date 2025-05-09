package com.airbnb.epoxy;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class EpoxyDiffLogger extends RecyclerView.h {
    private final String tag;

    public EpoxyDiffLogger(String str) {
        this.tag = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onItemRangeChanged(int i, int i9) {
        Log.d(this.tag, "Item range changed. Start: " + i + " Count: " + i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onItemRangeInserted(int i, int i9) {
        Log.d(this.tag, "Item range inserted. Start: " + i + " Count: " + i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onItemRangeMoved(int i, int i9, int i10) {
        Log.d(this.tag, "Item moved. From: " + i + " To: " + i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onItemRangeRemoved(int i, int i9) {
        Log.d(this.tag, "Item range removed. Start: " + i + " Count: " + i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onItemRangeChanged(int i, int i9, Object obj) {
        if (obj == null) {
            onItemRangeChanged(i, i9);
            return;
        }
        Log.d(this.tag, "Item range changed with payloads. Start: " + i + " Count: " + i9);
    }
}
