package com.airbnb.epoxy;

import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class EpoxyModelGroup extends EpoxyModelWithHolder<ModelGroupHolder> {
    protected final List<EpoxyModel<?>> models;
    private Boolean shouldSaveViewState;
    private boolean shouldSaveViewStateDefault;

    public interface IterateModelsCallback {
        void onModel(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i);
    }

    public EpoxyModelGroup(int i, Collection<? extends EpoxyModel<?>> collection) {
        this(i, (List<EpoxyModel<?>>) new ArrayList(collection));
    }

    private void iterateModels(ModelGroupHolder modelGroupHolder, IterateModelsCallback iterateModelsCallback) {
        modelGroupHolder.bindGroupIfNeeded(this);
        int size = this.models.size();
        for (int i = 0; i < size; i++) {
            iterateModelsCallback.onModel(this.models.get(i), modelGroupHolder.getViewHolders().get(i), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setViewVisibility(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder) {
        if (epoxyModel.isShown()) {
            epoxyViewHolder.itemView.setVisibility(0);
        } else {
            epoxyViewHolder.itemView.setVisibility(8);
        }
    }

    public void addModel(EpoxyModel<?> epoxyModel) {
        this.shouldSaveViewStateDefault |= epoxyModel.shouldSaveViewState();
        this.models.add(epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof EpoxyModelGroup) && super.equals(obj)) {
            return this.models.equals(((EpoxyModelGroup) obj).models);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int getDefaultLayout() {
        throw new UnsupportedOperationException("You should set a layout with layout(...) instead of using this.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int getSpanSize(int i, int i9, int i10) {
        return this.models.get(0).spanSize(i, i9, i10);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        return this.models.hashCode() + (super.hashCode() * 31);
    }

    public EpoxyModelGroup shouldSaveViewState(boolean z10) {
        onMutation();
        this.shouldSaveViewState = Boolean.valueOf(z10);
        return this;
    }

    public boolean useViewStubLayoutParams(EpoxyModel<?> epoxyModel, int i) {
        return true;
    }

    public EpoxyModelGroup(int i, EpoxyModel<?>... epoxyModelArr) {
        this(i, (List<EpoxyModel<?>>) new ArrayList(Arrays.asList(epoxyModelArr)));
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public /* bridge */ /* synthetic */ void bind(ModelGroupHolder modelGroupHolder, EpoxyModel epoxyModel) {
        bind2(modelGroupHolder, (EpoxyModel<?>) epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final ModelGroupHolder createNewHolder(ViewParent viewParent) {
        return new ModelGroupHolder(viewParent);
    }

    private EpoxyModelGroup(int i, List<EpoxyModel<?>> list) {
        boolean z10 = false;
        this.shouldSaveViewStateDefault = false;
        this.shouldSaveViewState = null;
        if (!list.isEmpty()) {
            this.models = list;
            layout(i);
            id(list.get(0).id());
            Iterator<EpoxyModel<?>> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().shouldSaveViewState()) {
                    z10 = true;
                    break;
                }
            }
            this.shouldSaveViewStateDefault = z10;
            return;
        }
        throw new IllegalArgumentException("Models cannot be empty");
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public /* bridge */ /* synthetic */ void bind(ModelGroupHolder modelGroupHolder, List list) {
        bind2(modelGroupHolder, (List<Object>) list);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public void onViewAttachedToWindow(ModelGroupHolder modelGroupHolder) {
        iterateModels(modelGroupHolder, new IterateModelsCallback() { // from class: com.airbnb.epoxy.EpoxyModelGroup.4
            @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
            public void onModel(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i) {
                epoxyModel.onViewAttachedToWindow(epoxyViewHolder.objectToBind());
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public void onViewDetachedFromWindow(ModelGroupHolder modelGroupHolder) {
        iterateModels(modelGroupHolder, new IterateModelsCallback() { // from class: com.airbnb.epoxy.EpoxyModelGroup.5
            @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
            public void onModel(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i) {
                epoxyModel.onViewDetachedFromWindow(epoxyViewHolder.objectToBind());
            }
        });
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean shouldSaveViewState() {
        Boolean bool = this.shouldSaveViewState;
        if (bool != null) {
            return bool.booleanValue();
        }
        return this.shouldSaveViewStateDefault;
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public void unbind(ModelGroupHolder modelGroupHolder) {
        modelGroupHolder.unbindGroup();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public /* bridge */ /* synthetic */ void bind(Object obj, EpoxyModel epoxyModel) {
        bind2((ModelGroupHolder) obj, (EpoxyModel<?>) epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public /* bridge */ /* synthetic */ void bind(Object obj, List list) {
        bind2((ModelGroupHolder) obj, (List<Object>) list);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public void bind(ModelGroupHolder modelGroupHolder) {
        iterateModels(modelGroupHolder, new IterateModelsCallback() { // from class: com.airbnb.epoxy.EpoxyModelGroup.1
            @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
            public void onModel(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i) {
                EpoxyModelGroup.setViewVisibility(epoxyModel, epoxyViewHolder);
                epoxyViewHolder.bind(epoxyModel, null, Collections.emptyList(), i);
            }
        });
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(ModelGroupHolder modelGroupHolder, List<Object> list) {
        iterateModels(modelGroupHolder, new IterateModelsCallback() { // from class: com.airbnb.epoxy.EpoxyModelGroup.2
            @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
            public void onModel(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i) {
                EpoxyModelGroup.setViewVisibility(epoxyModel, epoxyViewHolder);
                epoxyViewHolder.bind(epoxyModel, null, Collections.emptyList(), i);
            }
        });
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(ModelGroupHolder modelGroupHolder, EpoxyModel<?> epoxyModel) {
        if (!(epoxyModel instanceof EpoxyModelGroup)) {
            bind(modelGroupHolder);
        } else {
            final EpoxyModelGroup epoxyModelGroup = (EpoxyModelGroup) epoxyModel;
            iterateModels(modelGroupHolder, new IterateModelsCallback() { // from class: com.airbnb.epoxy.EpoxyModelGroup.3
                @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
                public void onModel(EpoxyModel epoxyModel2, EpoxyViewHolder epoxyViewHolder, int i) {
                    EpoxyModelGroup.setViewVisibility(epoxyModel2, epoxyViewHolder);
                    if (i < epoxyModelGroup.models.size()) {
                        EpoxyModel<?> epoxyModel3 = epoxyModelGroup.models.get(i);
                        if (epoxyModel3.id() == epoxyModel2.id()) {
                            epoxyViewHolder.bind(epoxyModel2, epoxyModel3, Collections.emptyList(), i);
                            return;
                        }
                    }
                    epoxyViewHolder.bind(epoxyModel2, null, Collections.emptyList(), i);
                }
            });
        }
    }

    public EpoxyModelGroup() {
        this.shouldSaveViewStateDefault = false;
        this.shouldSaveViewState = null;
        this.models = new ArrayList();
        this.shouldSaveViewStateDefault = false;
    }

    public EpoxyModelGroup(int i) {
        this();
        layout(i);
    }
}
