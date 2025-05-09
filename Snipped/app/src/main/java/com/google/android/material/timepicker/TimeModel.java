package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final g f9966a;

    /* renamed from: b, reason: collision with root package name */
    public final g f9967b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9968c;

    /* renamed from: d, reason: collision with root package name */
    public int f9969d;

    /* renamed from: e, reason: collision with root package name */
    public int f9970e;

    /* renamed from: f, reason: collision with root package name */
    public int f9971f;

    /* renamed from: g, reason: collision with root package name */
    public int f9972g;

    public class a implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        public final TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int b() {
        if (this.f9968c == 1) {
            return this.f9969d % 24;
        }
        int i = this.f9969d;
        if (i % 12 == 0) {
            return 12;
        }
        return this.f9972g == 1 ? i - 12 : i;
    }

    public final void c(int i) {
        if (this.f9968c == 1) {
            this.f9969d = i;
        } else {
            this.f9969d = (i % 12) + (this.f9972g != 1 ? 0 : 12);
        }
    }

    public final void d(int i) {
        this.f9970e = i % 60;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i) {
        if (i != this.f9972g) {
            this.f9972g = i;
            int i9 = this.f9969d;
            if (i9 < 12 && i == 1) {
                this.f9969d = i9 + 12;
            } else {
                if (i9 < 12 || i != 0) {
                    return;
                }
                this.f9969d = i9 - 12;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f9969d == timeModel.f9969d && this.f9970e == timeModel.f9970e && this.f9968c == timeModel.f9968c && this.f9971f == timeModel.f9971f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9968c), Integer.valueOf(this.f9969d), Integer.valueOf(this.f9970e), Integer.valueOf(this.f9971f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9969d);
        parcel.writeInt(this.f9970e);
        parcel.writeInt(this.f9971f);
        parcel.writeInt(this.f9968c);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i9, int i10, int i11) {
        this.f9969d = i;
        this.f9970e = i9;
        this.f9971f = i10;
        this.f9968c = i11;
        this.f9972g = i >= 12 ? 1 : 0;
        this.f9966a = new g(59);
        this.f9967b = new g(i11 == 1 ? 23 : 12);
    }
}
