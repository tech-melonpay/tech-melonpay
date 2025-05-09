package com.airbnb.epoxy;

import android.widget.CompoundButton;
import com.airbnb.epoxy.EpoxyModel;

/* loaded from: classes.dex */
public class WrappedEpoxyModelCheckedChangeListener<T extends EpoxyModel<?>, V> implements CompoundButton.OnCheckedChangeListener {
    private final OnModelCheckedChangeListener<T, V> originalCheckedChangeListener;

    public WrappedEpoxyModelCheckedChangeListener(OnModelCheckedChangeListener<T, V> onModelCheckedChangeListener) {
        if (onModelCheckedChangeListener == null) {
            throw new IllegalArgumentException("Checked change listener cannot be null");
        }
        this.originalCheckedChangeListener = onModelCheckedChangeListener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WrappedEpoxyModelCheckedChangeListener) {
            return this.originalCheckedChangeListener.equals(((WrappedEpoxyModelCheckedChangeListener) obj).originalCheckedChangeListener);
        }
        return false;
    }

    public int hashCode() {
        return this.originalCheckedChangeListener.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        int adapterPosition;
        EpoxyViewHolder epoxyHolderForChildView = ListenersUtils.getEpoxyHolderForChildView(compoundButton);
        if (epoxyHolderForChildView == null || (adapterPosition = epoxyHolderForChildView.getAdapterPosition()) == -1) {
            return;
        }
        this.originalCheckedChangeListener.onChecked(epoxyHolderForChildView.getModel(), epoxyHolderForChildView.objectToBind(), compoundButton, z10, adapterPosition);
    }
}
