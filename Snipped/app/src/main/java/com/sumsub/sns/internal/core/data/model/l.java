package com.sumsub.sns.internal.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<n> f15517a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15518b;

    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(n.CREATOR.createFromParcel(parcel));
            }
            return new l(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l[] newArray(int i) {
            return new l[i];
        }
    }

    public l(List<n> list, boolean z10) {
        this.f15517a = list;
        this.f15518b = z10;
    }

    public final List<n> c() {
        return this.f15517a;
    }

    public final boolean d() {
        return this.f15518b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.f.b(this.f15517a, lVar.f15517a) && this.f15518b == lVar.f15518b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f15517a.hashCode() * 31;
        boolean z10 = this.f15518b;
        int i = z10;
        if (z10 != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CompositeDocumentPickerResult(results=");
        sb2.append(this.f15517a);
        sb2.append(", isSeamless=");
        return androidx.camera.core.impl.utils.a.o(sb2, this.f15518b, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List<n> list = this.f15517a;
        parcel.writeInt(list.size());
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f15518b ? 1 : 0);
    }
}
