package com.airbnb.epoxy;

import F0.d;
import F0.f;
import F0.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;

/* loaded from: classes.dex */
public abstract class DataBindingEpoxyModel extends EpoxyModelWithHolder<DataBindingHolder> {

    public static class DataBindingHolder extends EpoxyHolder {
        private f dataBinding;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public void bindView(View view) {
            this.dataBinding = (f) view.getTag();
        }

        public f getDataBinding() {
            return this.dataBinding;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public View buildView(ViewGroup viewGroup) {
        f b9 = d.b(LayoutInflater.from(viewGroup.getContext()), getViewType(), viewGroup, false, null);
        View view = b9.f1148d;
        view.setTag(b9);
        return view;
    }

    public abstract void setDataBindingVariables(f fVar);

    public void setDataBindingVariables(f fVar, EpoxyModel<?> epoxyModel) {
        setDataBindingVariables(fVar);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public /* bridge */ /* synthetic */ void bind(DataBindingHolder dataBindingHolder, EpoxyModel epoxyModel) {
        bind2(dataBindingHolder, (EpoxyModel<?>) epoxyModel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final DataBindingHolder createNewHolder(ViewParent viewParent) {
        return new DataBindingHolder();
    }

    public void setDataBindingVariables(f fVar, List<Object> list) {
        setDataBindingVariables(fVar);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public /* bridge */ /* synthetic */ void bind(DataBindingHolder dataBindingHolder, List list) {
        bind2(dataBindingHolder, (List<Object>) list);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public void unbind(DataBindingHolder dataBindingHolder) {
        for (h hVar : dataBindingHolder.dataBinding.f1147c) {
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public /* bridge */ /* synthetic */ void bind(Object obj, EpoxyModel epoxyModel) {
        bind2((DataBindingHolder) obj, (EpoxyModel<?>) epoxyModel);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public /* bridge */ /* synthetic */ void bind(Object obj, List list) {
        bind2((DataBindingHolder) obj, (List<Object>) list);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public void bind(DataBindingHolder dataBindingHolder) {
        setDataBindingVariables(dataBindingHolder.dataBinding);
        dataBindingHolder.dataBinding.c();
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(DataBindingHolder dataBindingHolder, EpoxyModel<?> epoxyModel) {
        setDataBindingVariables(dataBindingHolder.dataBinding, epoxyModel);
        dataBindingHolder.dataBinding.c();
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(DataBindingHolder dataBindingHolder, List<Object> list) {
        setDataBindingVariables(dataBindingHolder.dataBinding, list);
        dataBindingHolder.dataBinding.c();
    }
}
