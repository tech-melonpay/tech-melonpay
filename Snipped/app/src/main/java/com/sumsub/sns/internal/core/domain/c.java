package com.sumsub.sns.internal.core.domain;

import C.v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f16334a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, com.sumsub.sns.internal.core.data.model.remote.c> f16335b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f16336c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, String> f16337d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f16338e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16339f;

    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            LinkedHashMap linkedHashMap4;
            LinkedHashMap linkedHashMap5 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap6.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap6;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(readInt2);
                for (int i9 = 0; i9 != readInt2; i9++) {
                    linkedHashMap7.put(parcel.readString(), com.sumsub.sns.internal.core.data.model.remote.c.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap2 = linkedHashMap7;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(readInt3);
                for (int i10 = 0; i10 != readInt3; i10++) {
                    linkedHashMap8.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap3 = linkedHashMap8;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap4 = null;
            } else {
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(readInt4);
                for (int i11 = 0; i11 != readInt4; i11++) {
                    linkedHashMap9.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap4 = linkedHashMap9;
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                linkedHashMap5 = new LinkedHashMap(readInt5);
                for (int i12 = 0; i12 != readInt5; i12++) {
                    linkedHashMap5.put(parcel.readString(), parcel.readString());
                }
            }
            return new c(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i) {
            return new c[i];
        }
    }

    public c(Map<String, String> map, Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map2, Map<String, String> map3, Map<String, String> map4, Map<String, String> map5, String str) {
        this.f16334a = map;
        this.f16335b = map2;
        this.f16336c = map3;
        this.f16337d = map4;
        this.f16338e = map5;
        this.f16339f = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.f.b(this.f16334a, cVar.f16334a) && kotlin.jvm.internal.f.b(this.f16335b, cVar.f16335b) && kotlin.jvm.internal.f.b(this.f16336c, cVar.f16336c) && kotlin.jvm.internal.f.b(this.f16337d, cVar.f16337d) && kotlin.jvm.internal.f.b(this.f16338e, cVar.f16338e) && kotlin.jvm.internal.f.b(this.f16339f, cVar.f16339f);
    }

    public final Map<String, String> g() {
        return this.f16334a;
    }

    public final Map<String, String> h() {
        return this.f16336c;
    }

    public int hashCode() {
        Map<String, String> map = this.f16334a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map2 = this.f16335b;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.f16336c;
        int hashCode3 = (hashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, String> map4 = this.f16337d;
        int hashCode4 = (hashCode3 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<String, String> map5 = this.f16338e;
        int hashCode5 = (hashCode4 + (map5 == null ? 0 : map5.hashCode())) * 31;
        String str = this.f16339f;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String i() {
        return this.f16339f;
    }

    public final Map<String, String> j() {
        return this.f16338e;
    }

    public final Map<String, com.sumsub.sns.internal.core.data.model.remote.c> k() {
        return this.f16335b;
    }

    public final Map<String, String> l() {
        return this.f16337d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CountryResultData(countries=");
        sb2.append(this.f16334a);
        sb2.append(", phoneMasks=");
        sb2.append(this.f16335b);
        sb2.append(", countriesMap=");
        sb2.append(this.f16336c);
        sb2.append(", unfilteredCountriesMap=");
        sb2.append(this.f16337d);
        sb2.append(", includedCountries=");
        sb2.append(this.f16338e);
        sb2.append(", currentCountryKey=");
        return v.q(sb2, this.f16339f, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Map<String, String> map = this.f16334a;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Map<String, com.sumsub.sns.internal.core.data.model.remote.c> map2 = this.f16335b;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, com.sumsub.sns.internal.core.data.model.remote.c> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                entry2.getValue().writeToParcel(parcel, i);
            }
        }
        Map<String, String> map3 = this.f16336c;
        if (map3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map3.size());
            for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                parcel.writeString(entry3.getKey());
                parcel.writeString(entry3.getValue());
            }
        }
        Map<String, String> map4 = this.f16337d;
        if (map4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map4.size());
            for (Map.Entry<String, String> entry4 : map4.entrySet()) {
                parcel.writeString(entry4.getKey());
                parcel.writeString(entry4.getValue());
            }
        }
        Map<String, String> map5 = this.f16338e;
        if (map5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map5.size());
            for (Map.Entry<String, String> entry5 : map5.entrySet()) {
                parcel.writeString(entry5.getKey());
                parcel.writeString(entry5.getValue());
            }
        }
        parcel.writeString(this.f16339f);
    }
}
