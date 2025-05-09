package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* compiled from: YearGridAdapter.java */
/* loaded from: classes.dex */
public final class z implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f9518b;

    public z(A a10, int i) {
        this.f9518b = a10;
        this.f9517a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        A a10 = this.f9518b;
        Month c2 = Month.c(this.f9517a, a10.f9363d.f9385k0.f9402b);
        CalendarConstraints calendarConstraints = a10.f9363d.f9383i0;
        Month month = calendarConstraints.f9365a;
        if (c2.compareTo(month) < 0) {
            c2 = month;
        } else {
            Month month2 = calendarConstraints.f9366b;
            if (c2.compareTo(month2) > 0) {
                c2 = month2;
            }
        }
        a10.f9363d.d(c2);
        a10.f9363d.e(MaterialCalendar.CalendarSelector.f9393a);
    }
}
