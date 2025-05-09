package com.sumsub.sns.internal.ml.badphotos.models;

import android.os.Parcel;
import android.os.Parcelable;
import ka.C0969n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f17628a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17629b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f17630c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f17631d;

    /* renamed from: e, reason: collision with root package name */
    public final Float f17632e;

    /* renamed from: f, reason: collision with root package name */
    public final Float f17633f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f17634g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f17635h;
    public final Boolean i;

    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new b(readString, readString2, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final b a(String str, String str2, Float f10, Long l10, Float f11, Float f12, Integer num, Integer num2, Boolean bool) {
        return new b(str, str2, f10, l10, f11, f12, num, num2, bool);
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
        return f.b(this.f17628a, bVar.f17628a) && f.b(this.f17629b, bVar.f17629b) && f.b(this.f17630c, bVar.f17630c) && f.b(this.f17631d, bVar.f17631d) && f.b(this.f17632e, bVar.f17632e) && f.b(this.f17633f, bVar.f17633f) && f.b(this.f17634g, bVar.f17634g) && f.b(this.f17635h, bVar.f17635h) && f.b(this.i, bVar.i);
    }

    public int hashCode() {
        String str = this.f17628a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17629b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f10 = this.f17630c;
        int hashCode3 = (hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Long l10 = this.f17631d;
        int hashCode4 = (hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Float f11 = this.f17632e;
        int hashCode5 = (hashCode4 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.f17633f;
        int hashCode6 = (hashCode5 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Integer num = this.f17634g;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17635h;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.i;
        return hashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final Integer j() {
        return this.f17634g;
    }

    public final Integer k() {
        return this.f17635h;
    }

    public final String l() {
        return this.f17629b;
    }

    public final String m() {
        return this.f17628a;
    }

    public final Float n() {
        return this.f17630c;
    }

    public final Long o() {
        return this.f17631d;
    }

    public final Float p() {
        return this.f17633f;
    }

    public final Float q() {
        return this.f17632e;
    }

    public final Boolean r() {
        return this.i;
    }

    public final boolean s() {
        String str = this.f17629b;
        return str == null || C0969n.i0(str) || this.f17630c == null || this.f17631d == null;
    }

    public String toString() {
        return "CheckPhotoQualityResult(checkResult=" + this.f17628a + ", checkModel=" + this.f17629b + ", checkScore=" + this.f17630c + ", checkTime=" + this.f17631d + ", lowThreshold=" + this.f17632e + ", highThreshold=" + this.f17633f + ", badAttemptsCounter=" + this.f17634g + ", checkMaxBlockedAttempts=" + this.f17635h + ", isAutocaptured=" + this.i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17628a);
        parcel.writeString(this.f17629b);
        Float f10 = this.f17630c;
        if (f10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f10.floatValue());
        }
        Long l10 = this.f17631d;
        if (l10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l10.longValue());
        }
        Float f11 = this.f17632e;
        if (f11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f11.floatValue());
        }
        Float f12 = this.f17633f;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f12.floatValue());
        }
        Integer num = this.f17634g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f17635h;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.i;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public b(String str, String str2, Float f10, Long l10, Float f11, Float f12, Integer num, Integer num2, Boolean bool) {
        this.f17628a = str;
        this.f17629b = str2;
        this.f17630c = f10;
        this.f17631d = l10;
        this.f17632e = f11;
        this.f17633f = f12;
        this.f17634g = num;
        this.f17635h = num2;
        this.i = bool;
    }

    public /* synthetic */ b(String str, String str2, Float f10, Long l10, Float f11, Float f12, Integer num, Integer num2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : f10, (i & 8) != 0 ? null : l10, (i & 16) != 0 ? null : f11, (i & 32) != 0 ? null : f12, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) == 0 ? bool : null);
    }
}
