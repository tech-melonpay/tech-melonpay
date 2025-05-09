package com.airbnb.epoxy;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ListenersUtils {
    private static RecyclerView findParentRecyclerView(View view) {
        if (view == null) {
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof RecyclerView) {
            return (RecyclerView) parent;
        }
        if (parent instanceof View) {
            return findParentRecyclerView((View) parent);
        }
        return null;
    }

    public static EpoxyViewHolder getEpoxyHolderForChildView(View view) {
        RecyclerView.C findContainingViewHolder;
        RecyclerView findParentRecyclerView = findParentRecyclerView(view);
        if (findParentRecyclerView == null || (findContainingViewHolder = findParentRecyclerView.findContainingViewHolder(view)) == null || !(findContainingViewHolder instanceof EpoxyViewHolder)) {
            return null;
        }
        return (EpoxyViewHolder) findContainingViewHolder;
    }
}
