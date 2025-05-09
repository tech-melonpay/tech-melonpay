package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Month f9365a;

    /* renamed from: b, reason: collision with root package name */
    public final Month f9366b;

    /* renamed from: c, reason: collision with root package name */
    public final DateValidator f9367c;

    /* renamed from: d, reason: collision with root package name */
    public Month f9368d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9369e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9370f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9371g;

    public interface DateValidator extends Parcelable {
        boolean P(long j10);
    }

    public class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final long f9372f = y.a(Month.c(1900, 0).f9406f);

        /* renamed from: g, reason: collision with root package name */
        public static final long f9373g = y.a(Month.c(2100, 11).f9406f);

        /* renamed from: c, reason: collision with root package name */
        public Long f9376c;

        /* renamed from: d, reason: collision with root package name */
        public int f9377d;

        /* renamed from: a, reason: collision with root package name */
        public long f9374a = f9372f;

        /* renamed from: b, reason: collision with root package name */
        public long f9375b = f9373g;

        /* renamed from: e, reason: collision with root package name */
        public DateValidator f9378e = new DateValidatorPointForward(Long.MIN_VALUE);

        public final CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f9378e);
            Month d10 = Month.d(this.f9374a);
            Month d11 = Month.d(this.f9375b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f9376c;
            return new CalendarConstraints(d10, d11, dateValidator, l10 == null ? null : Month.d(l10.longValue()), this.f9377d);
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f9365a = month;
        this.f9366b = month2;
        this.f9368d = month3;
        this.f9369e = i;
        this.f9367c = dateValidator;
        if (month3 != null && month.f9401a.compareTo(month3.f9401a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f9401a.compareTo(month2.f9401a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > y.g(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f9371g = month.f(month2) + 1;
        this.f9370f = (month2.f9403c - month.f9403c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f9365a.equals(calendarConstraints.f9365a) && this.f9366b.equals(calendarConstraints.f9366b) && Objects.equals(this.f9368d, calendarConstraints.f9368d) && this.f9369e == calendarConstraints.f9369e && this.f9367c.equals(calendarConstraints.f9367c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9365a, this.f9366b, this.f9368d, Integer.valueOf(this.f9369e), this.f9367c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f9365a, 0);
        parcel.writeParcelable(this.f9366b, 0);
        parcel.writeParcelable(this.f9368d, 0);
        parcel.writeParcelable(this.f9367c, 0);
        parcel.writeInt(this.f9369e);
    }
}
