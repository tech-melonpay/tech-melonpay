package com.sumsub.sns.internal.core.common;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes2.dex */
public final class d1 {
    public static final View a(ViewPager2 viewPager2) {
        RecyclerView.C findViewHolderForAdapterPosition;
        int currentItem = viewPager2.getCurrentItem();
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(currentItem)) == null) {
            return null;
        }
        return findViewHolderForAdapterPosition.itemView;
    }
}
