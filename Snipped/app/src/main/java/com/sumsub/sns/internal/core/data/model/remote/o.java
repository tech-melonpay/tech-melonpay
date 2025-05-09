package com.sumsub.sns.internal.core.data.model.remote;

import C.v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f15669a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15670b;

    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o createFromParcel(Parcel parcel) {
            return new o(parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o[] newArray(int i) {
            return new o[i];
        }
    }

    public o(List<String> list, String str) {
        this.f15669a = list;
        this.f15670b = str;
    }

    public final List<String> c() {
        return this.f15669a;
    }

    public final String d() {
        return this.f15670b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.f.b(this.f15669a, oVar.f15669a) && kotlin.jvm.internal.f.b(this.f15670b, oVar.f15670b);
    }

    public int hashCode() {
        List<String> list = this.f15669a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f15670b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TinInfo(placeHolders=");
        sb2.append(this.f15669a);
        sb2.append(", regex=");
        return v.q(sb2, this.f15670b, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f15669a);
        parcel.writeString(this.f15670b);
    }
}
