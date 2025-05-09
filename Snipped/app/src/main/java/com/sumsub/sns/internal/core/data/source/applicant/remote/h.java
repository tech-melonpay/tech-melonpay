package com.sumsub.sns.internal.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final double f16007a;

    /* renamed from: b, reason: collision with root package name */
    public final double f16008b;

    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h createFromParcel(Parcel parcel) {
            return new h(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h[] newArray(int i) {
            return new h[i];
        }
    }

    public h(double d10, double d11) {
        this.f16007a = d10;
        this.f16008b = d11;
    }

    public final boolean a(Double d10) {
        if (d10 == null) {
            return false;
        }
        double d11 = this.f16007a;
        double d12 = this.f16008b;
        double doubleValue = d10.doubleValue();
        return doubleValue >= d11 && doubleValue <= d12;
    }

    public final double c() {
        return this.f16008b;
    }

    public final double d() {
        return this.f16007a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.f.b(Double.valueOf(this.f16007a), Double.valueOf(hVar.f16007a)) && kotlin.jvm.internal.f.b(Double.valueOf(this.f16008b), Double.valueOf(hVar.f16008b));
    }

    public int hashCode() {
        return Double.hashCode(this.f16008b) + (Double.hashCode(this.f16007a) * 31);
    }

    public String toString() {
        return "DoubleRange(min=" + this.f16007a + ", max=" + this.f16008b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f16007a);
        parcel.writeDouble(this.f16008b);
    }
}
