package com.airbnb.epoxy;

import com.airbnb.epoxy.EpoxyModel;

@EpoxyBuildScope
/* loaded from: classes.dex */
public interface GroupModelBuilder extends ModelCollector {
    /* renamed from: id */
    GroupModelBuilder mo4id(long j10);

    /* renamed from: id */
    GroupModelBuilder mo5id(long j10, long j11);

    /* renamed from: id */
    GroupModelBuilder mo6id(CharSequence charSequence);

    /* renamed from: id */
    GroupModelBuilder mo7id(CharSequence charSequence, long j10);

    /* renamed from: id */
    GroupModelBuilder mo8id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    GroupModelBuilder mo9id(Number... numberArr);

    /* renamed from: layout */
    GroupModelBuilder mo10layout(int i);

    GroupModelBuilder onBind(OnModelBoundListener<GroupModel_, ModelGroupHolder> onModelBoundListener);

    GroupModelBuilder onUnbind(OnModelUnboundListener<GroupModel_, ModelGroupHolder> onModelUnboundListener);

    GroupModelBuilder onVisibilityChanged(OnModelVisibilityChangedListener<GroupModel_, ModelGroupHolder> onModelVisibilityChangedListener);

    GroupModelBuilder onVisibilityStateChanged(OnModelVisibilityStateChangedListener<GroupModel_, ModelGroupHolder> onModelVisibilityStateChangedListener);

    /* renamed from: shouldSaveViewState */
    GroupModelBuilder mo11shouldSaveViewState(boolean z10);

    /* renamed from: spanSizeOverride */
    GroupModelBuilder mo12spanSizeOverride(EpoxyModel.SpanSizeOverrideCallback spanSizeOverrideCallback);
}
