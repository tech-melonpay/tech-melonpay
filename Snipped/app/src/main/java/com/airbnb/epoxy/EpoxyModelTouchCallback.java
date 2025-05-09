package com.airbnb.epoxy;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyModel;
import com.luminary.mobile.R;

/* loaded from: classes.dex */
public abstract class EpoxyModelTouchCallback<T extends EpoxyModel> extends EpoxyTouchHelperCallback implements EpoxyDragCallback<T>, EpoxySwipeCallback<T> {
    private static final int TOUCH_DEBOUNCE_MILLIS = 300;
    private final EpoxyController controller;
    private EpoxyViewHolder holderBeingDragged;
    private EpoxyViewHolder holderBeingSwiped;
    private final Class<T> targetModelClass;

    public EpoxyModelTouchCallback(EpoxyController epoxyController, Class<T> cls) {
        this.controller = epoxyController;
        this.targetModelClass = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecyclerViewSelectionMarker(RecyclerView recyclerView) {
        recyclerView.setTag(R.id.epoxy_touch_helper_selection_status, null);
    }

    private void markRecyclerViewHasSelection(RecyclerView recyclerView) {
        recyclerView.setTag(R.id.epoxy_touch_helper_selection_status, Boolean.TRUE);
    }

    private boolean recyclerViewHasSelection(RecyclerView recyclerView) {
        return recyclerView.getTag(R.id.epoxy_touch_helper_selection_status) != null;
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    public boolean canDropOver(RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder, EpoxyViewHolder epoxyViewHolder2) {
        return isTouchableModel(epoxyViewHolder2.getModel());
    }

    @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
    public void clearView(T t3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    public int getMovementFlags(RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder) {
        EpoxyModel<?> model = epoxyViewHolder.getModel();
        if (!(this.holderBeingDragged == null && this.holderBeingSwiped == null && recyclerViewHasSelection(recyclerView)) && isTouchableModel(model)) {
            return getMovementFlagsForModel(model, epoxyViewHolder.getAdapterPosition());
        }
        return 0;
    }

    public boolean isTouchableModel(EpoxyModel<?> epoxyModel) {
        return this.targetModelClass.isInstance(epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder, float f10, float f11, int i, boolean z10) {
        super.onChildDraw(canvas, recyclerView, epoxyViewHolder, f10, f11, i, z10);
        try {
            EpoxyModel<?> model = epoxyViewHolder.getModel();
            if (isTouchableModel(model)) {
                onSwipeProgressChanged(model, epoxyViewHolder.itemView, Math.max(-1.0f, Math.min(1.0f, Math.abs(f10) > Math.abs(f11) ? f10 / r3.getWidth() : f11 / r3.getHeight())), canvas);
            } else {
                throw new IllegalStateException("A model was selected that is not a valid target: " + model.getClass());
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    public boolean onMove(RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder, EpoxyViewHolder epoxyViewHolder2) {
        if (this.controller == null) {
            throw new IllegalStateException("A controller must be provided in the constructor if dragging is enabled");
        }
        int adapterPosition = epoxyViewHolder.getAdapterPosition();
        int adapterPosition2 = epoxyViewHolder2.getAdapterPosition();
        this.controller.moveModel(adapterPosition, adapterPosition2);
        EpoxyModel<?> model = epoxyViewHolder.getModel();
        if (isTouchableModel(model)) {
            onModelMoved(adapterPosition, adapterPosition2, model, epoxyViewHolder.itemView);
            return true;
        }
        throw new IllegalStateException("A model was dragged that is not a valid target: " + model.getClass());
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    public void onSelectedChanged(EpoxyViewHolder epoxyViewHolder, int i) {
        super.onSelectedChanged(epoxyViewHolder, i);
        if (epoxyViewHolder == null) {
            EpoxyViewHolder epoxyViewHolder2 = this.holderBeingDragged;
            if (epoxyViewHolder2 != null) {
                onDragReleased(epoxyViewHolder2.getModel(), this.holderBeingDragged.itemView);
                this.holderBeingDragged = null;
                return;
            }
            EpoxyViewHolder epoxyViewHolder3 = this.holderBeingSwiped;
            if (epoxyViewHolder3 != null) {
                onSwipeReleased(epoxyViewHolder3.getModel(), this.holderBeingSwiped.itemView);
                this.holderBeingSwiped = null;
                return;
            }
            return;
        }
        EpoxyModel<?> model = epoxyViewHolder.getModel();
        if (!isTouchableModel(model)) {
            throw new IllegalStateException("A model was selected that is not a valid target: " + model.getClass());
        }
        markRecyclerViewHasSelection((RecyclerView) epoxyViewHolder.itemView.getParent());
        if (i == 1) {
            this.holderBeingSwiped = epoxyViewHolder;
            onSwipeStarted(model, epoxyViewHolder.itemView, epoxyViewHolder.getAdapterPosition());
        } else if (i == 2) {
            this.holderBeingDragged = epoxyViewHolder;
            onDragStarted(model, epoxyViewHolder.itemView, epoxyViewHolder.getAdapterPosition());
        }
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    public void onSwiped(EpoxyViewHolder epoxyViewHolder, int i) {
        EpoxyModel<?> model = epoxyViewHolder.getModel();
        View view = epoxyViewHolder.itemView;
        int adapterPosition = epoxyViewHolder.getAdapterPosition();
        if (isTouchableModel(model)) {
            onSwipeCompleted(model, view, adapterPosition, i);
        } else {
            throw new IllegalStateException("A model was swiped that is not a valid target: " + model.getClass());
        }
    }

    @Override // com.airbnb.epoxy.EpoxyTouchHelperCallback
    public void clearView(final RecyclerView recyclerView, EpoxyViewHolder epoxyViewHolder) {
        super.clearView(recyclerView, epoxyViewHolder);
        clearView((EpoxyModelTouchCallback<T>) epoxyViewHolder.getModel(), epoxyViewHolder.itemView);
        recyclerView.postDelayed(new Runnable() { // from class: com.airbnb.epoxy.EpoxyModelTouchCallback.1
            @Override // java.lang.Runnable
            public void run() {
                EpoxyModelTouchCallback.this.clearRecyclerViewSelectionMarker(recyclerView);
            }
        }, 300L);
    }

    @Override // com.airbnb.epoxy.EpoxyDragCallback
    public void onDragReleased(T t3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxySwipeCallback
    public void onSwipeReleased(T t3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyDragCallback
    public void onDragStarted(T t3, View view, int i) {
    }

    @Override // com.airbnb.epoxy.EpoxySwipeCallback
    public void onSwipeStarted(T t3, View view, int i) {
    }

    @Override // com.airbnb.epoxy.EpoxyDragCallback
    public void onModelMoved(int i, int i9, T t3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxySwipeCallback
    public void onSwipeCompleted(T t3, View view, int i, int i9) {
    }

    @Override // com.airbnb.epoxy.EpoxySwipeCallback
    public void onSwipeProgressChanged(T t3, View view, float f10, Canvas canvas) {
    }
}
