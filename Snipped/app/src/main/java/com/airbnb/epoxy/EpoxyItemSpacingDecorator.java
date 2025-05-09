package com.airbnb.epoxy;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class EpoxyItemSpacingDecorator extends RecyclerView.m {
    private boolean fillsLastSpan;
    private boolean firstItem;
    private boolean grid;
    private boolean horizontallyScrolling;
    private boolean isFirstItemInRow;
    private boolean isInFirstRow;
    private boolean isInLastRow;
    private boolean lastItem;
    private int pxBetweenItems;
    private boolean verticallyScrolling;

    public EpoxyItemSpacingDecorator() {
        this(0);
    }

    private void calculatePositionDetails(RecyclerView recyclerView, int i, RecyclerView.n nVar) {
        int itemCount = recyclerView.getAdapter().getItemCount();
        boolean z10 = false;
        this.firstItem = i == 0;
        this.lastItem = i == itemCount + (-1);
        this.horizontallyScrolling = nVar.canScrollHorizontally();
        this.verticallyScrolling = nVar.canScrollVertically();
        boolean z11 = nVar instanceof GridLayoutManager;
        this.grid = z11;
        if (z11) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) nVar;
            GridLayoutManager.c cVar = gridLayoutManager.f7419g;
            int spanSize = cVar.getSpanSize(i);
            int i9 = gridLayoutManager.f7414b;
            int spanIndex = cVar.getSpanIndex(i, i9);
            this.isFirstItemInRow = spanIndex == 0;
            this.fillsLastSpan = spanIndex + spanSize == i9;
            boolean isInFirstRow = isInFirstRow(i, cVar, i9);
            this.isInFirstRow = isInFirstRow;
            if (!isInFirstRow && isInLastRow(i, itemCount, cVar, i9)) {
                z10 = true;
            }
            this.isInLastRow = z10;
        }
    }

    private static boolean isInFirstRow(int i, GridLayoutManager.c cVar, int i9) {
        int i10 = 0;
        for (int i11 = 0; i11 <= i; i11++) {
            i10 += cVar.getSpanSize(i11);
            if (i10 > i9) {
                return false;
            }
        }
        return true;
    }

    private static boolean isInLastRow(int i, int i9, GridLayoutManager.c cVar, int i10) {
        int i11 = 0;
        for (int i12 = i9 - 1; i12 >= i; i12--) {
            i11 += cVar.getSpanSize(i12);
            if (i11 > i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean shouldReverseLayout(RecyclerView.n nVar, boolean z10) {
        boolean z11 = (nVar instanceof LinearLayoutManager) && ((LinearLayoutManager) nVar).getReverseLayout();
        return (z10 && (nVar.getLayoutDirection() == 1)) ? !z11 : z11;
    }

    private boolean useBottomPadding() {
        return this.grid ? (this.horizontallyScrolling && !this.fillsLastSpan) || (this.verticallyScrolling && !this.isInLastRow) : this.verticallyScrolling && !this.lastItem;
    }

    private boolean useLeftPadding() {
        return this.grid ? (this.horizontallyScrolling && !this.isInFirstRow) || (this.verticallyScrolling && !this.isFirstItemInRow) : this.horizontallyScrolling && !this.firstItem;
    }

    private boolean useRightPadding() {
        return this.grid ? (this.horizontallyScrolling && !this.isInLastRow) || (this.verticallyScrolling && !this.fillsLastSpan) : this.horizontallyScrolling && !this.lastItem;
    }

    private boolean useTopPadding() {
        return this.grid ? (this.horizontallyScrolling && !this.isFirstItemInRow) || (this.verticallyScrolling && !this.isInFirstRow) : this.verticallyScrolling && !this.firstItem;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        rect.setEmpty();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.n layoutManager = recyclerView.getLayoutManager();
        calculatePositionDetails(recyclerView, childAdapterPosition, layoutManager);
        boolean useLeftPadding = useLeftPadding();
        boolean useRightPadding = useRightPadding();
        boolean useTopPadding = useTopPadding();
        boolean useBottomPadding = useBottomPadding();
        if (!shouldReverseLayout(layoutManager, this.horizontallyScrolling)) {
            useRightPadding = useLeftPadding;
            useLeftPadding = useRightPadding;
        } else if (!this.horizontallyScrolling) {
            useRightPadding = useLeftPadding;
            useLeftPadding = useRightPadding;
            useBottomPadding = useTopPadding;
            useTopPadding = useBottomPadding;
        }
        int i = this.pxBetweenItems / 2;
        rect.right = useLeftPadding ? i : 0;
        rect.left = useRightPadding ? i : 0;
        rect.top = useTopPadding ? i : 0;
        if (!useBottomPadding) {
            i = 0;
        }
        rect.bottom = i;
    }

    public int getPxBetweenItems() {
        return this.pxBetweenItems;
    }

    public void setPxBetweenItems(int i) {
        this.pxBetweenItems = i;
    }

    public EpoxyItemSpacingDecorator(int i) {
        setPxBetweenItems(i);
    }
}
