package com.sumsub.sns.internal.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sumsub.sns.internal.core.data.model.h;
import com.sumsub.sns.internal.core.data.source.applicant.remote.ConfirmationType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f15512a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15513b;

    /* renamed from: c, reason: collision with root package name */
    public final ConfirmationType f15514c;

    /* renamed from: d, reason: collision with root package name */
    public final List<h.d> f15515d;

    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList = null;
            ConfirmationType valueOf = parcel.readInt() == 0 ? null : ConfirmationType.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(h.d.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new j(readString, readString2, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j[] newArray(int i) {
            return new j[i];
        }
    }

    public j(String str, String str2, ConfirmationType confirmationType, List<h.d> list) {
        this.f15512a = str;
        this.f15513b = str2;
        this.f15514c = confirmationType;
        this.f15515d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.f.b(this.f15512a, jVar.f15512a) && kotlin.jvm.internal.f.b(this.f15513b, jVar.f15513b) && this.f15514c == jVar.f15514c && kotlin.jvm.internal.f.b(this.f15515d, jVar.f15515d);
    }

    public final String f() {
        return this.f15513b;
    }

    public final List<h.d> g() {
        return this.f15515d;
    }

    public final String h() {
        return this.f15512a;
    }

    public int hashCode() {
        String str = this.f15512a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f15513b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConfirmationType confirmationType = this.f15514c;
        int hashCode3 = (hashCode2 + (confirmationType == null ? 0 : confirmationType.hashCode())) * 31;
        List<h.d> list = this.f15515d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicantDataSource(sourceId=");
        sb2.append(this.f15512a);
        sb2.append(", docType=");
        sb2.append(this.f15513b);
        sb2.append(", confirmationType=");
        sb2.append(this.f15514c);
        sb2.append(", fields=");
        return C.v.r(sb2, this.f15515d, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15512a);
        parcel.writeString(this.f15513b);
        ConfirmationType confirmationType = this.f15514c;
        if (confirmationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(confirmationType.name());
        }
        List<h.d> list = this.f15515d;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<h.d> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }
}
