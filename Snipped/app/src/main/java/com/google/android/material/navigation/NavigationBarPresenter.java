package com.google.android.material.navigation;

import M2.d;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
import k1.C0921b;
import k1.H;

/* loaded from: classes.dex */
public final class NavigationBarPresenter implements j {

    /* renamed from: a, reason: collision with root package name */
    public d f9685a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9686b;

    /* renamed from: c, reason: collision with root package name */
    public int f9687c;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f9688a;

        /* renamed from: b, reason: collision with root package name */
        public ParcelableSparseArray f9689b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f9688a = parcel.readInt();
                savedState.f9689b = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f9688a);
            parcel.writeParcelable(this.f9689b, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        C0921b c0921b;
        if (this.f9686b) {
            return;
        }
        if (z10) {
            this.f9685a.a();
            return;
        }
        d dVar = this.f9685a;
        f fVar = dVar.f2574E;
        if (fVar == null || dVar.f2580f == null) {
            return;
        }
        int size = fVar.f4751f.size();
        if (size != dVar.f2580f.length) {
            dVar.a();
            return;
        }
        int i = dVar.f2581g;
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem item = dVar.f2574E.getItem(i9);
            if (item.isChecked()) {
                dVar.f2581g = item.getItemId();
                dVar.f2582h = i9;
            }
        }
        if (i != dVar.f2581g && (c0921b = dVar.f2575a) != null) {
            H.a(dVar, c0921b);
        }
        int i10 = dVar.f2579e;
        boolean z11 = i10 != -1 ? i10 == 0 : dVar.f2574E.l().size() > 3;
        for (int i11 = 0; i11 < size; i11++) {
            dVar.f2573D.f9686b = true;
            dVar.f2580f[i11].setLabelVisibilityMode(dVar.f2579e);
            dVar.f2580f[i11].setShifting(z11);
            dVar.f2580f[i11].d((h) dVar.f2574E.getItem(i11));
            dVar.f2573D.f9686b = false;
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.f9687c;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, f fVar) {
        this.f9685a.f2574E = fVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        SparseArray<com.google.android.material.badge.a> sparseArray;
        if (parcelable instanceof SavedState) {
            d dVar = this.f9685a;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.f9688a;
            int size = dVar.f2574E.f4751f.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                MenuItem item = dVar.f2574E.getItem(i9);
                if (i == item.getItemId()) {
                    dVar.f2581g = i;
                    dVar.f2582h = i9;
                    item.setChecked(true);
                    break;
                }
                i9++;
            }
            Context context = this.f9685a.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.f9689b;
            SparseArray sparseArray2 = new SparseArray(parcelableSparseArray.size());
            for (int i10 = 0; i10 < parcelableSparseArray.size(); i10++) {
                int keyAt = parcelableSparseArray.keyAt(i10);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i10);
                sparseArray2.put(keyAt, state != null ? new com.google.android.material.badge.a(context, state) : null);
            }
            d dVar2 = this.f9685a;
            dVar2.getClass();
            int i11 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = dVar2.f2592s;
                if (i11 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i11);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (com.google.android.material.badge.a) sparseArray2.get(keyAt2));
                }
                i11++;
            }
            M2.a[] aVarArr = dVar2.f2580f;
            if (aVarArr != null) {
                for (M2.a aVar : aVarArr) {
                    com.google.android.material.badge.a aVar2 = sparseArray.get(aVar.getId());
                    if (aVar2 != null) {
                        aVar.setBadge(aVar2);
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        SavedState savedState = new SavedState();
        savedState.f9688a = this.f9685a.getSelectedItemId();
        SparseArray<com.google.android.material.badge.a> badgeDrawables = this.f9685a.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            com.google.android.material.badge.a valueAt = badgeDrawables.valueAt(i);
            parcelableSparseArray.put(keyAt, valueAt != null ? valueAt.f9098e.f9055a : null);
        }
        savedState.f9689b = parcelableSparseArray;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z10) {
    }
}
