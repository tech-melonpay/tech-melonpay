package com.airbnb.epoxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.collection.d;
import com.luminary.mobile.R;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
class ViewHolderState extends d<ViewState> implements Parcelable {
    public static final Parcelable.Creator<ViewHolderState> CREATOR = new Parcelable.Creator<ViewHolderState>() { // from class: com.airbnb.epoxy.ViewHolderState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ViewHolderState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ViewHolderState viewHolderState = new ViewHolderState(readInt);
            for (int i = 0; i < readInt; i++) {
                viewHolderState.put(parcel.readLong(), (ViewState) parcel.readParcelable(ViewState.class.getClassLoader()));
            }
            return viewHolderState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ViewHolderState[] newArray(int i) {
            return new ViewHolderState[i];
        }
    };

    public static class ViewState extends SparseArray<Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new Parcelable.ClassLoaderCreator<ViewState>() { // from class: com.airbnb.epoxy.ViewHolderState.ViewState.1
            @Override // android.os.Parcelable.Creator
            public ViewState[] newArray(int i) {
                return new ViewState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public ViewState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new ViewState(readInt, iArr, parcel.readParcelableArray(classLoader));
            }

            @Override // android.os.Parcelable.Creator
            public ViewState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }
        };

        private void setIdIfNoneExists(View view) {
            if (view.getId() == -1) {
                view.setId(R.id.view_model_state_saving_id);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void restore(View view) {
            int id = view.getId();
            setIdIfNoneExists(view);
            view.restoreHierarchyState(this);
            view.setId(id);
        }

        public void save(View view) {
            int id = view.getId();
            setIdIfNoneExists(view);
            view.saveHierarchyState(this);
            view.setId(id);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int size = size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i9 = 0; i9 < size; i9++) {
                iArr[i9] = keyAt(i9);
                parcelableArr[i9] = valueAt(i9);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public ViewState() {
        }

        private ViewState(int i, int[] iArr, Parcelable[] parcelableArr) {
            super(i);
            for (int i9 = 0; i9 < i; i9++) {
                put(iArr[i9], parcelableArr[i9]);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean hasStateForHolder(EpoxyViewHolder epoxyViewHolder) {
        return get(epoxyViewHolder.getItemId()) != null;
    }

    public void restore(EpoxyViewHolder epoxyViewHolder) {
        if (epoxyViewHolder.getModel().shouldSaveViewState()) {
            ViewState viewState = get(epoxyViewHolder.getItemId());
            if (viewState != null) {
                viewState.restore(epoxyViewHolder.itemView);
            } else {
                epoxyViewHolder.restoreInitialViewState();
            }
        }
    }

    public void save(Collection<EpoxyViewHolder> collection) {
        Iterator<EpoxyViewHolder> it = collection.iterator();
        while (it.hasNext()) {
            save(it.next());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeLong(keyAt(i9));
            parcel.writeParcelable(valueAt(i9), 0);
        }
    }

    public ViewHolderState() {
    }

    private ViewHolderState(int i) {
        super(i);
    }

    public void save(EpoxyViewHolder epoxyViewHolder) {
        if (epoxyViewHolder.getModel().shouldSaveViewState()) {
            ViewState viewState = get(epoxyViewHolder.getItemId());
            if (viewState == null) {
                viewState = new ViewState();
            }
            viewState.save(epoxyViewHolder.itemView);
            put(epoxyViewHolder.getItemId(), viewState);
        }
    }
}
