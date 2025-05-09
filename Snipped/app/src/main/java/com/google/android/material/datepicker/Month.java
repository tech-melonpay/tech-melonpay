package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f9401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9402b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9403c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9404d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9405e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9406f;

    /* renamed from: g, reason: collision with root package name */
    public String f9407g;

    public class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        public final Month createFromParcel(Parcel parcel) {
            return Month.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c2 = y.c(calendar);
        this.f9401a = c2;
        this.f9402b = c2.get(2);
        this.f9403c = c2.get(1);
        this.f9404d = c2.getMaximum(7);
        this.f9405e = c2.getActualMaximum(5);
        this.f9406f = c2.getTimeInMillis();
    }

    public static Month c(int i, int i9) {
        Calendar g10 = y.g(null);
        g10.set(1, i);
        g10.set(2, i9);
        return new Month(g10);
    }

    public static Month d(long j10) {
        Calendar g10 = y.g(null);
        g10.setTimeInMillis(j10);
        return new Month(g10);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Month month) {
        return this.f9401a.compareTo(month.f9401a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        if (this.f9407g == null) {
            this.f9407g = y.b("yMMMM", Locale.getDefault()).format(new Date(this.f9401a.getTimeInMillis()));
        }
        return this.f9407g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f9402b == month.f9402b && this.f9403c == month.f9403c;
    }

    public final int f(Month month) {
        if (!(this.f9401a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f9402b - this.f9402b) + ((month.f9403c - this.f9403c) * 12);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9402b), Integer.valueOf(this.f9403c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9403c);
        parcel.writeInt(this.f9402b);
    }
}
