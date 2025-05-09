package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f9442a;

    public j(MaterialCalendar materialCalendar) {
        this.f9442a = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f9442a;
        MaterialCalendar.CalendarSelector calendarSelector = materialCalendar.f9386l0;
        MaterialCalendar.CalendarSelector calendarSelector2 = MaterialCalendar.CalendarSelector.f9394b;
        MaterialCalendar.CalendarSelector calendarSelector3 = MaterialCalendar.CalendarSelector.f9393a;
        if (calendarSelector == calendarSelector2) {
            materialCalendar.e(calendarSelector3);
        } else if (calendarSelector == calendarSelector3) {
            materialCalendar.e(calendarSelector2);
        }
    }
}
