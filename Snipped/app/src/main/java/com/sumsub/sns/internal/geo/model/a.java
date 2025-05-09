package com.sumsub.sns.internal.geo.model;

import C.v;
import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.data.model.h;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0260a();

    /* renamed from: a, reason: collision with root package name */
    public final h.d f17394a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17395b;

    /* renamed from: com.sumsub.sns.internal.geo.model.a$a, reason: collision with other inner class name */
    public static final class C0260a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a createFromParcel(Parcel parcel) {
            return new a(h.d.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(h.d dVar, String str) {
        this.f17394a = dVar;
        this.f17395b = str;
    }

    public final h.d c() {
        return this.f17394a;
    }

    public final String d() {
        return this.f17395b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.b(this.f17394a, aVar.f17394a) && f.b(this.f17395b, aVar.f17395b);
    }

    public int hashCode() {
        return this.f17395b.hashCode() + (this.f17394a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AddressItem(field=");
        sb2.append(this.f17394a);
        sb2.append(", value=");
        return v.q(sb2, this.f17395b, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f17394a.writeToParcel(parcel, i);
        parcel.writeString(this.f17395b);
    }
}
