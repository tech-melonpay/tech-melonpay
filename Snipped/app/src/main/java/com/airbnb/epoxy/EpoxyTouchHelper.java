package com.airbnb.epoxy;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class EpoxyTouchHelper {

    public static class DragBuilder {
        private final EpoxyController controller;

        public DragBuilder2 withRecyclerView(RecyclerView recyclerView) {
            return new DragBuilder2(this.controller, recyclerView);
        }

        private DragBuilder(EpoxyController epoxyController) {
            this.controller = epoxyController;
        }
    }

    public static class DragBuilder2 {
        private final EpoxyController controller;
        private final RecyclerView recyclerView;

        public DragBuilder3 forGrid() {
            return withDirections(15);
        }

        public DragBuilder3 forHorizontalList() {
            return withDirections(12);
        }

        public DragBuilder3 forVerticalList() {
            return withDirections(3);
        }

        public DragBuilder3 withDirections(int i) {
            return new DragBuilder3(this.controller, this.recyclerView, u.d.makeMovementFlags(i, 0));
        }

        private DragBuilder2(EpoxyController epoxyController, RecyclerView recyclerView) {
            this.controller = epoxyController;
            this.recyclerView = recyclerView;
        }
    }

    public static class DragBuilder3 {
        private final EpoxyController controller;
        private final int movementFlags;
        private final RecyclerView recyclerView;

        public DragBuilder4<EpoxyModel> forAllModels() {
            return withTarget(EpoxyModel.class);
        }

        public <U extends EpoxyModel> DragBuilder4<U> withTarget(Class<U> cls) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(cls);
            return new DragBuilder4<>(this.controller, this.recyclerView, this.movementFlags, cls, arrayList);
        }

        public DragBuilder4<EpoxyModel> withTargets(Class<? extends EpoxyModel>... clsArr) {
            return new DragBuilder4<>(this.controller, this.recyclerView, this.movementFlags, EpoxyModel.class, Arrays.asList(clsArr));
        }

        private DragBuilder3(EpoxyController epoxyController, RecyclerView recyclerView, int i) {
            this.controller = epoxyController;
            this.recyclerView = recyclerView;
            this.movementFlags = i;
        }
    }

    public static class DragBuilder4<U extends EpoxyModel> {
        private final EpoxyController controller;
        private final int movementFlags;
        private final RecyclerView recyclerView;
        private final Class<U> targetModelClass;
        private final List<Class<? extends EpoxyModel>> targetModelClasses;

        public u andCallbacks(final DragCallbacks<U> dragCallbacks) {
            u uVar = new u(new EpoxyModelTouchCallback<U>(this.controller, this.targetModelClass) { // from class: com.airbnb.epoxy.EpoxyTouchHelper.DragBuilder4.1
                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback, com.airbnb.epoxy.BaseEpoxyTouchCallback
                public void clearView(U u6, View view) {
                    dragCallbacks.clearView(u6, view);
                }

                @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
                public int getMovementFlagsForModel(U u6, int i) {
                    return DragBuilder4.this.movementFlags;
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
                public boolean isTouchableModel(EpoxyModel<?> epoxyModel) {
                    return (DragBuilder4.this.targetModelClasses.size() == 1 ? super.isTouchableModel(epoxyModel) : DragBuilder4.this.targetModelClasses.contains(epoxyModel.getClass())) && dragCallbacks.isDragEnabledForModel(epoxyModel);
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback, com.airbnb.epoxy.EpoxyDragCallback
                public void onDragReleased(U u6, View view) {
                    dragCallbacks.onDragReleased(u6, view);
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback, com.airbnb.epoxy.EpoxyDragCallback
                public void onDragStarted(U u6, View view, int i) {
                    dragCallbacks.onDragStarted(u6, view, i);
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback, com.airbnb.epoxy.EpoxyDragCallback
                public void onModelMoved(int i, int i9, U u6, View view) {
                    dragCallbacks.onModelMoved(i, i9, u6, view);
                }
            });
            uVar.d(this.recyclerView);
            return uVar;
        }

        private DragBuilder4(EpoxyController epoxyController, RecyclerView recyclerView, int i, Class<U> cls, List<Class<? extends EpoxyModel>> list) {
            this.controller = epoxyController;
            this.recyclerView = recyclerView;
            this.movementFlags = i;
            this.targetModelClass = cls;
            this.targetModelClasses = list;
        }
    }

    public static class SwipeBuilder {
        private final RecyclerView recyclerView;

        public SwipeBuilder2 left() {
            return withDirections(4);
        }

        public SwipeBuilder2 leftAndRight() {
            return withDirections(12);
        }

        public SwipeBuilder2 right() {
            return withDirections(8);
        }

        public SwipeBuilder2 withDirections(int i) {
            return new SwipeBuilder2(this.recyclerView, u.d.makeMovementFlags(0, i));
        }

        private SwipeBuilder(RecyclerView recyclerView) {
            this.recyclerView = recyclerView;
        }
    }

    public static class SwipeBuilder2 {
        private final int movementFlags;
        private final RecyclerView recyclerView;

        public SwipeBuilder3<EpoxyModel> forAllModels() {
            return withTarget(EpoxyModel.class);
        }

        public <U extends EpoxyModel> SwipeBuilder3<U> withTarget(Class<U> cls) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(cls);
            return new SwipeBuilder3<>(this.recyclerView, this.movementFlags, cls, arrayList);
        }

        public SwipeBuilder3<EpoxyModel> withTargets(Class<? extends EpoxyModel>... clsArr) {
            return new SwipeBuilder3<>(this.recyclerView, this.movementFlags, EpoxyModel.class, Arrays.asList(clsArr));
        }

        private SwipeBuilder2(RecyclerView recyclerView, int i) {
            this.recyclerView = recyclerView;
            this.movementFlags = i;
        }
    }

    public static class SwipeBuilder3<U extends EpoxyModel> {
        private final int movementFlags;
        private final RecyclerView recyclerView;
        private final Class<U> targetModelClass;
        private final List<Class<? extends EpoxyModel>> targetModelClasses;

        public u andCallbacks(final SwipeCallbacks<U> swipeCallbacks) {
            u uVar = new u(new EpoxyModelTouchCallback<U>(null, this.targetModelClass) { // from class: com.airbnb.epoxy.EpoxyTouchHelper.SwipeBuilder3.1
                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback, com.airbnb.epoxy.BaseEpoxyTouchCallback
                public void clearView(U u6, View view) {
                    swipeCallbacks.clearView(u6, view);
                }

                @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
                public int getMovementFlagsForModel(U u6, int i) {
                    return SwipeBuilder3.this.movementFlags;
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
                public boolean isTouchableModel(EpoxyModel<?> epoxyModel) {
                    return (SwipeBuilder3.this.targetModelClasses.size() == 1 ? super.isTouchableModel(epoxyModel) : SwipeBuilder3.this.targetModelClasses.contains(epoxyModel.getClass())) && swipeCallbacks.isSwipeEnabledForModel(epoxyModel);
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback, com.airbnb.epoxy.EpoxySwipeCallback
                public void onSwipeCompleted(U u6, View view, int i, int i9) {
                    swipeCallbacks.onSwipeCompleted(u6, view, i, i9);
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback, com.airbnb.epoxy.EpoxySwipeCallback
                public void onSwipeProgressChanged(U u6, View view, float f10, Canvas canvas) {
                    swipeCallbacks.onSwipeProgressChanged(u6, view, f10, canvas);
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback, com.airbnb.epoxy.EpoxySwipeCallback
                public void onSwipeReleased(U u6, View view) {
                    swipeCallbacks.onSwipeReleased(u6, view);
                }

                @Override // com.airbnb.epoxy.EpoxyModelTouchCallback, com.airbnb.epoxy.EpoxySwipeCallback
                public void onSwipeStarted(U u6, View view, int i) {
                    swipeCallbacks.onSwipeStarted(u6, view, i);
                }
            });
            uVar.d(this.recyclerView);
            return uVar;
        }

        private SwipeBuilder3(RecyclerView recyclerView, int i, Class<U> cls, List<Class<? extends EpoxyModel>> list) {
            this.recyclerView = recyclerView;
            this.movementFlags = i;
            this.targetModelClass = cls;
            this.targetModelClasses = list;
        }
    }

    public static DragBuilder initDragging(EpoxyController epoxyController) {
        return new DragBuilder(epoxyController);
    }

    public static SwipeBuilder initSwiping(RecyclerView recyclerView) {
        return new SwipeBuilder(recyclerView);
    }

    public static abstract class DragCallbacks<T extends EpoxyModel> implements EpoxyDragCallback<T> {
        @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
        public final int getMovementFlagsForModel(T t3, int i) {
            return 0;
        }

        public boolean isDragEnabledForModel(T t3) {
            return true;
        }

        @Override // com.airbnb.epoxy.EpoxyDragCallback
        public abstract void onModelMoved(int i, int i9, T t3, View view);

        @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
        public void clearView(T t3, View view) {
        }

        @Override // com.airbnb.epoxy.EpoxyDragCallback
        public void onDragReleased(T t3, View view) {
        }

        @Override // com.airbnb.epoxy.EpoxyDragCallback
        public void onDragStarted(T t3, View view, int i) {
        }
    }

    public static abstract class SwipeCallbacks<T extends EpoxyModel> implements EpoxySwipeCallback<T> {
        @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
        public final int getMovementFlagsForModel(T t3, int i) {
            return 0;
        }

        public boolean isSwipeEnabledForModel(T t3) {
            return true;
        }

        @Override // com.airbnb.epoxy.EpoxySwipeCallback
        public abstract void onSwipeCompleted(T t3, View view, int i, int i9);

        @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
        public void clearView(T t3, View view) {
        }

        @Override // com.airbnb.epoxy.EpoxySwipeCallback
        public void onSwipeReleased(T t3, View view) {
        }

        @Override // com.airbnb.epoxy.EpoxySwipeCallback
        public void onSwipeStarted(T t3, View view, int i) {
        }

        @Override // com.airbnb.epoxy.EpoxySwipeCallback
        public void onSwipeProgressChanged(T t3, View view, float f10, Canvas canvas) {
        }
    }
}
