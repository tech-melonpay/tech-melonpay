package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.luminary.mobile.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f9430a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9431b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9432c;

    public e() {
        Calendar g10 = y.g(null);
        this.f9430a = g10;
        this.f9431b = g10.getMaximum(7);
        this.f9432c = g10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f9431b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i9 = this.f9431b;
        if (i >= i9) {
            return null;
        }
        int i10 = i + this.f9432c;
        if (i10 > i9) {
            i10 -= i9;
        }
        return Integer.valueOf(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i9 = i + this.f9432c;
        int i10 = this.f9431b;
        if (i9 > i10) {
            i9 -= i10;
        }
        Calendar calendar = this.f9430a;
        calendar.set(7, i9);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i) {
        Calendar g10 = y.g(null);
        this.f9430a = g10;
        this.f9431b = g10.getMaximum(7);
        this.f9432c = i;
    }
}
