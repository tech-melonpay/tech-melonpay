package com.sumsub.sns.internal.core.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, com.sumsub.sns.internal.core.data.model.remote.c> f16578a;

    /* renamed from: b, reason: collision with root package name */
    public final com.sumsub.sns.internal.core.domain.c f16579b;

    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap2.put(parcel.readString(), com.sumsub.sns.internal.core.data.model.remote.c.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new d(linkedHashMap, com.sumsub.sns.internal.core.domain.c.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i) {
            return new d[i];
        }
    }

    public d(Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map, com.sumsub.sns.internal.core.domain.c cVar) {
        this.f16578a = map;
        this.f16579b = cVar;
    }

    public final com.sumsub.sns.internal.core.domain.c c() {
        return this.f16579b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.f.b(this.f16578a, dVar.f16578a) && kotlin.jvm.internal.f.b(this.f16579b, dVar.f16579b);
    }

    public int hashCode() {
        Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map = this.f16578a;
        return this.f16579b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public String toString() {
        return "CountriesData(phoneCountryCodeWithMasks=" + this.f16578a + ", countriesData=" + this.f16579b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map = this.f16578a;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, com.sumsub.sns.internal.core.data.model.remote.c> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
        this.f16579b.writeToParcel(parcel, i);
    }
}
