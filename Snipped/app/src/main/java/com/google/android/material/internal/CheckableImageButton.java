package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.customview.view.AbsSavedState;
import m.C1012n;
import y0.C1596C;

/* loaded from: classes.dex */
public class CheckableImageButton extends C1012n implements Checkable {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9592d = {R.attr.state_checked};

    /* renamed from: a, reason: collision with root package name */
    public boolean f9593a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9594b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9595c;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f9596c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9596c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9596c ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luminary.mobile.R.attr.imageButtonStyle);
        this.f9594b = true;
        this.f9595c = true;
        C1596C.o(this, new a(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f9593a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f9593a ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f9592d) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6536a);
        setChecked(savedState.f9596c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9596c = this.f9593a;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f9594b != z10) {
            this.f9594b = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f9594b || this.f9593a == z10) {
            return;
        }
        this.f9593a = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f9595c = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f9595c) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f9593a);
    }
}
