package com.airbnb.epoxy;

import C.v;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import java.util.List;

/* loaded from: classes.dex */
public class EpoxyViewHolder extends RecyclerView.C {
    private EpoxyHolder epoxyHolder;
    private EpoxyModel epoxyModel;
    ViewHolderState.ViewState initialViewState;
    private ViewParent parent;
    private List<Object> payloads;

    public EpoxyViewHolder(ViewParent viewParent, View view, boolean z10) {
        super(view);
        this.parent = viewParent;
        if (z10) {
            ViewHolderState.ViewState viewState = new ViewHolderState.ViewState();
            this.initialViewState = viewState;
            viewState.save(this.itemView);
        }
    }

    private void assertBound() {
        if (this.epoxyModel == null) {
            throw new IllegalStateException("This holder is not currently bound.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void bind(EpoxyModel epoxyModel, EpoxyModel<?> epoxyModel2, List<Object> list, int i) {
        this.payloads = list;
        if (this.epoxyHolder == null && (epoxyModel instanceof EpoxyModelWithHolder)) {
            EpoxyHolder createNewHolder = ((EpoxyModelWithHolder) epoxyModel).createNewHolder(this.parent);
            this.epoxyHolder = createNewHolder;
            createNewHolder.bindView(this.itemView);
        }
        this.parent = null;
        if (epoxyModel instanceof GeneratedModel) {
            ((GeneratedModel) epoxyModel).handlePreBind(this, objectToBind(), i);
        }
        epoxyModel.preBind(objectToBind(), epoxyModel2);
        if (epoxyModel2 != null) {
            epoxyModel.bind((EpoxyModel) objectToBind(), epoxyModel2);
        } else if (list.isEmpty()) {
            epoxyModel.bind(objectToBind());
        } else {
            epoxyModel.bind((EpoxyModel) objectToBind(), list);
        }
        if (epoxyModel instanceof GeneratedModel) {
            ((GeneratedModel) epoxyModel).handlePostBind(objectToBind(), i);
        }
        this.epoxyModel = epoxyModel;
    }

    public EpoxyHolder getHolder() {
        assertBound();
        return this.epoxyHolder;
    }

    public EpoxyModel<?> getModel() {
        assertBound();
        return this.epoxyModel;
    }

    public List<Object> getPayloads() {
        assertBound();
        return this.payloads;
    }

    public Object objectToBind() {
        EpoxyHolder epoxyHolder = this.epoxyHolder;
        return epoxyHolder != null ? epoxyHolder : this.itemView;
    }

    public void restoreInitialViewState() {
        ViewHolderState.ViewState viewState = this.initialViewState;
        if (viewState != null) {
            viewState.restore(this.itemView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EpoxyViewHolder{epoxyModel=");
        sb2.append(this.epoxyModel);
        sb2.append(", view=");
        sb2.append(this.itemView);
        sb2.append(", super=");
        return v.q(sb2, super.toString(), '}');
    }

    public void unbind() {
        assertBound();
        this.epoxyModel.unbind(objectToBind());
        this.epoxyModel = null;
        this.payloads = null;
    }

    public void visibilityChanged(float f10, float f11, int i, int i9) {
        assertBound();
        this.epoxyModel.onVisibilityChanged(f10, f11, i, i9, objectToBind());
    }

    public void visibilityStateChanged(int i) {
        assertBound();
        this.epoxyModel.onVisibilityStateChanged(i, objectToBind());
    }
}
