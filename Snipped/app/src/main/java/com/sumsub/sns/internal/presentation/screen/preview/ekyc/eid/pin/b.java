package com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin;

import C.v;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a f18414a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18415b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18416c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18417d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18418e;

    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            return new b((com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a aVar, String str, String str2, String str3, String str4) {
        this.f18414a = aVar;
        this.f18415b = str;
        this.f18416c = str2;
        this.f18417d = str3;
        this.f18418e = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return f.b(this.f18414a, bVar.f18414a) && f.b(this.f18415b, bVar.f18415b) && f.b(this.f18416c, bVar.f18416c) && f.b(this.f18417d, bVar.f18417d) && f.b(this.f18418e, bVar.f18418e);
    }

    public final String f() {
        return this.f18417d;
    }

    public final String g() {
        return this.f18418e;
    }

    public final String h() {
        return this.f18416c;
    }

    public int hashCode() {
        int hashCode = this.f18414a.hashCode() * 31;
        String str = this.f18415b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18416c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18417d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18418e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final com.sumsub.sns.internal.presentation.screen.preview.ekyc.eid.pin.a i() {
        return this.f18414a;
    }

    public final String j() {
        return this.f18415b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PinResult(pinMode=");
        sb2.append(this.f18414a);
        sb2.append(", secret=");
        sb2.append(this.f18415b);
        sb2.append(", oldPin=");
        sb2.append(this.f18416c);
        sb2.append(", can=");
        sb2.append(this.f18417d);
        sb2.append(", lastPinDigit=");
        return v.q(sb2, this.f18418e, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f18414a, i);
        parcel.writeString(this.f18415b);
        parcel.writeString(this.f18416c);
        parcel.writeString(this.f18417d);
        parcel.writeString(this.f18418e);
    }
}
