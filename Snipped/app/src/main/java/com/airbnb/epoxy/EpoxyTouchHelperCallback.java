package com.airbnb.epoxy;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EpoxyTouchHelperCallback.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH$¢\u0006\u0004\b\t\u0010\fJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH$¢\u0006\u0004\b\u000f\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\bH$¢\u0006\u0004\b\u0014\u0010\u0016J'\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0010J'\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001a\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u001d\u0010\u001cJ7\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001e\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001f2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J7\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0004¢\u0006\u0004\b#\u0010%J!\u0010'\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0015J!\u0010'\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020\bH\u0014¢\u0006\u0004\b'\u0010\u0016JG\u0010,\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010-JG\u0010,\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0004¢\u0006\u0004\b,\u0010.J\u001f\u0010/\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u00100J\u001f\u0010/\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0014¢\u0006\u0004\b/\u00101JG\u00107\u001a\u00020\u00132\u0006\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\b2\u0006\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u00108JG\u00107\u001a\u00020\u00132\u0006\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\b2\u0006\u00106\u001a\u00020\u000eH\u0014¢\u0006\u0004\b7\u00109JG\u0010:\u001a\u00020\u00132\u0006\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\b2\u0006\u00106\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u00108JI\u0010:\u001a\u00020\u00132\u0006\u00103\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000b2\u0006\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\b2\u0006\u00106\u001a\u00020\u000eH\u0004¢\u0006\u0004\b:\u00109¨\u0006;"}, d2 = {"Lcom/airbnb/epoxy/EpoxyTouchHelperCallback;", "Landroidx/recyclerview/widget/u$d;", "<init>", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$C;", "viewHolder", "", "getMovementFlags", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)I", "Lcom/airbnb/epoxy/EpoxyViewHolder;", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/airbnb/epoxy/EpoxyViewHolder;)I", "target", "", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;Landroidx/recyclerview/widget/RecyclerView$C;)Z", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/airbnb/epoxy/EpoxyViewHolder;Lcom/airbnb/epoxy/EpoxyViewHolder;)Z", "direction", "LO9/p;", "onSwiped", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "(Lcom/airbnb/epoxy/EpoxyViewHolder;I)V", "current", "canDropOver", "", "getSwipeThreshold", "(Landroidx/recyclerview/widget/RecyclerView$C;)F", "(Lcom/airbnb/epoxy/EpoxyViewHolder;)F", "getMoveThreshold", "selected", "", "dropTargets", "curX", "curY", "chooseDropTarget", "(Landroidx/recyclerview/widget/RecyclerView$C;Ljava/util/List;II)Lcom/airbnb/epoxy/EpoxyViewHolder;", "(Lcom/airbnb/epoxy/EpoxyViewHolder;Ljava/util/List;II)Lcom/airbnb/epoxy/EpoxyViewHolder;", "actionState", "onSelectedChanged", "fromPos", "toPos", "x", "y", "onMoved", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;ILandroidx/recyclerview/widget/RecyclerView$C;III)V", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/airbnb/epoxy/EpoxyViewHolder;ILcom/airbnb/epoxy/EpoxyViewHolder;III)V", "clearView", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;)V", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/airbnb/epoxy/EpoxyViewHolder;)V", "Landroid/graphics/Canvas;", "c", "dX", "dY", "isCurrentlyActive", "onChildDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$C;FFIZ)V", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lcom/airbnb/epoxy/EpoxyViewHolder;FFIZ)V", "onChildDrawOver", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class EpoxyTouchHelperCallback extends u.d {
    @Override // androidx.recyclerview.widget.u.d
    public boolean canDropOver(RecyclerView recyclerView, RecyclerView.C current, RecyclerView.C target) {
        return canDropOver(recyclerView, (EpoxyViewHolder) current, (EpoxyViewHolder) target);
    }

    @Override // androidx.recyclerview.widget.u.d
    public /* bridge */ /* synthetic */ RecyclerView.C chooseDropTarget(RecyclerView.C c2, List list, int i, int i9) {
        return chooseDropTarget(c2, (List<? extends RecyclerView.C>) list, i, i9);
    }

    @Override // androidx.recyclerview.widget.u.d
    public void clearView(RecyclerView recyclerView, RecyclerView.C viewHolder) {
        clearView(recyclerView, (EpoxyViewHolder) viewHolder);
    }

    @Override // androidx.recyclerview.widget.u.d
    public float getMoveThreshold(RecyclerView.C viewHolder) {
        return getMoveThreshold((EpoxyViewHolder) viewHolder);
    }

    @Override // androidx.recyclerview.widget.u.d
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.C viewHolder) {
        return getMovementFlags(recyclerView, (EpoxyViewHolder) viewHolder);
    }

    public abstract int getMovementFlags(RecyclerView recyclerView, EpoxyViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.u.d
    public float getSwipeThreshold(RecyclerView.C viewHolder) {
        return getSwipeThreshold((EpoxyViewHolder) viewHolder);
    }

    @Override // androidx.recyclerview.widget.u.d
    public void onChildDraw(Canvas c2, RecyclerView recyclerView, RecyclerView.C viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        onChildDraw(c2, recyclerView, (EpoxyViewHolder) viewHolder, dX, dY, actionState, isCurrentlyActive);
    }

    @Override // androidx.recyclerview.widget.u.d
    public void onChildDrawOver(Canvas c2, RecyclerView recyclerView, RecyclerView.C viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        onChildDrawOver(c2, recyclerView, viewHolder instanceof EpoxyViewHolder ? (EpoxyViewHolder) viewHolder : null, dX, dY, actionState, isCurrentlyActive);
    }

    @Override // androidx.recyclerview.widget.u.d
    public boolean onMove(RecyclerView recyclerView, RecyclerView.C viewHolder, RecyclerView.C target) {
        return onMove(recyclerView, (EpoxyViewHolder) viewHolder, (EpoxyViewHolder) target);
    }

    public abstract boolean onMove(RecyclerView recyclerView, EpoxyViewHolder viewHolder, EpoxyViewHolder target);

    @Override // androidx.recyclerview.widget.u.d
    public void onMoved(RecyclerView recyclerView, RecyclerView.C viewHolder, int fromPos, RecyclerView.C target, int toPos, int x9, int y10) {
        onMoved(recyclerView, (EpoxyViewHolder) viewHolder, fromPos, (EpoxyViewHolder) target, toPos, x9, y10);
    }

    @Override // androidx.recyclerview.widget.u.d
    public void onSelectedChanged(RecyclerView.C viewHolder, int actionState) {
        onSelectedChanged((EpoxyViewHolder) viewHolder, actionState);
    }

    @Override // androidx.recyclerview.widget.u.d
    public void onSwiped(RecyclerView.C viewHolder, int direction) {
        onSwiped((EpoxyViewHolder) viewHolder, direction);
    }

    public abstract void onSwiped(EpoxyViewHolder viewHolder, int direction);

    public boolean canDropOver(RecyclerView recyclerView, EpoxyViewHolder current, EpoxyViewHolder target) {
        return super.canDropOver(recyclerView, (RecyclerView.C) current, (RecyclerView.C) target);
    }

    @Override // androidx.recyclerview.widget.u.d
    public EpoxyViewHolder chooseDropTarget(RecyclerView.C selected, List<? extends RecyclerView.C> dropTargets, int curX, int curY) {
        return chooseDropTarget((EpoxyViewHolder) selected, (List<? extends EpoxyViewHolder>) dropTargets, curX, curY);
    }

    public void clearView(RecyclerView recyclerView, EpoxyViewHolder viewHolder) {
        super.clearView(recyclerView, (RecyclerView.C) viewHolder);
    }

    public final float getMoveThreshold(EpoxyViewHolder viewHolder) {
        return super.getMoveThreshold((RecyclerView.C) viewHolder);
    }

    public float getSwipeThreshold(EpoxyViewHolder viewHolder) {
        return super.getSwipeThreshold((RecyclerView.C) viewHolder);
    }

    public void onSelectedChanged(EpoxyViewHolder viewHolder, int actionState) {
        super.onSelectedChanged((RecyclerView.C) viewHolder, actionState);
    }

    public void onChildDraw(Canvas c2, RecyclerView recyclerView, EpoxyViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        super.onChildDraw(c2, recyclerView, (RecyclerView.C) viewHolder, dX, dY, actionState, isCurrentlyActive);
    }

    public final void onChildDrawOver(Canvas c2, RecyclerView recyclerView, EpoxyViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        super.onChildDrawOver(c2, recyclerView, (RecyclerView.C) viewHolder, dX, dY, actionState, isCurrentlyActive);
    }

    public final EpoxyViewHolder chooseDropTarget(EpoxyViewHolder selected, List<? extends EpoxyViewHolder> dropTargets, int curX, int curY) {
        RecyclerView.C chooseDropTarget = super.chooseDropTarget((RecyclerView.C) selected, (List<RecyclerView.C>) dropTargets, curX, curY);
        if (chooseDropTarget instanceof EpoxyViewHolder) {
            return (EpoxyViewHolder) chooseDropTarget;
        }
        return null;
    }

    public final void onMoved(RecyclerView recyclerView, EpoxyViewHolder viewHolder, int fromPos, EpoxyViewHolder target, int toPos, int x9, int y10) {
        super.onMoved(recyclerView, (RecyclerView.C) viewHolder, fromPos, (RecyclerView.C) target, toPos, x9, y10);
    }
}
