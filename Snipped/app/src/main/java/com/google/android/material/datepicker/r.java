package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.luminary.mobile.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;
import y0.C1595B;
import y0.C1596C;
import y0.E;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes.dex */
public final class r extends RecyclerView.Adapter<a> {

    /* renamed from: d, reason: collision with root package name */
    public final CalendarConstraints f9499d;

    /* renamed from: e, reason: collision with root package name */
    public final DateSelector<?> f9500e;

    /* renamed from: f, reason: collision with root package name */
    public final DayViewDecorator f9501f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialCalendar.d f9502g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9503h;

    /* compiled from: MonthsPagerAdapter.java */
    public static class a extends RecyclerView.C {

        /* renamed from: e, reason: collision with root package name */
        public final TextView f9504e;

        /* renamed from: f, reason: collision with root package name */
        public final MaterialCalendarGridView f9505f;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f9504e = textView;
            WeakHashMap<View, E> weakHashMap = C1596C.f30963a;
            new C1595B(R.id.tag_accessibility_heading, Boolean.class, 0, 28).d(textView, Boolean.TRUE);
            this.f9505f = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public r(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.c cVar) {
        Month month = calendarConstraints.f9365a;
        Month month2 = calendarConstraints.f9368d;
        if (month.compareTo(month2) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month2.compareTo(calendarConstraints.f9366b) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f9503h = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.f9489g) + (l.q0(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f9499d = calendarConstraints;
        this.f9500e = dateSelector;
        this.f9501f = dayViewDecorator;
        this.f9502g = cVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f9499d.f9371g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Calendar c2 = y.c(this.f9499d.f9365a.f9401a);
        c2.add(2, i);
        return new Month(c2).f9401a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        CalendarConstraints calendarConstraints = this.f9499d;
        Calendar c2 = y.c(calendarConstraints.f9365a.f9401a);
        c2.add(2, i);
        Month month = new Month(c2);
        aVar2.f9504e.setText(month.e());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.f9505f.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().f9491a)) {
            p pVar = new p(month, this.f9500e, calendarConstraints, this.f9501f);
            materialCalendarGridView.setNumColumns(month.f9404d);
            materialCalendarGridView.setAdapter((ListAdapter) pVar);
        } else {
            materialCalendarGridView.invalidate();
            p a10 = materialCalendarGridView.a();
            Iterator<Long> it = a10.f9493c.iterator();
            while (it.hasNext()) {
                a10.f(materialCalendarGridView, it.next().longValue());
            }
            DateSelector<?> dateSelector = a10.f9492b;
            if (dateSelector != null) {
                Iterator it2 = dateSelector.W().iterator();
                while (it2.hasNext()) {
                    a10.f(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                a10.f9493c = dateSelector.W();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new q(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!l.q0(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.o(-1, this.f9503h));
        return new a(linearLayout, true);
    }
}
