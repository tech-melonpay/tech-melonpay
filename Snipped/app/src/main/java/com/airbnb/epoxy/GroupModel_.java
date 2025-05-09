package com.airbnb.epoxy;

import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes.dex */
public class GroupModel_ extends GroupModel implements GeneratedModel<ModelGroupHolder>, GroupModelBuilder {
    private OnModelBoundListener<GroupModel_, ModelGroupHolder> onModelBoundListener_epoxyGeneratedModel;
    private OnModelUnboundListener<GroupModel_, ModelGroupHolder> onModelUnboundListener_epoxyGeneratedModel;
    private OnModelVisibilityChangedListener<GroupModel_, ModelGroupHolder> onModelVisibilityChangedListener_epoxyGeneratedModel;
    private OnModelVisibilityStateChangedListener<GroupModel_, ModelGroupHolder> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

    public GroupModel_() {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public void addTo(EpoxyController epoxyController) {
        super.addTo(epoxyController);
        addWithDebugValidation(epoxyController);
    }

    @Override // com.airbnb.epoxy.EpoxyModelGroup, com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupModel_) || !super.equals(obj)) {
            return false;
        }
        GroupModel_ groupModel_ = (GroupModel_) obj;
        if ((this.onModelBoundListener_epoxyGeneratedModel == null) != (groupModel_.onModelBoundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelUnboundListener_epoxyGeneratedModel == null) != (groupModel_.onModelUnboundListener_epoxyGeneratedModel == null)) {
            return false;
        }
        if ((this.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (groupModel_.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null)) {
            return false;
        }
        return (this.onModelVisibilityChangedListener_epoxyGeneratedModel == null) == (groupModel_.onModelVisibilityChangedListener_epoxyGeneratedModel == null);
    }

    @Override // com.airbnb.epoxy.EpoxyModelGroup, com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        return (((((((super.hashCode() * 31) + (this.onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0)) * 31) + (this.onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    public /* bridge */ /* synthetic */ GroupModelBuilder onBind(OnModelBoundListener onModelBoundListener) {
        return onBind((OnModelBoundListener<GroupModel_, ModelGroupHolder>) onModelBoundListener);
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    public /* bridge */ /* synthetic */ GroupModelBuilder onUnbind(OnModelUnboundListener onModelUnboundListener) {
        return onUnbind((OnModelUnboundListener<GroupModel_, ModelGroupHolder>) onModelUnboundListener);
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    public /* bridge */ /* synthetic */ GroupModelBuilder onVisibilityChanged(OnModelVisibilityChangedListener onModelVisibilityChangedListener) {
        return onVisibilityChanged((OnModelVisibilityChangedListener<GroupModel_, ModelGroupHolder>) onModelVisibilityChangedListener);
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    public /* bridge */ /* synthetic */ GroupModelBuilder onVisibilityStateChanged(OnModelVisibilityStateChangedListener onModelVisibilityStateChangedListener) {
        return onVisibilityStateChanged((OnModelVisibilityStateChangedListener<GroupModel_, ModelGroupHolder>) onModelVisibilityStateChangedListener);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        return "GroupModel_{}" + super.toString();
    }

    public GroupModel_(int i) {
        super(i);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public void handlePostBind(ModelGroupHolder modelGroupHolder, int i) {
        OnModelBoundListener<GroupModel_, ModelGroupHolder> onModelBoundListener = this.onModelBoundListener_epoxyGeneratedModel;
        if (onModelBoundListener != null) {
            onModelBoundListener.onModelBound(this, modelGroupHolder, i);
        }
        validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", i);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public void handlePreBind(EpoxyViewHolder epoxyViewHolder, ModelGroupHolder modelGroupHolder, int i) {
        validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", i);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: hide */
    public GroupModel_ hide2() {
        super.hide2();
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    public GroupModel_ onBind(OnModelBoundListener<GroupModel_, ModelGroupHolder> onModelBoundListener) {
        onMutation();
        this.onModelBoundListener_epoxyGeneratedModel = onModelBoundListener;
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    public GroupModel_ onUnbind(OnModelUnboundListener<GroupModel_, ModelGroupHolder> onModelUnboundListener) {
        onMutation();
        this.onModelUnboundListener_epoxyGeneratedModel = onModelUnboundListener;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: reset */
    public GroupModel_ reset2() {
        this.onModelBoundListener_epoxyGeneratedModel = null;
        this.onModelUnboundListener_epoxyGeneratedModel = null;
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = null;
        super.reset2();
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    /* renamed from: layout, reason: merged with bridge method [inline-methods] */
    public GroupModel_ mo10layout(int i) {
        super.mo10layout(i);
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    /* renamed from: shouldSaveViewState, reason: merged with bridge method [inline-methods] */
    public GroupModel_ mo11shouldSaveViewState(boolean z10) {
        super.mo11shouldSaveViewState(z10);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: show */
    public GroupModel_ show2() {
        super.show2();
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    /* renamed from: spanSizeOverride, reason: merged with bridge method [inline-methods] */
    public GroupModel_ mo12spanSizeOverride(EpoxyModel.SpanSizeOverrideCallback spanSizeOverrideCallback) {
        super.mo12spanSizeOverride(spanSizeOverrideCallback);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModelGroup, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public void unbind(ModelGroupHolder modelGroupHolder) {
        super.unbind(modelGroupHolder);
        OnModelUnboundListener<GroupModel_, ModelGroupHolder> onModelUnboundListener = this.onModelUnboundListener_epoxyGeneratedModel;
        if (onModelUnboundListener != null) {
            onModelUnboundListener.onModelUnbound(this, modelGroupHolder);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public void onVisibilityChanged(float f10, float f11, int i, int i9, ModelGroupHolder modelGroupHolder) {
        OnModelVisibilityChangedListener<GroupModel_, ModelGroupHolder> onModelVisibilityChangedListener = this.onModelVisibilityChangedListener_epoxyGeneratedModel;
        if (onModelVisibilityChangedListener != null) {
            onModelVisibilityChangedListener.onVisibilityChanged(this, modelGroupHolder, f10, f11, i, i9);
        }
        super.onVisibilityChanged(f10, f11, i, i9, (int) modelGroupHolder);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public void onVisibilityStateChanged(int i, ModelGroupHolder modelGroupHolder) {
        OnModelVisibilityStateChangedListener<GroupModel_, ModelGroupHolder> onModelVisibilityStateChangedListener = this.onModelVisibilityStateChangedListener_epoxyGeneratedModel;
        if (onModelVisibilityStateChangedListener != null) {
            onModelVisibilityStateChangedListener.onVisibilityStateChanged(this, modelGroupHolder, i);
        }
        super.onVisibilityStateChanged(i, (int) modelGroupHolder);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: show */
    public GroupModel_ show2(boolean z10) {
        super.show2(z10);
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    public GroupModel_ onVisibilityChanged(OnModelVisibilityChangedListener<GroupModel_, ModelGroupHolder> onModelVisibilityChangedListener) {
        onMutation();
        this.onModelVisibilityChangedListener_epoxyGeneratedModel = onModelVisibilityChangedListener;
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    public GroupModel_ onVisibilityStateChanged(OnModelVisibilityStateChangedListener<GroupModel_, ModelGroupHolder> onModelVisibilityStateChangedListener) {
        onMutation();
        this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = onModelVisibilityStateChangedListener;
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public GroupModel_ mo4id(long j10) {
        super.mo4id(j10);
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public GroupModel_ mo9id(Number... numberArr) {
        super.mo9id(numberArr);
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public GroupModel_ mo5id(long j10, long j11) {
        super.mo5id(j10, j11);
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public GroupModel_ mo6id(CharSequence charSequence) {
        super.mo6id(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public GroupModel_ mo8id(CharSequence charSequence, CharSequence... charSequenceArr) {
        super.mo8id(charSequence, charSequenceArr);
        return this;
    }

    @Override // com.airbnb.epoxy.GroupModelBuilder
    /* renamed from: id, reason: merged with bridge method [inline-methods] */
    public GroupModel_ mo7id(CharSequence charSequence, long j10) {
        super.mo7id(charSequence, j10);
        return this;
    }
}
